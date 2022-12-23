package com.google.android.gms.internal.p986firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzef */
public final class zzef extends zzgu {
    /* access modifiers changed from: private */
    public static final byte[] zza = new byte[0];

    public zzef() {
        super(zzlf.class, zzli.class, new zzed(zzau.class));
    }

    public static /* bridge */ /* synthetic */ zzfz zzi(int i, int i2, int i3, zzbf zzbf, byte[] bArr, int i4) {
        zzoa zzoa;
        zzky zza2 = zzkz.zza();
        zzlk zza3 = zzll.zza();
        zza3.zzb(4);
        zza3.zzc(5);
        zza3.zza(zzabe.zzn(bArr));
        zzll zzll = (zzll) zza3.zzk();
        zzmy zza4 = zzmz.zza();
        zza4.zzb(zzbf.zzb());
        zza4.zzc(zzabe.zzn(zzbf.zzc()));
        int zzd = zzbf.zzd() - 1;
        if (zzd == 0) {
            zzoa = zzoa.TINK;
        } else if (zzd == 1) {
            zzoa = zzoa.LEGACY;
        } else if (zzd != 2) {
            zzoa = zzoa.CRUNCHY;
        } else {
            zzoa = zzoa.RAW;
        }
        zza4.zza(zzoa);
        zzkv zza5 = zzkw.zza();
        zza5.zza((zzmz) zza4.zzk());
        zzlb zzb = zzlc.zzb();
        zzb.zzb(zzll);
        zzb.zza((zzkw) zza5.zzk());
        zzb.zzc(i3);
        zza2.zza((zzlc) zzb.zzk());
        return new zzfz((zzkz) zza2.zzk(), i4);
    }

    public final zzga zza() {
        return new zzee(this, zzkz.class);
    }

    public final zzmt zzb() {
        return zzmt.ASYMMETRIC_PRIVATE;
    }

    public final /* synthetic */ zzadm zzc(zzabe zzabe) throws zzacp {
        return zzlf.zzd(zzabe, zzabu.zza());
    }

    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    public final /* bridge */ /* synthetic */ void zze(zzadm zzadm) throws GeneralSecurityException {
        zzlf zzlf = (zzlf) zzadm;
        if (!zzlf.zzf().zzs()) {
            zzpu.zzc(zzlf.zza(), 0);
            zzeo.zza(zzlf.zze().zzb());
            return;
        }
        throw new GeneralSecurityException("invalid ECIES private key");
    }

    public final /* synthetic */ zzadm zzg(zzadm zzadm) throws GeneralSecurityException {
        return ((zzlf) zzadm).zze();
    }
}
