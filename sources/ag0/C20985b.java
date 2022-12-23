package ag0;

/* renamed from: ag0.b */
public class C20985b implements C20984a {

    /* renamed from: b */
    public final C20989e f52735b;

    public C20985b(C20989e eVar) {
        if (eVar != null) {
            this.f52735b = eVar;
        } else {
            m49136A(0);
            throw null;
        }
    }

    /* renamed from: A */
    public static /* synthetic */ void m49136A(int i) {
        String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i != 1 ? 3 : 2)];
        if (i != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i != 1) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        throw (i != 1 ? new IllegalArgumentException(format) : new IllegalStateException(format));
    }

    public C20989e getAnnotations() {
        C20989e eVar = this.f52735b;
        if (eVar != null) {
            return eVar;
        }
        m49136A(1);
        throw null;
    }
}
