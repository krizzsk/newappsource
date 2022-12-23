package com.google.android.gms.internal.ads;

public final class zzbfb extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzbfb zzb;
    private int zze;
    private int zzf;
    private String zzg = "";
    private int zzh;
    private int zzi = 1000;
    private zzbgl zzj;
    /* access modifiers changed from: private */
    public zzgkw zzk = zzgko.zzaG();
    private zzbet zzl;
    private zzbew zzm;
    private zzbfp zzn;
    private zzbdx zzo;
    private zzbfz zzp;
    private zzbhg zzq;
    private zzbeg zzr;

    static {
        zzbfb zzbfb = new zzbfb();
        zzb = zzbfb;
        zzgko.zzaN(zzbfb.class, zzbfb);
    }

    private zzbfb() {
    }

    public static zzbfa zzd() {
        return (zzbfa) zzb.zzaw();
    }

    public static /* synthetic */ void zzg(zzbfb zzbfb, String str) {
        str.getClass();
        zzbfb.zze |= 2;
        zzbfb.zzg = str;
    }

    public static /* synthetic */ void zzh(zzbfb zzbfb, Iterable iterable) {
        int i;
        zzgkw zzgkw = zzbfb.zzk;
        if (!zzgkw.zzc()) {
            int size = zzgkw.size();
            if (size == 0) {
                i = 10;
            } else {
                i = size + size;
            }
            zzbfb.zzk = zzgkw.zza(i);
        }
        zzgip.zzar(iterable, zzbfb.zzk);
    }

    public static /* synthetic */ void zzj(zzbfb zzbfb, zzbet zzbet) {
        zzbet.getClass();
        zzbfb.zzl = zzbet;
        zzbfb.zze |= 32;
    }

    public static /* synthetic */ void zzk(zzbfb zzbfb, zzbdx zzbdx) {
        zzbdx.getClass();
        zzbfb.zzo = zzbdx;
        zzbfb.zze |= 256;
    }

    public static /* synthetic */ void zzl(zzbfb zzbfb, zzbfz zzbfz) {
        zzbfz.getClass();
        zzbfb.zzp = zzbfz;
        zzbfb.zze |= 512;
    }

    public static /* synthetic */ void zzm(zzbfb zzbfb, zzbhg zzbhg) {
        zzbhg.getClass();
        zzbfb.zzq = zzbhg;
        zzbfb.zze |= 1024;
    }

    public static /* synthetic */ void zzn(zzbfb zzbfb, zzbeg zzbeg) {
        zzbeg.getClass();
        zzbfb.zzr = zzbeg;
        zzbfb.zze |= 2048;
    }

    public final zzbdx zza() {
        zzbdx zzbdx = this.zzo;
        return zzbdx == null ? zzbdx.zzc() : zzbdx;
    }

    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzgko.zzaM(zzb, "\u0001\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\tင\u0000\nဈ\u0001\u000bဋ\u0002\fဌ\u0003\rဉ\u0004\u000e\u0015\u000fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014ဉ\n\u0015ဉ\u000b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", zzbey.zza, "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr"});
        } else if (i2 == 3) {
            return new zzbfb();
        } else {
            if (i2 == 4) {
                return new zzbfa((zzbds) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzbet zzc() {
        zzbet zzbet = this.zzl;
        return zzbet == null ? zzbet.zzc() : zzbet;
    }

    public final String zzf() {
        return this.zzg;
    }
}
