package s20;

import ce0.C21100e;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.VisibleRegion;
import com.moovit.map.C16273d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import o20.C18696b;
import o20.C18706l;
import s20.C19417l;
import s20.C19418m;

/* renamed from: s20.f */
public abstract class C19406f<GO extends C19418m<GO, O, MEZS, T, ?, GT>, O, MEZS extends C16273d, T extends C18706l<?, MEZS>, GT extends C19417l<T, O, MEZS>> implements C18696b<T> {

    /* renamed from: a */
    public final GO f49360a;

    /* renamed from: b */
    public final Class<GT> f49361b;

    /* renamed from: c */
    public final Set<GT> f49362c = Collections.newSetFromMap(new IdentityHashMap());

    /* renamed from: d */
    public final int f49363d;

    /* renamed from: e */
    public boolean f49364e = true;

    /* renamed from: f */
    public VisibleRegion f49365f = null;

    /* renamed from: g */
    public float f49366g;

    public C19406f(GO go, Class<GT> cls, int i) {
        C21100e.m49373x(go, "owner");
        this.f49360a = go;
        this.f49361b = cls;
        this.f49363d = i;
    }

    /* renamed from: a */
    public final <SO> void mo51062a(Class<? extends SO> cls, Collection<? super SO> collection) {
        for (GT gt : this.f49362c) {
            if (gt.f49423b != null) {
                Object obj = gt.f49422a.f47612a;
                if (cls.isInstance(obj)) {
                    collection.add(cls.cast(obj));
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo51063b(List list) {
        for (Object remove : list) {
            remove(remove);
        }
    }

    /* renamed from: c */
    public final void mo51064c(Object obj) {
        mo51816k(mo51817l(obj));
    }

    public final void clear() {
        for (GT k : this.f49362c) {
            mo51816k(k);
        }
        this.f49362c.clear();
    }

    /* renamed from: d */
    public final Object mo51066d(T t) {
        C19417l i = mo51812i(t);
        this.f49362c.add(i);
        if (this.f49364e) {
            mo51815h(i);
        }
        return i;
    }

    /* renamed from: f */
    public final ArrayList mo51067f(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mo51066d((C18706l) it.next());
        }
        return null;
    }

    /* renamed from: h */
    public final void mo51815h(GT gt) {
        GO go = this.f49360a;
        C19405e eVar = new C19405e(this, gt);
        go.getClass();
        C21100e.m49369v(1);
        GoogleMap googleMap = go.f49427c;
        if (googleMap != null) {
            eVar.onMapReady(googleMap);
        } else {
            go.f49425a.add(eVar);
        }
    }

    /* renamed from: i */
    public abstract GT mo51812i(T t);

    public final boolean isVisible() {
        return this.f49364e;
    }

    /* renamed from: j */
    public boolean mo51813j(VisibleRegion visibleRegion, GT gt) {
        return true;
    }

    /* renamed from: k */
    public final void mo51816k(GT gt) {
        O o = gt.f49423b;
        if (o != null) {
            GO go = this.f49360a;
            go.mo51810e(o);
            go.mo51811g(o, null);
            gt.f49424c = null;
            gt.f49423b = null;
        }
    }

    /* renamed from: l */
    public final GT mo51817l(Object obj) {
        if (this.f49361b.isInstance(obj)) {
            return (C19417l) this.f49361b.cast(obj);
        }
        throw new IllegalArgumentException("Invalid removal token: " + obj);
    }

    public final void remove(Object obj) {
        C19417l l = mo51817l(obj);
        this.f49362c.remove(l);
        mo51816k(l);
    }

    public final void setVisible(boolean z) {
        if (this.f49364e != z) {
            this.f49364e = z;
            if (z) {
                for (GT h : this.f49362c) {
                    mo51815h(h);
                }
                return;
            }
            clear();
        }
    }
}
