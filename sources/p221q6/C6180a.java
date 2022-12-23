package p221q6;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import p311x6.C7176l;

/* renamed from: q6.a */
public final class C6180a implements C6189i {

    /* renamed from: b */
    public final Set<C6190j> f19573b = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: c */
    public boolean f19574c;

    /* renamed from: d */
    public boolean f19575d;

    /* renamed from: a */
    public final void mo22163a() {
        this.f19575d = true;
        Iterator it = C7176l.m16785e(this.f19573b).iterator();
        while (it.hasNext()) {
            ((C6190j) it.next()).onDestroy();
        }
    }

    /* renamed from: b */
    public final void mo22164b() {
        this.f19574c = true;
        Iterator it = C7176l.m16785e(this.f19573b).iterator();
        while (it.hasNext()) {
            ((C6190j) it.next()).onStart();
        }
    }

    /* renamed from: c */
    public final void mo22165c(C6190j jVar) {
        this.f19573b.add(jVar);
        if (this.f19575d) {
            jVar.onDestroy();
        } else if (this.f19574c) {
            jVar.onStart();
        } else {
            jVar.onStop();
        }
    }

    /* renamed from: d */
    public final void mo22166d(C6190j jVar) {
        this.f19573b.remove(jVar);
    }

    /* renamed from: e */
    public final void mo22167e() {
        this.f19574c = false;
        Iterator it = C7176l.m16785e(this.f19573b).iterator();
        while (it.hasNext()) {
            ((C6190j) it.next()).onStop();
        }
    }
}
