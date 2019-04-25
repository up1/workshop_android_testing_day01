package com.example.myapplication;

import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertEquals;
import static org.robolectric.Shadows.shadowOf;

@RunWith(RobolectricTestRunner.class)
public class MainActivityRobolectricTest {

    @Test
    public void login_success_na() {
        // Arrange
        MainActivity activity =
                Robolectric.buildActivity(MainActivity.class)
                .create()
                .resume()
                .get();

        // Act
        EditText username = activity.findViewById(R.id.et_username);
        username.setText("admin");
        EditText password = activity.findViewById(R.id.et_passsword);
        password.setText("password");
        Button button = activity.findViewById(R.id.btn_signin);
        button.performClick();

        // Assert
        Intent expectedIntent
                = new Intent(activity, ResultActivity.class);
        Intent actual
                = shadowOf(activity).getNextStartedActivity();

        assertEquals(expectedIntent.getComponent(),
                     actual.getComponent());
        assertEquals("Success!!!2",
                     actual.getStringExtra("RESULT"));
    }

}
