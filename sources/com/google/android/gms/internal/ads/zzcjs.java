package com.google.android.gms.internal.ads;

import java.util.HashMap;
import p001a0.C0016g;

final class zzcjs implements Runnable {
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ long zzc;
    public final /* synthetic */ zzcju zzd;

    public zzcjs(zzcju zzcju, String str, String str2, long j) {
        this.zzd = zzcju;
        this.zza = str;
        this.zzb = str2;
        this.zzc = j;
    }

    public final void run() {
        HashMap u = C0016g.m37u("event", "precacheComplete");
        u.put("src", this.zza);
        u.put("cachedSrc", this.zzb);
        u.put("totalDuration", Long.toString(this.zzc));
        zzcju.zza(this.zzd, "onPrecacheEvent", u);
    }
}
