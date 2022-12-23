package com.fyber.inneractive.sdk.flow.vast;

/* renamed from: com.fyber.inneractive.sdk.flow.vast.c */
public class C2799c {

    /* renamed from: a */
    public C2800a f9661a;

    /* renamed from: b */
    public Object f9662b;

    /* renamed from: com.fyber.inneractive.sdk.flow.vast.c$a */
    public enum C2800a {
        BITRATE_NOT_IN_RANGE(1),
        UNSUPPORTED_MIME_TYPE(2),
        UNSUPPORTED_DELIVERY(3),
        UNSECURED_VIDEO_URL(4),
        VERTICAL_VIDEO_EXPECTED(5),
        FILTERED_BY_APP_OR_UNIT(6),
        NO_CONTENT(7);
        

        /* renamed from: a */
        public int f9671a;

        /* access modifiers changed from: public */
        C2800a(int i) {
            this.f9671a = i;
        }
    }

    public C2799c(C2800a aVar, Object obj) {
        this.f9661a = aVar;
        this.f9662b = obj;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("Media File inc error::  type = ");
        k.append(this.f9661a);
        k.append(" expected value = ");
        k.append(this.f9662b);
        return k.toString();
    }
}
