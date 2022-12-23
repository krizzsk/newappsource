package com.google.android.gms.internal.ads;

public class zzcp {
    public static final zzcp zza;
    @Deprecated
    public static final zzcp zzb;
    public static final zzl zzc = zzcn.zza;
    public final zzfrk zzA;
    public final zzfrm zzB;
    public final int zzd = Integer.MAX_VALUE;
    public final int zze = Integer.MAX_VALUE;
    public final int zzf = Integer.MAX_VALUE;
    public final int zzg = Integer.MAX_VALUE;
    public final int zzh = 0;
    public final int zzi = 0;
    public final int zzj = 0;
    public final int zzk = 0;
    public final int zzl;
    public final int zzm;
    public final boolean zzn;
    public final zzfrh zzo;
    public final int zzp;
    public final zzfrh zzq;
    public final int zzr;
    public final int zzs;
    public final int zzt;
    public final zzfrh zzu;
    public final zzfrh zzv;
    public final int zzw;
    public final boolean zzx;
    public final boolean zzy;
    public final boolean zzz;

    static {
        zzcp zzcp = new zzcp(new zzco());
        zza = zzcp;
        zzb = zzcp;
    }

    public zzcp(zzco zzco) {
        this.zzl = zzco.zze;
        this.zzm = zzco.zzf;
        this.zzn = zzco.zzg;
        this.zzo = zzco.zzh;
        this.zzp = 0;
        this.zzq = zzco.zzi;
        this.zzr = 0;
        this.zzs = Integer.MAX_VALUE;
        this.zzt = Integer.MAX_VALUE;
        this.zzu = zzco.zzl;
        this.zzv = zzco.zzm;
        this.zzw = zzco.zzn;
        this.zzx = false;
        this.zzy = false;
        this.zzz = false;
        this.zzA = zzfrk.zzc(zzco.zzo);
        this.zzB = zzfrm.zzl(zzco.zzp);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzcp zzcp = (zzcp) obj;
            if (this.zzn != zzcp.zzn || this.zzl != zzcp.zzl || this.zzm != zzcp.zzm || !this.zzo.equals(zzcp.zzo) || !this.zzq.equals(zzcp.zzq) || !this.zzu.equals(zzcp.zzu) || !this.zzv.equals(zzcp.zzv) || this.zzw != zzcp.zzw || !this.zzA.equals(zzcp.zzA) || !this.zzB.equals(zzcp.zzB)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.zzo.hashCode();
        int hashCode2 = this.zzq.hashCode();
        int hashCode3 = this.zzu.hashCode();
        int hashCode4 = this.zzv.hashCode();
        int hashCode5 = this.zzA.hashCode();
        return this.zzB.hashCode() + ((hashCode5 + ((((hashCode4 + ((hashCode3 + ((((((hashCode2 + ((hashCode + (((((((this.zzn ? 1 : 0) - true) * 31) + this.zzl) * 31) + this.zzm) * 31)) * 961)) * 961) + Integer.MAX_VALUE) * 31) + Integer.MAX_VALUE) * 31)) * 31)) * 31) + this.zzw) * 923521)) * 31);
    }
}
