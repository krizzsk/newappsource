package p247s6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p025b6.C1493f;

/* renamed from: s6.d */
public final class C6479d {

    /* renamed from: a */
    public final ArrayList f20216a = new ArrayList();

    /* renamed from: b */
    public final HashMap f20217b = new HashMap();

    /* renamed from: s6.d$a */
    public static class C6480a<T, R> {

        /* renamed from: a */
        public final Class<T> f20218a;

        /* renamed from: b */
        public final Class<R> f20219b;

        /* renamed from: c */
        public final C1493f<T, R> f20220c;

        public C6480a(Class<T> cls, Class<R> cls2, C1493f<T, R> fVar) {
            this.f20218a = cls;
            this.f20219b = cls2;
            this.f20220c = fVar;
        }
    }

    /* renamed from: a */
    public final synchronized List<C6480a<?, ?>> mo22588a(String str) {
        List<C6480a<?, ?>> list;
        if (!this.f20216a.contains(str)) {
            this.f20216a.add(str);
        }
        list = (List) this.f20217b.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.f20217b.put(str, list);
        }
        return list;
    }

    /* renamed from: b */
    public final synchronized ArrayList mo22589b(Class cls, Class cls2) {
        ArrayList arrayList;
        boolean z;
        arrayList = new ArrayList();
        Iterator it = this.f20216a.iterator();
        while (it.hasNext()) {
            List<C6480a> list = (List) this.f20217b.get((String) it.next());
            if (list != null) {
                for (C6480a aVar : list) {
                    if (!aVar.f20218a.isAssignableFrom(cls) || !cls2.isAssignableFrom(aVar.f20219b)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z && !arrayList.contains(aVar.f20219b)) {
                        arrayList.add(aVar.f20219b);
                    }
                }
            }
        }
        return arrayList;
    }
}
