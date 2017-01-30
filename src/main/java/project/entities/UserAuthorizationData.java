package project.entities;

import javax.validation.constraints.Size;

public class UserAuthorizationData {
    /*
    http://docs.jboss.org/hibernate/stable/validator/reference/en-US/html_single/#validator-defineconstraints-spec
    розділ 2.3.1 і 2.3.2 - показані всі можливі варіанти валідації (і є можливіть вставити власний regexp)
    */
    @Size(min = 5, max = 15, message = "Login must contains from 5 to 15 symbols")
    private String login;

    @Size(min = 6, max = 20, message = "Password must contains from 6 to 20 symbols")
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
