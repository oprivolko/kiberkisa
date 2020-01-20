package entity;

public class RequestTokenObject {
    String username;
    String password;
    String clientSecret;
    String grant_type;
    String client_id;
    String scope;

    public RequestTokenObject(String username, String password, String clientSecret, String grant_type, String client_id, String scope) {
        this.username = username;
        this.password = password;
        this.clientSecret = clientSecret;
        this.grant_type = grant_type;
        this.client_id = client_id;
        this.scope = scope;
    }
}
