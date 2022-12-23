package p108h6;

import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p025b6.C1492e;
import p108h6.C5104n;
import p229r1.C6234d;
import p322y6.C7333a;
import p584jl.C17885a;

/* renamed from: h6.r */
public final class C5112r {

    /* renamed from: e */
    public static final C5115c f17120e = new C5115c();

    /* renamed from: f */
    public static final C5113a f17121f = new C5113a();

    /* renamed from: a */
    public final ArrayList f17122a = new ArrayList();

    /* renamed from: b */
    public final C5115c f17123b;

    /* renamed from: c */
    public final HashSet f17124c = new HashSet();

    /* renamed from: d */
    public final C6234d<List<Throwable>> f17125d;

    /* renamed from: h6.r$a */
    public static class C5113a implements C5104n<Object, Object> {
        /* renamed from: a */
        public final boolean mo20815a(Object obj) {
            return false;
        }

        /* renamed from: b */
        public final C5104n.C5105a<Object> mo20816b(Object obj, int i, int i2, C1492e eVar) {
            return null;
        }
    }

    /* renamed from: h6.r$b */
    public static class C5114b<Model, Data> {

        /* renamed from: a */
        public final Class<Model> f17126a;

        /* renamed from: b */
        public final Class<Data> f17127b;

        /* renamed from: c */
        public final C5106o<? extends Model, ? extends Data> f17128c;

        public C5114b(Class<Model> cls, Class<Data> cls2, C5106o<? extends Model, ? extends Data> oVar) {
            this.f17126a = cls;
            this.f17127b = cls2;
            this.f17128c = oVar;
        }
    }

    /* renamed from: h6.r$c */
    public static class C5115c {
    }

    public C5112r(C7333a.C7336c cVar) {
        C5115c cVar2 = f17120e;
        this.f17125d = cVar;
        this.f17123b = cVar2;
    }

    /* renamed from: a */
    public final <Model, Data> C5104n<Model, Data> mo20843a(C5114b<?, ?> bVar) {
        C5104n<? extends Model, ? extends Data> b = bVar.f17128c.mo20818b(this);
        C17885a.m44458r(b);
        return b;
    }

    /* renamed from: b */
    public final synchronized <Model, Data> C5104n<Model, Data> mo20844b(Class<Model> cls, Class<Data> cls2) {
        boolean z;
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f17122a.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                C5114b bVar = (C5114b) it.next();
                if (this.f17124c.contains(bVar)) {
                    z2 = true;
                } else {
                    if (!bVar.f17126a.isAssignableFrom(cls) || !bVar.f17127b.isAssignableFrom(cls2)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        this.f17124c.add(bVar);
                        arrayList.add(mo20843a(bVar));
                        this.f17124c.remove(bVar);
                    }
                }
            }
            if (arrayList.size() > 1) {
                C5115c cVar = this.f17123b;
                C6234d<List<Throwable>> dVar = this.f17125d;
                cVar.getClass();
                return new C5110q(arrayList, dVar);
            } else if (arrayList.size() == 1) {
                return (C5104n) arrayList.get(0);
            } else if (z2) {
                return f17121f;
            } else {
                throw new Registry.NoModelLoaderAvailableException((Class<?>) cls, (Class<?>) cls2);
            }
        } catch (Throwable th) {
            this.f17124c.clear();
            throw th;
        }
    }

    /* renamed from: c */
    public final synchronized ArrayList mo20845c(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.f17122a.iterator();
            while (it.hasNext()) {
                C5114b bVar = (C5114b) it.next();
                if (!this.f17124c.contains(bVar)) {
                    if (bVar.f17126a.isAssignableFrom(cls)) {
                        this.f17124c.add(bVar);
                        C5104n<? extends Model, ? extends Data> b = bVar.f17128c.mo20818b(this);
                        C17885a.m44458r(b);
                        arrayList.add(b);
                        this.f17124c.remove(bVar);
                    }
                }
            }
        } catch (Throwable th) {
            this.f17124c.clear();
            throw th;
        }
        return arrayList;
    }

    /* renamed from: d */
    public final synchronized ArrayList mo20846d(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f17122a.iterator();
        while (it.hasNext()) {
            C5114b bVar = (C5114b) it.next();
            if (!arrayList.contains(bVar.f17127b) && bVar.f17126a.isAssignableFrom(cls)) {
                arrayList.add(bVar.f17127b);
            }
        }
        return arrayList;
    }
}
