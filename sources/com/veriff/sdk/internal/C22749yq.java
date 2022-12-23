package com.veriff.sdk.internal;

import java.io.IOException;

/* renamed from: com.veriff.sdk.internal.yq */
public enum C22749yq {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");
    

    /* renamed from: g */
    private final String f57624g;

    private C22749yq(String str) {
        this.f57624g = str;
    }

    /* renamed from: a */
    public static C22749yq m55695a(String str) throws IOException {
        C22749yq yqVar = HTTP_1_0;
        if (str.equals(yqVar.f57624g)) {
            return yqVar;
        }
        C22749yq yqVar2 = HTTP_1_1;
        if (str.equals(yqVar2.f57624g)) {
            return yqVar2;
        }
        C22749yq yqVar3 = H2_PRIOR_KNOWLEDGE;
        if (str.equals(yqVar3.f57624g)) {
            return yqVar3;
        }
        C22749yq yqVar4 = HTTP_2;
        if (str.equals(yqVar4.f57624g)) {
            return yqVar4;
        }
        C22749yq yqVar5 = SPDY_3;
        if (str.equals(yqVar5.f57624g)) {
            return yqVar5;
        }
        C22749yq yqVar6 = QUIC;
        if (str.equals(yqVar6.f57624g)) {
            return yqVar6;
        }
        throw new IOException(C25541a.m63881k("Unexpected protocol: ", str));
    }

    public String toString() {
        return this.f57624g;
    }
}
