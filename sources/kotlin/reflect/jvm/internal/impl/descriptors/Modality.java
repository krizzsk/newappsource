package kotlin.reflect.jvm.internal.impl.descriptors;

public enum Modality {
    FINAL,
    SEALED,
    OPEN,
    ABSTRACT;
    
    public static final C23887a Companion = null;

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.Modality$a */
    public static final class C23887a {
        /* renamed from: a */
        public static Modality m58738a(boolean z, boolean z2, boolean z3) {
            if (z) {
                return Modality.SEALED;
            }
            if (z2) {
                return Modality.ABSTRACT;
            }
            if (z3) {
                return Modality.OPEN;
            }
            return Modality.FINAL;
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new C23887a();
    }
}
