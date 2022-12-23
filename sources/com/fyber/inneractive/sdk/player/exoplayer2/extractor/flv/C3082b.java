package com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3072b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3080f;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3087g;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3088h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3123l;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3124m;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3161n;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3393k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv.b */
public final class C3082b implements C3080f, C3124m {

    /* renamed from: n */
    public static final int f10593n = C3406u.m8589a("FLV");

    /* renamed from: a */
    public final C3393k f10594a = new C3393k(4);

    /* renamed from: b */
    public final C3393k f10595b = new C3393k(9);

    /* renamed from: c */
    public final C3393k f10596c = new C3393k(11);

    /* renamed from: d */
    public final C3393k f10597d = new C3393k();

    /* renamed from: e */
    public C3088h f10598e;

    /* renamed from: f */
    public int f10599f = 1;

    /* renamed from: g */
    public int f10600g;

    /* renamed from: h */
    public int f10601h;

    /* renamed from: i */
    public int f10602i;

    /* renamed from: j */
    public long f10603j;

    /* renamed from: k */
    public C3081a f10604k;

    /* renamed from: l */
    public C3086e f10605l;

    /* renamed from: m */
    public C3083c f10606m;

    /* renamed from: a */
    public long mo14078a(long j) {
        return 0;
    }

    /* renamed from: a */
    public boolean mo14079a() {
        return false;
    }

    /* renamed from: a */
    public boolean mo14115a(C3087g gVar) throws IOException, InterruptedException {
        C3072b bVar = (C3072b) gVar;
        bVar.mo14085a(this.f10594a.f12121a, 0, 3, false);
        this.f10594a.mo14549e(0);
        if (this.f10594a.mo14559n() != f10593n) {
            return false;
        }
        bVar.mo14085a(this.f10594a.f12121a, 0, 2, false);
        this.f10594a.mo14549e(0);
        if ((this.f10594a.mo14562q() & 250) != 0) {
            return false;
        }
        bVar.mo14085a(this.f10594a.f12121a, 0, 4, false);
        this.f10594a.mo14549e(0);
        int c = this.f10594a.mo14544c();
        bVar.f10550e = 0;
        bVar.mo14084a(c, false);
        bVar.mo14085a(this.f10594a.f12121a, 0, 4, false);
        this.f10594a.mo14549e(0);
        if (this.f10594a.mo14544c() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final C3393k mo14119b(C3087g gVar) throws IOException, InterruptedException {
        if (this.f10602i > this.f10597d.mo14542b()) {
            C3393k kVar = this.f10597d;
            kVar.f12121a = new byte[Math.max(kVar.mo14542b() * 2, this.f10602i)];
            kVar.f12123c = 0;
            kVar.f12122b = 0;
        } else {
            this.f10597d.mo14549e(0);
        }
        this.f10597d.mo14547d(this.f10602i);
        ((C3072b) gVar).mo14087b(this.f10597d.f12121a, 0, this.f10602i, false);
        return this.f10597d;
    }

    /* renamed from: b */
    public void mo14116b() {
    }

    /* renamed from: c */
    public final boolean mo14120c(C3087g gVar) throws IOException, InterruptedException {
        boolean z;
        C3083c cVar;
        C3086e eVar;
        C3081a aVar;
        int i = this.f10601h;
        if (i == 8 && (aVar = this.f10604k) != null) {
            aVar.mo14121a(mo14119b(gVar), this.f10603j);
        } else if (i == 9 && (eVar = this.f10605l) != null) {
            eVar.mo14121a(mo14119b(gVar), this.f10603j);
        } else if (i != 18 || (cVar = this.f10606m) == null) {
            ((C3072b) gVar).mo14088c(this.f10602i);
            z = false;
            this.f10600g = 4;
            this.f10599f = 2;
            return z;
        } else {
            cVar.mo14121a(mo14119b(gVar), this.f10603j);
        }
        z = true;
        this.f10600g = 4;
        this.f10599f = 2;
        return z;
    }

    /* renamed from: c */
    public long mo14080c() {
        return this.f10606m.f10607b;
    }

    /* renamed from: a */
    public void mo14114a(C3088h hVar) {
        this.f10598e = hVar;
    }

    /* renamed from: a */
    public void mo14113a(long j, long j2) {
        this.f10599f = 1;
        this.f10600g = 0;
    }

    /* renamed from: a */
    public int mo14112a(C3087g gVar, C3123l lVar) throws IOException, InterruptedException {
        while (true) {
            int i = this.f10599f;
            boolean z = true;
            boolean z2 = false;
            if (i == 1) {
                if (!((C3072b) gVar).mo14087b(this.f10595b.f12121a, 0, 9, true)) {
                    z = false;
                } else {
                    this.f10595b.mo14549e(0);
                    this.f10595b.mo14551f(4);
                    int l = this.f10595b.mo14557l();
                    boolean z3 = (l & 4) != 0;
                    if ((l & 1) != 0) {
                        z2 = true;
                    }
                    if (z3 && this.f10604k == null) {
                        this.f10604k = new C3081a(this.f10598e.mo14122a(8, 1));
                    }
                    if (z2 && this.f10605l == null) {
                        this.f10605l = new C3086e(this.f10598e.mo14122a(9, 2));
                    }
                    if (this.f10606m == null) {
                        this.f10606m = new C3083c((C3161n) null);
                    }
                    this.f10598e.mo14124c();
                    this.f10598e.mo14123a(this);
                    this.f10600g = (this.f10595b.mo14544c() - 9) + 4;
                    this.f10599f = 2;
                }
                if (!z) {
                    return -1;
                }
            } else if (i == 2) {
                ((C3072b) gVar).mo14088c(this.f10600g);
                this.f10600g = 0;
                this.f10599f = 3;
            } else if (i == 3) {
                if (!((C3072b) gVar).mo14087b(this.f10596c.f12121a, 0, 11, true)) {
                    z = false;
                } else {
                    this.f10596c.mo14549e(0);
                    this.f10601h = this.f10596c.mo14557l();
                    this.f10602i = this.f10596c.mo14559n();
                    this.f10603j = (long) this.f10596c.mo14559n();
                    this.f10603j = (((long) (this.f10596c.mo14557l() << 24)) | this.f10603j) * 1000;
                    this.f10596c.mo14551f(3);
                    this.f10599f = 4;
                }
                if (!z) {
                    return -1;
                }
            } else if (i == 4 && mo14120c(gVar)) {
                return 0;
            }
        }
    }
}
