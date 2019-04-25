package com.example.myapplication;

import android.content.Intent;
import android.widget.Button;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import static org.junit.Assert.assertEquals;
import static org.robolectric.Shadows.shadowOf;

@RunWith(RobolectricTestRunner.class)
public class MainActivityRobolectricTest {

    @Test
    public void clickingButton_shouldShowResult() {
        // Arrange
        MainActivity activity = Robolectric.buildActivity(MainActivity.class)
                .create()
                .resume()
                .get();

        // Act
        Button button = activity.findViewById(R.id.btn_signin);
        button.performClick();

        // Assert
        Intent expectedIntent = new Intent(activity, ResultActivity.class);
        Intent actual = shadowOf(activity).getNextStartedActivity();
        assertEquals(expectedIntent.getComponent(), actual.getComponent());
    }

}