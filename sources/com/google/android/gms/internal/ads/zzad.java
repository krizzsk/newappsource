package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p001a0.C0017h;

public final class zzad {
    private static final zzad zzG = new zzad(new zzab());
    public static final zzl zza = zzz.zza;
    public final int zzA;
    public final int zzB;
    public final int zzC;
    public final int zzD;
    public final int zzE;
    public final int zzF;
    private int zzH;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final String zzj;
    public final zzbl zzk;
    public final String zzl;
    public final String zzm;
    public final int zzn;
    public final List zzo;
    public final zzv zzp;
    public final long zzq;
    public final int zzr;
    public final int zzs;
    public final float zzt;
    public final int zzu;
    public final float zzv;
    public final byte[] zzw;
    public final int zzx;
    public final zzo zzy;
    public final int zzz;

    private zzad(zzab zzab) {
        List list;
        int i;
        float f;
        int i2;
        int zzf2;
        this.zzb = zzab.zza;
        this.zzc = zzab.zzb;
        this.zzd = zzeg.zzO(zzab.zzc);
        this.zze = zzab.zzd;
        int i3 = 0;
        this.zzf = 0;
        int zzd2 = zzab.zze;
        this.zzg = zzd2;
        int zzl2 = zzab.zzf;
        this.zzh = zzl2;
        this.zzi = zzl2 != -1 ? zzl2 : zzd2;
        this.zzj = zzab.zzg;
        this.zzk = zzab.zzh;
        this.zzl = zzab.zzi;
        this.zzm = zzab.zzj;
        this.zzn = zzab.zzk;
        if (zzab.zzl == null) {
            list = Collections.emptyList();
        } else {
            list = zzab.zzl;
        }
        this.zzo = list;
        zzv zzt2 = zzab.zzm;
        this.zzp = zzt2;
        this.zzq = zzab.zzn;
        this.zzr = zzab.zzo;
        this.zzs = zzab.zzp;
        this.zzt = zzab.zzq;
        if (zzab.zzr == -1) {
            i = 0;
        } else {
            i = zzab.zzr;
        }
        this.zzu = i;
        if (zzab.zzs == -1.0f) {
            f = 1.0f;
        } else {
            f = zzab.zzs;
        }
        this.zzv = f;
        this.zzw = zzab.zzt;
        this.zzx = zzab.zzu;
        this.zzy = zzab.zzv;
        this.zzz = zzab.zzw;
        this.zzA = zzab.zzx;
        this.zzB = zzab.zzy;
        if (zzab.zzz == -1) {
            i2 = 0;
        } else {
            i2 = zzab.zzz;
        }
        this.zzC = i2;
        this.zzD = zzab.zzA != -1 ? zzab.zzA : i3;
        this.zzE = zzab.zzB;
        if (zzab.zzC != 0 || zzt2 == null) {
            zzf2 = zzab.zzC;
        } else {
            zzf2 = 1;
        }
        this.zzF = zzf2;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj != null && zzad.class == obj.getClass()) {
            zzad zzad = (zzad) obj;
            int i2 = this.zzH;
            if ((i2 == 0 || (i = zzad.zzH) == 0 || i2 == i) && this.zze == zzad.zze && this.zzg == zzad.zzg && this.zzh == zzad.zzh && this.zzn == zzad.zzn && this.zzq == zzad.zzq && this.zzr == zzad.zzr && this.zzs == zzad.zzs && this.zzu == zzad.zzu && this.zzx == zzad.zzx && this.zzz == zzad.zzz && this.zzA == zzad.zzA && this.zzB == zzad.zzB && this.zzC == zzad.zzC && this.zzD == zzad.zzD && this.zzE == zzad.zzE && this.zzF == zzad.zzF && Float.compare(this.zzt, zzad.zzt) == 0 && Float.compare(this.zzv, zzad.zzv) == 0 && zzeg.zzS(this.zzb, zzad.zzb) && zzeg.zzS(this.zzc, zzad.zzc) && zzeg.zzS(this.zzj, zzad.zzj) && zzeg.zzS(this.zzl, zzad.zzl) && zzeg.zzS(this.zzm, zzad.zzm) && zzeg.zzS(this.zzd, zzad.zzd) && Arrays.equals(this.zzw, zzad.zzw) && zzeg.zzS(this.zzk, zzad.zzk) && zzeg.zzS(this.zzy, zzad.zzy) && zzeg.zzS(this.zzp, zzad.zzp) && zzd(zzad)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = this.zzH;
        if (i7 != 0) {
            return i7;
        }
        String str = this.zzb;
        int i8 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i9 = (i + 527) * 31;
        String str2 = this.zzc;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i11 = (i9 + i2) * 31;
        String str3 = this.zzd;
        if (str3 == null) {
            i3 = 0;
        } else {
            i3 = str3.hashCode();
        }
        int i12 = (((((((i11 + i3) * 31) + this.zze) * 961) + this.zzg) * 31) + this.zzh) * 31;
        String str4 = this.zzj;
        if (str4 == null) {
            i4 = 0;
        } else {
            i4 = str4.hashCode();
        }
        int i13 = (i12 + i4) * 31;
        zzbl zzbl = this.zzk;
        if (zzbl == null) {
            i5 = 0;
        } else {
            i5 = zzbl.hashCode();
        }
        int i14 = (i13 + i5) * 31;
        String str5 = this.zzl;
        if (str5 == null) {
            i6 = 0;
        } else {
            i6 = str5.hashCode();
        }
        int i15 = (i14 + i6) * 31;
        String str6 = this.zzm;
        if (str6 != null) {
            i8 = str6.hashCode();
        }
        int floatToIntBits = Float.floatToIntBits(this.zzt);
        int floatToIntBits2 = ((((((((((((((((Float.floatToIntBits(this.zzv) + ((((floatToIntBits + ((((((((((i15 + i8) * 31) + this.zzn) * 31) + ((int) this.zzq)) * 31) + this.zzr) * 31) + this.zzs) * 31)) * 31) + this.zzu) * 31)) * 31) + this.zzx) * 31) + this.zzz) * 31) + this.zzA) * 31) + this.zzB) * 31) + this.zzC) * 31) + this.zzD) * 31) + this.zzE) * 31) + this.zzF;
        this.zzH = floatToIntBits2;
        return floatToIntBits2;
    }

    public final String toString() {
        String str = this.zzb;
        String str2 = this.zzc;
        String str3 = this.zzl;
        String str4 = this.zzm;
        String str5 = this.zzj;
        int i = this.zzi;
        String str6 = this.zzd;
        int i2 = this.zzr;
        int i3 = this.zzs;
        float f = this.zzt;
        int i4 = this.zzz;
        int i5 = this.zzA;
        StringBuilder h = C16759e.m42352h("Format(", str, ", ", str2, ", ");
        C0017h.m61R(h, str3, ", ", str4, ", ");
        h.append(str5);
        h.append(", ");
        h.append(i);
        h.append(", ");
        h.append(str6);
        h.append(", [");
        h.append(i2);
        h.append(", ");
        h.append(i3);
        h.append(", ");
        h.append(f);
        h.append("], [");
        h.append(i4);
        h.append(", ");
        h.append(i5);
        h.append("])");
        return h.toString();
    }

    public final int zza() {
        int i;
        int i2 = this.zzr;
        if (i2 == -1 || (i = this.zzs) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public final zzab zzb() {
        return new zzab(this, (zzaa) null);
    }

    public final zzad zzc(int i) {
        zzab zzab = new zzab(this, (zzaa) null);
        zzab.zzA(i);
        return new zzad(zzab);
    }

    public final boolean zzd(zzad zzad) {
        if (this.zzo.size() != zzad.zzo.size()) {
            return false;
        }
        for (int i = 0; i < this.zzo.size(); i++) {
            if (!Arrays.equals((byte[]) this.zzo.get(i), (byte[]) zzad.zzo.get(i))) {
                return false;
            }
        }
        return true;
    }
}
