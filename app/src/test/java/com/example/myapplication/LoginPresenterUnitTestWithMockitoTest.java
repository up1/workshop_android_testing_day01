package com.example.myapplication;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class LoginPresenterUnitTestWithMockitoTest {

    @Mock
    LoginView loginViewSpy;

    @Test
    public void login_failure_with_empty_username() {
        // Arrange
        LoginPresenter loginPresenter = new LoginPresenter();
        loginPresenter.setLoginView(loginViewSpy);

        // Act
        loginPresenter.login("", "password");

        // Assert
        verify(loginViewSpy).failure();
    }
}