package com.example.myapplication;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Test
    public void addition_isCorrect() {
        // A = Arrange
        Calculator calculator = new Calculator();

        // A = Act
        int result = calculator.plus(2, 2);

        // A = Assertion
        assertEquals(4, result);
    }

    @Test
    public void addition_1_and_1_should_correct_4() {
        assertEquals(4, 2 + 2);
    }
}