package kotlin.reflect.jvm.internal.impl.metadata;

import kotlin.reflect.jvm.internal.impl.protobuf.C24084f;

public enum ProtoBuf$Visibility implements C24084f.C24085a {
    INTERNAL(0, 0),
    PRIVATE(1, 1),
    PROTECTED(2, 2),
    PUBLIC(3, 3),
    PRIVATE_TO_THIS(4, 4),
    LOCAL(5, 5);
    
    private static C24084f.C24086b<ProtoBuf$Visibility> internalValueMap;
    private final int value;

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility$a */
    public static class C24050a implements C24084f.C24086b<ProtoBuf$Visibility> {
        /* renamed from: a */
        public final C24084f.C24085a mo59642a(int i) {
            return ProtoBuf$Visibility.valueOf(i);
        }
    }

    /* access modifiers changed from: public */
    static {
        internalValueMap = new C24050a();
    }

    private ProtoBuf$Visibility(int i, int i2) {
        this.value = i2;
    }

    public final int getNumber() {
        return this.value;
    }

    public static ProtoBuf$Visibility valueOf(int i) {
        if (i == 0) {
            return INTERNAL;
        }
        if (i == 1) {
            return PRIVATE;
        }
        if (i == 2) {
            return PROTECTED;
        }
        if (i == 3) {
            return PUBLIC;
        }
        if (i == 4) {
            return PRIVATE_TO_THIS;
        }
        if (i != 5) {
            return null;
        }
        return LOCAL;
    }
}
