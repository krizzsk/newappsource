package p693nz;

import p241s0.C6306f;

/* renamed from: nz.h */
public final class C18659h<K, V> implements C18651c<K, V> {

    /* renamed from: b */
    public final C18659h<K, V>.C25541a f47532b;

    /* renamed from: nz.h$a */
    public class C18660a extends C6306f<K, V> {
        public C18660a(int i) {
            super(i);
        }

        public final void entryRemoved(boolean z, K k, V v, V v2) {
            C18659h.this.getClass();
        }

        public final int sizeOf(K k, V v) {
            C18659h.this.getClass();
            return 1;
        }
    }

    public C18659h(int i) {
        this.f47532b = new C18660a(i);
    }

    /* renamed from: a */
    public final void mo39744a(K k) {
        synchronized (this.f47532b) {
            Object remove = this.f47532b.remove(k);
            if (remove != null) {
                this.f47532b.put(k, remove);
            }
        }
    }

    public final boolean clear() {
        this.f47532b.evictAll();
        return true;
    }

    public final V get(K k) {
        return this.f47532b.get(k);
    }

    public final void onLowMemory() {
        this.f47532b.trimToSize((int) -1);
    }

    public final boolean put(K k, V v) {
        this.f47532b.put(k, v);
        if (this.f47532b.size() >= 1) {
            return true;
        }
        return false;
    }

    public final boolean remove(K k) {
        this.f47532b.remove(k);
        return true;
    }
}
