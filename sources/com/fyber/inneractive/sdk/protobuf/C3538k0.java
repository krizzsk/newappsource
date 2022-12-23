package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.C3609z;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.fyber.inneractive.sdk.protobuf.k0 */
public final class C3538k0<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: b */
    public static final C3538k0 f12505b;

    /* renamed from: a */
    public boolean f12506a = true;

    static {
        C3538k0 k0Var = new C3538k0();
        f12505b = k0Var;
        k0Var.f12506a = false;
    }

    public C3538k0() {
    }

    /* renamed from: a */
    public static int m9220a(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            Charset charset = C3609z.f12640a;
            int length = bArr.length;
            int i = length;
            for (int i2 = 0; i2 < 0 + length; i2++) {
                i = (i * 31) + bArr[i2];
            }
            if (i == 0) {
                return 1;
            }
            return i;
        } else if (!(obj instanceof C3609z.C3612c)) {
            return obj.hashCode();
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public void clear() {
        mo15049a();
        super.clear();
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof java.util.Map
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x005e
            java.util.Map r7 = (java.util.Map) r7
            if (r6 != r7) goto L_0x000b
            goto L_0x005a
        L_0x000b:
            int r0 = r6.size()
            int r3 = r7.size()
            if (r0 == r3) goto L_0x0016
            goto L_0x0058
        L_0x0016:
            java.util.Set r0 = r6.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x001e:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x005a
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            boolean r4 = r7.containsKey(r4)
            if (r4 != 0) goto L_0x0035
            goto L_0x0058
        L_0x0035:
            java.lang.Object r4 = r3.getValue()
            java.lang.Object r3 = r3.getKey()
            java.lang.Object r3 = r7.get(r3)
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L_0x0052
            boolean r5 = r3 instanceof byte[]
            if (r5 == 0) goto L_0x0052
            byte[] r4 = (byte[]) r4
            byte[] r3 = (byte[]) r3
            boolean r3 = java.util.Arrays.equals(r4, r3)
            goto L_0x0056
        L_0x0052:
            boolean r3 = r4.equals(r3)
        L_0x0056:
            if (r3 != 0) goto L_0x001e
        L_0x0058:
            r7 = 0
            goto L_0x005b
        L_0x005a:
            r7 = 1
        L_0x005b:
            if (r7 == 0) goto L_0x005e
            goto L_0x005f
        L_0x005e:
            r1 = 0
        L_0x005f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.C3538k0.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        for (Map.Entry entry : entrySet()) {
            i += m9220a(entry.getValue()) ^ m9220a(entry.getKey());
        }
        return i;
    }

    public V put(K k, V v) {
        mo15049a();
        Charset charset = C3609z.f12640a;
        k.getClass();
        v.getClass();
        return super.put(k, v);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        mo15049a();
        for (Object next : map.keySet()) {
            Charset charset = C3609z.f12640a;
            next.getClass();
            map.get(next).getClass();
        }
        super.putAll(map);
    }

    public V remove(Object obj) {
        mo15049a();
        return super.remove(obj);
    }

    public C3538k0(Map<K, V> map) {
        super(map);
    }

    /* renamed from: a */
    public final void mo15049a() {
        if (!this.f12506a) {
            throw new UnsupportedOperationException();
        }
    }
}
