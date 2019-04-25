package com.example.myapplication;

import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static java.util.Arrays.asList;
import static org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class LoginFailureWithDataUITest {

    @Parameters(name = "{index} Login failure with username={0} and password={1}")
    public static Collection<Object[]> xxx() {
        return asList(new Object[][]{
                {"adsmin", "password", "Failure"},
                {"admin", "passwords", "Failure"},
                {"adsmin", "passwords", "Failure"},
        });
    }

    private String username;
    private String password;
    private String expectedResult;

    public LoginFailureWithDataUITest(String username, String password, String expectedResult) {
        this.username = username;
        this.password = password;
        this.expectedResult = expectedResult;
    }

    @Rule
    public ActivityTestRule<MainActivity> activityRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void login_failure() {
        // 1. Arrange (Given)
        // Prepare data or env for testing
        // 2. Act (When)
        onView(withId(R.id.et_username)).perform(
                        replaceText(username),
                        closeSoftKeyboard()
                        );
        onView(withId(R.id.et_passsword)).perform(
                        replaceText(password),
                        closeSoftKeyboard()
                );

        onView(withId(R.id.btn_signin)).perform(click());

        // 3. Assert (Then)
        onView(withId(R.id.tv_result))
                .check(matches(withText(expectedResult)));
    }



}