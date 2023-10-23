package interface_adapter.clear_users;

// TODO Complete me

import interface_adapter.signup.SignupState;
import use_case.clear_users.ClearOutputBoundary;
import interface_adapter.ViewManagerModel;
import use_case.clear_users.ClearOutputData;
import interface_adapter.clear_users.ClearViewModel;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ClearPresenter implements ClearOutputBoundary {

    private ViewManagerModel viewManagerModel;
    private final ClearViewModel clearViewModel;
    public ClearPresenter(ViewManagerModel viewManagerModel, ClearViewModel clearViewModel) {
        this.viewManagerModel = viewManagerModel;
        this.clearViewModel = clearViewModel;
    }
    public void prepareSuccessView(ClearOutputData response) {

        ClearState clearState = clearViewModel.getState();
        clearState.setUsername();
        this.clearViewModel.setState(clearState);
        this.clearViewModel.firePropertyChanged();

        viewManagerModel.setActiveView(clearViewModel.getViewName());
        viewManagerModel.firePropertyChanged();
    }
}
