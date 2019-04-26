package com.example.myapplication;

public class LoginPresenter {

    private LoginView loginView;

    public void setLoginView(LoginView loginView) {
        this.loginView = loginView;
    }

    public void login(String username, String password) {
        if("admin".equals(username) &&
                "password".equals(password)) {
            // TODO :: Success
            this.loginView.success();
        } else {
            // TODO :: Failure
            this.loginView.failure();
        }
    }

}
