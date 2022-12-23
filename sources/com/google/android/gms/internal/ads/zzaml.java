package com.google.android.gms.internal.ads;

public final class zzaml extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzaml zzb;
    private int zze;
    private zzgkx zzf = zzgko.zzaH();
    private zzgjg zzg = zzgjg.zzb;
    private int zzh = 1;
    private int zzi = 1;

    static {
        zzaml zzaml = new zzaml();
        zzb = zzaml;
        zzgko.zzaN(zzaml.class, zzaml);
    }

    private zzaml() {
    }

    public static zzamk zza() {
        return (zzamk) zzb.zzaw();
    }

    public static /* synthetic */ void zzd(zzaml zzaml, zzgjg zzgjg) {
        zzgkx zzgkx = zzaml.zzf;
        if (!zzgkx.zzc()) {
            zzaml.zzf = zzgko.zzaI(zzgkx);
        }
        zzaml.zzf.add(zzgjg);
    }

    public static /* synthetic */ void zze(zzaml zzaml, zzgjg zzgjg) {
        zzaml.zze |= 1;
        zzaml.zzg = zzgjg;
    }

    public static /* synthetic */ void zzf(zzaml zzaml, int i) {
        zzaml.zzi = i - 1;
        zzaml.zze |= 4;
    }

    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzgko.zzaM(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003ဌ\u0001\u0004ဌ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh", zzamf.zza, "zzi", zzamd.zza});
        } else if (i2 == 3) {
            return new zzaml();
        } else {
            if (i2 == 4) {
                return new zzamk((zzalh) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
