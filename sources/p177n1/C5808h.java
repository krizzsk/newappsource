package p177n1;

import android.os.Build;
import android.p014os.LocaleList;
import java.util.Locale;

/* renamed from: n1.h */
public final class C5808h {

    /* renamed from: b */
    public static final /* synthetic */ int f18757b = 0;

    /* renamed from: a */
    public final C5811j f18758a;

    /* renamed from: n1.h$a */
    public static class C5809a {
        /* renamed from: a */
        public static LocaleList m14240a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        /* renamed from: b */
        public static LocaleList m14241b() {
            return LocaleList.getAdjustedDefault();
        }

        /* renamed from: c */
        public static LocaleList m14242c() {
            return LocaleList.getDefault();
        }
    }

    static {
        Locale[] localeArr = new Locale[0];
        if (Build.VERSION.SDK_INT >= 24) {
            C5809a.m14240a(localeArr);
        } else {
            new C5810i(localeArr);
        }
    }

    public C5808h(C5811j jVar) {
        this.f18758a = jVar;
    }

    /* renamed from: a */
    public final Locale mo21675a(int i) {
        return this.f18758a.get(i);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C5808h) && this.f18758a.equals(((C5808h) obj).f18758a);
    }

    public final int hashCode() {
        return this.f18758a.hashCode();
    }

    public final String toString() {
        return this.f18758a.toString();
    }
}
