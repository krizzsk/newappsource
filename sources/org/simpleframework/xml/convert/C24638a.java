package org.simpleframework.xml.convert;

import kj0.C23808c;
import kj0.C23809d;

/* renamed from: org.simpleframework.xml.convert.a */
public final class C24638a implements C23808c {

    /* renamed from: a */
    public final C24639b f62338a = new C24639b();

    /* renamed from: b */
    public final C23808c f62339b;

    public C24638a() {
        C23809d dVar = new C23809d();
        this.f62339b = dVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: hj0.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kj0.C23811f mo59056a(kj0.C23810e r8, lj0.C24334k r9, ij0.C23654n1 r10) throws java.lang.Exception {
        /*
            r7 = this;
            kj0.c r0 = r7.f62339b
            kj0.f r9 = r0.mo59056a(r8, r9, r10)
            r10 = 0
            r0 = 1
            if (r9 == 0) goto L_0x0012
            boolean r1 = r9.mo5645a()
            if (r1 == 0) goto L_0x0012
            r1 = 1
            goto L_0x0013
        L_0x0012:
            r1 = 0
        L_0x0013:
            if (r1 == 0) goto L_0x0016
            return r9
        L_0x0016:
            org.simpleframework.xml.convert.b r1 = r7.f62338a
            r1.getClass()
            java.lang.Class r2 = r8.getType()
            if (r9 == 0) goto L_0x0025
            java.lang.Class r2 = r9.getType()
        L_0x0025:
            java.lang.Class<hj0.a> r3 = hj0.C23575a.class
            java.lang.annotation.Annotation r3 = r8.getAnnotation(r3)
            hj0.a r3 = (hj0.C23575a) r3
            if (r3 == 0) goto L_0x0046
            java.lang.Class<gj0.c> r4 = gj0.C23424c.class
            java.lang.annotation.Annotation r4 = r8.getAnnotation(r4)
            gj0.c r4 = (gj0.C23424c) r4
            if (r4 == 0) goto L_0x003a
            goto L_0x0046
        L_0x003a:
            org.simpleframework.xml.convert.ConvertException r9 = new org.simpleframework.xml.convert.ConvertException
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r10] = r8
            java.lang.String r8 = "Element annotation required for %s"
            r9.<init>(r8, r0)
            throw r9
        L_0x0046:
            if (r3 != 0) goto L_0x008d
            java.lang.Class<hj0.a> r3 = hj0.C23575a.class
            org.simpleframework.xml.convert.ScannerBuilder r4 = r1.f62341b
            java.lang.Object r5 = r4.get(r2)
            hj0.d r5 = (hj0.C23578d) r5
            if (r5 != 0) goto L_0x005c
            org.simpleframework.xml.convert.ScannerBuilder$Entry r5 = new org.simpleframework.xml.convert.ScannerBuilder$Entry
            r5.<init>(r2)
            r4.put(r2, r5)
        L_0x005c:
            java.lang.annotation.Annotation r3 = r5.mo58734a(r3)
            hj0.a r3 = (hj0.C23575a) r3
            if (r3 == 0) goto L_0x008d
            java.lang.Class<gj0.m> r4 = gj0.C23434m.class
            org.simpleframework.xml.convert.ScannerBuilder r5 = r1.f62341b
            java.lang.Object r6 = r5.get(r2)
            hj0.d r6 = (hj0.C23578d) r6
            if (r6 != 0) goto L_0x0078
            org.simpleframework.xml.convert.ScannerBuilder$Entry r6 = new org.simpleframework.xml.convert.ScannerBuilder$Entry
            r6.<init>(r2)
            r5.put(r2, r6)
        L_0x0078:
            java.lang.annotation.Annotation r4 = r6.mo58734a(r4)
            gj0.m r4 = (gj0.C23434m) r4
            if (r4 == 0) goto L_0x0081
            goto L_0x008d
        L_0x0081:
            org.simpleframework.xml.convert.ConvertException r8 = new org.simpleframework.xml.convert.ConvertException
            java.lang.Object[] r9 = new java.lang.Object[r0]
            r9[r10] = r2
            java.lang.String r10 = "Root annotation required for %s"
            r8.<init>(r10, r9)
            throw r8
        L_0x008d:
            if (r3 == 0) goto L_0x00d4
            hj0.c r1 = r1.f62340a
            r1.getClass()
            java.lang.Class r2 = r3.value()
            boolean r3 = r2.isInterface()
            if (r3 != 0) goto L_0x00c8
            org.simpleframework.xml.util.ConcurrentCache r3 = r1.f59653a
            java.lang.Object r3 = r3.get(r2)
            hj0.b r3 = (hj0.C23576b) r3
            if (r3 != 0) goto L_0x00d5
            java.lang.Class[] r3 = new java.lang.Class[r10]
            java.lang.reflect.Constructor r3 = r2.getDeclaredConstructor(r3)
            boolean r4 = r3.isAccessible()
            if (r4 != 0) goto L_0x00b7
            r3.setAccessible(r0)
        L_0x00b7:
            java.lang.Object[] r10 = new java.lang.Object[r10]
            java.lang.Object r10 = r3.newInstance(r10)
            r3 = r10
            hj0.b r3 = (hj0.C23576b) r3
            if (r3 == 0) goto L_0x00d5
            org.simpleframework.xml.util.ConcurrentCache r10 = r1.f59653a
            r10.put(r2, r3)
            goto L_0x00d5
        L_0x00c8:
            org.simpleframework.xml.convert.ConvertException r8 = new org.simpleframework.xml.convert.ConvertException
            java.lang.Object[] r9 = new java.lang.Object[r0]
            r9[r10] = r2
            java.lang.String r10 = "Can not instantiate %s"
            r8.<init>(r10, r9)
            throw r8
        L_0x00d4:
            r3 = 0
        L_0x00d5:
            if (r3 == 0) goto L_0x00ea
            java.lang.Object r10 = r3.read()
            java.lang.Class r8 = r8.getType()
            if (r9 == 0) goto L_0x00e4
            r9.setValue(r10)
        L_0x00e4:
            androidx.viewpager2.widget.d r0 = new androidx.viewpager2.widget.d
            r0.<init>(r9, r10, r8)
            r9 = r0
        L_0x00ea:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: org.simpleframework.xml.convert.C24638a.mo59056a(kj0.e, lj0.k, ij0.n1):kj0.f");
    }
}
