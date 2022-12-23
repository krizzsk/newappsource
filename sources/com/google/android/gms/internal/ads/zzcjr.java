package com.google.android.gms.internal.ads;

import java.util.HashMap;
import p001a0.C0016g;

final class zzcjr implements Runnable {
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ int zzc;
    public final /* synthetic */ zzcju zzd;

    public zzcjr(zzcju zzcju, String str, String str2, int i) {
        this.zzd = zzcju;
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
    }

    public final void run() {
        HashMap u = C0016g.m37u("event", "precacheComplete");
        u.put("src", this.zza);
        u.put("cachedSrc", this.zzb);
        u.put("totalBytes", Integer.toString(this.zzc));
        zzcju.zza(this.zzd, "onPrecacheEvent", u);
    }
}
