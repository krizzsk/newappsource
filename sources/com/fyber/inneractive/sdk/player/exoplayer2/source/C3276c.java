package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.controller.C3019r;
import com.fyber.inneractive.sdk.player.exoplayer2.C3226i;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C3283f;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C3357j;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.c */
public class C3276c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Object f11774a;

    /* renamed from: b */
    public final /* synthetic */ long f11775b;

    /* renamed from: c */
    public final /* synthetic */ long f11776c;

    /* renamed from: d */
    public final /* synthetic */ C3283f.C3284a f11777d;

    public C3276c(C3283f.C3284a aVar, C3357j jVar, int i, int i2, C3226i iVar, int i3, Object obj, long j, long j2, long j3, long j4, long j5) {
        this.f11777d = aVar;
        this.f11774a = obj;
        this.f11775b = j;
        this.f11776c = j2;
    }

    public void run() {
        C3283f.C3284a aVar = this.f11777d;
        C3283f fVar = aVar.f11799b;
        C3283f.C3284a.m8288a(aVar, this.f11775b);
        C3283f.C3284a.m8288a(this.f11777d, this.f11776c);
        IAlog.m9902a("%s AdaptiveMediaSourceEventListener onLoadCanceled called.", ((C3019r) fVar).mo13930b());
    }
}
