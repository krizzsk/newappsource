package com.google.android.gms.internal.icing;

import java.io.IOException;

final class zzei<T> implements zzep<T> {
    private final zzee zza;
    private final zzfd<?, ?> zzb;
    private final boolean zzc;
    private final zzcq<?> zzd;

    private zzei(zzfd<?, ?> zzfd, zzcq<?> zzcq, zzee zzee) {
        this.zzb = zzfd;
        this.zzc = zzcq.zza(zzee);
        this.zzd = zzcq;
        this.zza = zzee;
    }

    public static <T> zzei<T> zzg(zzfd<?, ?> zzfd, zzcq<?> zzcq, zzee zzee) {
        return new zzei<>(zzfd, zzcq, zzee);
    }

    public final boolean zza(T t, T t2) {
        if (!this.zzb.zzb(t).equals(this.zzb.zzb(t2))) {
            return false;
        }
        if (!this.zzc) {
            return true;
        }
        this.zzd.zzb(t);
        this.zzd.zzb(t2);
        throw null;
    }

    public final int zzb(T t) {
        int hashCode = this.zzb.zzb(t).hashCode();
        if (!this.zzc) {
            return hashCode;
        }
        this.zzd.zzb(t);
        throw null;
    }

    public final void zzc(T t, T t2) {
        zzer.zzF(this.zzb, t, t2);
        if (this.zzc) {
            zzer.zzE(this.zzd, t, t2);
        }
    }

    public final int zzd(T t) {
        zzfd<?, ?> zzfd = this.zzb;
        int zze = zzfd.zze(zzfd.zzb(t));
        if (!this.zzc) {
            return zze;
        }
        this.zzd.zzb(t);
        throw null;
    }

    public final void zze(T t) {
        this.zzb.zzc(t);
        this.zzd.zzc(t);
    }

    public final boolean zzf(T t) {
        this.zzd.zzb(t);
        throw null;
    }

    public final void zzi(T t, zzcn zzcn) throws IOException {
        this.zzd.zzb(t);
        throw null;
    }
}
