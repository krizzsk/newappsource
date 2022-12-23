package e00;

import p241s0.C6302b;

/* renamed from: e00.a */
public final class C16760a<K, V> extends C16761b<K, V> {

    /* renamed from: c */
    public V f43630c;

    public C16760a(C6302b bVar, Object obj) {
        super(bVar);
        this.f43630c = obj;
    }

    public final V get(Object obj) {
        V v = super.get(obj);
        if (v == null) {
            return this.f43630c;
        }
        return v;
    }
}
