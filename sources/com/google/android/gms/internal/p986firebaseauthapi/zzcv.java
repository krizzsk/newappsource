package com.google.android.gms.internal.p986firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzcv */
public final class zzcv extends zzgb {
    public zzcv() {
        super(zzkc.class, new zzct(zzap.class));
    }

    public static void zzg(boolean z) throws GeneralSecurityException {
        if (zzi()) {
            zzbz.zzn(new zzcv(), true);
        }
    }

    public static /* bridge */ /* synthetic */ zzfz zzh(int i, int i2) {
        zzke zzb = zzkf.zzb();
        zzb.zza(i);
        return new zzfz((zzkf) zzb.zzk(), i2);
    }

    private static boolean zzi() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    public final zzga zza() {
        return new zzcu(this, zzkf.class);
    }

    public final zzmt zzb() {
        return zzmt.SYMMETRIC;
    }

    public final /* synthetic */ zzadm zzc(zzabe zzabe) throws zzacp {
        return zzkc.zzd(zzabe, zzabu.zza());
    }

    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    public final /* bridge */ /* synthetic */ void zze(zzadm zzadm) throws GeneralSecurityException {
        zzkc zzkc = (zzkc) zzadm;
        zzpu.zzc(zzkc.zza(), 0);
        zzpu.zzb(zzkc.zze().zzd());
    }
}
