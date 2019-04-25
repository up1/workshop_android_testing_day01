package com.example.myapplication;

import android.content.Intent;
import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

public class LoginFailureUITest {

    @Rule
    public ActivityTestRule<MainActivity> activityRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void username_ผิด() {
        // 1. Arrange (Given)
        // Prepare data or env for testing
        // 2. Act (When)
        onView(withId(R.id.et_username)).perform(
                        replaceText("adsmin"),
                        closeSoftKeyboard()
                        );
        onView(withId(R.id.et_passsword)).perform(
                        replaceText("password"),
                        closeSoftKeyboard()
                );

        onView(withId(R.id.btn_signin)).perform(click());

        // 3. Assert (Then)
        onView(withId(R.id.tv_result)).check(matches(withText("Failure")));
    }

    @Test
    public void password_ผิด() {
        // 1. Arrange (Given)
        // Prepare data or env for testing
        // 2. Act (When)
        onView(withId(R.id.et_username)).perform(
                replaceText("admin"),
                closeSoftKeyboard()
        );
        onView(withId(R.id.et_passsword)).perform(
                replaceText("passwords"),
                closeSoftKeyboard()
        );

        onView(withId(R.id.btn_signin)).perform(click());

        // 3. Assert (Then)
        onView(withId(R.id.tv_result)).check(matches(withText("Failure")));
    }


}