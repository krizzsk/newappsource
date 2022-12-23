package p693nz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: nz.i */
public final class C18661i<K, V> implements C18651c<K, V> {

    /* renamed from: b */
    public final ArrayList<C18651c<K, V>> f47534b;

    @SafeVarargs
    public C18661i(C18651c<K, V>... cVarArr) {
        ArrayList<C18651c<K, V>> arrayList = new ArrayList<>(cVarArr.length);
        this.f47534b = arrayList;
        Collections.addAll(arrayList, cVarArr);
    }

    /* renamed from: a */
    public final void mo39744a(K k) {
        Iterator<C18651c<K, V>> it = this.f47534b.iterator();
        while (it.hasNext()) {
            it.next().mo39744a(k);
        }
    }

    public final boolean clear() {
        Iterator<C18651c<K, V>> it = this.f47534b.iterator();
        boolean z = true;
        while (it.hasNext()) {
            z &= it.next().clear();
        }
        return z;
    }

    public final V get(K k) {
        int size = this.f47534b.size();
        V v = null;
        int i = 0;
        while (i < size) {
            v = this.f47534b.get(i).get(k);
            if (v != null) {
                break;
            }
            i++;
        }
        while (true) {
            i++;
            if (i >= size) {
                return v;
            }
            this.f47534b.get(i).mo39744a(k);
        }
    }

    public final void onLowMemory() {
        Iterator<C18651c<K, V>> it = this.f47534b.iterator();
        while (it.hasNext()) {
            it.next().onLowMemory();
        }
    }

    public final boolean put(K k, V v) {
        Iterator<C18651c<K, V>> it = this.f47534b.iterator();
        boolean z = true;
        while (it.hasNext()) {
            z &= it.next().put(k, v);
        }
        return z;
    }

    public final boolean remove(K k) {
        Iterator<C18651c<K, V>> it = this.f47534b.iterator();
        boolean z = true;
        while (it.hasNext()) {
            z &= it.next().remove(k);
        }
        return z;
    }
}
