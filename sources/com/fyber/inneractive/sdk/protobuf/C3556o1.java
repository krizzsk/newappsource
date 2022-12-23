package com.fyber.inneractive.sdk.protobuf;

import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.protobuf.o1 */
public class C3556o1 extends C3550m1<C3553n1, C3553n1> {
    /* renamed from: a */
    public void mo15108a(Object obj, int i, int i2) {
        ((C3553n1) obj).mo15136a(C3584t1.m9573a(i, 5), (Object) Integer.valueOf(i2));
    }

    /* renamed from: a */
    public boolean mo15113a(C3493e1 e1Var) {
        return false;
    }

    /* renamed from: b */
    public void mo15116b(Object obj, int i, long j) {
        ((C3553n1) obj).mo15136a(C3584t1.m9573a(i, 0), (Object) Long.valueOf(j));
    }

    /* renamed from: c */
    public int mo15119c(Object obj) {
        return ((C3553n1) obj).mo15139b();
    }

    /* renamed from: d */
    public int mo15121d(Object obj) {
        C3553n1 n1Var = (C3553n1) obj;
        int i = n1Var.f12528d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < n1Var.f12525a; i3++) {
            int i4 = n1Var.f12526b[i3];
            int i5 = C3584t1.f12572a;
            int f = C3540l.m9249f(2, i4 >>> 3);
            i2 += C3540l.m9228a(3, (C3508i) n1Var.f12527c[i3]) + f + (C3540l.m9237b(1) * 2);
        }
        n1Var.f12528d = i2;
        return i2;
    }

    /* renamed from: e */
    public void mo15122e(Object obj) {
        ((GeneratedMessageLite) obj).unknownFields.f12529e = false;
    }

    /* renamed from: f */
    public Object mo15123f(Object obj) {
        C3553n1 n1Var = (C3553n1) obj;
        n1Var.f12529e = false;
        return n1Var;
    }

    /* renamed from: a */
    public void mo15109a(Object obj, int i, long j) {
        ((C3553n1) obj).mo15136a(C3584t1.m9573a(i, 1), (Object) Long.valueOf(j));
    }

    /* renamed from: b */
    public void mo15118b(Object obj, Object obj2) {
        ((GeneratedMessageLite) obj).unknownFields = (C3553n1) obj2;
    }

    /* renamed from: c */
    public void mo15120c(Object obj, Object obj2) {
        ((GeneratedMessageLite) obj).unknownFields = (C3553n1) obj2;
    }

    /* renamed from: a */
    public void mo15111a(Object obj, int i, Object obj2) {
        ((C3553n1) obj).mo15136a(C3584t1.m9573a(i, 3), (Object) (C3553n1) obj2);
    }

    /* renamed from: b */
    public void mo15117b(Object obj, C3599u1 u1Var) throws IOException {
        ((C3553n1) obj).mo15137a(u1Var);
    }

    /* renamed from: a */
    public void mo15110a(Object obj, int i, C3508i iVar) {
        ((C3553n1) obj).mo15136a(C3584t1.m9573a(i, 2), (Object) iVar);
    }

    /* renamed from: b */
    public Object mo15115b(Object obj) {
        return ((GeneratedMessageLite) obj).unknownFields;
    }

    /* renamed from: a */
    public Object mo15107a(Object obj, Object obj2) {
        C3553n1 n1Var = (C3553n1) obj;
        C3553n1 n1Var2 = (C3553n1) obj2;
        return n1Var2.equals(C3553n1.f12524f) ? n1Var : C3553n1.m9370a(n1Var, n1Var2);
    }

    /* renamed from: a */
    public void mo15112a(Object obj, C3599u1 u1Var) throws IOException {
        C3553n1 n1Var = (C3553n1) obj;
        n1Var.getClass();
        u1Var.getClass();
        for (int i = 0; i < n1Var.f12525a; i++) {
            int i2 = n1Var.f12526b[i];
            int i3 = C3584t1.f12572a;
            ((C3548m) u1Var).mo15102a(i2 >>> 3, n1Var.f12527c[i]);
        }
    }

    /* renamed from: a */
    public Object mo15105a() {
        return C3553n1.m9372c();
    }

    /* renamed from: a */
    public Object mo15106a(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        C3553n1 n1Var = generatedMessageLite.unknownFields;
        if (n1Var != C3553n1.f12524f) {
            return n1Var;
        }
        C3553n1 c = C3553n1.m9372c();
        generatedMessageLite.unknownFields = c;
        return c;
    }
}
