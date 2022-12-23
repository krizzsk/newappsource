package p988j$.util.concurrent;

import java.util.Map;

/* renamed from: j$.util.concurrent.m */
class C25898m implements Map.Entry {

    /* renamed from: a */
    final int f64557a;

    /* renamed from: b */
    final Object f64558b;

    /* renamed from: c */
    volatile Object f64559c;

    /* renamed from: d */
    volatile C25898m f64560d;

    C25898m(int i, Object obj, Object obj2, C25898m mVar) {
        this.f64557a = i;
        this.f64558b = obj;
        this.f64559c = obj2;
        this.f64560d = mVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C25898m mo83961a(int i, Object obj) {
        Object obj2;
        if (obj == null) {
            return null;
        }
        C25898m mVar = this;
        do {
            if (mVar.f64557a == i && ((obj2 = mVar.f64558b) == obj || (obj2 != null && obj.equals(obj2)))) {
                return mVar;
            }
            mVar = mVar.f64560d;
        } while (mVar != null);
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        r0 = r2.f64559c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r3 = (java.util.Map.Entry) r3;
        r0 = r3.getKey();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r3 = r3.getValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r1 = r2.f64558b;
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
            java.lang.Object r1 = r2.f64558b
            if (r0 == r1) goto L_0x001c
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0028
        L_0x001c:
            java.lang.Object r0 = r2.f64559c
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
        throw new UnsupportedOperationException("Method not decompiled: p988j$.util.concurrent.C25898m.equals(java.lang.Object):boolean");
    }

    public final Object getKey() {
        return this.f64558b;
    }

    public final Object getValue() {
        return this.f64559c;
    }

    public final int hashCode() {
        return this.f64558b.hashCode() ^ this.f64559c.hashCode();
    }

    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        return this.f64558b + "=" + this.f64559c;
    }
}
