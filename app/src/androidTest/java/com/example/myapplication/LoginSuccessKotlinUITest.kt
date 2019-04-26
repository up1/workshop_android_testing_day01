package com.example.myapplication

import android.content.Intent
import android.support.test.rule.ActivityTestRule

import org.junit.Rule
import org.junit.Test

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.action.ViewActions.closeSoftKeyboard
import android.support.test.espresso.action.ViewActions.replaceText
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.espresso.matcher.ViewMatchers.withText

class LoginSuccessKotlinUITest {

    @Rule
    var activityRule = ActivityTestRule(MainActivity::class.java, false, false)

    @Test
    fun login_succeed() {
        // 1. Arrange (Given)
        // Prepare data or env for testing
        activityRule.launchActivity(Intent())

        // 2. Act (When)
        onView(withId(R.id.et_username))
                .perform(
                        replaceText("admin"),
                        closeSoftKeyboard()
                )
        onView(withId(R.id.et_passsword))
                .perform(
                        replaceText("password"),
                        closeSoftKeyboard()
                )

        onView(withId(R.id.btn_signin)).perform(click())

        // 3. Assert (Then)
        onView(withId(R.id.tv_result)).check(matches(withText("Success!!!")))

    }


}