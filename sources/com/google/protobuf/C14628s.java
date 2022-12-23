package com.google.protobuf;

import com.google.protobuf.C14625q;
import java.util.Map;

/* renamed from: com.google.protobuf.s */
public final class C14628s implements C14627r {
    /* renamed from: a */
    public final MapFieldLite mo44124a(Object obj, Object obj2) {
        MapFieldLite mapFieldLite = (MapFieldLite) obj;
        MapFieldLite mapFieldLite2 = (MapFieldLite) obj2;
        if (!mapFieldLite2.isEmpty()) {
            if (!mapFieldLite.mo43972g()) {
                mapFieldLite = mapFieldLite.mo43975i();
            }
            mapFieldLite.mo43971f();
            if (!mapFieldLite2.isEmpty()) {
                mapFieldLite.putAll(mapFieldLite2);
            }
        }
        return mapFieldLite;
    }

    /* renamed from: b */
    public final C14625q.C14626a<?, ?> mo44125b(Object obj) {
        return ((C14625q) obj).f36873a;
    }

    /* renamed from: c */
    public final MapFieldLite mo44126c(Object obj) {
        return (MapFieldLite) obj;
    }

    /* renamed from: d */
    public final Object mo44127d(Object obj) {
        ((MapFieldLite) obj).mo43973h();
        return obj;
    }

    /* renamed from: e */
    public final int mo44128e(int i, Object obj, Object obj2) {
        MapFieldLite mapFieldLite = (MapFieldLite) obj;
        C14625q qVar = (C14625q) obj2;
        int i2 = 0;
        if (!mapFieldLite.isEmpty()) {
            for (Map.Entry entry : mapFieldLite.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                qVar.getClass();
                int t = CodedOutputStream.m36448t(i);
                int a = C14625q.m36643a(qVar.f36873a, key, value);
                i2 += CodedOutputStream.m36450v(a) + a + t;
            }
        }
        return i2;
    }
}
