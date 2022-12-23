package com.google.android.gms.internal.ads;

final class zzaay extends zzzg {
    private final long zza;

    public zzaay(zzyt zzyt, long j) {
        super(zzyt);
        boolean z;
        if (zzyt.zzf() >= j) {
            z = true;
        } else {
            z = false;
        }
        zzcw.zzd(z);
        this.zza = j;
    }

    public final long zzd() {
        return super.zzd() - this.zza;
    }

    public final long zze() {
        return super.zze() - this.zza;
    }

    public final long zzf() {
        return super.zzf() - this.zza;
    }
}
