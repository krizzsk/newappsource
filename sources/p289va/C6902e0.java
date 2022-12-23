package p289va;

import com.google.android.exoplayer2.Format;
import java.util.List;
import p173ma.C5729b;
import p173ma.C5737j;
import p173ma.C5754v;
import p277ub.C6803r;
import p289va.C6896d0;
import p583jk.C17875h;

/* renamed from: va.e0 */
public final class C6902e0 {

    /* renamed from: a */
    public final List<Format> f21337a;

    /* renamed from: b */
    public final C5754v[] f21338b;

    public C6902e0(List<Format> list) {
        this.f21337a = list;
        this.f21338b = new C5754v[list.size()];
    }

    /* renamed from: a */
    public final void mo23153a(long j, C6803r rVar) {
        if (rVar.f21040c - rVar.f21039b >= 9) {
            int c = rVar.mo22984c();
            int c2 = rVar.mo22984c();
            int p = rVar.mo22997p();
            if (c == 434 && c2 == 1195456820 && p == 3) {
                C5729b.m14089b(j, rVar, this.f21338b);
            }
        }
    }

    /* renamed from: b */
    public final void mo23154b(C5737j jVar, C6896d0.C6900d dVar) {
        boolean z;
        String str;
        for (int i = 0; i < this.f21338b.length; i++) {
            dVar.mo23151a();
            dVar.mo23152b();
            C5754v p = jVar.mo20709p(dVar.f21326d, 3);
            Format format = this.f21337a.get(i);
            String str2 = format.f13418m;
            if ("application/cea-608".equals(str2) || "application/cea-708".equals(str2)) {
                z = true;
            } else {
                z = false;
            }
            String valueOf = String.valueOf(str2);
            if (valueOf.length() != 0) {
                str = "Invalid closed caption mime type provided: ".concat(valueOf);
            } else {
                str = new String("Invalid closed caption mime type provided: ");
            }
            C17875h.m44302l(z, str);
            Format.C3872b bVar = new Format.C3872b();
            dVar.mo23152b();
            bVar.f13436a = dVar.f21327e;
            bVar.f13446k = str2;
            bVar.f13439d = format.f13410e;
            bVar.f13438c = format.f13409d;
            bVar.f13434C = format.f13404E;
            bVar.f13448m = format.f13420o;
            p.mo20632c(new Format(bVar));
            this.f21338b[i] = p;
        }
    }
}
