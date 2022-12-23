package com.google.android.gms.internal.p986firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzhu */
public final class zzhu extends zzgb {
    public zzhu() {
        super(zzlv.class, new zzhs(zzbm.class));
    }

    public static final void zzh(zzlv zzlv) throws GeneralSecurityException {
        zzpu.zzc(zzlv.zza(), 0);
        if (zzlv.zzg().zzd() >= 16) {
            zzn(zzlv.zzf());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }

    public static /* bridge */ /* synthetic */ zzfz zzi(int i, int i2, int i3, int i4) {
        zzlx zzb = zzly.zzb();
        zzma zzb2 = zzmb.zzb();
        zzb2.zzb(i3);
        zzb2.zza(i2);
        zzb.zzb((zzmb) zzb2.zzk());
        zzb.zza(i);
        return new zzfz((zzly) zzb.zzk(), i4);
    }

    /* access modifiers changed from: private */
    public static void zzn(zzmb zzmb) throws GeneralSecurityException {
        if (zzmb.zza() >= 10) {
            int zzf = zzmb.zzf() - 2;
            if (zzf != 1) {
                if (zzf != 2) {
                    if (zzf != 3) {
                        if (zzf != 4) {
                            if (zzf != 5) {
                                throw new GeneralSecurityException("unknown hash type");
                            } else if (zzmb.zza() > 28) {
                                throw new GeneralSecurityException("tag size too big");
                            }
                        } else if (zzmb.zza() > 64) {
                            throw new GeneralSecurityException("tag size too big");
                        }
                    } else if (zzmb.zza() > 32) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                } else if (zzmb.zza() > 48) {
                    throw new GeneralSecurityException("tag size too big");
                }
            } else if (zzmb.zza() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            throw new GeneralSecurityException("tag size too small");
        }
    }

    public final zzga zza() {
        return new zzht(this, zzly.class);
    }

    public final zzmt zzb() {
        return zzmt.SYMMETRIC;
    }

    public final /* synthetic */ zzadm zzc(zzabe zzabe) throws zzacp {
        return zzlv.zze(zzabe, zzabu.zza());
    }

    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    public final /* bridge */ /* synthetic */ void zze(zzadm zzadm) throws GeneralSecurityException {
        zzh((zzlv) zzadm);
    }

    public final int zzf() {
        return 2;
    }
}
