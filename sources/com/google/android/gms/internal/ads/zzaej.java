package com.google.android.gms.internal.ads;

import android.util.Pair;
import android.util.SparseArray;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public final class zzaej implements zzys {
    public static final zzyz zza = zzaef.zza;
    private static final byte[] zzb = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final zzad zzc;
    private int zzA;
    private int zzB;
    private boolean zzC;
    private zzyv zzD;
    private zzzz[] zzE;
    private zzzz[] zzF;
    private boolean zzG;
    private final List zzd;
    private final SparseArray zze;
    private final zzdy zzf;
    private final zzdy zzg;
    private final zzdy zzh;
    private final byte[] zzi;
    private final zzdy zzj;
    private final zzabf zzk;
    private final zzdy zzl;
    private final ArrayDeque zzm;
    private final ArrayDeque zzn;
    private int zzo;
    private int zzp;
    private long zzq;
    private int zzr;
    private zzdy zzs;
    private long zzt;
    private int zzu;
    private long zzv;
    private long zzw;
    private long zzx;
    private zzaei zzy;
    private int zzz;

    static {
        zzab zzab = new zzab();
        zzab.zzS("application/x-emsg");
        zzc = zzab.zzY();
    }

    public zzaej() {
        this(0, (zzee) null);
    }

    private static int zze(int i) throws zzbp {
        if (i >= 0) {
            return i;
        }
        throw zzbp.zza("Unexpected negative value: " + i, (Throwable) null);
    }

    private static zzv zzf(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            zzadv zzadv = (zzadv) list.get(i);
            if (zzadv.zzd == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] zzH = zzadv.zza.zzH();
                UUID zza2 = zzaeq.zza(zzH);
                if (zza2 != null) {
                    arrayList.add(new zzu(zza2, (String) null, "video/mp4", zzH));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new zzv((List) arrayList);
    }

    private final void zzg() {
        this.zzo = 0;
        this.zzr = 0;
    }

    private static void zzh(zzdy zzdy, int i, zzaev zzaev) throws zzbp {
        boolean z;
        zzdy.zzF(i + 8);
        int zze2 = zzdy.zze() & 16777215;
        if ((zze2 & 1) == 0) {
            if ((zze2 & 2) != 0) {
                z = true;
            } else {
                z = false;
            }
            int zzn2 = zzdy.zzn();
            if (zzn2 == 0) {
                Arrays.fill(zzaev.zzl, 0, zzaev.zze, false);
                return;
            }
            int i2 = zzaev.zze;
            if (zzn2 == i2) {
                Arrays.fill(zzaev.zzl, 0, zzn2, z);
                zzaev.zza(zzdy.zza());
                zzdy zzdy2 = zzaev.zzn;
                zzdy.zzB(zzdy2.zzH(), 0, zzdy2.zzd());
                zzaev.zzn.zzF(0);
                zzaev.zzo = false;
                return;
            }
            throw zzbp.zza("Senc sample count " + zzn2 + " is different from fragment sample count" + i2, (Throwable) null);
        }
        throw zzbp.zzc("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    private final void zzi(long j) throws zzbp {
        zzaej zzaej;
        String str;
        int i;
        zzadu zzadu;
        int i2;
        SparseArray sparseArray;
        byte[] bArr;
        int i3;
        String str2;
        byte[] bArr2;
        byte[] bArr3;
        long j2;
        int i4;
        boolean z;
        boolean z2;
        boolean z3;
        zzaev zzaev;
        zzadu zzadu2;
        int i5;
        int i6;
        byte[] bArr4;
        zzadu zzadu3;
        int i7;
        int i8;
        List list;
        int i9;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        long j3;
        zzaee zzaee;
        boolean z4;
        long j4;
        int i21;
        int i22;
        int i23;
        int i24;
        boolean z5;
        zzaej zzaej2 = this;
        while (!zzaej2.zzm.isEmpty() && ((zzadu) zzaej2.zzm.peek()).zza == j) {
            zzadu zzadu4 = (zzadu) zzaej2.zzm.pop();
            int i25 = zzadu4.zzd;
            int i26 = 12;
            int i27 = 8;
            if (i25 == 1836019574) {
                zzv zzf2 = zzf(zzadu4.zzb);
                zzadu zza2 = zzadu4.zza(1836475768);
                zza2.getClass();
                SparseArray sparseArray2 = new SparseArray();
                int size = zza2.zzb.size();
                long j5 = -9223372036854775807L;
                int i28 = 0;
                while (i28 < size) {
                    zzadv zzadv = (zzadv) zza2.zzb.get(i28);
                    int i29 = zzadv.zzd;
                    if (i29 == 1953654136) {
                        zzdy zzdy = zzadv.zza;
                        zzdy.zzF(i26);
                        Pair create = Pair.create(Integer.valueOf(zzdy.zze()), new zzaee(zzdy.zze() - 1, zzdy.zze(), zzdy.zze(), zzdy.zze()));
                        sparseArray2.put(((Integer) create.first).intValue(), (zzaee) create.second);
                    } else if (i29 == 1835362404) {
                        zzdy zzdy2 = zzadv.zza;
                        zzdy2.zzF(8);
                        if (zzadw.zze(zzdy2.zze()) == 0) {
                            j5 = zzdy2.zzs();
                        } else {
                            j5 = zzdy2.zzt();
                        }
                    }
                    i28++;
                    i26 = 12;
                }
                List zzc2 = zzaed.zzc(zzadu4, new zzzh(), j5, zzf2, false, false, new zzaeg(zzaej2));
                int size2 = zzc2.size();
                if (zzaej2.zze.size() == 0) {
                    for (int i31 = 0; i31 < size2; i31++) {
                        zzaew zzaew = (zzaew) zzc2.get(i31);
                        zzaet zzaet = zzaew.zza;
                        zzaej2.zze.put(zzaet.zza, new zzaei(zzaej2.zzD.zzv(i31, zzaet.zzb), zzaew, zzj(sparseArray2, zzaet.zza)));
                        zzaej2.zzw = Math.max(zzaej2.zzw, zzaet.zze);
                    }
                    zzaej2.zzD.zzB();
                } else {
                    if (zzaej2.zze.size() == size2) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    zzcw.zzf(z5);
                    for (int i32 = 0; i32 < size2; i32++) {
                        zzaew zzaew2 = (zzaew) zzc2.get(i32);
                        zzaet zzaet2 = zzaew2.zza;
                        ((zzaei) zzaej2.zze.get(zzaet2.zza)).zzh(zzaew2, zzj(sparseArray2, zzaet2.zza));
                    }
                }
            } else {
                if (i25 == 1836019558) {
                    SparseArray sparseArray3 = zzaej2.zze;
                    byte[] bArr5 = zzaej2.zzi;
                    int size3 = zzadu4.zzc.size();
                    int i33 = 0;
                    while (i33 < size3) {
                        zzadu zzadu5 = (zzadu) zzadu4.zzc.get(i33);
                        if (zzadu5.zzd == 1953653094) {
                            zzadv zzb2 = zzadu5.zzb(1952868452);
                            zzb2.getClass();
                            zzdy zzdy3 = zzb2.zza;
                            zzdy3.zzF(i27);
                            int zze2 = zzdy3.zze() & 16777215;
                            zzaei zzaei = (zzaei) sparseArray3.get(zzdy3.zze());
                            if (zzaei == null) {
                                zzaei = null;
                            } else {
                                if ((zze2 & 1) != 0) {
                                    long zzt2 = zzdy3.zzt();
                                    zzaev zzaev2 = zzaei.zzb;
                                    zzaev2.zzb = zzt2;
                                    zzaev2.zzc = zzt2;
                                }
                                zzaee zzaee2 = zzaei.zze;
                                if ((zze2 & 2) != 0) {
                                    i21 = zzdy3.zze() - 1;
                                } else {
                                    i21 = zzaee2.zza;
                                }
                                if ((zze2 & 8) != 0) {
                                    i22 = zzdy3.zze();
                                } else {
                                    i22 = zzaee2.zzb;
                                }
                                if ((zze2 & 16) != 0) {
                                    i23 = zzdy3.zze();
                                } else {
                                    i23 = zzaee2.zzc;
                                }
                                if ((zze2 & 32) != 0) {
                                    i24 = zzdy3.zze();
                                } else {
                                    i24 = zzaee2.zzd;
                                }
                                zzaei.zzb.zza = new zzaee(i21, i22, i23, i24);
                            }
                            if (zzaei != null) {
                                zzaev zzaev3 = zzaei.zzb;
                                long j6 = zzaev3.zzp;
                                boolean z6 = zzaev3.zzq;
                                zzaei.zzi();
                                zzaei.zzl = true;
                                zzadv zzb3 = zzadu5.zzb(1952867444);
                                if (zzb3 != null) {
                                    zzdy zzdy4 = zzb3.zza;
                                    zzdy4.zzF(i27);
                                    if (zzadw.zze(zzdy4.zze()) == 1) {
                                        j4 = zzdy4.zzt();
                                    } else {
                                        j4 = zzdy4.zzs();
                                    }
                                    zzaev3.zzp = j4;
                                    zzaev3.zzq = true;
                                } else {
                                    zzaev3.zzp = j6;
                                    zzaev3.zzq = z6;
                                }
                                List list2 = zzadu5.zzb;
                                int size4 = list2.size();
                                int i34 = 0;
                                int i35 = 0;
                                int i36 = 0;
                                while (true) {
                                    i3 = 1953658222;
                                    if (i34 >= size4) {
                                        break;
                                    }
                                    zzadv zzadv2 = (zzadv) list2.get(i34);
                                    SparseArray sparseArray4 = sparseArray3;
                                    if (zzadv2.zzd == 1953658222) {
                                        zzdy zzdy5 = zzadv2.zza;
                                        zzdy5.zzF(12);
                                        int zzn2 = zzdy5.zzn();
                                        if (zzn2 > 0) {
                                            i36 += zzn2;
                                            i35++;
                                        }
                                    }
                                    i34++;
                                    sparseArray3 = sparseArray4;
                                }
                                sparseArray = sparseArray3;
                                zzaei.zzh = 0;
                                zzaei.zzg = 0;
                                zzaei.zzf = 0;
                                zzaev zzaev4 = zzaei.zzb;
                                zzaev4.zzd = i35;
                                zzaev4.zze = i36;
                                if (zzaev4.zzg.length < i35) {
                                    zzaev4.zzf = new long[i35];
                                    zzaev4.zzg = new int[i35];
                                }
                                if (zzaev4.zzh.length < i36) {
                                    int i37 = (i36 * 125) / 100;
                                    zzaev4.zzh = new int[i37];
                                    zzaev4.zzi = new long[i37];
                                    zzaev4.zzj = new boolean[i37];
                                    zzaev4.zzl = new boolean[i37];
                                }
                                int i38 = 0;
                                int i39 = 0;
                                int i41 = 0;
                                while (true) {
                                    long j7 = 0;
                                    if (i38 >= size4) {
                                        break;
                                    }
                                    zzadv zzadv3 = (zzadv) list2.get(i38);
                                    if (zzadv3.zzd == i3) {
                                        zzdy zzdy6 = zzadv3.zza;
                                        zzdy6.zzF(8);
                                        int zze3 = zzdy6.zze() & 16777215;
                                        list = list2;
                                        zzaet zzaet3 = zzaei.zzd.zza;
                                        i8 = size3;
                                        zzaev zzaev5 = zzaei.zzb;
                                        i7 = size4;
                                        zzaee zzaee3 = zzaev5.zza;
                                        int i42 = zzeg.zza;
                                        int i43 = i41 + 1;
                                        zzaev5.zzg[i41] = zzdy6.zzn();
                                        long[] jArr = zzaev5.zzf;
                                        zzadu3 = zzadu4;
                                        bArr4 = bArr5;
                                        long j8 = zzaev5.zzb;
                                        jArr[i41] = j8;
                                        if ((zze3 & 1) != 0) {
                                            i6 = i38;
                                            jArr[i41] = j8 + ((long) zzdy6.zze());
                                        } else {
                                            i6 = i38;
                                        }
                                        int i44 = zze3 & 4;
                                        int i45 = zzaee3.zzd;
                                        if (i44 != 0) {
                                            i45 = zzdy6.zze();
                                        }
                                        int i46 = zze3 & 256;
                                        int i47 = zze3 & 512;
                                        int i48 = zze3 & 1024;
                                        int i49 = zze3 & 2048;
                                        int i51 = i45;
                                        long[] jArr2 = zzaet3.zzh;
                                        if (jArr2 != null) {
                                            i5 = i33;
                                            zzadu2 = zzadu5;
                                            if (jArr2.length == 1 && jArr2[0] == 0) {
                                                j7 = ((long[]) zzeg.zzG(zzaet3.zzi))[0];
                                            }
                                        } else {
                                            i5 = i33;
                                            zzadu2 = zzadu5;
                                        }
                                        int[] iArr = zzaev5.zzh;
                                        long[] jArr3 = zzaev5.zzi;
                                        boolean[] zArr = zzaev5.zzj;
                                        zzaev = zzaev3;
                                        int i52 = zzaev5.zzg[i41] + i39;
                                        boolean[] zArr2 = zArr;
                                        long j9 = zzaet3.zzc;
                                        int i53 = i39;
                                        long[] jArr4 = jArr3;
                                        long j10 = zzaev5.zzp;
                                        while (i53 < i52) {
                                            if (i46 != 0) {
                                                i9 = i46;
                                                i11 = zzdy6.zze();
                                            } else {
                                                i9 = i46;
                                                i11 = zzaee3.zzb;
                                            }
                                            zze(i11);
                                            if (i47 != 0) {
                                                i12 = i47;
                                                i13 = zzdy6.zze();
                                            } else {
                                                i12 = i47;
                                                i13 = zzaee3.zzc;
                                            }
                                            zze(i13);
                                            if (i48 != 0) {
                                                i14 = i44;
                                                i15 = zzdy6.zze();
                                            } else {
                                                i14 = i44;
                                                if (i53 == 0) {
                                                    if (i44 != 0) {
                                                        i15 = i51;
                                                        i53 = 0;
                                                    } else {
                                                        i53 = 0;
                                                    }
                                                }
                                                i15 = zzaee3.zzd;
                                            }
                                            if (i49 != 0) {
                                                i18 = i52;
                                                i17 = i48;
                                                i16 = i49;
                                                i19 = zzdy6.zze();
                                            } else {
                                                i18 = i52;
                                                i17 = i48;
                                                i16 = i49;
                                                i19 = 0;
                                            }
                                            long zzw2 = zzeg.zzw((((long) i19) + j10) - j7, 1000000, j9);
                                            jArr4[i53] = zzw2;
                                            if (!zzaev5.zzq) {
                                                zzaee = zzaee3;
                                                j3 = j9;
                                                jArr4[i53] = zzw2 + zzaei.zzd.zzh;
                                            } else {
                                                zzaee = zzaee3;
                                                j3 = j9;
                                            }
                                            iArr[i53] = i13;
                                            if (1 != (((i15 >> 16) & 1) ^ 1)) {
                                                z4 = false;
                                            } else {
                                                z4 = true;
                                            }
                                            zArr2[i53] = z4;
                                            j10 += (long) i11;
                                            i53++;
                                            zzaee3 = zzaee;
                                            j9 = j3;
                                            i46 = i9;
                                            i47 = i12;
                                            i44 = i14;
                                            i52 = i18;
                                            i48 = i17;
                                            i49 = i16;
                                        }
                                        zzaev5.zzp = j10;
                                        i41 = i43;
                                        i39 = i52;
                                    } else {
                                        i6 = i38;
                                        zzadu3 = zzadu4;
                                        bArr4 = bArr5;
                                        zzaev = zzaev3;
                                        list = list2;
                                        i8 = size3;
                                        int i54 = i39;
                                        i5 = i33;
                                        i7 = size4;
                                        zzadu2 = zzadu5;
                                    }
                                    i38 = i6 + 1;
                                    list2 = list;
                                    size3 = i8;
                                    size4 = i7;
                                    zzadu4 = zzadu3;
                                    bArr5 = bArr4;
                                    i33 = i5;
                                    zzadu5 = zzadu2;
                                    zzaev3 = zzaev;
                                    i3 = 1953658222;
                                }
                                zzadu = zzadu4;
                                byte[] bArr6 = bArr5;
                                i2 = size3;
                                i = i33;
                                zzaet zzaet4 = zzaei.zzd.zza;
                                zzaev zzaev6 = zzaev3;
                                zzaee zzaee4 = zzaev6.zza;
                                zzaee4.getClass();
                                zzaeu zza3 = zzaet4.zza(zzaee4.zza);
                                zzadu zzadu6 = zzadu5;
                                zzadv zzb4 = zzadu6.zzb(1935763834);
                                if (zzb4 != null) {
                                    zza3.getClass();
                                    zzdy zzdy7 = zzb4.zza;
                                    int i55 = zza3.zzd;
                                    zzdy7.zzF(8);
                                    if ((zzdy7.zze() & 1) == 1) {
                                        zzdy7.zzG(8);
                                    }
                                    int zzk2 = zzdy7.zzk();
                                    int zzn3 = zzdy7.zzn();
                                    int i56 = zzaev6.zze;
                                    if (zzn3 <= i56) {
                                        if (zzk2 == 0) {
                                            boolean[] zArr3 = zzaev6.zzl;
                                            i4 = 0;
                                            for (int i57 = 0; i57 < zzn3; i57++) {
                                                int zzk3 = zzdy7.zzk();
                                                i4 += zzk3;
                                                if (zzk3 > i55) {
                                                    z3 = true;
                                                } else {
                                                    z3 = false;
                                                }
                                                zArr3[i57] = z3;
                                            }
                                            z = false;
                                        } else {
                                            if (zzk2 > i55) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            i4 = zzk2 * zzn3;
                                            z = false;
                                            Arrays.fill(zzaev6.zzl, 0, zzn3, z2);
                                        }
                                        Arrays.fill(zzaev6.zzl, zzn3, zzaev6.zze, z);
                                        if (i4 > 0) {
                                            zzaev6.zza(i4);
                                        }
                                    } else {
                                        throw zzbp.zza("Saiz sample count " + zzn3 + " is greater than fragment sample count" + i56, (Throwable) null);
                                    }
                                }
                                zzadv zzb5 = zzadu6.zzb(1935763823);
                                if (zzb5 != null) {
                                    zzdy zzdy8 = zzb5.zza;
                                    zzdy8.zzF(8);
                                    int zze4 = zzdy8.zze();
                                    if ((zze4 & 1) == 1) {
                                        zzdy8.zzG(8);
                                    }
                                    int zzn4 = zzdy8.zzn();
                                    if (zzn4 == 1) {
                                        long j11 = zzaev6.zzc;
                                        if (zzadw.zze(zze4) == 0) {
                                            j2 = zzdy8.zzs();
                                        } else {
                                            j2 = zzdy8.zzt();
                                        }
                                        zzaev6.zzc = j11 + j2;
                                    } else {
                                        throw zzbp.zza("Unexpected saio entry count: " + zzn4, (Throwable) null);
                                    }
                                }
                                zzadv zzb6 = zzadu6.zzb(1936027235);
                                if (zzb6 != null) {
                                    zzh(zzb6.zza, 0, zzaev6);
                                }
                                if (zza3 != null) {
                                    str2 = zza3.zzb;
                                } else {
                                    str2 = null;
                                }
                                zzdy zzdy9 = null;
                                zzdy zzdy10 = null;
                                for (int i58 = 0; i58 < zzadu6.zzb.size(); i58++) {
                                    zzadv zzadv4 = (zzadv) zzadu6.zzb.get(i58);
                                    zzdy zzdy11 = zzadv4.zza;
                                    int i59 = zzadv4.zzd;
                                    if (i59 == 1935828848) {
                                        zzdy11.zzF(12);
                                        if (zzdy11.zze() == 1936025959) {
                                            zzdy9 = zzdy11;
                                        }
                                    } else if (i59 == 1936158820) {
                                        zzdy11.zzF(12);
                                        if (zzdy11.zze() == 1936025959) {
                                            zzdy10 = zzdy11;
                                        }
                                    }
                                }
                                if (zzdy9 != null && zzdy10 != null) {
                                    zzdy9.zzF(8);
                                    int zze5 = zzdy9.zze();
                                    zzdy9.zzG(4);
                                    if (zzadw.zze(zze5) == 1) {
                                        zzdy9.zzG(4);
                                    }
                                    if (zzdy9.zze() == 1) {
                                        zzdy10.zzF(8);
                                        int zze6 = zzadw.zze(zzdy10.zze());
                                        zzdy10.zzG(4);
                                        if (zze6 == 1) {
                                            if (zzdy10.zzs() == 0) {
                                                throw zzbp.zzc("Variable length description in sgpd found (unsupported)");
                                            }
                                        } else if (zze6 >= 2) {
                                            zzdy10.zzG(4);
                                        }
                                        if (zzdy10.zzs() == 1) {
                                            zzdy10.zzG(1);
                                            int zzk4 = zzdy10.zzk();
                                            int i61 = (zzk4 & 240) >> 4;
                                            int i62 = zzk4 & 15;
                                            if (zzdy10.zzk() == 1) {
                                                int zzk5 = zzdy10.zzk();
                                                byte[] bArr7 = new byte[16];
                                                zzdy10.zzB(bArr7, 0, 16);
                                                if (zzk5 == 0) {
                                                    int zzk6 = zzdy10.zzk();
                                                    byte[] bArr8 = new byte[zzk6];
                                                    zzdy10.zzB(bArr8, 0, zzk6);
                                                    bArr3 = bArr8;
                                                } else {
                                                    bArr3 = null;
                                                }
                                                zzaev6.zzk = true;
                                                zzaev6.zzm = new zzaeu(true, str2, zzk5, bArr7, i61, i62, bArr3);
                                            }
                                        } else {
                                            throw zzbp.zzc("Entry count in sgpd != 1 (unsupported).");
                                        }
                                    } else {
                                        throw zzbp.zzc("Entry count in sbgp != 1 (unsupported).");
                                    }
                                }
                                int size5 = zzadu6.zzb.size();
                                int i63 = 0;
                                while (i63 < size5) {
                                    zzadv zzadv5 = (zzadv) zzadu6.zzb.get(i63);
                                    if (zzadv5.zzd == 1970628964) {
                                        zzdy zzdy12 = zzadv5.zza;
                                        zzdy12.zzF(8);
                                        bArr2 = bArr6;
                                        zzdy12.zzB(bArr2, 0, 16);
                                        if (Arrays.equals(bArr2, zzb)) {
                                            zzh(zzdy12, 16, zzaev6);
                                        }
                                    } else {
                                        bArr2 = bArr6;
                                    }
                                    i63++;
                                    bArr6 = bArr2;
                                }
                                bArr = bArr6;
                                bArr5 = bArr;
                                size3 = i2;
                                zzadu4 = zzadu;
                                i27 = 8;
                                i33 = i + 1;
                                sparseArray3 = sparseArray;
                            }
                        }
                        sparseArray = sparseArray3;
                        zzadu = zzadu4;
                        i2 = size3;
                        i = i33;
                        bArr = bArr5;
                        bArr5 = bArr;
                        size3 = i2;
                        zzadu4 = zzadu;
                        i27 = 8;
                        i33 = i + 1;
                        sparseArray3 = sparseArray;
                    }
                    zzv zzf3 = zzf(zzadu4.zzb);
                    zzaej = this;
                    if (zzf3 != null) {
                        int size6 = zzaej.zze.size();
                        for (int i64 = 0; i64 < size6; i64++) {
                            zzaei zzaei2 = (zzaei) zzaej.zze.valueAt(i64);
                            zzaet zzaet5 = zzaei2.zzd.zza;
                            zzaee zzaee5 = zzaei2.zzb.zza;
                            int i65 = zzeg.zza;
                            zzaeu zza4 = zzaet5.zza(zzaee5.zza);
                            if (zza4 != null) {
                                str = zza4.zzb;
                            } else {
                                str = null;
                            }
                            zzv zzb7 = zzf3.zzb(str);
                            zzab zzb8 = zzaei2.zzd.zza.zzf.zzb();
                            zzb8.zzB(zzb7);
                            zzaei2.zza.zzk(zzb8.zzY());
                        }
                    }
                    if (zzaej.zzv != -9223372036854775807L) {
                        int size7 = zzaej.zze.size();
                        for (int i66 = 0; i66 < size7; i66++) {
                            zzaei zzaei3 = (zzaei) zzaej.zze.valueAt(i66);
                            long j12 = zzaej.zzv;
                            int i67 = zzaei3.zzf;
                            while (true) {
                                zzaev zzaev7 = zzaei3.zzb;
                                if (i67 >= zzaev7.zze || zzaev7.zzi[i67] >= j12) {
                                } else {
                                    if (zzaev7.zzj[i67]) {
                                        zzaei3.zzi = i67;
                                    }
                                    i67++;
                                }
                            }
                        }
                        zzaej.zzv = -9223372036854775807L;
                    }
                } else {
                    zzaej = zzaej2;
                    zzadu zzadu7 = zzadu4;
                    if (!zzaej.zzm.isEmpty()) {
                        ((zzadu) zzaej.zzm.peek()).zzc(zzadu7);
                    }
                }
                zzaej2 = zzaej;
            }
        }
        zzaej zzaej3 = zzaej2;
        zzg();
    }

    private static final zzaee zzj(SparseArray sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return (zzaee) sparseArray.valueAt(0);
        }
        zzaee zzaee = (zzaee) sparseArray.get(i);
        zzaee.getClass();
        return zzaee;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v51, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: com.google.android.gms.internal.ads.zzaei} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zza(com.google.android.gms.internal.ads.zzyt r34, com.google.android.gms.internal.ads.zzzs r35) throws java.io.IOException {
        /*
            r33 = this;
            r0 = r33
            r1 = r34
        L_0x0004:
            int r2 = r0.zzo
            r3 = 1701671783(0x656d7367, float:7.0083103E22)
            r4 = 1936286840(0x73696478, float:1.8491255E31)
            r5 = 2
            r6 = 8
            r7 = 0
            r8 = 1
            r9 = 0
            if (r2 == 0) goto L_0x0517
            if (r2 == r8) goto L_0x02f3
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r11 = 3
            if (r2 == r5) goto L_0x0293
            com.google.android.gms.internal.ads.zzaei r2 = r0.zzy
            if (r2 != 0) goto L_0x0092
            android.util.SparseArray r2 = r0.zze
            int r12 = r2.size()
            r13 = r3
            r3 = r7
            r4 = 0
        L_0x002b:
            if (r4 >= r12) goto L_0x005f
            java.lang.Object r15 = r2.valueAt(r4)
            com.google.android.gms.internal.ads.zzaei r15 = (com.google.android.gms.internal.ads.zzaei) r15
            boolean r16 = r15.zzl
            if (r16 != 0) goto L_0x0041
            int r5 = r15.zzf
            com.google.android.gms.internal.ads.zzaew r10 = r15.zzd
            int r10 = r10.zzb
            if (r5 == r10) goto L_0x005b
        L_0x0041:
            boolean r5 = r15.zzl
            if (r5 == 0) goto L_0x0050
            int r5 = r15.zzh
            com.google.android.gms.internal.ads.zzaev r10 = r15.zzb
            int r10 = r10.zzd
            if (r5 != r10) goto L_0x0050
            goto L_0x005b
        L_0x0050:
            long r17 = r15.zzd()
            int r5 = (r17 > r13 ? 1 : (r17 == r13 ? 0 : -1))
            if (r5 >= 0) goto L_0x005b
            r3 = r15
            r13 = r17
        L_0x005b:
            int r4 = r4 + 1
            r5 = 2
            goto L_0x002b
        L_0x005f:
            if (r3 != 0) goto L_0x007c
            long r2 = r0.zzt
            long r4 = r34.zzf()
            long r2 = r2 - r4
            int r3 = (int) r2
            if (r3 < 0) goto L_0x0075
            r2 = r1
            com.google.android.gms.internal.ads.zzym r2 = (com.google.android.gms.internal.ads.zzym) r2
            r2.zzo(r3, r9)
            r33.zzg()
            goto L_0x0004
        L_0x0075:
            java.lang.String r1 = "Offset to end of mdat was negative."
            com.google.android.gms.internal.ads.zzbp r1 = com.google.android.gms.internal.ads.zzbp.zza(r1, r7)
            throw r1
        L_0x007c:
            long r4 = r3.zzd()
            long r12 = r34.zzf()
            long r4 = r4 - r12
            int r2 = (int) r4
            if (r2 >= 0) goto L_0x0089
            r2 = 0
        L_0x0089:
            r4 = r1
            com.google.android.gms.internal.ads.zzym r4 = (com.google.android.gms.internal.ads.zzym) r4
            r4.zzo(r2, r9)
            r0.zzy = r3
            r2 = r3
        L_0x0092:
            int r3 = r0.zzo
            r4 = 6
            if (r3 != r11) goto L_0x012b
            int r3 = r2.zzb()
            r0.zzz = r3
            int r5 = r2.zzf
            int r10 = r2.zzi
            if (r5 >= r10) goto L_0x00da
            com.google.android.gms.internal.ads.zzym r1 = (com.google.android.gms.internal.ads.zzym) r1
            r1.zzo(r3, r9)
            com.google.android.gms.internal.ads.zzaeu r1 = r2.zzf()
            if (r1 != 0) goto L_0x00af
            goto L_0x00cd
        L_0x00af:
            com.google.android.gms.internal.ads.zzaev r3 = r2.zzb
            com.google.android.gms.internal.ads.zzdy r3 = r3.zzn
            int r1 = r1.zzd
            if (r1 == 0) goto L_0x00ba
            r3.zzG(r1)
        L_0x00ba:
            com.google.android.gms.internal.ads.zzaev r1 = r2.zzb
            int r5 = r2.zzf
            boolean r1 = r1.zzb(r5)
            if (r1 == 0) goto L_0x00cd
            int r1 = r3.zzo()
            int r1 = r1 * 6
            r3.zzG(r1)
        L_0x00cd:
            boolean r1 = r2.zzk()
            if (r1 != 0) goto L_0x00d5
            r0.zzy = r7
        L_0x00d5:
            r0.zzo = r11
        L_0x00d7:
            r1 = 0
            goto L_0x0292
        L_0x00da:
            com.google.android.gms.internal.ads.zzaew r5 = r2.zzd
            com.google.android.gms.internal.ads.zzaet r5 = r5.zza
            int r5 = r5.zzg
            if (r5 != r8) goto L_0x00ec
            int r3 = r3 + -8
            r0.zzz = r3
            r3 = r1
            com.google.android.gms.internal.ads.zzym r3 = (com.google.android.gms.internal.ads.zzym) r3
            r3.zzo(r6, r9)
        L_0x00ec:
            com.google.android.gms.internal.ads.zzaew r3 = r2.zzd
            com.google.android.gms.internal.ads.zzaet r3 = r3.zza
            com.google.android.gms.internal.ads.zzad r3 = r3.zzf
            java.lang.String r3 = r3.zzm
            java.lang.String r5 = "audio/ac4"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x0119
            int r3 = r0.zzz
            r5 = 7
            int r3 = r2.zzc(r3, r5)
            r0.zzA = r3
            int r3 = r0.zzz
            com.google.android.gms.internal.ads.zzdy r6 = r0.zzj
            com.google.android.gms.internal.ads.zzya.zzb(r3, r6)
            com.google.android.gms.internal.ads.zzzz r3 = r2.zza
            com.google.android.gms.internal.ads.zzdy r6 = r0.zzj
            com.google.android.gms.internal.ads.zzzx.zzb(r3, r6, r5)
            int r3 = r0.zzA
            int r3 = r3 + r5
            r0.zzA = r3
            goto L_0x0121
        L_0x0119:
            int r3 = r0.zzz
            int r3 = r2.zzc(r3, r9)
            r0.zzA = r3
        L_0x0121:
            int r5 = r0.zzz
            int r5 = r5 + r3
            r0.zzz = r5
            r3 = 4
            r0.zzo = r3
            r0.zzB = r9
        L_0x012b:
            com.google.android.gms.internal.ads.zzaew r3 = r2.zzd
            com.google.android.gms.internal.ads.zzaet r3 = r3.zza
            com.google.android.gms.internal.ads.zzzz r5 = r2.zza
            long r12 = r2.zze()
            int r6 = r3.zzj
            if (r6 != 0) goto L_0x014a
        L_0x0139:
            int r3 = r0.zzA
            int r4 = r0.zzz
            if (r3 >= r4) goto L_0x022e
            int r4 = r4 - r3
            int r3 = com.google.android.gms.internal.ads.zzzx.zza(r5, r1, r4, r9)
            int r4 = r0.zzA
            int r4 = r4 + r3
            r0.zzA = r4
            goto L_0x0139
        L_0x014a:
            com.google.android.gms.internal.ads.zzdy r10 = r0.zzg
            byte[] r10 = r10.zzH()
            r10[r9] = r9
            r10[r8] = r9
            r14 = 2
            r10[r14] = r9
            int r14 = r6 + 1
            r15 = 4
            int r6 = 4 - r6
        L_0x015c:
            int r15 = r0.zzA
            int r11 = r0.zzz
            if (r15 >= r11) goto L_0x022e
            int r11 = r0.zzB
            java.lang.String r15 = "video/hevc"
            if (r11 != 0) goto L_0x01cf
            r11 = r1
            com.google.android.gms.internal.ads.zzym r11 = (com.google.android.gms.internal.ads.zzym) r11
            r11.zzn(r10, r6, r14, r9)
            com.google.android.gms.internal.ads.zzdy r11 = r0.zzg
            r11.zzF(r9)
            com.google.android.gms.internal.ads.zzdy r11 = r0.zzg
            int r11 = r11.zze()
            if (r11 <= 0) goto L_0x01c8
            int r11 = r11 + -1
            r0.zzB = r11
            com.google.android.gms.internal.ads.zzdy r11 = r0.zzf
            r11.zzF(r9)
            com.google.android.gms.internal.ads.zzdy r11 = r0.zzf
            r9 = 4
            com.google.android.gms.internal.ads.zzzx.zzb(r5, r11, r9)
            com.google.android.gms.internal.ads.zzdy r11 = r0.zzg
            com.google.android.gms.internal.ads.zzzx.zzb(r5, r11, r8)
            com.google.android.gms.internal.ads.zzzz[] r11 = r0.zzF
            int r11 = r11.length
            if (r11 <= 0) goto L_0x01b9
            com.google.android.gms.internal.ads.zzad r11 = r3.zzf
            java.lang.String r11 = r11.zzm
            byte r17 = r10[r9]
            byte[] r9 = com.google.android.gms.internal.ads.zzzp.zza
            java.lang.String r9 = "video/avc"
            boolean r9 = r9.equals(r11)
            if (r9 == 0) goto L_0x01ab
            r9 = r17 & 31
            if (r9 == r4) goto L_0x01a9
            goto L_0x01ab
        L_0x01a9:
            r9 = 1
            goto L_0x01ba
        L_0x01ab:
            boolean r9 = r15.equals(r11)
            if (r9 == 0) goto L_0x01b9
            r9 = r17 & 126(0x7e, float:1.77E-43)
            int r9 = r9 >> r8
            r11 = 39
            if (r9 != r11) goto L_0x01b9
            goto L_0x01a9
        L_0x01b9:
            r9 = 0
        L_0x01ba:
            r0.zzC = r9
            int r9 = r0.zzA
            int r9 = r9 + 5
            r0.zzA = r9
            int r9 = r0.zzz
            int r9 = r9 + r6
            r0.zzz = r9
            goto L_0x022a
        L_0x01c8:
            java.lang.String r1 = "Invalid NAL length"
            com.google.android.gms.internal.ads.zzbp r1 = com.google.android.gms.internal.ads.zzbp.zza(r1, r7)
            throw r1
        L_0x01cf:
            boolean r9 = r0.zzC
            if (r9 == 0) goto L_0x0218
            com.google.android.gms.internal.ads.zzdy r9 = r0.zzh
            r9.zzC(r11)
            com.google.android.gms.internal.ads.zzdy r9 = r0.zzh
            byte[] r9 = r9.zzH()
            int r11 = r0.zzB
            r4 = r1
            com.google.android.gms.internal.ads.zzym r4 = (com.google.android.gms.internal.ads.zzym) r4
            r8 = 0
            r4.zzn(r9, r8, r11, r8)
            com.google.android.gms.internal.ads.zzdy r4 = r0.zzh
            int r8 = r0.zzB
            com.google.android.gms.internal.ads.zzzx.zzb(r5, r4, r8)
            int r4 = r0.zzB
            com.google.android.gms.internal.ads.zzdy r8 = r0.zzh
            byte[] r9 = r8.zzH()
            int r8 = r8.zzd()
            int r8 = com.google.android.gms.internal.ads.zzzp.zzb(r9, r8)
            com.google.android.gms.internal.ads.zzdy r9 = r0.zzh
            com.google.android.gms.internal.ads.zzad r11 = r3.zzf
            java.lang.String r11 = r11.zzm
            boolean r11 = r15.equals(r11)
            r9.zzF(r11)
            com.google.android.gms.internal.ads.zzdy r9 = r0.zzh
            r9.zzE(r8)
            com.google.android.gms.internal.ads.zzdy r8 = r0.zzh
            com.google.android.gms.internal.ads.zzzz[] r9 = r0.zzF
            com.google.android.gms.internal.ads.zzyj.zza(r12, r8, r9)
            goto L_0x021e
        L_0x0218:
            r4 = 0
            int r8 = com.google.android.gms.internal.ads.zzzx.zza(r5, r1, r11, r4)
            r4 = r8
        L_0x021e:
            int r8 = r0.zzA
            int r8 = r8 + r4
            r0.zzA = r8
            int r8 = r0.zzB
            int r8 = r8 - r4
            r0.zzB = r8
            r4 = 6
            r8 = 1
        L_0x022a:
            r9 = 0
            r11 = 3
            goto L_0x015c
        L_0x022e:
            int r20 = r2.zza()
            com.google.android.gms.internal.ads.zzaeu r1 = r2.zzf()
            if (r1 == 0) goto L_0x023d
            com.google.android.gms.internal.ads.zzzy r1 = r1.zzc
            r23 = r1
            goto L_0x023f
        L_0x023d:
            r23 = r7
        L_0x023f:
            int r1 = r0.zzz
            r22 = 0
            r17 = r5
            r18 = r12
            r21 = r1
            r17.zzs(r18, r20, r21, r22, r23)
        L_0x024c:
            java.util.ArrayDeque r1 = r0.zzn
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0285
            java.util.ArrayDeque r1 = r0.zzn
            java.lang.Object r1 = r1.removeFirst()
            com.google.android.gms.internal.ads.zzaeh r1 = (com.google.android.gms.internal.ads.zzaeh) r1
            int r3 = r0.zzu
            int r4 = r1.zzc
            int r3 = r3 - r4
            r0.zzu = r3
            long r3 = r1.zza
            boolean r5 = r1.zzb
            if (r5 == 0) goto L_0x026a
            long r3 = r3 + r12
        L_0x026a:
            com.google.android.gms.internal.ads.zzzz[] r5 = r0.zzE
            int r6 = r5.length
            r8 = 0
        L_0x026e:
            if (r8 >= r6) goto L_0x024c
            r14 = r5[r8]
            r17 = 1
            int r9 = r1.zzc
            int r10 = r0.zzu
            r20 = 0
            r15 = r3
            r18 = r9
            r19 = r10
            r14.zzs(r15, r17, r18, r19, r20)
            int r8 = r8 + 1
            goto L_0x026e
        L_0x0285:
            boolean r1 = r2.zzk()
            if (r1 != 0) goto L_0x028d
            r0.zzy = r7
        L_0x028d:
            r1 = 3
            r0.zzo = r1
            goto L_0x00d7
        L_0x0292:
            return r1
        L_0x0293:
            android.util.SparseArray r2 = r0.zze
            int r2 = r2.size()
            r6 = r7
            r5 = 0
        L_0x029b:
            if (r5 >= r2) goto L_0x02be
            android.util.SparseArray r8 = r0.zze
            java.lang.Object r8 = r8.valueAt(r5)
            com.google.android.gms.internal.ads.zzaei r8 = (com.google.android.gms.internal.ads.zzaei) r8
            com.google.android.gms.internal.ads.zzaev r8 = r8.zzb
            boolean r9 = r8.zzo
            if (r9 == 0) goto L_0x02bb
            long r8 = r8.zzc
            int r10 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r10 >= 0) goto L_0x02bb
            android.util.SparseArray r3 = r0.zze
            java.lang.Object r3 = r3.valueAt(r5)
            r6 = r3
            com.google.android.gms.internal.ads.zzaei r6 = (com.google.android.gms.internal.ads.zzaei) r6
            r3 = r8
        L_0x02bb:
            int r5 = r5 + 1
            goto L_0x029b
        L_0x02be:
            if (r6 != 0) goto L_0x02c5
            r2 = 3
            r0.zzo = r2
            goto L_0x0004
        L_0x02c5:
            long r8 = r34.zzf()
            long r3 = r3 - r8
            int r2 = (int) r3
            if (r2 < 0) goto L_0x02ec
            r3 = r1
            com.google.android.gms.internal.ads.zzym r3 = (com.google.android.gms.internal.ads.zzym) r3
            r4 = 0
            r3.zzo(r2, r4)
            com.google.android.gms.internal.ads.zzaev r2 = r6.zzb
            com.google.android.gms.internal.ads.zzdy r5 = r2.zzn
            byte[] r6 = r5.zzH()
            int r5 = r5.zzd()
            r3.zzn(r6, r4, r5, r4)
            com.google.android.gms.internal.ads.zzdy r3 = r2.zzn
            r3.zzF(r4)
            r2.zzo = r4
            goto L_0x0004
        L_0x02ec:
            java.lang.String r1 = "Offset to encryption data was negative."
            com.google.android.gms.internal.ads.zzbp r1 = com.google.android.gms.internal.ads.zzbp.zza(r1, r7)
            throw r1
        L_0x02f3:
            long r8 = r0.zzq
            int r2 = (int) r8
            int r5 = r0.zzr
            int r2 = r2 - r5
            com.google.android.gms.internal.ads.zzdy r5 = r0.zzs
            if (r5 == 0) goto L_0x0507
            byte[] r8 = r5.zzH()
            r9 = r1
            com.google.android.gms.internal.ads.zzym r9 = (com.google.android.gms.internal.ads.zzym) r9
            r10 = 0
            r9.zzn(r8, r6, r2, r10)
            com.google.android.gms.internal.ads.zzadv r2 = new com.google.android.gms.internal.ads.zzadv
            int r8 = r0.zzp
            r2.<init>(r8, r5)
            long r8 = r34.zzf()
            java.util.ArrayDeque r5 = r0.zzm
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0328
            java.util.ArrayDeque r3 = r0.zzm
            java.lang.Object r3 = r3.peek()
            com.google.android.gms.internal.ads.zzadu r3 = (com.google.android.gms.internal.ads.zzadu) r3
            r3.zzd(r2)
            goto L_0x050e
        L_0x0328:
            int r5 = r2.zzd
            if (r5 != r4) goto L_0x03ef
            com.google.android.gms.internal.ads.zzdy r2 = r2.zza
            r2.zzF(r6)
            int r3 = r2.zze()
            r4 = 4
            r2.zzG(r4)
            long r4 = r2.zzs()
            int r3 = com.google.android.gms.internal.ads.zzadw.zze(r3)
            if (r3 != 0) goto L_0x034c
            long r10 = r2.zzs()
            long r12 = r2.zzs()
            goto L_0x0354
        L_0x034c:
            long r10 = r2.zzt()
            long r12 = r2.zzt()
        L_0x0354:
            long r12 = r12 + r8
            r8 = r10
            r19 = r12
            r12 = 1000000(0xf4240, double:4.940656E-318)
            r10 = r8
            r14 = r4
            long r21 = com.google.android.gms.internal.ads.zzeg.zzw(r10, r12, r14)
            r3 = 2
            r2.zzG(r3)
            int r3 = r2.zzo()
            int[] r6 = new int[r3]
            long[] r14 = new long[r3]
            long[] r15 = new long[r3]
            long[] r12 = new long[r3]
            r10 = r21
            r13 = 0
        L_0x0374:
            if (r13 >= r3) goto L_0x03c7
            int r17 = r2.zze()
            r23 = -2147483648(0xffffffff80000000, float:-0.0)
            r23 = r17 & r23
            if (r23 != 0) goto L_0x03bf
            long r23 = r2.zzs()
            r25 = 2147483647(0x7fffffff, float:NaN)
            r17 = r17 & r25
            r6[r13] = r17
            r14[r13] = r19
            r12[r13] = r10
            long r8 = r8 + r23
            r23 = 1000000(0xf4240, double:4.940656E-318)
            r10 = r8
            r7 = r12
            r25 = r13
            r12 = r23
            r35 = r3
            r23 = r8
            r3 = r14
            r8 = r15
            r14 = r4
            long r10 = com.google.android.gms.internal.ads.zzeg.zzw(r10, r12, r14)
            r12 = r7[r25]
            long r12 = r10 - r12
            r8[r25] = r12
            r9 = 4
            r2.zzG(r9)
            r12 = r6[r25]
            long r12 = (long) r12
            long r19 = r19 + r12
            int r13 = r25 + 1
            r14 = r3
            r12 = r7
            r15 = r8
            r8 = r23
            r7 = 0
            r3 = r35
            goto L_0x0374
        L_0x03bf:
            java.lang.String r1 = "Unhandled indirect reference"
            r2 = 0
            com.google.android.gms.internal.ads.zzbp r1 = com.google.android.gms.internal.ads.zzbp.zza(r1, r2)
            throw r1
        L_0x03c7:
            r7 = r12
            r3 = r14
            r8 = r15
            java.lang.Long r2 = java.lang.Long.valueOf(r21)
            com.google.android.gms.internal.ads.zzyk r4 = new com.google.android.gms.internal.ads.zzyk
            r4.<init>(r6, r3, r8, r7)
            android.util.Pair r2 = android.util.Pair.create(r2, r4)
            java.lang.Object r3 = r2.first
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            r0.zzx = r3
            com.google.android.gms.internal.ads.zzyv r3 = r0.zzD
            java.lang.Object r2 = r2.second
            com.google.android.gms.internal.ads.zzzv r2 = (com.google.android.gms.internal.ads.zzzv) r2
            r3.zzL(r2)
            r2 = 1
            r0.zzG = r2
            goto L_0x050e
        L_0x03ef:
            if (r5 != r3) goto L_0x050e
            com.google.android.gms.internal.ads.zzdy r2 = r2.zza
            com.google.android.gms.internal.ads.zzzz[] r3 = r0.zzE
            int r3 = r3.length
            if (r3 == 0) goto L_0x050e
            r2.zzF(r6)
            int r3 = r2.zze()
            int r3 = com.google.android.gms.internal.ads.zzadw.zze(r3)
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r3 == 0) goto L_0x0447
            r6 = 1
            if (r3 == r6) goto L_0x040f
            goto L_0x050e
        L_0x040f:
            long r13 = r2.zzs()
            long r7 = r2.zzt()
            r9 = 1000000(0xf4240, double:4.940656E-318)
            r11 = r13
            long r15 = com.google.android.gms.internal.ads.zzeg.zzw(r7, r9, r11)
            long r7 = r2.zzs()
            r9 = 1000(0x3e8, double:4.94E-321)
            long r6 = com.google.android.gms.internal.ads.zzeg.zzw(r7, r9, r11)
            long r8 = r2.zzs()
            r3 = 0
            java.lang.String r10 = r2.zzv(r3)
            r10.getClass()
            java.lang.String r11 = r2.zzv(r3)
            r11.getClass()
            r28 = r6
            r30 = r8
            r26 = r10
            r27 = r11
            r6 = r15
            r8 = r4
            goto L_0x048d
        L_0x0447:
            r3 = 0
            java.lang.String r10 = r2.zzv(r3)
            r10.getClass()
            java.lang.String r11 = r2.zzv(r3)
            r11.getClass()
            long r6 = r2.zzs()
            long r12 = r2.zzs()
            r14 = 1000000(0xf4240, double:4.940656E-318)
            r16 = r6
            long r8 = com.google.android.gms.internal.ads.zzeg.zzw(r12, r14, r16)
            long r12 = r0.zzx
            int r3 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x0471
            long r12 = r12 + r8
            r19 = r12
            goto L_0x0473
        L_0x0471:
            r19 = r4
        L_0x0473:
            long r12 = r2.zzs()
            r14 = 1000(0x3e8, double:4.94E-321)
            r16 = r6
            long r6 = com.google.android.gms.internal.ads.zzeg.zzw(r12, r14, r16)
            long r12 = r2.zzs()
            r28 = r6
            r26 = r10
            r27 = r11
            r30 = r12
            r6 = r19
        L_0x048d:
            int r3 = r2.zza()
            byte[] r3 = new byte[r3]
            int r10 = r2.zza()
            r11 = 0
            r2.zzB(r3, r11, r10)
            com.google.android.gms.internal.ads.zzabe r2 = new com.google.android.gms.internal.ads.zzabe
            r25 = r2
            r32 = r3
            r25.<init>(r26, r27, r28, r30, r32)
            com.google.android.gms.internal.ads.zzdy r3 = new com.google.android.gms.internal.ads.zzdy
            com.google.android.gms.internal.ads.zzabf r10 = r0.zzk
            byte[] r2 = r10.zza(r2)
            r3.<init>((byte[]) r2)
            int r2 = r3.zza()
            com.google.android.gms.internal.ads.zzzz[] r10 = r0.zzE
            int r11 = r10.length
            r12 = 0
        L_0x04b7:
            if (r12 >= r11) goto L_0x04c5
            r13 = r10[r12]
            r14 = 0
            r3.zzF(r14)
            r13.zzq(r3, r2)
            int r12 = r12 + 1
            goto L_0x04b7
        L_0x04c5:
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x04da
            java.util.ArrayDeque r3 = r0.zzn
            com.google.android.gms.internal.ads.zzaeh r4 = new com.google.android.gms.internal.ads.zzaeh
            r5 = 1
            r4.<init>(r8, r5, r2)
            r3.addLast(r4)
            int r3 = r0.zzu
            int r3 = r3 + r2
            r0.zzu = r3
            goto L_0x050e
        L_0x04da:
            java.util.ArrayDeque r3 = r0.zzn
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x04f3
            java.util.ArrayDeque r3 = r0.zzn
            com.google.android.gms.internal.ads.zzaeh r4 = new com.google.android.gms.internal.ads.zzaeh
            r5 = 0
            r4.<init>(r6, r5, r2)
            r3.addLast(r4)
            int r3 = r0.zzu
            int r3 = r3 + r2
            r0.zzu = r3
            goto L_0x050e
        L_0x04f3:
            com.google.android.gms.internal.ads.zzzz[] r3 = r0.zzE
            int r4 = r3.length
            r9 = 0
        L_0x04f7:
            if (r9 >= r4) goto L_0x050e
            r10 = r3[r9]
            r13 = 1
            r15 = 0
            r16 = 0
            r11 = r6
            r14 = r2
            r10.zzs(r11, r13, r14, r15, r16)
            int r9 = r9 + 1
            goto L_0x04f7
        L_0x0507:
            r3 = r1
            com.google.android.gms.internal.ads.zzym r3 = (com.google.android.gms.internal.ads.zzym) r3
            r5 = 0
            r3.zzo(r2, r5)
        L_0x050e:
            long r2 = r34.zzf()
            r0.zzi(r2)
            goto L_0x0004
        L_0x0517:
            r5 = 0
            int r2 = r0.zzr
            if (r2 != 0) goto L_0x0542
            com.google.android.gms.internal.ads.zzdy r2 = r0.zzl
            byte[] r2 = r2.zzH()
            r7 = 1
            boolean r2 = r1.zzn(r2, r5, r6, r7)
            if (r2 != 0) goto L_0x052b
            r1 = -1
            return r1
        L_0x052b:
            r0.zzr = r6
            com.google.android.gms.internal.ads.zzdy r2 = r0.zzl
            r2.zzF(r5)
            com.google.android.gms.internal.ads.zzdy r2 = r0.zzl
            long r7 = r2.zzs()
            r0.zzq = r7
            com.google.android.gms.internal.ads.zzdy r2 = r0.zzl
            int r2 = r2.zze()
            r0.zzp = r2
        L_0x0542:
            long r7 = r0.zzq
            r9 = 1
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 != 0) goto L_0x0565
            com.google.android.gms.internal.ads.zzdy r2 = r0.zzl
            byte[] r2 = r2.zzH()
            r5 = r1
            com.google.android.gms.internal.ads.zzym r5 = (com.google.android.gms.internal.ads.zzym) r5
            r7 = 0
            r5.zzn(r2, r6, r6, r7)
            int r2 = r0.zzr
            int r2 = r2 + r6
            r0.zzr = r2
            com.google.android.gms.internal.ads.zzdy r2 = r0.zzl
            long r7 = r2.zzt()
            r0.zzq = r7
            goto L_0x0598
        L_0x0565:
            r9 = 0
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 != 0) goto L_0x0598
            long r7 = r34.zzd()
            r9 = -1
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 != 0) goto L_0x0589
            java.util.ArrayDeque r2 = r0.zzm
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0588
            java.util.ArrayDeque r2 = r0.zzm
            java.lang.Object r2 = r2.peek()
            com.google.android.gms.internal.ads.zzadu r2 = (com.google.android.gms.internal.ads.zzadu) r2
            long r7 = r2.zza
            goto L_0x0589
        L_0x0588:
            r7 = r9
        L_0x0589:
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 == 0) goto L_0x0598
            long r9 = r34.zzf()
            long r7 = r7 - r9
            int r2 = r0.zzr
            long r9 = (long) r2
            long r7 = r7 + r9
            r0.zzq = r7
        L_0x0598:
            long r7 = r0.zzq
            int r2 = r0.zzr
            long r9 = (long) r2
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 < 0) goto L_0x0719
            long r7 = r34.zzf()
            long r7 = r7 - r9
            int r2 = r0.zzp
            r5 = 1835295092(0x6d646174, float:4.4175247E27)
            r9 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r2 == r9) goto L_0x05b2
            if (r2 != r5) goto L_0x05c5
        L_0x05b2:
            boolean r2 = r0.zzG
            if (r2 != 0) goto L_0x05c5
            com.google.android.gms.internal.ads.zzyv r2 = r0.zzD
            com.google.android.gms.internal.ads.zzzu r10 = new com.google.android.gms.internal.ads.zzzu
            long r11 = r0.zzw
            r10.<init>(r11, r7)
            r2.zzL(r10)
            r2 = 1
            r0.zzG = r2
        L_0x05c5:
            int r2 = r0.zzp
            if (r2 != r9) goto L_0x05e3
            android.util.SparseArray r2 = r0.zze
            int r2 = r2.size()
            r10 = 0
        L_0x05d0:
            if (r10 >= r2) goto L_0x05e3
            android.util.SparseArray r11 = r0.zze
            java.lang.Object r11 = r11.valueAt(r10)
            com.google.android.gms.internal.ads.zzaei r11 = (com.google.android.gms.internal.ads.zzaei) r11
            com.google.android.gms.internal.ads.zzaev r11 = r11.zzb
            r11.zzc = r7
            r11.zzb = r7
            int r10 = r10 + 1
            goto L_0x05d0
        L_0x05e3:
            int r2 = r0.zzp
            if (r2 != r5) goto L_0x05f4
            r5 = 0
            r0.zzy = r5
            long r2 = r0.zzq
            long r7 = r7 + r2
            r0.zzt = r7
            r2 = 2
            r0.zzo = r2
            goto L_0x0004
        L_0x05f4:
            r5 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r2 == r5) goto L_0x06f2
            r5 = 1953653099(0x7472616b, float:7.681346E31)
            if (r2 == r5) goto L_0x06f2
            r5 = 1835297121(0x6d646961, float:4.4181236E27)
            if (r2 == r5) goto L_0x06f2
            r5 = 1835626086(0x6d696e66, float:4.515217E27)
            if (r2 == r5) goto L_0x06f2
            r5 = 1937007212(0x7374626c, float:1.9362132E31)
            if (r2 == r5) goto L_0x06f2
            if (r2 == r9) goto L_0x06f2
            r5 = 1953653094(0x74726166, float:7.6813435E31)
            if (r2 == r5) goto L_0x06f2
            r5 = 1836475768(0x6d766578, float:4.7659988E27)
            if (r2 == r5) goto L_0x06f2
            r5 = 1701082227(0x65647473, float:6.742798E22)
            if (r2 != r5) goto L_0x0620
            goto L_0x06f2
        L_0x0620:
            r5 = 1751411826(0x68646c72, float:4.3148E24)
            r7 = 2147483647(0x7fffffff, double:1.060997895E-314)
            if (r2 == r5) goto L_0x06bf
            r5 = 1835296868(0x6d646864, float:4.418049E27)
            if (r2 == r5) goto L_0x06bf
            r5 = 1836476516(0x6d766864, float:4.7662196E27)
            if (r2 == r5) goto L_0x06bf
            if (r2 == r4) goto L_0x06bf
            r4 = 1937011556(0x73747364, float:1.9367383E31)
            if (r2 == r4) goto L_0x06bf
            r4 = 1937011827(0x73747473, float:1.9367711E31)
            if (r2 == r4) goto L_0x06bf
            r4 = 1668576371(0x63747473, float:4.5093966E21)
            if (r2 == r4) goto L_0x06bf
            r4 = 1937011555(0x73747363, float:1.9367382E31)
            if (r2 == r4) goto L_0x06bf
            r4 = 1937011578(0x7374737a, float:1.936741E31)
            if (r2 == r4) goto L_0x06bf
            r4 = 1937013298(0x73747a32, float:1.9369489E31)
            if (r2 == r4) goto L_0x06bf
            r4 = 1937007471(0x7374636f, float:1.9362445E31)
            if (r2 == r4) goto L_0x06bf
            r4 = 1668232756(0x636f3634, float:4.4126776E21)
            if (r2 == r4) goto L_0x06bf
            r4 = 1937011571(0x73747373, float:1.9367401E31)
            if (r2 == r4) goto L_0x06bf
            r4 = 1952867444(0x74666474, float:7.3014264E31)
            if (r2 == r4) goto L_0x06bf
            r4 = 1952868452(0x74666864, float:7.301914E31)
            if (r2 == r4) goto L_0x06bf
            r4 = 1953196132(0x746b6864, float:7.46037E31)
            if (r2 == r4) goto L_0x06bf
            r4 = 1953654136(0x74726578, float:7.6818474E31)
            if (r2 == r4) goto L_0x06bf
            r4 = 1953658222(0x7472756e, float:7.683823E31)
            if (r2 == r4) goto L_0x06bf
            r4 = 1886614376(0x70737368, float:3.013775E29)
            if (r2 == r4) goto L_0x06bf
            r4 = 1935763834(0x7361697a, float:1.785898E31)
            if (r2 == r4) goto L_0x06bf
            r4 = 1935763823(0x7361696f, float:1.7858967E31)
            if (r2 == r4) goto L_0x06bf
            r4 = 1936027235(0x73656e63, float:1.8177412E31)
            if (r2 == r4) goto L_0x06bf
            r4 = 1970628964(0x75756964, float:3.1109627E32)
            if (r2 == r4) goto L_0x06bf
            r4 = 1935828848(0x73626770, float:1.7937577E31)
            if (r2 == r4) goto L_0x06bf
            r4 = 1936158820(0x73677064, float:1.8336489E31)
            if (r2 == r4) goto L_0x06bf
            r4 = 1701606260(0x656c7374, float:6.9788014E22)
            if (r2 == r4) goto L_0x06bf
            r4 = 1835362404(0x6d656864, float:4.4373917E27)
            if (r2 == r4) goto L_0x06bf
            if (r2 != r3) goto L_0x06aa
            goto L_0x06bf
        L_0x06aa:
            long r2 = r0.zzq
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 > 0) goto L_0x06b8
            r2 = 0
            r0.zzs = r2
            r2 = 1
            r0.zzo = r2
            goto L_0x0004
        L_0x06b8:
            java.lang.String r1 = "Skipping atom with length > 2147483647 (unsupported)."
            com.google.android.gms.internal.ads.zzbp r1 = com.google.android.gms.internal.ads.zzbp.zzc(r1)
            throw r1
        L_0x06bf:
            int r2 = r0.zzr
            if (r2 != r6) goto L_0x06eb
            long r2 = r0.zzq
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 > 0) goto L_0x06e4
            com.google.android.gms.internal.ads.zzdy r4 = new com.google.android.gms.internal.ads.zzdy
            int r3 = (int) r2
            r4.<init>((int) r3)
            com.google.android.gms.internal.ads.zzdy r2 = r0.zzl
            byte[] r2 = r2.zzH()
            byte[] r3 = r4.zzH()
            r5 = 0
            java.lang.System.arraycopy(r2, r5, r3, r5, r6)
            r0.zzs = r4
            r2 = 1
            r0.zzo = r2
            goto L_0x0004
        L_0x06e4:
            java.lang.String r1 = "Leaf atom with length > 2147483647 (unsupported)."
            com.google.android.gms.internal.ads.zzbp r1 = com.google.android.gms.internal.ads.zzbp.zzc(r1)
            throw r1
        L_0x06eb:
            java.lang.String r1 = "Leaf atom defines extended atom size (unsupported)."
            com.google.android.gms.internal.ads.zzbp r1 = com.google.android.gms.internal.ads.zzbp.zzc(r1)
            throw r1
        L_0x06f2:
            long r3 = r34.zzf()
            long r5 = r0.zzq
            long r3 = r3 + r5
            r5 = -8
            long r3 = r3 + r5
            java.util.ArrayDeque r5 = r0.zzm
            com.google.android.gms.internal.ads.zzadu r6 = new com.google.android.gms.internal.ads.zzadu
            r6.<init>(r2, r3)
            r5.push(r6)
            long r5 = r0.zzq
            int r2 = r0.zzr
            long r7 = (long) r2
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x0714
            r0.zzi(r3)
            goto L_0x0004
        L_0x0714:
            r33.zzg()
            goto L_0x0004
        L_0x0719:
            java.lang.String r1 = "Atom size less than header length (unsupported)."
            com.google.android.gms.internal.ads.zzbp r1 = com.google.android.gms.internal.ads.zzbp.zzc(r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaej.zza(com.google.android.gms.internal.ads.zzyt, com.google.android.gms.internal.ads.zzzs):int");
    }

    public final void zzb(zzyv zzyv) {
        this.zzD = zzyv;
        zzg();
        zzzz[] zzzzArr = new zzzz[2];
        this.zzE = zzzzArr;
        int i = 0;
        zzzz[] zzzzArr2 = (zzzz[]) zzeg.zzad(zzzzArr, 0);
        this.zzE = zzzzArr2;
        for (zzzz zzk2 : zzzzArr2) {
            zzk2.zzk(zzc);
        }
        this.zzF = new zzzz[this.zzd.size()];
        int i2 = 100;
        while (i < this.zzF.length) {
            int i3 = i2 + 1;
            zzzz zzv2 = this.zzD.zzv(i2, 3);
            zzv2.zzk((zzad) this.zzd.get(i));
            this.zzF[i] = zzv2;
            i++;
            i2 = i3;
        }
    }

    public final void zzc(long j, long j2) {
        int size = this.zze.size();
        for (int i = 0; i < size; i++) {
            ((zzaei) this.zze.valueAt(i)).zzi();
        }
        this.zzn.clear();
        this.zzu = 0;
        this.zzv = j2;
        this.zzm.clear();
        zzg();
    }

    public final boolean zzd(zzyt zzyt) throws IOException {
        return zzaes.zza(zzyt);
    }

    public zzaej(int i, zzee zzee) {
        this.zzd = Collections.unmodifiableList(Collections.emptyList());
        this.zzk = new zzabf();
        this.zzl = new zzdy(16);
        this.zzf = new zzdy(zzzp.zza);
        this.zzg = new zzdy(5);
        this.zzh = new zzdy();
        byte[] bArr = new byte[16];
        this.zzi = bArr;
        this.zzj = new zzdy(bArr);
        this.zzm = new ArrayDeque();
        this.zzn = new ArrayDeque();
        this.zze = new SparseArray();
        this.zzw = -9223372036854775807L;
        this.zzv = -9223372036854775807L;
        this.zzx = -9223372036854775807L;
        this.zzD = zzyv.zza;
        this.zzE = new zzzz[0];
        this.zzF = new zzzz[0];
    }
}
