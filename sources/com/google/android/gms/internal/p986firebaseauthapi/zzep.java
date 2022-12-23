package com.google.android.gms.internal.p986firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzep */
final class zzep implements zzou {
    private final String zza;
    private final int zzb;
    private zzjw zzc;
    private zziy zzd;
    private int zze;
    private zzki zzf;

    public zzep(zzmz zzmz) throws GeneralSecurityException {
        String zzf2 = zzmz.zzf();
        this.zza = zzf2;
        if (zzf2.equals(zzcc.zzb)) {
            try {
                zzjz zzd2 = zzjz.zzd(zzmz.zze(), zzabu.zza());
                this.zzc = (zzjw) zzbz.zzd(zzmz);
                this.zzb = zzd2.zza();
            } catch (zzacp e) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e);
            }
        } else if (zzf2.equals(zzcc.zza)) {
            try {
                zzjb zzc2 = zzjb.zzc(zzmz.zze(), zzabu.zza());
                this.zzd = (zziy) zzbz.zzd(zzmz);
                this.zze = zzc2.zzd().zza();
                this.zzb = this.zze + zzc2.zze().zza();
            } catch (zzacp e2) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e2);
            }
        } else if (zzf2.equals(zzea.zza)) {
            try {
                zzkl zzd3 = zzkl.zzd(zzmz.zze(), zzabu.zza());
                this.zzf = (zzki) zzbz.zzd(zzmz);
                this.zzb = zzd3.zza();
            } catch (zzacp e3) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e3);
            }
        } else {
            throw new GeneralSecurityException("unsupported AEAD DEM key type: ".concat(String.valueOf(zzf2)));
        }
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzfk zzb(byte[] bArr) throws GeneralSecurityException {
        Class<zzap> cls = zzap.class;
        if (bArr.length != this.zzb) {
            throw new GeneralSecurityException("Symmetric key has incorrect length");
        } else if (this.zza.equals(zzcc.zzb)) {
            zzjv zzb2 = zzjw.zzb();
            zzb2.zzj(this.zzc);
            zzb2.zza(zzabe.zzo(bArr, 0, this.zzb));
            return new zzfk((zzap) zzbz.zzi(this.zza, (zzjw) zzb2.zzk(), cls));
        } else if (this.zza.equals(zzcc.zza)) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, this.zze);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, this.zze, this.zzb);
            zzjd zzb3 = zzje.zzb();
            zzb3.zzj(this.zzd.zze());
            zzb3.zza(zzabe.zzn(copyOfRange));
            zzlu zzb4 = zzlv.zzb();
            zzb4.zzj(this.zzd.zzf());
            zzb4.zza(zzabe.zzn(copyOfRange2));
            zzix zzb5 = zziy.zzb();
            zzb5.zzc(this.zzd.zza());
            zzb5.zza((zzje) zzb3.zzk());
            zzb5.zzb((zzlv) zzb4.zzk());
            return new zzfk((zzap) zzbz.zzi(this.zza, (zziy) zzb5.zzk(), cls));
        } else if (this.zza.equals(zzea.zza)) {
            zzkh zzb6 = zzki.zzb();
            zzb6.zzj(this.zzf);
            zzb6.zza(zzabe.zzo(bArr, 0, this.zzb));
            return new zzfk((zzat) zzbz.zzi(this.zza, (zzki) zzb6.zzk(), zzat.class));
        } else {
            throw new GeneralSecurityException("unknown DEM key type");
        }
    }
}
