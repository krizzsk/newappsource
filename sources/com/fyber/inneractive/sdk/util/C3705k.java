package com.fyber.inneractive.sdk.util;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;

/* renamed from: com.fyber.inneractive.sdk.util.k */
public class C3705k extends C3707l {

    /* renamed from: c */
    public static final /* synthetic */ int f12885c = 0;

    /* renamed from: a */
    public static boolean m9944a(Intent intent) {
        int i;
        try {
            i = C3707l.f12893a.getPackageManager().queryIntentActivities(intent, 0).size();
        } catch (Throwable unused) {
            i = 0;
        }
        if (i > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static String m9945g() {
        try {
            return ((TelephonyManager) C3707l.f12893a.getSystemService("phone")).getNetworkCountryIso();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: h */
    public static String m9946h() {
        return Build.MANUFACTURER + " " + Build.MODEL;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: i */
    public static int m9947i() {
        try {
            if (!C3707l.m9966b("android.permission.READ_PHONE_STATE")) {
                return 0;
            }
            TelephonyManager telephonyManager = (TelephonyManager) C3707l.f12893a.getSystemService("phone");
            if (Build.VERSION.SDK_INT >= 24) {
                return telephonyManager.getDataNetworkType();
            }
            return telephonyManager.getNetworkType();
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: j */
    public static String m9948j() {
        boolean z;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) C3707l.f12893a.getSystemService("phone");
            String networkOperator = telephonyManager.getNetworkOperator();
            if (telephonyManager.getPhoneType() != 2) {
                return networkOperator;
            }
            TelephonyManager telephonyManager2 = (TelephonyManager) C3707l.f12893a.getSystemService("phone");
            if (telephonyManager2 == null || telephonyManager2.getSimState() != 5) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return telephonyManager.getSimOperator();
            }
            return networkOperator;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: k */
    public static String m9949k() {
        return C3707l.f12893a.getPackageName();
    }

    /* renamed from: l */
    public static String m9950l() {
        try {
            return C3707l.f12893a.getPackageManager().getPackageInfo(C3707l.f12893a.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: m */
    public static boolean m9951m() {
        try {
            if (C3707l.f12893a.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", C3707l.f12893a.getPackageName()) != 0) {
                return false;
            }
            ConnectivityManager connectivityManager = (ConnectivityManager) C3707l.f12893a.getSystemService("connectivity");
            if (connectivityManager.getNetworkInfo(1).getState() == NetworkInfo.State.CONNECTED || connectivityManager.getNetworkInfo(1).getState() == NetworkInfo.State.CONNECTING) {
                return true;
            }
            return false;
        } catch (Exception e) {
            IAlog.m9903b("%sUnable to check whether device is connected to wifi: %s", IAlog.m9898a((Class<?>) C3705k.class), e.getMessage());
            return false;
        }
    }

    /* renamed from: n */
    public static boolean m9952n() {
        if (!"mounted".equals(C3707l.m9964b()) || C3707l.f12893a.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    public static boolean m9953o() {
        boolean z;
        if ((C3707l.f12893a.getResources().getConfiguration().screenLayout & 15) == 4) {
            z = true;
        } else {
            z = false;
        }
        IAlog.m9905d("This device has a tablet resolution? %s", Boolean.valueOf(z));
        return z;
    }
}
