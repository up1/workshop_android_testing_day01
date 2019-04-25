package com.example.myapplication;

import android.content.Intent;
import android.support.test.rule.ActivityTestRule;

import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;

import tools.fastlane.screengrab.Screengrab;
import tools.fastlane.screengrab.UiAutomatorScreenshotStrategy;
import tools.fastlane.screengrab.locale.LocaleTestRule;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

public class LoginSuccessUIWithScreengrabTest {

    @ClassRule
    public static final LocaleTestRule localeTestRule
            = new LocaleTestRule();

    @BeforeClass
    public static void init() {
        Screengrab.setDefaultScreenshotStrategy(
                new UiAutomatorScreenshotStrategy());
    }

    @Rule
    public ActivityTestRule<MainActivity> activityRule =
            new ActivityTestRule<>(MainActivity.class, false, false);

    @Test
    public void login_succeed() {

        activityRule.launchActivity(new Intent());

        Screengrab.screenshot("step_01");

        // 2. Act (When)
        onView(withId(R.id.et_username))
                .perform(replaceText("admin"), closeSoftKeyboard());
        onView(withId(R.id.et_passsword))
                .perform(replaceText("password"), closeSoftKeyboard());

        Screengrab.screenshot("step_02");

        onView(withId(R.id.btn_signin)).perform(click());

        // 3. Assert (Then)
        onView(withId(R.id.tv_result)).check(matches(withText("Success!!!")));
        Screengrab.screenshot("step_03");

    }


}