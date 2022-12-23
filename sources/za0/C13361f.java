package za0;

import com.nutiteq.components.Envelope;
import com.nutiteq.components.MapPos;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import na0.C12923b;
import na0.C12925d;
import oa0.C12974i;
import pa0.C12998a;
import qa0.C13043a;
import sa0.C13096e;
import va0.C13196e;
import ya0.C13275b;
import ya0.C13285i;

/* renamed from: za0.f */
public abstract class C13361f<T extends C12974i> extends C12998a {

    /* renamed from: d */
    public final C13285i<T> f33147d = new C13285i<>(50.0d);

    /* renamed from: e */
    public final ReentrantLock f33148e = new ReentrantLock();

    /* renamed from: f */
    public volatile ArrayList f33149f;

    /* renamed from: za0.f$a */
    public static class C13362a {

        /* renamed from: a */
        public final Envelope f33150a;

        /* renamed from: b */
        public final int f33151b;

        public C13362a(Envelope envelope, C12923b bVar) {
            this.f33150a = envelope;
            this.f33151b = (int) ((bVar.f31996i + 0.001f) * 100.0f);
        }
    }

    /* renamed from: za0.f$b */
    public class C13363b implements C13196e {

        /* renamed from: b */
        public final Envelope f33152b;

        /* renamed from: c */
        public final int f33153c;

        public C13363b(Envelope envelope, int i) {
            this.f33152b = envelope;
            this.f33153c = i;
        }

        /* renamed from: H */
        public final void mo40071H() {
        }

        public final void cancel() {
        }

        /* JADX INFO: finally extract failed */
        public final void run() {
            C13361f.this.f33148e.lock();
            try {
                ArrayList f = C13361f.this.f33147d.mo40152f(this.f33152b);
                C13361f.this.f33148e.unlock();
                Iterator it = f.iterator();
                while (it.hasNext()) {
                    ((C12974i) it.next()).mo39848d(this.f33153c);
                }
                C13361f.this.mo40243h(f);
            } catch (Throwable th) {
                C13361f.this.f33148e.unlock();
                throw th;
            }
        }
    }

    public C13361f(C13043a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public final void mo39883a(boolean z) {
        if (this.f32171b != z) {
            this.f32171b = z;
            mo40244i();
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public void mo40235b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C12974i iVar = (C12974i) it.next();
            C13361f<?> fVar = iVar.f32123c;
            if (this != fVar) {
                if (fVar == null) {
                    iVar.f32123c = this;
                    iVar.mo39846b();
                } else {
                    throw new UnsupportedOperationException();
                }
            }
            iVar.mo39848d(mo40242f());
        }
        this.f33148e.lock();
        try {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C12974i iVar2 = (C12974i) it2.next();
                this.f33147d.mo40151d(iVar2.mo39840c().f32129c, iVar2);
            }
            this.f33148e.unlock();
            mo40244i();
        } catch (Throwable th) {
            this.f33148e.unlock();
            throw th;
        }
    }

    /* renamed from: c */
    public void mo40236c(Envelope envelope, int i) {
        C13363b bVar = new C13363b(envelope, i);
        C12925d dVar = this.f32172c;
        if (dVar != null) {
            dVar.f32008f.mo40066c(bVar, 0, this);
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: d */
    public void mo40237d() {
        this.f33148e.lock();
        try {
            C13285i<T> iVar = this.f33147d;
            iVar.getClass();
            ArrayList arrayList = new ArrayList();
            C13285i.m33418a(iVar.f32964a, arrayList);
            this.f33147d.f32964a = null;
            this.f33148e.unlock();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C12974i iVar2 = (C12974i) it.next();
                if (iVar2.f32125e != null) {
                    iVar2.f32125e.f32128b = null;
                }
                iVar2.f32123c = null;
            }
            mo40244i();
        } catch (Throwable th) {
            this.f33148e.unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: e */
    public void mo40238e(C12974i iVar) {
        this.f33148e.lock();
        try {
            C13285i<T> iVar2 = this.f33147d;
            iVar2.f32964a = C13285i.m33423h(iVar2.f32964a, iVar.mo39840c().f32129c, iVar);
            iVar.mo39846b();
            this.f33147d.mo40151d(iVar.mo39840c().f32129c, iVar);
            this.f33148e.unlock();
            mo40244i();
        } catch (Throwable th) {
            this.f33148e.unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: f */
    public final int mo40242f() {
        C12925d dVar = this.f32172c;
        if (dVar == null) {
            return 0;
        }
        C13096e eVar = dVar.f32012j;
        eVar.mo39983q(true);
        try {
            float f = eVar.f32429Q;
            MapPos d = eVar.mo39967d();
            eVar.mo39983q(false);
            return (int) (((((float) Math.log(d.f24177d / ((double) f))) * 100.0f) / C13275b.f32934a) + 0.001f);
        } catch (Throwable th) {
            eVar.mo39983q(false);
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: g */
    public void mo40239g(List list) {
        this.f33148e.lock();
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C12974i iVar = (C12974i) it.next();
                C13285i<T> iVar2 = this.f33147d;
                iVar2.f32964a = C13285i.m33423h(iVar2.f32964a, iVar.mo39840c().f32129c, iVar);
            }
            this.f33148e.unlock();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C12974i iVar3 = (C12974i) it2.next();
                if (iVar3.f32125e != null) {
                    iVar3.f32125e.f32128b = null;
                }
                iVar3.f32123c = null;
            }
            mo40244i();
        } catch (Throwable th) {
            this.f33148e.unlock();
            throw th;
        }
    }

    /* renamed from: h */
    public final void mo40243h(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C12974i iVar = (C12974i) arrayList.get(i);
            if (iVar.mo39840c().f32128b != null) {
                arrayList2.add(iVar);
            }
        }
        this.f33149f = arrayList2;
        C12925d dVar = this.f32172c;
        if (dVar != null) {
            C13096e eVar = dVar.f32012j;
            if (eVar.f32452n0 != null) {
                eVar.f32458q0 = true;
            }
            if (this instanceof C13354a) {
                C13354a aVar = (C13354a) this;
                eVar.f32418I0.mo39956a(0);
            }
            eVar.mo39976m();
        }
    }

    /* renamed from: i */
    public final void mo40244i() {
        C12925d dVar = this.f32172c;
        if (dVar != null) {
            dVar.f32012j.mo39974k(this);
        }
    }
}
