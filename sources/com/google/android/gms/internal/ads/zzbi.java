package com.google.android.gms.internal.ads;

public class zzbi {
    public final Object zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final int zze;

    public zzbi(zzbi zzbi) {
        this.zza = zzbi.zza;
        this.zzb = zzbi.zzb;
        this.zzc = zzbi.zzc;
        this.zzd = zzbi.zzd;
        this.zze = zzbi.zze;
    }

    public zzbi(Object obj, int i, int i2, long j) {
        this(obj, i, i2, j, -1);
    }

    private zzbi(Object obj, int i, int i2, long j, int i3) {
        this.zza = obj;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = j;
        this.zze = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbi)) {
            return false;
        }
        zzbi zzbi = (zzbi) obj;
        if (this.zza.equals(zzbi.zza) && this.zzb == zzbi.zzb && this.zzc == zzbi.zzc && this.zzd == zzbi.zzd && this.zze == zzbi.zze) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.zza.hashCode() + 527) * 31) + this.zzb) * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + this.zze;
    }

    public final zzbi zza(Object obj) {
        if (this.zza.equals(obj)) {
            return this;
        }
        return new zzbi(obj, this.zzb, this.zzc, this.zzd, this.zze);
    }

    public final boolean zzb() {
        return this.zzb != -1;
    }

    public zzbi(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public zzbi(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }
}
