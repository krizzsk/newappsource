package com.google.android.gms.internal.ads;

public final class zzgqg implements zzgqh {
    private static final Object zza = new Object();
    private volatile zzgqh zzb;
    private volatile Object zzc = zza;

    private zzgqg(zzgqh zzgqh) {
        this.zzb = zzgqh;
    }

    public static zzgqh zza(zzgqh zzgqh) {
        if ((zzgqh instanceof zzgqg) || (zzgqh instanceof zzgpt)) {
            return zzgqh;
        }
        zzgqh.getClass();
        return new zzgqg(zzgqh);
    }

    public final Object zzb() {
        Object obj = this.zzc;
        if (obj != zza) {
            return obj;
        }
        zzgqh zzgqh = this.zzb;
        if (zzgqh == null) {
            return this.zzc;
        }
        Object zzb2 = zzgqh.zzb();
        this.zzc = zzb2;
        this.zzb = null;
        return zzb2;
    }
}
