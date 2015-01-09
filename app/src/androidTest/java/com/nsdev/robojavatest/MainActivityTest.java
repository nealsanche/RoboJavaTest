package com.nsdev.robojavatest;

import org.junit.Before;
import org.junit.Test;

import com.nsdev.robojavatest.test.RobojavaTestBase;
import org.robolectric.Robolectric;

import static org.junit.Assert.assertTrue;

/**
 * Created by nealsanche on 15-01-08.
 */
public class MainActivityTest extends RobojavaTestBase {

    private MainActivity mActivity;

    @Test
    public void testSomething() throws Exception {
        assertTrue(mActivity != null);
    }

    @Before
    public void setUp() {
        mActivity = Robolectric.buildActivity(MainActivity.class).create().get();
    }

    @Test
    public void testIsAwesome() {
        mActivity.isAwesome();
    }
}
