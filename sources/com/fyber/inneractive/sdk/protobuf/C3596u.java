package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.C3483c0;
import com.fyber.inneractive.sdk.protobuf.C3564q0;
import com.fyber.inneractive.sdk.protobuf.C3584t1;
import com.fyber.inneractive.sdk.protobuf.C3596u.C3597a;
import com.fyber.inneractive.sdk.protobuf.C3609z;
import com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/* renamed from: com.fyber.inneractive.sdk.protobuf.u */
public final class C3596u<T extends C3597a<T>> {

    /* renamed from: d */
    public static final C3596u f12611d;

    /* renamed from: a */
    public final C3521i1<T, Object> f12612a;

    /* renamed from: b */
    public boolean f12613b;

    /* renamed from: c */
    public boolean f12614c;

    /* renamed from: com.fyber.inneractive.sdk.protobuf.u$a */
    public interface C3597a<T extends C3597a<T>> extends Comparable<T> {
        /* renamed from: a */
        int mo14763a();

        /* renamed from: a */
        C3564q0.C3565a mo14764a(C3564q0.C3565a aVar, C3564q0 q0Var);

        /* renamed from: b */
        boolean mo14765b();

        /* renamed from: c */
        C3584t1.C3586b mo14766c();

        /* renamed from: d */
        C3584t1.C3591c mo14768d();

        /* renamed from: e */
        boolean mo14769e();
    }

    static {
        C3596u uVar = new C3596u(C3521i1.m9010b(0));
        uVar.mo15226g();
        f12611d = uVar;
    }

    public C3596u() {
        this.f12612a = C3521i1.m9010b(16);
    }

    /* renamed from: b */
    public static <T extends C3597a<T>> C3596u<T> m9588b() {
        return f12611d;
    }

    /* renamed from: a */
    public C3596u<T> clone() {
        C3596u<T> uVar = new C3596u<>();
        for (int i = 0; i < this.f12612a.f12457b.size(); i++) {
            Map.Entry<T, Object> a = this.f12612a.mo14954a(i);
            uVar.mo15218c((C3597a) a.getKey(), a.getValue());
        }
        for (Map.Entry next : this.f12612a.mo14956b()) {
            uVar.mo15218c((C3597a) next.getKey(), next.getValue());
        }
        uVar.f12614c = this.f12614c;
        return uVar;
    }

