package p790sf;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.recyclerview.widget.RecyclerView;
import p626lf.C18200a;

/* renamed from: sf.e */
public final class C19458e {

    /* renamed from: a */
    public static Boolean f49478a;

    /* renamed from: a */
    public static boolean m46855a(Context context) {
        Boolean bool = f49478a;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Boolean valueOf = Boolean.valueOf(context.getPackageManager().getApplicationInfo(context.getPackageName(), RecyclerView.C1119a0.FLAG_IGNORE).metaData.getBoolean("firebase_performance_logcat_enabled", false));
            f49478a = valueOf;
            return valueOf.booleanValue();
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            C18200a d = C18200a.m44901d();
            e.getMessage();
            d.mo50610a();
            return false;
        }
    }

    /* renamed from: b */
    public static int m46856b(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }
}
