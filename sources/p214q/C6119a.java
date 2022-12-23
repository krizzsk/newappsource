package p214q;

import java.util.HashMap;
import p214q.C6120b;

/* renamed from: q.a */
public final class C6119a<K, V> extends C6120b<K, V> {

    /* renamed from: f */
    public HashMap<K, C6120b.C6123c<K, V>> f19471f = new HashMap<>();

    /* renamed from: a */
    public final C6120b.C6123c<K, V> mo22079a(K k) {
        return this.f19471f.get(k);
    }

    /* renamed from: b */
    public final V mo22080b(K k, V v) {
        C6120b.C6123c a = mo22079a(k);
        if (a != null) {
            return a.f19477c;
        }
        HashMap<K, C6120b.C6123c<K, V>> hashMap = this.f19471f;
        C6120b.C6123c<K, V> cVar = new C6120b.C6123c<>(k, v);
        this.f19475e++;
        C6120b.C6123c<K, V> cVar2 = this.f19473c;
        if (cVar2 == null) {
            this.f19472b = cVar;
            this.f19473c = cVar;
        } else {
            cVar2.f19478d = cVar;
            cVar.f19479e = cVar2;
            this.f19473c = cVar;
        }
        hashMap.put(k, cVar);
        return null;
    }

    /* renamed from: d */
    public final V mo22081d(K k) {
        V d = super.mo22081d(k);
        this.f19471f.remove(k);
        return d;
    }
}
