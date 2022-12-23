package za0;

import com.nutiteq.components.Envelope;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import na0.C12925d;
import oa0.C12964d;
import oa0.C12974i;
import qa0.C13043a;
import va0.C13196e;
import ya0.C13285i;

/* renamed from: za0.c */
public final class C13356c extends C13354a<C12964d> {

    /* renamed from: h */
    public HashSet f33140h = new HashSet();

    /* renamed from: za0.c$a */
    public class C13357a implements C13196e {

        /* renamed from: b */
        public final Envelope f33141b;

        /* renamed from: c */
        public final int f33142c;

        public C13357a(Envelope envelope, int i) {
            this.f33141b = envelope;
            this.f33142c = i;
        }

        /* renamed from: H */
        public final void mo40071H() {
        }

        public final void cancel() {
        }

        /* JADX INFO: finally extract failed */
        public final void run() {
            C13356c.this.f33148e.lock();
            try {
                ArrayList f = C13356c.this.f33147d.mo40152f(this.f33141b);
                f.addAll(C13356c.this.f33140h);
                C13356c.this.f33148e.unlock();
                Iterator it = f.iterator();
                while (it.hasNext()) {
                    ((C12964d) it.next()).mo39848d(this.f33142c);
                }
                C13356c.this.mo40243h(f);
            } catch (Throwable th) {
                C13356c.this.f33148e.unlock();
                throw th;
            }
        }
    }

    public C13356c(C13043a aVar) {
        super(aVar);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public final void mo40235b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C12964d dVar = (C12964d) it.next();
            C13361f<?> fVar = dVar.f32123c;
            if (this != fVar) {
                if (fVar == null) {
                    dVar.f32123c = this;
                    dVar.mo39846b();
                } else {
                    throw new UnsupportedOperationException();
                }
            }
            dVar.mo39848d(mo40242f());
        }
        this.f33148e.lock();
        try {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C12964d dVar2 = (C12964d) it2.next();
                dVar2.getClass();
                this.f33147d.mo40151d(((C12964d.C12965a) dVar2.f32125e).f32129c, dVar2);
            }
            this.f33148e.unlock();
            mo40244i();
        } catch (Throwable th) {
            this.f33148e.unlock();
            throw th;
        }
    }

    /* renamed from: c */
    public final void mo40236c(Envelope envelope, int i) {
        C13357a aVar = new C13357a(envelope, i);
        C12925d dVar = this.f32172c;
        if (dVar != null) {
            dVar.f32008f.mo40066c(aVar, 0, this);
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: d */
    public final void mo40237d() {
        this.f33148e.lock();
        try {
            C13285i<T> iVar = this.f33147d;
            iVar.getClass();
            ArrayList arrayList = new ArrayList();
            C13285i.m33418a(iVar.f32964a, arrayList);
            arrayList.addAll(this.f33140h);
            this.f33147d.f32964a = null;
            this.f33140h.clear();
            this.f33148e.unlock();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C12964d dVar = (C12964d) it.next();
                if (dVar.f32125e != null) {
                    dVar.f32125e.f32128b = null;
                }
                dVar.f32123c = null;
            }
            mo40244i();
        } catch (Throwable th) {
            this.f33148e.unlock();
            throw th;
        }
    }

    /* renamed from: e */
    public final void mo40238e(C12974i iVar) {
        ((C12964d) iVar).getClass();
        super.mo40238e(iVar);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: g */
    public final void mo40239g(List list) {
        this.f33148e.lock();
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C12964d dVar = (C12964d) it.next();
                dVar.getClass();
                if (((C12964d.C12965a) dVar.f32125e) != null) {
                    C13285i<T> iVar = this.f33147d;
                    iVar.f32964a = C13285i.m33423h(iVar.f32964a, ((C12964d.C12965a) dVar.f32125e).f32129c, dVar);
                }
            }
            this.f33148e.unlock();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C12964d dVar2 = (C12964d) it2.next();
                if (dVar2.f32125e != null) {
                    dVar2.f32125e.f32128b = null;
                }
                dVar2.f32123c = null;
            }
            mo40244i();
        } catch (Throwable th) {
            this.f33148e.unlock();
            throw th;
        }
    }
}
