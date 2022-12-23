package com.usebutton.sdk.internal.util;

public class ReflectionUtils {
    public static <T> T getValueFromStaticField(String str, String str2) {
        try {
            return Class.forName(str).getField(str2).get((Object) null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static <T> T instantiate(String str, Class cls) {
        try {
            Class<?> cls2 = Class.forName(str);
            for (Class equals : cls2.getInterfaces()) {
                if (equals.equals(cls)) {
                    return cls2.newInstance();
                }
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
