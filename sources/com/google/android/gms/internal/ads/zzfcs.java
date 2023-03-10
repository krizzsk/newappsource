package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;

public final class zzfcs {
    public static void zza(Context context, boolean z) {
        if (z) {
            zzcfi.zzi("This request is sent from a test device.");
            return;
        }
        zzaw.zzb();
        String zzw = zzcfb.zzw(context);
        zzcfi.zzi("Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"" + zzw + "\")) to get test ads on this device.");
    }

    public static void zzb(int i, Throwable th, String str) {
        zzcfi.zzi("Ad failed to load : " + i);
        zze.zzb(str, th);
        if (i != 3) {
            zzt.zzo().zzs(th, str);
        }
    }
}
