package project.entities.additionals;

import javax.validation.constraints.Size;

public class UserAuthorizationData {

    @Size(min = 5, max = 15, message = "Login must contains from 5 to 15 symbols")
    private String login;

    @Size(min = 6, max = 20, message = "Password must contains from 6 to 20 symbols")
    private String password;

    public UserAuthorizationData() {
    }

    public UserAuthorizationData(/*long id, */String login, String password) {
        //this.id = id;
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
