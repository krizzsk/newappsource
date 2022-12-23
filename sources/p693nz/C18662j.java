package p693nz;

/* renamed from: nz.j */
public final class C18662j<K, V> implements C18651c<K, V> {

    /* renamed from: b */
    public final C18651c<K, V> f47535b;

    public C18662j(C18651c<K, V> cVar) {
        this.f47535b = cVar;
    }

    /* renamed from: a */
    public final synchronized void mo39744a(K k) {
        this.f47535b.mo39744a(k);
    }

    public final synchronized boolean clear() {
        return this.f47535b.clear();
    }

    public final synchronized V get(K k) {
        return this.f47535b.get(k);
    }

    public final void onLowMemory() {
        this.f47535b.onLowMemory();
    }

    public final synchronized boolean put(K k, V v) {
        return this.f47535b.put(k, v);
    }

    public final synchronized boolean remove(K k) {
        return this.f47535b.remove(k);
    }
}
