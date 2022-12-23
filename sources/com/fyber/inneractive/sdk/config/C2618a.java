package com.fyber.inneractive.sdk.config;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.util.IAlog;
import com.usebutton.sdk.internal.util.UrlPrivacyValidator;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: com.fyber.inneractive.sdk.config.a */
public class C2618a {
    /* renamed from: a */
    public static C2701x m6639a(String str) {
        IAConfigManager iAConfigManager = IAConfigManager.f9202J;
        Map<String, C2701x> map = iAConfigManager.f9213a;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return iAConfigManager.f9213a.get(str);
    }

    /* renamed from: b */
    public static C2702y m6642b(String str) {
        IAConfigManager iAConfigManager = IAConfigManager.f9202J;
        Map<String, C2702y> map = iAConfigManager.f9214b;
        if (map != null && map.containsKey(str)) {
            return iAConfigManager.f9214b.get(str);
        }
        IAlog.m9904c("Requested unit config doesn't exists - %s", str);
        return null;
    }

    /* renamed from: a */
    public static String m6640a() {
        int i = C2630e.f9283a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.name");
        if (TextUtils.isEmpty(property)) {
            return "wv.inner-active.mobi/simpleM2M/";
        }
        return C25541a.m63881k(property, ".inner-active.mobi/simpleM2M/");
    }

    /* renamed from: b */
    public static String m6643b() {
        int i = C2630e.f9283a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.name");
        if (!TextUtils.isEmpty(property)) {
            return m6641a(property, "Event");
        }
        StringBuilder k = C13555b.m33972k(UrlPrivacyValidator.HTTPS_SCHEME);
        k.append(IAConfigManager.f9202J.f9221i.f9364g);
        return k.toString();
    }

    /* renamed from: a */
    public static String m6641a(String str, String str2) {
        if (Pattern.compile("^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$").matcher(str).matches()) {
            return UrlPrivacyValidator.HTTPS_SCHEME + str + "/simpleM2M/" + str2;
        }
        return UrlPrivacyValidator.HTTPS_SCHEME + str + ".inner-active.mobi/simpleM2M/" + str2;
    }
}
