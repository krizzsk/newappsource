package p289va;

import com.google.android.exoplayer2.Format;
import java.util.Collections;
import java.util.List;
import p173ma.C5737j;
import p173ma.C5754v;
import p277ub.C6803r;
import p289va.C6896d0;

/* renamed from: va.i */
public final class C6906i implements C6907j {

    /* renamed from: a */
    public final List<C6896d0.C6897a> f21374a;

    /* renamed from: b */
    public final C5754v[] f21375b;

    /* renamed from: c */
    public boolean f21376c;

    /* renamed from: d */
    public int f21377d;

    /* renamed from: e */
    public int f21378e;

    /* renamed from: f */
    public long f21379f;

    public C6906i(List<C6896d0.C6897a> list) {
        this.f21374a = list;
        this.f21375b = new C5754v[list.size()];
    }

    /* renamed from: b */
    public final void mo23139b(C6803r rVar) {
        boolean z;
        boolean z2;
        if (this.f21376c) {
            if (this.f21377d == 2) {
                if (rVar.f21040c - rVar.f21039b == 0) {
                    z2 = false;
                } else {
                    if (rVar.mo22997p() != 32) {
                        this.f21376c = false;
                    }
                    this.f21377d--;
                    z2 = this.f21376c;
                }
                if (!z2) {
                    return;
                }
            }
            if (this.f21377d == 1) {
                if (rVar.f21040c - rVar.f21039b == 0) {
                    z = false;
                } else {
                    if (rVar.mo22997p() != 0) {
                        this.f21376c = false;
                    }
                    this.f21377d--;
                    z = this.f21376c;
                }
                if (!z) {
                    return;
                }
            }
            int i = rVar.f21039b;
            int i2 = rVar.f21040c - i;
            for (C5754v b : this.f21375b) {
                rVar.mo23007z(i);
                b.mo20631b(i2, rVar);
            }
            this.f21378e += i2;
        }
    }

    /* renamed from: c */
    public final void mo23140c() {
        this.f21376c = false;
    }

    /* renamed from: d */
    public final void mo23141d() {
        if (this.f21376c) {
            for (C5754v d : this.f21375b) {
                d.mo20633d(this.f21379f, 1, this.f21378e, 0, (C5754v.C5755a) null);
            }
            this.f21376c = false;
        }
    }

    /* renamed from: e */
    public final void mo23142e(int i, long j) {
        if ((i & 4) != 0) {
            this.f21376c = true;
            this.f21379f = j;
            this.f21378e = 0;
            this.f21377d = 2;
        }
    }

    /* renamed from: f */
    public final void mo23143f(C5737j jVar, C6896d0.C6900d dVar) {
        for (int i = 0; i < this.f21375b.length; i++) {
            C6896d0.C6897a aVar = this.f21374a.get(i);
            dVar.mo23151a();
            dVar.mo23152b();
            C5754v p = jVar.mo20709p(dVar.f21326d, 3);
            Format.C3872b bVar = new Format.C3872b();
            dVar.mo23152b();
            bVar.f13436a = dVar.f21327e;
            bVar.f13446k = "application/dvbsubs";
            bVar.f13448m = Collections.singletonList(aVar.f21319b);
            bVar.f13438c = aVar.f21318a;
            p.mo20632c(new Format(bVar));
            this.f21375b[i] = p;
        }
    }
}
