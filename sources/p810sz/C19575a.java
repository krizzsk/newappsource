package p810sz;

import c00.C13716a;
import ce0.C21100e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: sz.a */
public final class C19575a<T, C extends Collection<? super T>> implements C19589j<Object> {

    /* renamed from: u */
    public final C19589j<Object> f49756u;

    /* renamed from: v */
    public final C13716a<T, C> f49757v;

    /* renamed from: w */
    public final boolean f49758w;

    public C19575a(C19589j jVar, C25541a aVar, boolean z) {
        C21100e.m49373x(jVar, "reader");
        this.f49756u = jVar;
        this.f49757v = aVar;
        this.f49758w = z;
    }

    /* renamed from: a */
    public static <T> C19575a<T, ArrayList<T>> m46957a(C19589j<T> jVar, boolean z) {
        return new C19575a<>(jVar, new C25541a(), z);
    }

    public final Object read(C19615p pVar) throws IOException {
        C c = null;
        int i = 0;
        if (this.f49758w) {
            C19589j<Object> jVar = this.f49756u;
            C13716a<T, C> aVar = this.f49757v;
            int l = pVar.mo51924l();
            if (l != -1) {
                c = aVar.mo40582a(l);
                while (i < l) {
                    c.add(jVar.read(pVar));
                    i++;
                }
            }
        } else {
            C19589j<Object> jVar2 = this.f49756u;
            C13716a<T, C> aVar2 = this.f49757v;
            int l2 = pVar.mo51924l();
            if (l2 != -1) {
                c = aVar2.mo40582a(l2);
                while (i < l2) {
                    c.add(pVar.mo51962q(jVar2));
                    i++;
                }
            }
        }
        return c;
    }
}
