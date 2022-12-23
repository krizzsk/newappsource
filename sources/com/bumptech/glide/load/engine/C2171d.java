package com.bumptech.glide.load.engine;

import com.bumptech.glide.C2125f;
import com.bumptech.glide.Priority;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.engine.DecodeJob;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import p025b6.C1486a;
import p025b6.C1487b;
import p025b6.C1492e;
import p025b6.C1495h;
import p060d6.C4384e;
import p060d6.C4385f;
import p060d6.C4394j;
import p108h6.C5104n;
import p108h6.C5107p;
import p133j6.C5387b;
import p208p6.C6095c;
import p208p6.C6096d;
import p241s0.C6302b;
import p247s6.C6475a;
import p247s6.C6477b;
import p247s6.C6478c;
import p247s6.C6479d;
import p311x6.C7175k;
import p584jl.C17885a;

/* renamed from: com.bumptech.glide.load.engine.d */
public final class C2171d<Transcode> {

    /* renamed from: a */
    public final ArrayList f7042a = new ArrayList();

    /* renamed from: b */
    public final ArrayList f7043b = new ArrayList();

    /* renamed from: c */
    public C2125f f7044c;

    /* renamed from: d */
    public Object f7045d;

    /* renamed from: e */
    public int f7046e;

    /* renamed from: f */
    public int f7047f;

    /* renamed from: g */
    public Class<?> f7048g;

    /* renamed from: h */
    public DecodeJob.C2163e f7049h;

    /* renamed from: i */
    public C1492e f7050i;

    /* renamed from: j */
    public Map<Class<?>, C1495h<?>> f7051j;

    /* renamed from: k */
    public Class<Transcode> f7052k;

    /* renamed from: l */
    public boolean f7053l;

    /* renamed from: m */
    public boolean f7054m;

    /* renamed from: n */
    public C1487b f7055n;

    /* renamed from: o */
    public Priority f7056o;

    /* renamed from: p */
    public C4385f f7057p;

    /* renamed from: q */
    public boolean f7058q;

    /* renamed from: r */
    public boolean f7059r;

    /* renamed from: a */
    public final ArrayList mo10955a() {
        if (!this.f7054m) {
            this.f7054m = true;
            this.f7043b.clear();
            ArrayList b = mo10956b();
            int size = b.size();
            for (int i = 0; i < size; i++) {
                C5104n.C5105a aVar = (C5104n.C5105a) b.get(i);
                if (!this.f7043b.contains(aVar.f17104a)) {
                    this.f7043b.add(aVar.f17104a);
                }
                for (int i2 = 0; i2 < aVar.f17105b.size(); i2++) {
                    if (!this.f7043b.contains(aVar.f17105b.get(i2))) {
                        this.f7043b.add(aVar.f17105b.get(i2));
                    }
                }
            }
        }
        return this.f7043b;
    }

    /* renamed from: b */
    public final ArrayList mo10956b() {
        if (!this.f7053l) {
            this.f7053l = true;
            this.f7042a.clear();
            List e = this.f7044c.f6909b.mo10831e(this.f7045d);
            int size = e.size();
            for (int i = 0; i < size; i++) {
                C5104n.C5105a b = ((C5104n) e.get(i)).mo20816b(this.f7045d, this.f7046e, this.f7047f, this.f7050i);
                if (b != null) {
                    this.f7042a.add(b);
                }
            }
        }
        return this.f7042a;
    }

