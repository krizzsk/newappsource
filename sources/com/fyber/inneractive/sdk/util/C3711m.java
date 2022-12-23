package com.fyber.inneractive.sdk.util;

import com.fyber.inneractive.sdk.cache.C2592a;

/* renamed from: com.fyber.inneractive.sdk.util.m */
public class C3711m implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C2592a f12900a;

    public C3711m(C2592a aVar) {
        this.f12900a = aVar;
    }

    public void run() {
        C2592a aVar;
        try {
            if (C3707l.f12893a != null && (aVar = this.f12900a) != null) {
                C3707l.f12893a.getSharedPreferences("IAConfigurationPreferences", 0).edit().remove(aVar.mo13169b()).apply();
            }
        } catch (Throwable unused) {
        }
    }
}
