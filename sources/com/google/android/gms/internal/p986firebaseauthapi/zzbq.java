package com.google.android.gms.internal.p986firebaseauthapi;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbq */
public final class zzbq {
    private final Object zza;
    private final byte[] zzb;
    private final zzoa zzc;
    private final int zzd;
    private final zzaw zze;
    private final int zzf;

    public zzbq(Object obj, byte[] bArr, int i, zzoa zzoa, int i2, zzaw zzaw) {
        this.zza = obj;
        this.zzb = Arrays.copyOf(bArr, bArr.length);
        this.zzf = i;
        this.zzc = zzoa;
        this.zzd = i2;
        this.zze = zzaw;
    }

    public final int zza() {
        return this.zzd;
    }

    public final zzaw zzb() {
        return this.zze;
    }

    public final zzbn zzc() {
        return this.zze.zza();
    }

    public final zzoa zzd() {
        return this.zzc;
    }

    public final Object zze() {
        return this.zza;
    }

    public final byte[] zzf() {
        byte[] bArr = this.zzb;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final int zzg() {
        return this.zzf;
    }
}
