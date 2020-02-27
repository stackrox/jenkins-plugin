package data

class TokenResponse {
    String token
    class MetaData {
        String id
        String name
        String role
        String issuedAt
        String expiration
        Boolean revoked
    }
}
