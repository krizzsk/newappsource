package com.google.android.gms.internal.ads;

public final class zzgox extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzgox zzb;
    private int zze;
    private int zzf;
    private String zzg = "";
    private zzgok zzh;
    private zzgoo zzi;
    private int zzj;
    private zzgkt zzk = zzgko.zzaE();
    private String zzl = "";
    private int zzm;
    private zzgkx zzn = zzgko.zzaH();
    private byte zzo = 2;

    static {
        zzgox zzgox = new zzgox();
        zzb = zzgox;
        zzgko.zzaN(zzgox.class, zzgox);
    }

    private zzgox() {
    }

    public static zzgow zzc() {
        return (zzgow) zzb.zzaw();
    }

    public static /* synthetic */ void zzf(zzgox zzgox, int i) {
        zzgox.zze |= 1;
        zzgox.zzf = i;
    }

    public static /* synthetic */ void zzg(zzgox zzgox, String str) {
        str.getClass();
        zzgox.zze |= 2;
        zzgox.zzg = str;
    }

    public static /* synthetic */ void zzh(zzgox zzgox, zzgok zzgok) {
        zzgok.getClass();
        zzgox.zzh = zzgok;
        zzgox.zze |= 4;
    }

    public static /* synthetic */ void zzi(zzgox zzgox, String str) {
        str.getClass();
        zzgkx zzgkx = zzgox.zzn;
        if (!zzgkx.zzc()) {
            zzgox.zzn = zzgko.zzaI(zzgkx);
        }
        zzgox.zzn.add(str);
    }

    public static /* synthetic */ void zzj(zzgox zzgox, int i) {
        zzgox.zzm = i - 1;
        zzgox.zze |= 64;
    }

    public final int zza() {
        return this.zzn.size();
    }

    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzo);
        }
        byte b = 1;
        if (i2 == 2) {
            return zzgko.zzaM(zzb, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\bဌ\u0006\t\u001a", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", zzgou.zza, "zzn"});
        } else if (i2 == 3) {
            return new zzgox();
        } else {
            if (i2 == 4) {
                return new zzgow((zzgoa) null);
            }
            if (i2 == 5) {
                return zzb;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzo = b;
            return null;
        }
    }

    public final String zze() {
        return this.zzg;
    }
}
