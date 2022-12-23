package p289va;

import com.google.android.exoplayer2.Format;
import p173ma.C5737j;
import p173ma.C5754v;
import p277ub.C6803r;
import p289va.C6896d0;
import p583jk.C17875h;

/* renamed from: va.o */
public final class C6918o implements C6907j {

    /* renamed from: a */
    public final C6803r f21504a = new C6803r(10);

    /* renamed from: b */
    public C5754v f21505b;

    /* renamed from: c */
    public boolean f21506c;

    /* renamed from: d */
    public long f21507d;

    /* renamed from: e */
    public int f21508e;

    /* renamed from: f */
    public int f21509f;

    /* renamed from: b */
    public final void mo23139b(C6803r rVar) {
        C17875h.m44306q(this.f21505b);
        if (this.f21506c) {
            int i = rVar.f21040c - rVar.f21039b;
            int i2 = this.f21509f;
            if (i2 < 10) {
                int min = Math.min(i, 10 - i2);
                System.arraycopy(rVar.f21038a, rVar.f21039b, this.f21504a.f21038a, this.f21509f, min);
                if (this.f21509f + min == 10) {
                    this.f21504a.mo23007z(0);
                    if (73 == this.f21504a.mo22997p() && 68 == this.f21504a.mo22997p() && 51 == this.f21504a.mo22997p()) {
                        this.f21504a.mo22981A(3);
                        this.f21508e = this.f21504a.mo22996o() + 10;
                    } else {
                        this.f21506c = false;
                        return;
                    }
                }
            }
            int min2 = Math.min(i, this.f21508e - this.f21509f);
            this.f21505b.mo20631b(min2, rVar);
            this.f21509f += min2;
        }
    }

    /* renamed from: c */
    public final void mo23140c() {
        this.f21506c = false;
    }

    /* renamed from: d */
    public final void mo23141d() {
        int i;
        C17875h.m44306q(this.f21505b);
        if (this.f21506c && (i = this.f21508e) != 0 && this.f21509f == i) {
            this.f21505b.mo20633d(this.f21507d, 1, i, 0, (C5754v.C5755a) null);
            this.f21506c = false;
        }
    }

    /* renamed from: e */
    public final void mo23142e(int i, long j) {
        if ((i & 4) != 0) {
            this.f21506c = true;
            this.f21507d = j;
            this.f21508e = 0;
            this.f21509f = 0;
        }
    }

    /* renamed from: f */
    public final void mo23143f(C5737j jVar, C6896d0.C6900d dVar) {
        dVar.mo23151a();
        dVar.mo23152b();
        C5754v p = jVar.mo20709p(dVar.f21326d, 5);
        this.f21505b = p;
        Format.C3872b bVar = new Format.C3872b();
        dVar.mo23152b();
        bVar.f13436a = dVar.f21327e;
        bVar.f13446k = "application/id3";
        p.mo20632c(new Format(bVar));
    }
}
