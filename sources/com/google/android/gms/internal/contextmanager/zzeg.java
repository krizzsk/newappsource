package com.google.android.gms.internal.contextmanager;

import com.moovit.database.sqlite.SQLiteDatabase;

public final class zzeg extends zzmf<zzeg, zzec> implements zzno {
    private static final zzml<Integer, zzej> zza = new zzeb();
    /* access modifiers changed from: private */
    public static final zzeg zze;
    private zzir zzA;
    private zzmk zzB = zzmf.zzC();
    private zzgp zzC;
    private zzhe zzD;
    private zzix zzE;
    private int zzf;
    private int zzg;
    private zzmm<zzeg> zzh = zzmf.zzD();
    private zzhz zzi;
    private zzfh zzj;
    private zzgg zzk;
    private zzda zzl;
    private zzhb zzm;
    private zzgm zzn;
    private zzga zzo;
    private zzdg zzp;
    private zzdo zzq;
    private zzfo zzr;
    private zzhh zzs;
    private zzil zzt;
    private zzif zzu;
    private zzev zzv;
    private zzfu zzw;
    private zzgv zzx;
    private zzhn zzy;
    private zzhz zzz;

    static {
        zzeg zzeg = new zzeg();
        zze = zzeg;
        zzmf.zzH(zzeg.class, zzeg);
    }

    private zzeg() {
    }

    private final void zzI() {
        zzmm<zzeg> zzmm = this.zzh;
        if (!zzmm.zzc()) {
            this.zzh = zzmf.zzE(zzmm);
        }
    }

    public static zzec zza() {
        return (zzec) zze.zzx();
    }

    public static zzeg zzc(byte[] bArr, zzlp zzlp) throws zzmp {
        return (zzeg) zzmf.zzA(zze, bArr, zzlp);
    }

    public static /* synthetic */ void zzd(zzeg zzeg, zzef zzef) {
        zzeg.zzg = zzef.zza();
        zzeg.zzf |= 1;
    }

    public static /* synthetic */ void zze(zzeg zzeg, zzfh zzfh) {
        zzfh.getClass();
        zzeg.zzj = zzfh;
        zzeg.zzf |= 4;
    }

    public static /* synthetic */ void zzg(zzeg zzeg, zzda zzda) {
        zzda.getClass();
        zzeg.zzl = zzda;
        zzeg.zzf |= 16;
    }

    public static /* synthetic */ void zzh(zzeg zzeg, zzdg zzdg) {
        zzdg.getClass();
        zzeg.zzp = zzdg;
        zzeg.zzf |= 256;
    }

    public static /* synthetic */ void zzi(zzeg zzeg, zzdo zzdo) {
        zzdo.getClass();
        zzeg.zzq = zzdo;
        zzeg.zzf |= 512;
    }

    public static /* synthetic */ void zzj(zzeg zzeg, zzeg zzeg2) {
        zzeg2.getClass();
        zzeg.zzI();
        zzeg.zzh.add(zzeg2);
    }

    public static /* synthetic */ void zzk(zzeg zzeg, zzif zzif) {
        zzif.getClass();
        zzeg.zzu = zzif;
        zzeg.zzf |= 8192;
    }

    public static /* synthetic */ void zzl(zzeg zzeg, zzhn zzhn) {
        zzhn.getClass();
        zzeg.zzy = zzhn;
        zzeg.zzf |= SQLiteDatabase.OPEN_SHAREDCACHE;
    }

    public static /* synthetic */ void zzm(zzeg zzeg, Iterable iterable) {
        zzeg.zzI();
        zzkm.zzr(iterable, zzeg.zzh);
    }

    public static /* synthetic */ void zzn(zzeg zzeg, zzhz zzhz) {
        zzhz.getClass();
        zzeg.zzz = zzhz;
        zzeg.zzf |= SQLiteDatabase.OPEN_PRIVATECACHE;
    }

    public static /* synthetic */ void zzo(zzeg zzeg, zzhz zzhz) {
        zzhz.getClass();
        zzeg.zzi = zzhz;
        zzeg.zzf |= 2;
    }

    public final Object zzf(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzmf.zzG(zze, "\u0001\u0019\u0000\u0001\u0001\u0019\u0019\u0000\u0002\u0000\u0001ဌ\u0000\u0002\u001b\u0003ဉ\u0001\u0004ဉ\u0002\u0005ဉ\u0003\u0006ဉ\u0004\u0007ဉ\u0005\bဉ\u0006\tဉ\u0007\nဉ\b\u000bဉ\t\fဉ\n\rဉ\u000b\u000eဉ\f\u000fဉ\r\u0010ဉ\u000e\u0011ဉ\u000f\u0012ဉ\u0010\u0013ဉ\u0011\u0014ဉ\u0012\u0015ဉ\u0013\u0016\u001e\u0017ဉ\u0014\u0018ဉ\u0015\u0019ဉ\u0016", new Object[]{"zzf", "zzg", zzef.zzc(), "zzh", zzeg.class, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", zzej.zzc(), "zzC", "zzD", "zzE"});
        } else if (i2 == 3) {
            return new zzeg();
        } else {
            if (i2 == 4) {
                return new zzec((zzeb) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zze;
        }
    }
}
