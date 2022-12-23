package com.google.android.gms.internal.p986firebaseauthapi;

@Deprecated
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzen */
public final class zzen {
    public static final zzmz zza;
    public static final zzmz zzb;
    public static final zzmz zzc;
    private static final byte[] zzd;

    static {
        byte[] bArr = new byte[0];
        zzd = bArr;
        zzmz zzmz = zzcd.zza;
        zzoa zzoa = zzoa.TINK;
        zzmz zzmz2 = zzmz;
        byte[] bArr2 = bArr;
        zza = zza(4, 5, 3, zzmz2, zzoa, bArr2);
        zzb = zza(4, 5, 4, zzmz2, zzoa.RAW, bArr2);
        zzc = zza(4, 5, 3, zzcd.zze, zzoa, bArr2);
    }

    public static zzmz zza(int i, int i2, int i3, zzmz zzmz, zzoa zzoa, byte[] bArr) {
        zzky zza2 = zzkz.zza();
        zzlk zza3 = zzll.zza();
        zza3.zzb(4);
        zza3.zzc(5);
        zza3.zza(zzabe.zzn(bArr));
        zzkv zza4 = zzkw.zza();
        zza4.zza(zzmz);
        zzlb zzb2 = zzlc.zzb();
        zzb2.zzb((zzll) zza3.zzk());
        zzb2.zza((zzkw) zza4.zzk());
        zzb2.zzc(i3);
        zza2.zza((zzlc) zzb2.zzk());
        zzmy zza5 = zzmz.zza();
        new zzef();
        zza5.zzb("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey");
        zza5.zza(zzoa);
        zza5.zzc(((zzkz) zza2.zzk()).zzo());
        return (zzmz) zza5.zzk();
    }
}
