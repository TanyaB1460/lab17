package user;

public class User {
    public String login;
    public String password;
    public Role role;

    public User(Role role, String password, String login) {
        this.role = role;
        this.password = password;
        this.login = login;
    }
}