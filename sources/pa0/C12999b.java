package pa0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import na0.C12925d;
import oa0.C12974i;
import qa0.C13043a;
import ra0.C13054a;
import za0.C13361f;

/* renamed from: pa0.b */
public final class C12999b {

    /* renamed from: g */
    public static final C13043a f32173g = new C13043a();

    /* renamed from: a */
    public final ReentrantLock f32174a = new ReentrantLock();

    /* renamed from: b */
    public final LinkedList f32175b = new LinkedList();

    /* renamed from: c */
    public volatile List<C12998a> f32176c;

    /* renamed from: d */
    public volatile List<C13054a> f32177d;

    /* renamed from: e */
    public volatile List<C13361f<C12974i>> f32178e;

    /* renamed from: f */
    public final C12925d f32179f;

    public C12999b(C12925d dVar) {
        this.f32179f = dVar;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final void mo39884a(int i, C12998a aVar) {
        C12925d dVar = this.f32179f;
        synchronized (aVar) {
            aVar.f32172c = dVar;
        }
        this.f32174a.lock();
        try {
            this.f32175b.add(i, aVar);
            this.f32176c = null;
            this.f32177d = null;
            this.f32178e = null;
            this.f32174a.unlock();
            this.f32179f.f32012j.mo39974k(aVar);
        } catch (Throwable th) {
            this.f32174a.unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public final void mo39885b(C12998a aVar) {
        C12925d dVar = this.f32179f;
        synchronized (aVar) {
            aVar.f32172c = dVar;
        }
        this.f32174a.lock();
        try {
            this.f32175b.add(aVar);
            this.f32176c = null;
            this.f32177d = null;
            this.f32178e = null;
            this.f32174a.unlock();
            this.f32179f.f32012j.mo39974k(aVar);
        } catch (Throwable th) {
            this.f32174a.unlock();
            throw th;
        }
    }

    /* renamed from: c */
    public final List<C12998a> mo39886c() {
        this.f32174a.lock();
        try {
            if (this.f32176c == null) {
                mo39889f();
            }
            return this.f32176c;
        } finally {
            this.f32174a.unlock();
        }
    }

    /* renamed from: d */
    public final C13043a mo39887d() {
        C13043a aVar = f32173g;
        this.f32174a.lock();
        this.f32174a.unlock();
        return aVar;
    }

    /* renamed from: e */
    public final List<C13054a> mo39888e() {
        this.f32174a.lock();
        try {
            if (this.f32177d == null) {
                mo39889f();
            }
            return this.f32177d;
        } finally {
            this.f32174a.unlock();
        }
    }

    /* renamed from: f */
    public final void mo39889f() {
        ArrayList arrayList = new ArrayList(this.f32175b.size() + 1);
        ArrayList arrayList2 = new ArrayList(this.f32175b.size() + 1);
        ArrayList arrayList3 = new ArrayList(this.f32175b.size() + 1);
        for (C12998a aVar : this.f32175b) {
            arrayList.add(aVar);
            if (aVar instanceof C13054a) {
                arrayList3.add((C13054a) aVar);
            }
            if (aVar instanceof C13361f) {
                arrayList2.add((C13361f) aVar);
            }
        }
        this.f32176c = Collections.unmodifiableList(arrayList);
        this.f32177d = Collections.unmodifiableList(arrayList3);
        this.f32178e = Collections.unmodifiableList(arrayList2);
    }

    /* renamed from: g */
    public final void mo39890g(C12998a aVar) {
        this.f32174a.lock();
        try {
            this.f32175b.remove(aVar);
            this.f32176c = null;
            this.f32177d = null;
            this.f32178e = null;
            if (aVar != null && !this.f32175b.contains(aVar)) {
                synchronized (aVar) {
                    aVar.f32172c = null;
                }
            }
            this.f32179f.f32012j.mo39976m();
        } finally {
            this.f32174a.unlock();
        }
    }
}
