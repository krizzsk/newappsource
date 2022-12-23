package p289va;

import com.google.android.exoplayer2.Format;
import p173ma.C5737j;
import p173ma.C5754v;
import p277ub.C6774a0;
import p277ub.C6803r;
import p277ub.C6812y;
import p289va.C6896d0;
import p583jk.C17875h;

/* renamed from: va.s */
public final class C6922s implements C6929x {

    /* renamed from: a */
    public Format f21548a;

    /* renamed from: b */
    public C6812y f21549b;

    /* renamed from: c */
    public C5754v f21550c;

    public C6922s(String str) {
        Format.C3872b bVar = new Format.C3872b();
        bVar.f13446k = str;
        this.f21548a = new Format(bVar);
    }

    /* renamed from: a */
    public final void mo23145a(C6812y yVar, C5737j jVar, C6896d0.C6900d dVar) {
        this.f21549b = yVar;
        dVar.mo23151a();
        dVar.mo23152b();
        C5754v p = jVar.mo20709p(dVar.f21326d, 5);
        this.f21550c = p;
        p.mo20632c(this.f21548a);
    }

    /* renamed from: b */
    public final void mo23146b(C6803r rVar) {
        long j;
        C17875h.m44306q(this.f21549b);
        int i = C6774a0.f20959a;
        long c = this.f21549b.mo23034c();
        long j2 = -9223372036854775807L;
        if (c != -9223372036854775807L) {
            Format format = this.f21548a;
            if (c != format.f13422q) {
                Format.C3872b bVar = new Format.C3872b(format);
                bVar.f13450o = c;
                Format format2 = new Format(bVar);
                this.f21548a = format2;
                this.f21550c.mo20632c(format2);
            }
            int i2 = rVar.f21040c - rVar.f21039b;
            this.f21550c.mo20631b(i2, rVar);
            C5754v vVar = this.f21550c;
            C6812y yVar = this.f21549b;
            synchronized (yVar) {
                long j3 = yVar.f21071c;
                if (j3 != -9223372036854775807L) {
                    j2 = yVar.f21070b + j3;
                } else {
                    long j4 = yVar.f21069a;
                    if (j4 != Long.MAX_VALUE) {
                        j = j4;
                    }
                }
                j = j2;
            }
            vVar.mo20633d(j, 1, i2, 0, (C5754v.C5755a) null);
        }
    }
}
