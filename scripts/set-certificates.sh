#!/bin/bash
set -euo pipefail

HOST="${ROX_INTERNAL_CENTRAL_NAME:-central.stackrox}"
PORT="${ROX_CENTRAL_PORT:-8000}"
TRUSTSTORE="$JAVA_HOME/lib/security/cacerts"
TRUSTSTORE_PASS="changeit"
KEYTOOL="${JAVA_HOME:-/usr}/bin/keytool"
IP="${ROX_CENTRAL_HOST:-127.0.0.1}"
LINE="$IP $HOST"

echo "🔍 Checking /etc/hosts for '$HOST'..."

if grep -qE "^[^#]*\b$HOST\b" /etc/hosts; then
    echo "✅ Entry for '$HOST' already exists in /etc/hosts."
else
    echo "✍️  Adding '$LINE' to /etc/hosts..."
    echo "$LINE" | sudo tee -a /etc/hosts >/dev/null
    echo "✅ Added successfully."
fi

echo "📡 Fetching certificates from $HOST:$PORT..."
openssl s_client -connect "$HOST:$PORT" -servername "$HOST" -showcerts </dev/null 2>/dev/null |
    sed -n '/-BEGIN CERTIFICATE-/,/-END CERTIFICATE-/p' >fullchain.crt

if ! grep -q "BEGIN CERTIFICATE" fullchain.crt; then
    echo "❌ Failed to extract any certificates from $HOST:$PORT"
    exit 1
fi

echo "🔍 Splitting certificate chain into individual cert files..."
csplit -f cert -b "%d.crt" fullchain.crt '/-----BEGIN CERTIFICATE-----/' '{*}' >/dev/null 2>&1

echo "📥 Importing certificates into $TRUSTSTORE..."
for crt in cert*.crt; do
    if [ ! -s "$crt" ]; then
        echo "⚠️ Skipping empty file: $crt"
        continue
    fi

    alias_name=$(basename "$crt" .crt)
    echo "  🔑 Importing $crt as alias '$alias_name'..."
    sudo "$KEYTOOL" -importcert \
        -alias "$alias_name" \
        -keystore "$TRUSTSTORE" \
        -storepass "$TRUSTSTORE_PASS" \
        -file "$crt" \
        -noprompt
done

echo "🎉 Done. Truststore '$TRUSTSTORE' is ready."
