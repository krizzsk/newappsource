package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import android.net.Uri;
import android.os.Handler;
import com.fyber.inneractive.sdk.player.exoplayer2.C3067e;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C3106a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C3113e;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C3283f;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C3297m;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C3299n;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C3328b;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C3353g;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C3377y;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3380a;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.h */
public final class C3099h implements C3299n, C3113e.C3118e {

    /* renamed from: a */
    public final Uri f10681a;

    /* renamed from: b */
    public final C3095d f10682b;

    /* renamed from: c */
    public final C3283f.C3284a f10683c;

    /* renamed from: d */
    public C3113e f10684d;

    /* renamed from: e */
    public C3299n.C3300a f10685e;

    public C3099h(Uri uri, C3353g.C3354a aVar, int i, Handler handler, C3283f fVar) {
        this(uri, (C3095d) new C3090b(aVar), i, handler, fVar);
    }

    /* renamed from: a */
    public void mo14155a(C3067e eVar, boolean z, C3299n.C3300a aVar) {
        C3380a.m8507b(this.f10684d == null);
        Uri uri = this.f10681a;
        C3095d dVar = this.f10682b;
        C3113e eVar2 = new C3113e(uri, dVar, this.f10683c, 3, this);
        this.f10684d = eVar2;
        this.f10685e = aVar;
        eVar2.f10787i.mo14514a(new C3377y(((C3090b) dVar).f10618a.mo13785a(), uri, 4, eVar2.f10781c), eVar2, 3);
    }

    /* renamed from: b */
    public void mo14157b() {
        C3113e eVar = this.f10684d;
        if (eVar != null) {
            eVar.f10787i.mo14518d();
            for (C3113e.C3114a aVar : eVar.f10783e.values()) {
                aVar.f10794b.mo14518d();
            }
            eVar.f10784f.removeCallbacksAndMessages((Object) null);
            eVar.f10783e.clear();
            this.f10684d = null;
        }
        this.f10685e = null;
    }

    public C3099h(Uri uri, C3095d dVar, int i, Handler handler, C3283f fVar) {
        this.f10681a = uri;
        this.f10682b = dVar;
        this.f10683c = new C3283f.C3284a(handler, fVar);
    }

    /* renamed from: a */
    public void mo14154a() throws IOException {
        C3113e eVar = this.f10684d;
        eVar.f10787i.mo14517c();
        C3106a.C3107a aVar = eVar.f10790l;
        if (aVar != null) {
            C3113e.C3114a aVar2 = eVar.f10783e.get(aVar);
            aVar2.f10794b.mo14517c();
            IOException iOException = aVar2.f10802j;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    /* renamed from: a */
    public C3297m mo14153a(int i, C3328b bVar, long j) {
        C3380a.m8505a(i == 0);
        return new C3098g(this.f10684d, this.f10682b, 3, this.f10683c, bVar, j);
    }

    /* renamed from: a */
    public void mo14156a(C3297m mVar) {
        C3098g gVar = (C3098g) mVar;
        gVar.f10665a.f10786h.remove(gVar);
        gVar.f10672h.removeCallbacksAndMessages((Object) null);
        C3101j[] jVarArr = gVar.f10678n;
        if (jVarArr != null) {
            for (C3101j jVar : jVarArr) {
                int size = jVar.f10697j.size();
                for (int i = 0; i < size; i++) {
                    jVar.f10697j.valueAt(i).mo14102b();
                }
                jVar.f10694g.mo14518d();
                jVar.f10700m.removeCallbacksAndMessages((Object) null);
                jVar.f10706s = true;
            }
        }
    }
}
