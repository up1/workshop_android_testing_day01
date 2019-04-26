package com.example.myapplication.kakao

import com.agoda.kakao.edit.KEditText
import com.agoda.kakao.screen.Screen
import com.agoda.kakao.text.KButton
import com.example.myapplication.R

open class LoginScreen: Screen<LoginScreen>() {

    val username: KEditText = KEditText { withId(R.id.et_username) }
    val password: KEditText = KEditText { withId(R.id.et_passsword) }
    val login: KButton = KButton { withId(R.id.et_passsword) }


}