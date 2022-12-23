package com.google.android.gms.internal.p986firebaseauthapi;

import android.os.Build;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zza */
final class zza {
    public static boolean zza() {
        return Build.VERSION.SDK_INT >= 33 || Build.VERSION.CODENAME.charAt(0) == 'T';
    }
}
