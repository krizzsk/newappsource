package p221q6;

import f60.C16947a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import p260t6.C6598d;
import p311x6.C7176l;

/* renamed from: q6.o */
public final class C6198o {

    /* renamed from: a */
    public final /* synthetic */ int f19595a;

    /* renamed from: b */
    public boolean f19596b;

    /* renamed from: c */
    public final Object f19597c;

    /* renamed from: d */
    public final Collection f19598d;

    public C6198o() {
        this.f19595a = 0;
        this.f19597c = Collections.newSetFromMap(new WeakHashMap());
        this.f19598d = new HashSet();
    }

    /* renamed from: a */
    public final boolean mo22200a(C6598d dVar) {
        boolean z = true;
        if (dVar == null) {
            return true;
        }
        boolean remove = ((Set) this.f19597c).remove(dVar);
        if (!((Set) this.f19598d).remove(dVar) && !remove) {
            z = false;
        }
        if (z) {
            dVar.clear();
        }
        return z;
    }

    /* renamed from: b */
    public final void mo22201b() {
        Iterator it = C7176l.m16785e((Set) this.f19597c).iterator();
        while (it.hasNext()) {
            C6598d dVar = (C6598d) it.next();
            if (!dVar.mo11029e() && !dVar.mo11026c()) {
                dVar.clear();
                if (!this.f19596b) {
                    dVar.mo11035j();
                } else {
                    ((Set) this.f19598d).add(dVar);
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo22202c() {
        this.f19596b = false;
        Iterator it = C7176l.m16785e((Set) this.f19597c).iterator();
        while (it.hasNext()) {
            C6598d dVar = (C6598d) it.next();
            if (!dVar.mo11029e() && !dVar.isRunning()) {
                dVar.mo11035j();
            }
        }
        ((Set) this.f19598d).clear();
    }

    public final String toString() {
        switch (this.f19595a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append(super.toString());
                sb.append("{numRequests=");
                sb.append(((Set) this.f19597c).size());
                sb.append(", isPaused=");
                return C25541a.m63885p(sb, this.f19596b, "}");
            default:
                return super.toString();
        }
    }

    public C6198o(C16947a aVar, ArrayList arrayList, boolean z) {
        this.f19595a = 1;
        this.f19597c = aVar;
        this.f19598d = Collections.unmodifiableList(arrayList);
        this.f19596b = z;
    }
}
