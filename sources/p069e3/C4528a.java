package p069e3;

import android.os.Build;
import java.util.Arrays;
import java.util.HashSet;
import p069e3.C4540e;

/* renamed from: e3.a */
public abstract class C4528a implements C4538c {

    /* renamed from: c */
    public static final HashSet f15651c = new HashSet();

    /* renamed from: a */
    public final String f15652a;

    /* renamed from: b */
    public final String f15653b;

    /* renamed from: e3.a$a */
    public static class C4529a {

        /* renamed from: a */
        public static final HashSet f15654a = new HashSet(Arrays.asList(C4540e.C4542b.f15658a.mo20045d()));
    }

    /* renamed from: e3.a$b */
    public static final class C4530b extends C4528a {
        public C4530b(String str, String str2) {
            super(str, str2);
        }

        /* renamed from: c */
        public final boolean mo20043c() {
            return Build.VERSION.SDK_INT >= 23;
        }
    }

    /* renamed from: e3.a$c */
    public static final class C4531c extends C4528a {
        public C4531c(String str, String str2) {
            super(str, str2);
        }

        /* renamed from: c */
        public final boolean mo20043c() {
            return Build.VERSION.SDK_INT >= 24;
        }
    }

    /* renamed from: e3.a$d */
    public static final class C4532d extends C4528a {
        public C4532d(String str, String str2) {
            super(str, str2);
        }

        /* renamed from: c */
        public final boolean mo20043c() {
            return false;
        }
    }

    /* renamed from: e3.a$e */
    public static final class C4533e extends C4528a {
        public C4533e(String str, String str2) {
            super(str, str2);
        }

        /* renamed from: c */
        public final boolean mo20043c() {
            return Build.VERSION.SDK_INT >= 26;
        }
    }

    /* renamed from: e3.a$f */
    public static final class C4534f extends C4528a {
        public C4534f(String str, String str2) {
            super(str, str2);
        }

        /* renamed from: c */
        public final boolean mo20043c() {
            return Build.VERSION.SDK_INT >= 27;
        }
    }

    /* renamed from: e3.a$g */
    public static final class C4535g extends C4528a {
        public C4535g() {
            super("TRACING_CONTROLLER_BASIC_USAGE", "TRACING_CONTROLLER_BASIC_USAGE");
        }

        /* renamed from: c */
        public final boolean mo20043c() {
            return Build.VERSION.SDK_INT >= 28;
        }
    }

    /* renamed from: e3.a$h */
    public static final class C4536h extends C4528a {
        public C4536h(String str, String str2) {
            super(str, str2);
        }

        /* renamed from: c */
        public final boolean mo20043c() {
            return Build.VERSION.SDK_INT >= 29;
        }
    }

    public C4528a(String str, String str2) {
        this.f15652a = str;
        this.f15653b = str2;
        f15651c.add(this);
    }

    /* renamed from: a */
    public final boolean mo20041a() {
        return mo20043c() || mo20044d();
    }

    /* renamed from: b */
    public final String mo20042b() {
        return this.f15652a;
    }

    /* renamed from: c */
    public abstract boolean mo20043c();

    /* renamed from: d */
    public final boolean mo20044d() {
        boolean z;
        HashSet hashSet = C4529a.f15654a;
        String str = this.f15653b;
        if (!hashSet.contains(str)) {
            String str2 = Build.TYPE;
            if ("eng".equals(str2) || "userdebug".equals(str2)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return false;
            }
            if (hashSet.contains(str + ":dev")) {
                return true;
            }
            return false;
        }
        return true;
    }
}
