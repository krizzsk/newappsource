package com.google.android.gms.internal.ads;

final class zzuz extends zzvb implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;

    public zzuz(int i, zzck zzck, int i2, zzuu zzuu, int i3, String str) {
        super(i, zzck, i2);
        boolean z;
        boolean z2;
        zzfrh zzfrh;
        int i4;
        boolean z3;
        boolean z4;
        int i5 = 0;
        this.zzf = zzvf.zzi(i3, false);
        int i6 = this.zzd.zze;
        int i7 = zzuu.zzF;
        if (1 != (i6 & 1)) {
            z = false;
        } else {
            z = true;
        }
        this.zzg = z;
        if ((i6 & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.zzh = z2;
        if (zzuu.zzv.isEmpty()) {
            zzfrh = zzfrh.zzp("");
        } else {
            zzfrh = zzuu.zzv;
        }
        int i8 = 0;
        while (true) {
            if (i8 >= zzfrh.size()) {
                i8 = Integer.MAX_VALUE;
                i4 = 0;
                break;
            }
            i4 = zzvf.zza(this.zzd, (String) zzfrh.get(i8), false);
            if (i4 > 0) {
                break;
            }
            i8++;
        }
        this.zzi = i8;
        this.zzj = i4;
        int i9 = this.zzd.zzf;
        int bitCount = Integer.bitCount(0);
        this.zzk = bitCount;
        int i11 = this.zzd.zzf;
        this.zzm = false;
        if (zzvf.zzf(str) == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        int zza = zzvf.zza(this.zzd, str, z3);
        this.zzl = zza;
        if (i4 > 0 || ((zzuu.zzv.isEmpty() && bitCount > 0) || this.zzg || (this.zzh && zza > 0))) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (zzvf.zzi(i3, zzuu.zzP) && z4) {
            i5 = 1;
        }
        this.zze = i5;
    }

    /* renamed from: zza */
    public final int compareTo(zzuz zzuz) {
        zzfsp zzfsp;
        zzfqw zzd = zzfqw.zzj().zzd(this.zzf, zzuz.zzf).zzc(Integer.valueOf(this.zzi), Integer.valueOf(zzuz.zzi), zzfsp.zzc().zza()).zzb(this.zzj, zzuz.zzj).zzb(this.zzk, zzuz.zzk).zzd(this.zzg, zzuz.zzg);
        Boolean valueOf = Boolean.valueOf(this.zzh);
        Boolean valueOf2 = Boolean.valueOf(zzuz.zzh);
        if (this.zzj == 0) {
            zzfsp = zzfsp.zzc();
        } else {
            zzfsp = zzfsp.zzc().zza();
        }
        zzfqw zzb = zzd.zzc(valueOf, valueOf2, zzfsp).zzb(this.zzl, zzuz.zzl);
        if (this.zzk == 0) {
            zzb = zzb.zze(false, false);
        }
        return zzb.zza();
    }

    public final int zzb() {
        return this.zze;
    }

    public final /* bridge */ /* synthetic */ boolean zzc(zzvb zzvb) {
        zzuz zzuz = (zzuz) zzvb;
        return false;
    }
}
