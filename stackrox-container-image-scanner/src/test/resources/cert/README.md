Certificates were generated using following commands:

```bash
keytool -genkey -keyalg RSA -keystore selfsigned.jks -validity 100000 -keysize 2048 -dname "CN=test, OU=Unknown, O=Unknown, L=Unknown, ST=Unknown, C=Unknown" -keypass password -storepass password -alias unknown
keytool -importkeystore -srckeystore selfsigned.jks -destkeystore client.pkcs -srcstoretype JKS -deststoretype PKCS12
openssl pkcs12 -in client.pkcs -out client.pem -nokeys

keytool -genkey -keyalg RSA -keystore localhost.jks -validity 100000 -keysize 2048 -dname "CN=test, OU=Unknown, O=Unknown, L=Unknown, ST=Unknown, C=Unknown" -keypass password -storepass password -alias unknown -ext "SAN:c=DNS:localhost,IP:127.0.0.1"
keytool -importkeystore -srckeystore localhost.jks -destkeystore localhost.pkcs -srcstoretype JKS -deststoretype PKCS12
openssl pkcs12 -in localhost.pkcs -out localhost.pem -nokeys
```
