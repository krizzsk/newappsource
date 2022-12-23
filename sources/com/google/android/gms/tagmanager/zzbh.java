package com.google.android.gms.tagmanager;

import android.content.Context;

public final class zzbh {
    private static zzbh zza;
    private static final Object zzb = new Object();
    private final zzec zzc;
    private final zzcc zzd;

    private zzbh(Context context) {
        zzcc zzb2 = zzcc.zzb(context);
        zzex zzex = new zzex();
        this.zzd = zzb2;
        this.zzc = zzex;
    }

    public static zzbh zzb(Context context) {
        zzbh zzbh;
        synchronized (zzb) {
            if (zza == null) {
                zza = new zzbh(context);
            }
            zzbh = zza;
        }
        return zzbh;
    }

    public final boolean zza(String str) {
        if (!this.zzc.zza()) {
            zzdh.zzc("Too many urls sent too quickly with the TagManagerSender, rate limiting invoked.");
            return false;
        }
        this.zzd.zzf(str, System.currentTimeMillis());
        return true;
    }
}
