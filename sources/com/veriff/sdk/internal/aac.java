package com.veriff.sdk.internal;

import java.io.IOException;
import java.net.ProtocolException;

public final class aac {

    /* renamed from: a */
    public final C22749yq f53297a;

    /* renamed from: b */
    public final int f53298b;

    /* renamed from: c */
    public final String f53299c;

    public aac(C22749yq yqVar, int i, String str) {
        this.f53297a = yqVar;
        this.f53298b = i;
        this.f53299c = str;
    }

    /* renamed from: a */
    public static aac m49975a(String str) throws IOException {
        C22749yq yqVar;
        String str2;
        int i = 9;
        if (str.startsWith("HTTP/1.")) {
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException(C25541a.m63881k("Unexpected status line: ", str));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt == 0) {
                yqVar = C22749yq.HTTP_1_0;
            } else if (charAt == 1) {
                yqVar = C22749yq.HTTP_1_1;
            } else {
                throw new ProtocolException(C25541a.m63881k("Unexpected status line: ", str));
            }
        } else if (str.startsWith("ICY ")) {
            yqVar = C22749yq.HTTP_1_0;
            i = 4;
        } else {
            throw new ProtocolException(C25541a.m63881k("Unexpected status line: ", str));
        }
        int i2 = i + 3;
        if (str.length() >= i2) {
            try {
                int parseInt = Integer.parseInt(str.substring(i, i2));
                if (str.length() <= i2) {
                    str2 = "";
                } else if (str.charAt(i2) == ' ') {
                    str2 = str.substring(i + 4);
                } else {
                    throw new ProtocolException(C25541a.m63881k("Unexpected status line: ", str));
                }
                return new aac(yqVar, parseInt, str2);
            } catch (NumberFormatException unused) {
                throw new ProtocolException(C25541a.m63881k("Unexpected status line: ", str));
            }
        } else {
            throw new ProtocolException(C25541a.m63881k("Unexpected status line: ", str));
        }
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.f53297a == C22749yq.HTTP_1_0) {
            str = "HTTP/1.0";
        } else {
            str = "HTTP/1.1";
        }
        sb.append(str);
        sb.append(' ');
        sb.append(this.f53298b);
        if (this.f53299c != null) {
            sb.append(' ');
            sb.append(this.f53299c);
        }
        return sb.toString();
    }
}
