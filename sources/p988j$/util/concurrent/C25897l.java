package p988j$.util.concurrent;

import java.util.Map;

/* renamed from: j$.util.concurrent.l */
final class C25897l implements Map.Entry {

    /* renamed from: a */
    final Object f64554a;

    /* renamed from: b */
    Object f64555b;

    /* renamed from: c */
    final ConcurrentHashMap f64556c;

    C25897l(Object obj, Object obj2, ConcurrentHashMap concurrentHashMap) {
        this.f64554a = obj;
        this.f64555b = obj2;
        this.f64556c = concurrentHashMap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        r0 = r2.f64555b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r3 = (java.util.Map.Entry) r3;
        r0 = r3.getKey();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r3 = r3.getValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r1 = r2.f64554a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof java.util.Map.Entry
            if (r0 == 0) goto L_0x0028
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r0 = r3.getKey()
            if (r0 == 0) goto L_0x0028
            java.lang.Object r3 = r3.getValue()
            if (r3 == 0) goto L_0x0028
            java.lang.Object r1 = r2.f64554a
            if (r0 == r1) goto L_0x001c
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0028
        L_0x001c:
            java.lang.Object r0 = r2.f64555b
            if (r3 == r0) goto L_0x0026
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0028
        L_0x0026:
            r3 = 1
            goto L_0x0029
        L_0x0028:
            r3 = 0
        L_0x0029:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p988j$.util.concurrent.C25897l.equals(java.lang.Object):boolean");
    }

    public final Object getKey() {
        return this.f64554a;
    }

    public final Object getValue() {
        return this.f64555b;
    }

    public final int hashCode() {
        return this.f64554a.hashCode() ^ this.f64555b.hashCode();
    }

    public final Object setValue(Object obj) {
        obj.getClass();
        Object obj2 = this.f64555b;
        this.f64555b = obj;
        this.f64556c.put(this.f64554a, obj);
        return obj2;
    }

    public final String toString() {
        return this.f64554a + "=" + this.f64555b;
    }
}
