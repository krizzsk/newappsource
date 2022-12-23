package com.veriff.sdk.internal;

import com.amazonaws.http.HttpHeader;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.veriff.sdk.internal.C22736yk;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

/* renamed from: com.veriff.sdk.internal.zw */
public final class C22802zw {
    static {
        abl.m50461a("\"\\");
        abl.m50461a("\t ,=");
    }

    /* renamed from: a */
    public static long m56025a(C22757yu yuVar) {
        return m56024a(yuVar.mo57423g());
    }

    /* renamed from: b */
    public static boolean m56032b(C22757yu yuVar) {
        return m56031b(yuVar.mo57423g());
    }

    /* renamed from: c */
    public static Set<String> m56034c(C22736yk ykVar) {
        Set<String> emptySet = Collections.emptySet();
        int a = ykVar.mo57265a();
        for (int i = 0; i < a; i++) {
            if ("Vary".equalsIgnoreCase(ykVar.mo57266a(i))) {
                String b = ykVar.mo57269b(i);
                if (emptySet.isEmpty()) {
                    emptySet = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
                }
                for (String trim : b.split(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR)) {
                    emptySet.add(trim.trim());
                }
            }
        }
        return emptySet;
    }

    /* renamed from: d */
    public static boolean m56035d(C22757yu yuVar) {
        if (yuVar.mo57414a().mo57393b().equals("HEAD")) {
            return false;
        }
        int c = yuVar.mo57418c();
        if (((c >= 100 && c < 200) || c == 204 || c == 304) && m56025a(yuVar) == -1 && !"chunked".equalsIgnoreCase(yuVar.mo57415a("Transfer-Encoding"))) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private static Set<String> m56036e(C22757yu yuVar) {
        return m56034c(yuVar.mo57423g());
    }

    /* renamed from: a */
    public static long m56024a(C22736yk ykVar) {
        return m56026a(ykVar.mo57267a(HttpHeader.CONTENT_LENGTH));
    }

    /* renamed from: b */
    public static boolean m56031b(C22736yk ykVar) {
        return m56034c(ykVar).contains("*");
    }

    /* renamed from: a */
    private static long m56026a(String str) {
        if (str == null) {
            return -1;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: b */
    public static int m56030b(String str, int i) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    /* renamed from: a */
    public static boolean m56029a(C22757yu yuVar, C22736yk ykVar, C22752ys ysVar) {
        for (String next : m56036e(yuVar)) {
            if (!Objects.equals(ykVar.mo57270b(next), ysVar.mo57394b(next))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static C22736yk m56027a(C22736yk ykVar, C22736yk ykVar2) {
        Set<String> c = m56034c(ykVar2);
        if (c.isEmpty()) {
            return C22766za.f57696c;
        }
        C22736yk.C22737a aVar = new C22736yk.C22737a();
        int a = ykVar.mo57265a();
        for (int i = 0; i < a; i++) {
            String a2 = ykVar.mo57266a(i);
            if (c.contains(a2)) {
                aVar.mo57276a(a2, ykVar.mo57269b(i));
            }
        }
        return aVar.mo57277a();
    }

    /* renamed from: c */
    public static C22736yk m56033c(C22757yu yuVar) {
        return m56027a(yuVar.mo57426j().mo57414a().mo57395c(), yuVar.mo57423g());
    }

    /* renamed from: a */
    public static void m56028a(C22726ye yeVar, C22738yl ylVar, C22736yk ykVar) {
        if (yeVar != C22726ye.f57500a) {
            List<C22725yd> a = C22725yd.m55494a(ylVar, ykVar);
            if (!a.isEmpty()) {
                yeVar.mo57226a(ylVar, a);
            }
        }
    }

    /* renamed from: a */
    public static int m56023a(String str, int i, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }

    /* renamed from: a */
    public static int m56022a(String str, int i) {
        while (i < str.length() && ((r0 = str.charAt(i)) == ' ' || r0 == 9)) {
            i++;
        }
        return i;
    }
}
