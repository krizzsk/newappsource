package rh0;

/* renamed from: rh0.e */
public final class C24826e {

    /* renamed from: a */
    public static final C24827a f62771a = new C24827a();

    /* renamed from: rh0.e$a */
    public static class C24827a {
        public final String toString() {
            return "NULL_VALUE";
        }
    }

    /* renamed from: rh0.e$b */
    public static final class C24828b {

        /* renamed from: a */
        public final Throwable f62772a;

        public C24828b(Throwable th) {
            this.f62772a = th;
        }

        /* renamed from: a */
        public static /* synthetic */ void m62359a(int i) {
            String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i != 1 ? 3 : 2)];
            if (i != 1) {
                objArr[0] = "throwable";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
            }
            if (i != 1) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
            } else {
                objArr[1] = "getThrowable";
            }
            if (i != 1) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            throw (i != 1 ? new IllegalArgumentException(format) : new IllegalStateException(format));
        }

        public final String toString() {
            return this.f62772a.toString();
        }
    }

    /* renamed from: a */
    public static void m62358a(Object obj) {
        if (obj instanceof C24828b) {
            Throwable th = ((C24828b) obj).f62772a;
            if (th != null) {
                throw th;
            }
            C24828b.m62359a(1);
            throw null;
        }
    }
}
