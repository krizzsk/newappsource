package com.fyber.inneractive.sdk.player;

import com.fyber.inneractive.sdk.network.C2936u;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.player.b */
public class C2947b implements C2936u<String> {

    /* renamed from: a */
    public final /* synthetic */ String f10080a;

    /* renamed from: b */
    public final /* synthetic */ long f10081b;

    public C2947b(String str, long j) {
        this.f10080a = str;
        this.f10081b = j;
    }

    /* renamed from: a */
    public void mo13154a(Object obj, Exception exc, boolean z) {
        String str = (String) obj;
        IAlog.m9902a("Hit Request: Hitting URL finished: %s", this.f10080a);
        if (exc == null) {
            IAlog.m9902a("Hit Request: Hitting URL response code: %s", str);
        } else {
            IAlog.m9902a("Hit Request: Hitting URL failed: %s", exc);
        }
        IAlog.m9902a("Hit Request: Url hit took %s millis", Long.valueOf(System.currentTimeMillis() - this.f10081b));
    }
}
