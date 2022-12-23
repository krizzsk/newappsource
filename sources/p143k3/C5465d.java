package p143k3;

import android.content.Context;
import java.util.Collection;
import p081f3.C4656h;
import p155l3.C5556a;
import p155l3.C5557b;
import p155l3.C5558c;
import p155l3.C5560d;
import p155l3.C5561e;
import p155l3.C5562f;
import p155l3.C5563g;
import p155l3.C5564h;
import p167m3.C5671d;
import p218q3.C6165a;

/* renamed from: k3.d */
public final class C5465d implements C5558c.C5559a {

    /* renamed from: d */
    public static final /* synthetic */ int f17988d = 0;

    /* renamed from: a */
    public final C5464c f17989a;

    /* renamed from: b */
    public final C5558c<?>[] f17990b;

    /* renamed from: c */
    public final Object f17991c = new Object();

    static {
        C4656h.m11961e("WorkConstraintsTracker");
    }

    public C5465d(Context context, C6165a aVar, C5464c cVar) {
        Context applicationContext = context.getApplicationContext();
        this.f17989a = cVar;
        this.f17990b = new C5558c[]{new C5556a(applicationContext, aVar), new C5557b(applicationContext, aVar), new C5564h(applicationContext, aVar), new C5560d(applicationContext, aVar), new C5563g(applicationContext, aVar), new C5562f(applicationContext, aVar), new C5561e(applicationContext, aVar)};
    }

    /* renamed from: a */
    public final boolean mo21353a(String str) {
        boolean z;
        synchronized (this.f17991c) {
            for (C5558c<?> cVar : this.f17990b) {
                T t = cVar.f18185b;
                if (t == null || !cVar.mo21397c(t) || !cVar.f18184a.contains(str)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    C4656h c = C4656h.m11960c();
                    String.format("Work %s constrained by %s", new Object[]{str, cVar.getClass().getSimpleName()});
                    c.mo20176a(new Throwable[0]);
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: b */
    public final void mo21354b(Collection collection) {
        synchronized (this.f17991c) {
            for (C5558c<?> cVar : this.f17990b) {
                if (cVar.f18187d != null) {
                    cVar.f18187d = null;
                    cVar.mo21399e((C5558c.C5559a) null, cVar.f18185b);
                }
            }
            for (C5558c<?> d : this.f17990b) {
                d.mo21398d(collection);
            }
            for (C5558c<?> cVar2 : this.f17990b) {
                if (cVar2.f18187d != this) {
                    cVar2.f18187d = this;
                    cVar2.mo21399e(this, cVar2.f18185b);
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo21355c() {
        synchronized (this.f17991c) {
            for (C5558c<?> cVar : this.f17990b) {
                if (!cVar.f18184a.isEmpty()) {
                    cVar.f18184a.clear();
                    C5671d<T> dVar = cVar.f18186c;
                    synchronized (dVar.f18441c) {
                        if (dVar.f18442d.remove(cVar) && dVar.f18442d.isEmpty()) {
                            dVar.mo21518d();
                        }
                    }
                }
            }
        }
    }
}
