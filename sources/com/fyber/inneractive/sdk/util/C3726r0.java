package com.fyber.inneractive.sdk.util;

import com.fyber.inneractive.sdk.config.C2630e;
import com.google.android.gms.measurement.AppMeasurement;

/* renamed from: com.fyber.inneractive.sdk.util.r0 */
public class C3726r0 {
    /* renamed from: a */
    public static boolean m9985a(String str) {
        int i = C2630e.f9283a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.response");
        if (property == null || property.trim().length() <= 0 || str == null || !str.toLowerCase().startsWith("fyberInternalTesting".toLowerCase()) || !str.contains(AppMeasurement.CRASH_ORIGIN)) {
            return false;
        }
        return true;
    }
}
