package com.google.android.gms.internal.p986firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbf */
public final class zzbf {
    private final zzmz zza;

    private zzbf(zzmz zzmz) {
        this.zza = zzmz;
    }

    public static zzbf zze(String str, byte[] bArr, int i) {
        zzoa zzoa;
        zzmy zza2 = zzmz.zza();
        zza2.zzb(str);
        zza2.zzc(zzabe.zzn(bArr));
        int i2 = i - 1;
        if (i2 == 0) {
            zzoa = zzoa.TINK;
        } else if (i2 == 1) {
            zzoa = zzoa.LEGACY;
        } else if (i2 != 2) {
            zzoa = zzoa.CRUNCHY;
        } else {
            zzoa = zzoa.RAW;
        }
        zza2.zza(zzoa);
        return new zzbf((zzmz) zza2.zzk());
    }

    public final zzmz zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zza.zzf();
    }

    public final byte[] zzc() {
        return this.zza.zze().zzt();
    }

    public final int zzd() {
        zzoa zzd = this.zza.zzd();
        zzoa zzoa = zzoa.UNKNOWN_PREFIX;
        int ordinal = zzd.ordinal();
        int i = 1;
        if (ordinal != 1) {
            i = 2;
            if (ordinal != 2) {
                i = 3;
                if (ordinal != 3) {
                    if (ordinal == 4) {
                        return 4;
                    }
                    throw new IllegalArgumentException("Unknown output prefix type");
                }
            }
        }
        return i;
    }
}
