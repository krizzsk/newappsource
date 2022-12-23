package com.google.android.gms.internal.contextmanager;

public final class zzdu extends zzmf<zzdu, zzdq> implements zzno {
    public static final zzmd<zzph, zzdu> zza;
    /* access modifiers changed from: private */
    public static final zzdu zze;
    private int zzf;
    private String zzg = "";
    private zzem zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private zzht zzl;
    private zzdx zzm;
    private zzmm<String> zzn = zzmf.zzD();
    private zzey zzo;
    private byte zzp = 2;

    static {
        zzdu zzdu = new zzdu();
        zze = zzdu;
        zzmf.zzH(zzdu.class, zzdu);
        zza = zzmf.zzy(zzph.zzg(), zzdu, zzdu, (zzmi) null, 106879161, zzpd.MESSAGE, zzdu.class);
    }

    private zzdu() {
    }

    public static zzdu zzb(byte[] bArr, zzlp zzlp) throws zzmp {
        return (zzdu) zzmf.zzA(zze, bArr, zzlp);
    }

    public final zzem zzc() {
        zzem zzem = this.zzh;
        return zzem == null ? zzem.zzc() : zzem;
    }

    public final String zzd() {
        return this.zzg;
    }

    public final Object zzf(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzp);
        }
        byte b = 1;
        if (i2 == 2) {
            return zzmf.zzG(zze, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0001\u0001\u0001ဈ\u0000\u0002ဉ\u0001\u0004ဌ\u0002\u0005ဌ\u0003\u0006ဌ\u0004\u0007ဉ\u0005\bᐉ\u0006\t\u001a\nဉ\u0007", new Object[]{"zzf", "zzg", "zzh", "zzi", zzea.zzc(), "zzj", zzej.zzc(), "zzk", zzdt.zzc(), "zzl", "zzm", "zzn", "zzo"});
        } else if (i2 == 3) {
            return new zzdu();
        } else {
            if (i2 == 4) {
                return new zzdq((zzdp) null);
            }
            if (i2 == 5) {
                return zze;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzp = b;
            return null;
        }
    }
}
