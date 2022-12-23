package com.fyber.inneractive.sdk.protobuf;

/* renamed from: com.fyber.inneractive.sdk.protobuf.v */
public enum C3600v {
    DOUBLE_LIST_PACKED(35, r4, r8),
    SINT64_LIST_PACKED(48, r4, r12);
    

    /* renamed from: e */
    public static final C3600v[] f12621e = null;

    /* renamed from: a */
    public final int f12623a;

    /* renamed from: b */
    public final C3601a f12624b;

    /* renamed from: com.fyber.inneractive.sdk.protobuf.v$a */
    public enum C3601a {
        SCALAR(false),
        VECTOR(true),
        PACKED_VECTOR(true),
        MAP(false);
        

        /* renamed from: a */
        public final boolean f12630a;

        /* access modifiers changed from: public */
        C3601a(boolean z) {
            this.f12630a = z;
        }
    }

    /* access modifiers changed from: public */
    static {
        int i;
        C3600v[] values = values();
        f12621e = new C3600v[values.length];
        for (C3600v vVar : values) {
            f12621e[vVar.f12623a] = vVar;
        }
    }

    /* access modifiers changed from: public */
    C3600v(int i, C3601a aVar, C3480b0 b0Var) {
        this.f12623a = i;
        this.f12624b = aVar;
        int ordinal = aVar.ordinal();
        if (ordinal == 1) {
            b0Var.getClass();
        } else if (ordinal == 3) {
            b0Var.getClass();
        }
        if (aVar == C3601a.SCALAR) {
            b0Var.ordinal();
        }
    }
}
