package com.google.android.gms.internal.ads;

import java.util.HashMap;
import p001a0.C0016g;

final class zzcjo implements Runnable {
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ int zzc;
    public final /* synthetic */ int zzd;
    public final /* synthetic */ zzcju zze;

    public zzcjo(zzcju zzcju, String str, String str2, int i, int i2, boolean z) {
        this.zze = zzcju;
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
        this.zzd = i2;
    }

    public final void run() {
        HashMap u = C0016g.m37u("event", "precacheProgress");
        u.put("src", this.zza);
        u.put("cachedSrc", this.zzb);
        u.put("bytesLoaded", Integer.toString(this.zzc));
        u.put("totalBytes", Integer.toString(this.zzd));
        u.put("cacheReady", "0");
        zzcju.zza(this.zze, "onPrecacheEvent", u);
    }
}
