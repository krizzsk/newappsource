package com.umo.ads.p351v;

import android.content.SharedPreferences;
import bf0.C21049c;
import kotlin.C23812a;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;
import mf0.C24362h;
import wb0.C13233c;

/* renamed from: com.umo.ads.v.zza */
public final class zza {

    /* renamed from: a */
    public static final C21049c f30891a = C23812a.m58432b(C26273zza.f30892f);

    /* renamed from: com.umo.ads.v.zza$zza  reason: collision with other inner class name */
    public static final class C26273zza extends Lambda implements C24225a<SharedPreferences> {

        /* renamed from: f */
        public static final C26273zza f30892f = new C26273zza();

        public C26273zza() {
            super(0);
        }

        public final Object invoke() {
            return C13233c.m33333b().getSharedPreferences("UMOAK_PREFERENCES", 0);
        }
    }

    /* renamed from: a */
    public static String m32114a(String str) {
        C24362h.m61211f(str, LinksConfiguration.KEY_KEY);
        return ((SharedPreferences) f30891a.getValue()).getString(str, (String) null);
    }

    /* renamed from: b */
    public static void m32115b(String str, String str2) {
        C24362h.m61211f(str, LinksConfiguration.KEY_KEY);
        ((SharedPreferences) f30891a.getValue()).edit().putString(str, str2).apply();
    }

    /* renamed from: c */
    public static void m32116c(String str) {
        C21049c cVar = f30891a;
        if (((SharedPreferences) cVar.getValue()).contains(str)) {
            ((SharedPreferences) cVar.getValue()).edit().remove(str).apply();
        }
    }
}
