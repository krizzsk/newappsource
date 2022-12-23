package org.simpleframework.xml.core;

import ij0.C23675u;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedHashMap;

class MethodScanner extends ContactList {
    private final C23675u detail;
    private final C24651i factory;
    private final PartMap read = new PartMap(0);
    private final C24664u support;
    private final PartMap write = new PartMap(0);

    public static class PartMap extends LinkedHashMap<String, C24650h> implements Iterable<String> {
        private PartMap() {
        }

        public final Iterator<String> iterator() {
            return keySet().iterator();
        }

        public /* synthetic */ PartMap(int i) {
            this();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MethodScanner(ij0.C23675u r10, org.simpleframework.xml.core.C24664u r11) throws java.lang.Exception {
        /*
            r9 = this;
            r9.<init>()
            org.simpleframework.xml.core.i r0 = new org.simpleframework.xml.core.i
            r0.<init>(r10, r11)
            r9.factory = r0
            org.simpleframework.xml.core.MethodScanner$PartMap r0 = new org.simpleframework.xml.core.MethodScanner$PartMap
            r1 = 0
            r0.<init>(r1)
            r9.write = r0
            org.simpleframework.xml.core.MethodScanner$PartMap r0 = new org.simpleframework.xml.core.MethodScanner$PartMap
            r0.<init>(r1)
            r9.read = r0
            r9.support = r11
            r9.detail = r10
            org.simpleframework.xml.DefaultType r0 = r10.mo58859l()
            org.simpleframework.xml.DefaultType r2 = r10.mo58862o()
            java.lang.Class r3 = r10.mo58863p()
            if (r3 == 0) goto L_0x007c
            org.simpleframework.xml.core.ContactList r11 = r11.mo61103d(r3, r0)
            java.util.Iterator r11 = r11.iterator()
        L_0x0033:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x007c
            java.lang.Object r0 = r11.next()
            ij0.p r0 = (ij0.C23659p) r0
            ij0.x0 r0 = (ij0.C23686x0) r0
            org.simpleframework.xml.core.h r3 = r0.f59859d
            org.simpleframework.xml.core.h r0 = r0.f59858c
            if (r0 == 0) goto L_0x0061
            org.simpleframework.xml.core.MethodScanner$PartMap r4 = r9.write
            java.lang.String r5 = r0.getName()
            java.lang.Object r6 = r4.remove(r5)
            org.simpleframework.xml.core.h r6 = (org.simpleframework.xml.core.C24650h) r6
            if (r6 == 0) goto L_0x005e
            java.lang.annotation.Annotation r7 = r0.mo61065a()
            boolean r7 = r7 instanceof gj0.C23435n
            if (r7 == 0) goto L_0x005e
            r0 = r6
        L_0x005e:
            r4.put(r5, r0)
        L_0x0061:
            org.simpleframework.xml.core.MethodScanner$PartMap r0 = r9.read
            java.lang.String r4 = r3.getName()
            java.lang.Object r5 = r0.remove(r4)
            org.simpleframework.xml.core.h r5 = (org.simpleframework.xml.core.C24650h) r5
            if (r5 == 0) goto L_0x0078
            java.lang.annotation.Annotation r6 = r3.mo61065a()
            boolean r6 = r6 instanceof gj0.C23435n
            if (r6 == 0) goto L_0x0078
            r3 = r5
        L_0x0078:
            r0.put(r4, r3)
            goto L_0x0033
        L_0x007c:
            java.util.List r11 = r10.mo58864q()
            org.simpleframework.xml.DefaultType r0 = org.simpleframework.xml.DefaultType.PROPERTY
            r3 = 0
            if (r2 != r0) goto L_0x0136
            java.util.Iterator r11 = r11.iterator()
        L_0x0089:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0136
            java.lang.Object r0 = r11.next()
            ij0.y0 r0 = (ij0.C23690y0) r0
            java.lang.annotation.Annotation[] r2 = r0.f59868a
            java.lang.reflect.Method r0 = r0.f59869b
            org.simpleframework.xml.core.i r4 = r9.factory
            r4.getClass()
            java.lang.Class r4 = org.simpleframework.xml.core.C24651i.m62020d(r0)
            if (r4 == 0) goto L_0x0089
            org.simpleframework.xml.core.i r4 = r9.factory
            r4.getClass()
            org.simpleframework.xml.core.MethodType r5 = org.simpleframework.xml.core.C24651i.m62018b(r0)
            org.simpleframework.xml.core.MethodType r6 = org.simpleframework.xml.core.MethodType.SET
            if (r5 != r6) goto L_0x00cc
            java.lang.reflect.Type[] r5 = r0.getGenericParameterTypes()
            int r7 = r5.length
            if (r7 <= 0) goto L_0x00c1
            r5 = r5[r1]
            boolean r7 = r5 instanceof java.lang.reflect.ParameterizedType
            if (r7 == 0) goto L_0x00c1
            java.lang.reflect.ParameterizedType r5 = (java.lang.reflect.ParameterizedType) r5
            goto L_0x00c2
        L_0x00c1:
            r5 = r3
        L_0x00c2:
            if (r5 == 0) goto L_0x00c9
            java.lang.Class[] r5 = p583jk.C17884p.m44386z(r5)
            goto L_0x0101
        L_0x00c9:
            java.lang.Class[] r5 = new java.lang.Class[r1]
            goto L_0x0101
        L_0x00cc:
            org.simpleframework.xml.core.MethodType r7 = org.simpleframework.xml.core.MethodType.GET
            if (r5 != r7) goto L_0x00e6
            java.lang.reflect.Type r5 = r0.getGenericReturnType()
            boolean r7 = r5 instanceof java.lang.reflect.ParameterizedType
            if (r7 == 0) goto L_0x00db
            java.lang.reflect.ParameterizedType r5 = (java.lang.reflect.ParameterizedType) r5
            goto L_0x00dc
        L_0x00db:
            r5 = r3
        L_0x00dc:
            if (r5 == 0) goto L_0x00e3
            java.lang.Class[] r5 = p583jk.C17884p.m44386z(r5)
            goto L_0x0101
        L_0x00e3:
            java.lang.Class[] r5 = new java.lang.Class[r1]
            goto L_0x0101
        L_0x00e6:
            org.simpleframework.xml.core.MethodType r7 = org.simpleframework.xml.core.MethodType.IS
            if (r5 != r7) goto L_0x0100
            java.lang.reflect.Type r5 = r0.getGenericReturnType()
            boolean r7 = r5 instanceof java.lang.reflect.ParameterizedType
            if (r7 == 0) goto L_0x00f5
            java.lang.reflect.ParameterizedType r5 = (java.lang.reflect.ParameterizedType) r5
            goto L_0x00f6
        L_0x00f5:
            r5 = r3
        L_0x00f6:
            if (r5 == 0) goto L_0x00fd
            java.lang.Class[] r5 = p583jk.C17884p.m44386z(r5)
            goto L_0x0101
        L_0x00fd:
            java.lang.Class[] r5 = new java.lang.Class[r1]
            goto L_0x0101
        L_0x0100:
            r5 = r3
        L_0x0101:
            java.lang.Class r7 = org.simpleframework.xml.core.C24651i.m62020d(r0)
            if (r7 == 0) goto L_0x010e
            ij0.a r4 = r4.f62399a
            java.lang.annotation.Annotation r4 = r4.mo58738a(r7, r5)
            goto L_0x010f
        L_0x010e:
            r4 = r3
        L_0x010f:
            if (r4 == 0) goto L_0x0116
            org.simpleframework.xml.core.h r0 = org.simpleframework.xml.core.C24651i.m62017a(r0, r4, r2)
            goto L_0x0117
        L_0x0116:
            r0 = r3
        L_0x0117:
            org.simpleframework.xml.core.MethodType r2 = r0.getMethodType()
            org.simpleframework.xml.core.MethodType r4 = org.simpleframework.xml.core.MethodType.GET
            if (r2 != r4) goto L_0x0124
            org.simpleframework.xml.core.MethodScanner$PartMap r4 = r9.read
            m61957b(r0, r4)
        L_0x0124:
            org.simpleframework.xml.core.MethodType r4 = org.simpleframework.xml.core.MethodType.IS
            if (r2 != r4) goto L_0x012d
            org.simpleframework.xml.core.MethodScanner$PartMap r4 = r9.read
            m61957b(r0, r4)
        L_0x012d:
            if (r2 != r6) goto L_0x0089
            org.simpleframework.xml.core.MethodScanner$PartMap r2 = r9.write
            m61957b(r0, r2)
            goto L_0x0089
        L_0x0136:
            java.util.List r10 = r10.mo58864q()
            java.util.Iterator r10 = r10.iterator()
        L_0x013e:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x01dc
            java.lang.Object r11 = r10.next()
            ij0.y0 r11 = (ij0.C23690y0) r11
            java.lang.annotation.Annotation[] r0 = r11.f59868a
            java.lang.reflect.Method r11 = r11.f59869b
            int r2 = r0.length
            r4 = 0
        L_0x0150:
            if (r4 >= r2) goto L_0x013e
            r5 = r0[r4]
            boolean r6 = r5 instanceof gj0.C23422a
            if (r6 == 0) goto L_0x015b
            r9.mo61001a(r11, r5, r0)
        L_0x015b:
            boolean r6 = r5 instanceof gj0.C23430i
            if (r6 == 0) goto L_0x0162
            r9.mo61001a(r11, r5, r0)
        L_0x0162:
            boolean r6 = r5 instanceof gj0.C23427f
            if (r6 == 0) goto L_0x0169
            r9.mo61001a(r11, r5, r0)
        L_0x0169:
            boolean r6 = r5 instanceof gj0.C23429h
            if (r6 == 0) goto L_0x0170
            r9.mo61001a(r11, r5, r0)
        L_0x0170:
            boolean r6 = r5 instanceof gj0.C23426e
            if (r6 == 0) goto L_0x0177
            r9.mo61001a(r11, r5, r0)
        L_0x0177:
            boolean r6 = r5 instanceof gj0.C23425d
            if (r6 == 0) goto L_0x017e
            r9.mo61001a(r11, r5, r0)
        L_0x017e:
            boolean r6 = r5 instanceof gj0.C23428g
            if (r6 == 0) goto L_0x0185
            r9.mo61001a(r11, r5, r0)
        L_0x0185:
            boolean r6 = r5 instanceof gj0.C23424c
            if (r6 == 0) goto L_0x018c
            r9.mo61001a(r11, r5, r0)
        L_0x018c:
            boolean r6 = r5 instanceof gj0.C23437p
            if (r6 == 0) goto L_0x0193
            r9.mo61001a(r11, r5, r0)
        L_0x0193:
            boolean r6 = r5 instanceof gj0.C23435n
            if (r6 == 0) goto L_0x019a
            r9.mo61001a(r11, r5, r0)
        L_0x019a:
            boolean r6 = r5 instanceof gj0.C23436o
            if (r6 == 0) goto L_0x01d8
            org.simpleframework.xml.core.i r6 = r9.factory
            r6.getClass()
            org.simpleframework.xml.core.h r5 = org.simpleframework.xml.core.C24651i.m62017a(r11, r5, r0)
            org.simpleframework.xml.core.MethodType r6 = r5.getMethodType()
            org.simpleframework.xml.core.MethodType r7 = org.simpleframework.xml.core.MethodType.GET
            if (r6 != r7) goto L_0x01ba
            org.simpleframework.xml.core.MethodScanner$PartMap r7 = r9.read
            java.lang.String r8 = r5.getName()
            if (r8 == 0) goto L_0x01ba
            r7.remove(r8)
        L_0x01ba:
            org.simpleframework.xml.core.MethodType r7 = org.simpleframework.xml.core.MethodType.IS
            if (r6 != r7) goto L_0x01c9
            org.simpleframework.xml.core.MethodScanner$PartMap r7 = r9.read
            java.lang.String r8 = r5.getName()
            if (r8 == 0) goto L_0x01c9
            r7.remove(r8)
        L_0x01c9:
            org.simpleframework.xml.core.MethodType r7 = org.simpleframework.xml.core.MethodType.SET
            if (r6 != r7) goto L_0x01d8
            org.simpleframework.xml.core.MethodScanner$PartMap r6 = r9.write
            java.lang.String r5 = r5.getName()
            if (r5 == 0) goto L_0x01d8
            r6.remove(r5)
        L_0x01d8:
            int r4 = r4 + 1
            goto L_0x0150
        L_0x01dc:
            org.simpleframework.xml.core.MethodScanner$PartMap r10 = r9.read
            java.util.Iterator r10 = r10.iterator()
        L_0x01e2:
            boolean r11 = r10.hasNext()
            r0 = 2
            r2 = 1
            if (r11 == 0) goto L_0x0250
            java.lang.Object r11 = r10.next()
            java.lang.String r11 = (java.lang.String) r11
            org.simpleframework.xml.core.MethodScanner$PartMap r4 = r9.read
            java.lang.Object r4 = r4.get(r11)
            org.simpleframework.xml.core.h r4 = (org.simpleframework.xml.core.C24650h) r4
            if (r4 == 0) goto L_0x01e2
            org.simpleframework.xml.core.MethodScanner$PartMap r5 = r9.write
            java.lang.Object r11 = r5.remove(r11)
            org.simpleframework.xml.core.h r11 = (org.simpleframework.xml.core.C24650h) r11
            if (r11 == 0) goto L_0x0247
            java.lang.annotation.Annotation r5 = r4.mo61065a()
            java.lang.String r6 = r4.getName()
            java.lang.annotation.Annotation r7 = r11.mo61065a()
            boolean r5 = r7.equals(r5)
            if (r5 == 0) goto L_0x0237
            java.lang.Class r5 = r4.getType()
            java.lang.Class r7 = r11.getType()
            if (r5 != r7) goto L_0x0229
            ij0.x0 r0 = new ij0.x0
            r0.<init>(r4, r11)
            r9.add(r0)
            goto L_0x01e2
        L_0x0229:
            org.simpleframework.xml.core.MethodException r10 = new org.simpleframework.xml.core.MethodException
            java.lang.Object[] r11 = new java.lang.Object[r0]
            r11[r1] = r6
            r11[r2] = r5
            java.lang.String r0 = "Method types do not match for %s in %s"
            r10.<init>(r0, r11)
            throw r10
        L_0x0237:
            org.simpleframework.xml.core.MethodException r10 = new org.simpleframework.xml.core.MethodException
            java.lang.Object[] r11 = new java.lang.Object[r0]
            r11[r1] = r6
            ij0.u r0 = r9.detail
            r11[r2] = r0
            java.lang.String r0 = "Annotations do not match for '%s' in %s"
            r10.<init>(r0, r11)
            throw r10
        L_0x0247:
            ij0.x0 r11 = new ij0.x0
            r11.<init>(r4, r3)
            r9.add(r11)
            goto L_0x01e2
        L_0x0250:
            org.simpleframework.xml.core.MethodScanner$PartMap r10 = r9.write
            java.util.Iterator r10 = r10.iterator()
        L_0x0256:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x028b
            java.lang.Object r11 = r10.next()
            java.lang.String r11 = (java.lang.String) r11
            org.simpleframework.xml.core.MethodScanner$PartMap r3 = r9.write
            java.lang.Object r3 = r3.get(r11)
            org.simpleframework.xml.core.h r3 = (org.simpleframework.xml.core.C24650h) r3
            if (r3 == 0) goto L_0x0256
            org.simpleframework.xml.core.MethodScanner$PartMap r4 = r9.read
            java.lang.Object r11 = r4.remove(r11)
            org.simpleframework.xml.core.h r11 = (org.simpleframework.xml.core.C24650h) r11
            java.lang.reflect.Method r3 = r3.getMethod()
            if (r11 == 0) goto L_0x027b
            goto L_0x0256
        L_0x027b:
            org.simpleframework.xml.core.MethodException r10 = new org.simpleframework.xml.core.MethodException
            java.lang.Object[] r11 = new java.lang.Object[r0]
            r11[r1] = r3
            ij0.u r0 = r9.detail
            r11[r2] = r0
            java.lang.String r0 = "No matching get method for %s in %s"
            r10.<init>(r0, r11)
            throw r10
        L_0x028b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.simpleframework.xml.core.MethodScanner.<init>(ij0.u, org.simpleframework.xml.core.u):void");
    }

    /* renamed from: b */
    public static void m61957b(C24650h hVar, PartMap partMap) {
        String name = hVar.getName();
        if (name != null) {
            partMap.put(name, hVar);
        }
    }

    /* renamed from: a */
    public final void mo61001a(Method method, Annotation annotation, Annotation[] annotationArr) throws Exception {
        this.factory.getClass();
        C24650h a = C24651i.m62017a(method, annotation, annotationArr);
        MethodType methodType = a.getMethodType();
        if (methodType == MethodType.GET) {
            m61957b(a, this.read);
        }
        if (methodType == MethodType.IS) {
            m61957b(a, this.read);
        }
        if (methodType == MethodType.SET) {
            m61957b(a, this.write);
        }
    }
}
