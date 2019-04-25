package com.example.myapplication;

import android.app.Activity;
import android.widget.Button;
import android.widget.TextView;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import static org.junit.Assert.assertEquals;

//@RunWith(RobolectricTestRunner.class)
public class MainActivityRobolectricTest {

    @Test
    public void clickingButton_shouldShowResult() throws Exception {
//        Activity activity = Robolectric.setupActivity(MainActivity.class);
//        Activity activity = Robolectric.buildActivity(MainActivity.class)
//                .create()
//                .resume()
//                .get();
//
//        Button button = activity.findViewById(R.id.btn_signin);
//        TextView results = activity.findViewById(R.id.tv_result);
//        button.performClick();
//
//        assertEquals(results.getText().toString(), "Failure");
    }

}