    /* renamed from: c */
    public final <Data> C4394j<Data, ?, Transcode> mo10957c(Class<Data> cls) {
        C4394j<Data, ?, Transcode> orDefault;
        C4394j<Data, ?, Transcode> jVar;
        C4394j<?, ?, ?> jVar2;
        ArrayList arrayList;
        boolean z;
        C6095c cVar;
        boolean z2;
        Class<Data> cls2 = cls;
        Registry registry = this.f7044c.f6909b;
        Class<?> cls3 = this.f7048g;
        Class<Transcode> cls4 = this.f7052k;
        C6477b bVar = registry.f6877i;
        C7175k andSet = bVar.f20213b.getAndSet((Object) null);
        if (andSet == null) {
            andSet = new C7175k();
        }
        andSet.f22262a = cls2;
        andSet.f22263b = cls3;
        andSet.f22264c = cls4;
        synchronized (bVar.f20212a) {
            orDefault = bVar.f20212a.getOrDefault(andSet, null);
        }
        bVar.f20213b.set(andSet);
        registry.f6877i.getClass();
        if (C6477b.f20211c.equals(orDefault)) {
            return null;
        }
        if (orDefault != null) {
            return orDefault;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = registry.f6871c.mo22589b(cls2, cls3).iterator();
        while (it.hasNext()) {
            Class cls5 = (Class) it.next();
            Iterator it2 = registry.f6874f.mo22065a(cls5, cls4).iterator();
            while (true) {
                if (it2.hasNext()) {
                    Class cls6 = (Class) it2.next();
                    C6479d dVar = registry.f6871c;
                    synchronized (dVar) {
                        arrayList = new ArrayList();
                        Iterator it3 = dVar.f20216a.iterator();
                        while (it3.hasNext()) {
                            List<C6479d.C6480a> list = (List) dVar.f20217b.get((String) it3.next());
                            if (list != null) {
                                for (C6479d.C6480a aVar : list) {
                                    if (!aVar.f20218a.isAssignableFrom(cls2) || !cls5.isAssignableFrom(aVar.f20219b)) {
                                        z2 = false;
                                    } else {
                                        z2 = true;
                                    }
                                    if (z2) {
                                        arrayList.add(aVar.f20220c);
                                    }
                                }
                            }
                        }
                    }
                    C6096d dVar2 = registry.f6874f;
                    synchronized (dVar2) {
                        if (cls6.isAssignableFrom(cls5)) {
                            cVar = C17885a.f45886h;
                        } else {
                            Iterator it4 = dVar2.f19357a.iterator();
                            while (it4.hasNext()) {
                                C6096d.C6097a aVar2 = (C6096d.C6097a) it4.next();
                                if (!aVar2.f19358a.isAssignableFrom(cls5) || !cls6.isAssignableFrom(aVar2.f19359b)) {
                                    z = false;
                                    continue;
                                } else {
                                    z = true;
                                    continue;
                                }
                                if (z) {
                                    cVar = aVar2.f19360c;
                                }
                            }
                            throw new IllegalArgumentException("No transcoder registered to transcode from " + cls5 + " to " + cls6);
                        }
                    }
                    C6095c cVar2 = cVar;
                    C4384e eVar = r2;
                    C4384e eVar2 = new C4384e(cls, cls5, cls6, arrayList, cVar2, registry.f6878j);
                    arrayList2.add(eVar);
                }
            }
        }
        if (arrayList2.isEmpty()) {
            jVar = null;
        } else {
            jVar = new C4394j<>(cls, cls3, cls4, arrayList2, registry.f6878j);
        }
        C6477b bVar2 = registry.f6877i;
        synchronized (bVar2.f20212a) {
            C6302b<C7175k, C4394j<?, ?, ?>> bVar3 = bVar2.f20212a;
            C7175k kVar = new C7175k(cls2, cls3, cls4);
            if (jVar != null) {
                jVar2 = jVar;
            } else {
                jVar2 = C6477b.f20211c;
            }
            bVar3.put(kVar, jVar2);
        }
        return jVar;
    }

    /* renamed from: d */
    public final List<Class<?>> mo10958d() {
        List<Class<?>> list;
        ArrayList d;
        Registry registry = this.f7044c.f6909b;
        Class<?> cls = this.f7045d.getClass();
        Class<?> cls2 = this.f7048g;
        Class<Transcode> cls3 = this.f7052k;
        C6478c cVar = registry.f6876h;
        C7175k kVar = (C7175k) ((AtomicReference) cVar.f20214a).getAndSet((Object) null);
        if (kVar == null) {
            kVar = new C7175k(cls, cls2, cls3);
        } else {
            kVar.f22262a = cls;
            kVar.f22263b = cls2;
            kVar.f22264c = cls3;
        }
        synchronized (((C6302b) cVar.f20215b)) {
            list = (List) ((C6302b) cVar.f20215b).getOrDefault(kVar, null);
        }
        ((AtomicReference) cVar.f20214a).set(kVar);
        ArrayList arrayList = list;
        if (list == null) {
            ArrayList arrayList2 = new ArrayList();
            C5107p pVar = registry.f6869a;
            synchronized (pVar) {
                d = pVar.f17107a.mo20846d(cls);
            }
            Iterator it = d.iterator();
            while (it.hasNext()) {
                Iterator it2 = registry.f6871c.mo22589b((Class) it.next(), cls2).iterator();
                while (it2.hasNext()) {
                    Class cls4 = (Class) it2.next();
                    if (!registry.f6874f.mo22065a(cls4, cls3).isEmpty() && !arrayList2.contains(cls4)) {
                        arrayList2.add(cls4);
                    }
                }
            }
            C6478c cVar2 = registry.f6876h;
            List unmodifiableList = Collections.unmodifiableList(arrayList2);
            synchronized (((C6302b) cVar2.f20215b)) {
                ((C6302b) cVar2.f20215b).put(new C7175k(cls, cls2, cls3), unmodifiableList);
            }
            arrayList = arrayList2;
        }
        return arrayList;
    }

    /* renamed from: e */
    public final <X> C1486a<X> mo10959e(X x) throws Registry.NoSourceEncoderAvailableException {
        C1486a<T> aVar;
        C6475a aVar2 = this.f7044c.f6909b.f6870b;
        Class<?> cls = x.getClass();
        synchronized (aVar2) {
            Iterator it = aVar2.f20208a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    aVar = null;
                    break;
                }
                C6475a.C6476a aVar3 = (C6475a.C6476a) it.next();
                if (aVar3.f20209a.isAssignableFrom(cls)) {
                    aVar = aVar3.f20210b;
                    break;
                }
            }
        }
        if (aVar != null) {
            return aVar;
        }
        throw new Registry.NoSourceEncoderAvailableException(x.getClass());
    }

    /* renamed from: f */
    public final <Z> C1495h<Z> mo10960f(Class<Z> cls) {
        C1495h<Z> hVar = this.f7051j.get(cls);
        if (hVar == null) {
            Iterator<Map.Entry<Class<?>, C1495h<?>>> it = this.f7051j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry next = it.next();
                if (((Class) next.getKey()).isAssignableFrom(cls)) {
                    hVar = (C1495h) next.getValue();
                    break;
                }
            }
        }
        if (hVar != null) {
            return hVar;
        }
        if (!this.f7051j.isEmpty() || !this.f7058q) {
            return C5387b.f17707b;
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }
}
