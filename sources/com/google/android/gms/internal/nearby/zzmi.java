package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.connection.ConnectionOptions;

@SafeParcelable.Reserved({1000})
public final class zzmi {
    private final zzmk zza = new zzmk((zzmj) null);

    public final zzmi zza(zzjs zzjs) {
        this.zza.zzb = zzjs;
        return this;
    }

    public final zzmi zzb(zzjv zzjv) {
        this.zza.zzg = zzjv;
        return this;
    }

    public final zzmi zzc(zzjy zzjy) {
        this.zza.zzc = zzjy;
        return this;
    }

    public final zzmi zzd(byte[] bArr) {
        this.zza.zzh = bArr;
        return this;
    }

    public final zzmi zze(byte[] bArr) {
        this.zza.zzf = bArr;
        return this;
    }

    public final zzmi zzf(String str) {
        this.zza.zzd = str;
        return this;
    }

    public final zzmi zzg(ConnectionOptions connectionOptions) {
        this.zza.zzi = connectionOptions;
        return this;
    }

    public final zzmi zzh(String str) {
        this.zza.zze = str;
        return this;
    }

    public final zzmi zzi(zzkj zzkj) {
        this.zza.zza = zzkj;
        return this;
    }

    public final zzmk zzj() {
        return this.zza;
    }
}
