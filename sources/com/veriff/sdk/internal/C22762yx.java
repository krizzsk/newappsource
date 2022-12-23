package com.veriff.sdk.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.veriff.sdk.internal.yx */
public enum C22762yx {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");
    

    /* renamed from: f */
    public final String f57690f;

    private C22762yx(String str) {
        this.f57690f = str;
    }

    /* renamed from: a */
    public static C22762yx m55796a(String str) {
        str.getClass();
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -503070503:
                if (str.equals("TLSv1.1")) {
                    c = 0;
                    break;
                }
                break;
            case -503070502:
                if (str.equals("TLSv1.2")) {
                    c = 1;
                    break;
                }
                break;
            case -503070501:
                if (str.equals("TLSv1.3")) {
                    c = 2;
                    break;
                }
                break;
            case 79201641:
                if (str.equals("SSLv3")) {
                    c = 3;
                    break;
                }
                break;
            case 79923350:
                if (str.equals("TLSv1")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return TLS_1_1;
            case 1:
                return TLS_1_2;
            case 2:
                return TLS_1_3;
            case 3:
                return SSL_3_0;
            case 4:
                return TLS_1_0;
            default:
                throw new IllegalArgumentException(C25541a.m63881k("Unexpected TLS version: ", str));
        }
    }

    /* renamed from: a */
    public static List<C22762yx> m55797a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String a : strArr) {
            arrayList.add(m55796a(a));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    public String mo57456a() {
        return this.f57690f;
    }
}
