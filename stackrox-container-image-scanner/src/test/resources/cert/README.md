Certificates were generated using following commands:

```bash
keytool -genkey -keyalg RSA -alias tomcat -keystore selfsigned.jks -validity 100000 -keysize 2048
keytool -importkeystore -srckeystore selfsigned.jks -destkeystore client.pkcs -srcstoretype JKS -deststoretype PKCS12
openssl pkcs12 -in client.pkcs -out client.pem
```
