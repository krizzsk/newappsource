package p208p6;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: p6.d */
public final class C6096d {

    /* renamed from: a */
    public final ArrayList f19357a = new ArrayList();

    /* renamed from: p6.d$a */
    public static final class C6097a<Z, R> {

        /* renamed from: a */
        public final Class<Z> f19358a;

        /* renamed from: b */
        public final Class<R> f19359b;

        /* renamed from: c */
        public final C6095c<Z, R> f19360c;

        public C6097a(Class<Z> cls, Class<R> cls2, C6095c<Z, R> cVar) {
            this.f19358a = cls;
            this.f19359b = cls2;
            this.f19360c = cVar;
        }
    }

    /* renamed from: a */
    public final synchronized ArrayList mo22065a(Class cls, Class cls2) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        Iterator it = this.f19357a.iterator();
        while (it.hasNext()) {
            C6097a aVar = (C6097a) it.next();
            if (!aVar.f19358a.isAssignableFrom(cls) || !cls2.isAssignableFrom(aVar.f19359b)) {
                z = false;
            } else {
                z = true;
            }
            if (z && !arrayList.contains(aVar.f19359b)) {
                arrayList.add(aVar.f19359b);
            }
        }
        return arrayList;
    }
}
