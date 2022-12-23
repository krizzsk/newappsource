package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.List;

public abstract class zzvk extends zzvn {
    private zzvj zza;

    public abstract Pair zzb(zzvj zzvj, int[][][] iArr, int[] iArr2, zzsb zzsb, zzci zzci) throws zzgu;

    public final zzvo zzj(zzjv[] zzjvArr, zztz zztz, zzsb zzsb, zzci zzci) throws zzgu {
        boolean z;
        boolean z2;
        zzfrh zzfrh;
        int[] iArr;
        boolean z3;
        zztz zztz2 = zztz;
        int[] iArr2 = new int[3];
        zzck[][] zzckArr = new zzck[3][];
        int[][][] iArr3 = new int[3][][];
        for (int i = 0; i < 3; i++) {
            int i2 = zztz2.zzc;
            zzckArr[i] = new zzck[i2];
            iArr3[i] = new int[i2][];
        }
        int i3 = 2;
        int[] iArr4 = new int[2];
        for (int i4 = 0; i4 < 2; i4++) {
            iArr4[i4] = zzjvArr[i4].zze();
        }
        int i5 = 0;
        while (i5 < zztz2.zzc) {
            zzck zzb = zztz2.zzb(i5);
            int i6 = zzb.zzd;
            int i7 = 0;
            int i8 = 2;
            int i9 = 0;
            boolean z4 = true;
            while (i7 < i3) {
                zzjv zzjv = zzjvArr[i7];
                int i11 = 0;
                for (int i12 = 0; i12 <= 0; i12++) {
                    i11 = Math.max(i11, zzjv.zzO(zzb.zzb(i12)) & 7);
                }
                if (iArr2[i7] == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (i11 > i9) {
                    z4 = z3;
                    i8 = i7;
                    i9 = i11;
                } else if (i11 == i9 && i6 == 5 && !z4 && z3) {
                    i8 = i7;
                    i9 = i11;
                    z4 = true;
                }
                i7++;
                i3 = 2;
            }
            if (i8 == i3) {
                iArr = new int[1];
            } else {
                zzjv zzjv2 = zzjvArr[i8];
                int[] iArr5 = new int[1];
                for (int i13 = 0; i13 <= 0; i13++) {
                    iArr5[i13] = zzjv2.zzO(zzb.zzb(i13));
                }
                iArr = iArr5;
            }
            int i14 = iArr2[i8];
            zzckArr[i8][i14] = zzb;
            iArr3[i8][i14] = iArr;
            iArr2[i8] = i14 + 1;
            i5++;
            i3 = 2;
        }
        zztz[] zztzArr = new zztz[i3];
        String[] strArr = new String[i3];
        int[] iArr6 = new int[i3];
        int i15 = 0;
        while (i15 < i3) {
            int i16 = iArr2[i15];
            zztzArr[i15] = new zztz((zzck[]) zzeg.zzad(zzckArr[i15], i16));
            iArr3[i15] = (int[][]) zzeg.zzad(iArr3[i15], i16);
            strArr[i15] = zzjvArr[i15].zzK();
            iArr6[i15] = zzjvArr[i15].zzb();
            i15++;
            i3 = 2;
        }
        int[] iArr7 = iArr4;
        int[][][] iArr8 = iArr3;
        zzvj zzvj = new zzvj(strArr, iArr6, zztzArr, iArr7, iArr8, new zztz((zzck[]) zzeg.zzad(zzckArr[2], iArr2[2])));
        Pair zzb2 = zzb(zzvj, iArr3, iArr4, zzsb, zzci);
        zzvl[] zzvlArr = (zzvl[]) zzb2.second;
        List[] listArr = new List[zzvlArr.length];
        for (int i17 = 0; i17 < zzvlArr.length; i17++) {
            zzvl zzvl = zzvlArr[i17];
            if (zzvl != null) {
                zzfrh = zzfrh.zzp(zzvl);
            } else {
                zzfrh = zzfrh.zzo();
            }
            listArr[i17] = zzfrh;
        }
        zzfre zzfre = new zzfre();
        for (int i18 = 0; i18 < 2; i18++) {
            zztz zzd = zzvj.zzd(i18);
            List list = listArr[i18];
            for (int i19 = 0; i19 < zzd.zzc; i19++) {
                zzck zzb3 = zzd.zzb(i19);
                if (zzvj.zza(i18, i19, false) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                int i21 = zzb3.zzb;
                int[] iArr9 = new int[1];
                boolean[] zArr = new boolean[1];
                for (int i22 = 0; i22 <= 0; i22++) {
                    iArr9[i22] = zzvj.zzb(i18, i19, i22) & 7;
                    int i23 = 0;
                    while (true) {
                        if (i23 >= list.size()) {
                            z2 = false;
                            break;
                        }
                        zzvl zzvl2 = (zzvl) list.get(i23);
                        if (zzvl2.zze().equals(zzb3) && zzvl2.zzb(i22) != -1) {
                            z2 = true;
                            break;
                        }
                        i23++;
                    }
                    zArr[i22] = z2;
                }
                zzfre.zze(new zzcs(zzb3, z, iArr9, zArr));
            }
        }
        zztz zze = zzvj.zze();
        for (int i24 = 0; i24 < zze.zzc; i24++) {
            zzck zzb4 = zze.zzb(i24);
            int i25 = zzb4.zzb;
            int[] iArr10 = new int[1];
            Arrays.fill(iArr10, 0);
            zzfre.zze(new zzcs(zzb4, false, iArr10, new boolean[1]));
        }
        return new zzvo((zzjw[]) zzb2.first, (zzvh[]) zzb2.second, new zzct(zzfre.zzg()), zzvj);
    }

    public final void zzk(Object obj) {
        this.zza = (zzvj) obj;
    }
}
