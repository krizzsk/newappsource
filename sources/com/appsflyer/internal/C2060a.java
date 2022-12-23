package com.appsflyer.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.appboy.Constants;
import com.appsflyer.ServerParameters;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.appsflyer.internal.a */
public final class C2060a {
    private IntentFilter valueOf = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    /* renamed from: com.appsflyer.internal.a$a */
    public static final class C2061a {
        public final float $$b;
        public final String AFDateFormat;

        public C2061a(float f, String str) {
            this.$$b = f;
            this.AFDateFormat = str;
        }
    }

    /* renamed from: com.appsflyer.internal.a$d */
    public static final class C2062d {
        public static final C2060a AFDateFormat = new C2060a();
    }

    public final C2061a values(Context context) {
        boolean z;
        String str = null;
        float f = BitmapDescriptorFactory.HUE_RED;
        try {
            Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, this.valueOf);
            if (registerReceiver != null) {
                if (2 == registerReceiver.getIntExtra(ServerParameters.STATUS, -1)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    int intExtra = registerReceiver.getIntExtra("plugged", -1);
                    if (intExtra == 1) {
                        str = Constants.APPBOY_PUSH_ACCENT_KEY;
                    } else if (intExtra == 2) {
                        str = "usb";
                    } else if (intExtra != 4) {
                        str = InneractiveMediationNameConsts.OTHER;
                    } else {
                        str = "wireless";
                    }
                } else {
                    str = "no";
                }
                int intExtra2 = registerReceiver.getIntExtra("level", -1);
                int intExtra3 = registerReceiver.getIntExtra("scale", -1);
                if (!(-1 == intExtra2 || -1 == intExtra3)) {
                    f = (((float) intExtra2) * 100.0f) / ((float) intExtra3);
                }
            }
        } catch (Throwable unused) {
        }
        return new C2061a(f, str);
    }
}
