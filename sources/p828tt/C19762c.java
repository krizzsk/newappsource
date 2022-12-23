package p828tt;

import android.content.Context;
import android.content.SharedPreferences;
import f00.C16919g;

/* renamed from: tt.c */
public final class C19762c {

    /* renamed from: a */
    public static final C16919g.C16924e f50246a = new C16919g.C16924e("display_count", 1000000);

    /* renamed from: b */
    public static final C16919g.C16924e f50247b = new C16919g.C16924e("login_display_count", 1000000);

    /* renamed from: a */
    public static void m47215a(Context context, C16919g.C16924e eVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("on_boarding", 0);
        int intValue = eVar.mo19759a(sharedPreferences).intValue();
        int i = Integer.MAX_VALUE;
        if (intValue < Integer.MAX_VALUE) {
            i = intValue + 1;
        }
        eVar.mo49545d(sharedPreferences, Integer.valueOf(i));
    }
}
