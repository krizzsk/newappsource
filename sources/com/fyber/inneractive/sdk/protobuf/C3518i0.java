package com.fyber.inneractive.sdk.protobuf;

/* renamed from: com.fyber.inneractive.sdk.protobuf.i0 */
public final class C3518i0 implements C3504g1 {

    /* renamed from: b */
    public static final C3558p0 f12452b = new C3519a();

    /* renamed from: a */
    public final C3558p0 f12453a;

    /* renamed from: com.fyber.inneractive.sdk.protobuf.i0$a */
    public class C3519a implements C3558p0 {
        /* renamed from: a */
        public boolean mo14950a(Class<?> cls) {
            return false;
        }

        /* renamed from: b */
        public C3555o0 mo14951b(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.i0$b */
    public static class C3520b implements C3558p0 {

        /* renamed from: a */
        public C3558p0[] f12454a;

        public C3520b(C3558p0... p0VarArr) {
            this.f12454a = p0VarArr;
        }

        /* renamed from: a */
        public boolean mo14950a(Class<?> cls) {
            for (C3558p0 a : this.f12454a) {
                if (a.mo14950a(cls)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        public C3555o0 mo14951b(Class<?> cls) {
            for (C3558p0 p0Var : this.f12454a) {
                if (p0Var.mo14950a(cls)) {
                    return p0Var.mo14951b(cls);
                }
            }
            throw new UnsupportedOperationException(C25541a.m63876f(cls, C13555b.m33972k("No factory is available for message type: ")));
        }
    }

    public C3518i0() {
        this(m9005a());
    }

    /* renamed from: a */
    public static C3558p0 m9005a() {
        C3558p0 p0Var;
        C3558p0[] p0VarArr = new C3558p0[2];
        p0VarArr[0] = C3605x.f12634a;
        try {
            p0Var = (C3558p0) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            p0Var = f12452b;
        }
        p0VarArr[1] = p0Var;
        return new C3520b(p0VarArr);
    }

    public C3518i0(C3558p0 p0Var) {
        this.f12453a = (C3558p0) C3609z.m9638a(p0Var, "messageInfoFactory");
    }
}
