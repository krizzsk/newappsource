package p081f3;

import android.annotation.SuppressLint;

/* renamed from: f3.j */
public interface C4660j {
    @SuppressLint({"SyntheticAccessor"})

    /* renamed from: a */
    public static final C4661a.C4664c f15901a = new C4661a.C4664c();
    @SuppressLint({"SyntheticAccessor"})

    /* renamed from: b */
    public static final C4661a.C4663b f15902b = new C4661a.C4663b();

    /* renamed from: f3.j$a */
    public static abstract class C4661a {

        /* renamed from: f3.j$a$a */
        public static final class C4662a extends C4661a {

            /* renamed from: a */
            public final Throwable f15903a;

            public C4662a(Throwable th) {
                this.f15903a = th;
            }

            public final String toString() {
                return String.format("FAILURE (%s)", new Object[]{this.f15903a.getMessage()});
            }
        }

        /* renamed from: f3.j$a$b */
        public static final class C4663b extends C4661a {
            public final String toString() {
                return "IN_PROGRESS";
            }
        }

        /* renamed from: f3.j$a$c */
        public static final class C4664c extends C4661a {
            public final String toString() {
                return "SUCCESS";
            }
        }
    }
}
