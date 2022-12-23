package com.google.protobuf;

import com.google.protobuf.C14610k;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class MapFieldLite<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: b */
    public static final MapFieldLite f36812b;
    private boolean isMutable = true;

    static {
        MapFieldLite mapFieldLite = new MapFieldLite();
        f36812b = mapFieldLite;
        mapFieldLite.isMutable = false;
    }

    private MapFieldLite() {
    }

    /* renamed from: a */
    public static int m36523a(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            Charset charset = C14610k.f36861a;
            int length = bArr.length;
            int i = length;
            for (int i2 = 0; i2 < 0 + length; i2++) {
                i = (i * 31) + bArr[i2];
            }
            if (i == 0) {
                return 1;
            }
            return i;
        } else if (!(obj instanceof C14610k.C14611a)) {
            return obj.hashCode();
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public final void clear() {
        mo43971f();
        super.clear();
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof java.util.Map
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x005e
            java.util.Map r7 = (java.util.Map) r7
            if (r6 != r7) goto L_0x000c
        L_0x000a:
            r7 = 1
            goto L_0x005b
        L_0x000c:
            int r0 = r6.size()
            int r3 = r7.size()
            if (r0 == r3) goto L_0x0018
        L_0x0016:
            r7 = 0
            goto L_0x005b
        L_0x0018:
            java.util.Set r0 = r6.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0020:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x000a
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            boolean r4 = r7.containsKey(r4)
            if (r4 != 0) goto L_0x0037
            goto L_0x0016
        L_0x0037:
            java.lang.Object r4 = r3.getValue()
            java.lang.Object r3 = r3.getKey()
            java.lang.Object r3 = r7.get(r3)
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L_0x0054
            boolean r5 = r3 instanceof byte[]
            if (r5 == 0) goto L_0x0054
            byte[] r4 = (byte[]) r4
            byte[] r3 = (byte[]) r3
            boolean r3 = java.util.Arrays.equals(r4, r3)
            goto L_0x0058
        L_0x0054:
            boolean r3 = r4.equals(r3)
        L_0x0058:
            if (r3 != 0) goto L_0x0020
            goto L_0x0016
        L_0x005b:
            if (r7 == 0) goto L_0x005e
            goto L_0x005f
        L_0x005e:
            r1 = 0
        L_0x005f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MapFieldLite.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final void mo43971f() {
        if (!this.isMutable) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: g */
    public final boolean mo43972g() {
        return this.isMutable;
    }

    /* renamed from: h */
    public final void mo43973h() {
        this.isMutable = false;
    }

    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : entrySet()) {
            i += m36523a(entry.getValue()) ^ m36523a(entry.getKey());
        }
        return i;
    }

    /* renamed from: i */
    public final MapFieldLite<K, V> mo43975i() {
        return isEmpty() ? new MapFieldLite<>() : new MapFieldLite<>(this);
    }

    public final V put(K k, V v) {
        mo43971f();
        Charset charset = C14610k.f36861a;
        k.getClass();
        v.getClass();
        return super.put(k, v);
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        mo43971f();
        for (Object next : map.keySet()) {
            Charset charset = C14610k.f36861a;
            next.getClass();
            map.get(next).getClass();
        }
        super.putAll(map);
    }

    public final V remove(Object obj) {
        mo43971f();
        return super.remove(obj);
    }

    public MapFieldLite(Map<K, V> map) {
        super(map);
    }
}
