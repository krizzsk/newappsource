package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public final class zzaxv extends zzaxz {
    private final AtomicReference zza;

    public zzaxv() {
        this((zzaya) null);
    }

    public static boolean zza(int i, boolean z) {
        int i2 = i & 3;
        return i2 == 3 || (z && i2 == 2);
    }

    private static int zzh(int i, int i2) {
        if (i == -1) {
            return i2 != -1 ? -1 : 0;
        }
        if (i2 == -1) {
            return 1;
        }
        return i - i2;
    }

    public final zzaxt[] zzb(zzary[] zzaryArr, zzaxp[] zzaxpArr, int[][][] iArr) throws zzare {
        zzaxw zzaxw;
        int i;
        zzaxw zzaxw2;
        int[] iArr2;
        ArrayList arrayList;
        zzaxo zzaxo;
        boolean z;
        boolean z2;
        int i2;
        boolean z3;
        int i3;
        int i4 = 2;
        zzaxt[] zzaxtArr = new zzaxt[2];
        zzaxu zzaxu = (zzaxu) this.zza.get();
        int i5 = 0;
        boolean z4 = false;
        while (true) {
            int i6 = -1;
            int i7 = 1;
            if (i5 >= i4) {
                break;
            }
            if (zzaryArr[i5].zzc() == i4) {
                if (!z4) {
                    zzary zzary = zzaryArr[i5];
                    zzaxp zzaxp = zzaxpArr[i5];
                    int[][] iArr3 = iArr[i5];
                    int i8 = zzaxu.zzd;
                    int i9 = -1;
                    int i11 = 0;
                    zzaxo zzaxo2 = null;
                    int i12 = 0;
                    int i13 = 0;
                    while (i11 < zzaxp.zzb) {
                        zzaxo zzb = zzaxp.zzb(i11);
                        int i14 = zzb.zza;
                        ArrayList arrayList2 = new ArrayList(i7);
                        for (int i15 = 0; i15 <= 0; i15++) {
                            arrayList2.add(Integer.valueOf(i15));
                        }
                        int[] iArr4 = iArr3[i11];
                        int i16 = 0;
                        while (i16 <= 0) {
                            zzaxp zzaxp2 = zzaxp;
                            if (zza(iArr4[i16], true)) {
                                zzars zzb2 = zzb.zzb(i16);
                                if (arrayList2.contains(Integer.valueOf(i16))) {
                                    int i17 = zzb2.zzj;
                                    zzaxo = zzb;
                                    z2 = true;
                                    z = true;
                                } else {
                                    zzaxo = zzb;
                                    z2 = true;
                                    z = false;
                                }
                                if (z2 != z) {
                                    arrayList = arrayList2;
                                    i2 = 1;
                                } else {
                                    arrayList = arrayList2;
                                    i2 = 2;
                                }
                                iArr2 = iArr4;
                                boolean zza2 = zza(iArr4[i16], false);
                                if (zza2) {
                                    i2 += 1000;
                                }
                                if (i2 > i13) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (i2 == i13) {
                                    if (zzb2.zza() != i9) {
                                        i3 = zzh(zzb2.zza(), i9);
                                    } else {
                                        i3 = zzh(zzb2.zzb, i6);
                                    }
                                    if (!zza2 || !z ? i3 >= 0 : i3 <= 0) {
                                        z3 = false;
                                    } else {
                                        z3 = true;
                                    }
                                }
                                if (z3) {
                                    i6 = zzb2.zzb;
                                    i9 = zzb2.zza();
                                    i13 = i2;
                                    i12 = i16;
                                    zzaxo2 = zzaxo;
                                }
                            } else {
                                zzaxo = zzb;
                                iArr2 = iArr4;
                                arrayList = arrayList2;
                            }
                            i16++;
                            zzaxp = zzaxp2;
                            zzb = zzaxo;
                            arrayList2 = arrayList;
                            iArr4 = iArr2;
                        }
                        zzaxp zzaxp3 = zzaxp;
                        i11++;
                        i7 = 1;
                    }
                    if (zzaxo2 == null) {
                        zzaxw2 = null;
                    } else {
                        zzaxw2 = new zzaxw(zzaxo2, i12, 0, (Object) null);
                    }
                    zzaxtArr[i5] = zzaxw2;
                    if (zzaxw2 != null) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                }
                int i18 = zzaxpArr[i5].zzb;
            }
            i5++;
            i4 = 2;
        }
        int i19 = 0;
        boolean z5 = false;
        while (i19 < i4) {
            if (zzaryArr[i19].zzc() == 1 && !z5) {
                zzaxp zzaxp4 = zzaxpArr[i19];
                int[][] iArr5 = iArr[i19];
                String str = zzaxu.zza;
                int i21 = 0;
                int i22 = 0;
                int i23 = -1;
                int i24 = -1;
                while (i21 < zzaxp4.zzb) {
                    zzaxo zzb3 = zzaxp4.zzb(i21);
                    int[] iArr6 = iArr5[i21];
                    int i25 = i24;
                    int i26 = i23;
                    int i27 = i22;
                    int i28 = 0;
                    while (true) {
                        int i29 = zzb3.zza;
                        if (i28 > 0) {
                            break;
                        }
                        if (zza(iArr6[i28], true)) {
                            zzars zzb4 = zzb3.zzb(i28);
                            int i31 = iArr6[i28];
                            if (1 != (zzb4.zzx & 1)) {
                                i = 1;
                            } else {
                                i = 2;
                            }
                            if (zza(i31, false)) {
                                i += 1000;
                            }
                            if (i > i27) {
                                i26 = i21;
                                i25 = i28;
                                i27 = i;
                            }
                        }
                        i28++;
                    }
                    i21++;
                    i22 = i27;
                    i23 = i26;
                    i24 = i25;
                }
                if (i23 == -1) {
                    zzaxw = null;
                } else {
                    zzaxw = new zzaxw(zzaxp4.zzb(i23), i24, 0, (Object) null);
                }
                zzaxtArr[i19] = zzaxw;
                if (zzaxw != null) {
                    z5 = true;
                } else {
                    z5 = false;
                }
            }
            i19++;
            i4 = 2;
        }
        return zzaxtArr;
    }

    public zzaxv(zzaya zzaya) {
        this.zza = new AtomicReference(new zzaxu());
    }
}