    /* renamed from: c */
    public void mo15218c(T t, Object obj) {
        if (!t.mo14765b()) {
            mo15222d(t, obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                mo15222d(t, it.next());
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof C3483c0) {
            this.f12614c = true;
        }
        this.f12612a.put(t, obj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        if ((r7 instanceof byte[]) == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0043, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0044, code lost:
        if (r0 == false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0046, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0072, code lost:
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new java.lang.Object[]{java.lang.Integer.valueOf(r6.mo14763a()), r6.mo14766c().f12595a, r7.getClass().getName()}));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if ((r7 instanceof com.fyber.inneractive.sdk.protobuf.C3483c0) == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        if ((r7 instanceof com.fyber.inneractive.sdk.protobuf.C3609z.C3612c) == false) goto L_0x0043;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo15222d(T r6, java.lang.Object r7) {
        /*
            r5 = this;
            com.fyber.inneractive.sdk.protobuf.t1$b r0 = r6.mo14766c()
            java.nio.charset.Charset r1 = com.fyber.inneractive.sdk.protobuf.C3609z.f12640a
            r7.getClass()
            com.fyber.inneractive.sdk.protobuf.t1$c r0 = r0.f12595a
            int r0 = r0.ordinal()
            r1 = 0
            r2 = 1
            switch(r0) {
                case 0: goto L_0x0040;
                case 1: goto L_0x003d;
                case 2: goto L_0x003a;
                case 3: goto L_0x0037;
                case 4: goto L_0x0034;
                case 5: goto L_0x0031;
                case 6: goto L_0x0027;
                case 7: goto L_0x001e;
                case 8: goto L_0x0015;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x0043
        L_0x0015:
            boolean r0 = r7 instanceof com.fyber.inneractive.sdk.protobuf.C3564q0
            if (r0 != 0) goto L_0x002f
            boolean r0 = r7 instanceof com.fyber.inneractive.sdk.protobuf.C3483c0
            if (r0 == 0) goto L_0x0043
            goto L_0x002f
        L_0x001e:
            boolean r0 = r7 instanceof java.lang.Integer
            if (r0 != 0) goto L_0x002f
            boolean r0 = r7 instanceof com.fyber.inneractive.sdk.protobuf.C3609z.C3612c
            if (r0 == 0) goto L_0x0043
            goto L_0x002f
        L_0x0027:
            boolean r0 = r7 instanceof com.fyber.inneractive.sdk.protobuf.C3508i
            if (r0 != 0) goto L_0x002f
            boolean r0 = r7 instanceof byte[]
            if (r0 == 0) goto L_0x0043
        L_0x002f:
            r0 = 1
            goto L_0x0044
        L_0x0031:
            boolean r0 = r7 instanceof java.lang.String
            goto L_0x0044
        L_0x0034:
            boolean r0 = r7 instanceof java.lang.Boolean
            goto L_0x0044
        L_0x0037:
            boolean r0 = r7 instanceof java.lang.Double
            goto L_0x0044
        L_0x003a:
            boolean r0 = r7 instanceof java.lang.Float
            goto L_0x0044
        L_0x003d:
            boolean r0 = r7 instanceof java.lang.Long
            goto L_0x0044
        L_0x0040:
            boolean r0 = r7 instanceof java.lang.Integer
            goto L_0x0044
        L_0x0043:
            r0 = 0
        L_0x0044:
            if (r0 == 0) goto L_0x0047
            return
        L_0x0047:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            int r4 = r6.mo14763a()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r1] = r4
            com.fyber.inneractive.sdk.protobuf.t1$b r6 = r6.mo14766c()
            com.fyber.inneractive.sdk.protobuf.t1$c r6 = r6.f12595a
            r3[r2] = r6
            java.lang.Class r6 = r7.getClass()
            java.lang.String r6 = r6.getName()
            r7 = 2
            r3[r7] = r6
            java.lang.String r6 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r6 = java.lang.String.format(r6, r3)
            r0.<init>(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.C3596u.mo15222d(com.fyber.inneractive.sdk.protobuf.u$a, java.lang.Object):void");
    }

    /* renamed from: e */
    public boolean mo15223e() {
        for (int i = 0; i < this.f12612a.f12457b.size(); i++) {
            if (!m9589b(this.f12612a.mo14954a(i))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> b : this.f12612a.mo14956b()) {
            if (!m9589b(b)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3596u)) {
            return false;
        }
        return this.f12612a.equals(((C3596u) obj).f12612a);
    }

    /* renamed from: f */
    public Iterator<Map.Entry<T, Object>> mo15225f() {
        if (this.f12614c) {
            return new C3483c0.C3485b(this.f12612a.entrySet().iterator());
        }
        return this.f12612a.entrySet().iterator();
    }

    /* renamed from: g */
    public void mo15226g() {
        if (!this.f12613b) {
            this.f12612a.mo14961d();
            this.f12613b = true;
        }
    }

    public int hashCode() {
        return this.f12612a.hashCode();
    }

    /* renamed from: b */
    public static <T extends C3597a<T>> boolean m9589b(Map.Entry<T, Object> entry) {
        C3597a aVar = (C3597a) entry.getKey();
        if (aVar.mo14768d() == C3584t1.C3591c.MESSAGE) {
            if (aVar.mo14765b()) {
                for (C3564q0 isInitialized : (List) entry.getValue()) {
                    if (!isInitialized.isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof C3564q0) {
                    if (!((C3564q0) value).isInitialized()) {
                        return false;
                    }
                } else if (value instanceof C3483c0) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    public C3596u(C3521i1<T, Object> i1Var) {
        this.f12612a = i1Var;
        mo15226g();
    }

    /* renamed from: a */
    public static int m9585a(C3584t1.C3586b bVar, boolean z) {
        if (z) {
            return 2;
        }
        return bVar.f12596b;
    }

    /* renamed from: a */
    public Object mo15214a(T t) {
        Object obj = this.f12612a.get(t);
        return obj instanceof C3483c0 ? ((C3483c0) obj).mo14815a((C3564q0) null) : obj;
    }

    /* renamed from: b */
    public static int m9587b(C3597a<?> aVar, Object obj) {
        C3584t1.C3586b c = aVar.mo14766c();
        int a = aVar.mo14763a();
        if (!aVar.mo14765b()) {
            return m9583a(c, a, obj);
        }
        int i = 0;
        if (aVar.mo14769e()) {
            for (Object a2 : (List) obj) {
                i += m9584a(c, a2);
            }
            return C3540l.m9241c(i) + C3540l.m9237b(a) + i;
        }
        for (Object a3 : (List) obj) {
            i += m9583a(c, a, a3);
        }
        return i;
    }

    /* renamed from: c */
    public final void mo15219c(Map.Entry<T, Object> entry) {
        C3597a aVar = (C3597a) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C3483c0) {
            value = ((C3483c0) value).mo14815a((C3564q0) null);
        }
        if (aVar.mo14765b()) {
            Object a = mo15214a(aVar);
            if (a == null) {
                a = new ArrayList();
            }
            for (Object a2 : (List) value) {
                ((List) a).add(m9586a(a2));
            }
            this.f12612a.put(aVar, a);
        } else if (aVar.mo14768d() == C3584t1.C3591c.MESSAGE) {
            Object a3 = mo15214a(aVar);
            if (a3 == null) {
                this.f12612a.put(aVar, m9586a(value));
                return;
            }
            this.f12612a.put(aVar, ((GeneratedMessageLite.C3465a) aVar.mo14764a(((C3564q0) a3).toBuilder(), (C3564q0) value)).mo14758a());
        } else {
            this.f12612a.put(aVar, m9586a(value));
        }
    }

    /* renamed from: a */
    public void mo15215a(T t, Object obj) {
        List list;
        if (((GeneratedMessageLite.C3467c) t).f12371d) {
            mo15222d(t, obj);
            Object a = mo15214a(t);
            if (a == null) {
                list = new ArrayList();
                this.f12612a.put(t, list);
            } else {
                list = (List) a;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: d */
    public int mo15221d() {
        int i = 0;
        for (int i2 = 0; i2 < this.f12612a.f12457b.size(); i2++) {
            Map.Entry<T, Object> a = this.f12612a.mo14954a(i2);
            i += m9587b((C3597a) a.getKey(), a.getValue());
        }
        for (Map.Entry next : this.f12612a.mo14956b()) {
            i += m9587b((C3597a) next.getKey(), next.getValue());
        }
        return i;
    }

    /* renamed from: a */
    public void mo15216a(C3596u<T> uVar) {
        for (int i = 0; i < uVar.f12612a.f12457b.size(); i++) {
            mo15219c(uVar.f12612a.mo14954a(i));
        }
        for (Map.Entry<T, Object> c : uVar.f12612a.mo14956b()) {
            mo15219c(c);
        }
    }

    /* renamed from: a */
    public static Object m9586a(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* renamed from: a */
    public final int mo15212a(Map.Entry<T, Object> entry) {
        C3597a aVar = (C3597a) entry.getKey();
        Object value = entry.getValue();
        if (aVar.mo14768d() != C3584t1.C3591c.MESSAGE || aVar.mo14765b() || aVar.mo14769e()) {
            return m9587b(aVar, value);
        }
        if (value instanceof C3483c0) {
            return C3540l.m9233a((C3488d0) (C3483c0) value) + C3540l.m9237b(3) + C3540l.m9249f(2, ((C3597a) entry.getKey()).mo14763a()) + (C3540l.m9237b(1) * 2);
        }
        int f = C3540l.m9249f(2, ((C3597a) entry.getKey()).mo14763a()) + (C3540l.m9237b(1) * 2);
        int b = C3540l.m9237b(3);
        int serializedSize = ((C3564q0) value).getSerializedSize();
        return C3540l.m9241c(serializedSize) + serializedSize + b + f;
    }

    /* renamed from: c */
    public int mo15217c() {
        int i = 0;
        for (int i2 = 0; i2 < this.f12612a.f12457b.size(); i2++) {
            i += mo15212a(this.f12612a.mo14954a(i2));
        }
        for (Map.Entry<T, Object> a : this.f12612a.mo14956b()) {
            i += mo15212a(a);
        }
        return i;
    }

    /* renamed from: a */
    public static int m9583a(C3584t1.C3586b bVar, int i, Object obj) {
        int b = C3540l.m9237b(i);
        if (bVar == C3584t1.C3586b.GROUP) {
            b *= 2;
        }
        return m9584a(bVar, obj) + b;
    }

    /* renamed from: a */
    public static int m9584a(C3584t1.C3586b bVar, Object obj) {
        int serializedSize;
        int c;
        switch (bVar.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                Logger logger = C3540l.f12507b;
                return 8;
            case 1:
                ((Float) obj).floatValue();
                Logger logger2 = C3540l.f12507b;
                return 4;
            case 2:
                return C3540l.m9232a(((Long) obj).longValue());
            case 3:
                return C3540l.m9232a(((Long) obj).longValue());
            case 4:
                return C3540l.m9223a(((Integer) obj).intValue());
            case 5:
                ((Long) obj).longValue();
                Logger logger3 = C3540l.f12507b;
                return 8;
            case 6:
                ((Integer) obj).intValue();
                Logger logger4 = C3540l.f12507b;
                return 4;
            case 7:
                ((Boolean) obj).booleanValue();
                Logger logger5 = C3540l.f12507b;
                return 1;
            case 8:
                if (obj instanceof C3508i) {
                    return C3540l.m9234a((C3508i) obj);
                }
                return C3540l.m9235a((String) obj);
            case 9:
                Logger logger6 = C3540l.f12507b;
                return ((C3564q0) obj).getSerializedSize();
            case 10:
                if (!(obj instanceof C3483c0)) {
                    Logger logger7 = C3540l.f12507b;
                    serializedSize = ((C3564q0) obj).getSerializedSize();
                    c = C3540l.m9241c(serializedSize);
                    break;
                } else {
                    return C3540l.m9233a((C3488d0) (C3483c0) obj);
                }
            case 11:
                if (!(obj instanceof C3508i)) {
                    Logger logger8 = C3540l.f12507b;
                    serializedSize = ((byte[]) obj).length;
                    c = C3540l.m9241c(serializedSize);
                    break;
                } else {
                    return C3540l.m9234a((C3508i) obj);
                }
            case 12:
                return C3540l.m9241c(((Integer) obj).intValue());
            case 13:
                if (obj instanceof C3609z.C3612c) {
                    return C3540l.m9223a(((C3609z.C3612c) obj).mo13014a());
                }
                return C3540l.m9223a(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).intValue();
                Logger logger9 = C3540l.f12507b;
                return 4;
            case 15:
                ((Long) obj).longValue();
                Logger logger10 = C3540l.f12507b;
                return 8;
            case 16:
                return C3540l.m9241c(C3540l.m9244d(((Integer) obj).intValue()));
            case 17:
                return C3540l.m9232a(C3540l.m9240b(((Long) obj).longValue()));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return c + serializedSize;
    }
}
