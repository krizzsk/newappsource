package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;

/* renamed from: com.appsflyer.internal.w */
public final class C2103w {
    private static String $$a;
    private static String AFDateFormat;

    public static void $$a(String str) {
        if (AFDateFormat == null) {
            valueOf(AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_KEY));
        }
        String str2 = AFDateFormat;
        if (str2 != null) {
            AFLogger.afInfoLog(str.replace(str2, $$a));
        }
    }

    public static void valueOf(String str) {
        AFDateFormat = str;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 || i == str.length() - 1) {
                sb.append(str.charAt(i));
            } else {
                sb.append("*");
            }
        }
        $$a = sb.toString();
    }
}
