package pratham;

public class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean validate() {
        return username.equals("admin") && password.equals("password");
    }
}
