package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.controller.C3019r;
import com.fyber.inneractive.sdk.player.exoplayer2.C3226i;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C3283f;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.e */
public class C3282e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Object f11795a;

    /* renamed from: b */
    public final /* synthetic */ long f11796b;

    /* renamed from: c */
    public final /* synthetic */ C3283f.C3284a f11797c;

    public C3282e(C3283f.C3284a aVar, int i, C3226i iVar, int i2, Object obj, long j) {
        this.f11797c = aVar;
        this.f11795a = obj;
        this.f11796b = j;
    }

    public void run() {
        C3283f.C3284a aVar = this.f11797c;
        C3283f fVar = aVar.f11799b;
        C3283f.C3284a.m8288a(aVar, this.f11796b);
        IAlog.m9902a("%s AdaptiveMediaSourceEventListener onDownstreamFormatChanged called.", ((C3019r) fVar).mo13930b());
    }
}
