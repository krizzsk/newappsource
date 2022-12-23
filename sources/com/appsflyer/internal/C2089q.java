package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.appsflyer.AFLogger;

/* renamed from: com.appsflyer.internal.q */
public final class C2089q {

    /* renamed from: com.appsflyer.internal.q$c */
    public static final class C2090c {
        public final String $$a;
        public final String valueOf;
        public final String values;

        public C2090c(String str, String str2, String str3) {
            this.valueOf = str;
            this.$$a = str2;
            this.values = str3;
        }
    }

    /* renamed from: com.appsflyer.internal.q$e */
    public static final class C2091e {
        public static final C2089q values = new C2089q();
    }

    private static boolean $$a(NetworkInfo networkInfo) {
        return networkInfo != null && networkInfo.isConnectedOrConnecting();
    }

    public static C2090c $$b(Context context) {
        String str;
        String str2;
        String str3;
        String str4 = "unknown";
        String str5 = null;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null) {
                Network[] allNetworks = connectivityManager.getAllNetworks();
                int length = allNetworks.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    NetworkInfo networkInfo = connectivityManager.getNetworkInfo(allNetworks[i]);
                    if (!$$a(networkInfo)) {
                        i++;
                    } else if (1 == networkInfo.getType()) {
                        str4 = "WIFI";
                    } else if (networkInfo.getType() == 0) {
                        str4 = "MOBILE";
                    }
                }
            }
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            str = telephonyManager.getSimOperatorName();
            try {
                str2 = telephonyManager.getNetworkOperatorName();
                if ((str2 == null || str2.isEmpty()) && 2 == telephonyManager.getPhoneType()) {
                    str2 = "CDMA";
                }
            } catch (Throwable th) {
                th = th;
                String str6 = str;
                str3 = null;
                str5 = str6;
                AFLogger.afErrorLog("Exception while collecting network info. ", th);
                String str7 = str3;
                str = str5;
                str2 = str7;
                return new C2090c(str4, str2, str);
            }
        } catch (Throwable th2) {
            th = th2;
            str3 = null;
            AFLogger.afErrorLog("Exception while collecting network info. ", th);
            String str72 = str3;
            str = str5;
            str2 = str72;
            return new C2090c(str4, str2, str);
        }
        return new C2090c(str4, str2, str);
    }
}
