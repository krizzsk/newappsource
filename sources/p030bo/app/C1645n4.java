package p030bo.app;

import android.content.Context;
import android.content.pm.PackageManager;
import com.appboy.support.AppboyLogger;
import com.google.android.gms.common.GoogleApiAvailability;

/* renamed from: bo.app.n4 */
public final class C1645n4 {

    /* renamed from: a */
    public static final String f5865a = AppboyLogger.getBrazeLogTag(C1645n4.class);

    /* renamed from: a */
    public static boolean m4526a(Context context) {
        int isGooglePlayServicesAvailable = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context);
        if (isGooglePlayServicesAvailable == 0) {
            AppboyLogger.m5448d(f5865a, "Google Play Services is available.");
            return true;
        }
        String str = f5865a;
        AppboyLogger.m5453i(str, "Google Play Services is unavailable. Connection result: " + isGooglePlayServicesAvailable);
        return false;
    }

    /* renamed from: b */
    public static boolean m4527b(Context context) {
        try {
            context.getPackageManager().getPackageInfo("com.google.android.gsf", 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        } catch (Exception unused2) {
            AppboyLogger.m5459w(f5865a, "Unexpected exception while checking for com.google.android.gsf");
            return false;
        }
    }
}
