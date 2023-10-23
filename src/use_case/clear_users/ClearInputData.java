package use_case.clear_users;

// TODO Complete me

public class ClearInputData {
    final private String username;
    final private String password;

    final private String repeatPassword;

    public ClearInputData() {
        this.username = "";
        this.password = "";
        this.repeatPassword = "";
    }


    String getUsername() {
        return username;
    }

    String getPassword() {
        return password;
    }

    public String getRepeatPassword() {
        return repeatPassword;
    }
}
