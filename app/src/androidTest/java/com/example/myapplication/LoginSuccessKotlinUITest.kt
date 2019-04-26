package com.example.myapplication

import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import androidx.test.rule.ActivityTestRule
import com.agoda.kakao.screen.Screen.Companion.idle
import com.agoda.kakao.screen.Screen.Companion.onScreen
import com.example.myapplication.kakao.LoginScreen
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class LoginSuccessKotlinUITest {

    @Rule
    @JvmField
    val activityRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun login_succeed2() {
        onScreen<LoginScreen> {
            username {
                replaceText("admin")
            }
            password {
                replaceText("password")
            }
            login {
                click()
            }
        }

    }


}