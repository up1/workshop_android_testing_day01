package com.example.myapplication.pages;

import com.example.myapplication.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

public class LoginPage {

    public static void fillInUserName(String input) {
        onView(withId(R.id.et_username))
                .perform(
                        replaceText(input),
                        closeSoftKeyboard()
                );
    }

    public static void fillInPassword(String input) {
        onView(withId(R.id.et_passsword))
                .perform(
                        replaceText(input),
                        closeSoftKeyboard()
                );
    }

    public static void clickLogin() {
        onView(withId(R.id.btn_signin)).perform(click());
    }
}
