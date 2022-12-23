package com.google.android.gms.internal.p986firebaseauthapi;

@Deprecated
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzcd */
public final class zzcd {
    public static final zzmz zza = zzb(16);
    public static final zzmz zzb = zzb(32);
    public static final zzmz zzc = zza(16, 16);
    public static final zzmz zzd = zza(32, 16);
    public static final zzmz zze = zzc(16, 16, 32, 16, 5);
    public static final zzmz zzf = zzc(32, 16, 32, 32, 5);
    public static final zzmz zzg;
    public static final zzmz zzh;

    static {
        zzmy zza2 = zzmz.zza();
        new zzcy();
        zza2.zzb("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        zzoa zzoa = zzoa.TINK;
        zza2.zza(zzoa);
        zzg = (zzmz) zza2.zzk();
        zzmy zza3 = zzmz.zza();
        new zzdi();
        zza3.zzb("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        zza3.zza(zzoa);
        zzh = (zzmz) zza3.zzk();
    }

    public static zzmz zza(int i, int i2) {
        zzjp zzb2 = zzjq.zzb();
        zzb2.zza(i);
        zzjs zzb3 = zzjt.zzb();
        zzb3.zza(16);
        zzb2.zzb((zzjt) zzb3.zzk());
        zzmy zza2 = zzmz.zza();
        zza2.zzc(((zzjq) zzb2.zzk()).zzo());
        new zzcp();
        zza2.zzb("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zza2.zza(zzoa.TINK);
        return (zzmz) zza2.zzk();
    }

    public static zzmz zzb(int i) {
        zzjy zzb2 = zzjz.zzb();
        zzb2.zza(i);
        zzmy zza2 = zzmz.zza();
        zza2.zzc(((zzjz) zzb2.zzk()).zzo());
        new zzcs();
        zza2.zzb("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zza2.zza(zzoa.TINK);
        return (zzmz) zza2.zzk();
    }

    public static zzmz zzc(int i, int i2, int i3, int i4, int i5) {
        zzjg zzb2 = zzjh.zzb();
        zzjj zzb3 = zzjk.zzb();
        zzb3.zza(16);
        zzb2.zzb((zzjk) zzb3.zzk());
        zzb2.zza(i);
        zzlx zzb4 = zzly.zzb();
        zzma zzb5 = zzmb.zzb();
        zzb5.zzb(5);
        zzb5.zza(i4);
        zzb4.zzb((zzmb) zzb5.zzk());
        zzb4.zza(32);
        zzja zza2 = zzjb.zza();
        zza2.zza((zzjh) zzb2.zzk());
        zza2.zzb((zzly) zzb4.zzk());
        zzmy zza3 = zzmz.zza();
        zza3.zzc(((zzjb) zza2.zzk()).zzo());
        new zzcj();
        zza3.zzb("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zza3.zza(zzoa.TINK);
        return (zzmz) zza3.zzk();
    }
}
