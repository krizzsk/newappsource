package com.amazonaws.util;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import p001a0.C0016g;

public class VersionInfoUtils {
    private static final int DEFAULT_STRING_LENGTH = 128;
    private static final Log log = LogFactory.getLog((Class<?>) VersionInfoUtils.class);
    private static volatile String platform = "android";
    private static volatile String userAgent = null;
    private static volatile String version = "2.22.6";

    public static String getPlatform() {
        return platform;
    }

    public static String getUserAgent() {
        if (userAgent == null) {
            synchronized (VersionInfoUtils.class) {
                if (userAgent == null) {
                    initializeUserAgent();
                }
            }
        }
        return userAgent;
    }

    public static String getVersion() {
        return version;
    }

    private static void initializeUserAgent() {
        userAgent = userAgent();
    }

    private static String replaceSpaces(String str) {
        return str.replace(' ', '_');
    }

    public static String userAgent() {
        StringBuilder r = C0016g.m34r(128, "aws-sdk-");
        r.append(StringUtils.lowerCase(getPlatform()));
        r.append("/");
        r.append(getVersion());
        r.append(" ");
        r.append(replaceSpaces(System.getProperty("os.name")));
        r.append("/");
        r.append(replaceSpaces(System.getProperty("os.version")));
        r.append(" ");
        r.append(replaceSpaces(System.getProperty("java.vm.name")));
        r.append("/");
        r.append(replaceSpaces(System.getProperty("java.vm.version")));
        r.append("/");
        r.append(replaceSpaces(System.getProperty("java.version")));
        String property = System.getProperty("user.language");
        String property2 = System.getProperty("user.region");
        if (!(property == null || property2 == null)) {
            r.append(" ");
            r.append(replaceSpaces(property));
            r.append("_");
            r.append(replaceSpaces(property2));
        }
        return r.toString();
    }
}
