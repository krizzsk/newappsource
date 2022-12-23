package com.google.android.gms.internal.p986firebaseauthapi;

import java.io.IOException;
import java.security.GeneralSecurityException;
import p358af.C13437d;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbh */
public final class zzbh {
    private final zznh zza;
    private final zzie zzb = zzie.zza;

    private zzbh(zznh zznh) {
        this.zza = zznh;
    }

    public static final zzbh zza(zznh zznh) throws GeneralSecurityException {
        zzi(zznh);
        return new zzbh(zznh);
    }

    public static final zzbh zzh(zzfq zzfq, zzap zzap) throws GeneralSecurityException, IOException {
        byte[] bArr = new byte[0];
        zzlq zza2 = zzfq.zza();
        if (zza2 == null || zza2.zzd().zzd() == 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        try {
            zznh zzf = zznh.zzf(zzap.zza(zza2.zzd().zzt(), bArr), zzabu.zza());
            zzi(zzf);
            return new zzbh(zzf);
        } catch (zzacp unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    private static void zzi(zznh zznh) throws GeneralSecurityException {
        if (zznh == null || zznh.zza() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    public final String toString() {
        return zzcb.zza(this.zza).toString();
    }

    public final zzbh zzb() throws GeneralSecurityException {
        if (this.zza != null) {
            zzne zzc = zznh.zzc();
            for (zzng zzng : this.zza.zzg()) {
                zzmu zzb2 = zzng.zzb();
                if (zzb2.zzb() == zzmt.ASYMMETRIC_PRIVATE) {
                    String zzf = zzb2.zzf();
                    zzabe zze = zzb2.zze();
                    zzax zza2 = zzbz.zza(zzf);
                    if (zza2 instanceof zzbw) {
                        zzmu zzf2 = ((zzbw) zza2).zzf(zze);
                        zzbz.zzf(zzf2);
                        zznf zznf = (zznf) zzng.zzu();
                        zznf.zza(zzf2);
                        zzc.zzb((zzng) zznf.zzk());
                    } else {
                        throw new GeneralSecurityException(C13437d.m33706k("manager for key type ", zzf, " is not a PrivateKeyManager"));
                    }
                } else {
                    throw new GeneralSecurityException("The keyset contains a non-private key");
                }
            }
            zzc.zzc(this.zza.zzb());
            return new zzbh((zznh) zzc.zzk());
        }
        throw new GeneralSecurityException("cleartext keyset is not available");
    }

    public final zznh zzc() {
        return this.zza;
    }

    public final zznm zzd() {
        return zzcb.zza(this.zza);
    }

    public final Object zze(Class cls) throws GeneralSecurityException {
        Class zze = zzbz.zze(cls);
        if (zze != null) {
            zzcb.zzb(this.zza);
            zzbp zzbp = new zzbp(zze, (zzbo) null);
            zzbp.zzc(this.zzb);
            for (zzng zzng : this.zza.zzg()) {
                if (zzng.zzk() == 3) {
                    Object zzg = zzbz.zzg(zzng.zzb(), zze);
                    if (zzng.zza() == this.zza.zzb()) {
                        zzbp.zza(zzg, zzng);
                    } else {
                        zzbp.zzb(zzg, zzng);
                    }
                }
            }
            return zzbz.zzk(zzbp.zzd(), cls);
        }
        throw new GeneralSecurityException("No wrapper found for ".concat(cls.getName()));
    }

    public final void zzf(zzbj zzbj, zzap zzap) throws GeneralSecurityException, IOException {
        byte[] bArr = new byte[0];
        zznh zznh = this.zza;
        byte[] zzb2 = zzap.zzb(zznh.zzr(), bArr);
        try {
            if (zznh.zzf(zzap.zza(zzb2, bArr), zzabu.zza()).equals(zznh)) {
                zzlp zza2 = zzlq.zza();
                zza2.zza(zzabe.zzn(zzb2));
                zza2.zzb(zzcb.zza(zznh));
                zzbj.zzb((zzlq) zza2.zzk());
                return;
            }
            throw new GeneralSecurityException("cannot encrypt keyset");
        } catch (zzacp unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0010  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzg(com.google.android.gms.internal.p986firebaseauthapi.zzbj r5) throws java.security.GeneralSecurityException, java.io.IOException {
        /*
            r4 = this;
            com.google.android.gms.internal.firebase-auth-api.zznh r0 = r4.zza
            java.util.List r0 = r0.zzg()
            java.util.Iterator r0 = r0.iterator()
        L_0x000a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0064
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.firebase-auth-api.zzng r1 = (com.google.android.gms.internal.p986firebaseauthapi.zzng) r1
            com.google.android.gms.internal.firebase-auth-api.zzmu r2 = r1.zzb()
            com.google.android.gms.internal.firebase-auth-api.zzmt r2 = r2.zzb()
            com.google.android.gms.internal.firebase-auth-api.zzmt r3 = com.google.android.gms.internal.p986firebaseauthapi.zzmt.UNKNOWN_KEYMATERIAL
            if (r2 == r3) goto L_0x003b
            com.google.android.gms.internal.firebase-auth-api.zzmu r2 = r1.zzb()
            com.google.android.gms.internal.firebase-auth-api.zzmt r2 = r2.zzb()
            com.google.android.gms.internal.firebase-auth-api.zzmt r3 = com.google.android.gms.internal.p986firebaseauthapi.zzmt.SYMMETRIC
            if (r2 == r3) goto L_0x003b
            com.google.android.gms.internal.firebase-auth-api.zzmu r2 = r1.zzb()
            com.google.android.gms.internal.firebase-auth-api.zzmt r2 = r2.zzb()
            com.google.android.gms.internal.firebase-auth-api.zzmt r3 = com.google.android.gms.internal.p986firebaseauthapi.zzmt.ASYMMETRIC_PRIVATE
            if (r2 == r3) goto L_0x003b
            goto L_0x000a
        L_0x003b:
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2 = 0
            com.google.android.gms.internal.firebase-auth-api.zzmu r3 = r1.zzb()
            com.google.android.gms.internal.firebase-auth-api.zzmt r3 = r3.zzb()
            java.lang.String r3 = r3.name()
            r0[r2] = r3
            r2 = 1
            com.google.android.gms.internal.firebase-auth-api.zzmu r1 = r1.zzb()
            java.lang.String r1 = r1.zzf()
            r0[r2] = r1
            java.lang.String r1 = "keyset contains key material of type %s for type url %s"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r5.<init>(r0)
            throw r5
        L_0x0064:
            com.google.android.gms.internal.firebase-auth-api.zznh r0 = r4.zza
            r5.zzc(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p986firebaseauthapi.zzbh.zzg(com.google.android.gms.internal.firebase-auth-api.zzbj):void");
    }
}
