package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.controller.C3019r;
import com.fyber.inneractive.sdk.player.exoplayer2.C3226i;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C3283f;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C3357j;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.d */
public class C3281d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Object f11790a;

    /* renamed from: b */
    public final /* synthetic */ long f11791b;

    /* renamed from: c */
    public final /* synthetic */ long f11792c;

    /* renamed from: d */
    public final /* synthetic */ IOException f11793d;

    /* renamed from: e */
    public final /* synthetic */ C3283f.C3284a f11794e;

    public C3281d(C3283f.C3284a aVar, C3357j jVar, int i, int i2, C3226i iVar, int i3, Object obj, long j, long j2, long j3, long j4, long j5, IOException iOException, boolean z) {
        this.f11794e = aVar;
        this.f11790a = obj;
        this.f11791b = j;
        this.f11792c = j2;
        this.f11793d = iOException;
    }

    public void run() {
        C3283f.C3284a aVar = this.f11794e;
        C3283f fVar = aVar.f11799b;
        C3283f.C3284a.m8288a(aVar, this.f11791b);
        C3283f.C3284a.m8288a(this.f11794e, this.f11792c);
        IAlog.m9902a("%s AdaptiveMediaSourceEventListener onLoadError called. with exception %s", ((C3019r) fVar).mo13930b(), this.f11793d);
    }
}
