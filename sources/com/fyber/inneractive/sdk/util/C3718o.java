package com.fyber.inneractive.sdk.util;

import com.fyber.inneractive.sdk.network.C2936u;

/* renamed from: com.fyber.inneractive.sdk.util.o */
public class C3718o implements C2936u<String> {

    /* renamed from: a */
    public final /* synthetic */ String f12905a;

    /* renamed from: b */
    public final /* synthetic */ long f12906b;

    public C3718o(String str, long j) {
        this.f12905a = str;
        this.f12906b = j;
    }

    /* renamed from: a */
    public void mo13154a(Object obj, Exception exc, boolean z) {
        String str = (String) obj;
        IAlog.m9902a("Hit Request: Hitting URL finished: %s", this.f12905a);
        if (exc == null) {
            IAlog.m9902a("Hit Request: Hitting URL response code: %s", str);
        } else {
            IAlog.m9902a("Hit Request: Hitting URL failed: %s", exc);
        }
        IAlog.m9902a("Hit Request: Url hit took %s millis", Long.valueOf(System.currentTimeMillis() - this.f12906b));
    }
}
