package p810sz;

import ce0.C21100e;
import java.io.IOException;
import java.util.Map;

/* renamed from: sz.h */
public final class C19583h<K, V> implements C19600l<Map<K, V>> {

    /* renamed from: u */
    public final C19600l<K> f49767u;

    /* renamed from: v */
    public final C19600l<V> f49768v;

    public C19583h(C19600l<K> lVar, C19600l<V> lVar2) {
        C21100e.m49373x(lVar, "keyWriter");
        this.f49767u = lVar;
        this.f49768v = lVar2;
    }

    public final void write(Object obj, C19616q qVar) throws IOException {
        qVar.mo51966o((Map) obj, this.f49767u, this.f49768v);
    }
}
