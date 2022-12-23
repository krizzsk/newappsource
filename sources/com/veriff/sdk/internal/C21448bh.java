package com.veriff.sdk.internal;

import com.veriff.sdk.internal.C21420av;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;

/* renamed from: com.veriff.sdk.internal.bh */
final class C21448bh<K, V> extends C21420av<Map<K, V>> {

    /* renamed from: a */
    public static final C21420av.C21424a f53960a = new C21420av.C21424a() {
        /* renamed from: a */
        public C21420av<?> mo54207a(Type type, Set<? extends Annotation> set, C21450bi biVar) {
            Class<?> d;
            if (!set.isEmpty() || (d = C21468bk.m51268d(type)) != Map.class) {
                return null;
            }
            Type[] b = C21468bk.m51266b(type, d);
            return new C21448bh(biVar, b[0], b[1]).mo54227d();
        }
    };

    /* renamed from: b */
    private final C21420av<K> f53961b;

    /* renamed from: c */
    private final C21420av<V> f53962c;

    public C21448bh(C21450bi biVar, Type type, Type type2) {
        this.f53961b = biVar.mo54335a(type);
        this.f53962c = biVar.mo54335a(type2);
    }

    /* renamed from: b */
    public Map<K, V> mo54204a(C21430ba baVar) throws IOException {
        C21438bg bgVar = new C21438bg();
        baVar.mo54246e();
        while (baVar.mo54248g()) {
            baVar.mo54260s();
            K a = this.f53961b.mo54204a(baVar);
            V a2 = this.f53962c.mo54204a(baVar);
            Object put = bgVar.put(a, a2);
            if (put != null) {
                throw new C21426ax("Map key '" + a + "' has multiple values at path " + baVar.mo54259r() + ": " + put + " and " + a2);
            }
        }
        baVar.mo54247f();
        return bgVar;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("JsonAdapter(");
        k.append(this.f53961b);
        k.append("=");
        k.append(this.f53962c);
        k.append(")");
        return k.toString();
    }

    /* renamed from: a */
    public void mo54205a(C21437bf bfVar, Map<K, V> map) throws IOException {
        bfVar.mo54273c();
        for (Map.Entry next : map.entrySet()) {
            if (next.getKey() != null) {
                bfVar.mo54288j();
                this.f53961b.mo54205a(bfVar, next.getKey());
                this.f53962c.mo54205a(bfVar, next.getValue());
            } else {
                StringBuilder k = C13555b.m33972k("Map key is null at ");
                k.append(bfVar.mo54289k());
                throw new C21426ax(k.toString());
            }
        }
        bfVar.mo54275d();
    }
}
