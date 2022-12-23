package aa0;

import com.google.android.material.textfield.TextInputLayout;
import p977zz.C20964s0;

/* renamed from: aa0.q */
public final class C7546q {

    /* renamed from: aa0.q$a */
    public interface C7547a {

        /* renamed from: a */
        public static final C7548a f23031a = new C7548a();

        /* renamed from: b */
        public static final C7550c f23032b = new C7550c();

        /* renamed from: aa0.q$a$a */
        public class C7548a extends C7552e {
            /* renamed from: a */
            public final boolean mo23810a(TextInputLayout textInputLayout) {
                return !C20964s0.m49090h(C7546q.m17287a(textInputLayout));
            }
        }

        /* renamed from: aa0.q$a$b */
        public class C7549b extends C7552e {
            /* renamed from: a */
            public final boolean mo23810a(TextInputLayout textInputLayout) {
                return !C20964s0.m49090h(C7546q.m17287a(textInputLayout).trim());
            }
        }

        /* renamed from: aa0.q$a$c */
        public class C7550c extends C7552e {
            /* renamed from: a */
            public final boolean mo23810a(TextInputLayout textInputLayout) {
                return C20964s0.m49093k(C7546q.m17287a(textInputLayout));
            }
        }

        /* renamed from: aa0.q$a$d */
        public class C7551d extends C7552e {
            /* renamed from: a */
            public final boolean mo23810a(TextInputLayout textInputLayout) {
                String a = C7546q.m17287a(textInputLayout);
                if (C20964s0.m49090h(a) || a.length() < 6) {
                    return false;
                }
                return true;
            }
        }

        /* renamed from: aa0.q$a$e */
        public static abstract class C7552e implements C7547a {
            /* renamed from: a */
            public abstract boolean mo23810a(TextInputLayout textInputLayout);
        }

        static {
            new C7549b();
            new C7551d();
        }
    }

    /* renamed from: a */
    public static String m17287a(TextInputLayout textInputLayout) {
        return textInputLayout.getEditText().getText().toString();
    }

    /* renamed from: b */
    public static void m17288b(TextInputLayout textInputLayout, String str) {
        boolean z;
        if (str != null) {
            z = true;
        } else {
            z = false;
        }
        textInputLayout.setErrorEnabled(z);
        textInputLayout.setError(str);
    }
}
