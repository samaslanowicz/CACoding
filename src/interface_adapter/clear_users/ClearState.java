package interface_adapter.clear_users;

// TODO Complete me

import interface_adapter.login.LoginState;

public class ClearState {
    private String username = "";
    private String password = "";


    public ClearState(ClearState copy) {
        username = copy.username;
        password = copy.password;
    }

    // Because of the previous copy constructor, the default constructor must be explicit.
    public ClearState() {
    }

    public String getUsername() {return username;}

    public String getPassword() {
        return password;
    }

    public void setUsername() {this.username = "";}

    public void setPassword() {
        this.password = "";
    }

}
