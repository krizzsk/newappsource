package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

final class zzeyn implements zzfoi {
    public final /* synthetic */ zzeyr zza;

    public zzeyn(zzeyr zzeyr) {
        this.zza = zzeyr;
    }

    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        zzcfi.zzh("", (zzebm) obj);
        zze.zza("Failed to get a cache key, reverting to legacy flow.");
        zzeyr zzeyr = this.zza;
        zzeyr.zzd = new zzeyq((zzbzu) null, zzeyr.zze(), (zzeyp) null);
        return this.zza.zzd;
    }
}
