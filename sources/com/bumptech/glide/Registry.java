package com.bumptech.glide;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.C2144e;
import com.bumptech.glide.load.data.C2146f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p025b6.C1493f;
import p025b6.C1494g;
import p037c5.C1784e;
import p108h6.C5104n;
import p108h6.C5106o;
import p108h6.C5107p;
import p108h6.C5112r;
import p208p6.C6095c;
import p208p6.C6096d;
import p229r1.C6236f;
import p247s6.C6475a;
import p247s6.C6477b;
import p247s6.C6478c;
import p247s6.C6479d;
import p247s6.C6481e;
import p322y6.C7333a;
import p322y6.C7339b;
import p322y6.C7340c;
import p584jl.C17885a;

public final class Registry {

    /* renamed from: a */
    public final C5107p f6869a;

    /* renamed from: b */
    public final C6475a f6870b;

    /* renamed from: c */
    public final C6479d f6871c;

    /* renamed from: d */
    public final C6481e f6872d;

    /* renamed from: e */
    public final C2146f f6873e;

    /* renamed from: f */
    public final C6096d f6874f;

    /* renamed from: g */
    public final C1784e f6875g;

    /* renamed from: h */
    public final C6478c f6876h = new C6478c(0);

    /* renamed from: i */
    public final C6477b f6877i = new C6477b();

    /* renamed from: j */
    public final C7333a.C7336c f6878j;

    public static class MissingComponentException extends RuntimeException {
        public MissingComponentException(String str) {
            super(str);
        }
    }

    public static final class NoImageHeaderParserException extends MissingComponentException {
        public NoImageHeaderParserException() {
            super("Failed to find image header parser.");
        }
    }

