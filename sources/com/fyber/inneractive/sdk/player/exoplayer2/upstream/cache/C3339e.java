package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C3351f;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C3353g;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.C3337d;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.e */
public final class C3339e implements C3353g.C3354a {

    /* renamed from: a */
    public final C3331a f11955a;

    /* renamed from: b */
    public final C3353g.C3354a f11956b;

    /* renamed from: c */
    public final C3353g.C3354a f11957c;

    /* renamed from: d */
    public final C3351f.C3352a f11958d;

    public C3339e(C3331a aVar, C3353g.C3354a aVar2, C3353g.C3354a aVar3, C3351f.C3352a aVar4, int i, C3337d.C3338a aVar5) {
        this.f11955a = aVar;
        this.f11956b = aVar2;
        this.f11957c = aVar3;
        this.f11958d = aVar4;
    }

    /* renamed from: a */
    public C3353g mo13785a() {
        C3334b bVar;
        C3331a aVar = this.f11955a;
        C3353g a = this.f11956b.mo13785a();
        C3353g a2 = this.f11957c.mo13785a();
        C3351f.C3352a aVar2 = this.f11958d;
        if (aVar2 != null) {
            C3336c cVar = (C3336c) aVar2;
            bVar = new C3334b(cVar.f11934a, cVar.f11935b, 20480);
        } else {
            bVar = null;
        }
        return new C3337d(aVar, a, a2, bVar, 2, (C3337d.C3338a) null);
    }
}
