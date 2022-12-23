package p177n1;

import android.content.res.Configuration;
import android.os.Build;
import android.p014os.LocaleList;
import java.util.Locale;
import p177n1.C5808h;

/* renamed from: n1.e */
public final class C5804e {

    /* renamed from: n1.e$a */
    public static class C5805a {
        /* renamed from: a */
        public static LocaleList m14237a(Configuration configuration) {
            return configuration.getLocales();
        }
    }

    /* renamed from: a */
    public static C5808h m14236a(Configuration configuration) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            return new C5808h(new C5812k(C5805a.m14237a(configuration)));
        }
        Locale[] localeArr = {configuration.locale};
        if (i < 24) {
            return new C5808h(new C5810i(localeArr));
        }
        int i2 = C5808h.f18757b;
        return new C5808h(new C5812k(C5808h.C5809a.m14240a(localeArr)));
    }
}
