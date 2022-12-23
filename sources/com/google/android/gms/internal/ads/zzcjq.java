package com.google.android.gms.internal.ads;

import com.usebutton.sdk.internal.util.DiskLruCache;
import java.util.HashMap;
import p001a0.C0016g;

final class zzcjq implements Runnable {
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ int zzc;
    public final /* synthetic */ int zzd;
    public final /* synthetic */ long zze;
    public final /* synthetic */ long zzf;
    public final /* synthetic */ boolean zzg;
    public final /* synthetic */ int zzh;
    public final /* synthetic */ int zzi;
    public final /* synthetic */ zzcju zzj;

    public zzcjq(zzcju zzcju, String str, String str2, int i, int i2, long j, long j2, boolean z, int i3, int i4) {
        this.zzj = zzcju;
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
        this.zzd = i2;
        this.zze = j;
        this.zzf = j2;
        this.zzg = z;
        this.zzh = i3;
        this.zzi = i4;
    }

    public final void run() {
        String str;
        HashMap u = C0016g.m37u("event", "precacheProgress");
        u.put("src", this.zza);
        u.put("cachedSrc", this.zzb);
        u.put("bytesLoaded", Integer.toString(this.zzc));
        u.put("totalBytes", Integer.toString(this.zzd));
        u.put("bufferedDuration", Long.toString(this.zze));
        u.put("totalDuration", Long.toString(this.zzf));
        if (true != this.zzg) {
            str = "0";
        } else {
            str = DiskLruCache.VERSION_1;
        }
        u.put("cacheReady", str);
        u.put("playerCount", Integer.toString(this.zzh));
        u.put("playerPreparedCount", Integer.toString(this.zzi));
        zzcju.zza(this.zzj, "onPrecacheEvent", u);
    }
}
