package com.google.android.gms.internal.mlkit_common;

public final class zze {
    private final zzaj zza = zzam.zzg();
    private Boolean zzb;

    private zze() {
    }

    public final zze zza() {
        boolean z;
        if (this.zzb == null) {
            z = true;
        } else {
            z = false;
        }
        zzab.zzd(z, "A SourcePolicy can only set internal() or external() once.");
        this.zzb = Boolean.FALSE;
        return this;
    }

    public final zze zzb() {
        boolean z;
        if (this.zzb == null) {
            z = true;
        } else {
            z = false;
        }
        zzab.zzd(z, "A SourcePolicy can only set internal() or external() once.");
        this.zzb = Boolean.TRUE;
        return this;
    }

    public final zzg zzc() {
        if (this.zzb != null) {
            return new zzg(this.zzb.booleanValue(), false, this.zza.zzc(), (zzf) null);
        }
        throw new NullPointerException("Must call internal() or external() when building a SourcePolicy.");
    }

    public /* synthetic */ zze(zzd zzd) {
    }
}
