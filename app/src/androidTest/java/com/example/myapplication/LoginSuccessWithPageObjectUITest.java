package com.example.myapplication;

import android.content.Intent;
import android.support.test.rule.ActivityTestRule;

import com.example.myapplication.pages.LoginPage;
import com.example.myapplication.pages.LoginResultPage;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

public class LoginSuccessWithPageObjectUITest {

    @Rule
    public ActivityTestRule<MainActivity> activityRule =
            new ActivityTestRule<>(MainActivity.class, false, false);

    @Test
    public void login_succeed() {
        // 1. Arrange (Given)
        // Prepare data or env for testing
        activityRule.launchActivity(new Intent());

        // 2. Act (When)
        LoginPage.fillInUserName("admin");
        LoginPage.fillInPassword("password");
        LoginPage.clickLogin();

        // 3. Assert (Then)
        LoginResultPage.isShowResult("Success!!!");

    }


}