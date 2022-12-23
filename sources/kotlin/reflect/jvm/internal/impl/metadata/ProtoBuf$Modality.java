package kotlin.reflect.jvm.internal.impl.metadata;

import kotlin.reflect.jvm.internal.impl.protobuf.C24084f;

public enum ProtoBuf$Modality implements C24084f.C24085a {
    FINAL(0, 0),
    OPEN(1, 1),
    ABSTRACT(2, 2),
    SEALED(3, 3);
    
    private static C24084f.C24086b<ProtoBuf$Modality> internalValueMap;
    private final int value;

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Modality$a */
    public static class C24016a implements C24084f.C24086b<ProtoBuf$Modality> {
        /* renamed from: a */
        public final C24084f.C24085a mo59642a(int i) {
            return ProtoBuf$Modality.valueOf(i);
        }
    }

    /* access modifiers changed from: public */
    static {
        internalValueMap = new C24016a();
    }

    private ProtoBuf$Modality(int i, int i2) {
        this.value = i2;
    }

    public final int getNumber() {
        return this.value;
    }

    public static ProtoBuf$Modality valueOf(int i) {
        if (i == 0) {
            return FINAL;
        }
        if (i == 1) {
            return OPEN;
        }
        if (i == 2) {
            return ABSTRACT;
        }
        if (i != 3) {
            return null;
        }
        return SEALED;
    }
}
