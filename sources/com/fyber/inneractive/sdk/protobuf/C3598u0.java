package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.C3483c0;
import com.fyber.inneractive.sdk.protobuf.C3584t1;
import com.fyber.inneractive.sdk.protobuf.C3596u;
import com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.protobuf.u0 */
public final class C3598u0<T> implements C3498f1<T> {

    /* renamed from: a */
    public final C3564q0 f12615a;

    /* renamed from: b */
    public final C3550m1<?, ?> f12616b;

    /* renamed from: c */
    public final boolean f12617c;

    /* renamed from: d */
    public final C3567r<?> f12618d;

    public C3598u0(C3550m1<?, ?> m1Var, C3567r<?> rVar, C3564q0 q0Var) {
        this.f12616b = m1Var;
        this.f12617c = rVar.mo15164a(q0Var);
        this.f12618d = rVar;
        this.f12615a = q0Var;
    }

    /* renamed from: a */
    public T mo14890a() {
        return ((GeneratedMessageLite.C3465a) this.f12615a.newBuilderForType()).mo14760b();
    }

    /* renamed from: b */
    public boolean mo14897b(T t, T t2) {
        if (!this.f12616b.mo15115b(t).equals(this.f12616b.mo15115b(t2))) {
            return false;
        }
        if (this.f12617c) {
            return this.f12618d.mo15158a((Object) t).equals(this.f12618d.mo15158a((Object) t2));
        }
        return true;
    }

    /* renamed from: c */
    public void mo14898c(T t) {
        this.f12616b.mo15122e(t);
        this.f12618d.mo15166c(t);
    }

    /* renamed from: d */
    public int mo14899d(T t) {
        int hashCode = this.f12616b.mo15115b(t).hashCode();
        if (this.f12617c) {
            return (hashCode * 53) + this.f12618d.mo15158a((Object) t).f12612a.hashCode();
        }
        return hashCode;
    }

    /* renamed from: a */
    public void mo14893a(T t, T t2) {
        C3550m1<?, ?> m1Var = this.f12616b;
        Class<?> cls = C3507h1.f12439a;
        m1Var.mo15120c(t, m1Var.mo15107a(m1Var.mo15115b(t), m1Var.mo15115b(t2)));
        if (this.f12617c) {
            C3567r<?> rVar = this.f12618d;
            C3596u<?> a = rVar.mo15158a((Object) t2);
            if (!a.f12612a.isEmpty()) {
                rVar.mo15165b(t).mo15216a(a);
            }
        }
    }

    /* renamed from: b */
    public int mo14896b(T t) {
        C3550m1<?, ?> m1Var = this.f12616b;
        int d = m1Var.mo15121d(m1Var.mo15115b(t)) + 0;
        return this.f12617c ? d + this.f12618d.mo15158a((Object) t).mo15217c() : d;
    }

