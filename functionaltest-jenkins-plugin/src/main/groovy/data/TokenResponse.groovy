package data

class TokenResponse {
    String token
    class metaData {
        String id
        String name
        String role
        String issuedAt
        String expiration
        Boolean revoked
    }
}
