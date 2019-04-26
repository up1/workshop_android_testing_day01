package com.example.myapplication;

import org.junit.Test;

import static org.junit.Assert.*;

class LoginViewSpy implements LoginView {

    private boolean calledFailure;

    @Override
    public void success() {

    }

    @Override
    public void failure() {
        calledFailure = true;
    }

    public boolean calledFailure() {
        return calledFailure;
    }
}

public class LoginPresenterUnitTest {

    @Test
    public void login_failure_with_empty_username() {
        // Arrange
        LoginViewSpy loginViewSpy = new LoginViewSpy();
        LoginPresenter loginPresenter = new LoginPresenter();
        loginPresenter.setLoginView(loginViewSpy);

        // Act
        loginPresenter.login("", "password");

        // Assert
        assertTrue(loginViewSpy.calledFailure());
    }
}