    /* renamed from: a */
    public void mo14892a(T t, C3599u1 u1Var) throws IOException {
        Iterator<Map.Entry<?, Object>> f = this.f12618d.mo15158a((Object) t).mo15225f();
        while (f.hasNext()) {
            Map.Entry next = f.next();
            C3596u.C3597a aVar = (C3596u.C3597a) next.getKey();
            if (aVar.mo14768d() != C3584t1.C3591c.MESSAGE || aVar.mo14765b() || aVar.mo14769e()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (next instanceof C3483c0.C3484a) {
                ((C3548m) u1Var).mo15102a(aVar.mo14763a(), (Object) ((C3483c0.C3484a) next).f12406a.getValue().mo14814a());
            } else {
                ((C3548m) u1Var).mo15102a(aVar.mo14763a(), next.getValue());
            }
        }
        C3550m1<?, ?> m1Var = this.f12616b;
        m1Var.mo15112a(m1Var.mo15115b(t), u1Var);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$d} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo14894a(T r11, byte[] r12, int r13, int r14, com.fyber.inneractive.sdk.protobuf.C3490e.C3491a r15) throws java.io.IOException {
        /*
            r10 = this;
            r0 = r11
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite r0 = (com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite) r0
            com.fyber.inneractive.sdk.protobuf.n1 r1 = r0.unknownFields
            com.fyber.inneractive.sdk.protobuf.n1 r2 = com.fyber.inneractive.sdk.protobuf.C3553n1.f12524f
            if (r1 != r2) goto L_0x000f
            com.fyber.inneractive.sdk.protobuf.n1 r1 = com.fyber.inneractive.sdk.protobuf.C3553n1.m9372c()
            r0.unknownFields = r1
        L_0x000f:
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$ExtendableMessage r11 = (com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite.ExtendableMessage) r11
            com.fyber.inneractive.sdk.protobuf.u r11 = r11.ensureExtensionsAreMutable()
            r0 = 0
            r2 = r0
        L_0x0017:
            if (r13 >= r14) goto L_0x00c5
            int r4 = com.fyber.inneractive.sdk.protobuf.C3490e.m8765d(r12, r13, r15)
            int r13 = r15.f12419a
            int r3 = com.fyber.inneractive.sdk.protobuf.C3584t1.f12572a
            r5 = 2
            if (r13 == r3) goto L_0x0061
            r3 = r13 & 7
            if (r3 != r5) goto L_0x005c
            com.fyber.inneractive.sdk.protobuf.r<?> r2 = r10.f12618d
            com.fyber.inneractive.sdk.protobuf.q r3 = r15.f12422d
            com.fyber.inneractive.sdk.protobuf.q0 r5 = r10.f12615a
            int r6 = r13 >>> 3
            java.lang.Object r2 = r2.mo15160a(r3, r5, r6)
            r8 = r2
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$d r8 = (com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite.C3468d) r8
            if (r8 == 0) goto L_0x0051
            com.fyber.inneractive.sdk.protobuf.b1 r13 = com.fyber.inneractive.sdk.protobuf.C3481b1.f12402c
            com.fyber.inneractive.sdk.protobuf.q0 r2 = r8.f12375c
            java.lang.Class r2 = r2.getClass()
            com.fyber.inneractive.sdk.protobuf.f1 r13 = r13.mo14786a(r2)
            int r13 = com.fyber.inneractive.sdk.protobuf.C3490e.m8756a((com.fyber.inneractive.sdk.protobuf.C3498f1) r13, (byte[]) r12, (int) r4, (int) r14, (com.fyber.inneractive.sdk.protobuf.C3490e.C3491a) r15)
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r2 = r8.f12376d
            java.lang.Object r3 = r15.f12421c
            r11.mo15218c(r2, r3)
            goto L_0x005a
        L_0x0051:
            r2 = r13
            r3 = r12
            r5 = r14
            r6 = r1
            r7 = r15
            int r13 = com.fyber.inneractive.sdk.protobuf.C3490e.m8751a((int) r2, (byte[]) r3, (int) r4, (int) r5, (com.fyber.inneractive.sdk.protobuf.C3553n1) r6, (com.fyber.inneractive.sdk.protobuf.C3490e.C3491a) r7)
        L_0x005a:
            r2 = r8
            goto L_0x0017
        L_0x005c:
            int r13 = com.fyber.inneractive.sdk.protobuf.C3490e.m8750a((int) r13, (byte[]) r12, (int) r4, (int) r14, (com.fyber.inneractive.sdk.protobuf.C3490e.C3491a) r15)
            goto L_0x0017
        L_0x0061:
            r13 = 0
            r3 = r0
        L_0x0063:
            if (r4 >= r14) goto L_0x00b9
            int r4 = com.fyber.inneractive.sdk.protobuf.C3490e.m8765d(r12, r4, r15)
            int r6 = r15.f12419a
            int r7 = r6 >>> 3
            r8 = r6 & 7
            if (r7 == r5) goto L_0x009a
            r9 = 3
            if (r7 == r9) goto L_0x0075
            goto L_0x00af
        L_0x0075:
            if (r2 == 0) goto L_0x008f
            com.fyber.inneractive.sdk.protobuf.b1 r6 = com.fyber.inneractive.sdk.protobuf.C3481b1.f12402c
            com.fyber.inneractive.sdk.protobuf.q0 r7 = r2.f12375c
            java.lang.Class r7 = r7.getClass()
            com.fyber.inneractive.sdk.protobuf.f1 r6 = r6.mo14786a(r7)
            int r4 = com.fyber.inneractive.sdk.protobuf.C3490e.m8756a((com.fyber.inneractive.sdk.protobuf.C3498f1) r6, (byte[]) r12, (int) r4, (int) r14, (com.fyber.inneractive.sdk.protobuf.C3490e.C3491a) r15)
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r6 = r2.f12376d
            java.lang.Object r7 = r15.f12421c
            r11.mo15218c(r6, r7)
            goto L_0x0063
        L_0x008f:
            if (r8 != r5) goto L_0x00af
            int r4 = com.fyber.inneractive.sdk.protobuf.C3490e.m8758a(r12, r4, r15)
            java.lang.Object r3 = r15.f12421c
            com.fyber.inneractive.sdk.protobuf.i r3 = (com.fyber.inneractive.sdk.protobuf.C3508i) r3
            goto L_0x0063
        L_0x009a:
            if (r8 != 0) goto L_0x00af
            int r4 = com.fyber.inneractive.sdk.protobuf.C3490e.m8765d(r12, r4, r15)
            int r13 = r15.f12419a
            com.fyber.inneractive.sdk.protobuf.r<?> r2 = r10.f12618d
            com.fyber.inneractive.sdk.protobuf.q r6 = r15.f12422d
            com.fyber.inneractive.sdk.protobuf.q0 r7 = r10.f12615a
            java.lang.Object r2 = r2.mo15160a(r6, r7, r13)
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$d r2 = (com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite.C3468d) r2
            goto L_0x0063
        L_0x00af:
            int r7 = com.fyber.inneractive.sdk.protobuf.C3584t1.f12573b
            if (r6 != r7) goto L_0x00b4
            goto L_0x00b9
        L_0x00b4:
            int r4 = com.fyber.inneractive.sdk.protobuf.C3490e.m8750a((int) r6, (byte[]) r12, (int) r4, (int) r14, (com.fyber.inneractive.sdk.protobuf.C3490e.C3491a) r15)
            goto L_0x0063
        L_0x00b9:
            if (r3 == 0) goto L_0x00c2
            int r13 = com.fyber.inneractive.sdk.protobuf.C3584t1.m9573a(r13, r5)
            r1.mo15136a((int) r13, (java.lang.Object) r3)
        L_0x00c2:
            r13 = r4
            goto L_0x0017
        L_0x00c5:
            if (r13 != r14) goto L_0x00c8
            return
        L_0x00c8:
            com.fyber.inneractive.sdk.protobuf.a0 r11 = com.fyber.inneractive.sdk.protobuf.C3476a0.m8733g()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.C3598u0.mo14894a(java.lang.Object, byte[], int, int, com.fyber.inneractive.sdk.protobuf.e$a):void");
    }

    /* renamed from: a */
    public void mo14891a(T t, C3493e1 e1Var, C3562q qVar) throws IOException {
        C3550m1<?, ?> m1Var = this.f12616b;
        C3567r<?> rVar = this.f12618d;
        Object a = m1Var.mo15106a((Object) t);
        C3596u<?> b = rVar.mo15165b(t);
        while (true) {
            try {
                if (e1Var.mo14869s() != Integer.MAX_VALUE) {
                    if (!mo15228a(e1Var, qVar, rVar, b, m1Var, a)) {
                        break;
                    }
                } else {
                    break;
                }
            } finally {
                m1Var.mo15118b((Object) t, a);
            }
        }
    }

    /* renamed from: a */
    public final <UT, UB, ET extends C3596u.C3597a<ET>> boolean mo15228a(C3493e1 e1Var, C3562q qVar, C3567r<ET> rVar, C3596u<ET> uVar, C3550m1<UT, UB> m1Var, UB ub) throws IOException {
        int e = e1Var.mo14842e();
        if (e == C3584t1.f12572a) {
            int i = 0;
            Object obj = null;
            C3508i iVar = null;
            while (e1Var.mo14869s() != Integer.MAX_VALUE) {
                int e2 = e1Var.mo14842e();
                if (e2 == C3584t1.f12574c) {
                    i = e1Var.mo14838c();
                    obj = rVar.mo15160a(qVar, this.f12615a, i);
                } else if (e2 == C3584t1.f12575d) {
                    if (obj != null) {
                        rVar.mo15161a(e1Var, obj, qVar, uVar);
                    } else {
                        iVar = e1Var.mo14827a();
                    }
                } else if (!e1Var.mo14851i()) {
                    break;
                }
            }
            if (e1Var.mo14842e() == C3584t1.f12573b) {
                if (iVar != null) {
                    if (obj != null) {
                        rVar.mo15162a(iVar, obj, qVar, uVar);
                    } else {
                        m1Var.mo15110a(ub, i, iVar);
                    }
                }
                return true;
            }
            throw C3476a0.m8727a();
        } else if ((e & 7) != 2) {
            return e1Var.mo14851i();
        } else {
            Object a = rVar.mo15160a(qVar, this.f12615a, e >>> 3);
            if (a == null) {
                return m1Var.mo15114a(ub, e1Var);
            }
            rVar.mo15161a(e1Var, a, qVar, uVar);
            return true;
        }
    }

    /* renamed from: a */
    public final boolean mo14895a(T t) {
        return this.f12618d.mo15158a((Object) t).mo15223e();
    }
}
