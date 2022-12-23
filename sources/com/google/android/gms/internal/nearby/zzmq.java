package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.connection.AdvertisingOptions;

@SafeParcelable.Reserved({1000})
public final class zzmq {
    private final zzms zza = new zzms((zzmr) null);

    public final zzmq zza(zzjp zzjp) {
        this.zza.zzb = zzjp;
        return this;
    }

    public final zzmq zzb(zzjv zzjv) {
        this.zza.zzg = zzjv;
        return this;
    }

    public final zzmq zzc(long j) {
        this.zza.zze = j;
        return this;
    }

    public final zzmq zzd(byte[] bArr) {
        this.zza.zzh = bArr;
        return this;
    }

    public final zzmq zze(String str) {
        this.zza.zzc = str;
        return this;
    }

    public final zzmq zzf(AdvertisingOptions advertisingOptions) {
        this.zza.zzf = advertisingOptions;
        return this;
    }

    public final zzmq zzg(zzkm zzkm) {
        this.zza.zza = zzkm;
        return this;
    }

    public final zzmq zzh(String str) {
        this.zza.zzd = str;
        return this;
    }

    public final zzms zzi() {
        return this.zza;
    }
}
