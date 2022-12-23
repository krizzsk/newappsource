package com.fyber.inneractive.sdk.player.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import android.util.Pair;
import com.fyber.inneractive.sdk.player.exoplayer2.C3067e;
import com.fyber.inneractive.sdk.player.exoplayer2.C3221h;
import com.fyber.inneractive.sdk.player.exoplayer2.C3270p;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3119i;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C3287i;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C3299n;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C3328b;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C3353g;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C3372x;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3380a;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.l */
public final class C3295l implements C3299n, C3299n.C3300a {

    /* renamed from: a */
    public final Uri f11856a;

    /* renamed from: b */
    public final C3353g.C3354a f11857b;

    /* renamed from: c */
    public final C3119i f11858c;

    /* renamed from: d */
    public final int f11859d;

    /* renamed from: e */
    public final Handler f11860e;

    /* renamed from: f */
    public final C3296a f11861f;

    /* renamed from: g */
    public final C3270p.C3272b f11862g = new C3270p.C3272b();

    /* renamed from: h */
    public C3299n.C3300a f11863h;

    /* renamed from: i */
    public boolean f11864i;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.l$a */
    public interface C3296a {
    }

    public C3295l(Uri uri, C3353g.C3354a aVar, C3119i iVar, int i, Handler handler, C3296a aVar2, String str) {
        this.f11856a = uri;
        this.f11857b = aVar;
        this.f11858c = iVar;
        this.f11859d = i;
        this.f11860e = handler;
        this.f11861f = aVar2;
    }

    /* renamed from: a */
    public void mo14154a() throws IOException {
    }

    /* renamed from: a */
    public void mo14155a(C3067e eVar, boolean z, C3299n.C3300a aVar) {
        this.f11863h = aVar;
        ((C3221h) aVar).f11576f.obtainMessage(7, Pair.create(new C3303q(-9223372036854775807L, false), (Object) null)).sendToTarget();
    }

    /* renamed from: b */
    public void mo14157b() {
        this.f11863h = null;
    }

    /* renamed from: a */
    public C3297m mo14153a(int i, C3328b bVar, long j) {
        C3380a.m8505a(i == 0);
        return new C3287i(this.f11856a, this.f11857b.mo13785a(), this.f11858c.mo14090a(), this.f11859d, this.f11860e, this.f11861f, this, bVar, (String) null);
    }

    /* renamed from: a */
    public void mo14156a(C3297m mVar) {
        C3287i iVar = (C3287i) mVar;
        C3287i.C3291d dVar = iVar.f11818j;
        C3372x xVar = iVar.f11817i;
        C3293j jVar = new C3293j(iVar, dVar);
        C3372x.C3374b<? extends C3372x.C3375c> bVar = xVar.f12067b;
        if (bVar != null) {
            bVar.mo14520a(true);
        }
        xVar.f12066a.execute(jVar);
        xVar.f12066a.shutdown();
        iVar.f11822n.removeCallbacksAndMessages((Object) null);
        iVar.f11808G = true;
    }

    /* renamed from: a */
    public void mo14291a(C3270p pVar, Object obj) {
        boolean z = false;
        if (pVar.mo14408a(0, this.f11862g, false).f11757d != -9223372036854775807L) {
            z = true;
        }
        if (!this.f11864i || z) {
            this.f11864i = z;
            this.f11863h.mo14291a(pVar, (Object) null);
        }
    }
}
