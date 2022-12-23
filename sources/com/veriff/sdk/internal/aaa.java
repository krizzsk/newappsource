package com.veriff.sdk.internal;

import java.net.Proxy;

public final class aaa {
    /* renamed from: a */
    public static String m49967a(C22752ys ysVar, Proxy.Type type) {
        StringBuilder sb = new StringBuilder();
        sb.append(ysVar.mo57393b());
        sb.append(' ');
        if (m49968b(ysVar, type)) {
            sb.append(ysVar.mo57390a());
        } else {
            sb.append(m49966a(ysVar.mo57390a()));
        }
        sb.append(" HTTP/1.1");
        return sb.toString();
    }

    /* renamed from: b */
    private static boolean m49968b(C22752ys ysVar, Proxy.Type type) {
        return !ysVar.mo57399g() && type == Proxy.Type.HTTP;
    }

    /* renamed from: a */
    public static String m49966a(C22738yl ylVar) {
        String i = ylVar.mo57296i();
        String l = ylVar.mo57299l();
        if (l == null) {
            return i;
        }
        return i + '?' + l;
    }
}
