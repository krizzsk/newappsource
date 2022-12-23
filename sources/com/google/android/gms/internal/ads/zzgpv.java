package com.google.android.gms.internal.ads;

public final class zzgpv implements zzgpu, zzgpo {
    private static final zzgpv zza = new zzgpv((Object) null);
    private final Object zzb;

    private zzgpv(Object obj) {
        this.zzb = obj;
    }

    public static zzgpu zza(Object obj) {
        zzgqc.zza(obj, "instance cannot be null");
        return new zzgpv(obj);
    }

    public static zzgpu zzc(Object obj) {
        return obj == null ? zza : new zzgpv(obj);
    }

    public final Object zzb() {
        return this.zzb;
    }
}
