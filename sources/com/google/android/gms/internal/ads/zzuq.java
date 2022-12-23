package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;

final class zzuq extends zzvb implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final String zzg = zzvf.zzf(this.zzd.zzd);
    private final zzuu zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;
    private final int zzn;
    private final int zzo;
    private final boolean zzp;
    private final int zzq;
    private final int zzr;
    private final int zzs;
    private final int zzt;
    private final boolean zzu;
    private final boolean zzv;

    public zzuq(int i, zzck zzck, int i2, zzuu zzuu, int i3, boolean z) {
        super(i, zzck, i2);
        int i4;
        int i5;
        boolean z2;
        int i6;
        boolean z3;
        boolean z4;
        boolean z5;
        this.zzh = zzuu;
        int i7 = 0;
        this.zzi = zzvf.zzi(i3, false);
        int i8 = 0;
        while (true) {
            i4 = Integer.MAX_VALUE;
            if (i8 >= zzuu.zzq.size()) {
                i8 = Integer.MAX_VALUE;
                i5 = 0;
                break;
            }
            i5 = zzvf.zza(this.zzd, (String) zzuu.zzq.get(i8), false);
            if (i5 > 0) {
                break;
            }
            i8++;
        }
        this.zzk = i8;
        this.zzj = i5;
        int i9 = this.zzd.zzf;
        this.zzl = Integer.bitCount(0);
        zzad zzad = this.zzd;
        int i11 = zzad.zzf;
        this.zzm = true;
        if (1 != (zzad.zze & 1)) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.zzp = z2;
        this.zzq = zzad.zzz;
        this.zzr = zzad.zzA;
        this.zzs = zzad.zzi;
        this.zzf = true;
        String[] zzae = zzeg.zzae();
        int i12 = 0;
        while (true) {
            if (i12 >= zzae.length) {
                i12 = Integer.MAX_VALUE;
                i6 = 0;
                break;
            }
            i6 = zzvf.zza(this.zzd, zzae[i12], false);
            if (i6 > 0) {
                break;
            }
            i12++;
        }
        this.zzn = i12;
        this.zzo = i6;
        int i13 = 0;
        while (true) {
            if (i13 < zzuu.zzu.size()) {
                String str = this.zzd.zzm;
                if (str != null && str.equals(zzuu.zzu.get(i13))) {
                    i4 = i13;
                    break;
                }
                i13++;
            } else {
                break;
            }
        }
        this.zzt = i4;
        if ((i3 & RecyclerView.C1119a0.FLAG_IGNORE) == 128) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.zzu = z3;
        if ((i3 & 64) == 64) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.zzv = z4;
        zzuu zzuu2 = this.zzh;
        if (zzvf.zzi(i3, zzuu2.zzP) && ((z5 = this.zzf) || zzuu2.zzK)) {
            i7 = (!zzvf.zzi(i3, false) || !z5 || this.zzd.zzi == -1 || (!zzuu2.zzR && z)) ? 1 : 2;
        }
        this.zze = i7;
    }

    /* renamed from: zza */
    public final int compareTo(zzuq zzuq) {
        zzfsp zzfsp;
        if (!this.zzf || !this.zzi) {
            zzfsp = zzvf.zzb.zza();
        } else {
            zzfsp = zzvf.zzb;
        }
        zzfqw zzc = zzfqw.zzj().zzd(this.zzi, zzuq.zzi).zzc(Integer.valueOf(this.zzk), Integer.valueOf(zzuq.zzk), zzfsp.zzc().zza()).zzb(this.zzj, zzuq.zzj).zzb(this.zzl, zzuq.zzl).zzd(this.zzp, zzuq.zzp).zzd(true, true).zzc(Integer.valueOf(this.zzn), Integer.valueOf(zzuq.zzn), zzfsp.zzc().zza()).zzb(this.zzo, zzuq.zzo).zzd(this.zzf, zzuq.zzf).zzc(Integer.valueOf(this.zzt), Integer.valueOf(zzuq.zzt), zzfsp.zzc().zza());
        Integer valueOf = Integer.valueOf(this.zzs);
        Integer valueOf2 = Integer.valueOf(zzuq.zzs);
        boolean z = this.zzh.zzy;
        zzfqw zzc2 = zzc.zzc(valueOf, valueOf2, zzvf.zzc).zzd(this.zzu, zzuq.zzu).zzd(this.zzv, zzuq.zzv).zzc(Integer.valueOf(this.zzq), Integer.valueOf(zzuq.zzq), zzfsp).zzc(Integer.valueOf(this.zzr), Integer.valueOf(zzuq.zzr), zzfsp);
        Integer valueOf3 = Integer.valueOf(this.zzs);
        Integer valueOf4 = Integer.valueOf(zzuq.zzs);
        if (!zzeg.zzS(this.zzg, zzuq.zzg)) {
            zzfsp = zzvf.zzc;
        }
        return zzc2.zzc(valueOf3, valueOf4, zzfsp).zza();
    }

    public final int zzb() {
        return this.zze;
    }

    public final /* bridge */ /* synthetic */ boolean zzc(zzvb zzvb) {
        String str;
        zzuq zzuq = (zzuq) zzvb;
        boolean z = this.zzh.zzN;
        zzad zzad = this.zzd;
        int i = zzad.zzz;
        if (i == -1) {
            return false;
        }
        zzad zzad2 = zzuq.zzd;
        if (i != zzad2.zzz || (str = zzad.zzm) == null || !TextUtils.equals(str, zzad2.zzm)) {
            return false;
        }
        boolean z2 = this.zzh.zzM;
        int i2 = this.zzd.zzA;
        if (i2 != -1 && i2 == zzuq.zzd.zzA && this.zzu == zzuq.zzu && this.zzv == zzuq.zzv) {
            return true;
        }
        return false;
    }
}
