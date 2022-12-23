package p030bo.app;

import android.annotation.TargetApi;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import com.appboy.support.AppboyLogger;

/* renamed from: bo.app.h4 */
public class C1596h4 {

    /* renamed from: a */
    public static final String f5744a = AppboyLogger.getBrazeLogTag(C1596h4.class);

    /* renamed from: a */
    public static C1563e0 m4299a(Intent intent, ConnectivityManager connectivityManager) {
        String action = intent.getAction();
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                boolean booleanExtra = intent.getBooleanExtra("noConnectivity", false);
                if (activeNetworkInfo == null || booleanExtra) {
                    return C1563e0.NONE;
                }
                int type = activeNetworkInfo.getType();
                if (type == 0) {
                    int subtype = activeNetworkInfo.getSubtype();
                    if (subtype == 3) {
                        return C1563e0.GOOD;
                    }
                    if (subtype == 13 || subtype == 20) {
                        return C1563e0.GREAT;
                    }
                    return C1563e0.BAD;
                } else if (type == 1 || type == 6) {
                    return C1563e0.GREAT;
                } else {
                    if (type != 9) {
                        return C1563e0.NONE;
                    }
                    return C1563e0.GOOD;
                }
            } catch (SecurityException e) {
                AppboyLogger.m5452e(f5744a, "Failed to get active network information. Ensure the permission android.permission.ACCESS_NETWORK_STATE is defined in your AndroidManifest.xml", e);
                return C1563e0.NONE;
            }
        } else {
            String str = f5744a;
            AppboyLogger.m5459w(str, "Unexpected system broadcast received [" + action + "]");
            return C1563e0.NONE;
        }
    }

    @TargetApi(30)
    /* renamed from: a */
    public static C1563e0 m4300a(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities == null) {
            return C1563e0.NONE;
        }
        int min = Math.min(networkCapabilities.getLinkDownstreamBandwidthKbps(), networkCapabilities.getLinkUpstreamBandwidthKbps());
        String str = f5744a;
        AppboyLogger.m5457v(str, "Capabilities changed. Min bidirectional bandwidth in kbps: " + min);
        if (min > 14000) {
            return C1563e0.GREAT;
        }
        if (min > 4000) {
            return C1563e0.GOOD;
        }
        return C1563e0.BAD;
    }
}
