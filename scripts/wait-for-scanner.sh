#!/usr/bin/env bash

set -euo pipefail

# Wait for StackRox scanner pods to be ready
# Simpler and more reliable than polling the API health endpoint

MAX_WAIT_SECONDS="${MAX_WAIT_SECONDS:-360}"  # 6 minutes timeout
CHECK_INTERVAL="${CHECK_INTERVAL:-10}"       # Check every 10 seconds

echo "Waiting for StackRox scanner pods to become ready..."
echo "Max wait time: ${MAX_WAIT_SECONDS}s"
echo ""

start_time=$(date +%s)
attempt=0

while true; do
    current_time=$(date +%s)
    elapsed=$((current_time - start_time))

    if [ $elapsed -ge $MAX_WAIT_SECONDS ]; then
        echo "ERROR: Timeout waiting for scanner pods after ${MAX_WAIT_SECONDS}s"
        kubectl get pods -n stackrox
        exit 1
    fi

    attempt=$((attempt + 1))
    echo "[${elapsed}s] Attempt $attempt: Checking scanner pod status..."

    # Check if scanner pods are ready (READY column = 1/1)
    # grep for "1/1.*Running" to ensure both container is ready AND pod is running
    ready_count=$(kubectl get pods -n stackrox -l app=scanner --no-headers 2>/dev/null | grep -c "1/1.*Running" || echo "0")
    total_count=$(kubectl get pods -n stackrox -l app=scanner --no-headers 2>/dev/null | wc -l || echo "0")

    echo "  → Scanner pods: $ready_count/$total_count ready"

    if [ "$ready_count" -gt 0 ] && [ "$ready_count" -eq "$total_count" ]; then
        echo "  → All scanner pods are ready!"
        echo ""
        echo "Scanner pods ready after ${elapsed}s"
        kubectl get pods -n stackrox -l app=scanner
        exit 0
    fi

    remaining=$((MAX_WAIT_SECONDS - elapsed))
    echo "  → Waiting ${CHECK_INTERVAL}s before next check (${remaining}s remaining)..."
    sleep $CHECK_INTERVAL
done
