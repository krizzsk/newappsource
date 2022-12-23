package p359ag;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: ag.d */
public final class C13447d extends C13450g implements Iterable<C13450g> {

    /* renamed from: b */
    public final ArrayList f33304b;

    public C13447d() {
        this.f33304b = new ArrayList();
    }

    /* renamed from: B */
    public final String mo40326B() {
        if (this.f33304b.size() == 1) {
            return ((C13450g) this.f33304b.get(0)).mo40326B();
        }
        throw new IllegalStateException();
    }

    /* renamed from: C */
    public final void mo40327C(C13450g gVar) {
        if (gVar == null) {
            gVar = C13451h.f33305b;
        }
        this.f33304b.add(gVar);
    }

    /* renamed from: D */
    public final void mo40328D(String str) {
        this.f33304b.add(str == null ? C13451h.f33305b : new C13454k(str));
    }

    /* renamed from: E */
    public final C13450g mo40329E(int i) {
        return (C13450g) this.f33304b.get(i);
    }

    /* renamed from: e */
    public final C13450g mo40330e() {
        if (this.f33304b.isEmpty()) {
            return new C13447d();
        }
        C13447d dVar = new C13447d(this.f33304b.size());
        Iterator it = this.f33304b.iterator();
        while (it.hasNext()) {
            dVar.mo40327C(((C13450g) it.next()).mo40330e());
        }
        return dVar;
    }

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof C13447d) && ((C13447d) obj).f33304b.equals(this.f33304b));
    }

    public final int hashCode() {
        return this.f33304b.hashCode();
    }

    /* renamed from: i */
    public final boolean mo40333i() {
        if (this.f33304b.size() == 1) {
            return ((C13450g) this.f33304b.get(0)).mo40333i();
        }
        throw new IllegalStateException();
    }

    public final Iterator<C13450g> iterator() {
        return this.f33304b.iterator();
    }

    /* renamed from: m */
    public final double mo40335m() {
        if (this.f33304b.size() == 1) {
            return ((C13450g) this.f33304b.get(0)).mo40335m();
        }
        throw new IllegalStateException();
    }

    /* renamed from: n */
    public final float mo40336n() {
        if (this.f33304b.size() == 1) {
            return ((C13450g) this.f33304b.get(0)).mo40336n();
        }
        throw new IllegalStateException();
    }

    /* renamed from: p */
    public final int mo40337p() {
        if (this.f33304b.size() == 1) {
            return ((C13450g) this.f33304b.get(0)).mo40337p();
        }
        throw new IllegalStateException();
    }

    public final int size() {
        return this.f33304b.size();
    }

    /* renamed from: z */
    public final long mo40339z() {
        if (this.f33304b.size() == 1) {
            return ((C13450g) this.f33304b.get(0)).mo40339z();
        }
        throw new IllegalStateException();
    }

    public C13447d(int i) {
        this.f33304b = new ArrayList(i);
    }
}
