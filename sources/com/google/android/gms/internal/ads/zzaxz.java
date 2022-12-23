package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Arrays;
import java.util.Map;

public abstract class zzaxz extends zzayd {
    private final SparseArray zza = new SparseArray();
    private final SparseBooleanArray zzb = new SparseBooleanArray();
    private zzaxx zzc;

    public abstract zzaxt[] zzb(zzary[] zzaryArr, zzaxp[] zzaxpArr, int[][][] iArr) throws zzare;

    public final zzaye zzc(zzary[] zzaryArr, zzaxp zzaxp) throws zzare {
        zzarz zzarz;
        zzaxy zzaxy;
        int[] iArr;
        zzary[] zzaryArr2 = zzaryArr;
        zzaxp zzaxp2 = zzaxp;
        int[] iArr2 = new int[3];
        zzaxo[][] zzaxoArr = new zzaxo[3][];
        int[][][] iArr3 = new int[3][][];
        for (int i = 0; i < 3; i++) {
            int i2 = zzaxp2.zzb;
            zzaxoArr[i] = new zzaxo[i2];
            iArr3[i] = new int[i2][];
        }
        int i3 = 2;
        int[] iArr4 = new int[2];
        for (int i4 = 0; i4 < 2; i4++) {
            zzaryArr2[i4].zze();
            iArr4[i4] = 4;
        }
        int i5 = 0;
        while (i5 < zzaxp2.zzb) {
            zzaxo zzb2 = zzaxp2.zzb(i5);
            int i6 = 0;
            int i7 = 0;
            int i8 = 2;
            while (true) {
                if (i6 >= i3) {
                    i6 = i8;
                    break;
                }
                zzary zzary = zzaryArr2[i6];
                int i9 = 0;
                while (true) {
                    int i11 = zzb2.zza;
                    if (i9 > 0) {
                        break;
                    }
                    int zzG = zzary.zzG(zzb2.zzb(i9)) & 3;
                    if (zzG > i7) {
                        if (zzG == 3) {
                            break;
                        }
                        i8 = i6;
                        i7 = zzG;
                    }
                    i9++;
                }
                i6++;
                i3 = 2;
            }
            if (i6 == 2) {
                int i12 = zzb2.zza;
                iArr = new int[1];
            } else {
                zzary zzary2 = zzaryArr2[i6];
                int i13 = zzb2.zza;
                int[] iArr5 = new int[1];
                for (int i14 = 0; i14 <= 0; i14++) {
                    iArr5[i14] = zzary2.zzG(zzb2.zzb(i14));
                }
                iArr = iArr5;
            }
            int i15 = iArr2[i6];
            zzaxoArr[i6][i15] = zzb2;
            iArr3[i6][i15] = iArr;
            iArr2[i6] = i15 + 1;
            i5++;
            i3 = 2;
        }
        zzaxp[] zzaxpArr = new zzaxp[2];
        int[] iArr6 = new int[2];
        int i16 = 0;
        for (int i17 = 2; i16 < i17; i17 = 2) {
            int i18 = iArr2[i16];
            zzaxpArr[i16] = new zzaxp((zzaxo[]) Arrays.copyOf(zzaxoArr[i16], i18));
            iArr3[i16] = (int[][]) Arrays.copyOf(iArr3[i16], i18);
            iArr6[i16] = zzaryArr2[i16].zzc();
            i16++;
        }
        zzaxp zzaxp3 = new zzaxp((zzaxo[]) Arrays.copyOf(zzaxoArr[2], iArr2[2]));
        zzaxt[] zzb3 = zzb(zzaryArr2, zzaxpArr, iArr3);
        int i19 = 0;
        for (int i21 = 2; i19 < i21; i21 = 2) {
            if (this.zzb.get(i19)) {
                zzb3[i19] = null;
            } else {
                zzaxp zzaxp4 = zzaxpArr[i19];
                Map map = (Map) this.zza.get(i19);
                if (map == null) {
                    zzaxy = null;
                } else {
                    zzaxy = (zzaxy) map.get(zzaxp4);
                }
                if (zzaxy != null) {
                    throw null;
                }
            }
            i19++;
        }
        zzaxx zzaxx = new zzaxx(iArr6, zzaxpArr, iArr4, iArr3, zzaxp3);
        zzarz[] zzarzArr = new zzarz[2];
        for (int i22 = 0; i22 < 2; i22++) {
            if (zzb3[i22] != null) {
                zzarz = zzarz.zza;
            } else {
                zzarz = null;
            }
            zzarzArr[i22] = zzarz;
        }
        return new zzaye(zzaxp2, new zzayb(zzb3, (byte[]) null), zzaxx, zzarzArr);
    }

    public final void zzd(Object obj) {
        this.zzc = (zzaxx) obj;
    }

    public final void zze(int i, boolean z) {
        if (this.zzb.get(i) != z) {
            this.zzb.put(i, z);
            zzg();
        }
    }
}
