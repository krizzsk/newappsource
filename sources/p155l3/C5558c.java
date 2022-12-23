package p155l3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import p081f3.C4656h;
import p143k3.C5462a;
import p143k3.C5464c;
import p143k3.C5465d;
import p167m3.C5671d;
import p192o3.C5956p;

/* renamed from: l3.c */
public abstract class C5558c<T> implements C5462a<T> {

    /* renamed from: a */
    public final ArrayList f18184a = new ArrayList();

    /* renamed from: b */
    public T f18185b;

    /* renamed from: c */
    public C5671d<T> f18186c;

    /* renamed from: d */
    public C5559a f18187d;

    /* renamed from: l3.c$a */
    public interface C5559a {
    }

    public C5558c(C5671d<T> dVar) {
        this.f18186c = dVar;
    }

    /* renamed from: a */
    public final void mo21349a(T t) {
        this.f18185b = t;
        mo21399e(this.f18187d, t);
    }

    /* renamed from: b */
    public abstract boolean mo21396b(C5956p pVar);

    /* renamed from: c */
    public abstract boolean mo21397c(T t);

    /* renamed from: d */
    public final void mo21398d(Collection collection) {
        this.f18184a.clear();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C5956p pVar = (C5956p) it.next();
            if (mo21396b(pVar)) {
                this.f18184a.add(pVar.f19082a);
            }
        }
        if (this.f18184a.isEmpty()) {
            C5671d<T> dVar = this.f18186c;
            synchronized (dVar.f18441c) {
                if (dVar.f18442d.remove(this) && dVar.f18442d.isEmpty()) {
                    dVar.mo21518d();
                }
            }
        } else {
            C5671d<T> dVar2 = this.f18186c;
            synchronized (dVar2.f18441c) {
                if (dVar2.f18442d.add(this)) {
                    if (dVar2.f18442d.size() == 1) {
                        dVar2.f18443e = dVar2.mo21514a();
                        C4656h c = C4656h.m11960c();
                        int i = C5671d.f18438f;
                        String.format("%s: initial state = %s", new Object[]{dVar2.getClass().getSimpleName(), dVar2.f18443e});
                        c.mo20176a(new Throwable[0]);
                        dVar2.mo21517c();
                    }
                    mo21349a(dVar2.f18443e);
                }
            }
        }
        mo21399e(this.f18187d, this.f18185b);
    }

    /* renamed from: e */
    public final void mo21399e(C5559a aVar, T t) {
        if (!this.f18184a.isEmpty() && aVar != null) {
            if (t == null || mo21397c(t)) {
                ArrayList arrayList = this.f18184a;
                C5465d dVar = (C5465d) aVar;
                synchronized (dVar.f17991c) {
                    C5464c cVar = dVar.f17989a;
                    if (cVar != null) {
                        cVar.mo5714c(arrayList);
                    }
                }
                return;
            }
            ArrayList arrayList2 = this.f18184a;
            C5465d dVar2 = (C5465d) aVar;
            synchronized (dVar2.f17991c) {
                ArrayList arrayList3 = new ArrayList();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (dVar2.mo21353a(str)) {
                        C4656h c = C4656h.m11960c();
                        int i = C5465d.f17988d;
                        String.format("Constraints met for %s", new Object[]{str});
                        c.mo20176a(new Throwable[0]);
                        arrayList3.add(str);
                    }
                }
                C5464c cVar2 = dVar2.f17989a;
                if (cVar2 != null) {
                    cVar2.mo5716f(arrayList3);
                }
            }
        }
    }
}
