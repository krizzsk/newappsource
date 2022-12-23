package kotlin.reflect.jvm.internal.impl.metadata;

import kotlin.reflect.jvm.internal.impl.protobuf.C24084f;

public enum ProtoBuf$MemberKind implements C24084f.C24085a {
    DECLARATION(0, 0),
    FAKE_OVERRIDE(1, 1),
    DELEGATION(2, 2),
    SYNTHESIZED(3, 3);
    
    private static C24084f.C24086b<ProtoBuf$MemberKind> internalValueMap;
    private final int value;

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$MemberKind$a */
    public static class C24015a implements C24084f.C24086b<ProtoBuf$MemberKind> {
        /* renamed from: a */
        public final C24084f.C24085a mo59642a(int i) {
            return ProtoBuf$MemberKind.valueOf(i);
        }
    }

    /* access modifiers changed from: public */
    static {
        internalValueMap = new C24015a();
    }

    private ProtoBuf$MemberKind(int i, int i2) {
        this.value = i2;
    }

    public final int getNumber() {
        return this.value;
    }

    public static ProtoBuf$MemberKind valueOf(int i) {
        if (i == 0) {
            return DECLARATION;
        }
        if (i == 1) {
            return FAKE_OVERRIDE;
        }
        if (i == 2) {
            return DELEGATION;
        }
        if (i != 3) {
            return null;
        }
        return SYNTHESIZED;
    }
}
