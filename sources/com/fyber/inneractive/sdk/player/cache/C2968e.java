package com.fyber.inneractive.sdk.player.cache;

import com.fyber.inneractive.sdk.config.global.C2666s;
import com.fyber.inneractive.sdk.player.cache.C2964d;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C3353g;

/* renamed from: com.fyber.inneractive.sdk.player.cache.e */
public class C2968e implements C3353g.C3354a {

    /* renamed from: a */
    public final C2964d.C2967c f10163a;

    /* renamed from: b */
    public C2964d.C2966b f10164b;

    /* renamed from: c */
    public final int f10165c;

    /* renamed from: d */
    public final C2666s f10166d;

    public C2968e(C2964d.C2966b bVar, C2964d.C2967c cVar, int i, C2666s sVar) {
        this.f10164b = bVar;
        this.f10165c = i;
        this.f10163a = cVar;
        this.f10166d = sVar;
    }

    /* renamed from: a */
    public C3353g mo13785a() {
        C2964d dVar = new C2964d();
        dVar.f10155h = this.f10164b;
        dVar.f10157j = this.f10165c;
        dVar.f10158k = this.f10166d;
        dVar.f10156i = this.f10163a;
        return dVar;
    }
}
