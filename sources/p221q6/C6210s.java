package p221q6;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import p273u6.C6720j;
import p311x6.C7176l;

/* renamed from: q6.s */
public final class C6210s implements C6190j {

    /* renamed from: b */
    public final Set<C6720j<?>> f19625b = Collections.newSetFromMap(new WeakHashMap());

    public final void onDestroy() {
        Iterator it = C7176l.m16785e(this.f19625b).iterator();
        while (it.hasNext()) {
            ((C6720j) it.next()).onDestroy();
        }
    }

    public final void onStart() {
        Iterator it = C7176l.m16785e(this.f19625b).iterator();
        while (it.hasNext()) {
            ((C6720j) it.next()).onStart();
        }
    }

    public final void onStop() {
        Iterator it = C7176l.m16785e(this.f19625b).iterator();
        while (it.hasNext()) {
            ((C6720j) it.next()).onStop();
        }
    }
}
