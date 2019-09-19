package com.example.screamitus_android;

import android.app.Activity;
import android.content.Context;
import android.support.test.InstrumentationRegistry;
//import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.*;
import static android.support.test.espresso.assertion.ViewAssertions.*;
import static android.support.test.espresso.matcher.ViewMatchers.*;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.example.screamitus_android", appContext.getPackageName());
    }
//@Rule
//    public ActivityTestRule activityRule = new ActivityTestRule<>(MainActivity.class);
//
//@Test
//    public void infetctedInstructors() throws InterruptedException{
//        onView(withId(R.id.button_main)).perform(click());
//}
}
