package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzajf;
import com.google.android.gms.internal.ads.zzajk;
import com.google.android.gms.internal.ads.zzcfi;

final class zzbh implements zzajf {
    public final /* synthetic */ String zza;
    public final /* synthetic */ zzbl zzb;

    public zzbh(zzbo zzbo, String str, zzbl zzbl) {
        this.zza = str;
        this.zzb = zzbl;
    }

    public final void zza(zzajk zzajk) {
        String str = this.zza;
        String obj = zzajk.toString();
        zzcfi.zzj("Failed to load URL: " + str + "\n" + obj);
        this.zzb.zza((Object) null);
    }
}
