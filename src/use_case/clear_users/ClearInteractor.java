package use_case.clear_users;

// TODO Complete me

import entity.User;
import use_case.login.*;

public class ClearInteractor implements ClearInputBoundary {
    final ClearUserDataAccessInterface userDataAccessObject;
    final ClearOutputBoundary clearPresenter;

    public ClearInteractor(ClearUserDataAccessInterface clearUserDataAccessInterface,
                           ClearOutputBoundary clearOutputBoundary) {
        this.userDataAccessObject = clearUserDataAccessInterface;
        this.clearPresenter = clearOutputBoundary;
    }

    @Override
    public void execute(ClearInputData clearInputData) {
        userDataAccessObject.clearAllUsers();
        ClearOutputData clearOutputData = new ClearOutputData("User Data Cleared!");
        clearPresenter.prepareSuccessView(clearOutputData);
    }
}
