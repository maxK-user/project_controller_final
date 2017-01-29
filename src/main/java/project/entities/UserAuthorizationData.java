package project.entities;

/**
 * Created by Maksim on 29.01.2017.
 */
public class UserAuthorizationData {
    private String login;
    private String password;

    public UserAuthorizationData() {
    }

    public UserAuthorizationData(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserAuthorizationData{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
