package com.google.android.gms.internal.p986firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbi */
public final class zzbi {
    private final zzne zza;

    private zzbi(zzne zzne) {
        this.zza = zzne;
    }

    public static zzbi zze() {
        return new zzbi(zznh.zzc());
    }

    public static zzbi zzf(zzbh zzbh) {
        return new zzbi((zzne) zzbh.zzc().zzu());
    }

    private final synchronized int zzg() {
        int zza2;
        zza2 = zzhg.zza();
        while (zzj(zza2)) {
            zza2 = zzhg.zza();
        }
        return zza2;
    }

    private final synchronized zzng zzh(zzmu zzmu, zzoa zzoa) throws GeneralSecurityException {
        zznf zzc;
        int zzg = zzg();
        if (zzoa != zzoa.UNKNOWN_PREFIX) {
            zzc = zzng.zzc();
            zzc.zza(zzmu);
            zzc.zzb(zzg);
            zzc.zzd(3);
            zzc.zzc(zzoa);
        } else {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        return (zzng) zzc.zzk();
    }

    private final synchronized zzng zzi(zzmz zzmz) throws GeneralSecurityException {
        return zzh(zzbz.zzc(zzmz), zzmz.zzd());
    }

    private final synchronized boolean zzj(int i) {
        boolean z;
        Iterator it = this.zza.zze().iterator();
        while (true) {
            if (it.hasNext()) {
                if (((zzng) it.next()).zza() == i) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        return z;
    }

    @Deprecated
    public final synchronized int zza(zzmz zzmz, boolean z) throws GeneralSecurityException {
        zzng zzi;
        zzi = zzi(zzmz);
        this.zza.zzb(zzi);
        return zzi.zza();
    }

    public final synchronized zzbh zzb() throws GeneralSecurityException {
        return zzbh.zza((zznh) this.zza.zzk());
    }

    public final synchronized zzbi zzc(zzbf zzbf) throws GeneralSecurityException {
        zza(zzbf.zza(), false);
        return this;
    }

    public final synchronized zzbi zzd(int i) throws GeneralSecurityException {
        int i2 = 0;
        while (i2 < this.zza.zza()) {
            zzng zzd = this.zza.zzd(i2);
            if (zzd.zza() != i) {
                i2++;
            } else if (zzd.zzk() == 3) {
                this.zza.zzc(i);
            } else {
                throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + i);
            }
        }
        throw new GeneralSecurityException("key not found: " + i);
        return this;
    }
}