    public static class NoResultEncoderAvailableException extends MissingComponentException {
        public NoResultEncoderAvailableException(Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    public static class NoSourceEncoderAvailableException extends MissingComponentException {
        public NoSourceEncoderAvailableException(Class<?> cls) {
            super(C25541a.m63880j("Failed to find source encoder for data class: ", cls));
        }
    }

    public Registry() {
        C7333a.C7336c cVar = new C7333a.C7336c(new C6236f(20), new C7339b(), new C7340c());
        this.f6878j = cVar;
        this.f6869a = new C5107p(cVar);
        this.f6870b = new C6475a();
        this.f6871c = new C6479d();
        this.f6872d = new C6481e();
        this.f6873e = new C2146f();
        this.f6874f = new C6096d();
        this.f6875g = new C1784e();
        List<String> asList = Arrays.asList(new String[]{"Animation", "Bitmap", "BitmapDrawable"});
        ArrayList arrayList = new ArrayList(asList.size());
        arrayList.add("legacy_prepend_all");
        for (String add : asList) {
            arrayList.add(add);
        }
        arrayList.add("legacy_append");
        C6479d dVar = this.f6871c;
        synchronized (dVar) {
            ArrayList arrayList2 = new ArrayList(dVar.f20216a);
            dVar.f20216a.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                dVar.f20216a.add((String) it.next());
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                String str = (String) it2.next();
                if (!arrayList.contains(str)) {
                    dVar.f20216a.add(str);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo10827a(C1493f fVar, Class cls, Class cls2, String str) {
        C6479d dVar = this.f6871c;
        synchronized (dVar) {
            dVar.mo22588a(str).add(new C6479d.C6480a(cls, cls2, fVar));
        }
    }

    /* renamed from: b */
    public final void mo10828b(Class cls, C1494g gVar) {
        C6481e eVar = this.f6872d;
        synchronized (eVar) {
            eVar.f20221a.add(new C6481e.C6482a(cls, gVar));
        }
    }

    /* renamed from: c */
    public final void mo10829c(Class cls, Class cls2, C5106o oVar) {
        C5107p pVar = this.f6869a;
        synchronized (pVar) {
            C5112r rVar = pVar.f17107a;
            synchronized (rVar) {
                C5112r.C5114b bVar = new C5112r.C5114b(cls, cls2, oVar);
                ArrayList arrayList = rVar.f17122a;
                arrayList.add(arrayList.size(), bVar);
            }
            pVar.f17108b.f17109a.clear();
        }
    }

    /* renamed from: d */
    public final List<ImageHeaderParser> mo10830d() {
        List<ImageHeaderParser> list;
        C1784e eVar = this.f6875g;
        synchronized (eVar) {
            list = eVar.f6255b;
        }
        if (!list.isEmpty()) {
            return list;
        }
        throw new NoImageHeaderParserException();
    }

    /* renamed from: e */
    public final <Model> List<C5104n<Model, ?>> mo10831e(Model model) {
        List<C5104n<Model, ?>> list;
        C5107p pVar = this.f6869a;
        pVar.getClass();
        Class<?> cls = model.getClass();
        synchronized (pVar) {
            C5107p.C5108a.C5109a aVar = (C5107p.C5108a.C5109a) pVar.f17108b.f17109a.get(cls);
            if (aVar == null) {
                list = null;
            } else {
                list = aVar.f17110a;
            }
            if (list == null) {
                list = Collections.unmodifiableList(pVar.f17107a.mo20845c(cls));
                pVar.f17108b.mo20840a(cls, list);
            }
        }
        if (!list.isEmpty()) {
            int size = list.size();
            List<C5104n<Model, ?>> emptyList = Collections.emptyList();
            boolean z = true;
            for (int i = 0; i < size; i++) {
                C5104n nVar = list.get(i);
                if (nVar.mo20815a(model)) {
                    if (z) {
                        emptyList = new ArrayList<>(size - i);
                        z = false;
                    }
                    emptyList.add(nVar);
                }
            }
            if (!emptyList.isEmpty()) {
                return emptyList;
            }
            throw new NoModelLoaderAvailableException(model, list);
        }
        throw new NoModelLoaderAvailableException(model);
    }

    /* renamed from: f */
    public final <X> C2144e<X> mo10832f(X x) {
        C2144e<X> b;
        C2146f fVar = this.f6873e;
        synchronized (fVar) {
            C17885a.m44458r(x);
            C2144e.C2145a aVar = (C2144e.C2145a) fVar.f6963a.get(x.getClass());
            if (aVar == null) {
                Iterator it = fVar.f6963a.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C2144e.C2145a aVar2 = (C2144e.C2145a) it.next();
                    if (aVar2.mo10902a().isAssignableFrom(x.getClass())) {
                        aVar = aVar2;
                        break;
                    }
                }
            }
            if (aVar == null) {
                aVar = C2146f.f6962b;
            }
            b = aVar.mo10903b(x);
        }
        return b;
    }

    /* renamed from: g */
    public final void mo10833g(Class cls, Class cls2, C1493f fVar) {
        C6479d dVar = this.f6871c;
        synchronized (dVar) {
            dVar.mo22588a("legacy_prepend_all").add(0, new C6479d.C6480a(cls, cls2, fVar));
        }
    }

    /* renamed from: h */
    public final void mo10834h(Class cls, Class cls2, C5106o oVar) {
        C5107p pVar = this.f6869a;
        synchronized (pVar) {
            C5112r rVar = pVar.f17107a;
            synchronized (rVar) {
                rVar.f17122a.add(0, new C5112r.C5114b(cls, cls2, oVar));
            }
            pVar.f17108b.f17109a.clear();
        }
    }

    /* renamed from: i */
    public final void mo10835i(C2144e.C2145a aVar) {
        C2146f fVar = this.f6873e;
        synchronized (fVar) {
            fVar.f6963a.put(aVar.mo10902a(), aVar);
        }
    }

    /* renamed from: j */
    public final void mo10836j(Class cls, Class cls2, C6095c cVar) {
        C6096d dVar = this.f6874f;
        synchronized (dVar) {
            dVar.f19357a.add(new C6096d.C6097a(cls, cls2, cVar));
        }
    }

    public static class NoModelLoaderAvailableException extends MissingComponentException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public NoModelLoaderAvailableException(java.lang.Object r2) {
            /*
                r1 = this;
                java.lang.String r0 = "Failed to find any ModelLoaders registered for model class: "
                java.lang.StringBuilder r0 = p379.C13555b.m33972k(r0)
                java.lang.Class r2 = r2.getClass()
                r0.append(r2)
                java.lang.String r2 = r0.toString()
                r1.<init>(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.Registry.NoModelLoaderAvailableException.<init>(java.lang.Object):void");
        }

        public <M> NoModelLoaderAvailableException(M m, List<C5104n<M, ?>> list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + m);
        }

        public NoModelLoaderAvailableException(Class<?> cls, Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }
}
