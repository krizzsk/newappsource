package p977zz;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* renamed from: zz.k */
public final class C20947k {
    /* renamed from: a */
    public static boolean m49056a(Context context) {
        NetworkInfo networkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null) {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } else {
            networkInfo = null;
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m49057b(Context context) {
        NetworkInfo networkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (!C20943i.m49051d(16)) {
            if (connectivityManager != null) {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } else {
                networkInfo = null;
            }
            if (networkInfo == null || networkInfo.getType() != 1) {
                return true;
            }
            return false;
        } else if (connectivityManager == null || !connectivityManager.isActiveNetworkMetered()) {
            return false;
        } else {
            return true;
        }
    }
}
