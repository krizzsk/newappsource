package com.google.android.gms.internal.ads;

import java.io.IOException;

public abstract class zzgl implements zzju, zzjv {
    private final int zza;
    private final zzja zzb = new zzja();
    private zzjw zzc;
    private int zzd;
    private zzmv zze;
    private int zzf;
    private zztr zzg;
    private zzad[] zzh;
    private long zzi;
    private long zzj = Long.MIN_VALUE;
    private boolean zzk;
    private boolean zzl;

    public zzgl(int i) {
        this.zza = i;
    }

    private final void zzP(long j, boolean z) throws zzgu {
        this.zzk = false;
        this.zzj = j;
        zzu(j, z);
    }

    public final void zzA() {
        boolean z;
        if (this.zzf == 0) {
            z = true;
        } else {
            z = false;
        }
        zzcw.zzf(z);
        zzja zzja = this.zzb;
        zzja.zzb = null;
        zzja.zza = null;
        zzv();
    }

    public final void zzB(long j) throws zzgu {
        zzP(j, false);
    }

    public final void zzC() {
        this.zzk = true;
    }

    public /* synthetic */ void zzD(float f, float f2) {
    }

    public final void zzE() throws zzgu {
        boolean z = true;
        if (this.zzf != 1) {
            z = false;
        }
        zzcw.zzf(z);
        this.zzf = 2;
        zzw();
    }

    public final void zzF() {
        boolean z;
        if (this.zzf == 2) {
            z = true;
        } else {
            z = false;
        }
        zzcw.zzf(z);
        this.zzf = 1;
        zzx();
    }

    public final boolean zzG() {
        return this.zzj == Long.MIN_VALUE;
    }

    public final boolean zzH() {
        return this.zzk;
    }

    public final boolean zzI() {
        if (zzG()) {
            return this.zzk;
        }
        zztr zztr = this.zzg;
        zztr.getClass();
        return zztr.zze();
    }

    public final zzad[] zzJ() {
        zzad[] zzadArr = this.zzh;
        zzadArr.getClass();
        return zzadArr;
    }

    public final int zzb() {
        return this.zza;
    }

    public final int zzbe() {
        return this.zzf;
    }

    public final int zzbf(zzja zzja, zzgc zzgc, int i) {
        zztr zztr = this.zzg;
        zztr.getClass();
        int zza2 = zztr.zza(zzja, zzgc, i);
        if (zza2 == -4) {
            if (zzgc.zzg()) {
                this.zzj = Long.MIN_VALUE;
                if (this.zzk) {
                    return -4;
                }
                return -3;
            }
            long j = zzgc.zzd + this.zzi;
            zzgc.zzd = j;
            this.zzj = Math.max(this.zzj, j);
        } else if (zza2 == -5) {
            zzad zzad = zzja.zza;
            zzad.getClass();
            long j2 = zzad.zzq;
            if (j2 != Long.MAX_VALUE) {
                zzab zzb2 = zzad.zzb();
                zzb2.zzW(j2 + this.zzi);
                zzja.zza = zzb2.zzY();
                return -5;
            }
        }
        return zza2;
    }

    public final zzgu zzbg(Throwable th, zzad zzad, boolean z, int i) {
        int i2;
        if (zzad != null && !this.zzl) {
            this.zzl = true;
            try {
                int zzO = zzO(zzad) & 7;
                this.zzl = false;
                i2 = zzO;
            } catch (zzgu unused) {
                this.zzl = false;
            } catch (Throwable th2) {
                this.zzl = false;
                throw th2;
            }
            return zzgu.zzb(th, zzK(), this.zzd, zzad, i2, z, i);
        }
        i2 = 4;
        return zzgu.zzb(th, zzK(), this.zzd, zzad, i2, z, i);
    }

    public final int zzd(long j) {
        zztr zztr = this.zzg;
        zztr.getClass();
        return zztr.zzb(j - this.zzi);
    }

    public int zze() throws zzgu {
        return 0;
    }

    public final long zzf() {
        return this.zzj;
    }

    public final zzja zzh() {
        zzja zzja = this.zzb;
        zzja.zzb = null;
        zzja.zza = null;
        return zzja;
    }

    public zzjc zzi() {
        return null;
    }

    public final zzjv zzj() {
        return this;
    }

    public final zzjw zzk() {
        zzjw zzjw = this.zzc;
        zzjw.getClass();
        return zzjw;
    }

    public final zzmv zzl() {
        zzmv zzmv = this.zze;
        zzmv.getClass();
        return zzmv;
    }

    public final zztr zzm() {
        return this.zzg;
    }

    public final void zzn() {
        boolean z = true;
        if (this.zzf != 1) {
            z = false;
        }
        zzcw.zzf(z);
        zzja zzja = this.zzb;
        zzja.zzb = null;
        zzja.zza = null;
        this.zzf = 0;
        this.zzg = null;
        this.zzh = null;
        this.zzk = false;
        zzs();
    }

    public final void zzo(zzjw zzjw, zzad[] zzadArr, zztr zztr, long j, boolean z, boolean z2, long j2, long j3) throws zzgu {
        boolean z3;
        boolean z4 = z;
        if (this.zzf == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        zzcw.zzf(z3);
        this.zzc = zzjw;
        this.zzf = 1;
        zzt(z, z2);
        zzz(zzadArr, zztr, j2, j3);
        long j4 = j;
        zzP(j, z);
    }

    public void zzp(int i, Object obj) throws zzgu {
    }

    public final void zzq(int i, zzmv zzmv) {
        this.zzd = i;
        this.zze = zzmv;
    }

    public final void zzr() throws IOException {
        zztr zztr = this.zzg;
        zztr.getClass();
        zztr.zzd();
    }

    public void zzs() {
        throw null;
    }

    public void zzt(boolean z, boolean z2) throws zzgu {
    }

    public void zzu(long j, boolean z) throws zzgu {
        throw null;
    }

    public void zzv() {
    }

    public void zzw() throws zzgu {
    }

    public void zzx() {
    }

    public void zzy(zzad[] zzadArr, long j, long j2) throws zzgu {
        throw null;
    }

    public final void zzz(zzad[] zzadArr, zztr zztr, long j, long j2) throws zzgu {
        zzcw.zzf(!this.zzk);
        this.zzg = zztr;
        if (this.zzj == Long.MIN_VALUE) {
            this.zzj = j;
        }
        this.zzh = zzadArr;
        this.zzi = j2;
        zzy(zzadArr, j, j2);
    }
}
