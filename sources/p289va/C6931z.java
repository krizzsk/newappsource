package p289va;

import com.google.android.exoplayer2.Format;
import java.util.List;
import p173ma.C5737j;
import p173ma.C5754v;
import p289va.C6896d0;
import p583jk.C17875h;

/* renamed from: va.z */
public final class C6931z {

    /* renamed from: a */
    public final List<Format> f21597a;

    /* renamed from: b */
    public final C5754v[] f21598b;

    public C6931z(List<Format> list) {
        this.f21597a = list;
        this.f21598b = new C5754v[list.size()];
    }

    /* renamed from: a */
    public final void mo23169a(C5737j jVar, C6896d0.C6900d dVar) {
        boolean z;
        String str;
        for (int i = 0; i < this.f21598b.length; i++) {
            dVar.mo23151a();
            dVar.mo23152b();
            C5754v p = jVar.mo20709p(dVar.f21326d, 3);
            Format format = this.f21597a.get(i);
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
            String str3 = format.f13407b;
            if (str3 == null) {
                dVar.mo23152b();
                str3 = dVar.f21327e;
            }
            Format.C3872b bVar = new Format.C3872b();
            bVar.f13436a = str3;
            bVar.f13446k = str2;
            bVar.f13439d = format.f13410e;
            bVar.f13438c = format.f13409d;
            bVar.f13434C = format.f13404E;
            bVar.f13448m = format.f13420o;
            p.mo20632c(new Format(bVar));
            this.f21598b[i] = p;
        }
    }
}
