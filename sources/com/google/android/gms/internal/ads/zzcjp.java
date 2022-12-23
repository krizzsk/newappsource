package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import com.usebutton.sdk.internal.util.DiskLruCache;
import java.util.HashMap;
import p001a0.C0016g;

final class zzcjp implements Runnable {
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ long zzc;
    public final /* synthetic */ long zzd;
    public final /* synthetic */ long zze;
    public final /* synthetic */ long zzf;
    public final /* synthetic */ long zzg;
    public final /* synthetic */ boolean zzh;
    public final /* synthetic */ int zzi;
    public final /* synthetic */ int zzj;
    public final /* synthetic */ zzcju zzk;

    public zzcjp(zzcju zzcju, String str, String str2, long j, long j2, long j3, long j4, long j5, boolean z, int i, int i2) {
        this.zzk = zzcju;
        this.zza = str;
        this.zzb = str2;
        this.zzc = j;
        this.zzd = j2;
        this.zze = j3;
        this.zzf = j4;
        this.zzg = j5;
        this.zzh = z;
        this.zzi = i;
        this.zzj = i2;
    }

    public final void run() {
        String str;
        HashMap u = C0016g.m37u("event", "precacheProgress");
        u.put("src", this.zza);
        u.put("cachedSrc", this.zzb);
        u.put("bufferedDuration", Long.toString(this.zzc));
        u.put("totalDuration", Long.toString(this.zzd));
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzbB)).booleanValue()) {
            u.put("qoeLoadedBytes", Long.toString(this.zze));
            u.put("qoeCachedBytes", Long.toString(this.zzf));
            u.put("totalBytes", Long.toString(this.zzg));
            u.put("reportTime", Long.toString(zzt.zzA().currentTimeMillis()));
        }
        if (true != this.zzh) {
            str = "0";
        } else {
            str = DiskLruCache.VERSION_1;
        }
        u.put("cacheReady", str);
        u.put("playerCount", Integer.toString(this.zzi));
        u.put("playerPreparedCount", Integer.toString(this.zzj));
        zzcju.zza(this.zzk, "onPrecacheEvent", u);
    }
}
