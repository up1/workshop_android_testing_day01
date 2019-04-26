package com.example.myapplication.pages;

import com.example.myapplication.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

public class LoginResultPage {
    public static void isShowResult(String expectedResult) {
        onView(withId(R.id.tv_result)).check(matches(withText(expectedResult)));
    }
}
