package p242s1;

import androidx.lifecycle.C1025n;
import androidx.lifecycle.Lifecycle;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: s1.l */
public final class C6372l {

    /* renamed from: a */
    public final Runnable f20024a;

    /* renamed from: b */
    public final CopyOnWriteArrayList<C6377n> f20025b = new CopyOnWriteArrayList<>();

    /* renamed from: c */
    public final HashMap f20026c = new HashMap();

    /* renamed from: s1.l$a */
    public static class C6373a {

        /* renamed from: a */
        public final Lifecycle f20027a;

        /* renamed from: b */
        public C1025n f20028b;

        public C6373a(Lifecycle lifecycle, C1025n nVar) {
            this.f20027a = lifecycle;
            this.f20028b = nVar;
            lifecycle.mo4224a(nVar);
        }
    }

    public C6372l(Runnable runnable) {
        this.f20024a = runnable;
    }

    /* renamed from: a */
    public final void mo22477a(C6377n nVar) {
        this.f20025b.remove(nVar);
        C6373a aVar = (C6373a) this.f20026c.remove(nVar);
        if (aVar != null) {
            aVar.f20027a.mo4226c(aVar.f20028b);
            aVar.f20028b = null;
        }
        this.f20024a.run();
    }
}
