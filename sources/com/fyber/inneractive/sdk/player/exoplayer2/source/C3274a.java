package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.controller.C3019r;
import com.fyber.inneractive.sdk.player.exoplayer2.C3226i;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C3283f;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C3357j;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.a */
public class C3274a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Object f11766a;

    /* renamed from: b */
    public final /* synthetic */ long f11767b;

    /* renamed from: c */
    public final /* synthetic */ long f11768c;

    /* renamed from: d */
    public final /* synthetic */ C3283f.C3284a f11769d;

    public C3274a(C3283f.C3284a aVar, C3357j jVar, int i, int i2, C3226i iVar, int i3, Object obj, long j, long j2, long j3) {
        this.f11769d = aVar;
        this.f11766a = obj;
        this.f11767b = j;
        this.f11768c = j2;
    }

    public void run() {
        C3283f.C3284a aVar = this.f11769d;
        C3283f fVar = aVar.f11799b;
        C3283f.C3284a.m8288a(aVar, this.f11767b);
        C3283f.C3284a.m8288a(this.f11769d, this.f11768c);
        IAlog.m9902a("%s AdaptiveMediaSourceEventListener onLoadStarted called.", ((C3019r) fVar).mo13930b());
    }
}
