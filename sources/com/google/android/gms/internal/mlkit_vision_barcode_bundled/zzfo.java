package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.appboy.support.ValidationUtils;
import com.moovit.database.sqlite.SQLiteDatabase;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import p001a0.C0016g;
import p001a0.C0017h;
import sun.misc.Unsafe;

final class zzfo<T> implements zzgb<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzgz.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzfl zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzez zzm;
    private final zzgp zzn;
    private final zzdo zzo;
    private final zzfr zzp;
    private final zzfg zzq;

    private zzfo(int[] iArr, Object[] objArr, int i, int i2, zzfl zzfl, boolean z, boolean z2, int[] iArr2, int i3, int i4, zzfr zzfr, zzez zzez, zzgp zzgp, zzdo zzdo, zzfg zzfg, byte[] bArr) {
        zzfl zzfl2 = zzfl;
        zzdo zzdo2 = zzdo;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = z;
        boolean z3 = false;
        if (zzdo2 != null && zzdo2.zzf(zzfl)) {
            z3 = true;
        }
        this.zzh = z3;
        this.zzj = iArr2;
        this.zzk = i3;
        this.zzl = i4;
        this.zzp = zzfr;
        this.zzm = zzez;
        this.zzn = zzgp;
        this.zzo = zzdo2;
        this.zzg = zzfl2;
        this.zzq = zzfg;
    }

    private static int zzA(int i) {
        return (i >>> 20) & ValidationUtils.APPBOY_STRING_MAX_LENGTH;
    }

    private final int zzB(int i) {
        return this.zzc[i + 1];
    }

    private static long zzC(Object obj, long j) {
        return ((Long) zzgz.zzf(obj, j)).longValue();
    }

    private final zzeg zzD(int i) {
        int i2 = i / 3;
        return (zzeg) this.zzd[i2 + i2 + 1];
    }

    private final zzgb zzE(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzgb zzgb = (zzgb) this.zzd[i3];
        if (zzgb != null) {
            return zzgb;
        }
        zzgb zzb2 = zzfu.zza().zzb((Class) this.zzd[i3 + 1]);
        this.zzd[i3] = zzb2;
        return zzb2;
    }

    private final Object zzF(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private static Field zzG(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(C16530d.m42011d(String.valueOf(str).length(), 40, name.length(), String.valueOf(arrays).length()));
            C0017h.m61R(sb, "Field ", str, " for ", name);
            throw new RuntimeException(C0016g.m31o(sb, " not found. Known fields are ", arrays));
        }
    }

    private final void zzH(Object obj, Object obj2, int i) {
        long zzB = (long) (zzB(i) & 1048575);
        if (zzM(obj2, i)) {
            Object zzf2 = zzgz.zzf(obj, zzB);
            Object zzf3 = zzgz.zzf(obj2, zzB);
            if (zzf2 != null && zzf3 != null) {
                zzgz.zzs(obj, zzB, zzel.zzg(zzf2, zzf3));
                zzJ(obj, i);
            } else if (zzf3 != null) {
                zzgz.zzs(obj, zzB, zzf3);
                zzJ(obj, i);
            }
        }
    }

    private final void zzI(Object obj, Object obj2, int i) {
        Object obj3;
        int zzB = zzB(i);
        int i2 = this.zzc[i];
        long j = (long) (zzB & 1048575);
        if (zzP(obj2, i2, i)) {
            if (zzP(obj, i2, i)) {
                obj3 = zzgz.zzf(obj, j);
            } else {
                obj3 = null;
            }
            Object zzf2 = zzgz.zzf(obj2, j);
            if (obj3 != null && zzf2 != null) {
                zzgz.zzs(obj, j, zzel.zzg(obj3, zzf2));
                zzK(obj, i2, i);
            } else if (zzf2 != null) {
                zzgz.zzs(obj, j, zzf2);
                zzK(obj, i2, i);
            }
        }
    }

    private final void zzJ(Object obj, int i) {
        int zzy = zzy(i);
        long j = (long) (1048575 & zzy);
        if (j != 1048575) {
            zzgz.zzq(obj, j, (1 << (zzy >>> 20)) | zzgz.zzc(obj, j));
        }
    }

    private final void zzK(Object obj, int i, int i2) {
        zzgz.zzq(obj, (long) (zzy(i2) & 1048575), i);
    }

    private final boolean zzL(Object obj, Object obj2, int i) {
        return zzM(obj, i) == zzM(obj2, i);
    }

    private final boolean zzM(Object obj, int i) {
        int zzy = zzy(i);
        long j = (long) (zzy & 1048575);
        if (j == 1048575) {
            int zzB = zzB(i);
            long j2 = (long) (zzB & 1048575);
            switch (zzA(zzB)) {
                case 0:
                    if (Double.doubleToRawLongBits(zzgz.zza(obj, j2)) != 0) {
                        return true;
                    }
                    return false;
                case 1:
                    if (Float.floatToRawIntBits(zzgz.zzb(obj, j2)) != 0) {
                        return true;
                    }
                    return false;
                case 2:
                    if (zzgz.zzd(obj, j2) != 0) {
                        return true;
                    }
                    return false;
                case 3:
                    if (zzgz.zzd(obj, j2) != 0) {
                        return true;
                    }
                    return false;
                case 4:
                    if (zzgz.zzc(obj, j2) != 0) {
                        return true;
                    }
                    return false;
                case 5:
                    if (zzgz.zzd(obj, j2) != 0) {
                        return true;
                    }
                    return false;
                case 6:
                    if (zzgz.zzc(obj, j2) != 0) {
                        return true;
                    }
                    return false;
                case 7:
                    return zzgz.zzw(obj, j2);
                case 8:
                    Object zzf2 = zzgz.zzf(obj, j2);
                    if (zzf2 instanceof String) {
                        if (!((String) zzf2).isEmpty()) {
                            return true;
                        }
                        return false;
                    } else if (!(zzf2 instanceof zzdb)) {
                        throw new IllegalArgumentException();
                    } else if (!zzdb.zzb.equals(zzf2)) {
                        return true;
                    } else {
                        return false;
                    }
                case 9:
                    if (zzgz.zzf(obj, j2) != null) {
                        return true;
                    }
                    return false;
                case 10:
                    if (!zzdb.zzb.equals(zzgz.zzf(obj, j2))) {
                        return true;
                    }
                    return false;
                case 11:
                    if (zzgz.zzc(obj, j2) != 0) {
                        return true;
                    }
                    return false;
                case 12:
                    if (zzgz.zzc(obj, j2) != 0) {
                        return true;
                    }
                    return false;
                case 13:
                    if (zzgz.zzc(obj, j2) != 0) {
                        return true;
                    }
                    return false;
                case 14:
                    if (zzgz.zzd(obj, j2) != 0) {
                        return true;
                    }
                    return false;
                case 15:
                    if (zzgz.zzc(obj, j2) != 0) {
                        return true;
                    }
                    return false;
                case 16:
                    if (zzgz.zzd(obj, j2) != 0) {
                        return true;
                    }
                    return false;
                case 17:
                    if (zzgz.zzf(obj, j2) != null) {
                        return true;
                    }
                    return false;
                default:
                    throw new IllegalArgumentException();
            }
        } else if ((zzgz.zzc(obj, j) & (1 << (zzy >>> 20))) != 0) {
            return true;
        } else {
            return false;
        }
    }

    private final boolean zzN(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzM(obj, i) : (i3 & i4) != 0;
    }

    private static boolean zzO(Object obj, int i, zzgb zzgb) {
        return zzgb.zzj(zzgz.zzf(obj, (long) (i & 1048575)));
    }

    private final boolean zzP(Object obj, int i, int i2) {
        if (zzgz.zzc(obj, (long) (zzy(i2) & 1048575)) == i) {
            return true;
        }
        return false;
    }

    private static boolean zzQ(Object obj, long j) {
        return ((Boolean) zzgz.zzf(obj, j)).booleanValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.util.Map$Entry} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x048f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzR(java.lang.Object r17, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdj r18) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            boolean r3 = r0.zzh
            if (r3 == 0) goto L_0x0023
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdo r3 = r0.zzo
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzds r3 = r3.zzb(r1)
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgl r5 = r3.zza
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0023
            java.util.Iterator r3 = r3.zzf()
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0025
        L_0x0023:
            r3 = 0
            r5 = 0
        L_0x0025:
            int[] r6 = r0.zzc
            int r6 = r6.length
            sun.misc.Unsafe r7 = zzb
            r10 = 0
            r11 = 1048575(0xfffff, float:1.469367E-39)
            r12 = 0
        L_0x002f:
            if (r10 >= r6) goto L_0x048d
            int r13 = r0.zzB(r10)
            int[] r14 = r0.zzc
            r15 = r14[r10]
            int r4 = zzA(r13)
            r9 = 17
            if (r4 > r9) goto L_0x0058
            int r9 = r10 + 2
            r9 = r14[r9]
            r14 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r9 & r14
            if (r8 == r11) goto L_0x0052
            long r11 = (long) r8
            int r12 = r7.getInt(r1, r11)
            r11 = r8
        L_0x0052:
            int r8 = r9 >>> 20
            r9 = 1
            int r8 = r9 << r8
            goto L_0x0059
        L_0x0058:
            r8 = 0
        L_0x0059:
            if (r5 == 0) goto L_0x0077
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdo r9 = r0.zzo
            int r9 = r9.zza(r5)
            if (r9 > r15) goto L_0x0077
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdo r9 = r0.zzo
            r9.zzg(r2, r5)
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0075
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0059
        L_0x0075:
            r5 = 0
            goto L_0x0059
        L_0x0077:
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r13 = r13 & r9
            long r13 = (long) r13
            switch(r4) {
                case 0: goto L_0x047e;
                case 1: goto L_0x0472;
                case 2: goto L_0x0466;
                case 3: goto L_0x045a;
                case 4: goto L_0x044e;
                case 5: goto L_0x0442;
                case 6: goto L_0x0436;
                case 7: goto L_0x042a;
                case 8: goto L_0x041e;
                case 9: goto L_0x040d;
                case 10: goto L_0x03fe;
                case 11: goto L_0x03f1;
                case 12: goto L_0x03e4;
                case 13: goto L_0x03d7;
                case 14: goto L_0x03ca;
                case 15: goto L_0x03bd;
                case 16: goto L_0x03b0;
                case 17: goto L_0x039f;
                case 18: goto L_0x038f;
                case 19: goto L_0x037f;
                case 20: goto L_0x036f;
                case 21: goto L_0x035f;
                case 22: goto L_0x034f;
                case 23: goto L_0x033f;
                case 24: goto L_0x032f;
                case 25: goto L_0x031f;
                case 26: goto L_0x0310;
                case 27: goto L_0x02fd;
                case 28: goto L_0x02ee;
                case 29: goto L_0x02de;
                case 30: goto L_0x02ce;
                case 31: goto L_0x02be;
                case 32: goto L_0x02ae;
                case 33: goto L_0x029e;
                case 34: goto L_0x028e;
                case 35: goto L_0x027e;
                case 36: goto L_0x026e;
                case 37: goto L_0x025e;
                case 38: goto L_0x024e;
                case 39: goto L_0x023e;
                case 40: goto L_0x022e;
                case 41: goto L_0x021e;
                case 42: goto L_0x020e;
                case 43: goto L_0x01fe;
                case 44: goto L_0x01ee;
                case 45: goto L_0x01de;
                case 46: goto L_0x01ce;
                case 47: goto L_0x01be;
                case 48: goto L_0x01ae;
                case 49: goto L_0x019b;
                case 50: goto L_0x0192;
                case 51: goto L_0x0183;
                case 52: goto L_0x0174;
                case 53: goto L_0x0165;
                case 54: goto L_0x0156;
                case 55: goto L_0x0147;
                case 56: goto L_0x0138;
                case 57: goto L_0x0129;
                case 58: goto L_0x011a;
                case 59: goto L_0x010b;
                case 60: goto L_0x00f8;
                case 61: goto L_0x00e8;
                case 62: goto L_0x00da;
                case 63: goto L_0x00cc;
                case 64: goto L_0x00be;
                case 65: goto L_0x00b0;
                case 66: goto L_0x00a2;
                case 67: goto L_0x0094;
                case 68: goto L_0x0082;
                default: goto L_0x007f;
            }
        L_0x007f:
            r4 = 0
            goto L_0x0489
        L_0x0082:
            boolean r4 = r0.zzP(r1, r15, r10)
            if (r4 == 0) goto L_0x007f
            java.lang.Object r4 = r7.getObject(r1, r13)
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgb r8 = r0.zzE(r10)
            r2.zzq(r15, r4, r8)
            goto L_0x007f
        L_0x0094:
            boolean r4 = r0.zzP(r1, r15, r10)
            if (r4 == 0) goto L_0x007f
            long r13 = zzC(r1, r13)
            r2.zzD(r15, r13)
            goto L_0x007f
        L_0x00a2:
            boolean r4 = r0.zzP(r1, r15, r10)
            if (r4 == 0) goto L_0x007f
            int r4 = zzr(r1, r13)
            r2.zzB(r15, r4)
            goto L_0x007f
        L_0x00b0:
            boolean r4 = r0.zzP(r1, r15, r10)
            if (r4 == 0) goto L_0x007f
            long r13 = zzC(r1, r13)
            r2.zzz(r15, r13)
            goto L_0x007f
        L_0x00be:
            boolean r4 = r0.zzP(r1, r15, r10)
            if (r4 == 0) goto L_0x007f
            int r4 = zzr(r1, r13)
            r2.zzx(r15, r4)
            goto L_0x007f
        L_0x00cc:
            boolean r4 = r0.zzP(r1, r15, r10)
            if (r4 == 0) goto L_0x007f
            int r4 = zzr(r1, r13)
            r2.zzi(r15, r4)
            goto L_0x007f
        L_0x00da:
            boolean r4 = r0.zzP(r1, r15, r10)
            if (r4 == 0) goto L_0x007f
            int r4 = zzr(r1, r13)
            r2.zzI(r15, r4)
            goto L_0x007f
        L_0x00e8:
            boolean r4 = r0.zzP(r1, r15, r10)
            if (r4 == 0) goto L_0x007f
            java.lang.Object r4 = r7.getObject(r1, r13)
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb r4 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb) r4
            r2.zzd(r15, r4)
            goto L_0x007f
        L_0x00f8:
            boolean r4 = r0.zzP(r1, r15, r10)
            if (r4 == 0) goto L_0x007f
            java.lang.Object r4 = r7.getObject(r1, r13)
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgb r8 = r0.zzE(r10)
            r2.zzv(r15, r4, r8)
            goto L_0x007f
        L_0x010b:
            boolean r4 = r0.zzP(r1, r15, r10)
            if (r4 == 0) goto L_0x007f
            java.lang.Object r4 = r7.getObject(r1, r13)
            zzT(r15, r4, r2)
            goto L_0x007f
        L_0x011a:
            boolean r4 = r0.zzP(r1, r15, r10)
            if (r4 == 0) goto L_0x007f
            boolean r4 = zzQ(r1, r13)
            r2.zzb(r15, r4)
            goto L_0x007f
        L_0x0129:
            boolean r4 = r0.zzP(r1, r15, r10)
            if (r4 == 0) goto L_0x007f
            int r4 = zzr(r1, r13)
            r2.zzk(r15, r4)
            goto L_0x007f
        L_0x0138:
            boolean r4 = r0.zzP(r1, r15, r10)
            if (r4 == 0) goto L_0x007f
            long r13 = zzC(r1, r13)
            r2.zzm(r15, r13)
            goto L_0x007f
        L_0x0147:
            boolean r4 = r0.zzP(r1, r15, r10)
            if (r4 == 0) goto L_0x007f
            int r4 = zzr(r1, r13)
            r2.zzr(r15, r4)
            goto L_0x007f
        L_0x0156:
            boolean r4 = r0.zzP(r1, r15, r10)
            if (r4 == 0) goto L_0x007f
            long r13 = zzC(r1, r13)
            r2.zzK(r15, r13)
            goto L_0x007f
        L_0x0165:
            boolean r4 = r0.zzP(r1, r15, r10)
            if (r4 == 0) goto L_0x007f
            long r13 = zzC(r1, r13)
            r2.zzt(r15, r13)
            goto L_0x007f
        L_0x0174:
            boolean r4 = r0.zzP(r1, r15, r10)
            if (r4 == 0) goto L_0x007f
            float r4 = zzo(r1, r13)
            r2.zzo(r15, r4)
            goto L_0x007f
        L_0x0183:
            boolean r4 = r0.zzP(r1, r15, r10)
            if (r4 == 0) goto L_0x007f
            double r13 = zzn(r1, r13)
            r2.zzf(r15, r13)
            goto L_0x007f
        L_0x0192:
            java.lang.Object r4 = r7.getObject(r1, r13)
            r0.zzS(r2, r15, r4, r10)
            goto L_0x007f
        L_0x019b:
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgb r13 = r0.zzE(r10)
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzQ(r4, r8, r2, r13)
            goto L_0x007f
        L_0x01ae:
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            r15 = 1
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzX(r4, r8, r2, r15)
            goto L_0x007f
        L_0x01be:
            r15 = 1
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzW(r4, r8, r2, r15)
            goto L_0x007f
        L_0x01ce:
            r15 = 1
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzV(r4, r8, r2, r15)
            goto L_0x007f
        L_0x01de:
            r15 = 1
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzU(r4, r8, r2, r15)
            goto L_0x007f
        L_0x01ee:
            r15 = 1
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzM(r4, r8, r2, r15)
            goto L_0x007f
        L_0x01fe:
            r15 = 1
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzZ(r4, r8, r2, r15)
            goto L_0x007f
        L_0x020e:
            r15 = 1
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzJ(r4, r8, r2, r15)
            goto L_0x007f
        L_0x021e:
            r15 = 1
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzN(r4, r8, r2, r15)
            goto L_0x007f
        L_0x022e:
            r15 = 1
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzO(r4, r8, r2, r15)
            goto L_0x007f
        L_0x023e:
            r15 = 1
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzR(r4, r8, r2, r15)
            goto L_0x007f
        L_0x024e:
            r15 = 1
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzaa(r4, r8, r2, r15)
            goto L_0x007f
        L_0x025e:
            r15 = 1
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzS(r4, r8, r2, r15)
            goto L_0x007f
        L_0x026e:
            r15 = 1
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzP(r4, r8, r2, r15)
            goto L_0x007f
        L_0x027e:
            r15 = 1
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzL(r4, r8, r2, r15)
            goto L_0x007f
        L_0x028e:
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            r15 = 0
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzX(r4, r8, r2, r15)
            goto L_0x007f
        L_0x029e:
            r15 = 0
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzW(r4, r8, r2, r15)
            goto L_0x007f
        L_0x02ae:
            r15 = 0
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzV(r4, r8, r2, r15)
            goto L_0x007f
        L_0x02be:
            r15 = 0
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzU(r4, r8, r2, r15)
            goto L_0x007f
        L_0x02ce:
            r15 = 0
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzM(r4, r8, r2, r15)
            goto L_0x007f
        L_0x02de:
            r15 = 0
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzZ(r4, r8, r2, r15)
            goto L_0x007f
        L_0x02ee:
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzK(r4, r8, r2)
            goto L_0x007f
        L_0x02fd:
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgb r13 = r0.zzE(r10)
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzT(r4, r8, r2, r13)
            goto L_0x007f
        L_0x0310:
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzY(r4, r8, r2)
            goto L_0x007f
        L_0x031f:
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            r15 = 0
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzJ(r4, r8, r2, r15)
            goto L_0x007f
        L_0x032f:
            r15 = 0
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzN(r4, r8, r2, r15)
            goto L_0x007f
        L_0x033f:
            r15 = 0
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzO(r4, r8, r2, r15)
            goto L_0x007f
        L_0x034f:
            r15 = 0
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzR(r4, r8, r2, r15)
            goto L_0x007f
        L_0x035f:
            r15 = 0
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzaa(r4, r8, r2, r15)
            goto L_0x007f
        L_0x036f:
            r15 = 0
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzS(r4, r8, r2, r15)
            goto L_0x007f
        L_0x037f:
            r15 = 0
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzP(r4, r8, r2, r15)
            goto L_0x007f
        L_0x038f:
            r15 = 0
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzL(r4, r8, r2, r15)
            goto L_0x007f
        L_0x039f:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0489
            java.lang.Object r8 = r7.getObject(r1, r13)
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgb r13 = r0.zzE(r10)
            r2.zzq(r15, r8, r13)
            goto L_0x0489
        L_0x03b0:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0489
            long r13 = r7.getLong(r1, r13)
            r2.zzD(r15, r13)
            goto L_0x0489
        L_0x03bd:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0489
            int r8 = r7.getInt(r1, r13)
            r2.zzB(r15, r8)
            goto L_0x0489
        L_0x03ca:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0489
            long r13 = r7.getLong(r1, r13)
            r2.zzz(r15, r13)
            goto L_0x0489
        L_0x03d7:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0489
            int r8 = r7.getInt(r1, r13)
            r2.zzx(r15, r8)
            goto L_0x0489
        L_0x03e4:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0489
            int r8 = r7.getInt(r1, r13)
            r2.zzi(r15, r8)
            goto L_0x0489
        L_0x03f1:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0489
            int r8 = r7.getInt(r1, r13)
            r2.zzI(r15, r8)
            goto L_0x0489
        L_0x03fe:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0489
            java.lang.Object r8 = r7.getObject(r1, r13)
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb r8 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb) r8
            r2.zzd(r15, r8)
            goto L_0x0489
        L_0x040d:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0489
            java.lang.Object r8 = r7.getObject(r1, r13)
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgb r13 = r0.zzE(r10)
            r2.zzv(r15, r8, r13)
            goto L_0x0489
        L_0x041e:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0489
            java.lang.Object r8 = r7.getObject(r1, r13)
            zzT(r15, r8, r2)
            goto L_0x0489
        L_0x042a:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0489
            boolean r8 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzw(r1, r13)
            r2.zzb(r15, r8)
            goto L_0x0489
        L_0x0436:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0489
            int r8 = r7.getInt(r1, r13)
            r2.zzk(r15, r8)
            goto L_0x0489
        L_0x0442:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0489
            long r13 = r7.getLong(r1, r13)
            r2.zzm(r15, r13)
            goto L_0x0489
        L_0x044e:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0489
            int r8 = r7.getInt(r1, r13)
            r2.zzr(r15, r8)
            goto L_0x0489
        L_0x045a:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0489
            long r13 = r7.getLong(r1, r13)
            r2.zzK(r15, r13)
            goto L_0x0489
        L_0x0466:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0489
            long r13 = r7.getLong(r1, r13)
            r2.zzt(r15, r13)
            goto L_0x0489
        L_0x0472:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0489
            float r8 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzb(r1, r13)
            r2.zzo(r15, r8)
            goto L_0x0489
        L_0x047e:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0489
            double r13 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zza(r1, r13)
            r2.zzf(r15, r13)
        L_0x0489:
            int r10 = r10 + 3
            goto L_0x002f
        L_0x048d:
            if (r5 == 0) goto L_0x04a4
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdo r4 = r0.zzo
            r4.zzg(r2, r5)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x04a2
            java.lang.Object r4 = r3.next()
            r5 = r4
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x048d
        L_0x04a2:
            r5 = 0
            goto L_0x048d
        L_0x04a4:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgp r3 = r0.zzn
            java.lang.Object r1 = r3.zzc(r1)
            r3.zzj(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfo.zzR(java.lang.Object, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdj):void");
    }

    private final void zzS(zzdj zzdj, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            zzfe zzfe = (zzfe) zzF(i2);
            throw null;
        }
    }

    private static final void zzT(int i, Object obj, zzdj zzdj) throws IOException {
        if (obj instanceof String) {
            zzdj.zzG(i, (String) obj);
        } else {
            zzdj.zzd(i, (zzdb) obj);
        }
    }

    public static zzgq zzd(Object obj) {
        zzec zzec = (zzec) obj;
        zzgq zzgq = zzec.zzc;
        if (zzgq != zzgq.zzc()) {
            return zzgq;
        }
        zzgq zze2 = zzgq.zze();
        zzec.zzc = zze2;
        return zze2;
    }

    public static zzfo zzk(Class cls, zzfi zzfi, zzfr zzfr, zzez zzez, zzgp zzgp, zzdo zzdo, zzfg zzfg) {
        if (zzfi instanceof zzfw) {
            return zzl((zzfw) zzfi, zzfr, zzez, zzgp, zzdo, zzfg);
        }
        zzgm zzgm = (zzgm) zzfi;
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:120:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0260  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x032f  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0378  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfo zzl(com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfw r33, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfr r34, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzez r35, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgp r36, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdo r37, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfg r38) {
        /*
            int r0 = r33.zzc()
            r1 = 0
            r3 = 2
            if (r0 != r3) goto L_0x000a
            r10 = 1
            goto L_0x000b
        L_0x000a:
            r10 = 0
        L_0x000b:
            java.lang.String r0 = r33.zzd()
            int r3 = r0.length()
            char r4 = r0.charAt(r1)
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r5) goto L_0x0027
            r4 = 1
        L_0x001d:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0028
            r4 = r6
            goto L_0x001d
        L_0x0027:
            r6 = 1
        L_0x0028:
            int r4 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0047
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0034:
            int r9 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0044
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r8
            r6 = r6 | r4
            int r8 = r8 + 13
            r4 = r9
            goto L_0x0034
        L_0x0044:
            int r4 = r4 << r8
            r6 = r6 | r4
            r4 = r9
        L_0x0047:
            if (r6 != 0) goto L_0x0056
            int[] r6 = zza
            r13 = r6
            r6 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r16 = 0
            goto L_0x0165
        L_0x0056:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0075
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0062:
            int r9 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0072
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            int r6 = r6 << r8
            r4 = r4 | r6
            int r8 = r8 + 13
            r6 = r9
            goto L_0x0062
        L_0x0072:
            int r6 = r6 << r8
            r4 = r4 | r6
            r6 = r9
        L_0x0075:
            int r8 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0094
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0081:
            int r11 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x0091
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r9
            r6 = r6 | r8
            int r9 = r9 + 13
            r8 = r11
            goto L_0x0081
        L_0x0091:
            int r8 = r8 << r9
            r6 = r6 | r8
            r8 = r11
        L_0x0094:
            int r9 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x00b3
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        L_0x00a0:
            int r12 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00b0
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r11
            r8 = r8 | r9
            int r11 = r11 + 13
            r9 = r12
            goto L_0x00a0
        L_0x00b0:
            int r9 = r9 << r11
            r8 = r8 | r9
            r9 = r12
        L_0x00b3:
            int r11 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00d2
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00bf:
            int r13 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00cf
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r9 = r9 | r11
            int r12 = r12 + 13
            r11 = r13
            goto L_0x00bf
        L_0x00cf:
            int r11 = r11 << r12
            r9 = r9 | r11
            r11 = r13
        L_0x00d2:
            int r12 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00f1
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00de:
            int r14 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x00ee
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00de
        L_0x00ee:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r14
        L_0x00f1:
            int r13 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x0110
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00fd:
            int r15 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x010d
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00fd
        L_0x010d:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x0110:
            int r14 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x0131
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x011c:
            int r16 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x012d
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x011c
        L_0x012d:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x0131:
            int r15 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x0154
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x013d:
            int r17 = r15 + 1
            char r15 = r0.charAt(r15)
            if (r15 < r5) goto L_0x014f
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x013d
        L_0x014f:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x0154:
            int r16 = r14 + r12
            int r13 = r16 + r13
            int[] r13 = new int[r13]
            int r16 = r4 + r4
            int r16 = r16 + r6
            r6 = r4
            r4 = r15
            r32 = r12
            r12 = r9
            r9 = r32
        L_0x0165:
            sun.misc.Unsafe r15 = zzb
            java.lang.Object[] r17 = r33.zze()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfl r18 = r33.zza()
            java.lang.Class r1 = r18.getClass()
            int r7 = r11 * 3
            int[] r7 = new int[r7]
            int r11 = r11 + r11
            java.lang.Object[] r11 = new java.lang.Object[r11]
            int r21 = r14 + r9
            r22 = r14
            r23 = r21
            r9 = 0
            r20 = 0
        L_0x0183:
            if (r4 >= r3) goto L_0x03ca
            int r24 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x01ab
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r2 = r24
            r24 = 13
        L_0x0193:
            int r26 = r2 + 1
            char r2 = r0.charAt(r2)
            if (r2 < r5) goto L_0x01a5
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            int r2 = r2 << r24
            r4 = r4 | r2
            int r24 = r24 + 13
            r2 = r26
            goto L_0x0193
        L_0x01a5:
            int r2 = r2 << r24
            r4 = r4 | r2
            r2 = r26
            goto L_0x01ad
        L_0x01ab:
            r2 = r24
        L_0x01ad:
            int r24 = r2 + 1
            char r2 = r0.charAt(r2)
            if (r2 < r5) goto L_0x01da
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            r5 = r24
            r24 = 13
        L_0x01bb:
            int r27 = r5 + 1
            char r5 = r0.charAt(r5)
            r28 = r3
            r3 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r3) goto L_0x01d4
            r3 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r24
            r2 = r2 | r3
            int r24 = r24 + 13
            r5 = r27
            r3 = r28
            goto L_0x01bb
        L_0x01d4:
            int r3 = r5 << r24
            r2 = r2 | r3
            r3 = r27
            goto L_0x01de
        L_0x01da:
            r28 = r3
            r3 = r24
        L_0x01de:
            r5 = r2 & 255(0xff, float:3.57E-43)
            r24 = r14
            r14 = r2 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L_0x01ec
            int r14 = r20 + 1
            r13[r20] = r9
            r20 = r14
        L_0x01ec:
            r14 = 51
            if (r5 < r14) goto L_0x0295
            int r14 = r3 + 1
            char r3 = r0.charAt(r3)
            r27 = r14
            r14 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r14) goto L_0x0222
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r14 = r27
            r27 = 13
        L_0x0203:
            int r30 = r14 + 1
            char r14 = r0.charAt(r14)
            r31 = r12
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r14 < r12) goto L_0x021c
            r12 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r27
            r3 = r3 | r12
            int r27 = r27 + 13
            r14 = r30
            r12 = r31
            goto L_0x0203
        L_0x021c:
            int r12 = r14 << r27
            r3 = r3 | r12
            r14 = r30
            goto L_0x0226
        L_0x0222:
            r31 = r12
            r14 = r27
        L_0x0226:
            int r12 = r5 + -51
            r27 = r14
            r14 = 9
            if (r12 == r14) goto L_0x0247
            r14 = 17
            if (r12 != r14) goto L_0x0233
            goto L_0x0247
        L_0x0233:
            r14 = 12
            if (r12 != r14) goto L_0x0256
            if (r10 != 0) goto L_0x0256
            int r12 = r9 / 3
            int r14 = r16 + 1
            int r12 = r12 + r12
            r25 = 1
            int r12 = r12 + 1
            r16 = r17[r16]
            r11[r12] = r16
            goto L_0x0254
        L_0x0247:
            int r12 = r9 / 3
            int r14 = r16 + 1
            int r12 = r12 + r12
            r25 = 1
            int r12 = r12 + 1
            r16 = r17[r16]
            r11[r12] = r16
        L_0x0254:
            r16 = r14
        L_0x0256:
            int r3 = r3 + r3
            r12 = r17[r3]
            boolean r14 = r12 instanceof java.lang.reflect.Field
            if (r14 == 0) goto L_0x0260
            java.lang.reflect.Field r12 = (java.lang.reflect.Field) r12
            goto L_0x0268
        L_0x0260:
            java.lang.String r12 = (java.lang.String) r12
            java.lang.reflect.Field r12 = zzG(r1, r12)
            r17[r3] = r12
        L_0x0268:
            r30 = r7
            r14 = r8
            long r7 = r15.objectFieldOffset(r12)
            int r8 = (int) r7
            int r3 = r3 + 1
            r7 = r17[r3]
            boolean r12 = r7 instanceof java.lang.reflect.Field
            if (r12 == 0) goto L_0x027b
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7
            goto L_0x0283
        L_0x027b:
            java.lang.String r7 = (java.lang.String) r7
            java.lang.reflect.Field r7 = zzG(r1, r7)
            r17[r3] = r7
        L_0x0283:
            r3 = r8
            long r7 = r15.objectFieldOffset(r7)
            int r8 = (int) r7
            r26 = r1
            r1 = r8
            r29 = r11
            r25 = 1
            r11 = r0
            r8 = r3
            r3 = 0
            goto L_0x0391
        L_0x0295:
            r30 = r7
            r14 = r8
            r31 = r12
            int r7 = r16 + 1
            r8 = r17[r16]
            java.lang.String r8 = (java.lang.String) r8
            java.lang.reflect.Field r8 = zzG(r1, r8)
            r12 = 9
            if (r5 == r12) goto L_0x030d
            r12 = 17
            if (r5 != r12) goto L_0x02ad
            goto L_0x030d
        L_0x02ad:
            r12 = 27
            if (r5 == r12) goto L_0x02fd
            r12 = 49
            if (r5 != r12) goto L_0x02b6
            goto L_0x02fd
        L_0x02b6:
            r12 = 12
            if (r5 == r12) goto L_0x02ed
            r12 = 30
            if (r5 == r12) goto L_0x02ed
            r12 = 44
            if (r5 != r12) goto L_0x02c3
            goto L_0x02ed
        L_0x02c3:
            r12 = 50
            if (r5 != r12) goto L_0x02e3
            int r12 = r22 + 1
            r13[r22] = r9
            int r22 = r9 / 3
            int r22 = r22 + r22
            int r27 = r7 + 1
            r7 = r17[r7]
            r11[r22] = r7
            r7 = r2 & 2048(0x800, float:2.87E-42)
            if (r7 == 0) goto L_0x02e6
            int r7 = r27 + 1
            int r22 = r22 + 1
            r27 = r17[r27]
            r11[r22] = r27
            r22 = r12
        L_0x02e3:
            r25 = 1
            goto L_0x031a
        L_0x02e6:
            r22 = r12
            r12 = r27
            r25 = 1
            goto L_0x031b
        L_0x02ed:
            if (r10 != 0) goto L_0x02e3
            int r12 = r9 / 3
            int r27 = r7 + 1
            int r12 = r12 + r12
            r25 = 1
            int r12 = r12 + 1
            r7 = r17[r7]
            r11[r12] = r7
            goto L_0x030a
        L_0x02fd:
            r25 = 1
            int r12 = r9 / 3
            int r27 = r7 + 1
            int r12 = r12 + r12
            int r12 = r12 + 1
            r7 = r17[r7]
            r11[r12] = r7
        L_0x030a:
            r12 = r27
            goto L_0x031b
        L_0x030d:
            r25 = 1
            int r12 = r9 / 3
            int r12 = r12 + r12
            int r12 = r12 + 1
            java.lang.Class r27 = r8.getType()
            r11[r12] = r27
        L_0x031a:
            r12 = r7
        L_0x031b:
            long r7 = r15.objectFieldOffset(r8)
            int r8 = (int) r7
            r7 = r2 & 4096(0x1000, float:5.74E-42)
            r27 = 1048575(0xfffff, float:1.469367E-39)
            r29 = r11
            r11 = 4096(0x1000, float:5.74E-42)
            if (r7 != r11) goto L_0x0378
            r7 = 17
            if (r5 > r7) goto L_0x0378
            int r7 = r3 + 1
            char r3 = r0.charAt(r3)
            r11 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r11) goto L_0x0354
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r26 = 13
        L_0x033e:
            int r27 = r7 + 1
            char r7 = r0.charAt(r7)
            if (r7 < r11) goto L_0x0350
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r26
            r3 = r3 | r7
            int r26 = r26 + 13
            r7 = r27
            goto L_0x033e
        L_0x0350:
            int r7 = r7 << r26
            r3 = r3 | r7
            goto L_0x0356
        L_0x0354:
            r27 = r7
        L_0x0356:
            int r7 = r6 + r6
            int r26 = r3 / 32
            int r26 = r26 + r7
            r7 = r17[r26]
            boolean r11 = r7 instanceof java.lang.reflect.Field
            if (r11 == 0) goto L_0x0365
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7
            goto L_0x036d
        L_0x0365:
            java.lang.String r7 = (java.lang.String) r7
            java.lang.reflect.Field r7 = zzG(r1, r7)
            r17[r26] = r7
        L_0x036d:
            r11 = r0
            r26 = r1
            long r0 = r15.objectFieldOffset(r7)
            int r1 = (int) r0
            int r3 = r3 % 32
            goto L_0x0381
        L_0x0378:
            r11 = r0
            r26 = r1
            r27 = r3
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r3 = 0
        L_0x0381:
            r0 = 18
            if (r5 < r0) goto L_0x038f
            r0 = 49
            if (r5 > r0) goto L_0x038f
            int r0 = r23 + 1
            r13[r23] = r8
            r23 = r0
        L_0x038f:
            r16 = r12
        L_0x0391:
            int r0 = r9 + 1
            r30[r9] = r4
            int r4 = r0 + 1
            r7 = r2 & 512(0x200, float:7.175E-43)
            if (r7 == 0) goto L_0x039e
            r7 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x039f
        L_0x039e:
            r7 = 0
        L_0x039f:
            r2 = r2 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x03a6
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03a7
        L_0x03a6:
            r2 = 0
        L_0x03a7:
            r2 = r2 | r7
            int r5 = r5 << 20
            r2 = r2 | r5
            r2 = r2 | r8
            r30[r0] = r2
            int r9 = r4 + 1
            int r0 = r3 << 20
            r0 = r0 | r1
            r30[r4] = r0
            r0 = r11
            r8 = r14
            r14 = r24
            r1 = r26
            r4 = r27
            r3 = r28
            r11 = r29
            r7 = r30
            r12 = r31
            r5 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0183
        L_0x03ca:
            r30 = r7
            r29 = r11
            r31 = r12
            r24 = r14
            r14 = r8
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfo r0 = new com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfo
            r4 = r0
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfl r9 = r33.zza()
            r11 = 0
            r1 = r29
            r20 = 0
            r5 = r30
            r6 = r1
            r7 = r14
            r8 = r31
            r12 = r13
            r13 = r24
            r14 = r21
            r15 = r34
            r16 = r35
            r17 = r36
            r18 = r37
            r19 = r38
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfo.zzl(com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfw, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfr, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzez, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgp, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdo, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfg):com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfo");
    }

    private static double zzn(Object obj, long j) {
        return ((Double) zzgz.zzf(obj, j)).doubleValue();
    }

    private static float zzo(Object obj, long j) {
        return ((Float) zzgz.zzf(obj, j)).floatValue();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0306, code lost:
        r7 = (r7 + r6) + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0308, code lost:
        r3 = r3 + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x04b6, code lost:
        r3 = p379.C16530d.m42011d(r7, r1, r6, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006c, code lost:
        r1 = r1 + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0543, code lost:
        r2 = r2 + 3;
        r1 = 1048575;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x011f, code lost:
        r7 = (r7 + r1) + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x013c, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x016d, code lost:
        r1 = r1 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0199, code lost:
        r1 = r1 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01a8, code lost:
        r1 = r1 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01b8, code lost:
        r1 = r1 + 8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int zzp(java.lang.Object r15) {
        /*
            r14 = this;
            sun.misc.Unsafe r0 = zzb
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 1048575(0xfffff, float:1.469367E-39)
        L_0x000b:
            int[] r6 = r14.zzc
            int r6 = r6.length
            if (r2 >= r6) goto L_0x054a
            int r6 = r14.zzB(r2)
            int[] r7 = r14.zzc
            r8 = r7[r2]
            int r9 = zzA(r6)
            r10 = 17
            r11 = 1
            if (r9 > r10) goto L_0x0034
            int r10 = r2 + 2
            r7 = r7[r10]
            r10 = r7 & r1
            int r7 = r7 >>> 20
            int r7 = r11 << r7
            if (r10 == r5) goto L_0x0035
            long r4 = (long) r10
            int r4 = r0.getInt(r15, r4)
            r5 = r10
            goto L_0x0035
        L_0x0034:
            r7 = 0
        L_0x0035:
            r1 = r1 & r6
            long r12 = (long) r1
            r1 = 63
            switch(r9) {
                case 0: goto L_0x0537;
                case 1: goto L_0x052b;
                case 2: goto L_0x0517;
                case 3: goto L_0x0503;
                case 4: goto L_0x04ef;
                case 5: goto L_0x04e3;
                case 6: goto L_0x04d7;
                case 7: goto L_0x04cb;
                case 8: goto L_0x049a;
                case 9: goto L_0x0487;
                case 10: goto L_0x046e;
                case 11: goto L_0x045a;
                case 12: goto L_0x0446;
                case 13: goto L_0x043a;
                case 14: goto L_0x042e;
                case 15: goto L_0x0415;
                case 16: goto L_0x03fd;
                case 17: goto L_0x03e9;
                case 18: goto L_0x03dc;
                case 19: goto L_0x03cf;
                case 20: goto L_0x03c2;
                case 21: goto L_0x03b5;
                case 22: goto L_0x03a8;
                case 23: goto L_0x039b;
                case 24: goto L_0x038e;
                case 25: goto L_0x0381;
                case 26: goto L_0x0375;
                case 27: goto L_0x0365;
                case 28: goto L_0x0359;
                case 29: goto L_0x034c;
                case 30: goto L_0x033f;
                case 31: goto L_0x0332;
                case 32: goto L_0x0325;
                case 33: goto L_0x0318;
                case 34: goto L_0x030b;
                case 35: goto L_0x02f2;
                case 36: goto L_0x02dd;
                case 37: goto L_0x02c8;
                case 38: goto L_0x02b3;
                case 39: goto L_0x029e;
                case 40: goto L_0x0289;
                case 41: goto L_0x0273;
                case 42: goto L_0x025d;
                case 43: goto L_0x0247;
                case 44: goto L_0x0231;
                case 45: goto L_0x021b;
                case 46: goto L_0x0205;
                case 47: goto L_0x01ef;
                case 48: goto L_0x01d9;
                case 49: goto L_0x01c9;
                case 50: goto L_0x01bc;
                case 51: goto L_0x01ac;
                case 52: goto L_0x019c;
                case 53: goto L_0x0185;
                case 54: goto L_0x0170;
                case 55: goto L_0x0159;
                case 56: goto L_0x014c;
                case 57: goto L_0x013f;
                case 58: goto L_0x0130;
                case 59: goto L_0x0101;
                case 60: goto L_0x00ed;
                case 61: goto L_0x00d2;
                case 62: goto L_0x00bc;
                case 63: goto L_0x00a6;
                case 64: goto L_0x0098;
                case 65: goto L_0x008a;
                case 66: goto L_0x006f;
                case 67: goto L_0x0054;
                case 68: goto L_0x003e;
                default: goto L_0x003c;
            }
        L_0x003c:
            goto L_0x0543
        L_0x003e:
            boolean r1 = r14.zzP(r15, r8, r2)
            if (r1 == 0) goto L_0x0543
            java.lang.Object r1 = r0.getObject(r15, r12)
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfl r1 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfl) r1
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgb r6 = r14.zzE(r2)
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzv(r8, r1, r6)
            goto L_0x0497
        L_0x0054:
            boolean r6 = r14.zzP(r15, r8, r2)
            if (r6 == 0) goto L_0x0543
            long r6 = zzC(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r8)
            long r9 = r6 + r6
            long r6 = r6 >> r1
            long r6 = r6 ^ r9
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzE(r6)
        L_0x006c:
            int r1 = r1 + r8
            goto L_0x0497
        L_0x006f:
            boolean r1 = r14.zzP(r15, r8, r2)
            if (r1 == 0) goto L_0x0543
            int r1 = zzr(r15, r12)
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r6)
            int r7 = r1 + r1
            int r1 = r1 >> 31
            r1 = r1 ^ r7
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r1)
            goto L_0x016d
        L_0x008a:
            boolean r1 = r14.zzP(r15, r8, r2)
            if (r1 == 0) goto L_0x0543
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r1)
            goto L_0x01b8
        L_0x0098:
            boolean r1 = r14.zzP(r15, r8, r2)
            if (r1 == 0) goto L_0x0543
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r1)
            goto L_0x01a8
        L_0x00a6:
            boolean r1 = r14.zzP(r15, r8, r2)
            if (r1 == 0) goto L_0x0543
            int r1 = zzr(r15, r12)
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r6)
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzx(r1)
            goto L_0x016d
        L_0x00bc:
            boolean r1 = r14.zzP(r15, r8, r2)
            if (r1 == 0) goto L_0x0543
            int r1 = zzr(r15, r12)
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r6)
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r1)
            goto L_0x016d
        L_0x00d2:
            boolean r1 = r14.zzP(r15, r8, r2)
            if (r1 == 0) goto L_0x0543
            java.lang.Object r1 = r0.getObject(r15, r12)
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb r1 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb) r1
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r6)
            int r1 = r1.zzd()
            int r7 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r1)
            goto L_0x011f
        L_0x00ed:
            boolean r1 = r14.zzP(r15, r8, r2)
            if (r1 == 0) goto L_0x0543
            java.lang.Object r1 = r0.getObject(r15, r12)
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgb r6 = r14.zzE(r2)
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzo(r8, r1, r6)
            goto L_0x0497
        L_0x0101:
            boolean r1 = r14.zzP(r15, r8, r2)
            if (r1 == 0) goto L_0x0543
            java.lang.Object r1 = r0.getObject(r15, r12)
            boolean r6 = r1 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
            if (r6 == 0) goto L_0x0123
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb r1 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb) r1
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r6)
            int r1 = r1.zzd()
            int r7 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r1)
        L_0x011f:
            int r7 = r7 + r1
            int r7 = r7 + r6
            goto L_0x0308
        L_0x0123:
            java.lang.String r1 = (java.lang.String) r1
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r6)
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzB(r1)
            goto L_0x016d
        L_0x0130:
            boolean r1 = r14.zzP(r15, r8, r2)
            if (r1 == 0) goto L_0x0543
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r1)
        L_0x013c:
            int r1 = r1 + r11
            goto L_0x0497
        L_0x013f:
            boolean r1 = r14.zzP(r15, r8, r2)
            if (r1 == 0) goto L_0x0543
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r1)
            goto L_0x01a8
        L_0x014c:
            boolean r1 = r14.zzP(r15, r8, r2)
            if (r1 == 0) goto L_0x0543
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r1)
            goto L_0x01b8
        L_0x0159:
            boolean r1 = r14.zzP(r15, r8, r2)
            if (r1 == 0) goto L_0x0543
            int r1 = zzr(r15, r12)
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r6)
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzx(r1)
        L_0x016d:
            int r1 = r1 + r6
            goto L_0x0497
        L_0x0170:
            boolean r1 = r14.zzP(r15, r8, r2)
            if (r1 == 0) goto L_0x0543
            long r6 = zzC(r15, r12)
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r1)
            int r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzE(r6)
            goto L_0x0199
        L_0x0185:
            boolean r1 = r14.zzP(r15, r8, r2)
            if (r1 == 0) goto L_0x0543
            long r6 = zzC(r15, r12)
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r1)
            int r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzE(r6)
        L_0x0199:
            int r1 = r1 + r6
            goto L_0x0497
        L_0x019c:
            boolean r1 = r14.zzP(r15, r8, r2)
            if (r1 == 0) goto L_0x0543
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r1)
        L_0x01a8:
            int r1 = r1 + 4
            goto L_0x0497
        L_0x01ac:
            boolean r1 = r14.zzP(r15, r8, r2)
            if (r1 == 0) goto L_0x0543
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r1)
        L_0x01b8:
            int r1 = r1 + 8
            goto L_0x0497
        L_0x01bc:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.lang.Object r6 = r14.zzF(r2)
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfg.zza(r8, r1, r6)
            goto L_0x0543
        L_0x01c9:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgb r6 = r14.zzE(r2)
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzj(r8, r1, r6)
            goto L_0x0497
        L_0x01d9:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzt(r1)
            if (r1 <= 0) goto L_0x0543
            int r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzC(r8)
            int r7 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r1)
            goto L_0x0306
        L_0x01ef:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzr(r1)
            if (r1 <= 0) goto L_0x0543
            int r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzC(r8)
            int r7 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r1)
            goto L_0x0306
        L_0x0205:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzi(r1)
            if (r1 <= 0) goto L_0x0543
            int r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzC(r8)
            int r7 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r1)
            goto L_0x0306
        L_0x021b:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzg(r1)
            if (r1 <= 0) goto L_0x0543
            int r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzC(r8)
            int r7 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r1)
            goto L_0x0306
        L_0x0231:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zze(r1)
            if (r1 <= 0) goto L_0x0543
            int r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzC(r8)
            int r7 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r1)
            goto L_0x0306
        L_0x0247:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzw(r1)
            if (r1 <= 0) goto L_0x0543
            int r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzC(r8)
            int r7 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r1)
            goto L_0x0306
        L_0x025d:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzb(r1)
            if (r1 <= 0) goto L_0x0543
            int r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzC(r8)
            int r7 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r1)
            goto L_0x0306
        L_0x0273:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzg(r1)
            if (r1 <= 0) goto L_0x0543
            int r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzC(r8)
            int r7 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r1)
            goto L_0x0306
        L_0x0289:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzi(r1)
            if (r1 <= 0) goto L_0x0543
            int r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzC(r8)
            int r7 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r1)
            goto L_0x0306
        L_0x029e:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzl(r1)
            if (r1 <= 0) goto L_0x0543
            int r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzC(r8)
            int r7 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r1)
            goto L_0x0306
        L_0x02b3:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzy(r1)
            if (r1 <= 0) goto L_0x0543
            int r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzC(r8)
            int r7 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r1)
            goto L_0x0306
        L_0x02c8:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzn(r1)
            if (r1 <= 0) goto L_0x0543
            int r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzC(r8)
            int r7 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r1)
            goto L_0x0306
        L_0x02dd:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzg(r1)
            if (r1 <= 0) goto L_0x0543
            int r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzC(r8)
            int r7 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r1)
            goto L_0x0306
        L_0x02f2:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzi(r1)
            if (r1 <= 0) goto L_0x0543
            int r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzC(r8)
            int r7 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r1)
        L_0x0306:
            int r7 = r7 + r6
            int r7 = r7 + r1
        L_0x0308:
            int r3 = r3 + r7
            goto L_0x0543
        L_0x030b:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            r6 = 0
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzs(r8, r1, r6)
            goto L_0x0497
        L_0x0318:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzq(r8, r6, r1)
            goto L_0x0497
        L_0x0325:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzh(r8, r6, r1)
            goto L_0x0497
        L_0x0332:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzf(r8, r6, r1)
            goto L_0x0497
        L_0x033f:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzd(r8, r6, r1)
            goto L_0x0497
        L_0x034c:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzv(r8, r6, r1)
            goto L_0x0497
        L_0x0359:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzc(r8, r1)
            goto L_0x0497
        L_0x0365:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgb r6 = r14.zzE(r2)
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzp(r8, r1, r6)
            goto L_0x0497
        L_0x0375:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzu(r8, r1)
            goto L_0x0497
        L_0x0381:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            r6 = 0
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zza(r8, r1, r6)
            goto L_0x0497
        L_0x038e:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzf(r8, r6, r1)
            goto L_0x0497
        L_0x039b:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzh(r8, r6, r1)
            goto L_0x0497
        L_0x03a8:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzk(r8, r6, r1)
            goto L_0x0497
        L_0x03b5:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzx(r8, r6, r1)
            goto L_0x0497
        L_0x03c2:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzm(r8, r6, r1)
            goto L_0x0497
        L_0x03cf:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzf(r8, r6, r1)
            goto L_0x0497
        L_0x03dc:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzh(r8, r6, r1)
            goto L_0x0497
        L_0x03e9:
            r1 = r4 & r7
            if (r1 == 0) goto L_0x0543
            java.lang.Object r1 = r0.getObject(r15, r12)
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfl r1 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfl) r1
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgb r6 = r14.zzE(r2)
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzv(r8, r1, r6)
            goto L_0x0497
        L_0x03fd:
            r6 = r7 & r4
            if (r6 == 0) goto L_0x0543
            long r6 = r0.getLong(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r8)
            long r9 = r6 + r6
            long r6 = r6 >> r1
            long r6 = r6 ^ r9
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzE(r6)
            goto L_0x006c
        L_0x0415:
            r1 = r4 & r7
            if (r1 == 0) goto L_0x0543
            int r1 = r0.getInt(r15, r12)
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r6)
            int r7 = r1 + r1
            int r1 = r1 >> 31
            r1 = r1 ^ r7
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r1)
            goto L_0x016d
        L_0x042e:
            r1 = r4 & r7
            if (r1 == 0) goto L_0x0543
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r1)
            goto L_0x01b8
        L_0x043a:
            r1 = r4 & r7
            if (r1 == 0) goto L_0x0543
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r1)
            goto L_0x01a8
        L_0x0446:
            r1 = r4 & r7
            if (r1 == 0) goto L_0x0543
            int r1 = r0.getInt(r15, r12)
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r6)
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzx(r1)
            goto L_0x016d
        L_0x045a:
            r1 = r4 & r7
            if (r1 == 0) goto L_0x0543
            int r1 = r0.getInt(r15, r12)
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r6)
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r1)
            goto L_0x016d
        L_0x046e:
            r1 = r4 & r7
            if (r1 == 0) goto L_0x0543
            java.lang.Object r1 = r0.getObject(r15, r12)
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb r1 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb) r1
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r6)
            int r1 = r1.zzd()
            int r7 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r1)
            goto L_0x04b6
        L_0x0487:
            r1 = r4 & r7
            if (r1 == 0) goto L_0x0543
            java.lang.Object r1 = r0.getObject(r15, r12)
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgb r6 = r14.zzE(r2)
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzo(r8, r1, r6)
        L_0x0497:
            int r3 = r3 + r1
            goto L_0x0543
        L_0x049a:
            r1 = r4 & r7
            if (r1 == 0) goto L_0x0543
            java.lang.Object r1 = r0.getObject(r15, r12)
            boolean r6 = r1 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
            if (r6 == 0) goto L_0x04bd
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb r1 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb) r1
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r6)
            int r1 = r1.zzd()
            int r7 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r1)
        L_0x04b6:
            int r1 = p379.C16530d.m42011d(r7, r1, r6, r3)
            r3 = r1
            goto L_0x0543
        L_0x04bd:
            java.lang.String r1 = (java.lang.String) r1
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r6)
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzB(r1)
            goto L_0x016d
        L_0x04cb:
            r1 = r4 & r7
            if (r1 == 0) goto L_0x0543
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r1)
            goto L_0x013c
        L_0x04d7:
            r1 = r4 & r7
            if (r1 == 0) goto L_0x0543
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r1)
            goto L_0x01a8
        L_0x04e3:
            r1 = r4 & r7
            if (r1 == 0) goto L_0x0543
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r1)
            goto L_0x01b8
        L_0x04ef:
            r1 = r4 & r7
            if (r1 == 0) goto L_0x0543
            int r1 = r0.getInt(r15, r12)
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r6)
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzx(r1)
            goto L_0x016d
        L_0x0503:
            r1 = r4 & r7
            if (r1 == 0) goto L_0x0543
            long r6 = r0.getLong(r15, r12)
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r1)
            int r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzE(r6)
            goto L_0x0199
        L_0x0517:
            r1 = r4 & r7
            if (r1 == 0) goto L_0x0543
            long r6 = r0.getLong(r15, r12)
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r1)
            int r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzE(r6)
            goto L_0x0199
        L_0x052b:
            r1 = r4 & r7
            if (r1 == 0) goto L_0x0543
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r1)
            goto L_0x01a8
        L_0x0537:
            r1 = r4 & r7
            if (r1 == 0) goto L_0x0543
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r1)
            goto L_0x01b8
        L_0x0543:
            int r2 = r2 + 3
            r1 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x000b
        L_0x054a:
            r0 = 0
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgp r1 = r14.zzn
            java.lang.Object r2 = r1.zzc(r15)
            int r1 = r1.zza(r2)
            int r3 = r3 + r1
            boolean r1 = r14.zzh
            if (r1 == 0) goto L_0x05a8
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdo r1 = r14.zzo
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzds r15 = r1.zzb(r15)
            r1 = 0
        L_0x0561:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgl r2 = r15.zza
            int r2 = r2.zzb()
            if (r1 >= r2) goto L_0x0581
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgl r2 = r15.zza
            java.util.Map$Entry r2 = r2.zzg(r1)
            java.lang.Object r4 = r2.getKey()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdr r4 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdr) r4
            java.lang.Object r2 = r2.getValue()
            int r2 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzds.zza(r4, r2)
            int r0 = r0 + r2
            int r1 = r1 + 1
            goto L_0x0561
        L_0x0581:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgl r15 = r15.zza
            java.lang.Iterable r15 = r15.zzc()
            java.util.Iterator r15 = r15.iterator()
        L_0x058b:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L_0x05a7
            java.lang.Object r1 = r15.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdr r2 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdr) r2
            java.lang.Object r1 = r1.getValue()
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzds.zza(r2, r1)
            int r0 = r0 + r1
            goto L_0x058b
        L_0x05a7:
            int r3 = r3 + r0
        L_0x05a8:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfo.zzp(java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02fc, code lost:
        r6 = (r6 + r5) + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x04b2, code lost:
        r6 = (r6 + r4) + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x04b4, code lost:
        r3 = r3 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x04d0, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0501, code lost:
        r4 = r4 + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x052c, code lost:
        r4 = r4 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x053b, code lost:
        r4 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x054b, code lost:
        r4 = r4 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x054f, code lost:
        r2 = r2 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int zzq(java.lang.Object r12) {
        /*
            r11 = this;
            sun.misc.Unsafe r0 = zzb
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x0005:
            int[] r4 = r11.zzc
            int r4 = r4.length
            if (r2 >= r4) goto L_0x0553
            int r4 = r11.zzB(r2)
            int r5 = zzA(r4)
            int[] r6 = r11.zzc
            r6 = r6[r2]
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r7
            long r7 = (long) r4
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdt r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdt.DOUBLE_LIST_PACKED
            int r4 = r4.zza()
            if (r5 < r4) goto L_0x0031
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdt r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdt.SINT64_LIST_PACKED
            int r4 = r4.zza()
            if (r5 > r4) goto L_0x0031
            int[] r4 = r11.zzc
            int r9 = r2 + 2
            r4 = r4[r9]
        L_0x0031:
            r4 = 63
            switch(r5) {
                case 0: goto L_0x053f;
                case 1: goto L_0x052f;
                case 2: goto L_0x0518;
                case 3: goto L_0x0503;
                case 4: goto L_0x04ed;
                case 5: goto L_0x04e0;
                case 6: goto L_0x04d3;
                case 7: goto L_0x04c4;
                case 8: goto L_0x0494;
                case 9: goto L_0x047f;
                case 10: goto L_0x0464;
                case 11: goto L_0x044e;
                case 12: goto L_0x0438;
                case 13: goto L_0x042a;
                case 14: goto L_0x041c;
                case 15: goto L_0x0401;
                case 16: goto L_0x03e6;
                case 17: goto L_0x03d0;
                case 18: goto L_0x03c4;
                case 19: goto L_0x03b8;
                case 20: goto L_0x03ac;
                case 21: goto L_0x03a0;
                case 22: goto L_0x0394;
                case 23: goto L_0x0388;
                case 24: goto L_0x037c;
                case 25: goto L_0x0370;
                case 26: goto L_0x0364;
                case 27: goto L_0x0354;
                case 28: goto L_0x0348;
                case 29: goto L_0x033c;
                case 30: goto L_0x0330;
                case 31: goto L_0x0324;
                case 32: goto L_0x0318;
                case 33: goto L_0x030c;
                case 34: goto L_0x0300;
                case 35: goto L_0x02e8;
                case 36: goto L_0x02d3;
                case 37: goto L_0x02be;
                case 38: goto L_0x02a9;
                case 39: goto L_0x0294;
                case 40: goto L_0x027f;
                case 41: goto L_0x0269;
                case 42: goto L_0x0253;
                case 43: goto L_0x023d;
                case 44: goto L_0x0227;
                case 45: goto L_0x0211;
                case 46: goto L_0x01fb;
                case 47: goto L_0x01e5;
                case 48: goto L_0x01cf;
                case 49: goto L_0x01bf;
                case 50: goto L_0x01b2;
                case 51: goto L_0x01a4;
                case 52: goto L_0x0196;
                case 53: goto L_0x0180;
                case 54: goto L_0x016a;
                case 55: goto L_0x0154;
                case 56: goto L_0x0146;
                case 57: goto L_0x0138;
                case 58: goto L_0x012a;
                case 59: goto L_0x00fc;
                case 60: goto L_0x00e8;
                case 61: goto L_0x00cc;
                case 62: goto L_0x00b6;
                case 63: goto L_0x00a0;
                case 64: goto L_0x0092;
                case 65: goto L_0x0084;
                case 66: goto L_0x0069;
                case 67: goto L_0x004e;
                case 68: goto L_0x0038;
                default: goto L_0x0036;
            }
        L_0x0036:
            goto L_0x054f
        L_0x0038:
            boolean r4 = r11.zzP(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            java.lang.Object r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r12, r7)
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfl r4 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfl) r4
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgb r5 = r11.zzE(r2)
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzv(r6, r4, r5)
            goto L_0x0491
        L_0x004e:
            boolean r5 = r11.zzP(r12, r6, r2)
            if (r5 == 0) goto L_0x054f
            long r7 = zzC(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r5)
            long r9 = r7 + r7
            long r6 = r7 >> r4
            long r6 = r6 ^ r9
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzE(r6)
            goto L_0x0501
        L_0x0069:
            boolean r4 = r11.zzP(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = zzr(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r5)
            int r6 = r4 + r4
            int r4 = r4 >> 31
            r4 = r4 ^ r6
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r4)
            goto L_0x0501
        L_0x0084:
            boolean r4 = r11.zzP(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r4)
            goto L_0x054b
        L_0x0092:
            boolean r4 = r11.zzP(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r4)
            goto L_0x053b
        L_0x00a0:
            boolean r4 = r11.zzP(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = zzr(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r5)
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzx(r4)
            goto L_0x0501
        L_0x00b6:
            boolean r4 = r11.zzP(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = zzr(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r5)
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r4)
            goto L_0x0501
        L_0x00cc:
            boolean r4 = r11.zzP(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            java.lang.Object r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r12, r7)
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb r4 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r5)
            int r4 = r4.zzd()
            int r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r4)
            goto L_0x04b2
        L_0x00e8:
            boolean r4 = r11.zzP(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            java.lang.Object r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r12, r7)
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgb r5 = r11.zzE(r2)
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzo(r6, r4, r5)
            goto L_0x0491
        L_0x00fc:
            boolean r4 = r11.zzP(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            java.lang.Object r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r12, r7)
            boolean r5 = r4 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
            if (r5 == 0) goto L_0x011c
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb r4 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r5)
            int r4 = r4.zzd()
            int r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r4)
            goto L_0x04b2
        L_0x011c:
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r5)
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzB(r4)
            goto L_0x0501
        L_0x012a:
            boolean r4 = r11.zzP(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r4)
            goto L_0x04d0
        L_0x0138:
            boolean r4 = r11.zzP(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r4)
            goto L_0x053b
        L_0x0146:
            boolean r4 = r11.zzP(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r4)
            goto L_0x054b
        L_0x0154:
            boolean r4 = r11.zzP(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = zzr(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r5)
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzx(r4)
            goto L_0x0501
        L_0x016a:
            boolean r4 = r11.zzP(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            long r4 = zzC(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r6)
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzE(r4)
            goto L_0x052c
        L_0x0180:
            boolean r4 = r11.zzP(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            long r4 = zzC(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r6)
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzE(r4)
            goto L_0x052c
        L_0x0196:
            boolean r4 = r11.zzP(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r4)
            goto L_0x053b
        L_0x01a4:
            boolean r4 = r11.zzP(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r4)
            goto L_0x054b
        L_0x01b2:
            java.lang.Object r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r12, r7)
            java.lang.Object r5 = r11.zzF(r2)
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfg.zza(r6, r4, r5)
            goto L_0x054f
        L_0x01bf:
            java.lang.Object r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgb r5 = r11.zzE(r2)
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzj(r6, r4, r5)
            goto L_0x0491
        L_0x01cf:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzt(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzC(r6)
            int r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r4)
            goto L_0x02fc
        L_0x01e5:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzr(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzC(r6)
            int r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r4)
            goto L_0x02fc
        L_0x01fb:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzi(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzC(r6)
            int r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r4)
            goto L_0x02fc
        L_0x0211:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzg(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzC(r6)
            int r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r4)
            goto L_0x02fc
        L_0x0227:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zze(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzC(r6)
            int r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r4)
            goto L_0x02fc
        L_0x023d:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzw(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzC(r6)
            int r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r4)
            goto L_0x02fc
        L_0x0253:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzb(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzC(r6)
            int r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r4)
            goto L_0x02fc
        L_0x0269:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzg(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzC(r6)
            int r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r4)
            goto L_0x02fc
        L_0x027f:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzi(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzC(r6)
            int r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r4)
            goto L_0x02fc
        L_0x0294:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzl(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzC(r6)
            int r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r4)
            goto L_0x02fc
        L_0x02a9:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzy(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzC(r6)
            int r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r4)
            goto L_0x02fc
        L_0x02be:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzn(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzC(r6)
            int r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r4)
            goto L_0x02fc
        L_0x02d3:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzg(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzC(r6)
            int r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r4)
            goto L_0x02fc
        L_0x02e8:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzi(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzC(r6)
            int r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r4)
        L_0x02fc:
            int r6 = r6 + r5
            int r6 = r6 + r4
            goto L_0x04b4
        L_0x0300:
            java.lang.Object r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzs(r6, r4, r1)
            goto L_0x0491
        L_0x030c:
            java.lang.Object r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzq(r6, r4, r1)
            goto L_0x0491
        L_0x0318:
            java.lang.Object r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzh(r6, r4, r1)
            goto L_0x0491
        L_0x0324:
            java.lang.Object r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzf(r6, r4, r1)
            goto L_0x0491
        L_0x0330:
            java.lang.Object r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzd(r6, r4, r1)
            goto L_0x0491
        L_0x033c:
            java.lang.Object r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzv(r6, r4, r1)
            goto L_0x0491
        L_0x0348:
            java.lang.Object r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzc(r6, r4)
            goto L_0x0491
        L_0x0354:
            java.lang.Object r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgb r5 = r11.zzE(r2)
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzp(r6, r4, r5)
            goto L_0x0491
        L_0x0364:
            java.lang.Object r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzu(r6, r4)
            goto L_0x0491
        L_0x0370:
            java.lang.Object r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zza(r6, r4, r1)
            goto L_0x0491
        L_0x037c:
            java.lang.Object r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzf(r6, r4, r1)
            goto L_0x0491
        L_0x0388:
            java.lang.Object r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzh(r6, r4, r1)
            goto L_0x0491
        L_0x0394:
            java.lang.Object r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzk(r6, r4, r1)
            goto L_0x0491
        L_0x03a0:
            java.lang.Object r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzx(r6, r4, r1)
            goto L_0x0491
        L_0x03ac:
            java.lang.Object r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzm(r6, r4, r1)
            goto L_0x0491
        L_0x03b8:
            java.lang.Object r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzf(r6, r4, r1)
            goto L_0x0491
        L_0x03c4:
            java.lang.Object r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzh(r6, r4, r1)
            goto L_0x0491
        L_0x03d0:
            boolean r4 = r11.zzM(r12, r2)
            if (r4 == 0) goto L_0x054f
            java.lang.Object r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r12, r7)
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfl r4 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfl) r4
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgb r5 = r11.zzE(r2)
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzv(r6, r4, r5)
            goto L_0x0491
        L_0x03e6:
            boolean r5 = r11.zzM(r12, r2)
            if (r5 == 0) goto L_0x054f
            long r7 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzd(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r5)
            long r9 = r7 + r7
            long r6 = r7 >> r4
            long r6 = r6 ^ r9
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzE(r6)
            goto L_0x0501
        L_0x0401:
            boolean r4 = r11.zzM(r12, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzc(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r5)
            int r6 = r4 + r4
            int r4 = r4 >> 31
            r4 = r4 ^ r6
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r4)
            goto L_0x0501
        L_0x041c:
            boolean r4 = r11.zzM(r12, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r4)
            goto L_0x054b
        L_0x042a:
            boolean r4 = r11.zzM(r12, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r4)
            goto L_0x053b
        L_0x0438:
            boolean r4 = r11.zzM(r12, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzc(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r5)
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzx(r4)
            goto L_0x0501
        L_0x044e:
            boolean r4 = r11.zzM(r12, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzc(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r5)
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r4)
            goto L_0x0501
        L_0x0464:
            boolean r4 = r11.zzM(r12, r2)
            if (r4 == 0) goto L_0x054f
            java.lang.Object r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r12, r7)
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb r4 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r5)
            int r4 = r4.zzd()
            int r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r4)
            goto L_0x04b2
        L_0x047f:
            boolean r4 = r11.zzM(r12, r2)
            if (r4 == 0) goto L_0x054f
            java.lang.Object r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r12, r7)
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgb r5 = r11.zzE(r2)
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzo(r6, r4, r5)
        L_0x0491:
            int r3 = r3 + r4
            goto L_0x054f
        L_0x0494:
            boolean r4 = r11.zzM(r12, r2)
            if (r4 == 0) goto L_0x054f
            java.lang.Object r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r12, r7)
            boolean r5 = r4 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
            if (r5 == 0) goto L_0x04b7
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb r4 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r5)
            int r4 = r4.zzd()
            int r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r4)
        L_0x04b2:
            int r6 = r6 + r4
            int r6 = r6 + r5
        L_0x04b4:
            int r3 = r3 + r6
            goto L_0x054f
        L_0x04b7:
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r5)
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzB(r4)
            goto L_0x0501
        L_0x04c4:
            boolean r4 = r11.zzM(r12, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r4)
        L_0x04d0:
            int r4 = r4 + 1
            goto L_0x0491
        L_0x04d3:
            boolean r4 = r11.zzM(r12, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r4)
            goto L_0x053b
        L_0x04e0:
            boolean r4 = r11.zzM(r12, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r4)
            goto L_0x054b
        L_0x04ed:
            boolean r4 = r11.zzM(r12, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzc(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r5)
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzx(r4)
        L_0x0501:
            int r4 = r4 + r5
            goto L_0x0491
        L_0x0503:
            boolean r4 = r11.zzM(r12, r2)
            if (r4 == 0) goto L_0x054f
            long r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzd(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r6)
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzE(r4)
            goto L_0x052c
        L_0x0518:
            boolean r4 = r11.zzM(r12, r2)
            if (r4 == 0) goto L_0x054f
            long r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzd(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r6)
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzE(r4)
        L_0x052c:
            int r4 = r4 + r6
            goto L_0x0491
        L_0x052f:
            boolean r4 = r11.zzM(r12, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r4)
        L_0x053b:
            int r4 = r4 + 4
            goto L_0x0491
        L_0x053f:
            boolean r4 = r11.zzM(r12, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi.zzD(r4)
        L_0x054b:
            int r4 = r4 + 8
            goto L_0x0491
        L_0x054f:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x0553:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgp r0 = r11.zzn
            java.lang.Object r12 = r0.zzc(r12)
            int r12 = r0.zza(r12)
            int r3 = r3 + r12
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfo.zzq(java.lang.Object):int");
    }

    private static int zzr(Object obj, long j) {
        return ((Integer) zzgz.zzf(obj, j)).intValue();
    }

    private final int zzs(Object obj, byte[] bArr, int i, int i2, int i3, long j, zzco zzco) throws IOException {
        Unsafe unsafe = zzb;
        Object zzF = zzF(i3);
        Object object = unsafe.getObject(obj, j);
        if (!((zzff) object).zze()) {
            zzff zzb2 = zzff.zza().zzb();
            zzfg.zzb(zzb2, object);
            unsafe.putObject(obj, j, zzb2);
        }
        zzfe zzfe = (zzfe) zzF;
        throw null;
    }

    private final int zzt(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, zzco zzco) throws IOException {
        boolean z;
        Object obj2;
        Object obj3;
        Object obj4 = obj;
        byte[] bArr2 = bArr;
        int i9 = i;
        int i11 = i3;
        int i12 = i4;
        int i13 = i5;
        long j2 = j;
        int i14 = i8;
        zzco zzco2 = zzco;
        Unsafe unsafe = zzb;
        long j3 = (long) (this.zzc[i14 + 2] & 1048575);
        switch (i7) {
            case 51:
                if (i13 == 1) {
                    unsafe.putObject(obj4, j2, Double.valueOf(Double.longBitsToDouble(zzcp.zzo(bArr, i))));
                    unsafe.putInt(obj4, j3, i12);
                    return i9 + 8;
                }
                break;
            case 52:
                if (i13 == 5) {
                    unsafe.putObject(obj4, j2, Float.valueOf(Float.intBitsToFloat(zzcp.zzb(bArr, i))));
                    unsafe.putInt(obj4, j3, i12);
                    return i9 + 4;
                }
                break;
            case 53:
            case 54:
                if (i13 == 0) {
                    int zzm2 = zzcp.zzm(bArr2, i9, zzco2);
                    unsafe.putObject(obj4, j2, Long.valueOf(zzco2.zzb));
                    unsafe.putInt(obj4, j3, i12);
                    return zzm2;
                }
                break;
            case 55:
            case 62:
                if (i13 == 0) {
                    int zzj2 = zzcp.zzj(bArr2, i9, zzco2);
                    unsafe.putObject(obj4, j2, Integer.valueOf(zzco2.zza));
                    unsafe.putInt(obj4, j3, i12);
                    return zzj2;
                }
                break;
            case 56:
            case 65:
                if (i13 == 1) {
                    unsafe.putObject(obj4, j2, Long.valueOf(zzcp.zzo(bArr, i)));
                    unsafe.putInt(obj4, j3, i12);
                    return i9 + 8;
                }
                break;
            case 57:
            case 64:
                if (i13 == 5) {
                    unsafe.putObject(obj4, j2, Integer.valueOf(zzcp.zzb(bArr, i)));
                    unsafe.putInt(obj4, j3, i12);
                    return i9 + 4;
                }
                break;
            case 58:
                if (i13 == 0) {
                    int zzm3 = zzcp.zzm(bArr2, i9, zzco2);
                    if (zzco2.zzb != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    unsafe.putObject(obj4, j2, Boolean.valueOf(z));
                    unsafe.putInt(obj4, j3, i12);
                    return zzm3;
                }
                break;
            case 59:
                if (i13 == 2) {
                    int zzj3 = zzcp.zzj(bArr2, i9, zzco2);
                    int i15 = zzco2.zza;
                    if (i15 == 0) {
                        unsafe.putObject(obj4, j2, "");
                    } else if ((i6 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) == 0 || zzhe.zzi(bArr2, zzj3, zzj3 + i15)) {
                        unsafe.putObject(obj4, j2, new String(bArr2, zzj3, i15, zzel.zzb));
                        zzj3 += i15;
                    } else {
                        throw zzen.zzc();
                    }
                    unsafe.putInt(obj4, j3, i12);
                    return zzj3;
                }
                break;
            case 60:
                if (i13 == 2) {
                    int zzd2 = zzcp.zzd(zzE(i14), bArr2, i9, i2, zzco2);
                    if (unsafe.getInt(obj4, j3) == i12) {
                        obj2 = unsafe.getObject(obj4, j2);
                    } else {
                        obj2 = null;
                    }
                    if (obj2 == null) {
                        unsafe.putObject(obj4, j2, zzco2.zzc);
                    } else {
                        unsafe.putObject(obj4, j2, zzel.zzg(obj2, zzco2.zzc));
                    }
                    unsafe.putInt(obj4, j3, i12);
                    return zzd2;
                }
                break;
            case 61:
                if (i13 == 2) {
                    int zza2 = zzcp.zza(bArr2, i9, zzco2);
                    unsafe.putObject(obj4, j2, zzco2.zzc);
                    unsafe.putInt(obj4, j3, i12);
                    return zza2;
                }
                break;
            case 63:
                if (i13 == 0) {
                    int zzj4 = zzcp.zzj(bArr2, i9, zzco2);
                    int i16 = zzco2.zza;
                    zzeg zzD = zzD(i14);
                    if (zzD == null || zzD.zza(i16)) {
                        unsafe.putObject(obj4, j2, Integer.valueOf(i16));
                        unsafe.putInt(obj4, j3, i12);
                    } else {
                        zzd(obj).zzh(i11, Long.valueOf((long) i16));
                    }
                    return zzj4;
                }
                break;
            case 66:
                if (i13 == 0) {
                    int zzj5 = zzcp.zzj(bArr2, i9, zzco2);
                    unsafe.putObject(obj4, j2, Integer.valueOf(zzde.zzb(zzco2.zza)));
                    unsafe.putInt(obj4, j3, i12);
                    return zzj5;
                }
                break;
            case 67:
                if (i13 == 0) {
                    int zzm4 = zzcp.zzm(bArr2, i9, zzco2);
                    unsafe.putObject(obj4, j2, Long.valueOf(zzde.zzc(zzco2.zzb)));
                    unsafe.putInt(obj4, j3, i12);
                    return zzm4;
                }
                break;
            case 68:
                if (i13 == 3) {
                    int zzc2 = zzcp.zzc(zzE(i14), bArr, i, i2, (i11 & -8) | 4, zzco);
                    if (unsafe.getInt(obj4, j3) == i12) {
                        obj3 = unsafe.getObject(obj4, j2);
                    } else {
                        obj3 = null;
                    }
                    if (obj3 == null) {
                        unsafe.putObject(obj4, j2, zzco2.zzc);
                    } else {
                        unsafe.putObject(obj4, j2, zzel.zzg(obj3, zzco2.zzc));
                    }
                    unsafe.putInt(obj4, j3, i12);
                    return zzc2;
                }
                break;
        }
        return i9;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v3, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02fd, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x032e, code lost:
        if (r0 != r15) goto L_0x02e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0351, code lost:
        if (r0 != r15) goto L_0x02e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01c5, code lost:
        r5 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0237, code lost:
        r6 = r6 | r23;
        r9 = r7;
        r2 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x023b, code lost:
        r7 = r19;
        r1 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0241, code lost:
        r2 = r5;
        r28 = r7;
        r23 = r10;
        r7 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02e7, code lost:
        if (r0 != r15) goto L_0x02e9;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int zzu(java.lang.Object r31, byte[] r32, int r33, int r34, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzco r35) throws java.io.IOException {
        /*
            r30 = this;
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            sun.misc.Unsafe r9 = zzb
            r10 = -1
            r16 = 0
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r33
            r1 = -1
            r2 = 0
            r6 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
        L_0x001a:
            if (r0 >= r13) goto L_0x037a
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002c
            int r0 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzk(r0, r12, r3, r11)
            int r3 = r11.zza
            r4 = r0
            r17 = r3
            goto L_0x002f
        L_0x002c:
            r17 = r0
            r4 = r3
        L_0x002f:
            int r5 = r17 >>> 3
            r3 = r17 & 7
            if (r5 <= r1) goto L_0x003c
            int r2 = r2 / 3
            int r0 = r15.zzx(r5, r2)
            goto L_0x0040
        L_0x003c:
            int r0 = r15.zzw(r5)
        L_0x0040:
            r2 = r0
            if (r2 != r10) goto L_0x004e
            r2 = r4
            r20 = r5
            r28 = r9
            r19 = -1
            r23 = 0
            goto L_0x0354
        L_0x004e:
            int[] r0 = r15.zzc
            int r1 = r2 + 1
            r1 = r0[r1]
            int r10 = zzA(r1)
            r33 = r5
            r5 = r1 & r8
            r19 = r9
            long r8 = (long) r5
            r5 = 17
            r21 = r1
            if (r10 > r5) goto L_0x024c
            int r5 = r2 + 2
            r0 = r0[r5]
            int r5 = r0 >>> 20
            r1 = 1
            int r23 = r1 << r5
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            if (r0 == r7) goto L_0x008b
            r20 = r2
            if (r7 == r5) goto L_0x007f
            long r1 = (long) r7
            r7 = r19
            r7.putInt(r14, r1, r6)
            goto L_0x0081
        L_0x007f:
            r7 = r19
        L_0x0081:
            if (r0 == r5) goto L_0x0088
            long r1 = (long) r0
            int r6 = r7.getInt(r14, r1)
        L_0x0088:
            r2 = r7
            r7 = r0
            goto L_0x008f
        L_0x008b:
            r20 = r2
            r2 = r19
        L_0x008f:
            r0 = 5
            switch(r10) {
                case 0: goto L_0x021c;
                case 1: goto L_0x0201;
                case 2: goto L_0x01e0;
                case 3: goto L_0x01e0;
                case 4: goto L_0x01c8;
                case 5: goto L_0x01a6;
                case 6: goto L_0x018f;
                case 7: goto L_0x016f;
                case 8: goto L_0x014c;
                case 9: goto L_0x011f;
                case 10: goto L_0x0107;
                case 11: goto L_0x01c8;
                case 12: goto L_0x00f0;
                case 13: goto L_0x018f;
                case 14: goto L_0x01a6;
                case 15: goto L_0x00d5;
                case 16: goto L_0x00a0;
                default: goto L_0x0093;
            }
        L_0x0093:
            r5 = r4
            r19 = r7
            r10 = r20
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            r7 = r2
            goto L_0x0241
        L_0x00a0:
            if (r3 != 0) goto L_0x00c7
            int r10 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzm(r12, r4, r11)
            long r0 = r11.zzb
            long r21 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzde.zzc(r0)
            r0 = r2
            r1 = r31
            r19 = r7
            r4 = r20
            r7 = r2
            r2 = r8
            r20 = r33
            r8 = r4
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r21
            r0.putLong(r1, r2, r4)
            r6 = r6 | r23
            r9 = r7
            r2 = r8
            r0 = r10
            goto L_0x023b
        L_0x00c7:
            r19 = r7
            r8 = r20
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            r7 = r2
            r5 = r4
            r10 = r8
            goto L_0x0241
        L_0x00d5:
            r19 = r7
            r10 = r20
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            r7 = r2
            if (r3 != 0) goto L_0x01c5
            int r0 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzj(r12, r4, r11)
            int r1 = r11.zza
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzde.zzb(r1)
            r7.putInt(r14, r8, r1)
            goto L_0x0237
        L_0x00f0:
            r19 = r7
            r10 = r20
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            r7 = r2
            if (r3 != 0) goto L_0x01c5
            int r0 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzj(r12, r4, r11)
            int r1 = r11.zza
            r7.putInt(r14, r8, r1)
            goto L_0x0237
        L_0x0107:
            r19 = r7
            r10 = r20
            r0 = 2
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            r7 = r2
            if (r3 != r0) goto L_0x01c5
            int r0 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zza(r12, r4, r11)
            java.lang.Object r1 = r11.zzc
            r7.putObject(r14, r8, r1)
            goto L_0x0237
        L_0x011f:
            r19 = r7
            r10 = r20
            r0 = 2
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            r7 = r2
            if (r3 != r0) goto L_0x01c5
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgb r0 = r15.zzE(r10)
            int r0 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzd(r0, r12, r4, r13, r11)
            java.lang.Object r1 = r7.getObject(r14, r8)
            if (r1 != 0) goto L_0x0141
            java.lang.Object r1 = r11.zzc
            r7.putObject(r14, r8, r1)
            goto L_0x0237
        L_0x0141:
            java.lang.Object r2 = r11.zzc
            java.lang.Object r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzel.zzg(r1, r2)
            r7.putObject(r14, r8, r1)
            goto L_0x0237
        L_0x014c:
            r19 = r7
            r10 = r20
            r0 = 2
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            r7 = r2
            if (r3 != r0) goto L_0x01c5
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r21 & r0
            if (r0 != 0) goto L_0x0164
            int r0 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzg(r12, r4, r11)
            goto L_0x0168
        L_0x0164:
            int r0 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzh(r12, r4, r11)
        L_0x0168:
            java.lang.Object r1 = r11.zzc
            r7.putObject(r14, r8, r1)
            goto L_0x0237
        L_0x016f:
            r19 = r7
            r10 = r20
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            r7 = r2
            if (r3 != 0) goto L_0x01c5
            int r0 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzm(r12, r4, r11)
            long r1 = r11.zzb
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0189
            r1 = 1
            goto L_0x018a
        L_0x0189:
            r1 = 0
        L_0x018a:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzm(r14, r8, r1)
            goto L_0x0237
        L_0x018f:
            r19 = r7
            r10 = r20
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            r7 = r2
            if (r3 != r0) goto L_0x01c5
            int r0 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzb(r12, r4)
            r7.putInt(r14, r8, r0)
            int r0 = r4 + 4
            goto L_0x0237
        L_0x01a6:
            r19 = r7
            r10 = r20
            r0 = 1
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            r7 = r2
            if (r3 != r0) goto L_0x01c5
            long r21 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzo(r12, r4)
            r0 = r7
            r1 = r31
            r2 = r8
            r8 = r4
            r4 = r21
            r0.putLong(r1, r2, r4)
            int r0 = r8 + 8
            goto L_0x0237
        L_0x01c5:
            r5 = r4
            goto L_0x0241
        L_0x01c8:
            r5 = r4
            r19 = r7
            r10 = r20
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            r7 = r2
            if (r3 != 0) goto L_0x0241
            int r0 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzj(r12, r5, r11)
            int r1 = r11.zza
            r7.putInt(r14, r8, r1)
            goto L_0x0237
        L_0x01e0:
            r5 = r4
            r19 = r7
            r10 = r20
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            r7 = r2
            if (r3 != 0) goto L_0x0241
            int r17 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzm(r12, r5, r11)
            long r4 = r11.zzb
            r0 = r7
            r1 = r31
            r2 = r8
            r0.putLong(r1, r2, r4)
            r6 = r6 | r23
            r9 = r7
            r2 = r10
            r0 = r17
            goto L_0x023b
        L_0x0201:
            r5 = r4
            r19 = r7
            r10 = r20
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            r7 = r2
            if (r3 != r0) goto L_0x0241
            int r0 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzb(r12, r5)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzp(r14, r8, r0)
            int r0 = r5 + 4
            goto L_0x0237
        L_0x021c:
            r5 = r4
            r19 = r7
            r10 = r20
            r0 = 1
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            r7 = r2
            if (r3 != r0) goto L_0x0241
            long r0 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzo(r12, r5)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzo(r14, r8, r0)
            int r0 = r5 + 8
        L_0x0237:
            r6 = r6 | r23
            r9 = r7
            r2 = r10
        L_0x023b:
            r7 = r19
            r1 = r20
            goto L_0x0374
        L_0x0241:
            r2 = r5
            r28 = r7
            r23 = r10
            r7 = r19
            r19 = -1
            goto L_0x0354
        L_0x024c:
            r20 = r33
            r5 = r4
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r2
            r29 = r19
            r19 = r7
            r7 = r29
            r0 = 27
            if (r10 != r0) goto L_0x02aa
            r0 = 2
            if (r3 != r0) goto L_0x029d
            java.lang.Object r0 = r7.getObject(r14, r8)
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzek r0 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzek) r0
            boolean r1 = r0.zzc()
            if (r1 != 0) goto L_0x027d
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0275
            r1 = 10
            goto L_0x0276
        L_0x0275:
            int r1 = r1 + r1
        L_0x0276:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzek r0 = r0.zzd(r1)
            r7.putObject(r14, r8, r0)
        L_0x027d:
            r8 = r0
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgb r0 = r15.zzE(r4)
            r1 = r17
            r2 = r32
            r3 = r5
            r23 = r4
            r4 = r34
            r5 = r8
            r8 = r6
            r6 = r35
            int r0 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zze(r0, r1, r2, r3, r4, r5, r6)
            r9 = r7
            r6 = r8
            r7 = r19
            r1 = r20
            r2 = r23
            goto L_0x0374
        L_0x029d:
            r23 = r4
            r15 = r5
            r26 = r6
            r28 = r7
            r27 = r19
            r19 = -1
            goto L_0x0331
        L_0x02aa:
            r23 = r4
            r0 = 49
            if (r10 > r0) goto L_0x02ff
            r1 = r21
            long r1 = (long) r1
            r0 = r30
            r21 = r1
            r1 = r31
            r2 = r32
            r4 = r3
            r3 = r5
            r33 = r4
            r4 = r34
            r15 = r5
            r5 = r17
            r26 = r6
            r6 = r20
            r27 = r19
            r19 = r7
            r7 = r33
            r24 = r8
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r23
            r18 = r10
            r28 = r19
            r19 = -1
            r9 = r21
            r11 = r18
            r12 = r24
            r14 = r35
            int r0 = r0.zzv(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x02fd
        L_0x02e9:
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r1 = r20
            r2 = r23
            r6 = r26
            r7 = r27
            goto L_0x0372
        L_0x02fd:
            r2 = r0
            goto L_0x0332
        L_0x02ff:
            r33 = r3
            r15 = r5
            r26 = r6
            r28 = r7
            r24 = r8
            r18 = r10
            r27 = r19
            r1 = r21
            r19 = -1
            r0 = 50
            r9 = r18
            if (r9 != r0) goto L_0x0337
            r7 = r33
            r0 = 2
            if (r7 != r0) goto L_0x0331
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r23
            r6 = r24
            r8 = r35
            int r0 = r0.zzs(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x02fd
            goto L_0x02e9
        L_0x0331:
            r2 = r15
        L_0x0332:
            r6 = r26
            r7 = r27
            goto L_0x0354
        L_0x0337:
            r7 = r33
            r0 = r30
            r8 = r1
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r17
            r6 = r20
            r10 = r24
            r12 = r23
            r13 = r35
            int r0 = r0.zzt(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x02fd
            goto L_0x02e9
        L_0x0354:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgq r4 = zzd(r31)
            r0 = r17
            r1 = r32
            r3 = r34
            r5 = r35
            int r0 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzi(r0, r1, r2, r3, r4, r5)
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r1 = r20
            r2 = r23
        L_0x0372:
            r9 = r28
        L_0x0374:
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r10 = -1
            goto L_0x001a
        L_0x037a:
            r26 = r6
            r28 = r9
            r1 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 == r1) goto L_0x038d
            long r1 = (long) r7
            r3 = r31
            r6 = r26
            r4 = r28
            r4.putInt(r3, r1, r6)
        L_0x038d:
            r1 = r34
            if (r0 != r1) goto L_0x0392
            return r0
        L_0x0392:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzen r0 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzen.zze()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfo.zzu(java.lang.Object, byte[], int, int, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzco):int");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x044f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01cf  */
    private final int zzv(java.lang.Object r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzco r29) throws java.io.IOException {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r2 = r20
            r6 = r22
            r8 = r23
            r9 = r27
            r7 = r29
            sun.misc.Unsafe r11 = zzb
            java.lang.Object r12 = r11.getObject(r1, r9)
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzek r12 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzek) r12
            boolean r13 = r12.zzc()
            if (r13 != 0) goto L_0x0032
            int r13 = r12.size()
            if (r13 != 0) goto L_0x002a
            r13 = 10
            goto L_0x002b
        L_0x002a:
            int r13 = r13 + r13
        L_0x002b:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzek r12 = r12.zzd(r13)
            r11.putObject(r1, r9, r12)
        L_0x0032:
            r9 = 5
            r10 = 0
            r13 = 1
            r14 = 2
            switch(r26) {
                case 18: goto L_0x03e1;
                case 19: goto L_0x0394;
                case 20: goto L_0x0351;
                case 21: goto L_0x0351;
                case 22: goto L_0x0336;
                case 23: goto L_0x02f5;
                case 24: goto L_0x02b4;
                case 25: goto L_0x025a;
                case 26: goto L_0x01a7;
                case 27: goto L_0x018c;
                case 28: goto L_0x0132;
                case 29: goto L_0x0336;
                case 30: goto L_0x00fa;
                case 31: goto L_0x02b4;
                case 32: goto L_0x02f5;
                case 33: goto L_0x00ab;
                case 34: goto L_0x005c;
                case 35: goto L_0x03e1;
                case 36: goto L_0x0394;
                case 37: goto L_0x0351;
                case 38: goto L_0x0351;
                case 39: goto L_0x0336;
                case 40: goto L_0x02f5;
                case 41: goto L_0x02b4;
                case 42: goto L_0x025a;
                case 43: goto L_0x0336;
                case 44: goto L_0x00fa;
                case 45: goto L_0x02b4;
                case 46: goto L_0x02f5;
                case 47: goto L_0x00ab;
                case 48: goto L_0x005c;
                default: goto L_0x003a;
            }
        L_0x003a:
            r1 = 3
            if (r6 != r1) goto L_0x044f
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgb r1 = r15.zzE(r8)
            r6 = r2 & -8
            r6 = r6 | 4
            r21 = r1
            r22 = r17
            r23 = r18
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzc(r21, r22, r23, r24, r25, r26)
            java.lang.Object r8 = r7.zzc
            r12.add(r8)
            goto L_0x042d
        L_0x005c:
            if (r6 != r14) goto L_0x0080
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfa r12 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfa) r12
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x0067:
            if (r1 >= r2) goto L_0x0077
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzm(r3, r1, r7)
            long r4 = r7.zzb
            long r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzde.zzc(r4)
            r12.zzf(r4)
            goto L_0x0067
        L_0x0077:
            if (r1 != r2) goto L_0x007b
            goto L_0x0450
        L_0x007b:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzen r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzen.zzg()
            throw r1
        L_0x0080:
            if (r6 != 0) goto L_0x044f
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfa r12 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfa) r12
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzm(r3, r4, r7)
            long r8 = r7.zzb
            long r8 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzde.zzc(r8)
            r12.zzf(r8)
        L_0x0091:
            if (r1 >= r5) goto L_0x00aa
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x009c
            goto L_0x00aa
        L_0x009c:
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzm(r3, r4, r7)
            long r8 = r7.zzb
            long r8 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzde.zzc(r8)
            r12.zzf(r8)
            goto L_0x0091
        L_0x00aa:
            return r1
        L_0x00ab:
            if (r6 != r14) goto L_0x00cf
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed r12 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed) r12
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x00b6:
            if (r1 >= r2) goto L_0x00c6
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzj(r3, r1, r7)
            int r4 = r7.zza
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzde.zzb(r4)
            r12.zzg(r4)
            goto L_0x00b6
        L_0x00c6:
            if (r1 != r2) goto L_0x00ca
            goto L_0x0450
        L_0x00ca:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzen r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzen.zzg()
            throw r1
        L_0x00cf:
            if (r6 != 0) goto L_0x044f
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed r12 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed) r12
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzj(r3, r4, r7)
            int r4 = r7.zza
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzde.zzb(r4)
            r12.zzg(r4)
        L_0x00e0:
            if (r1 >= r5) goto L_0x00f9
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x00eb
            goto L_0x00f9
        L_0x00eb:
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzj(r3, r4, r7)
            int r4 = r7.zza
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzde.zzb(r4)
            r12.zzg(r4)
            goto L_0x00e0
        L_0x00f9:
            return r1
        L_0x00fa:
            if (r6 != r14) goto L_0x0101
            int r2 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzf(r3, r4, r12, r7)
            goto L_0x0112
        L_0x0101:
            if (r6 != 0) goto L_0x044f
            r2 = r20
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r12
            r7 = r29
            int r2 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzl(r2, r3, r4, r5, r6, r7)
        L_0x0112:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec r1 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec) r1
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgq r3 = r1.zzc
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgq r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgq.zzc()
            if (r3 != r4) goto L_0x011d
            r3 = 0
        L_0x011d:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeg r4 = r15.zzD(r8)
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgp r5 = r0.zzn
            r6 = r21
            java.lang.Object r3 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzC(r6, r12, r4, r3, r5)
            if (r3 != 0) goto L_0x012d
            goto L_0x027b
        L_0x012d:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgq r3 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgq) r3
            r1.zzc = r3
            return r2
        L_0x0132:
            if (r6 != r14) goto L_0x044f
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzj(r3, r4, r7)
            int r4 = r7.zza
            if (r4 < 0) goto L_0x0187
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0182
            if (r4 != 0) goto L_0x0148
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb.zzb
            r12.add(r4)
            goto L_0x0150
        L_0x0148:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb.zzr(r3, r1, r4)
            r12.add(r6)
        L_0x014f:
            int r1 = r1 + r4
        L_0x0150:
            if (r1 >= r5) goto L_0x0181
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x015b
            goto L_0x0181
        L_0x015b:
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzj(r3, r4, r7)
            int r4 = r7.zza
            if (r4 < 0) goto L_0x017c
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0177
            if (r4 != 0) goto L_0x016f
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb.zzb
            r12.add(r4)
            goto L_0x0150
        L_0x016f:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb.zzr(r3, r1, r4)
            r12.add(r6)
            goto L_0x014f
        L_0x0177:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzen r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzen.zzg()
            throw r1
        L_0x017c:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzen r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzen.zzd()
            throw r1
        L_0x0181:
            return r1
        L_0x0182:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzen r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzen.zzg()
            throw r1
        L_0x0187:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzen r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzen.zzd()
            throw r1
        L_0x018c:
            if (r6 == r14) goto L_0x0190
            goto L_0x044f
        L_0x0190:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgb r1 = r15.zzE(r8)
            r21 = r1
            r22 = r20
            r23 = r17
            r24 = r18
            r25 = r19
            r26 = r12
            r27 = r29
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zze(r21, r22, r23, r24, r25, r26, r27)
            return r1
        L_0x01a7:
            if (r6 != r14) goto L_0x044f
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r24 & r8
            java.lang.String r1 = ""
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 != 0) goto L_0x01fa
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzj(r3, r4, r7)
            int r6 = r7.zza
            if (r6 < 0) goto L_0x01f5
            if (r6 != 0) goto L_0x01c2
            r12.add(r1)
            goto L_0x01cd
        L_0x01c2:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzel.zzb
            r8.<init>(r3, r4, r6, r9)
            r12.add(r8)
        L_0x01cc:
            int r4 = r4 + r6
        L_0x01cd:
            if (r4 >= r5) goto L_0x044f
            int r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzj(r3, r4, r7)
            int r8 = r7.zza
            if (r2 != r8) goto L_0x044f
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzj(r3, r6, r7)
            int r6 = r7.zza
            if (r6 < 0) goto L_0x01f0
            if (r6 != 0) goto L_0x01e5
            r12.add(r1)
            goto L_0x01cd
        L_0x01e5:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzel.zzb
            r8.<init>(r3, r4, r6, r9)
            r12.add(r8)
            goto L_0x01cc
        L_0x01f0:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzen r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzen.zzd()
            throw r1
        L_0x01f5:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzen r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzen.zzd()
            throw r1
        L_0x01fa:
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzj(r3, r4, r7)
            int r6 = r7.zza
            if (r6 < 0) goto L_0x0255
            if (r6 != 0) goto L_0x0208
            r12.add(r1)
            goto L_0x021b
        L_0x0208:
            int r8 = r4 + r6
            boolean r9 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhe.zzi(r3, r4, r8)
            if (r9 == 0) goto L_0x0250
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzel.zzb
            r9.<init>(r3, r4, r6, r10)
            r12.add(r9)
        L_0x021a:
            r4 = r8
        L_0x021b:
            if (r4 >= r5) goto L_0x044f
            int r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzj(r3, r4, r7)
            int r8 = r7.zza
            if (r2 != r8) goto L_0x044f
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzj(r3, r6, r7)
            int r6 = r7.zza
            if (r6 < 0) goto L_0x024b
            if (r6 != 0) goto L_0x0233
            r12.add(r1)
            goto L_0x021b
        L_0x0233:
            int r8 = r4 + r6
            boolean r9 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhe.zzi(r3, r4, r8)
            if (r9 == 0) goto L_0x0246
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzel.zzb
            r9.<init>(r3, r4, r6, r10)
            r12.add(r9)
            goto L_0x021a
        L_0x0246:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzen r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzen.zzc()
            throw r1
        L_0x024b:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzen r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzen.zzd()
            throw r1
        L_0x0250:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzen r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzen.zzc()
            throw r1
        L_0x0255:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzen r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzen.zzd()
            throw r1
        L_0x025a:
            r1 = 0
            if (r6 != r14) goto L_0x0283
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcq r12 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcq) r12
            int r2 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzj(r3, r4, r7)
            int r4 = r7.zza
            int r4 = r4 + r2
        L_0x0266:
            if (r2 >= r4) goto L_0x0279
            int r2 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzm(r3, r2, r7)
            long r5 = r7.zzb
            int r8 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x0274
            r5 = 1
            goto L_0x0275
        L_0x0274:
            r5 = 0
        L_0x0275:
            r12.zze(r5)
            goto L_0x0266
        L_0x0279:
            if (r2 != r4) goto L_0x027e
        L_0x027b:
            r1 = r2
            goto L_0x0450
        L_0x027e:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzen r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzen.zzg()
            throw r1
        L_0x0283:
            if (r6 != 0) goto L_0x044f
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcq r12 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcq) r12
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzm(r3, r4, r7)
            long r8 = r7.zzb
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x0293
            r6 = 1
            goto L_0x0294
        L_0x0293:
            r6 = 0
        L_0x0294:
            r12.zze(r6)
        L_0x0297:
            if (r4 >= r5) goto L_0x02b3
            int r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzj(r3, r4, r7)
            int r8 = r7.zza
            if (r2 == r8) goto L_0x02a2
            goto L_0x02b3
        L_0x02a2:
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzm(r3, r6, r7)
            long r8 = r7.zzb
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x02ae
            r6 = 1
            goto L_0x02af
        L_0x02ae:
            r6 = 0
        L_0x02af:
            r12.zze(r6)
            goto L_0x0297
        L_0x02b3:
            return r4
        L_0x02b4:
            if (r6 != r14) goto L_0x02d4
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed r12 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed) r12
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x02bf:
            if (r1 >= r2) goto L_0x02cb
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzb(r3, r1)
            r12.zzg(r4)
            int r1 = r1 + 4
            goto L_0x02bf
        L_0x02cb:
            if (r1 != r2) goto L_0x02cf
            goto L_0x0450
        L_0x02cf:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzen r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzen.zzg()
            throw r1
        L_0x02d4:
            if (r6 != r9) goto L_0x044f
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed r12 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed) r12
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzb(r17, r18)
            r12.zzg(r1)
        L_0x02df:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x02f4
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x02ec
            goto L_0x02f4
        L_0x02ec:
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzb(r3, r4)
            r12.zzg(r1)
            goto L_0x02df
        L_0x02f4:
            return r1
        L_0x02f5:
            if (r6 != r14) goto L_0x0315
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfa r12 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfa) r12
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x0300:
            if (r1 >= r2) goto L_0x030c
            long r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzo(r3, r1)
            r12.zzf(r4)
            int r1 = r1 + 8
            goto L_0x0300
        L_0x030c:
            if (r1 != r2) goto L_0x0310
            goto L_0x0450
        L_0x0310:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzen r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzen.zzg()
            throw r1
        L_0x0315:
            if (r6 != r13) goto L_0x044f
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfa r12 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfa) r12
            long r8 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzo(r17, r18)
            r12.zzf(r8)
        L_0x0320:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0335
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x032d
            goto L_0x0335
        L_0x032d:
            long r8 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzo(r3, r4)
            r12.zzf(r8)
            goto L_0x0320
        L_0x0335:
            return r1
        L_0x0336:
            if (r6 != r14) goto L_0x033e
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzf(r3, r4, r12, r7)
            goto L_0x0450
        L_0x033e:
            if (r6 == 0) goto L_0x0342
            goto L_0x044f
        L_0x0342:
            r21 = r17
            r22 = r18
            r23 = r19
            r24 = r12
            r25 = r29
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzl(r20, r21, r22, r23, r24, r25)
            return r1
        L_0x0351:
            if (r6 != r14) goto L_0x0371
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfa r12 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfa) r12
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x035c:
            if (r1 >= r2) goto L_0x0368
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzm(r3, r1, r7)
            long r4 = r7.zzb
            r12.zzf(r4)
            goto L_0x035c
        L_0x0368:
            if (r1 != r2) goto L_0x036c
            goto L_0x0450
        L_0x036c:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzen r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzen.zzg()
            throw r1
        L_0x0371:
            if (r6 != 0) goto L_0x044f
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfa r12 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfa) r12
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzm(r3, r4, r7)
            long r8 = r7.zzb
            r12.zzf(r8)
        L_0x037e:
            if (r1 >= r5) goto L_0x0393
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x0389
            goto L_0x0393
        L_0x0389:
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzm(r3, r4, r7)
            long r8 = r7.zzb
            r12.zzf(r8)
            goto L_0x037e
        L_0x0393:
            return r1
        L_0x0394:
            if (r6 != r14) goto L_0x03b8
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdu r12 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdu) r12
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x039f:
            if (r1 >= r2) goto L_0x03af
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzb(r3, r1)
            float r4 = java.lang.Float.intBitsToFloat(r4)
            r12.zzg(r4)
            int r1 = r1 + 4
            goto L_0x039f
        L_0x03af:
            if (r1 != r2) goto L_0x03b3
            goto L_0x0450
        L_0x03b3:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzen r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzen.zzg()
            throw r1
        L_0x03b8:
            if (r6 != r9) goto L_0x044f
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdu r12 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdu) r12
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzb(r17, r18)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r12.zzg(r1)
        L_0x03c7:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x03e0
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x03d4
            goto L_0x03e0
        L_0x03d4:
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzb(r3, r4)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r12.zzg(r1)
            goto L_0x03c7
        L_0x03e0:
            return r1
        L_0x03e1:
            if (r6 != r14) goto L_0x0404
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdk r12 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdk) r12
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x03ec:
            if (r1 >= r2) goto L_0x03fc
            long r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzo(r3, r1)
            double r4 = java.lang.Double.longBitsToDouble(r4)
            r12.zze(r4)
            int r1 = r1 + 8
            goto L_0x03ec
        L_0x03fc:
            if (r1 != r2) goto L_0x03ff
            goto L_0x0450
        L_0x03ff:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzen r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzen.zzg()
            throw r1
        L_0x0404:
            if (r6 != r13) goto L_0x044f
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdk r12 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdk) r12
            long r8 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzo(r17, r18)
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r12.zze(r8)
        L_0x0413:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x042c
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x0420
            goto L_0x042c
        L_0x0420:
            long r8 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzo(r3, r4)
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r12.zze(r8)
            goto L_0x0413
        L_0x042c:
            return r1
        L_0x042d:
            if (r4 >= r5) goto L_0x044e
            int r8 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzj(r3, r4, r7)
            int r9 = r7.zza
            if (r2 == r9) goto L_0x0438
            goto L_0x044e
        L_0x0438:
            r21 = r1
            r22 = r17
            r23 = r8
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzc(r21, r22, r23, r24, r25, r26)
            java.lang.Object r8 = r7.zzc
            r12.add(r8)
            goto L_0x042d
        L_0x044e:
            return r4
        L_0x044f:
            r1 = r4
        L_0x0450:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfo.zzv(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzco):int");
    }

    private final int zzw(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzz(i, 0);
    }

    private final int zzx(int i, int i2) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzz(i, i2);
    }

    private final int zzy(int i) {
        return this.zzc[i + 2];
    }

    private final int zzz(int i, int i2) {
        int length = (this.zzc.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zzc[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    public final int zza(Object obj) {
        return this.zzi ? zzq(obj) : zzp(obj);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01bf, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01f3, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0224, code lost:
        r2 = r3 + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0226, code lost:
        r1 = r1 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzb(java.lang.Object r9) {
        /*
            r8 = this;
            int[] r0 = r8.zzc
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x022a
            int r3 = r8.zzB(r1)
            int[] r4 = r8.zzc
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            long r5 = (long) r5
            int r3 = zzA(r3)
            r7 = 37
            switch(r3) {
                case 0: goto L_0x0216;
                case 1: goto L_0x020b;
                case 2: goto L_0x0200;
                case 3: goto L_0x01f5;
                case 4: goto L_0x01ed;
                case 5: goto L_0x01e2;
                case 6: goto L_0x01db;
                case 7: goto L_0x01d0;
                case 8: goto L_0x01c3;
                case 9: goto L_0x01b5;
                case 10: goto L_0x01a9;
                case 11: goto L_0x01a2;
                case 12: goto L_0x019b;
                case 13: goto L_0x0194;
                case 14: goto L_0x0188;
                case 15: goto L_0x0180;
                case 16: goto L_0x0174;
                case 17: goto L_0x0169;
                case 18: goto L_0x015d;
                case 19: goto L_0x015d;
                case 20: goto L_0x015d;
                case 21: goto L_0x015d;
                case 22: goto L_0x015d;
                case 23: goto L_0x015d;
                case 24: goto L_0x015d;
                case 25: goto L_0x015d;
                case 26: goto L_0x015d;
                case 27: goto L_0x015d;
                case 28: goto L_0x015d;
                case 29: goto L_0x015d;
                case 30: goto L_0x015d;
                case 31: goto L_0x015d;
                case 32: goto L_0x015d;
                case 33: goto L_0x015d;
                case 34: goto L_0x015d;
                case 35: goto L_0x015d;
                case 36: goto L_0x015d;
                case 37: goto L_0x015d;
                case 38: goto L_0x015d;
                case 39: goto L_0x015d;
                case 40: goto L_0x015d;
                case 41: goto L_0x015d;
                case 42: goto L_0x015d;
                case 43: goto L_0x015d;
                case 44: goto L_0x015d;
                case 45: goto L_0x015d;
                case 46: goto L_0x015d;
                case 47: goto L_0x015d;
                case 48: goto L_0x015d;
                case 49: goto L_0x015d;
                case 50: goto L_0x0151;
                case 51: goto L_0x013b;
                case 52: goto L_0x0129;
                case 53: goto L_0x0117;
                case 54: goto L_0x0105;
                case 55: goto L_0x00f7;
                case 56: goto L_0x00e5;
                case 57: goto L_0x00d7;
                case 58: goto L_0x00c5;
                case 59: goto L_0x00b1;
                case 60: goto L_0x009f;
                case 61: goto L_0x008d;
                case 62: goto L_0x007f;
                case 63: goto L_0x0071;
                case 64: goto L_0x0063;
                case 65: goto L_0x0051;
                case 66: goto L_0x0043;
                case 67: goto L_0x0031;
                case 68: goto L_0x001f;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x0226
        L_0x001f:
            boolean r3 = r8.zzP(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0224
        L_0x0031:
            boolean r3 = r8.zzP(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = zzC(r9, r5)
            int r3 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzel.zzc(r3)
            goto L_0x0224
        L_0x0043:
            boolean r3 = r8.zzP(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = zzr(r9, r5)
            goto L_0x01f3
        L_0x0051:
            boolean r3 = r8.zzP(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = zzC(r9, r5)
            int r3 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzel.zzc(r3)
            goto L_0x0224
        L_0x0063:
            boolean r3 = r8.zzP(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = zzr(r9, r5)
            goto L_0x01f3
        L_0x0071:
            boolean r3 = r8.zzP(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = zzr(r9, r5)
            goto L_0x01f3
        L_0x007f:
            boolean r3 = r8.zzP(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = zzr(r9, r5)
            goto L_0x01f3
        L_0x008d:
            boolean r3 = r8.zzP(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0224
        L_0x009f:
            boolean r3 = r8.zzP(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0224
        L_0x00b1:
            boolean r3 = r8.zzP(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0224
        L_0x00c5:
            boolean r3 = r8.zzP(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            boolean r3 = zzQ(r9, r5)
            int r3 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzel.zza(r3)
            goto L_0x0224
        L_0x00d7:
            boolean r3 = r8.zzP(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = zzr(r9, r5)
            goto L_0x01f3
        L_0x00e5:
            boolean r3 = r8.zzP(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = zzC(r9, r5)
            int r3 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzel.zzc(r3)
            goto L_0x0224
        L_0x00f7:
            boolean r3 = r8.zzP(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = zzr(r9, r5)
            goto L_0x01f3
        L_0x0105:
            boolean r3 = r8.zzP(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = zzC(r9, r5)
            int r3 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzel.zzc(r3)
            goto L_0x0224
        L_0x0117:
            boolean r3 = r8.zzP(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = zzC(r9, r5)
            int r3 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzel.zzc(r3)
            goto L_0x0224
        L_0x0129:
            boolean r3 = r8.zzP(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            float r3 = zzo(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0224
        L_0x013b:
            boolean r3 = r8.zzP(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            double r3 = zzn(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzel.zzc(r3)
            goto L_0x0224
        L_0x0151:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0224
        L_0x015d:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0224
        L_0x0169:
            java.lang.Object r3 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r9, r5)
            if (r3 == 0) goto L_0x01bf
            int r7 = r3.hashCode()
            goto L_0x01bf
        L_0x0174:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzd(r9, r5)
            int r3 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzel.zzc(r3)
            goto L_0x0224
        L_0x0180:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzc(r9, r5)
            goto L_0x01f3
        L_0x0188:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzd(r9, r5)
            int r3 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzel.zzc(r3)
            goto L_0x0224
        L_0x0194:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzc(r9, r5)
            goto L_0x01f3
        L_0x019b:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzc(r9, r5)
            goto L_0x01f3
        L_0x01a2:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzc(r9, r5)
            goto L_0x01f3
        L_0x01a9:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0224
        L_0x01b5:
            java.lang.Object r3 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r9, r5)
            if (r3 == 0) goto L_0x01bf
            int r7 = r3.hashCode()
        L_0x01bf:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0226
        L_0x01c3:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0224
        L_0x01d0:
            int r2 = r2 * 53
            boolean r3 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzw(r9, r5)
            int r3 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzel.zza(r3)
            goto L_0x0224
        L_0x01db:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzc(r9, r5)
            goto L_0x01f3
        L_0x01e2:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzd(r9, r5)
            int r3 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzel.zzc(r3)
            goto L_0x0224
        L_0x01ed:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzc(r9, r5)
        L_0x01f3:
            int r2 = r2 + r3
            goto L_0x0226
        L_0x01f5:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzd(r9, r5)
            int r3 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzel.zzc(r3)
            goto L_0x0224
        L_0x0200:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzd(r9, r5)
            int r3 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzel.zzc(r3)
            goto L_0x0224
        L_0x020b:
            int r2 = r2 * 53
            float r3 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzb(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0224
        L_0x0216:
            int r2 = r2 * 53
            double r3 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zza(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzel.zzc(r3)
        L_0x0224:
            int r3 = r3 + r2
            r2 = r3
        L_0x0226:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x022a:
            int r2 = r2 * 53
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgp r0 = r8.zzn
            java.lang.Object r0 = r0.zzc(r9)
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            boolean r1 = r8.zzh
            if (r1 == 0) goto L_0x024a
            int r0 = r0 * 53
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdo r1 = r8.zzo
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzds r9 = r1.zzb(r9)
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgl r9 = r9.zza
            int r9 = r9.hashCode()
            int r0 = r0 + r9
        L_0x024a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfo.zzb(java.lang.Object):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v51, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v58, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v67, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v33, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v83, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v38, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v36, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v37, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v38, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v39, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v40, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v45, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v42, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v46, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v43, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v44, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v45, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v50, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v46, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v47, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v125, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v30, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02d4, code lost:
        r3 = r11;
        r2 = r23;
        r1 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02db, code lost:
        r22 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02f0, code lost:
        r0 = r37;
        r26 = r6;
        r30 = r10;
        r28 = r11;
        r2 = r22;
        r7 = r25;
        r18 = true;
        r6 = r35;
        r35 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x03ae, code lost:
        if (r0 != r15) goto L_0x03b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x03ca, code lost:
        r2 = r0;
        r7 = r25;
        r6 = r27;
        r0 = r37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x03fb, code lost:
        if (r0 != r15) goto L_0x03b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x041c, code lost:
        if (r0 != r15) goto L_0x03b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x04ac, code lost:
        r35 = r6;
        r0 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x04c3, code lost:
        r6 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0584, code lost:
        r2 = r2 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0599, code lost:
        r2 = r2 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x059b, code lost:
        r0 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x059d, code lost:
        r1 = r12.zzd;
        r3 = r1.zzc;
        r1 = r1.zzb.ordinal();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x05a9, code lost:
        if (r1 == 9) goto L_0x05b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x05ad, code lost:
        if (r1 == 10) goto L_0x05b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x05b0, code lost:
        r1 = r14.zze(r12.zzd);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x05b6, code lost:
        if (r1 == null) goto L_0x05bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x05b8, code lost:
        r0 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzel.zzg(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x05bc, code lost:
        r14.zzi(r12.zzd, r0);
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0169, code lost:
        r5 = r6 | r26;
        r6 = r35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x016d, code lost:
        r3 = r8;
        r2 = r11;
        r1 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0170, code lost:
        r13 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01ad, code lost:
        r22 = r1;
        r23 = r11;
        r25 = r13;
        r11 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0216, code lost:
        r5 = r6 | r26;
        r6 = r35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x021a, code lost:
        r1 = r13;
        r13 = r2;
        r2 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x021f, code lost:
        r22 = r1;
        r23 = r11;
        r25 = r13;
        r11 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x02af, code lost:
        r22 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02cc, code lost:
        r0 = r13 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02ce, code lost:
        r5 = r6 | r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02d0, code lost:
        r6 = r35;
        r13 = r36;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzc(java.lang.Object r33, byte[] r34, int r35, int r36, int r37, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzco r38) throws java.io.IOException {
        /*
            r32 = this;
            r15 = r32
            r14 = r33
            r12 = r34
            r13 = r36
            r11 = r37
            r9 = r38
            sun.misc.Unsafe r10 = zzb
            r16 = 0
            r0 = r35
            r1 = 0
            r2 = -1
            r3 = 0
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
        L_0x0019:
            r17 = 0
            if (r0 >= r13) goto L_0x05fd
            int r1 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002c
            int r0 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzk(r0, r12, r1, r9)
            int r1 = r9.zza
            r4 = r1
            r1 = r0
            goto L_0x002d
        L_0x002c:
            r4 = r0
        L_0x002d:
            int r0 = r4 >>> 3
            r7 = r4 & 7
            r8 = 3
            if (r0 <= r2) goto L_0x003a
            int r3 = r3 / r8
            int r2 = r15.zzx(r0, r3)
            goto L_0x003e
        L_0x003a:
            int r2 = r15.zzw(r0)
        L_0x003e:
            r20 = 0
            r8 = -1
            if (r2 != r8) goto L_0x0054
            r35 = r0
            r2 = r1
            r7 = r4
            r26 = r5
            r30 = r10
            r0 = r11
            r18 = 1
            r24 = -1
            r28 = 0
            goto L_0x041f
        L_0x0054:
            int[] r3 = r15.zzc
            int r23 = r2 + 1
            r8 = r3[r23]
            int r11 = zzA(r8)
            r18 = r0
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r8 & r13
            long r13 = (long) r0
            r0 = 17
            r25 = r4
            if (r11 > r0) goto L_0x0306
            int r0 = r2 + 2
            r0 = r3[r0]
            int r3 = r0 >>> 20
            r22 = 1
            int r26 = r22 << r3
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r3
            if (r0 == r6) goto L_0x0092
            if (r6 == r3) goto L_0x0087
            long r3 = (long) r6
            r28 = r13
            r14 = r33
            r10.putInt(r14, r3, r5)
            goto L_0x008b
        L_0x0087:
            r28 = r13
            r14 = r33
        L_0x008b:
            long r3 = (long) r0
            int r5 = r10.getInt(r14, r3)
            r13 = r0
            goto L_0x0097
        L_0x0092:
            r28 = r13
            r14 = r33
            r13 = r6
        L_0x0097:
            r6 = r5
            r0 = 5
            switch(r11) {
                case 0: goto L_0x02b3;
                case 1: goto L_0x0294;
                case 2: goto L_0x026e;
                case 3: goto L_0x026e;
                case 4: goto L_0x0256;
                case 5: goto L_0x0228;
                case 6: goto L_0x01fd;
                case 7: goto L_0x01dc;
                case 8: goto L_0x01b7;
                case 9: goto L_0x0174;
                case 10: goto L_0x0151;
                case 11: goto L_0x0256;
                case 12: goto L_0x0119;
                case 13: goto L_0x01fd;
                case 14: goto L_0x0228;
                case 15: goto L_0x00fd;
                case 16: goto L_0x00cb;
                default: goto L_0x009c;
            }
        L_0x009c:
            r11 = r2
            r35 = r13
            r23 = r18
            r4 = r28
            r0 = 3
            r3 = 1
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r13 = r1
            if (r7 != r0) goto L_0x02db
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgb r0 = r15.zzE(r11)
            int r1 = r23 << 3
            r7 = r1 | 4
            r1 = r34
            r2 = r13
            r3 = r36
            r12 = r4
            r4 = r7
            r5 = r38
            int r0 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzc(r0, r1, r2, r3, r4, r5)
            r1 = r6 & r26
            if (r1 != 0) goto L_0x02de
            java.lang.Object r1 = r9.zzc
            r10.putObject(r14, r12, r1)
            goto L_0x02eb
        L_0x00cb:
            if (r7 != 0) goto L_0x00f0
            int r7 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzm(r12, r1, r9)
            long r0 = r9.zzb
            long r4 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzde.zzc(r0)
            r11 = r18
            r0 = r10
            r1 = r33
            r8 = r2
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r28
            r35 = r13
            r13 = r25
            r0.putLong(r1, r2, r4)
            r5 = r6 | r26
            r6 = r35
            r0 = r7
            goto L_0x016d
        L_0x00f0:
            r35 = r13
            r22 = r1
            r11 = r2
            r23 = r18
            r3 = 1
            r18 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x02f0
        L_0x00fd:
            r8 = r2
            r35 = r13
            r11 = r18
            r13 = r25
            r18 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != 0) goto L_0x01ad
            int r0 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzj(r12, r1, r9)
            int r1 = r9.zza
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzde.zzb(r1)
            r4 = r28
            r10.putInt(r14, r4, r1)
            goto L_0x0169
        L_0x0119:
            r8 = r2
            r35 = r13
            r11 = r18
            r13 = r25
            r4 = r28
            r18 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != 0) goto L_0x01ad
            int r0 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzj(r12, r1, r9)
            int r1 = r9.zza
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeg r2 = r15.zzD(r8)
            if (r2 == 0) goto L_0x014d
            boolean r2 = r2.zza(r1)
            if (r2 == 0) goto L_0x013a
            goto L_0x014d
        L_0x013a:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgq r2 = zzd(r33)
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.zzh(r13, r1)
            r5 = r6
            r3 = r8
            r2 = r11
            r1 = r13
            r6 = r35
            goto L_0x0170
        L_0x014d:
            r10.putInt(r14, r4, r1)
            goto L_0x0169
        L_0x0151:
            r8 = r2
            r35 = r13
            r11 = r18
            r13 = r25
            r4 = r28
            r0 = 2
            r18 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r0) goto L_0x01ad
            int r0 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zza(r12, r1, r9)
            java.lang.Object r1 = r9.zzc
            r10.putObject(r14, r4, r1)
        L_0x0169:
            r5 = r6 | r26
            r6 = r35
        L_0x016d:
            r3 = r8
            r2 = r11
            r1 = r13
        L_0x0170:
            r13 = r36
            goto L_0x035e
        L_0x0174:
            r8 = r2
            r35 = r13
            r11 = r18
            r13 = r25
            r4 = r28
            r0 = 2
            r18 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r0) goto L_0x01ab
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgb r0 = r15.zzE(r8)
            r2 = r36
            int r0 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzd(r0, r12, r1, r2, r9)
            r1 = r6 & r26
            if (r1 != 0) goto L_0x0197
            java.lang.Object r1 = r9.zzc
            r10.putObject(r14, r4, r1)
            goto L_0x01a4
        L_0x0197:
            java.lang.Object r1 = r10.getObject(r14, r4)
            java.lang.Object r3 = r9.zzc
            java.lang.Object r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzel.zzg(r1, r3)
            r10.putObject(r14, r4, r1)
        L_0x01a4:
            r5 = r6 | r26
            r6 = r35
            r3 = r8
            goto L_0x021a
        L_0x01ab:
            r2 = r36
        L_0x01ad:
            r22 = r1
            r23 = r11
            r25 = r13
            r3 = 1
            r11 = r8
            goto L_0x02f0
        L_0x01b7:
            r3 = r2
            r35 = r13
            r11 = r18
            r13 = r25
            r4 = r28
            r0 = 2
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r36
            if (r7 != r0) goto L_0x021f
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r8
            if (r0 != 0) goto L_0x01d2
            int r0 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzg(r12, r1, r9)
            goto L_0x01d6
        L_0x01d2:
            int r0 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzh(r12, r1, r9)
        L_0x01d6:
            java.lang.Object r1 = r9.zzc
            r10.putObject(r14, r4, r1)
            goto L_0x0216
        L_0x01dc:
            r3 = r2
            r35 = r13
            r11 = r18
            r13 = r25
            r4 = r28
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r36
            if (r7 != 0) goto L_0x021f
            int r0 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzm(r12, r1, r9)
            long r7 = r9.zzb
            int r1 = (r7 > r20 ? 1 : (r7 == r20 ? 0 : -1))
            if (r1 == 0) goto L_0x01f8
            r8 = 1
            goto L_0x01f9
        L_0x01f8:
            r8 = 0
        L_0x01f9:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzm(r14, r4, r8)
            goto L_0x0216
        L_0x01fd:
            r3 = r2
            r35 = r13
            r11 = r18
            r13 = r25
            r4 = r28
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r36
            if (r7 != r0) goto L_0x021f
            int r0 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzb(r12, r1)
            r10.putInt(r14, r4, r0)
            int r0 = r1 + 4
        L_0x0216:
            r5 = r6 | r26
            r6 = r35
        L_0x021a:
            r1 = r13
            r13 = r2
            r2 = r11
            goto L_0x035e
        L_0x021f:
            r22 = r1
            r23 = r11
            r25 = r13
            r11 = r3
            goto L_0x02b1
        L_0x0228:
            r3 = r2
            r35 = r13
            r11 = r18
            r13 = r25
            r4 = r28
            r0 = 1
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r36
            if (r7 != r0) goto L_0x024d
            long r7 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzo(r12, r1)
            r0 = r10
            r25 = r13
            r13 = r1
            r1 = r33
            r23 = r11
            r11 = r3
            r2 = r4
            r4 = r7
            r0.putLong(r1, r2, r4)
            goto L_0x02cc
        L_0x024d:
            r23 = r11
            r25 = r13
            r11 = r3
            r22 = r1
            goto L_0x02b1
        L_0x0256:
            r11 = r2
            r35 = r13
            r23 = r18
            r4 = r28
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r13 = r1
            if (r7 != 0) goto L_0x02af
            int r0 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzj(r12, r13, r9)
            int r1 = r9.zza
            r10.putInt(r14, r4, r1)
            goto L_0x02ce
        L_0x026e:
            r11 = r2
            r35 = r13
            r23 = r18
            r4 = r28
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r13 = r1
            if (r7 != 0) goto L_0x02af
            int r7 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzm(r12, r13, r9)
            long r2 = r9.zzb
            r0 = r10
            r1 = r33
            r19 = r2
            r2 = r4
            r4 = r19
            r0.putLong(r1, r2, r4)
            r5 = r6 | r26
            r6 = r35
            r13 = r36
            r0 = r7
            goto L_0x02d4
        L_0x0294:
            r11 = r2
            r35 = r13
            r23 = r18
            r4 = r28
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r13 = r1
            if (r7 != r0) goto L_0x02af
            int r0 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzb(r12, r13)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzp(r14, r4, r0)
            int r0 = r13 + 4
            goto L_0x02ce
        L_0x02af:
            r22 = r13
        L_0x02b1:
            r3 = 1
            goto L_0x02f0
        L_0x02b3:
            r11 = r2
            r35 = r13
            r23 = r18
            r4 = r28
            r3 = 1
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r13 = r1
            if (r7 != r3) goto L_0x02db
            long r0 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzo(r12, r13)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzo(r14, r4, r0)
        L_0x02cc:
            int r0 = r13 + 8
        L_0x02ce:
            r5 = r6 | r26
        L_0x02d0:
            r6 = r35
            r13 = r36
        L_0x02d4:
            r3 = r11
            r2 = r23
            r1 = r25
            goto L_0x035e
        L_0x02db:
            r22 = r13
            goto L_0x02f0
        L_0x02de:
            java.lang.Object r1 = r10.getObject(r14, r12)
            java.lang.Object r2 = r9.zzc
            java.lang.Object r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzel.zzg(r1, r2)
            r10.putObject(r14, r12, r1)
        L_0x02eb:
            r5 = r6 | r26
            r12 = r34
            goto L_0x02d0
        L_0x02f0:
            r0 = r37
            r26 = r6
            r30 = r10
            r28 = r11
            r2 = r22
            r7 = r25
            r18 = 1
            r24 = -1
            r6 = r35
            r35 = r23
            goto L_0x041f
        L_0x0306:
            r22 = r1
            r12 = r13
            r4 = r18
            r3 = 1
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r14 = r33
            r31 = r11
            r11 = r2
            r2 = r31
            r0 = 27
            if (r2 != r0) goto L_0x0374
            r0 = 2
            if (r7 != r0) goto L_0x0362
            java.lang.Object r0 = r10.getObject(r14, r12)
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzek r0 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzek) r0
            boolean r1 = r0.zzc()
            if (r1 != 0) goto L_0x033b
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0332
            r3 = 10
            goto L_0x0334
        L_0x0332:
            int r3 = r1 + r1
        L_0x0334:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzek r0 = r0.zzd(r3)
            r10.putObject(r14, r12, r0)
        L_0x033b:
            r7 = r0
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgb r0 = r15.zzE(r11)
            r1 = r25
            r2 = r34
            r3 = r22
            r8 = r4
            r4 = r36
            r26 = r5
            r5 = r7
            r27 = r6
            r6 = r38
            int r0 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zze(r0, r1, r2, r3, r4, r5, r6)
            r12 = r34
            r13 = r36
            r2 = r8
            r3 = r11
            r5 = r26
            r6 = r27
        L_0x035e:
            r11 = r37
            goto L_0x0019
        L_0x0362:
            r26 = r5
            r27 = r6
            r35 = r4
            r30 = r10
            r28 = r11
            r15 = r22
            r18 = 1
            r24 = -1
            goto L_0x03fe
        L_0x0374:
            r26 = r5
            r27 = r6
            r5 = r4
            r0 = 49
            if (r2 > r0) goto L_0x03d2
            long r0 = (long) r8
            r28 = r0
            r0 = r32
            r1 = r33
            r8 = r2
            r2 = r34
            r6 = 10
            r19 = 1
            r3 = r22
            r4 = r36
            r35 = r5
            r5 = r25
            r6 = r35
            r19 = r8
            r18 = 1
            r24 = -1
            r8 = r11
            r30 = r10
            r9 = r28
            r15 = r37
            r28 = r11
            r11 = r19
            r15 = r22
            r14 = r38
            int r0 = r0.zzv(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x03ca
        L_0x03b0:
            r15 = r32
            r14 = r33
            r12 = r34
            r2 = r35
            r13 = r36
            r11 = r37
            r9 = r38
            r1 = r25
            r5 = r26
            r6 = r27
            r3 = r28
            r10 = r30
            goto L_0x0019
        L_0x03ca:
            r2 = r0
            r7 = r25
            r6 = r27
            r0 = r37
            goto L_0x041f
        L_0x03d2:
            r19 = r2
            r35 = r5
            r30 = r10
            r28 = r11
            r15 = r22
            r18 = 1
            r24 = -1
            r0 = 50
            r9 = r19
            if (r9 != r0) goto L_0x0406
            r0 = 2
            if (r7 != r0) goto L_0x03fe
            r0 = r32
            r1 = r33
            r2 = r34
            r3 = r15
            r4 = r36
            r5 = r28
            r6 = r12
            r8 = r38
            int r0 = r0.zzs(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x03ca
            goto L_0x03b0
        L_0x03fe:
            r0 = r37
            r2 = r15
            r7 = r25
            r6 = r27
            goto L_0x041f
        L_0x0406:
            r0 = r32
            r1 = r33
            r2 = r34
            r3 = r15
            r4 = r36
            r5 = r25
            r6 = r35
            r10 = r12
            r12 = r28
            r13 = r38
            int r0 = r0.zzt(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x03ca
            goto L_0x03b0
        L_0x041f:
            if (r7 != r0) goto L_0x0434
            if (r0 == 0) goto L_0x0434
            r8 = r32
            r13 = r33
            r9 = r0
            r0 = r2
            r2 = r6
            r1 = r7
            r5 = r26
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r36
            goto L_0x060c
        L_0x0434:
            r8 = r32
            r9 = r0
            boolean r0 = r8.zzh
            if (r0 == 0) goto L_0x05d0
            r10 = r38
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn r0 = r10.zzd
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn.zza()
            if (r0 == r1) goto L_0x05c9
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfl r0 = r8.zzg
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn r1 = r10.zzd
            r11 = r35
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzea r12 = r1.zzb(r0, r11)
            if (r12 != 0) goto L_0x046a
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgq r4 = zzd(r33)
            r0 = r7
            r1 = r34
            r3 = r36
            r5 = r38
            int r0 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzi(r0, r1, r2, r3, r4, r5)
            r13 = r33
            r15 = r34
            r35 = r6
            r6 = r36
            goto L_0x05eb
        L_0x046a:
            r13 = r33
            r0 = r13
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdy r0 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdy) r0
            r0.zzc()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzds r14 = r0.zza
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdz r0 = r12.zzd
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhf r0 = r0.zzb
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhf r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhf.ENUM
            if (r0 == r1) goto L_0x05c3
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L_0x0587;
                case 1: goto L_0x0572;
                case 2: goto L_0x0561;
                case 3: goto L_0x0561;
                case 4: goto L_0x0550;
                case 5: goto L_0x0541;
                case 6: goto L_0x0532;
                case 7: goto L_0x0519;
                case 8: goto L_0x050b;
                case 9: goto L_0x04e4;
                case 10: goto L_0x04c7;
                case 11: goto L_0x04b9;
                case 12: goto L_0x0550;
                case 13: goto L_0x04b1;
                case 14: goto L_0x0532;
                case 15: goto L_0x0541;
                case 16: goto L_0x049c;
                case 17: goto L_0x048b;
                default: goto L_0x0483;
            }
        L_0x0483:
            r15 = r34
            r35 = r6
            r6 = r36
            goto L_0x059b
        L_0x048b:
            r15 = r34
            int r2 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzm(r15, r2, r10)
            long r0 = r10.zzb
            long r0 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzde.zzc(r0)
            java.lang.Long r17 = java.lang.Long.valueOf(r0)
            goto L_0x04ac
        L_0x049c:
            r15 = r34
            int r2 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzj(r15, r2, r10)
            int r0 = r10.zza
            int r0 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzde.zzb(r0)
            java.lang.Integer r17 = java.lang.Integer.valueOf(r0)
        L_0x04ac:
            r35 = r6
            r0 = r17
            goto L_0x04c3
        L_0x04b1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Shouldn't reach here."
            r0.<init>(r1)
            throw r0
        L_0x04b9:
            r15 = r34
            int r2 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zza(r15, r2, r10)
            java.lang.Object r0 = r10.zzc
            r35 = r6
        L_0x04c3:
            r6 = r36
            goto L_0x059d
        L_0x04c7:
            r15 = r34
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfu r0 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfu.zza()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfl r1 = r12.zzc
            java.lang.Class r1 = r1.getClass()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgb r0 = r0.zzb(r1)
            r5 = r36
            int r2 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzd(r0, r15, r2, r5, r10)
            java.lang.Object r0 = r10.zzc
            r35 = r6
            r6 = r5
            goto L_0x059d
        L_0x04e4:
            r15 = r34
            r5 = r36
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfu r0 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfu.zza()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfl r1 = r12.zzc
            java.lang.Class r1 = r1.getClass()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgb r0 = r0.zzb(r1)
            int r1 = r11 << 3
            r4 = r1 | 4
            r1 = r34
            r3 = r36
            r35 = r6
            r6 = r5
            r5 = r38
            int r2 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzc(r0, r1, r2, r3, r4, r5)
            java.lang.Object r0 = r10.zzc
            goto L_0x059d
        L_0x050b:
            r15 = r34
            r35 = r6
            r6 = r36
            int r2 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzg(r15, r2, r10)
            java.lang.Object r0 = r10.zzc
            goto L_0x059d
        L_0x0519:
            r15 = r34
            r35 = r6
            r6 = r36
            int r2 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzm(r15, r2, r10)
            long r0 = r10.zzb
            int r3 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r3 == 0) goto L_0x052a
            goto L_0x052c
        L_0x052a:
            r18 = 0
        L_0x052c:
            java.lang.Boolean r17 = java.lang.Boolean.valueOf(r18)
            goto L_0x059b
        L_0x0532:
            r15 = r34
            r35 = r6
            r6 = r36
            int r0 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzb(r15, r2)
            java.lang.Integer r17 = java.lang.Integer.valueOf(r0)
            goto L_0x0584
        L_0x0541:
            r15 = r34
            r35 = r6
            r6 = r36
            long r0 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzo(r15, r2)
            java.lang.Long r17 = java.lang.Long.valueOf(r0)
            goto L_0x0599
        L_0x0550:
            r15 = r34
            r35 = r6
            r6 = r36
            int r2 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzj(r15, r2, r10)
            int r0 = r10.zza
            java.lang.Integer r17 = java.lang.Integer.valueOf(r0)
            goto L_0x059b
        L_0x0561:
            r15 = r34
            r35 = r6
            r6 = r36
            int r2 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzm(r15, r2, r10)
            long r0 = r10.zzb
            java.lang.Long r17 = java.lang.Long.valueOf(r0)
            goto L_0x059b
        L_0x0572:
            r15 = r34
            r35 = r6
            r6 = r36
            int r0 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzb(r15, r2)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            java.lang.Float r17 = java.lang.Float.valueOf(r0)
        L_0x0584:
            int r2 = r2 + 4
            goto L_0x059b
        L_0x0587:
            r15 = r34
            r35 = r6
            r6 = r36
            long r0 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzo(r15, r2)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            java.lang.Double r17 = java.lang.Double.valueOf(r0)
        L_0x0599:
            int r2 = r2 + 8
        L_0x059b:
            r0 = r17
        L_0x059d:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdz r1 = r12.zzd
            boolean r3 = r1.zzc
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhf r1 = r1.zzb
            int r1 = r1.ordinal()
            r3 = 9
            if (r1 == r3) goto L_0x05b0
            r3 = 10
            if (r1 == r3) goto L_0x05b0
            goto L_0x05bc
        L_0x05b0:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdz r1 = r12.zzd
            java.lang.Object r1 = r14.zze(r1)
            if (r1 == 0) goto L_0x05bc
            java.lang.Object r0 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzel.zzg(r1, r0)
        L_0x05bc:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdz r1 = r12.zzd
            r14.zzi(r1, r0)
            r0 = r2
            goto L_0x05eb
        L_0x05c3:
            r15 = r34
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzj(r15, r2, r10)
            throw r17
        L_0x05c9:
            r13 = r33
            r15 = r34
            r11 = r35
            goto L_0x05d8
        L_0x05d0:
            r13 = r33
            r15 = r34
            r11 = r35
            r10 = r38
        L_0x05d8:
            r35 = r6
            r6 = r36
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgq r4 = zzd(r33)
            r0 = r7
            r1 = r34
            r3 = r36
            r5 = r38
            int r0 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.zzi(r0, r1, r2, r3, r4, r5)
        L_0x05eb:
            r1 = r7
            r2 = r11
            r14 = r13
            r12 = r15
            r5 = r26
            r3 = r28
            r13 = r6
            r15 = r8
            r11 = r9
            r9 = r10
            r10 = r30
            r6 = r35
            goto L_0x0019
        L_0x05fd:
            r26 = r5
            r27 = r6
            r30 = r10
            r9 = r11
            r6 = r13
            r13 = r14
            r8 = r15
            r2 = r27
            r3 = 1048575(0xfffff, float:1.469367E-39)
        L_0x060c:
            if (r2 == r3) goto L_0x0614
            long r10 = (long) r2
            r2 = r30
            r2.putInt(r13, r10, r5)
        L_0x0614:
            int r2 = r8.zzk
        L_0x0616:
            int r4 = r8.zzl
            if (r2 >= r4) goto L_0x0641
            int[] r4 = r8.zzj
            r4 = r4[r2]
            int[] r5 = r8.zzc
            r5 = r5[r4]
            int r5 = r8.zzB(r4)
            r5 = r5 & r3
            long r10 = (long) r5
            java.lang.Object r5 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r13, r10)
            if (r5 != 0) goto L_0x062f
            goto L_0x0635
        L_0x062f:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeg r7 = r8.zzD(r4)
            if (r7 != 0) goto L_0x0638
        L_0x0635:
            int r2 = r2 + 1
            goto L_0x0616
        L_0x0638:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzff r5 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzff) r5
            java.lang.Object r0 = r8.zzF(r4)
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfe r0 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfe) r0
            throw r17
        L_0x0641:
            if (r9 != 0) goto L_0x064b
            if (r0 != r6) goto L_0x0646
            goto L_0x064f
        L_0x0646:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzen r0 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzen.zze()
            throw r0
        L_0x064b:
            if (r0 > r6) goto L_0x0650
            if (r1 != r9) goto L_0x0650
        L_0x064f:
            return r0
        L_0x0650:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzen r0 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzen.zze()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfo.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzco):int");
    }

    public final Object zze() {
        return ((zzec) this.zzg).zzg(4, (Object) null, (Object) null);
    }

    public final void zzf(Object obj) {
        int i;
        int i2 = this.zzk;
        while (true) {
            i = this.zzl;
            if (i2 >= i) {
                break;
            }
            long zzB = (long) (zzB(this.zzj[i2]) & 1048575);
            Object zzf2 = zzgz.zzf(obj, zzB);
            if (zzf2 != null) {
                ((zzff) zzf2).zzc();
                zzgz.zzs(obj, zzB, zzf2);
            }
            i2++;
        }
        int length = this.zzj.length;
        while (i < length) {
            this.zzm.zza(obj, (long) this.zzj[i]);
            i++;
        }
        this.zzn.zzg(obj);
        if (this.zzh) {
            this.zzo.zze(obj);
        }
    }

    public final void zzg(Object obj, Object obj2) {
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzB = zzB(i);
            long j = (long) (1048575 & zzB);
            int i2 = this.zzc[i];
            switch (zzA(zzB)) {
                case 0:
                    if (!zzM(obj2, i)) {
                        break;
                    } else {
                        zzgz.zzo(obj, j, zzgz.zza(obj2, j));
                        zzJ(obj, i);
                        break;
                    }
                case 1:
                    if (!zzM(obj2, i)) {
                        break;
                    } else {
                        zzgz.zzp(obj, j, zzgz.zzb(obj2, j));
                        zzJ(obj, i);
                        break;
                    }
                case 2:
                    if (!zzM(obj2, i)) {
                        break;
                    } else {
                        zzgz.zzr(obj, j, zzgz.zzd(obj2, j));
                        zzJ(obj, i);
                        break;
                    }
                case 3:
                    if (!zzM(obj2, i)) {
                        break;
                    } else {
                        zzgz.zzr(obj, j, zzgz.zzd(obj2, j));
                        zzJ(obj, i);
                        break;
                    }
                case 4:
                    if (!zzM(obj2, i)) {
                        break;
                    } else {
                        zzgz.zzq(obj, j, zzgz.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    }
                case 5:
                    if (!zzM(obj2, i)) {
                        break;
                    } else {
                        zzgz.zzr(obj, j, zzgz.zzd(obj2, j));
                        zzJ(obj, i);
                        break;
                    }
                case 6:
                    if (!zzM(obj2, i)) {
                        break;
                    } else {
                        zzgz.zzq(obj, j, zzgz.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    }
                case 7:
                    if (!zzM(obj2, i)) {
                        break;
                    } else {
                        zzgz.zzm(obj, j, zzgz.zzw(obj2, j));
                        zzJ(obj, i);
                        break;
                    }
                case 8:
                    if (!zzM(obj2, i)) {
                        break;
                    } else {
                        zzgz.zzs(obj, j, zzgz.zzf(obj2, j));
                        zzJ(obj, i);
                        break;
                    }
                case 9:
                    zzH(obj, obj2, i);
                    break;
                case 10:
                    if (!zzM(obj2, i)) {
                        break;
                    } else {
                        zzgz.zzs(obj, j, zzgz.zzf(obj2, j));
                        zzJ(obj, i);
                        break;
                    }
                case 11:
                    if (!zzM(obj2, i)) {
                        break;
                    } else {
                        zzgz.zzq(obj, j, zzgz.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    }
                case 12:
                    if (!zzM(obj2, i)) {
                        break;
                    } else {
                        zzgz.zzq(obj, j, zzgz.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    }
                case 13:
                    if (!zzM(obj2, i)) {
                        break;
                    } else {
                        zzgz.zzq(obj, j, zzgz.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    }
                case 14:
                    if (!zzM(obj2, i)) {
                        break;
                    } else {
                        zzgz.zzr(obj, j, zzgz.zzd(obj2, j));
                        zzJ(obj, i);
                        break;
                    }
                case 15:
                    if (!zzM(obj2, i)) {
                        break;
                    } else {
                        zzgz.zzq(obj, j, zzgz.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    }
                case 16:
                    if (!zzM(obj2, i)) {
                        break;
                    } else {
                        zzgz.zzr(obj, j, zzgz.zzd(obj2, j));
                        zzJ(obj, i);
                        break;
                    }
                case 17:
                    zzH(obj, obj2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzm.zzb(obj, obj2, j);
                    break;
                case 50:
                    zzgd.zzI(this.zzq, obj, obj2, j);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (!zzP(obj2, i2, i)) {
                        break;
                    } else {
                        zzgz.zzs(obj, j, zzgz.zzf(obj2, j));
                        zzK(obj, i2, i);
                        break;
                    }
                case 60:
                    zzI(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!zzP(obj2, i2, i)) {
                        break;
                    } else {
                        zzgz.zzs(obj, j, zzgz.zzf(obj2, j));
                        zzK(obj, i2, i);
                        break;
                    }
                case 68:
                    zzI(obj, obj2, i);
                    break;
            }
        }
        zzgd.zzF(this.zzn, obj, obj2);
        if (this.zzh) {
            zzgd.zzE(this.zzo, obj, obj2);
        }
    }

    public final void zzh(Object obj, byte[] bArr, int i, int i2, zzco zzco) throws IOException {
        if (this.zzi) {
            zzu(obj, bArr, i, i2, zzco);
        } else {
            zzc(obj, bArr, i, i2, 0, zzco);
        }
    }

    public final boolean zzi(Object obj, Object obj2) {
        boolean z;
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int zzB = zzB(i);
            long j = (long) (zzB & 1048575);
            switch (zzA(zzB)) {
                case 0:
                    if (zzL(obj, obj2, i) && Double.doubleToLongBits(zzgz.zza(obj, j)) == Double.doubleToLongBits(zzgz.zza(obj2, j))) {
                        continue;
                    }
                case 1:
                    if (zzL(obj, obj2, i) && Float.floatToIntBits(zzgz.zzb(obj, j)) == Float.floatToIntBits(zzgz.zzb(obj2, j))) {
                        continue;
                    }
                case 2:
                    if (zzL(obj, obj2, i) && zzgz.zzd(obj, j) == zzgz.zzd(obj2, j)) {
                        continue;
                    }
                case 3:
                    if (zzL(obj, obj2, i) && zzgz.zzd(obj, j) == zzgz.zzd(obj2, j)) {
                        continue;
                    }
                case 4:
                    if (zzL(obj, obj2, i) && zzgz.zzc(obj, j) == zzgz.zzc(obj2, j)) {
                        continue;
                    }
                case 5:
                    if (zzL(obj, obj2, i) && zzgz.zzd(obj, j) == zzgz.zzd(obj2, j)) {
                        continue;
                    }
                case 6:
                    if (zzL(obj, obj2, i) && zzgz.zzc(obj, j) == zzgz.zzc(obj2, j)) {
                        continue;
                    }
                case 7:
                    if (zzL(obj, obj2, i) && zzgz.zzw(obj, j) == zzgz.zzw(obj2, j)) {
                        continue;
                    }
                case 8:
                    if (zzL(obj, obj2, i) && zzgd.zzH(zzgz.zzf(obj, j), zzgz.zzf(obj2, j))) {
                        continue;
                    }
                case 9:
                    if (zzL(obj, obj2, i) && zzgd.zzH(zzgz.zzf(obj, j), zzgz.zzf(obj2, j))) {
                        continue;
                    }
                case 10:
                    if (zzL(obj, obj2, i) && zzgd.zzH(zzgz.zzf(obj, j), zzgz.zzf(obj2, j))) {
                        continue;
                    }
                case 11:
                    if (zzL(obj, obj2, i) && zzgz.zzc(obj, j) == zzgz.zzc(obj2, j)) {
                        continue;
                    }
                case 12:
                    if (zzL(obj, obj2, i) && zzgz.zzc(obj, j) == zzgz.zzc(obj2, j)) {
                        continue;
                    }
                case 13:
                    if (zzL(obj, obj2, i) && zzgz.zzc(obj, j) == zzgz.zzc(obj2, j)) {
                        continue;
                    }
                case 14:
                    if (zzL(obj, obj2, i) && zzgz.zzd(obj, j) == zzgz.zzd(obj2, j)) {
                        continue;
                    }
                case 15:
                    if (zzL(obj, obj2, i) && zzgz.zzc(obj, j) == zzgz.zzc(obj2, j)) {
                        continue;
                    }
                case 16:
                    if (zzL(obj, obj2, i) && zzgz.zzd(obj, j) == zzgz.zzd(obj2, j)) {
                        continue;
                    }
                case 17:
                    if (zzL(obj, obj2, i) && zzgd.zzH(zzgz.zzf(obj, j), zzgz.zzf(obj2, j))) {
                        continue;
                    }
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    z = zzgd.zzH(zzgz.zzf(obj, j), zzgz.zzf(obj2, j));
                    break;
                case 50:
                    z = zzgd.zzH(zzgz.zzf(obj, j), zzgz.zzf(obj2, j));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long zzy = (long) (zzy(i) & 1048575);
                    if (zzgz.zzc(obj, zzy) == zzgz.zzc(obj2, zzy) && zzgd.zzH(zzgz.zzf(obj, j), zzgz.zzf(obj2, j))) {
                        continue;
                    }
            }
            if (!z) {
                return false;
            }
        }
        if (!this.zzn.zzc(obj).equals(this.zzn.zzc(obj2))) {
            return false;
        }
        if (this.zzh) {
            return this.zzo.zzb(obj).equals(this.zzo.zzb(obj2));
        }
        return true;
    }

    public final boolean zzj(Object obj) {
        int i;
        int i2;
        Object obj2 = obj;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.zzk) {
            int i6 = this.zzj[i5];
            int i7 = this.zzc[i6];
            int zzB = zzB(i6);
            int i8 = this.zzc[i6 + 2];
            int i9 = i8 & 1048575;
            int i11 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = zzb.getInt(obj2, (long) i9);
                }
                i = i4;
                i2 = i9;
            } else {
                i2 = i3;
                i = i4;
            }
            if ((268435456 & zzB) != 0 && !zzN(obj, i6, i2, i, i11)) {
                return false;
            }
            int zzA = zzA(zzB);
            if (zzA != 9 && zzA != 17) {
                if (zzA != 27) {
                    if (zzA == 60 || zzA == 68) {
                        if (zzP(obj2, i7, i6) && !zzO(obj2, zzB, zzE(i6))) {
                            return false;
                        }
                    } else if (zzA != 49) {
                        if (zzA == 50 && !((zzff) zzgz.zzf(obj2, (long) (zzB & 1048575))).isEmpty()) {
                            zzfe zzfe = (zzfe) zzF(i6);
                            throw null;
                        }
                    }
                }
                List list = (List) zzgz.zzf(obj2, (long) (zzB & 1048575));
                if (!list.isEmpty()) {
                    zzgb zzE = zzE(i6);
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        if (!zzE.zzj(list.get(i12))) {
                            return false;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            } else if (zzN(obj, i6, i2, i, i11) && !zzO(obj2, zzB, zzE(i6))) {
                return false;
            }
            i5++;
            i3 = i2;
            i4 = i;
        }
        if (!this.zzh || this.zzo.zzb(obj2).zzk()) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0507  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzm(java.lang.Object r13, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdj r14) throws java.io.IOException {
        /*
            r12 = this;
            boolean r0 = r12.zzi
            if (r0 == 0) goto L_0x0525
            boolean r0 = r12.zzh
            r1 = 0
            if (r0 == 0) goto L_0x0022
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdo r0 = r12.zzo
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzds r0 = r0.zzb(r13)
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgl r2 = r0.zza
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0022
            java.util.Iterator r0 = r0.zzf()
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0024
        L_0x0022:
            r0 = r1
            r2 = r0
        L_0x0024:
            int[] r3 = r12.zzc
            int r3 = r3.length
            r4 = 0
            r5 = 0
        L_0x0029:
            if (r5 >= r3) goto L_0x0505
            int r6 = r12.zzB(r5)
            int[] r7 = r12.zzc
            r7 = r7[r5]
        L_0x0033:
            if (r2 == 0) goto L_0x0051
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdo r8 = r12.zzo
            int r8 = r8.zza(r2)
            if (r8 > r7) goto L_0x0051
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdo r8 = r12.zzo
            r8.zzg(r14, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x004f
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0033
        L_0x004f:
            r2 = r1
            goto L_0x0033
        L_0x0051:
            int r8 = zzA(r6)
            r9 = 1
            r10 = 1048575(0xfffff, float:1.469367E-39)
            switch(r8) {
                case 0: goto L_0x04f2;
                case 1: goto L_0x04e2;
                case 2: goto L_0x04d2;
                case 3: goto L_0x04c2;
                case 4: goto L_0x04b2;
                case 5: goto L_0x04a2;
                case 6: goto L_0x0492;
                case 7: goto L_0x0481;
                case 8: goto L_0x0470;
                case 9: goto L_0x045b;
                case 10: goto L_0x0448;
                case 11: goto L_0x0437;
                case 12: goto L_0x0426;
                case 13: goto L_0x0415;
                case 14: goto L_0x0404;
                case 15: goto L_0x03f3;
                case 16: goto L_0x03e2;
                case 17: goto L_0x03cd;
                case 18: goto L_0x03bc;
                case 19: goto L_0x03ab;
                case 20: goto L_0x039a;
                case 21: goto L_0x0389;
                case 22: goto L_0x0378;
                case 23: goto L_0x0367;
                case 24: goto L_0x0356;
                case 25: goto L_0x0345;
                case 26: goto L_0x0334;
                case 27: goto L_0x031f;
                case 28: goto L_0x030e;
                case 29: goto L_0x02fd;
                case 30: goto L_0x02ec;
                case 31: goto L_0x02db;
                case 32: goto L_0x02ca;
                case 33: goto L_0x02b9;
                case 34: goto L_0x02a8;
                case 35: goto L_0x0297;
                case 36: goto L_0x0286;
                case 37: goto L_0x0275;
                case 38: goto L_0x0264;
                case 39: goto L_0x0253;
                case 40: goto L_0x0242;
                case 41: goto L_0x0231;
                case 42: goto L_0x0220;
                case 43: goto L_0x020f;
                case 44: goto L_0x01fe;
                case 45: goto L_0x01ed;
                case 46: goto L_0x01dc;
                case 47: goto L_0x01cb;
                case 48: goto L_0x01ba;
                case 49: goto L_0x01a5;
                case 50: goto L_0x019a;
                case 51: goto L_0x0189;
                case 52: goto L_0x0178;
                case 53: goto L_0x0167;
                case 54: goto L_0x0156;
                case 55: goto L_0x0145;
                case 56: goto L_0x0134;
                case 57: goto L_0x0123;
                case 58: goto L_0x0112;
                case 59: goto L_0x0101;
                case 60: goto L_0x00ec;
                case 61: goto L_0x00d9;
                case 62: goto L_0x00c8;
                case 63: goto L_0x00b7;
                case 64: goto L_0x00a6;
                case 65: goto L_0x0095;
                case 66: goto L_0x0084;
                case 67: goto L_0x0073;
                case 68: goto L_0x005e;
                default: goto L_0x005c;
            }
        L_0x005c:
            goto L_0x0501
        L_0x005e:
            boolean r8 = r12.zzP(r13, r7, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r13, r8)
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgb r8 = r12.zzE(r5)
            r14.zzq(r7, r6, r8)
            goto L_0x0501
        L_0x0073:
            boolean r8 = r12.zzP(r13, r7, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = zzC(r13, r8)
            r14.zzD(r7, r8)
            goto L_0x0501
        L_0x0084:
            boolean r8 = r12.zzP(r13, r7, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = zzr(r13, r8)
            r14.zzB(r7, r6)
            goto L_0x0501
        L_0x0095:
            boolean r8 = r12.zzP(r13, r7, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = zzC(r13, r8)
            r14.zzz(r7, r8)
            goto L_0x0501
        L_0x00a6:
            boolean r8 = r12.zzP(r13, r7, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = zzr(r13, r8)
            r14.zzx(r7, r6)
            goto L_0x0501
        L_0x00b7:
            boolean r8 = r12.zzP(r13, r7, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = zzr(r13, r8)
            r14.zzi(r7, r6)
            goto L_0x0501
        L_0x00c8:
            boolean r8 = r12.zzP(r13, r7, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = zzr(r13, r8)
            r14.zzI(r7, r6)
            goto L_0x0501
        L_0x00d9:
            boolean r8 = r12.zzP(r13, r7, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r13, r8)
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb r6 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb) r6
            r14.zzd(r7, r6)
            goto L_0x0501
        L_0x00ec:
            boolean r8 = r12.zzP(r13, r7, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r13, r8)
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgb r8 = r12.zzE(r5)
            r14.zzv(r7, r6, r8)
            goto L_0x0501
        L_0x0101:
            boolean r8 = r12.zzP(r13, r7, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r13, r8)
            zzT(r7, r6, r14)
            goto L_0x0501
        L_0x0112:
            boolean r8 = r12.zzP(r13, r7, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            boolean r6 = zzQ(r13, r8)
            r14.zzb(r7, r6)
            goto L_0x0501
        L_0x0123:
            boolean r8 = r12.zzP(r13, r7, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = zzr(r13, r8)
            r14.zzk(r7, r6)
            goto L_0x0501
        L_0x0134:
            boolean r8 = r12.zzP(r13, r7, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = zzC(r13, r8)
            r14.zzm(r7, r8)
            goto L_0x0501
        L_0x0145:
            boolean r8 = r12.zzP(r13, r7, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = zzr(r13, r8)
            r14.zzr(r7, r6)
            goto L_0x0501
        L_0x0156:
            boolean r8 = r12.zzP(r13, r7, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = zzC(r13, r8)
            r14.zzK(r7, r8)
            goto L_0x0501
        L_0x0167:
            boolean r8 = r12.zzP(r13, r7, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = zzC(r13, r8)
            r14.zzt(r7, r8)
            goto L_0x0501
        L_0x0178:
            boolean r8 = r12.zzP(r13, r7, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            float r6 = zzo(r13, r8)
            r14.zzo(r7, r6)
            goto L_0x0501
        L_0x0189:
            boolean r8 = r12.zzP(r13, r7, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            double r8 = zzn(r13, r8)
            r14.zzf(r7, r8)
            goto L_0x0501
        L_0x019a:
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r13, r8)
            r12.zzS(r14, r7, r6, r5)
            goto L_0x0501
        L_0x01a5:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgb r8 = r12.zzE(r5)
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzQ(r7, r6, r14, r8)
            goto L_0x0501
        L_0x01ba:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzX(r7, r6, r14, r9)
            goto L_0x0501
        L_0x01cb:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzW(r7, r6, r14, r9)
            goto L_0x0501
        L_0x01dc:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzV(r7, r6, r14, r9)
            goto L_0x0501
        L_0x01ed:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzU(r7, r6, r14, r9)
            goto L_0x0501
        L_0x01fe:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzM(r7, r6, r14, r9)
            goto L_0x0501
        L_0x020f:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzZ(r7, r6, r14, r9)
            goto L_0x0501
        L_0x0220:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzJ(r7, r6, r14, r9)
            goto L_0x0501
        L_0x0231:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzN(r7, r6, r14, r9)
            goto L_0x0501
        L_0x0242:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzO(r7, r6, r14, r9)
            goto L_0x0501
        L_0x0253:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzR(r7, r6, r14, r9)
            goto L_0x0501
        L_0x0264:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzaa(r7, r6, r14, r9)
            goto L_0x0501
        L_0x0275:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzS(r7, r6, r14, r9)
            goto L_0x0501
        L_0x0286:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzP(r7, r6, r14, r9)
            goto L_0x0501
        L_0x0297:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzL(r7, r6, r14, r9)
            goto L_0x0501
        L_0x02a8:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzX(r7, r6, r14, r4)
            goto L_0x0501
        L_0x02b9:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzW(r7, r6, r14, r4)
            goto L_0x0501
        L_0x02ca:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzV(r7, r6, r14, r4)
            goto L_0x0501
        L_0x02db:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzU(r7, r6, r14, r4)
            goto L_0x0501
        L_0x02ec:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzM(r7, r6, r14, r4)
            goto L_0x0501
        L_0x02fd:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzZ(r7, r6, r14, r4)
            goto L_0x0501
        L_0x030e:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzK(r7, r6, r14)
            goto L_0x0501
        L_0x031f:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgb r8 = r12.zzE(r5)
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzT(r7, r6, r14, r8)
            goto L_0x0501
        L_0x0334:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzY(r7, r6, r14)
            goto L_0x0501
        L_0x0345:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzJ(r7, r6, r14, r4)
            goto L_0x0501
        L_0x0356:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzN(r7, r6, r14, r4)
            goto L_0x0501
        L_0x0367:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzO(r7, r6, r14, r4)
            goto L_0x0501
        L_0x0378:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzR(r7, r6, r14, r4)
            goto L_0x0501
        L_0x0389:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzaa(r7, r6, r14, r4)
            goto L_0x0501
        L_0x039a:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzS(r7, r6, r14, r4)
            goto L_0x0501
        L_0x03ab:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzP(r7, r6, r14, r4)
            goto L_0x0501
        L_0x03bc:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd.zzL(r7, r6, r14, r4)
            goto L_0x0501
        L_0x03cd:
            boolean r8 = r12.zzM(r13, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r13, r8)
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgb r8 = r12.zzE(r5)
            r14.zzq(r7, r6, r8)
            goto L_0x0501
        L_0x03e2:
            boolean r8 = r12.zzM(r13, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzd(r13, r8)
            r14.zzD(r7, r8)
            goto L_0x0501
        L_0x03f3:
            boolean r8 = r12.zzM(r13, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzc(r13, r8)
            r14.zzB(r7, r6)
            goto L_0x0501
        L_0x0404:
            boolean r8 = r12.zzM(r13, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzd(r13, r8)
            r14.zzz(r7, r8)
            goto L_0x0501
        L_0x0415:
            boolean r8 = r12.zzM(r13, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzc(r13, r8)
            r14.zzx(r7, r6)
            goto L_0x0501
        L_0x0426:
            boolean r8 = r12.zzM(r13, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzc(r13, r8)
            r14.zzi(r7, r6)
            goto L_0x0501
        L_0x0437:
            boolean r8 = r12.zzM(r13, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzc(r13, r8)
            r14.zzI(r7, r6)
            goto L_0x0501
        L_0x0448:
            boolean r8 = r12.zzM(r13, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r13, r8)
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb r6 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb) r6
            r14.zzd(r7, r6)
            goto L_0x0501
        L_0x045b:
            boolean r8 = r12.zzM(r13, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r13, r8)
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgb r8 = r12.zzE(r5)
            r14.zzv(r7, r6, r8)
            goto L_0x0501
        L_0x0470:
            boolean r8 = r12.zzM(r13, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r13, r8)
            zzT(r7, r6, r14)
            goto L_0x0501
        L_0x0481:
            boolean r8 = r12.zzM(r13, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            boolean r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzw(r13, r8)
            r14.zzb(r7, r6)
            goto L_0x0501
        L_0x0492:
            boolean r8 = r12.zzM(r13, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzc(r13, r8)
            r14.zzk(r7, r6)
            goto L_0x0501
        L_0x04a2:
            boolean r8 = r12.zzM(r13, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzd(r13, r8)
            r14.zzm(r7, r8)
            goto L_0x0501
        L_0x04b2:
            boolean r8 = r12.zzM(r13, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzc(r13, r8)
            r14.zzr(r7, r6)
            goto L_0x0501
        L_0x04c2:
            boolean r8 = r12.zzM(r13, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzd(r13, r8)
            r14.zzK(r7, r8)
            goto L_0x0501
        L_0x04d2:
            boolean r8 = r12.zzM(r13, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzd(r13, r8)
            r14.zzt(r7, r8)
            goto L_0x0501
        L_0x04e2:
            boolean r8 = r12.zzM(r13, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            float r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzb(r13, r8)
            r14.zzo(r7, r6)
            goto L_0x0501
        L_0x04f2:
            boolean r8 = r12.zzM(r13, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            double r8 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zza(r13, r8)
            r14.zzf(r7, r8)
        L_0x0501:
            int r5 = r5 + 3
            goto L_0x0029
        L_0x0505:
            if (r2 == 0) goto L_0x051b
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdo r3 = r12.zzo
            r3.zzg(r14, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0519
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0505
        L_0x0519:
            r2 = r1
            goto L_0x0505
        L_0x051b:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgp r0 = r12.zzn
            java.lang.Object r13 = r0.zzc(r13)
            r0.zzj(r13, r14)
            return
        L_0x0525:
            r12.zzR(r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfo.zzm(java.lang.Object, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdj):void");
    }
}
