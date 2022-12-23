package tf0;

import java.lang.ref.SoftReference;
import lf0.C24225a;

/* renamed from: tf0.i */
public final class C24973i {

    /* renamed from: tf0.i$a */
    public static class C24974a<T> extends C24976c<T> implements C24225a<T> {

        /* renamed from: c */
        public final C24225a<T> f63110c;

        /* renamed from: d */
        public volatile SoftReference<Object> f63111d;

        public C24974a(T t, C24225a<T> aVar) {
            if (aVar != null) {
                this.f63111d = null;
                this.f63110c = aVar;
                if (t != null) {
                    this.f63111d = new SoftReference<>(t);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal", "<init>"}));
        }

        public final T invoke() {
            T t;
            T t2;
            SoftReference<Object> softReference = this.f63111d;
            if (softReference == null || (t2 = softReference.get()) == null) {
                T invoke = this.f63110c.invoke();
                if (invoke == null) {
                    t = C24976c.f63114b;
                } else {
                    t = invoke;
                }
                this.f63111d = new SoftReference<>(t);
                return invoke;
            } else if (t2 == C24976c.f63114b) {
                return null;
            } else {
                return t2;
            }
        }
    }

    /* renamed from: tf0.i$b */
    public static class C24975b<T> extends C24976c<T> {

        /* renamed from: c */
        public final C24225a<T> f63112c;

        /* renamed from: d */
        public volatile Object f63113d = null;

        public C24975b(C24225a<T> aVar) {
            this.f63112c = aVar;
        }

        public final T invoke() {
            T t;
            T t2 = this.f63113d;
            if (t2 == null) {
                T invoke = this.f63112c.invoke();
                if (invoke == null) {
                    t = C24976c.f63114b;
                } else {
                    t = invoke;
                }
                this.f63113d = t;
                return invoke;
            } else if (t2 == C24976c.f63114b) {
                return null;
            } else {
                return t2;
            }
        }
    }

    /* renamed from: tf0.i$c */
    public static abstract class C24976c<T> {

        /* renamed from: b */
        public static final C24977a f63114b = new C24977a();

        /* renamed from: tf0.i$c$a */
        public static class C24977a {
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m62668a(int i) {
        Object[] objArr = new Object[3];
        objArr[0] = "initializer";
        objArr[1] = "kotlin/reflect/jvm/internal/ReflectProperties";
        if (i == 1 || i == 2) {
            objArr[2] = "lazySoft";
        } else {
            objArr[2] = "lazy";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* renamed from: b */
    public static <T> C24975b<T> m62669b(C24225a<T> aVar) {
        return new C24975b<>(aVar);
    }

    /* renamed from: c */
    public static <T> C24974a<T> m62670c(C24225a<T> aVar) {
        if (aVar != null) {
            return new C24974a<>(null, aVar);
        }
        m62668a(2);
        throw null;
    }
}
