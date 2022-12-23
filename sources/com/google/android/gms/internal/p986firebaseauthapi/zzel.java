package com.google.android.gms.internal.p986firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzel */
final class zzel implements zzav {
    public final zzbu zza;
    private final zzif zzb;

    public zzel(zzbu zzbu) {
        zzif zzif;
        this.zza = zzbu;
        if (zzbu.zzf()) {
            zzif = zzgl.zza().zzb().zza(zzgi.zza(zzbu), "hybrid_encrypt", "encrypt");
        } else {
            zzif = zzgi.zza;
        }
        this.zzb = zzif;
    }
}
