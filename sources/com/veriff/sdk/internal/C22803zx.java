package com.veriff.sdk.internal;

/* renamed from: com.veriff.sdk.internal.zx */
public final class C22803zx {
    /* renamed from: a */
    public static boolean m56037a(String str) {
        if (str.equals("POST") || str.equals("PATCH") || str.equals("PUT") || str.equals("DELETE") || str.equals("MOVE")) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m56038b(String str) {
        if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m56039c(String str) {
        return !str.equals("GET") && !str.equals("HEAD");
    }

    /* renamed from: d */
    public static boolean m56040d(String str) {
        return str.equals("PROPFIND");
    }

    /* renamed from: e */
    public static boolean m56041e(String str) {
        return !str.equals("PROPFIND");
    }
}
