package com.usebutton.sdk.internal.util;

public class TestUtils {
    public static boolean isNotTesting() {
        return !isTesting();
    }

    public static boolean isTesting() {
        try {
            Class.forName("com.usebutton.test.MockedTest");
            return true;
        } catch (ClassNotFoundException | LinkageError unused) {
            return false;
        }
    }
}
