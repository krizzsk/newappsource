package p247s6;

import java.util.ArrayList;
import p025b6.C1494g;

/* renamed from: s6.e */
public final class C6481e {

    /* renamed from: a */
    public final ArrayList f20221a = new ArrayList();

    /* renamed from: s6.e$a */
    public static final class C6482a<T> {

        /* renamed from: a */
        public final Class<T> f20222a;

        /* renamed from: b */
        public final C1494g<T> f20223b;

        public C6482a(Class<T> cls, C1494g<T> gVar) {
            this.f20222a = cls;
            this.f20223b = gVar;
        }
    }

    /* renamed from: a */
    public final synchronized <Z> C1494g<Z> mo22590a(Class<Z> cls) {
        int size = this.f20221a.size();
        for (int i = 0; i < size; i++) {
            C6482a aVar = (C6482a) this.f20221a.get(i);
            if (aVar.f20222a.isAssignableFrom(cls)) {
                return aVar.f20223b;
            }
        }
        return null;
    }
}
