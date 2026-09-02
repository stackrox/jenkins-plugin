#!/usr/bin/env bash

set -euo pipefail

# Wait for StackRox scanner to be ready by polling the integration health endpoint
# This replaces the fixed 120s sleep with a condition-based wait

CENTRAL_ENDPOINT="${ROX_ENDPOINT:-https://central.stackrox:8000}"
MAX_WAIT_SECONDS="${MAX_WAIT_SECONDS:-360}"  # 6 minutes timeout
CHECK_INTERVAL="${CHECK_INTERVAL:-10}"       # Check every 10 seconds

# Extract password from environment or file
if [ -z "${ROX_PASSWORD:-}" ]; then
    echo "ERROR: ROX_PASSWORD environment variable not set"
    exit 1
fi

echo "Waiting for StackRox scanner to become healthy..."
echo "Endpoint: ${CENTRAL_ENDPOINT}"
echo "Max wait time: ${MAX_WAIT_SECONDS}s"
echo ""

start_time=$(date +%s)
attempt=0

while true; do
    current_time=$(date +%s)
    elapsed=$((current_time - start_time))

    if [ $elapsed -ge $MAX_WAIT_SECONDS ]; then
        echo "ERROR: Timeout waiting for scanner after ${MAX_WAIT_SECONDS}s"
        exit 1
    fi

    attempt=$((attempt + 1))
    echo "[${elapsed}s] Attempt $attempt: Checking scanner health..."

    # Query the integration health endpoint
    response=$(curl -k -s -u "admin:${ROX_PASSWORD}" \
        "${CENTRAL_ENDPOINT}/v1/integrationhealth/imageintegrations" || echo "")

    if [ -z "$response" ]; then
        echo "  → Failed to connect to central"
    else
        # Check if any image integration has HEALTHY status
        # The response contains integrationHealth array with status field
        healthy_count=$(echo "$response" | grep -o '"status":"HEALTHY"' | wc -l || echo "0")

        if [ "$healthy_count" -gt 0 ]; then
            echo "  → Scanner is HEALTHY!"
            echo ""
            echo "Scanner ready after ${elapsed}s"
            exit 0
        else
            # Show current status for debugging
            status=$(echo "$response" | grep -o '"status":"[^"]*"' | head -1 || echo "UNKNOWN")
            echo "  → Scanner status: ${status}"
        fi
    fi

    remaining=$((MAX_WAIT_SECONDS - elapsed))
    echo "  → Waiting ${CHECK_INTERVAL}s before next check (${remaining}s remaining)..."
    sleep $CHECK_INTERVAL
done
