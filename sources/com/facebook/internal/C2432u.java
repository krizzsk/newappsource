package com.facebook.internal;

import p009a8.C0115o;

/* renamed from: com.facebook.internal.u */
public final class C2432u {

    /* renamed from: com.facebook.internal.u$a */
    public interface C2433a {
        /* renamed from: a */
        void mo12488a(String str);
    }

    /* renamed from: a */
    public static final void m6384a() {
        C0115o.m210a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putBoolean("is_referrer_updated", true).apply();
    }
}
