package com.google.android.gms.internal.gtm;

import com.appboy.support.ValidationUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.moovit.database.sqlite.SQLiteDatabase;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import p001a0.C0016g;
import p001a0.C0017h;
import sun.misc.Unsafe;

final class zzwn<T> implements zzwx<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzxy.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzwk zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final int[] zzk;
    private final int zzl;
    private final int zzm;
    private final zzvy zzn;
    private final zzxo<?, ?> zzo;
    private final zzuk<?> zzp;
    private final zzwq zzq;
    private final zzwf zzr;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: com.google.android.gms.internal.gtm.zzwk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: com.google.android.gms.internal.gtm.zzwq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.google.android.gms.internal.gtm.zzwf} */
    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.android.gms.internal.gtm.zzuk<?>, com.google.android.gms.internal.gtm.zzuk] */
    /* JADX WARNING: type inference failed for: r3v2, types: [int] */
    /* JADX WARNING: type inference failed for: r3v9, types: [int] */
    /* JADX WARNING: type inference failed for: r3v12, types: [com.google.android.gms.internal.gtm.zzvy] */
    /* JADX WARNING: type inference failed for: r3v13, types: [com.google.android.gms.internal.gtm.zzxo<?, ?>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private zzwn(int[] r6, int[] r7, java.lang.Object[] r8, int r9, int r10, com.google.android.gms.internal.gtm.zzwk r11, boolean r12, boolean r13, int[] r14, int r15, int r16, com.google.android.gms.internal.gtm.zzwq r17, com.google.android.gms.internal.gtm.zzvy r18, com.google.android.gms.internal.gtm.zzxo<?, ?> r19, com.google.android.gms.internal.gtm.zzuk<?> r20, com.google.android.gms.internal.gtm.zzwf r21) {
        /*
            r5 = this;
            r0 = r5
            r1 = r10
            r2 = r19
            r5.<init>()
            r3 = r6
            r0.zzc = r3
            r3 = r7
            r0.zzd = r3
            r3 = r8
            r0.zze = r3
            r3 = r9
            r0.zzf = r3
            boolean r3 = r1 instanceof com.google.android.gms.internal.gtm.zzuz
            r0.zzi = r3
            r3 = r11
            r0.zzj = r3
            r3 = 0
            if (r2 == 0) goto L_0x0024
            boolean r4 = r2.zzi(r10)
            if (r4 == 0) goto L_0x0024
            r3 = 1
        L_0x0024:
            r0.zzh = r3
            r3 = r13
            r0.zzk = r3
            r3 = r14
            r0.zzl = r3
            r3 = r15
            r0.zzm = r3
            r3 = r16
            r0.zzq = r3
            r3 = r17
            r0.zzn = r3
            r3 = r18
            r0.zzo = r3
            r0.zzp = r2
            r0.zzg = r1
            r1 = r20
            r0.zzr = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzwn.<init>(int[], java.lang.Object[], int, int, com.google.android.gms.internal.gtm.zzwk, boolean, boolean, int[], int, int, com.google.android.gms.internal.gtm.zzwq, com.google.android.gms.internal.gtm.zzvy, com.google.android.gms.internal.gtm.zzxo, com.google.android.gms.internal.gtm.zzuk, com.google.android.gms.internal.gtm.zzwf, byte[]):void");
    }

    private final int zzA(int i, int i2) {
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

    private static int zzB(int i) {
        return (i >>> 20) & ValidationUtils.APPBOY_STRING_MAX_LENGTH;
    }

    private final int zzC(int i) {
        return this.zzc[i + 1];
    }

    private static <T> long zzD(T t, long j) {
        return ((Long) zzxy.zzf(t, j)).longValue();
    }

    private final zzvd zzE(int i) {
        int i2 = i / 3;
        return (zzvd) this.zzd[i2 + i2 + 1];
    }

    private final zzwx zzF(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzwx zzwx = (zzwx) this.zzd[i3];
        if (zzwx != null) {
            return zzwx;
        }
        zzwx zzb2 = zzwt.zza().zzb((Class) this.zzd[i3 + 1]);
        this.zzd[i3] = zzb2;
        return zzb2;
    }

    private final <UT, UB> UB zzG(Object obj, int i, UB ub, zzxo<UT, UB> zzxo) {
        int i2 = this.zzc[i];
        Object zzf2 = zzxy.zzf(obj, (long) (zzC(i) & 1048575));
        if (zzf2 == null || zzE(i) == null) {
            return ub;
        }
        zzwe zzwe = (zzwe) zzf2;
        zzwd zzwd = (zzwd) zzH(i);
        throw null;
    }

    private final Object zzH(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private static Field zzI(Class<?> cls, String str) {
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

    private final void zzJ(T t, T t2, int i) {
        long zzC = (long) (zzC(i) & 1048575);
        if (zzQ(t2, i)) {
            Object zzf2 = zzxy.zzf(t, zzC);
            Object zzf3 = zzxy.zzf(t2, zzC);
            if (zzf2 != null && zzf3 != null) {
                zzxy.zzs(t, zzC, zzvi.zzg(zzf2, zzf3));
                zzM(t, i);
            } else if (zzf3 != null) {
                zzxy.zzs(t, zzC, zzf3);
                zzM(t, i);
            }
        }
    }

    private final void zzK(T t, T t2, int i) {
        Object obj;
        int zzC = zzC(i);
        int i2 = this.zzc[i];
        long j = (long) (zzC & 1048575);
        if (zzT(t2, i2, i)) {
            if (zzT(t, i2, i)) {
                obj = zzxy.zzf(t, j);
            } else {
                obj = null;
            }
            Object zzf2 = zzxy.zzf(t2, j);
            if (obj != null && zzf2 != null) {
                zzxy.zzs(t, j, zzvi.zzg(obj, zzf2));
                zzN(t, i2, i);
            } else if (zzf2 != null) {
                zzxy.zzs(t, j, zzf2);
                zzN(t, i2, i);
            }
        }
    }

    private final void zzL(Object obj, int i, zzww zzww) throws IOException {
        if (zzP(i)) {
            zzxy.zzs(obj, (long) (i & 1048575), zzww.zzx());
        } else if (this.zzi) {
            zzxy.zzs(obj, (long) (i & 1048575), zzww.zzv());
        } else {
            zzxy.zzs(obj, (long) (i & 1048575), zzww.zzq());
        }
    }

    private final void zzM(T t, int i) {
        int zzz = zzz(i);
        long j = (long) (1048575 & zzz);
        if (j != 1048575) {
            zzxy.zzq(t, j, (1 << (zzz >>> 20)) | zzxy.zzc(t, j));
        }
    }

    private final void zzN(T t, int i, int i2) {
        zzxy.zzq(t, (long) (zzz(i2) & 1048575), i);
    }

    private final boolean zzO(T t, T t2, int i) {
        return zzQ(t, i) == zzQ(t2, i);
    }

    private static boolean zzP(int i) {
        return (i & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0;
    }

    private final boolean zzQ(T t, int i) {
        int zzz = zzz(i);
        long j = (long) (zzz & 1048575);
        if (j == 1048575) {
            int zzC = zzC(i);
            long j2 = (long) (zzC & 1048575);
            switch (zzB(zzC)) {
                case 0:
                    if (zzxy.zza(t, j2) != 0.0d) {
                        return true;
                    }
                    return false;
                case 1:
                    if (zzxy.zzb(t, j2) != BitmapDescriptorFactory.HUE_RED) {
                        return true;
                    }
                    return false;
                case 2:
                    if (zzxy.zzd(t, j2) != 0) {
                        return true;
                    }
                    return false;
                case 3:
                    if (zzxy.zzd(t, j2) != 0) {
                        return true;
                    }
                    return false;
                case 4:
                    if (zzxy.zzc(t, j2) != 0) {
                        return true;
                    }
                    return false;
                case 5:
                    if (zzxy.zzd(t, j2) != 0) {
                        return true;
                    }
                    return false;
                case 6:
                    if (zzxy.zzc(t, j2) != 0) {
                        return true;
                    }
                    return false;
                case 7:
                    return zzxy.zzw(t, j2);
                case 8:
                    Object zzf2 = zzxy.zzf(t, j2);
                    if (zzf2 instanceof String) {
                        if (!((String) zzf2).isEmpty()) {
                            return true;
                        }
                        return false;
                    } else if (!(zzf2 instanceof zztd)) {
                        throw new IllegalArgumentException();
                    } else if (!zztd.zzb.equals(zzf2)) {
                        return true;
                    } else {
                        return false;
                    }
                case 9:
                    if (zzxy.zzf(t, j2) != null) {
                        return true;
                    }
                    return false;
                case 10:
                    if (!zztd.zzb.equals(zzxy.zzf(t, j2))) {
                        return true;
                    }
                    return false;
                case 11:
                    if (zzxy.zzc(t, j2) != 0) {
                        return true;
                    }
                    return false;
                case 12:
                    if (zzxy.zzc(t, j2) != 0) {
                        return true;
                    }
                    return false;
                case 13:
                    if (zzxy.zzc(t, j2) != 0) {
                        return true;
                    }
                    return false;
                case 14:
                    if (zzxy.zzd(t, j2) != 0) {
                        return true;
                    }
                    return false;
                case 15:
                    if (zzxy.zzc(t, j2) != 0) {
                        return true;
                    }
                    return false;
                case 16:
                    if (zzxy.zzd(t, j2) != 0) {
                        return true;
                    }
                    return false;
                case 17:
                    if (zzxy.zzf(t, j2) != null) {
                        return true;
                    }
                    return false;
                default:
                    throw new IllegalArgumentException();
            }
        } else if ((zzxy.zzc(t, j) & (1 << (zzz >>> 20))) != 0) {
            return true;
        } else {
            return false;
        }
    }

    private final boolean zzR(T t, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzQ(t, i) : (i3 & i4) != 0;
    }

    private static boolean zzS(Object obj, int i, zzwx zzwx) {
        return zzwx.zzk(zzxy.zzf(obj, (long) (i & 1048575)));
    }

    private final boolean zzT(T t, int i, int i2) {
        if (zzxy.zzc(t, (long) (zzz(i2) & 1048575)) == i) {
            return true;
        }
        return false;
    }

    private static <T> boolean zzU(T t, long j) {
        return ((Boolean) zzxy.zzf(t, j)).booleanValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:168:0x0492  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0034  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzV(T r18, com.google.android.gms.internal.gtm.zztp r19) throws java.io.IOException {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r0.zzh
            if (r3 == 0) goto L_0x0023
            com.google.android.gms.internal.gtm.zzuk<?> r3 = r0.zzp
            com.google.android.gms.internal.gtm.zzuo r3 = r3.zzb(r1)
            com.google.android.gms.internal.gtm.zzxk<T, java.lang.Object> r5 = r3.zza
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
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r10 = 0
            r11 = 1048575(0xfffff, float:1.469367E-39)
            r12 = 0
        L_0x0032:
            if (r10 >= r6) goto L_0x0490
            int r13 = r0.zzC(r10)
            int[] r14 = r0.zzc
            r14 = r14[r10]
            int r15 = zzB(r13)
            r4 = 17
            if (r15 > r4) goto L_0x005a
            int[] r4 = r0.zzc
            int r16 = r10 + 2
            r4 = r4[r16]
            r9 = r4 & r8
            if (r9 == r11) goto L_0x0054
            long r11 = (long) r9
            int r12 = r7.getInt(r1, r11)
            r11 = r9
        L_0x0054:
            int r4 = r4 >>> 20
            r9 = 1
            int r4 = r9 << r4
            goto L_0x005b
        L_0x005a:
            r4 = 0
        L_0x005b:
            if (r5 == 0) goto L_0x0079
            com.google.android.gms.internal.gtm.zzuk<?> r9 = r0.zzp
            int r9 = r9.zza(r5)
            if (r9 > r14) goto L_0x0079
            com.google.android.gms.internal.gtm.zzuk<?> r9 = r0.zzp
            r9.zzj(r2, r5)
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0077
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x005b
        L_0x0077:
            r5 = 0
            goto L_0x005b
        L_0x0079:
            r9 = r13 & r8
            long r8 = (long) r9
            switch(r15) {
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
            r15 = 0
            goto L_0x0489
        L_0x0082:
            boolean r4 = r0.zzT(r1, r14, r10)
            if (r4 == 0) goto L_0x007f
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.android.gms.internal.gtm.zzwx r8 = r0.zzF(r10)
            r2.zzq(r14, r4, r8)
            goto L_0x007f
        L_0x0094:
            boolean r4 = r0.zzT(r1, r14, r10)
            if (r4 == 0) goto L_0x007f
            long r8 = zzD(r1, r8)
            r2.zzD(r14, r8)
            goto L_0x007f
        L_0x00a2:
            boolean r4 = r0.zzT(r1, r14, r10)
            if (r4 == 0) goto L_0x007f
            int r4 = zzs(r1, r8)
            r2.zzB(r14, r4)
            goto L_0x007f
        L_0x00b0:
            boolean r4 = r0.zzT(r1, r14, r10)
            if (r4 == 0) goto L_0x007f
            long r8 = zzD(r1, r8)
            r2.zzz(r14, r8)
            goto L_0x007f
        L_0x00be:
            boolean r4 = r0.zzT(r1, r14, r10)
            if (r4 == 0) goto L_0x007f
            int r4 = zzs(r1, r8)
            r2.zzx(r14, r4)
            goto L_0x007f
        L_0x00cc:
            boolean r4 = r0.zzT(r1, r14, r10)
            if (r4 == 0) goto L_0x007f
            int r4 = zzs(r1, r8)
            r2.zzi(r14, r4)
            goto L_0x007f
        L_0x00da:
            boolean r4 = r0.zzT(r1, r14, r10)
            if (r4 == 0) goto L_0x007f
            int r4 = zzs(r1, r8)
            r2.zzI(r14, r4)
            goto L_0x007f
        L_0x00e8:
            boolean r4 = r0.zzT(r1, r14, r10)
            if (r4 == 0) goto L_0x007f
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.android.gms.internal.gtm.zztd r4 = (com.google.android.gms.internal.gtm.zztd) r4
            r2.zzd(r14, r4)
            goto L_0x007f
        L_0x00f8:
            boolean r4 = r0.zzT(r1, r14, r10)
            if (r4 == 0) goto L_0x007f
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.android.gms.internal.gtm.zzwx r8 = r0.zzF(r10)
            r2.zzv(r14, r4, r8)
            goto L_0x007f
        L_0x010b:
            boolean r4 = r0.zzT(r1, r14, r10)
            if (r4 == 0) goto L_0x007f
            java.lang.Object r4 = r7.getObject(r1, r8)
            zzX(r14, r4, r2)
            goto L_0x007f
        L_0x011a:
            boolean r4 = r0.zzT(r1, r14, r10)
            if (r4 == 0) goto L_0x007f
            boolean r4 = zzU(r1, r8)
            r2.zzb(r14, r4)
            goto L_0x007f
        L_0x0129:
            boolean r4 = r0.zzT(r1, r14, r10)
            if (r4 == 0) goto L_0x007f
            int r4 = zzs(r1, r8)
            r2.zzk(r14, r4)
            goto L_0x007f
        L_0x0138:
            boolean r4 = r0.zzT(r1, r14, r10)
            if (r4 == 0) goto L_0x007f
            long r8 = zzD(r1, r8)
            r2.zzm(r14, r8)
            goto L_0x007f
        L_0x0147:
            boolean r4 = r0.zzT(r1, r14, r10)
            if (r4 == 0) goto L_0x007f
            int r4 = zzs(r1, r8)
            r2.zzr(r14, r4)
            goto L_0x007f
        L_0x0156:
            boolean r4 = r0.zzT(r1, r14, r10)
            if (r4 == 0) goto L_0x007f
            long r8 = zzD(r1, r8)
            r2.zzK(r14, r8)
            goto L_0x007f
        L_0x0165:
            boolean r4 = r0.zzT(r1, r14, r10)
            if (r4 == 0) goto L_0x007f
            long r8 = zzD(r1, r8)
            r2.zzt(r14, r8)
            goto L_0x007f
        L_0x0174:
            boolean r4 = r0.zzT(r1, r14, r10)
            if (r4 == 0) goto L_0x007f
            float r4 = zzp(r1, r8)
            r2.zzo(r14, r4)
            goto L_0x007f
        L_0x0183:
            boolean r4 = r0.zzT(r1, r14, r10)
            if (r4 == 0) goto L_0x007f
            double r8 = zzo(r1, r8)
            r2.zzf(r14, r8)
            goto L_0x007f
        L_0x0192:
            java.lang.Object r4 = r7.getObject(r1, r8)
            r0.zzW(r2, r14, r4, r10)
            goto L_0x007f
        L_0x019b:
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.gtm.zzwx r9 = r0.zzF(r10)
            com.google.android.gms.internal.gtm.zzwz.zzQ(r4, r8, r2, r9)
            goto L_0x007f
        L_0x01ae:
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            r14 = 1
            com.google.android.gms.internal.gtm.zzwz.zzX(r4, r8, r2, r14)
            goto L_0x007f
        L_0x01be:
            r14 = 1
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.gtm.zzwz.zzW(r4, r8, r2, r14)
            goto L_0x007f
        L_0x01ce:
            r14 = 1
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.gtm.zzwz.zzV(r4, r8, r2, r14)
            goto L_0x007f
        L_0x01de:
            r14 = 1
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.gtm.zzwz.zzU(r4, r8, r2, r14)
            goto L_0x007f
        L_0x01ee:
            r14 = 1
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.gtm.zzwz.zzM(r4, r8, r2, r14)
            goto L_0x007f
        L_0x01fe:
            r14 = 1
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.gtm.zzwz.zzZ(r4, r8, r2, r14)
            goto L_0x007f
        L_0x020e:
            r14 = 1
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.gtm.zzwz.zzJ(r4, r8, r2, r14)
            goto L_0x007f
        L_0x021e:
            r14 = 1
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.gtm.zzwz.zzN(r4, r8, r2, r14)
            goto L_0x007f
        L_0x022e:
            r14 = 1
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.gtm.zzwz.zzO(r4, r8, r2, r14)
            goto L_0x007f
        L_0x023e:
            r14 = 1
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.gtm.zzwz.zzR(r4, r8, r2, r14)
            goto L_0x007f
        L_0x024e:
            r14 = 1
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.gtm.zzwz.zzaa(r4, r8, r2, r14)
            goto L_0x007f
        L_0x025e:
            r14 = 1
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.gtm.zzwz.zzS(r4, r8, r2, r14)
            goto L_0x007f
        L_0x026e:
            r14 = 1
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.gtm.zzwz.zzP(r4, r8, r2, r14)
            goto L_0x007f
        L_0x027e:
            r14 = 1
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.gtm.zzwz.zzL(r4, r8, r2, r14)
            goto L_0x007f
        L_0x028e:
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            r14 = 0
            com.google.android.gms.internal.gtm.zzwz.zzX(r4, r8, r2, r14)
            goto L_0x007f
        L_0x029e:
            r14 = 0
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.gtm.zzwz.zzW(r4, r8, r2, r14)
            goto L_0x007f
        L_0x02ae:
            r14 = 0
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.gtm.zzwz.zzV(r4, r8, r2, r14)
            goto L_0x007f
        L_0x02be:
            r14 = 0
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.gtm.zzwz.zzU(r4, r8, r2, r14)
            goto L_0x007f
        L_0x02ce:
            r14 = 0
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.gtm.zzwz.zzM(r4, r8, r2, r14)
            goto L_0x007f
        L_0x02de:
            r14 = 0
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.gtm.zzwz.zzZ(r4, r8, r2, r14)
            goto L_0x007f
        L_0x02ee:
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.gtm.zzwz.zzK(r4, r8, r2)
            goto L_0x007f
        L_0x02fd:
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.gtm.zzwx r9 = r0.zzF(r10)
            com.google.android.gms.internal.gtm.zzwz.zzT(r4, r8, r2, r9)
            goto L_0x007f
        L_0x0310:
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.gtm.zzwz.zzY(r4, r8, r2)
            goto L_0x007f
        L_0x031f:
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            r15 = 0
            com.google.android.gms.internal.gtm.zzwz.zzJ(r4, r8, r2, r15)
            goto L_0x0489
        L_0x032f:
            r15 = 0
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.gtm.zzwz.zzN(r4, r8, r2, r15)
            goto L_0x0489
        L_0x033f:
            r15 = 0
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.gtm.zzwz.zzO(r4, r8, r2, r15)
            goto L_0x0489
        L_0x034f:
            r15 = 0
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.gtm.zzwz.zzR(r4, r8, r2, r15)
            goto L_0x0489
        L_0x035f:
            r15 = 0
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.gtm.zzwz.zzaa(r4, r8, r2, r15)
            goto L_0x0489
        L_0x036f:
            r15 = 0
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.gtm.zzwz.zzS(r4, r8, r2, r15)
            goto L_0x0489
        L_0x037f:
            r15 = 0
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.gtm.zzwz.zzP(r4, r8, r2, r15)
            goto L_0x0489
        L_0x038f:
            r15 = 0
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.gtm.zzwz.zzL(r4, r8, r2, r15)
            goto L_0x0489
        L_0x039f:
            r15 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0489
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.android.gms.internal.gtm.zzwx r8 = r0.zzF(r10)
            r2.zzq(r14, r4, r8)
            goto L_0x0489
        L_0x03b0:
            r15 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0489
            long r8 = r7.getLong(r1, r8)
            r2.zzD(r14, r8)
            goto L_0x0489
        L_0x03bd:
            r15 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0489
            int r4 = r7.getInt(r1, r8)
            r2.zzB(r14, r4)
            goto L_0x0489
        L_0x03ca:
            r15 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0489
            long r8 = r7.getLong(r1, r8)
            r2.zzz(r14, r8)
            goto L_0x0489
        L_0x03d7:
            r15 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0489
            int r4 = r7.getInt(r1, r8)
            r2.zzx(r14, r4)
            goto L_0x0489
        L_0x03e4:
            r15 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0489
            int r4 = r7.getInt(r1, r8)
            r2.zzi(r14, r4)
            goto L_0x0489
        L_0x03f1:
            r15 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0489
            int r4 = r7.getInt(r1, r8)
            r2.zzI(r14, r4)
            goto L_0x0489
        L_0x03fe:
            r15 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0489
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.android.gms.internal.gtm.zztd r4 = (com.google.android.gms.internal.gtm.zztd) r4
            r2.zzd(r14, r4)
            goto L_0x0489
        L_0x040d:
            r15 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0489
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.android.gms.internal.gtm.zzwx r8 = r0.zzF(r10)
            r2.zzv(r14, r4, r8)
            goto L_0x0489
        L_0x041e:
            r15 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0489
            java.lang.Object r4 = r7.getObject(r1, r8)
            zzX(r14, r4, r2)
            goto L_0x0489
        L_0x042a:
            r15 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0489
            boolean r4 = com.google.android.gms.internal.gtm.zzxy.zzw(r1, r8)
            r2.zzb(r14, r4)
            goto L_0x0489
        L_0x0436:
            r15 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0489
            int r4 = r7.getInt(r1, r8)
            r2.zzk(r14, r4)
            goto L_0x0489
        L_0x0442:
            r15 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0489
            long r8 = r7.getLong(r1, r8)
            r2.zzm(r14, r8)
            goto L_0x0489
        L_0x044e:
            r15 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0489
            int r4 = r7.getInt(r1, r8)
            r2.zzr(r14, r4)
            goto L_0x0489
        L_0x045a:
            r15 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0489
            long r8 = r7.getLong(r1, r8)
            r2.zzK(r14, r8)
            goto L_0x0489
        L_0x0466:
            r15 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0489
            long r8 = r7.getLong(r1, r8)
            r2.zzt(r14, r8)
            goto L_0x0489
        L_0x0472:
            r15 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0489
            float r4 = com.google.android.gms.internal.gtm.zzxy.zzb(r1, r8)
            r2.zzo(r14, r4)
            goto L_0x0489
        L_0x047e:
            r15 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0489
            double r8 = com.google.android.gms.internal.gtm.zzxy.zza(r1, r8)
            r2.zzf(r14, r8)
        L_0x0489:
            int r10 = r10 + 3
            r8 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0032
        L_0x0490:
            if (r5 == 0) goto L_0x04a7
            com.google.android.gms.internal.gtm.zzuk<?> r4 = r0.zzp
            r4.zzj(r2, r5)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x04a5
            java.lang.Object r4 = r3.next()
            r5 = r4
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0490
        L_0x04a5:
            r5 = 0
            goto L_0x0490
        L_0x04a7:
            com.google.android.gms.internal.gtm.zzxo<?, ?> r3 = r0.zzo
            java.lang.Object r1 = r3.zzd(r1)
            r3.zzs(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzwn.zzV(java.lang.Object, com.google.android.gms.internal.gtm.zztp):void");
    }

    private final <K, V> void zzW(zztp zztp, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            zzwd zzwd = (zzwd) zzH(i2);
            throw null;
        }
    }

    private static final void zzX(int i, Object obj, zztp zztp) throws IOException {
        if (obj instanceof String) {
            zztp.zzG(i, (String) obj);
        } else {
            zztp.zzd(i, (zztd) obj);
        }
    }

    public static zzxp zzd(Object obj) {
        zzuz zzuz = (zzuz) obj;
        zzxp zzxp = zzuz.zzc;
        if (zzxp != zzxp.zzc()) {
            return zzxp;
        }
        zzxp zze2 = zzxp.zze();
        zzuz.zzc = zze2;
        return zze2;
    }

    public static <T> zzwn<T> zzl(Class<T> cls, zzwh zzwh, zzwq zzwq, zzvy zzvy, zzxo<?, ?> zzxo, zzuk<?> zzuk, zzwf zzwf) {
        if (zzwh instanceof zzwv) {
            return zzm((zzwv) zzwh, zzwq, zzvy, zzxo, zzuk, zzwf);
        }
        zzxl zzxl = (zzxl) zzwh;
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:120:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0260  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x032f  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0378  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> com.google.android.gms.internal.gtm.zzwn<T> zzm(com.google.android.gms.internal.gtm.zzwv r33, com.google.android.gms.internal.gtm.zzwq r34, com.google.android.gms.internal.gtm.zzvy r35, com.google.android.gms.internal.gtm.zzxo<?, ?> r36, com.google.android.gms.internal.gtm.zzuk<?> r37, com.google.android.gms.internal.gtm.zzwf r38) {
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
            com.google.android.gms.internal.gtm.zzwk r18 = r33.zza()
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
            java.lang.reflect.Field r12 = zzI(r1, r12)
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
            java.lang.reflect.Field r7 = zzI(r1, r7)
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
            java.lang.reflect.Field r8 = zzI(r1, r8)
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
            java.lang.reflect.Field r7 = zzI(r1, r7)
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
            com.google.android.gms.internal.gtm.zzwn r0 = new com.google.android.gms.internal.gtm.zzwn
            r4 = r0
            com.google.android.gms.internal.gtm.zzwk r9 = r33.zza()
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzwn.zzm(com.google.android.gms.internal.gtm.zzwv, com.google.android.gms.internal.gtm.zzwq, com.google.android.gms.internal.gtm.zzvy, com.google.android.gms.internal.gtm.zzxo, com.google.android.gms.internal.gtm.zzuk, com.google.android.gms.internal.gtm.zzwf):com.google.android.gms.internal.gtm.zzwn");
    }

    private static <T> double zzo(T t, long j) {
        return ((Double) zzxy.zzf(t, j)).doubleValue();
    }

    private static <T> float zzp(T t, long j) {
        return ((Float) zzxy.zzf(t, j)).floatValue();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0304, code lost:
        r9 = (r9 + r8) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x04a5, code lost:
        r9 = (r9 + r7) + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x04a7, code lost:
        r4 = r4 + r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x04c1, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x04eb, code lost:
        r7 = r7 + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0512, code lost:
        r4 = (r8 + r7) + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0520, code lost:
        r7 = r7 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x052e, code lost:
        r7 = r7 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0532, code lost:
        r3 = r3 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int zzq(T r15) {
        /*
            r14 = this;
            sun.misc.Unsafe r0 = zzb
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
        L_0x000c:
            int[] r7 = r14.zzc
            int r7 = r7.length
            if (r3 >= r7) goto L_0x0536
            int r7 = r14.zzC(r3)
            int[] r8 = r14.zzc
            r8 = r8[r3]
            int r9 = zzB(r7)
            r10 = 17
            r11 = 1
            if (r9 > r10) goto L_0x0037
            int[] r10 = r14.zzc
            int r12 = r3 + 2
            r10 = r10[r12]
            r12 = r10 & r1
            int r10 = r10 >>> 20
            int r10 = r11 << r10
            if (r12 == r6) goto L_0x0038
            long r5 = (long) r12
            int r5 = r0.getInt(r15, r5)
            r6 = r12
            goto L_0x0038
        L_0x0037:
            r10 = 0
        L_0x0038:
            r7 = r7 & r1
            long r12 = (long) r7
            r7 = 63
            switch(r9) {
                case 0: goto L_0x0524;
                case 1: goto L_0x0516;
                case 2: goto L_0x0500;
                case 3: goto L_0x04ed;
                case 4: goto L_0x04d9;
                case 5: goto L_0x04ce;
                case 6: goto L_0x04c3;
                case 7: goto L_0x04b7;
                case 8: goto L_0x0489;
                case 9: goto L_0x0476;
                case 10: goto L_0x045d;
                case 11: goto L_0x0449;
                case 12: goto L_0x0435;
                case 13: goto L_0x0429;
                case 14: goto L_0x041d;
                case 15: goto L_0x0404;
                case 16: goto L_0x03ec;
                case 17: goto L_0x03d8;
                case 18: goto L_0x03cc;
                case 19: goto L_0x03c0;
                case 20: goto L_0x03b4;
                case 21: goto L_0x03a8;
                case 22: goto L_0x039c;
                case 23: goto L_0x0390;
                case 24: goto L_0x0384;
                case 25: goto L_0x0378;
                case 26: goto L_0x036c;
                case 27: goto L_0x035c;
                case 28: goto L_0x0350;
                case 29: goto L_0x0344;
                case 30: goto L_0x0338;
                case 31: goto L_0x032c;
                case 32: goto L_0x0320;
                case 33: goto L_0x0314;
                case 34: goto L_0x0308;
                case 35: goto L_0x02f0;
                case 36: goto L_0x02db;
                case 37: goto L_0x02c6;
                case 38: goto L_0x02b1;
                case 39: goto L_0x029c;
                case 40: goto L_0x0287;
                case 41: goto L_0x0271;
                case 42: goto L_0x025b;
                case 43: goto L_0x0245;
                case 44: goto L_0x022f;
                case 45: goto L_0x0219;
                case 46: goto L_0x0203;
                case 47: goto L_0x01ed;
                case 48: goto L_0x01d7;
                case 49: goto L_0x01c7;
                case 50: goto L_0x01ba;
                case 51: goto L_0x01ac;
                case 52: goto L_0x019e;
                case 53: goto L_0x0188;
                case 54: goto L_0x0172;
                case 55: goto L_0x015c;
                case 56: goto L_0x014e;
                case 57: goto L_0x0140;
                case 58: goto L_0x0132;
                case 59: goto L_0x0104;
                case 60: goto L_0x00f0;
                case 61: goto L_0x00d4;
                case 62: goto L_0x00be;
                case 63: goto L_0x00a8;
                case 64: goto L_0x009a;
                case 65: goto L_0x008c;
                case 66: goto L_0x0071;
                case 67: goto L_0x0057;
                case 68: goto L_0x0041;
                default: goto L_0x003f;
            }
        L_0x003f:
            goto L_0x0532
        L_0x0041:
            boolean r7 = r14.zzT(r15, r8, r3)
            if (r7 == 0) goto L_0x0532
            java.lang.Object r7 = r0.getObject(r15, r12)
            com.google.android.gms.internal.gtm.zzwk r7 = (com.google.android.gms.internal.gtm.zzwk) r7
            com.google.android.gms.internal.gtm.zzwx r9 = r14.zzF(r3)
            int r7 = com.google.android.gms.internal.gtm.zzto.zzv(r8, r7, r9)
            goto L_0x0486
        L_0x0057:
            boolean r9 = r14.zzT(r15, r8, r3)
            if (r9 == 0) goto L_0x0532
            long r9 = zzD(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.gtm.zzto.zzD(r8)
            long r11 = r9 + r9
            long r9 = r9 >> r7
            long r9 = r9 ^ r11
            int r7 = com.google.android.gms.internal.gtm.zzto.zzE(r9)
            goto L_0x04eb
        L_0x0071:
            boolean r7 = r14.zzT(r15, r8, r3)
            if (r7 == 0) goto L_0x0532
            int r7 = zzs(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.gtm.zzto.zzD(r8)
            int r9 = r7 + r7
            int r7 = r7 >> 31
            r7 = r7 ^ r9
            int r7 = com.google.android.gms.internal.gtm.zzto.zzD(r7)
            goto L_0x04eb
        L_0x008c:
            boolean r7 = r14.zzT(r15, r8, r3)
            if (r7 == 0) goto L_0x0532
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.gtm.zzto.zzD(r7)
            goto L_0x052e
        L_0x009a:
            boolean r7 = r14.zzT(r15, r8, r3)
            if (r7 == 0) goto L_0x0532
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.gtm.zzto.zzD(r7)
            goto L_0x0520
        L_0x00a8:
            boolean r7 = r14.zzT(r15, r8, r3)
            if (r7 == 0) goto L_0x0532
            int r7 = zzs(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.gtm.zzto.zzD(r8)
            int r7 = com.google.android.gms.internal.gtm.zzto.zzx(r7)
            goto L_0x04eb
        L_0x00be:
            boolean r7 = r14.zzT(r15, r8, r3)
            if (r7 == 0) goto L_0x0532
            int r7 = zzs(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.gtm.zzto.zzD(r8)
            int r7 = com.google.android.gms.internal.gtm.zzto.zzD(r7)
            goto L_0x04eb
        L_0x00d4:
            boolean r7 = r14.zzT(r15, r8, r3)
            if (r7 == 0) goto L_0x0532
            java.lang.Object r7 = r0.getObject(r15, r12)
            com.google.android.gms.internal.gtm.zztd r7 = (com.google.android.gms.internal.gtm.zztd) r7
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.gtm.zzto.zzD(r8)
            int r7 = r7.zzd()
            int r9 = com.google.android.gms.internal.gtm.zzto.zzD(r7)
            goto L_0x04a5
        L_0x00f0:
            boolean r7 = r14.zzT(r15, r8, r3)
            if (r7 == 0) goto L_0x0532
            java.lang.Object r7 = r0.getObject(r15, r12)
            com.google.android.gms.internal.gtm.zzwx r9 = r14.zzF(r3)
            int r7 = com.google.android.gms.internal.gtm.zzwz.zzo(r8, r7, r9)
            goto L_0x0486
        L_0x0104:
            boolean r7 = r14.zzT(r15, r8, r3)
            if (r7 == 0) goto L_0x0532
            java.lang.Object r7 = r0.getObject(r15, r12)
            boolean r9 = r7 instanceof com.google.android.gms.internal.gtm.zztd
            if (r9 == 0) goto L_0x0124
            com.google.android.gms.internal.gtm.zztd r7 = (com.google.android.gms.internal.gtm.zztd) r7
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.gtm.zzto.zzD(r8)
            int r7 = r7.zzd()
            int r9 = com.google.android.gms.internal.gtm.zzto.zzD(r7)
            goto L_0x04a5
        L_0x0124:
            java.lang.String r7 = (java.lang.String) r7
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.gtm.zzto.zzD(r8)
            int r7 = com.google.android.gms.internal.gtm.zzto.zzB(r7)
            goto L_0x04eb
        L_0x0132:
            boolean r7 = r14.zzT(r15, r8, r3)
            if (r7 == 0) goto L_0x0532
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.gtm.zzto.zzD(r7)
            goto L_0x04c1
        L_0x0140:
            boolean r7 = r14.zzT(r15, r8, r3)
            if (r7 == 0) goto L_0x0532
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.gtm.zzto.zzD(r7)
            goto L_0x0520
        L_0x014e:
            boolean r7 = r14.zzT(r15, r8, r3)
            if (r7 == 0) goto L_0x0532
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.gtm.zzto.zzD(r7)
            goto L_0x052e
        L_0x015c:
            boolean r7 = r14.zzT(r15, r8, r3)
            if (r7 == 0) goto L_0x0532
            int r7 = zzs(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.gtm.zzto.zzD(r8)
            int r7 = com.google.android.gms.internal.gtm.zzto.zzx(r7)
            goto L_0x04eb
        L_0x0172:
            boolean r7 = r14.zzT(r15, r8, r3)
            if (r7 == 0) goto L_0x0532
            long r9 = zzD(r15, r12)
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.gtm.zzto.zzD(r7)
            int r8 = com.google.android.gms.internal.gtm.zzto.zzE(r9)
            goto L_0x0512
        L_0x0188:
            boolean r7 = r14.zzT(r15, r8, r3)
            if (r7 == 0) goto L_0x0532
            long r9 = zzD(r15, r12)
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.gtm.zzto.zzD(r7)
            int r8 = com.google.android.gms.internal.gtm.zzto.zzE(r9)
            goto L_0x0512
        L_0x019e:
            boolean r7 = r14.zzT(r15, r8, r3)
            if (r7 == 0) goto L_0x0532
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.gtm.zzto.zzD(r7)
            goto L_0x0520
        L_0x01ac:
            boolean r7 = r14.zzT(r15, r8, r3)
            if (r7 == 0) goto L_0x0532
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.gtm.zzto.zzD(r7)
            goto L_0x052e
        L_0x01ba:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.lang.Object r9 = r14.zzH(r3)
            com.google.android.gms.internal.gtm.zzwf.zza(r8, r7, r9)
            goto L_0x0532
        L_0x01c7:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.gtm.zzwx r9 = r14.zzF(r3)
            int r7 = com.google.android.gms.internal.gtm.zzwz.zzj(r8, r7, r9)
            goto L_0x0486
        L_0x01d7:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.gtm.zzwz.zzt(r7)
            if (r7 <= 0) goto L_0x0532
            int r8 = com.google.android.gms.internal.gtm.zzto.zzC(r8)
            int r9 = com.google.android.gms.internal.gtm.zzto.zzD(r7)
            goto L_0x0304
        L_0x01ed:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.gtm.zzwz.zzr(r7)
            if (r7 <= 0) goto L_0x0532
            int r8 = com.google.android.gms.internal.gtm.zzto.zzC(r8)
            int r9 = com.google.android.gms.internal.gtm.zzto.zzD(r7)
            goto L_0x0304
        L_0x0203:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.gtm.zzwz.zzi(r7)
            if (r7 <= 0) goto L_0x0532
            int r8 = com.google.android.gms.internal.gtm.zzto.zzC(r8)
            int r9 = com.google.android.gms.internal.gtm.zzto.zzD(r7)
            goto L_0x0304
        L_0x0219:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.gtm.zzwz.zzg(r7)
            if (r7 <= 0) goto L_0x0532
            int r8 = com.google.android.gms.internal.gtm.zzto.zzC(r8)
            int r9 = com.google.android.gms.internal.gtm.zzto.zzD(r7)
            goto L_0x0304
        L_0x022f:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.gtm.zzwz.zze(r7)
            if (r7 <= 0) goto L_0x0532
            int r8 = com.google.android.gms.internal.gtm.zzto.zzC(r8)
            int r9 = com.google.android.gms.internal.gtm.zzto.zzD(r7)
            goto L_0x0304
        L_0x0245:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.gtm.zzwz.zzw(r7)
            if (r7 <= 0) goto L_0x0532
            int r8 = com.google.android.gms.internal.gtm.zzto.zzC(r8)
            int r9 = com.google.android.gms.internal.gtm.zzto.zzD(r7)
            goto L_0x0304
        L_0x025b:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.gtm.zzwz.zzb(r7)
            if (r7 <= 0) goto L_0x0532
            int r8 = com.google.android.gms.internal.gtm.zzto.zzC(r8)
            int r9 = com.google.android.gms.internal.gtm.zzto.zzD(r7)
            goto L_0x0304
        L_0x0271:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.gtm.zzwz.zzg(r7)
            if (r7 <= 0) goto L_0x0532
            int r8 = com.google.android.gms.internal.gtm.zzto.zzC(r8)
            int r9 = com.google.android.gms.internal.gtm.zzto.zzD(r7)
            goto L_0x0304
        L_0x0287:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.gtm.zzwz.zzi(r7)
            if (r7 <= 0) goto L_0x0532
            int r8 = com.google.android.gms.internal.gtm.zzto.zzC(r8)
            int r9 = com.google.android.gms.internal.gtm.zzto.zzD(r7)
            goto L_0x0304
        L_0x029c:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.gtm.zzwz.zzl(r7)
            if (r7 <= 0) goto L_0x0532
            int r8 = com.google.android.gms.internal.gtm.zzto.zzC(r8)
            int r9 = com.google.android.gms.internal.gtm.zzto.zzD(r7)
            goto L_0x0304
        L_0x02b1:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.gtm.zzwz.zzy(r7)
            if (r7 <= 0) goto L_0x0532
            int r8 = com.google.android.gms.internal.gtm.zzto.zzC(r8)
            int r9 = com.google.android.gms.internal.gtm.zzto.zzD(r7)
            goto L_0x0304
        L_0x02c6:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.gtm.zzwz.zzn(r7)
            if (r7 <= 0) goto L_0x0532
            int r8 = com.google.android.gms.internal.gtm.zzto.zzC(r8)
            int r9 = com.google.android.gms.internal.gtm.zzto.zzD(r7)
            goto L_0x0304
        L_0x02db:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.gtm.zzwz.zzg(r7)
            if (r7 <= 0) goto L_0x0532
            int r8 = com.google.android.gms.internal.gtm.zzto.zzC(r8)
            int r9 = com.google.android.gms.internal.gtm.zzto.zzD(r7)
            goto L_0x0304
        L_0x02f0:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.gtm.zzwz.zzi(r7)
            if (r7 <= 0) goto L_0x0532
            int r8 = com.google.android.gms.internal.gtm.zzto.zzC(r8)
            int r9 = com.google.android.gms.internal.gtm.zzto.zzD(r7)
        L_0x0304:
            int r9 = r9 + r8
            int r9 = r9 + r7
            goto L_0x04a7
        L_0x0308:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.gtm.zzwz.zzs(r8, r7, r2)
            goto L_0x0486
        L_0x0314:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.gtm.zzwz.zzq(r8, r7, r2)
            goto L_0x0486
        L_0x0320:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.gtm.zzwz.zzh(r8, r7, r2)
            goto L_0x0486
        L_0x032c:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.gtm.zzwz.zzf(r8, r7, r2)
            goto L_0x0486
        L_0x0338:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.gtm.zzwz.zzd(r8, r7, r2)
            goto L_0x0486
        L_0x0344:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.gtm.zzwz.zzv(r8, r7, r2)
            goto L_0x0486
        L_0x0350:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.gtm.zzwz.zzc(r8, r7)
            goto L_0x0486
        L_0x035c:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.gtm.zzwx r9 = r14.zzF(r3)
            int r7 = com.google.android.gms.internal.gtm.zzwz.zzp(r8, r7, r9)
            goto L_0x0486
        L_0x036c:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.gtm.zzwz.zzu(r8, r7)
            goto L_0x0486
        L_0x0378:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.gtm.zzwz.zza(r8, r7, r2)
            goto L_0x0486
        L_0x0384:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.gtm.zzwz.zzf(r8, r7, r2)
            goto L_0x0486
        L_0x0390:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.gtm.zzwz.zzh(r8, r7, r2)
            goto L_0x0486
        L_0x039c:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.gtm.zzwz.zzk(r8, r7, r2)
            goto L_0x0486
        L_0x03a8:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.gtm.zzwz.zzx(r8, r7, r2)
            goto L_0x0486
        L_0x03b4:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.gtm.zzwz.zzm(r8, r7, r2)
            goto L_0x0486
        L_0x03c0:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.gtm.zzwz.zzf(r8, r7, r2)
            goto L_0x0486
        L_0x03cc:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.gtm.zzwz.zzh(r8, r7, r2)
            goto L_0x0486
        L_0x03d8:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0532
            java.lang.Object r7 = r0.getObject(r15, r12)
            com.google.android.gms.internal.gtm.zzwk r7 = (com.google.android.gms.internal.gtm.zzwk) r7
            com.google.android.gms.internal.gtm.zzwx r9 = r14.zzF(r3)
            int r7 = com.google.android.gms.internal.gtm.zzto.zzv(r8, r7, r9)
            goto L_0x0486
        L_0x03ec:
            r9 = r5 & r10
            if (r9 == 0) goto L_0x0532
            long r9 = r0.getLong(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.gtm.zzto.zzD(r8)
            long r11 = r9 + r9
            long r9 = r9 >> r7
            long r9 = r9 ^ r11
            int r7 = com.google.android.gms.internal.gtm.zzto.zzE(r9)
            goto L_0x04eb
        L_0x0404:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0532
            int r7 = r0.getInt(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.gtm.zzto.zzD(r8)
            int r9 = r7 + r7
            int r7 = r7 >> 31
            r7 = r7 ^ r9
            int r7 = com.google.android.gms.internal.gtm.zzto.zzD(r7)
            goto L_0x04eb
        L_0x041d:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0532
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.gtm.zzto.zzD(r7)
            goto L_0x052e
        L_0x0429:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0532
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.gtm.zzto.zzD(r7)
            goto L_0x0520
        L_0x0435:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0532
            int r7 = r0.getInt(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.gtm.zzto.zzD(r8)
            int r7 = com.google.android.gms.internal.gtm.zzto.zzx(r7)
            goto L_0x04eb
        L_0x0449:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0532
            int r7 = r0.getInt(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.gtm.zzto.zzD(r8)
            int r7 = com.google.android.gms.internal.gtm.zzto.zzD(r7)
            goto L_0x04eb
        L_0x045d:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0532
            java.lang.Object r7 = r0.getObject(r15, r12)
            com.google.android.gms.internal.gtm.zztd r7 = (com.google.android.gms.internal.gtm.zztd) r7
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.gtm.zzto.zzD(r8)
            int r7 = r7.zzd()
            int r9 = com.google.android.gms.internal.gtm.zzto.zzD(r7)
            goto L_0x04a5
        L_0x0476:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0532
            java.lang.Object r7 = r0.getObject(r15, r12)
            com.google.android.gms.internal.gtm.zzwx r9 = r14.zzF(r3)
            int r7 = com.google.android.gms.internal.gtm.zzwz.zzo(r8, r7, r9)
        L_0x0486:
            int r4 = r4 + r7
            goto L_0x0532
        L_0x0489:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0532
            java.lang.Object r7 = r0.getObject(r15, r12)
            boolean r9 = r7 instanceof com.google.android.gms.internal.gtm.zztd
            if (r9 == 0) goto L_0x04aa
            com.google.android.gms.internal.gtm.zztd r7 = (com.google.android.gms.internal.gtm.zztd) r7
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.gtm.zzto.zzD(r8)
            int r7 = r7.zzd()
            int r9 = com.google.android.gms.internal.gtm.zzto.zzD(r7)
        L_0x04a5:
            int r9 = r9 + r7
            int r9 = r9 + r8
        L_0x04a7:
            int r4 = r4 + r9
            goto L_0x0532
        L_0x04aa:
            java.lang.String r7 = (java.lang.String) r7
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.gtm.zzto.zzD(r8)
            int r7 = com.google.android.gms.internal.gtm.zzto.zzB(r7)
            goto L_0x04eb
        L_0x04b7:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0532
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.gtm.zzto.zzD(r7)
        L_0x04c1:
            int r7 = r7 + r11
            goto L_0x0486
        L_0x04c3:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0532
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.gtm.zzto.zzD(r7)
            goto L_0x0520
        L_0x04ce:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0532
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.gtm.zzto.zzD(r7)
            goto L_0x052e
        L_0x04d9:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0532
            int r7 = r0.getInt(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.gtm.zzto.zzD(r8)
            int r7 = com.google.android.gms.internal.gtm.zzto.zzx(r7)
        L_0x04eb:
            int r7 = r7 + r8
            goto L_0x0486
        L_0x04ed:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0532
            long r9 = r0.getLong(r15, r12)
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.gtm.zzto.zzD(r7)
            int r8 = com.google.android.gms.internal.gtm.zzto.zzE(r9)
            goto L_0x0512
        L_0x0500:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0532
            long r9 = r0.getLong(r15, r12)
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.gtm.zzto.zzD(r7)
            int r8 = com.google.android.gms.internal.gtm.zzto.zzE(r9)
        L_0x0512:
            int r8 = r8 + r7
            int r8 = r8 + r4
            r4 = r8
            goto L_0x0532
        L_0x0516:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0532
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.gtm.zzto.zzD(r7)
        L_0x0520:
            int r7 = r7 + 4
            goto L_0x0486
        L_0x0524:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0532
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.gtm.zzto.zzD(r7)
        L_0x052e:
            int r7 = r7 + 8
            goto L_0x0486
        L_0x0532:
            int r3 = r3 + 3
            goto L_0x000c
        L_0x0536:
            com.google.android.gms.internal.gtm.zzxo<?, ?> r0 = r14.zzo
            java.lang.Object r1 = r0.zzd(r15)
            int r0 = r0.zza(r1)
            int r4 = r4 + r0
            boolean r0 = r14.zzh
            if (r0 == 0) goto L_0x0593
            com.google.android.gms.internal.gtm.zzuk<?> r0 = r14.zzp
            com.google.android.gms.internal.gtm.zzuo r15 = r0.zzb(r15)
            r0 = 0
        L_0x054c:
            com.google.android.gms.internal.gtm.zzxk<T, java.lang.Object> r1 = r15.zza
            int r1 = r1.zzb()
            if (r2 >= r1) goto L_0x056c
            com.google.android.gms.internal.gtm.zzxk<T, java.lang.Object> r1 = r15.zza
            java.util.Map$Entry r1 = r1.zzg(r2)
            java.lang.Object r3 = r1.getKey()
            com.google.android.gms.internal.gtm.zzun r3 = (com.google.android.gms.internal.gtm.zzun) r3
            java.lang.Object r1 = r1.getValue()
            int r1 = com.google.android.gms.internal.gtm.zzuo.zza(r3, r1)
            int r0 = r0 + r1
            int r2 = r2 + 1
            goto L_0x054c
        L_0x056c:
            com.google.android.gms.internal.gtm.zzxk<T, java.lang.Object> r15 = r15.zza
            java.lang.Iterable r15 = r15.zzc()
            java.util.Iterator r15 = r15.iterator()
        L_0x0576:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L_0x0592
            java.lang.Object r1 = r15.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            com.google.android.gms.internal.gtm.zzun r2 = (com.google.android.gms.internal.gtm.zzun) r2
            java.lang.Object r1 = r1.getValue()
            int r1 = com.google.android.gms.internal.gtm.zzuo.zza(r2, r1)
            int r0 = r0 + r1
            goto L_0x0576
        L_0x0592:
            int r4 = r4 + r0
        L_0x0593:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzwn.zzq(java.lang.Object):int");
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
    private final int zzr(T r12) {
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
            int r4 = r11.zzC(r2)
            int r5 = zzB(r4)
            int[] r6 = r11.zzc
            r6 = r6[r2]
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r7
            long r7 = (long) r4
            com.google.android.gms.internal.gtm.zzup r4 = com.google.android.gms.internal.gtm.zzup.DOUBLE_LIST_PACKED
            int r4 = r4.zza()
            if (r5 < r4) goto L_0x0031
            com.google.android.gms.internal.gtm.zzup r4 = com.google.android.gms.internal.gtm.zzup.SINT64_LIST_PACKED
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
            boolean r4 = r11.zzT(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            java.lang.Object r4 = com.google.android.gms.internal.gtm.zzxy.zzf(r12, r7)
            com.google.android.gms.internal.gtm.zzwk r4 = (com.google.android.gms.internal.gtm.zzwk) r4
            com.google.android.gms.internal.gtm.zzwx r5 = r11.zzF(r2)
            int r4 = com.google.android.gms.internal.gtm.zzto.zzv(r6, r4, r5)
            goto L_0x0491
        L_0x004e:
            boolean r5 = r11.zzT(r12, r6, r2)
            if (r5 == 0) goto L_0x054f
            long r7 = zzD(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.gtm.zzto.zzD(r5)
            long r9 = r7 + r7
            long r6 = r7 >> r4
            long r6 = r6 ^ r9
            int r4 = com.google.android.gms.internal.gtm.zzto.zzE(r6)
            goto L_0x0501
        L_0x0069:
            boolean r4 = r11.zzT(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = zzs(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.gtm.zzto.zzD(r5)
            int r6 = r4 + r4
            int r4 = r4 >> 31
            r4 = r4 ^ r6
            int r4 = com.google.android.gms.internal.gtm.zzto.zzD(r4)
            goto L_0x0501
        L_0x0084:
            boolean r4 = r11.zzT(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.gtm.zzto.zzD(r4)
            goto L_0x054b
        L_0x0092:
            boolean r4 = r11.zzT(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.gtm.zzto.zzD(r4)
            goto L_0x053b
        L_0x00a0:
            boolean r4 = r11.zzT(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = zzs(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.gtm.zzto.zzD(r5)
            int r4 = com.google.android.gms.internal.gtm.zzto.zzx(r4)
            goto L_0x0501
        L_0x00b6:
            boolean r4 = r11.zzT(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = zzs(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.gtm.zzto.zzD(r5)
            int r4 = com.google.android.gms.internal.gtm.zzto.zzD(r4)
            goto L_0x0501
        L_0x00cc:
            boolean r4 = r11.zzT(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            java.lang.Object r4 = com.google.android.gms.internal.gtm.zzxy.zzf(r12, r7)
            com.google.android.gms.internal.gtm.zztd r4 = (com.google.android.gms.internal.gtm.zztd) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.gtm.zzto.zzD(r5)
            int r4 = r4.zzd()
            int r6 = com.google.android.gms.internal.gtm.zzto.zzD(r4)
            goto L_0x04b2
        L_0x00e8:
            boolean r4 = r11.zzT(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            java.lang.Object r4 = com.google.android.gms.internal.gtm.zzxy.zzf(r12, r7)
            com.google.android.gms.internal.gtm.zzwx r5 = r11.zzF(r2)
            int r4 = com.google.android.gms.internal.gtm.zzwz.zzo(r6, r4, r5)
            goto L_0x0491
        L_0x00fc:
            boolean r4 = r11.zzT(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            java.lang.Object r4 = com.google.android.gms.internal.gtm.zzxy.zzf(r12, r7)
            boolean r5 = r4 instanceof com.google.android.gms.internal.gtm.zztd
            if (r5 == 0) goto L_0x011c
            com.google.android.gms.internal.gtm.zztd r4 = (com.google.android.gms.internal.gtm.zztd) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.gtm.zzto.zzD(r5)
            int r4 = r4.zzd()
            int r6 = com.google.android.gms.internal.gtm.zzto.zzD(r4)
            goto L_0x04b2
        L_0x011c:
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.gtm.zzto.zzD(r5)
            int r4 = com.google.android.gms.internal.gtm.zzto.zzB(r4)
            goto L_0x0501
        L_0x012a:
            boolean r4 = r11.zzT(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.gtm.zzto.zzD(r4)
            goto L_0x04d0
        L_0x0138:
            boolean r4 = r11.zzT(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.gtm.zzto.zzD(r4)
            goto L_0x053b
        L_0x0146:
            boolean r4 = r11.zzT(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.gtm.zzto.zzD(r4)
            goto L_0x054b
        L_0x0154:
            boolean r4 = r11.zzT(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = zzs(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.gtm.zzto.zzD(r5)
            int r4 = com.google.android.gms.internal.gtm.zzto.zzx(r4)
            goto L_0x0501
        L_0x016a:
            boolean r4 = r11.zzT(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            long r4 = zzD(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.gtm.zzto.zzD(r6)
            int r4 = com.google.android.gms.internal.gtm.zzto.zzE(r4)
            goto L_0x052c
        L_0x0180:
            boolean r4 = r11.zzT(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            long r4 = zzD(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.gtm.zzto.zzD(r6)
            int r4 = com.google.android.gms.internal.gtm.zzto.zzE(r4)
            goto L_0x052c
        L_0x0196:
            boolean r4 = r11.zzT(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.gtm.zzto.zzD(r4)
            goto L_0x053b
        L_0x01a4:
            boolean r4 = r11.zzT(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.gtm.zzto.zzD(r4)
            goto L_0x054b
        L_0x01b2:
            java.lang.Object r4 = com.google.android.gms.internal.gtm.zzxy.zzf(r12, r7)
            java.lang.Object r5 = r11.zzH(r2)
            com.google.android.gms.internal.gtm.zzwf.zza(r6, r4, r5)
            goto L_0x054f
        L_0x01bf:
            java.lang.Object r4 = com.google.android.gms.internal.gtm.zzxy.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.gtm.zzwx r5 = r11.zzF(r2)
            int r4 = com.google.android.gms.internal.gtm.zzwz.zzj(r6, r4, r5)
            goto L_0x0491
        L_0x01cf:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.gtm.zzwz.zzt(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.gtm.zzto.zzC(r6)
            int r6 = com.google.android.gms.internal.gtm.zzto.zzD(r4)
            goto L_0x02fc
        L_0x01e5:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.gtm.zzwz.zzr(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.gtm.zzto.zzC(r6)
            int r6 = com.google.android.gms.internal.gtm.zzto.zzD(r4)
            goto L_0x02fc
        L_0x01fb:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.gtm.zzwz.zzi(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.gtm.zzto.zzC(r6)
            int r6 = com.google.android.gms.internal.gtm.zzto.zzD(r4)
            goto L_0x02fc
        L_0x0211:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.gtm.zzwz.zzg(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.gtm.zzto.zzC(r6)
            int r6 = com.google.android.gms.internal.gtm.zzto.zzD(r4)
            goto L_0x02fc
        L_0x0227:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.gtm.zzwz.zze(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.gtm.zzto.zzC(r6)
            int r6 = com.google.android.gms.internal.gtm.zzto.zzD(r4)
            goto L_0x02fc
        L_0x023d:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.gtm.zzwz.zzw(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.gtm.zzto.zzC(r6)
            int r6 = com.google.android.gms.internal.gtm.zzto.zzD(r4)
            goto L_0x02fc
        L_0x0253:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.gtm.zzwz.zzb(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.gtm.zzto.zzC(r6)
            int r6 = com.google.android.gms.internal.gtm.zzto.zzD(r4)
            goto L_0x02fc
        L_0x0269:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.gtm.zzwz.zzg(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.gtm.zzto.zzC(r6)
            int r6 = com.google.android.gms.internal.gtm.zzto.zzD(r4)
            goto L_0x02fc
        L_0x027f:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.gtm.zzwz.zzi(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.gtm.zzto.zzC(r6)
            int r6 = com.google.android.gms.internal.gtm.zzto.zzD(r4)
            goto L_0x02fc
        L_0x0294:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.gtm.zzwz.zzl(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.gtm.zzto.zzC(r6)
            int r6 = com.google.android.gms.internal.gtm.zzto.zzD(r4)
            goto L_0x02fc
        L_0x02a9:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.gtm.zzwz.zzy(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.gtm.zzto.zzC(r6)
            int r6 = com.google.android.gms.internal.gtm.zzto.zzD(r4)
            goto L_0x02fc
        L_0x02be:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.gtm.zzwz.zzn(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.gtm.zzto.zzC(r6)
            int r6 = com.google.android.gms.internal.gtm.zzto.zzD(r4)
            goto L_0x02fc
        L_0x02d3:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.gtm.zzwz.zzg(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.gtm.zzto.zzC(r6)
            int r6 = com.google.android.gms.internal.gtm.zzto.zzD(r4)
            goto L_0x02fc
        L_0x02e8:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.gtm.zzwz.zzi(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.gtm.zzto.zzC(r6)
            int r6 = com.google.android.gms.internal.gtm.zzto.zzD(r4)
        L_0x02fc:
            int r6 = r6 + r5
            int r6 = r6 + r4
            goto L_0x04b4
        L_0x0300:
            java.lang.Object r4 = com.google.android.gms.internal.gtm.zzxy.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.gtm.zzwz.zzs(r6, r4, r1)
            goto L_0x0491
        L_0x030c:
            java.lang.Object r4 = com.google.android.gms.internal.gtm.zzxy.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.gtm.zzwz.zzq(r6, r4, r1)
            goto L_0x0491
        L_0x0318:
            java.lang.Object r4 = com.google.android.gms.internal.gtm.zzxy.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.gtm.zzwz.zzh(r6, r4, r1)
            goto L_0x0491
        L_0x0324:
            java.lang.Object r4 = com.google.android.gms.internal.gtm.zzxy.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.gtm.zzwz.zzf(r6, r4, r1)
            goto L_0x0491
        L_0x0330:
            java.lang.Object r4 = com.google.android.gms.internal.gtm.zzxy.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.gtm.zzwz.zzd(r6, r4, r1)
            goto L_0x0491
        L_0x033c:
            java.lang.Object r4 = com.google.android.gms.internal.gtm.zzxy.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.gtm.zzwz.zzv(r6, r4, r1)
            goto L_0x0491
        L_0x0348:
            java.lang.Object r4 = com.google.android.gms.internal.gtm.zzxy.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.gtm.zzwz.zzc(r6, r4)
            goto L_0x0491
        L_0x0354:
            java.lang.Object r4 = com.google.android.gms.internal.gtm.zzxy.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.gtm.zzwx r5 = r11.zzF(r2)
            int r4 = com.google.android.gms.internal.gtm.zzwz.zzp(r6, r4, r5)
            goto L_0x0491
        L_0x0364:
            java.lang.Object r4 = com.google.android.gms.internal.gtm.zzxy.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.gtm.zzwz.zzu(r6, r4)
            goto L_0x0491
        L_0x0370:
            java.lang.Object r4 = com.google.android.gms.internal.gtm.zzxy.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.gtm.zzwz.zza(r6, r4, r1)
            goto L_0x0491
        L_0x037c:
            java.lang.Object r4 = com.google.android.gms.internal.gtm.zzxy.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.gtm.zzwz.zzf(r6, r4, r1)
            goto L_0x0491
        L_0x0388:
            java.lang.Object r4 = com.google.android.gms.internal.gtm.zzxy.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.gtm.zzwz.zzh(r6, r4, r1)
            goto L_0x0491
        L_0x0394:
            java.lang.Object r4 = com.google.android.gms.internal.gtm.zzxy.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.gtm.zzwz.zzk(r6, r4, r1)
            goto L_0x0491
        L_0x03a0:
            java.lang.Object r4 = com.google.android.gms.internal.gtm.zzxy.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.gtm.zzwz.zzx(r6, r4, r1)
            goto L_0x0491
        L_0x03ac:
            java.lang.Object r4 = com.google.android.gms.internal.gtm.zzxy.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.gtm.zzwz.zzm(r6, r4, r1)
            goto L_0x0491
        L_0x03b8:
            java.lang.Object r4 = com.google.android.gms.internal.gtm.zzxy.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.gtm.zzwz.zzf(r6, r4, r1)
            goto L_0x0491
        L_0x03c4:
            java.lang.Object r4 = com.google.android.gms.internal.gtm.zzxy.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.gtm.zzwz.zzh(r6, r4, r1)
            goto L_0x0491
        L_0x03d0:
            boolean r4 = r11.zzQ(r12, r2)
            if (r4 == 0) goto L_0x054f
            java.lang.Object r4 = com.google.android.gms.internal.gtm.zzxy.zzf(r12, r7)
            com.google.android.gms.internal.gtm.zzwk r4 = (com.google.android.gms.internal.gtm.zzwk) r4
            com.google.android.gms.internal.gtm.zzwx r5 = r11.zzF(r2)
            int r4 = com.google.android.gms.internal.gtm.zzto.zzv(r6, r4, r5)
            goto L_0x0491
        L_0x03e6:
            boolean r5 = r11.zzQ(r12, r2)
            if (r5 == 0) goto L_0x054f
            long r7 = com.google.android.gms.internal.gtm.zzxy.zzd(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.gtm.zzto.zzD(r5)
            long r9 = r7 + r7
            long r6 = r7 >> r4
            long r6 = r6 ^ r9
            int r4 = com.google.android.gms.internal.gtm.zzto.zzE(r6)
            goto L_0x0501
        L_0x0401:
            boolean r4 = r11.zzQ(r12, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = com.google.android.gms.internal.gtm.zzxy.zzc(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.gtm.zzto.zzD(r5)
            int r6 = r4 + r4
            int r4 = r4 >> 31
            r4 = r4 ^ r6
            int r4 = com.google.android.gms.internal.gtm.zzto.zzD(r4)
            goto L_0x0501
        L_0x041c:
            boolean r4 = r11.zzQ(r12, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.gtm.zzto.zzD(r4)
            goto L_0x054b
        L_0x042a:
            boolean r4 = r11.zzQ(r12, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.gtm.zzto.zzD(r4)
            goto L_0x053b
        L_0x0438:
            boolean r4 = r11.zzQ(r12, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = com.google.android.gms.internal.gtm.zzxy.zzc(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.gtm.zzto.zzD(r5)
            int r4 = com.google.android.gms.internal.gtm.zzto.zzx(r4)
            goto L_0x0501
        L_0x044e:
            boolean r4 = r11.zzQ(r12, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = com.google.android.gms.internal.gtm.zzxy.zzc(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.gtm.zzto.zzD(r5)
            int r4 = com.google.android.gms.internal.gtm.zzto.zzD(r4)
            goto L_0x0501
        L_0x0464:
            boolean r4 = r11.zzQ(r12, r2)
            if (r4 == 0) goto L_0x054f
            java.lang.Object r4 = com.google.android.gms.internal.gtm.zzxy.zzf(r12, r7)
            com.google.android.gms.internal.gtm.zztd r4 = (com.google.android.gms.internal.gtm.zztd) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.gtm.zzto.zzD(r5)
            int r4 = r4.zzd()
            int r6 = com.google.android.gms.internal.gtm.zzto.zzD(r4)
            goto L_0x04b2
        L_0x047f:
            boolean r4 = r11.zzQ(r12, r2)
            if (r4 == 0) goto L_0x054f
            java.lang.Object r4 = com.google.android.gms.internal.gtm.zzxy.zzf(r12, r7)
            com.google.android.gms.internal.gtm.zzwx r5 = r11.zzF(r2)
            int r4 = com.google.android.gms.internal.gtm.zzwz.zzo(r6, r4, r5)
        L_0x0491:
            int r3 = r3 + r4
            goto L_0x054f
        L_0x0494:
            boolean r4 = r11.zzQ(r12, r2)
            if (r4 == 0) goto L_0x054f
            java.lang.Object r4 = com.google.android.gms.internal.gtm.zzxy.zzf(r12, r7)
            boolean r5 = r4 instanceof com.google.android.gms.internal.gtm.zztd
            if (r5 == 0) goto L_0x04b7
            com.google.android.gms.internal.gtm.zztd r4 = (com.google.android.gms.internal.gtm.zztd) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.gtm.zzto.zzD(r5)
            int r4 = r4.zzd()
            int r6 = com.google.android.gms.internal.gtm.zzto.zzD(r4)
        L_0x04b2:
            int r6 = r6 + r4
            int r6 = r6 + r5
        L_0x04b4:
            int r3 = r3 + r6
            goto L_0x054f
        L_0x04b7:
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.gtm.zzto.zzD(r5)
            int r4 = com.google.android.gms.internal.gtm.zzto.zzB(r4)
            goto L_0x0501
        L_0x04c4:
            boolean r4 = r11.zzQ(r12, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.gtm.zzto.zzD(r4)
        L_0x04d0:
            int r4 = r4 + 1
            goto L_0x0491
        L_0x04d3:
            boolean r4 = r11.zzQ(r12, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.gtm.zzto.zzD(r4)
            goto L_0x053b
        L_0x04e0:
            boolean r4 = r11.zzQ(r12, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.gtm.zzto.zzD(r4)
            goto L_0x054b
        L_0x04ed:
            boolean r4 = r11.zzQ(r12, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = com.google.android.gms.internal.gtm.zzxy.zzc(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.gtm.zzto.zzD(r5)
            int r4 = com.google.android.gms.internal.gtm.zzto.zzx(r4)
        L_0x0501:
            int r4 = r4 + r5
            goto L_0x0491
        L_0x0503:
            boolean r4 = r11.zzQ(r12, r2)
            if (r4 == 0) goto L_0x054f
            long r4 = com.google.android.gms.internal.gtm.zzxy.zzd(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.gtm.zzto.zzD(r6)
            int r4 = com.google.android.gms.internal.gtm.zzto.zzE(r4)
            goto L_0x052c
        L_0x0518:
            boolean r4 = r11.zzQ(r12, r2)
            if (r4 == 0) goto L_0x054f
            long r4 = com.google.android.gms.internal.gtm.zzxy.zzd(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.gtm.zzto.zzD(r6)
            int r4 = com.google.android.gms.internal.gtm.zzto.zzE(r4)
        L_0x052c:
            int r4 = r4 + r6
            goto L_0x0491
        L_0x052f:
            boolean r4 = r11.zzQ(r12, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.gtm.zzto.zzD(r4)
        L_0x053b:
            int r4 = r4 + 4
            goto L_0x0491
        L_0x053f:
            boolean r4 = r11.zzQ(r12, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.gtm.zzto.zzD(r4)
        L_0x054b:
            int r4 = r4 + 8
            goto L_0x0491
        L_0x054f:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x0553:
            com.google.android.gms.internal.gtm.zzxo<?, ?> r0 = r11.zzo
            java.lang.Object r12 = r0.zzd(r12)
            int r12 = r0.zza(r12)
            int r3 = r3 + r12
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzwn.zzr(java.lang.Object):int");
    }

    private static <T> int zzs(T t, long j) {
        return ((Integer) zzxy.zzf(t, j)).intValue();
    }

    private final <K, V> int zzt(T t, byte[] bArr, int i, int i2, int i3, long j, zzsl zzsl) throws IOException {
        Unsafe unsafe = zzb;
        Object zzH = zzH(i3);
        Object object = unsafe.getObject(t, j);
        if (zzwf.zzb(object)) {
            zzwe zzb2 = zzwe.zza().zzb();
            zzwf.zzc(zzb2, object);
            unsafe.putObject(t, j, zzb2);
        }
        zzwd zzwd = (zzwd) zzH;
        throw null;
    }

    private final int zzu(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, zzsl zzsl) throws IOException {
        boolean z;
        Object obj;
        Object obj2;
        T t2 = t;
        byte[] bArr2 = bArr;
        int i9 = i;
        int i11 = i3;
        int i12 = i4;
        int i13 = i5;
        long j2 = j;
        int i14 = i8;
        zzsl zzsl2 = zzsl;
        Unsafe unsafe = zzb;
        long j3 = (long) (this.zzc[i14 + 2] & 1048575);
        switch (i7) {
            case 51:
                if (i13 == 1) {
                    unsafe.putObject(t2, j2, Double.valueOf(Double.longBitsToDouble(zzsm.zzo(bArr, i))));
                    unsafe.putInt(t2, j3, i12);
                    return i9 + 8;
                }
                break;
            case 52:
                if (i13 == 5) {
                    unsafe.putObject(t2, j2, Float.valueOf(Float.intBitsToFloat(zzsm.zzb(bArr, i))));
                    unsafe.putInt(t2, j3, i12);
                    return i9 + 4;
                }
                break;
            case 53:
            case 54:
                if (i13 == 0) {
                    int zzm2 = zzsm.zzm(bArr2, i9, zzsl2);
                    unsafe.putObject(t2, j2, Long.valueOf(zzsl2.zzb));
                    unsafe.putInt(t2, j3, i12);
                    return zzm2;
                }
                break;
            case 55:
            case 62:
                if (i13 == 0) {
                    int zzj2 = zzsm.zzj(bArr2, i9, zzsl2);
                    unsafe.putObject(t2, j2, Integer.valueOf(zzsl2.zza));
                    unsafe.putInt(t2, j3, i12);
                    return zzj2;
                }
                break;
            case 56:
            case 65:
                if (i13 == 1) {
                    unsafe.putObject(t2, j2, Long.valueOf(zzsm.zzo(bArr, i)));
                    unsafe.putInt(t2, j3, i12);
                    return i9 + 8;
                }
                break;
            case 57:
            case 64:
                if (i13 == 5) {
                    unsafe.putObject(t2, j2, Integer.valueOf(zzsm.zzb(bArr, i)));
                    unsafe.putInt(t2, j3, i12);
                    return i9 + 4;
                }
                break;
            case 58:
                if (i13 == 0) {
                    int zzm3 = zzsm.zzm(bArr2, i9, zzsl2);
                    if (zzsl2.zzb != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    unsafe.putObject(t2, j2, Boolean.valueOf(z));
                    unsafe.putInt(t2, j3, i12);
                    return zzm3;
                }
                break;
            case 59:
                if (i13 == 2) {
                    int zzj3 = zzsm.zzj(bArr2, i9, zzsl2);
                    int i15 = zzsl2.zza;
                    if (i15 == 0) {
                        unsafe.putObject(t2, j2, "");
                    } else if ((i6 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) == 0 || zzyd.zzf(bArr2, zzj3, zzj3 + i15)) {
                        unsafe.putObject(t2, j2, new String(bArr2, zzj3, i15, zzvi.zza));
                        zzj3 += i15;
                    } else {
                        throw zzvk.zzd();
                    }
                    unsafe.putInt(t2, j3, i12);
                    return zzj3;
                }
                break;
            case 60:
                if (i13 == 2) {
                    int zzd2 = zzsm.zzd(zzF(i14), bArr2, i9, i2, zzsl2);
                    if (unsafe.getInt(t2, j3) == i12) {
                        obj = unsafe.getObject(t2, j2);
                    } else {
                        obj = null;
                    }
                    if (obj == null) {
                        unsafe.putObject(t2, j2, zzsl2.zzc);
                    } else {
                        unsafe.putObject(t2, j2, zzvi.zzg(obj, zzsl2.zzc));
                    }
                    unsafe.putInt(t2, j3, i12);
                    return zzd2;
                }
                break;
            case 61:
                if (i13 == 2) {
                    int zza2 = zzsm.zza(bArr2, i9, zzsl2);
                    unsafe.putObject(t2, j2, zzsl2.zzc);
                    unsafe.putInt(t2, j3, i12);
                    return zza2;
                }
                break;
            case 63:
                if (i13 == 0) {
                    int zzj4 = zzsm.zzj(bArr2, i9, zzsl2);
                    int i16 = zzsl2.zza;
                    zzvd zzE = zzE(i14);
                    if (zzE == null || zzE.zza(i16)) {
                        unsafe.putObject(t2, j2, Integer.valueOf(i16));
                        unsafe.putInt(t2, j3, i12);
                    } else {
                        zzd(t).zzh(i11, Long.valueOf((long) i16));
                    }
                    return zzj4;
                }
                break;
            case 66:
                if (i13 == 0) {
                    int zzj5 = zzsm.zzj(bArr2, i9, zzsl2);
                    unsafe.putObject(t2, j2, Integer.valueOf(zztj.zzs(zzsl2.zza)));
                    unsafe.putInt(t2, j3, i12);
                    return zzj5;
                }
                break;
            case 67:
                if (i13 == 0) {
                    int zzm4 = zzsm.zzm(bArr2, i9, zzsl2);
                    unsafe.putObject(t2, j2, Long.valueOf(zztj.zzt(zzsl2.zzb)));
                    unsafe.putInt(t2, j3, i12);
                    return zzm4;
                }
                break;
            case 68:
                if (i13 == 3) {
                    int zzc2 = zzsm.zzc(zzF(i14), bArr, i, i2, (i11 & -8) | 4, zzsl);
                    if (unsafe.getInt(t2, j3) == i12) {
                        obj2 = unsafe.getObject(t2, j2);
                    } else {
                        obj2 = null;
                    }
                    if (obj2 == null) {
                        unsafe.putObject(t2, j2, zzsl2.zzc);
                    } else {
                        unsafe.putObject(t2, j2, zzvi.zzg(obj2, zzsl2.zzc));
                    }
                    unsafe.putInt(t2, j3, i12);
                    return zzc2;
                }
                break;
        }
        return i9;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v5, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02a8, code lost:
        if (r0 != r15) goto L_0x02aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02be, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02f1, code lost:
        if (r0 != r15) goto L_0x02aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0314, code lost:
        if (r0 != r15) goto L_0x02aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x017d, code lost:
        r6 = r6 | r21;
        r9 = r10;
        r1 = r20;
        r8 = 1048575;
        r10 = -1;
        r29 = r13;
        r13 = r2;
        r2 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01d2, code lost:
        r6 = r6 | r21;
        r9 = r10;
        r2 = r13;
        r0 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0207, code lost:
        r6 = r6 | r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x020a, code lost:
        r2 = r4;
        r28 = r10;
        r19 = r13;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int zzv(T r31, byte[] r32, int r33, int r34, com.google.android.gms.internal.gtm.zzsl r35) throws java.io.IOException {
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
            if (r0 >= r13) goto L_0x033d
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002c
            int r0 = com.google.android.gms.internal.gtm.zzsm.zzk(r0, r12, r3, r11)
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
            int r0 = r15.zzy(r5, r2)
            goto L_0x0040
        L_0x003c:
            int r0 = r15.zzx(r5)
        L_0x0040:
            r2 = r0
            if (r2 != r10) goto L_0x004e
            r2 = r4
            r20 = r5
            r28 = r9
            r18 = -1
            r19 = 0
            goto L_0x0317
        L_0x004e:
            int[] r0 = r15.zzc
            int r1 = r2 + 1
            r1 = r0[r1]
            int r0 = zzB(r1)
            r10 = r1 & r8
            r19 = r9
            long r8 = (long) r10
            r10 = 17
            r33 = r5
            if (r0 > r10) goto L_0x0213
            int[] r10 = r15.zzc
            int r21 = r2 + 2
            r10 = r10[r21]
            int r21 = r10 >>> 20
            r5 = 1
            int r21 = r5 << r21
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r10 = r10 & r13
            if (r10 == r7) goto L_0x0090
            r23 = r1
            r20 = r2
            if (r7 == r13) goto L_0x0081
            long r1 = (long) r7
            r7 = r19
            r7.putInt(r14, r1, r6)
            goto L_0x0083
        L_0x0081:
            r7 = r19
        L_0x0083:
            if (r10 == r13) goto L_0x008a
            long r1 = (long) r10
            int r6 = r7.getInt(r14, r1)
        L_0x008a:
            r29 = r10
            r10 = r7
            r7 = r29
            goto L_0x0096
        L_0x0090:
            r23 = r1
            r20 = r2
            r10 = r19
        L_0x0096:
            r1 = 5
            switch(r0) {
                case 0: goto L_0x01f1;
                case 1: goto L_0x01da;
                case 2: goto L_0x01bc;
                case 3: goto L_0x01bc;
                case 4: goto L_0x01a9;
                case 5: goto L_0x018d;
                case 6: goto L_0x0169;
                case 7: goto L_0x014c;
                case 8: goto L_0x012b;
                case 9: goto L_0x00f9;
                case 10: goto L_0x00e7;
                case 11: goto L_0x01a9;
                case 12: goto L_0x00d6;
                case 13: goto L_0x0169;
                case 14: goto L_0x018d;
                case 15: goto L_0x00c1;
                case 16: goto L_0x00a3;
                default: goto L_0x009a;
            }
        L_0x009a:
            r13 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            goto L_0x020a
        L_0x00a3:
            if (r3 != 0) goto L_0x00bc
            int r17 = com.google.android.gms.internal.gtm.zzsm.zzm(r12, r4, r11)
            long r0 = r11.zzb
            long r4 = com.google.android.gms.internal.gtm.zztj.zzt(r0)
            r0 = r10
            r1 = r31
            r13 = r20
            r2 = r8
            r20 = r33
            r0.putLong(r1, r2, r4)
            goto L_0x01d2
        L_0x00bc:
            r13 = r20
            r20 = r33
            goto L_0x0126
        L_0x00c1:
            r13 = r20
            r20 = r33
            if (r3 != 0) goto L_0x0126
            int r0 = com.google.android.gms.internal.gtm.zzsm.zzj(r12, r4, r11)
            int r1 = r11.zza
            int r1 = com.google.android.gms.internal.gtm.zztj.zzs(r1)
            r10.putInt(r14, r8, r1)
            goto L_0x0207
        L_0x00d6:
            r13 = r20
            r20 = r33
            if (r3 != 0) goto L_0x0126
            int r0 = com.google.android.gms.internal.gtm.zzsm.zzj(r12, r4, r11)
            int r1 = r11.zza
            r10.putInt(r14, r8, r1)
            goto L_0x0207
        L_0x00e7:
            r13 = r20
            r0 = 2
            r20 = r33
            if (r3 != r0) goto L_0x0126
            int r0 = com.google.android.gms.internal.gtm.zzsm.zza(r12, r4, r11)
            java.lang.Object r1 = r11.zzc
            r10.putObject(r14, r8, r1)
            goto L_0x0207
        L_0x00f9:
            r13 = r20
            r0 = 2
            r20 = r33
            if (r3 != r0) goto L_0x0124
            com.google.android.gms.internal.gtm.zzwx r0 = r15.zzF(r13)
            r2 = r34
            r19 = 1048575(0xfffff, float:1.469367E-39)
            int r0 = com.google.android.gms.internal.gtm.zzsm.zzd(r0, r12, r4, r2, r11)
            java.lang.Object r1 = r10.getObject(r14, r8)
            if (r1 != 0) goto L_0x011a
            java.lang.Object r1 = r11.zzc
            r10.putObject(r14, r8, r1)
            goto L_0x017d
        L_0x011a:
            java.lang.Object r3 = r11.zzc
            java.lang.Object r1 = com.google.android.gms.internal.gtm.zzvi.zzg(r1, r3)
            r10.putObject(r14, r8, r1)
            goto L_0x017d
        L_0x0124:
            r2 = r34
        L_0x0126:
            r19 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x020a
        L_0x012b:
            r2 = r34
            r13 = r20
            r0 = 2
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            if (r3 != r0) goto L_0x020a
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r23 & r0
            if (r0 != 0) goto L_0x0142
            int r0 = com.google.android.gms.internal.gtm.zzsm.zzg(r12, r4, r11)
            goto L_0x0146
        L_0x0142:
            int r0 = com.google.android.gms.internal.gtm.zzsm.zzh(r12, r4, r11)
        L_0x0146:
            java.lang.Object r1 = r11.zzc
            r10.putObject(r14, r8, r1)
            goto L_0x017d
        L_0x014c:
            r2 = r34
            r13 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            if (r3 != 0) goto L_0x020a
            int r0 = com.google.android.gms.internal.gtm.zzsm.zzm(r12, r4, r11)
            long r3 = r11.zzb
            r22 = 0
            int r1 = (r3 > r22 ? 1 : (r3 == r22 ? 0 : -1))
            if (r1 == 0) goto L_0x0164
            goto L_0x0165
        L_0x0164:
            r5 = 0
        L_0x0165:
            com.google.android.gms.internal.gtm.zzxy.zzm(r14, r8, r5)
            goto L_0x017d
        L_0x0169:
            r2 = r34
            r13 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            if (r3 != r1) goto L_0x020a
            int r0 = com.google.android.gms.internal.gtm.zzsm.zzb(r12, r4)
            r10.putInt(r14, r8, r0)
            int r0 = r4 + 4
        L_0x017d:
            r6 = r6 | r21
            r9 = r10
            r1 = r20
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r10 = -1
            r29 = r13
            r13 = r2
            r2 = r29
            goto L_0x001a
        L_0x018d:
            r2 = r34
            r13 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            if (r3 != r5) goto L_0x020a
            long r22 = com.google.android.gms.internal.gtm.zzsm.zzo(r12, r4)
            r0 = r10
            r1 = r31
            r2 = r8
            r8 = r4
            r4 = r22
            r0.putLong(r1, r2, r4)
            int r0 = r8 + 8
            goto L_0x0207
        L_0x01a9:
            r13 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            if (r3 != 0) goto L_0x020a
            int r0 = com.google.android.gms.internal.gtm.zzsm.zzj(r12, r4, r11)
            int r1 = r11.zza
            r10.putInt(r14, r8, r1)
            goto L_0x0207
        L_0x01bc:
            r13 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            if (r3 != 0) goto L_0x020a
            int r17 = com.google.android.gms.internal.gtm.zzsm.zzm(r12, r4, r11)
            long r4 = r11.zzb
            r0 = r10
            r1 = r31
            r2 = r8
            r0.putLong(r1, r2, r4)
        L_0x01d2:
            r6 = r6 | r21
            r9 = r10
            r2 = r13
            r0 = r17
            goto L_0x0257
        L_0x01da:
            r13 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            if (r3 != r1) goto L_0x020a
            int r0 = com.google.android.gms.internal.gtm.zzsm.zzb(r12, r4)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            com.google.android.gms.internal.gtm.zzxy.zzp(r14, r8, r0)
            int r0 = r4 + 4
            goto L_0x0207
        L_0x01f1:
            r13 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            if (r3 != r5) goto L_0x020a
            long r0 = com.google.android.gms.internal.gtm.zzsm.zzo(r12, r4)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            com.google.android.gms.internal.gtm.zzxy.zzo(r14, r8, r0)
            int r0 = r4 + 8
        L_0x0207:
            r6 = r6 | r21
            goto L_0x0255
        L_0x020a:
            r2 = r4
            r28 = r10
            r19 = r13
            r18 = -1
            goto L_0x0317
        L_0x0213:
            r20 = r33
            r23 = r1
            r13 = r2
            r10 = r19
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r1 = 27
            if (r0 != r1) goto L_0x026e
            r1 = 2
            if (r3 != r1) goto L_0x0261
            java.lang.Object r0 = r10.getObject(r14, r8)
            com.google.android.gms.internal.gtm.zzvh r0 = (com.google.android.gms.internal.gtm.zzvh) r0
            boolean r1 = r0.zzc()
            if (r1 != 0) goto L_0x0241
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0239
            r1 = 10
            goto L_0x023a
        L_0x0239:
            int r1 = r1 + r1
        L_0x023a:
            com.google.android.gms.internal.gtm.zzvh r0 = r0.zzd(r1)
            r10.putObject(r14, r8, r0)
        L_0x0241:
            r5 = r0
            com.google.android.gms.internal.gtm.zzwx r0 = r15.zzF(r13)
            r1 = r17
            r2 = r32
            r3 = r4
            r4 = r34
            r8 = r6
            r6 = r35
            int r0 = com.google.android.gms.internal.gtm.zzsm.zze(r0, r1, r2, r3, r4, r5, r6)
            r6 = r8
        L_0x0255:
            r9 = r10
            r2 = r13
        L_0x0257:
            r1 = r20
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r10 = -1
            r13 = r34
            goto L_0x001a
        L_0x0261:
            r15 = r4
            r24 = r6
            r25 = r7
            r28 = r10
            r19 = r13
            r18 = -1
            goto L_0x02f4
        L_0x026e:
            r1 = 49
            if (r0 > r1) goto L_0x02c0
            r1 = r23
            long r1 = (long) r1
            r5 = r0
            r0 = r30
            r21 = r1
            r1 = r31
            r2 = r32
            r33 = r3
            r3 = r4
            r15 = r4
            r4 = r34
            r23 = r5
            r5 = r17
            r24 = r6
            r6 = r20
            r25 = r7
            r7 = r33
            r26 = r8
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r13
            r28 = r10
            r18 = -1
            r9 = r21
            r11 = r23
            r19 = r13
            r12 = r26
            r14 = r35
            int r0 = r0.zzw(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x02be
        L_0x02aa:
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r2 = r19
            r1 = r20
            r6 = r24
            r7 = r25
            goto L_0x0335
        L_0x02be:
            r2 = r0
            goto L_0x02f5
        L_0x02c0:
            r33 = r3
            r15 = r4
            r24 = r6
            r25 = r7
            r26 = r8
            r28 = r10
            r19 = r13
            r1 = r23
            r18 = -1
            r23 = r0
            r0 = 50
            r9 = r23
            if (r9 != r0) goto L_0x02fa
            r7 = r33
            r0 = 2
            if (r7 != r0) goto L_0x02f4
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r19
            r6 = r26
            r8 = r35
            int r0 = r0.zzt(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x02be
            goto L_0x02aa
        L_0x02f4:
            r2 = r15
        L_0x02f5:
            r6 = r24
            r7 = r25
            goto L_0x0317
        L_0x02fa:
            r7 = r33
            r0 = r30
            r8 = r1
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r17
            r6 = r20
            r10 = r26
            r12 = r19
            r13 = r35
            int r0 = r0.zzu(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x02be
            goto L_0x02aa
        L_0x0317:
            com.google.android.gms.internal.gtm.zzxp r4 = zzd(r31)
            r0 = r17
            r1 = r32
            r3 = r34
            r5 = r35
            int r0 = com.google.android.gms.internal.gtm.zzsm.zzi(r0, r1, r2, r3, r4, r5)
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r2 = r19
            r1 = r20
        L_0x0335:
            r9 = r28
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r10 = -1
            goto L_0x001a
        L_0x033d:
            r24 = r6
            r28 = r9
            r1 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 == r1) goto L_0x0350
            long r1 = (long) r7
            r3 = r31
            r6 = r24
            r4 = r28
            r4.putInt(r3, r1, r6)
        L_0x0350:
            r1 = r34
            if (r0 != r1) goto L_0x0355
            return r0
        L_0x0355:
            com.google.android.gms.internal.gtm.zzvk r0 = com.google.android.gms.internal.gtm.zzvk.zzg()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzwn.zzv(java.lang.Object, byte[], int, int, com.google.android.gms.internal.gtm.zzsl):int");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x044f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01cf  */
    private final int zzw(T r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.gms.internal.gtm.zzsl r29) throws java.io.IOException {
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
            com.google.android.gms.internal.gtm.zzvh r12 = (com.google.android.gms.internal.gtm.zzvh) r12
            boolean r13 = r12.zzc()
            if (r13 != 0) goto L_0x0032
            int r13 = r12.size()
            if (r13 != 0) goto L_0x002a
            r13 = 10
            goto L_0x002b
        L_0x002a:
            int r13 = r13 + r13
        L_0x002b:
            com.google.android.gms.internal.gtm.zzvh r12 = r12.zzd(r13)
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
            com.google.android.gms.internal.gtm.zzwx r1 = r15.zzF(r8)
            r6 = r2 & -8
            r6 = r6 | 4
            r21 = r1
            r22 = r17
            r23 = r18
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = com.google.android.gms.internal.gtm.zzsm.zzc(r21, r22, r23, r24, r25, r26)
            java.lang.Object r8 = r7.zzc
            r12.add(r8)
            goto L_0x042d
        L_0x005c:
            if (r6 != r14) goto L_0x0080
            com.google.android.gms.internal.gtm.zzvz r12 = (com.google.android.gms.internal.gtm.zzvz) r12
            int r1 = com.google.android.gms.internal.gtm.zzsm.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x0067:
            if (r1 >= r2) goto L_0x0077
            int r1 = com.google.android.gms.internal.gtm.zzsm.zzm(r3, r1, r7)
            long r4 = r7.zzb
            long r4 = com.google.android.gms.internal.gtm.zztj.zzt(r4)
            r12.zzf(r4)
            goto L_0x0067
        L_0x0077:
            if (r1 != r2) goto L_0x007b
            goto L_0x0450
        L_0x007b:
            com.google.android.gms.internal.gtm.zzvk r1 = com.google.android.gms.internal.gtm.zzvk.zzj()
            throw r1
        L_0x0080:
            if (r6 != 0) goto L_0x044f
            com.google.android.gms.internal.gtm.zzvz r12 = (com.google.android.gms.internal.gtm.zzvz) r12
            int r1 = com.google.android.gms.internal.gtm.zzsm.zzm(r3, r4, r7)
            long r8 = r7.zzb
            long r8 = com.google.android.gms.internal.gtm.zztj.zzt(r8)
            r12.zzf(r8)
        L_0x0091:
            if (r1 >= r5) goto L_0x00aa
            int r4 = com.google.android.gms.internal.gtm.zzsm.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x009c
            goto L_0x00aa
        L_0x009c:
            int r1 = com.google.android.gms.internal.gtm.zzsm.zzm(r3, r4, r7)
            long r8 = r7.zzb
            long r8 = com.google.android.gms.internal.gtm.zztj.zzt(r8)
            r12.zzf(r8)
            goto L_0x0091
        L_0x00aa:
            return r1
        L_0x00ab:
            if (r6 != r14) goto L_0x00cf
            com.google.android.gms.internal.gtm.zzva r12 = (com.google.android.gms.internal.gtm.zzva) r12
            int r1 = com.google.android.gms.internal.gtm.zzsm.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x00b6:
            if (r1 >= r2) goto L_0x00c6
            int r1 = com.google.android.gms.internal.gtm.zzsm.zzj(r3, r1, r7)
            int r4 = r7.zza
            int r4 = com.google.android.gms.internal.gtm.zztj.zzs(r4)
            r12.zzh(r4)
            goto L_0x00b6
        L_0x00c6:
            if (r1 != r2) goto L_0x00ca
            goto L_0x0450
        L_0x00ca:
            com.google.android.gms.internal.gtm.zzvk r1 = com.google.android.gms.internal.gtm.zzvk.zzj()
            throw r1
        L_0x00cf:
            if (r6 != 0) goto L_0x044f
            com.google.android.gms.internal.gtm.zzva r12 = (com.google.android.gms.internal.gtm.zzva) r12
            int r1 = com.google.android.gms.internal.gtm.zzsm.zzj(r3, r4, r7)
            int r4 = r7.zza
            int r4 = com.google.android.gms.internal.gtm.zztj.zzs(r4)
            r12.zzh(r4)
        L_0x00e0:
            if (r1 >= r5) goto L_0x00f9
            int r4 = com.google.android.gms.internal.gtm.zzsm.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x00eb
            goto L_0x00f9
        L_0x00eb:
            int r1 = com.google.android.gms.internal.gtm.zzsm.zzj(r3, r4, r7)
            int r4 = r7.zza
            int r4 = com.google.android.gms.internal.gtm.zztj.zzs(r4)
            r12.zzh(r4)
            goto L_0x00e0
        L_0x00f9:
            return r1
        L_0x00fa:
            if (r6 != r14) goto L_0x0101
            int r2 = com.google.android.gms.internal.gtm.zzsm.zzf(r3, r4, r12, r7)
            goto L_0x0112
        L_0x0101:
            if (r6 != 0) goto L_0x044f
            r2 = r20
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r12
            r7 = r29
            int r2 = com.google.android.gms.internal.gtm.zzsm.zzl(r2, r3, r4, r5, r6, r7)
        L_0x0112:
            com.google.android.gms.internal.gtm.zzuz r1 = (com.google.android.gms.internal.gtm.zzuz) r1
            com.google.android.gms.internal.gtm.zzxp r3 = r1.zzc
            com.google.android.gms.internal.gtm.zzxp r4 = com.google.android.gms.internal.gtm.zzxp.zzc()
            if (r3 != r4) goto L_0x011d
            r3 = 0
        L_0x011d:
            com.google.android.gms.internal.gtm.zzvd r4 = r15.zzE(r8)
            com.google.android.gms.internal.gtm.zzxo<?, ?> r5 = r0.zzo
            r6 = r21
            java.lang.Object r3 = com.google.android.gms.internal.gtm.zzwz.zzC(r6, r12, r4, r3, r5)
            if (r3 != 0) goto L_0x012d
            goto L_0x027b
        L_0x012d:
            com.google.android.gms.internal.gtm.zzxp r3 = (com.google.android.gms.internal.gtm.zzxp) r3
            r1.zzc = r3
            return r2
        L_0x0132:
            if (r6 != r14) goto L_0x044f
            int r1 = com.google.android.gms.internal.gtm.zzsm.zzj(r3, r4, r7)
            int r4 = r7.zza
            if (r4 < 0) goto L_0x0187
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0182
            if (r4 != 0) goto L_0x0148
            com.google.android.gms.internal.gtm.zztd r4 = com.google.android.gms.internal.gtm.zztd.zzb
            r12.add(r4)
            goto L_0x0150
        L_0x0148:
            com.google.android.gms.internal.gtm.zztd r6 = com.google.android.gms.internal.gtm.zztd.zzn(r3, r1, r4)
            r12.add(r6)
        L_0x014f:
            int r1 = r1 + r4
        L_0x0150:
            if (r1 >= r5) goto L_0x0181
            int r4 = com.google.android.gms.internal.gtm.zzsm.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x015b
            goto L_0x0181
        L_0x015b:
            int r1 = com.google.android.gms.internal.gtm.zzsm.zzj(r3, r4, r7)
            int r4 = r7.zza
            if (r4 < 0) goto L_0x017c
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0177
            if (r4 != 0) goto L_0x016f
            com.google.android.gms.internal.gtm.zztd r4 = com.google.android.gms.internal.gtm.zztd.zzb
            r12.add(r4)
            goto L_0x0150
        L_0x016f:
            com.google.android.gms.internal.gtm.zztd r6 = com.google.android.gms.internal.gtm.zztd.zzn(r3, r1, r4)
            r12.add(r6)
            goto L_0x014f
        L_0x0177:
            com.google.android.gms.internal.gtm.zzvk r1 = com.google.android.gms.internal.gtm.zzvk.zzj()
            throw r1
        L_0x017c:
            com.google.android.gms.internal.gtm.zzvk r1 = com.google.android.gms.internal.gtm.zzvk.zzf()
            throw r1
        L_0x0181:
            return r1
        L_0x0182:
            com.google.android.gms.internal.gtm.zzvk r1 = com.google.android.gms.internal.gtm.zzvk.zzj()
            throw r1
        L_0x0187:
            com.google.android.gms.internal.gtm.zzvk r1 = com.google.android.gms.internal.gtm.zzvk.zzf()
            throw r1
        L_0x018c:
            if (r6 == r14) goto L_0x0190
            goto L_0x044f
        L_0x0190:
            com.google.android.gms.internal.gtm.zzwx r1 = r15.zzF(r8)
            r21 = r1
            r22 = r20
            r23 = r17
            r24 = r18
            r25 = r19
            r26 = r12
            r27 = r29
            int r1 = com.google.android.gms.internal.gtm.zzsm.zze(r21, r22, r23, r24, r25, r26, r27)
            return r1
        L_0x01a7:
            if (r6 != r14) goto L_0x044f
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r24 & r8
            java.lang.String r1 = ""
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 != 0) goto L_0x01fa
            int r4 = com.google.android.gms.internal.gtm.zzsm.zzj(r3, r4, r7)
            int r6 = r7.zza
            if (r6 < 0) goto L_0x01f5
            if (r6 != 0) goto L_0x01c2
            r12.add(r1)
            goto L_0x01cd
        L_0x01c2:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.gtm.zzvi.zza
            r8.<init>(r3, r4, r6, r9)
            r12.add(r8)
        L_0x01cc:
            int r4 = r4 + r6
        L_0x01cd:
            if (r4 >= r5) goto L_0x044f
            int r6 = com.google.android.gms.internal.gtm.zzsm.zzj(r3, r4, r7)
            int r8 = r7.zza
            if (r2 != r8) goto L_0x044f
            int r4 = com.google.android.gms.internal.gtm.zzsm.zzj(r3, r6, r7)
            int r6 = r7.zza
            if (r6 < 0) goto L_0x01f0
            if (r6 != 0) goto L_0x01e5
            r12.add(r1)
            goto L_0x01cd
        L_0x01e5:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.gtm.zzvi.zza
            r8.<init>(r3, r4, r6, r9)
            r12.add(r8)
            goto L_0x01cc
        L_0x01f0:
            com.google.android.gms.internal.gtm.zzvk r1 = com.google.android.gms.internal.gtm.zzvk.zzf()
            throw r1
        L_0x01f5:
            com.google.android.gms.internal.gtm.zzvk r1 = com.google.android.gms.internal.gtm.zzvk.zzf()
            throw r1
        L_0x01fa:
            int r4 = com.google.android.gms.internal.gtm.zzsm.zzj(r3, r4, r7)
            int r6 = r7.zza
            if (r6 < 0) goto L_0x0255
            if (r6 != 0) goto L_0x0208
            r12.add(r1)
            goto L_0x021b
        L_0x0208:
            int r8 = r4 + r6
            boolean r9 = com.google.android.gms.internal.gtm.zzyd.zzf(r3, r4, r8)
            if (r9 == 0) goto L_0x0250
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.gtm.zzvi.zza
            r9.<init>(r3, r4, r6, r10)
            r12.add(r9)
        L_0x021a:
            r4 = r8
        L_0x021b:
            if (r4 >= r5) goto L_0x044f
            int r6 = com.google.android.gms.internal.gtm.zzsm.zzj(r3, r4, r7)
            int r8 = r7.zza
            if (r2 != r8) goto L_0x044f
            int r4 = com.google.android.gms.internal.gtm.zzsm.zzj(r3, r6, r7)
            int r6 = r7.zza
            if (r6 < 0) goto L_0x024b
            if (r6 != 0) goto L_0x0233
            r12.add(r1)
            goto L_0x021b
        L_0x0233:
            int r8 = r4 + r6
            boolean r9 = com.google.android.gms.internal.gtm.zzyd.zzf(r3, r4, r8)
            if (r9 == 0) goto L_0x0246
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.gtm.zzvi.zza
            r9.<init>(r3, r4, r6, r10)
            r12.add(r9)
            goto L_0x021a
        L_0x0246:
            com.google.android.gms.internal.gtm.zzvk r1 = com.google.android.gms.internal.gtm.zzvk.zzd()
            throw r1
        L_0x024b:
            com.google.android.gms.internal.gtm.zzvk r1 = com.google.android.gms.internal.gtm.zzvk.zzf()
            throw r1
        L_0x0250:
            com.google.android.gms.internal.gtm.zzvk r1 = com.google.android.gms.internal.gtm.zzvk.zzd()
            throw r1
        L_0x0255:
            com.google.android.gms.internal.gtm.zzvk r1 = com.google.android.gms.internal.gtm.zzvk.zzf()
            throw r1
        L_0x025a:
            r1 = 0
            if (r6 != r14) goto L_0x0283
            com.google.android.gms.internal.gtm.zzsr r12 = (com.google.android.gms.internal.gtm.zzsr) r12
            int r2 = com.google.android.gms.internal.gtm.zzsm.zzj(r3, r4, r7)
            int r4 = r7.zza
            int r4 = r4 + r2
        L_0x0266:
            if (r2 >= r4) goto L_0x0279
            int r2 = com.google.android.gms.internal.gtm.zzsm.zzm(r3, r2, r7)
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
            com.google.android.gms.internal.gtm.zzvk r1 = com.google.android.gms.internal.gtm.zzvk.zzj()
            throw r1
        L_0x0283:
            if (r6 != 0) goto L_0x044f
            com.google.android.gms.internal.gtm.zzsr r12 = (com.google.android.gms.internal.gtm.zzsr) r12
            int r4 = com.google.android.gms.internal.gtm.zzsm.zzm(r3, r4, r7)
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
            int r6 = com.google.android.gms.internal.gtm.zzsm.zzj(r3, r4, r7)
            int r8 = r7.zza
            if (r2 == r8) goto L_0x02a2
            goto L_0x02b3
        L_0x02a2:
            int r4 = com.google.android.gms.internal.gtm.zzsm.zzm(r3, r6, r7)
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
            com.google.android.gms.internal.gtm.zzva r12 = (com.google.android.gms.internal.gtm.zzva) r12
            int r1 = com.google.android.gms.internal.gtm.zzsm.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x02bf:
            if (r1 >= r2) goto L_0x02cb
            int r4 = com.google.android.gms.internal.gtm.zzsm.zzb(r3, r1)
            r12.zzh(r4)
            int r1 = r1 + 4
            goto L_0x02bf
        L_0x02cb:
            if (r1 != r2) goto L_0x02cf
            goto L_0x0450
        L_0x02cf:
            com.google.android.gms.internal.gtm.zzvk r1 = com.google.android.gms.internal.gtm.zzvk.zzj()
            throw r1
        L_0x02d4:
            if (r6 != r9) goto L_0x044f
            com.google.android.gms.internal.gtm.zzva r12 = (com.google.android.gms.internal.gtm.zzva) r12
            int r1 = com.google.android.gms.internal.gtm.zzsm.zzb(r17, r18)
            r12.zzh(r1)
        L_0x02df:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x02f4
            int r4 = com.google.android.gms.internal.gtm.zzsm.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x02ec
            goto L_0x02f4
        L_0x02ec:
            int r1 = com.google.android.gms.internal.gtm.zzsm.zzb(r3, r4)
            r12.zzh(r1)
            goto L_0x02df
        L_0x02f4:
            return r1
        L_0x02f5:
            if (r6 != r14) goto L_0x0315
            com.google.android.gms.internal.gtm.zzvz r12 = (com.google.android.gms.internal.gtm.zzvz) r12
            int r1 = com.google.android.gms.internal.gtm.zzsm.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x0300:
            if (r1 >= r2) goto L_0x030c
            long r4 = com.google.android.gms.internal.gtm.zzsm.zzo(r3, r1)
            r12.zzf(r4)
            int r1 = r1 + 8
            goto L_0x0300
        L_0x030c:
            if (r1 != r2) goto L_0x0310
            goto L_0x0450
        L_0x0310:
            com.google.android.gms.internal.gtm.zzvk r1 = com.google.android.gms.internal.gtm.zzvk.zzj()
            throw r1
        L_0x0315:
            if (r6 != r13) goto L_0x044f
            com.google.android.gms.internal.gtm.zzvz r12 = (com.google.android.gms.internal.gtm.zzvz) r12
            long r8 = com.google.android.gms.internal.gtm.zzsm.zzo(r17, r18)
            r12.zzf(r8)
        L_0x0320:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0335
            int r4 = com.google.android.gms.internal.gtm.zzsm.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x032d
            goto L_0x0335
        L_0x032d:
            long r8 = com.google.android.gms.internal.gtm.zzsm.zzo(r3, r4)
            r12.zzf(r8)
            goto L_0x0320
        L_0x0335:
            return r1
        L_0x0336:
            if (r6 != r14) goto L_0x033e
            int r1 = com.google.android.gms.internal.gtm.zzsm.zzf(r3, r4, r12, r7)
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
            int r1 = com.google.android.gms.internal.gtm.zzsm.zzl(r20, r21, r22, r23, r24, r25)
            return r1
        L_0x0351:
            if (r6 != r14) goto L_0x0371
            com.google.android.gms.internal.gtm.zzvz r12 = (com.google.android.gms.internal.gtm.zzvz) r12
            int r1 = com.google.android.gms.internal.gtm.zzsm.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x035c:
            if (r1 >= r2) goto L_0x0368
            int r1 = com.google.android.gms.internal.gtm.zzsm.zzm(r3, r1, r7)
            long r4 = r7.zzb
            r12.zzf(r4)
            goto L_0x035c
        L_0x0368:
            if (r1 != r2) goto L_0x036c
            goto L_0x0450
        L_0x036c:
            com.google.android.gms.internal.gtm.zzvk r1 = com.google.android.gms.internal.gtm.zzvk.zzj()
            throw r1
        L_0x0371:
            if (r6 != 0) goto L_0x044f
            com.google.android.gms.internal.gtm.zzvz r12 = (com.google.android.gms.internal.gtm.zzvz) r12
            int r1 = com.google.android.gms.internal.gtm.zzsm.zzm(r3, r4, r7)
            long r8 = r7.zzb
            r12.zzf(r8)
        L_0x037e:
            if (r1 >= r5) goto L_0x0393
            int r4 = com.google.android.gms.internal.gtm.zzsm.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x0389
            goto L_0x0393
        L_0x0389:
            int r1 = com.google.android.gms.internal.gtm.zzsm.zzm(r3, r4, r7)
            long r8 = r7.zzb
            r12.zzf(r8)
            goto L_0x037e
        L_0x0393:
            return r1
        L_0x0394:
            if (r6 != r14) goto L_0x03b8
            com.google.android.gms.internal.gtm.zzuq r12 = (com.google.android.gms.internal.gtm.zzuq) r12
            int r1 = com.google.android.gms.internal.gtm.zzsm.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x039f:
            if (r1 >= r2) goto L_0x03af
            int r4 = com.google.android.gms.internal.gtm.zzsm.zzb(r3, r1)
            float r4 = java.lang.Float.intBitsToFloat(r4)
            r12.zze(r4)
            int r1 = r1 + 4
            goto L_0x039f
        L_0x03af:
            if (r1 != r2) goto L_0x03b3
            goto L_0x0450
        L_0x03b3:
            com.google.android.gms.internal.gtm.zzvk r1 = com.google.android.gms.internal.gtm.zzvk.zzj()
            throw r1
        L_0x03b8:
            if (r6 != r9) goto L_0x044f
            com.google.android.gms.internal.gtm.zzuq r12 = (com.google.android.gms.internal.gtm.zzuq) r12
            int r1 = com.google.android.gms.internal.gtm.zzsm.zzb(r17, r18)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r12.zze(r1)
        L_0x03c7:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x03e0
            int r4 = com.google.android.gms.internal.gtm.zzsm.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x03d4
            goto L_0x03e0
        L_0x03d4:
            int r1 = com.google.android.gms.internal.gtm.zzsm.zzb(r3, r4)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r12.zze(r1)
            goto L_0x03c7
        L_0x03e0:
            return r1
        L_0x03e1:
            if (r6 != r14) goto L_0x0404
            com.google.android.gms.internal.gtm.zzug r12 = (com.google.android.gms.internal.gtm.zzug) r12
            int r1 = com.google.android.gms.internal.gtm.zzsm.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x03ec:
            if (r1 >= r2) goto L_0x03fc
            long r4 = com.google.android.gms.internal.gtm.zzsm.zzo(r3, r1)
            double r4 = java.lang.Double.longBitsToDouble(r4)
            r12.zze(r4)
            int r1 = r1 + 8
            goto L_0x03ec
        L_0x03fc:
            if (r1 != r2) goto L_0x03ff
            goto L_0x0450
        L_0x03ff:
            com.google.android.gms.internal.gtm.zzvk r1 = com.google.android.gms.internal.gtm.zzvk.zzj()
            throw r1
        L_0x0404:
            if (r6 != r13) goto L_0x044f
            com.google.android.gms.internal.gtm.zzug r12 = (com.google.android.gms.internal.gtm.zzug) r12
            long r8 = com.google.android.gms.internal.gtm.zzsm.zzo(r17, r18)
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r12.zze(r8)
        L_0x0413:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x042c
            int r4 = com.google.android.gms.internal.gtm.zzsm.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x0420
            goto L_0x042c
        L_0x0420:
            long r8 = com.google.android.gms.internal.gtm.zzsm.zzo(r3, r4)
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r12.zze(r8)
            goto L_0x0413
        L_0x042c:
            return r1
        L_0x042d:
            if (r4 >= r5) goto L_0x044e
            int r8 = com.google.android.gms.internal.gtm.zzsm.zzj(r3, r4, r7)
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
            int r4 = com.google.android.gms.internal.gtm.zzsm.zzc(r21, r22, r23, r24, r25, r26)
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzwn.zzw(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.gtm.zzsl):int");
    }

    private final int zzx(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzA(i, 0);
    }

    private final int zzy(int i, int i2) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzA(i, i2);
    }

    private final int zzz(int i) {
        return this.zzc[i + 2];
    }

    public final int zza(T t) {
        return this.zzj ? zzr(t) : zzq(t);
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
    public final int zzb(T r9) {
        /*
            r8 = this;
            int[] r0 = r8.zzc
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x022a
            int r3 = r8.zzC(r1)
            int[] r4 = r8.zzc
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            long r5 = (long) r5
            int r3 = zzB(r3)
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
            boolean r3 = r8.zzT(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.gtm.zzxy.zzf(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0224
        L_0x0031:
            boolean r3 = r8.zzT(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = zzD(r9, r5)
            int r3 = com.google.android.gms.internal.gtm.zzvi.zzc(r3)
            goto L_0x0224
        L_0x0043:
            boolean r3 = r8.zzT(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = zzs(r9, r5)
            goto L_0x01f3
        L_0x0051:
            boolean r3 = r8.zzT(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = zzD(r9, r5)
            int r3 = com.google.android.gms.internal.gtm.zzvi.zzc(r3)
            goto L_0x0224
        L_0x0063:
            boolean r3 = r8.zzT(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = zzs(r9, r5)
            goto L_0x01f3
        L_0x0071:
            boolean r3 = r8.zzT(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = zzs(r9, r5)
            goto L_0x01f3
        L_0x007f:
            boolean r3 = r8.zzT(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = zzs(r9, r5)
            goto L_0x01f3
        L_0x008d:
            boolean r3 = r8.zzT(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.gtm.zzxy.zzf(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0224
        L_0x009f:
            boolean r3 = r8.zzT(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.gtm.zzxy.zzf(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0224
        L_0x00b1:
            boolean r3 = r8.zzT(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.gtm.zzxy.zzf(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0224
        L_0x00c5:
            boolean r3 = r8.zzT(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            boolean r3 = zzU(r9, r5)
            int r3 = com.google.android.gms.internal.gtm.zzvi.zza(r3)
            goto L_0x0224
        L_0x00d7:
            boolean r3 = r8.zzT(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = zzs(r9, r5)
            goto L_0x01f3
        L_0x00e5:
            boolean r3 = r8.zzT(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = zzD(r9, r5)
            int r3 = com.google.android.gms.internal.gtm.zzvi.zzc(r3)
            goto L_0x0224
        L_0x00f7:
            boolean r3 = r8.zzT(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = zzs(r9, r5)
            goto L_0x01f3
        L_0x0105:
            boolean r3 = r8.zzT(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = zzD(r9, r5)
            int r3 = com.google.android.gms.internal.gtm.zzvi.zzc(r3)
            goto L_0x0224
        L_0x0117:
            boolean r3 = r8.zzT(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = zzD(r9, r5)
            int r3 = com.google.android.gms.internal.gtm.zzvi.zzc(r3)
            goto L_0x0224
        L_0x0129:
            boolean r3 = r8.zzT(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            float r3 = zzp(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0224
        L_0x013b:
            boolean r3 = r8.zzT(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            double r3 = zzo(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.gms.internal.gtm.zzvi.zzc(r3)
            goto L_0x0224
        L_0x0151:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.gtm.zzxy.zzf(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0224
        L_0x015d:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.gtm.zzxy.zzf(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0224
        L_0x0169:
            java.lang.Object r3 = com.google.android.gms.internal.gtm.zzxy.zzf(r9, r5)
            if (r3 == 0) goto L_0x01bf
            int r7 = r3.hashCode()
            goto L_0x01bf
        L_0x0174:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.gtm.zzxy.zzd(r9, r5)
            int r3 = com.google.android.gms.internal.gtm.zzvi.zzc(r3)
            goto L_0x0224
        L_0x0180:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.gtm.zzxy.zzc(r9, r5)
            goto L_0x01f3
        L_0x0188:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.gtm.zzxy.zzd(r9, r5)
            int r3 = com.google.android.gms.internal.gtm.zzvi.zzc(r3)
            goto L_0x0224
        L_0x0194:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.gtm.zzxy.zzc(r9, r5)
            goto L_0x01f3
        L_0x019b:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.gtm.zzxy.zzc(r9, r5)
            goto L_0x01f3
        L_0x01a2:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.gtm.zzxy.zzc(r9, r5)
            goto L_0x01f3
        L_0x01a9:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.gtm.zzxy.zzf(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0224
        L_0x01b5:
            java.lang.Object r3 = com.google.android.gms.internal.gtm.zzxy.zzf(r9, r5)
            if (r3 == 0) goto L_0x01bf
            int r7 = r3.hashCode()
        L_0x01bf:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0226
        L_0x01c3:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.gtm.zzxy.zzf(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0224
        L_0x01d0:
            int r2 = r2 * 53
            boolean r3 = com.google.android.gms.internal.gtm.zzxy.zzw(r9, r5)
            int r3 = com.google.android.gms.internal.gtm.zzvi.zza(r3)
            goto L_0x0224
        L_0x01db:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.gtm.zzxy.zzc(r9, r5)
            goto L_0x01f3
        L_0x01e2:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.gtm.zzxy.zzd(r9, r5)
            int r3 = com.google.android.gms.internal.gtm.zzvi.zzc(r3)
            goto L_0x0224
        L_0x01ed:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.gtm.zzxy.zzc(r9, r5)
        L_0x01f3:
            int r2 = r2 + r3
            goto L_0x0226
        L_0x01f5:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.gtm.zzxy.zzd(r9, r5)
            int r3 = com.google.android.gms.internal.gtm.zzvi.zzc(r3)
            goto L_0x0224
        L_0x0200:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.gtm.zzxy.zzd(r9, r5)
            int r3 = com.google.android.gms.internal.gtm.zzvi.zzc(r3)
            goto L_0x0224
        L_0x020b:
            int r2 = r2 * 53
            float r3 = com.google.android.gms.internal.gtm.zzxy.zzb(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0224
        L_0x0216:
            int r2 = r2 * 53
            double r3 = com.google.android.gms.internal.gtm.zzxy.zza(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.gms.internal.gtm.zzvi.zzc(r3)
        L_0x0224:
            int r3 = r3 + r2
            r2 = r3
        L_0x0226:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x022a:
            int r2 = r2 * 53
            com.google.android.gms.internal.gtm.zzxo<?, ?> r0 = r8.zzo
            java.lang.Object r0 = r0.zzd(r9)
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            boolean r1 = r8.zzh
            if (r1 == 0) goto L_0x024a
            int r0 = r0 * 53
            com.google.android.gms.internal.gtm.zzuk<?> r1 = r8.zzp
            com.google.android.gms.internal.gtm.zzuo r9 = r1.zzb(r9)
            com.google.android.gms.internal.gtm.zzxk<T, java.lang.Object> r9 = r9.zza
            int r9 = r9.hashCode()
            int r0 = r0 + r9
        L_0x024a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzwn.zzb(java.lang.Object):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:114:0x032b, code lost:
        if (r0 != r15) goto L_0x032d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0347, code lost:
        r2 = r0;
        r6 = r23;
        r7 = r25;
        r0 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x037d, code lost:
        if (r0 != r15) goto L_0x032d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x03a2, code lost:
        if (r0 != r15) goto L_0x032d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x051e, code lost:
        r2 = r2 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0531, code lost:
        r2 = r2 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01bb, code lost:
        r5 = r6 | r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01bf, code lost:
        r17 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0235, code lost:
        r17 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x024f, code lost:
        r0 = r13 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0251, code lost:
        r5 = r6 | r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0253, code lost:
        r13 = r35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0255, code lost:
        r6 = r7;
        r3 = r8;
        r1 = r11;
        r2 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x025a, code lost:
        r11 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x025e, code lost:
        r17 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0273, code lost:
        r0 = r36;
        r22 = r6;
        r6 = r7;
        r21 = r8;
        r29 = r10;
        r7 = r11;
        r2 = r17;
        r34 = r26;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzc(T r32, byte[] r33, int r34, int r35, int r36, com.google.android.gms.internal.gtm.zzsl r37) throws java.io.IOException {
        /*
            r31 = this;
            r15 = r31
            r14 = r32
            r12 = r33
            r13 = r35
            r11 = r36
            r9 = r37
            sun.misc.Unsafe r10 = zzb
            r16 = 0
            r0 = r34
            r1 = 0
            r2 = -1
            r3 = 0
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
        L_0x0019:
            if (r0 >= r13) goto L_0x058e
            int r1 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0028
            int r0 = com.google.android.gms.internal.gtm.zzsm.zzk(r0, r12, r1, r9)
            int r1 = r9.zza
            goto L_0x002d
        L_0x0028:
            r30 = r1
            r1 = r0
            r0 = r30
        L_0x002d:
            int r7 = r1 >>> 3
            r8 = r1 & 7
            r4 = 3
            if (r7 <= r2) goto L_0x003a
            int r3 = r3 / r4
            int r2 = r15.zzy(r7, r3)
            goto L_0x003e
        L_0x003a:
            int r2 = r15.zzx(r7)
        L_0x003e:
            r19 = 0
            r4 = -1
            if (r2 != r4) goto L_0x0054
            r2 = r0
            r22 = r5
            r34 = r7
            r29 = r10
            r0 = r11
            r18 = 1
            r21 = 0
            r26 = -1
            r7 = r1
            goto L_0x03a5
        L_0x0054:
            int[] r3 = r15.zzc
            int r23 = r2 + 1
            r3 = r3[r23]
            int r11 = zzB(r3)
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r3 & r17
            r24 = r3
            long r3 = (long) r4
            r25 = r1
            r1 = 17
            r26 = r7
            if (r11 > r1) goto L_0x0287
            int[] r1 = r15.zzc
            int r27 = r2 + 2
            r1 = r1[r27]
            int r27 = r1 >>> 20
            r22 = 1
            int r27 = r22 << r27
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r7
            if (r1 == r6) goto L_0x008f
            r17 = r8
            if (r6 == r7) goto L_0x0088
            long r7 = (long) r6
            r10.putInt(r14, r7, r5)
        L_0x0088:
            long r5 = (long) r1
            int r5 = r10.getInt(r14, r5)
            r7 = r1
            goto L_0x0092
        L_0x008f:
            r17 = r8
            r7 = r6
        L_0x0092:
            r6 = r5
            r1 = 5
            switch(r11) {
                case 0: goto L_0x0239;
                case 1: goto L_0x021d;
                case 2: goto L_0x01f7;
                case 3: goto L_0x01f7;
                case 4: goto L_0x01e2;
                case 5: goto L_0x01c3;
                case 6: goto L_0x01a9;
                case 7: goto L_0x018f;
                case 8: goto L_0x0170;
                case 9: goto L_0x0146;
                case 10: goto L_0x0131;
                case 11: goto L_0x01e2;
                case 12: goto L_0x0103;
                case 13: goto L_0x01a9;
                case 14: goto L_0x01c3;
                case 15: goto L_0x00ed;
                case 16: goto L_0x00c3;
                default: goto L_0x0097;
            }
        L_0x0097:
            r13 = r0
            r8 = r2
            r2 = r17
            r11 = r25
            r0 = 3
            r1 = 1
            r21 = -1
            if (r2 != r0) goto L_0x025e
            com.google.android.gms.internal.gtm.zzwx r0 = r15.zzF(r8)
            int r1 = r26 << 3
            r5 = r1 | 4
            r1 = r33
            r2 = r13
            r12 = r3
            r3 = r35
            r4 = r5
            r5 = r37
            int r0 = com.google.android.gms.internal.gtm.zzsm.zzc(r0, r1, r2, r3, r4, r5)
            r1 = r6 & r27
            if (r1 != 0) goto L_0x0261
            java.lang.Object r1 = r9.zzc
            r10.putObject(r14, r12, r1)
            goto L_0x026e
        L_0x00c3:
            if (r17 != 0) goto L_0x00e6
            int r8 = com.google.android.gms.internal.gtm.zzsm.zzm(r12, r0, r9)
            long r0 = r9.zzb
            long r17 = com.google.android.gms.internal.gtm.zztj.zzt(r0)
            r0 = r10
            r11 = r25
            r1 = r32
            r5 = r2
            r2 = r3
            r34 = r8
            r21 = -1
            r8 = r5
            r4 = r17
            r0.putLong(r1, r2, r4)
            r5 = r6 | r27
            r0 = r34
            goto L_0x0255
        L_0x00e6:
            r8 = r2
            r11 = r25
            r21 = -1
            goto L_0x01bf
        L_0x00ed:
            r8 = r2
            r11 = r25
            r21 = -1
            if (r17 != 0) goto L_0x01bf
            int r0 = com.google.android.gms.internal.gtm.zzsm.zzj(r12, r0, r9)
            int r1 = r9.zza
            int r1 = com.google.android.gms.internal.gtm.zztj.zzs(r1)
            r10.putInt(r14, r3, r1)
            goto L_0x01bb
        L_0x0103:
            r8 = r2
            r11 = r25
            r21 = -1
            if (r17 != 0) goto L_0x01bf
            int r0 = com.google.android.gms.internal.gtm.zzsm.zzj(r12, r0, r9)
            int r1 = r9.zza
            com.google.android.gms.internal.gtm.zzvd r2 = r15.zzE(r8)
            if (r2 == 0) goto L_0x012c
            boolean r2 = r2.zza(r1)
            if (r2 == 0) goto L_0x011d
            goto L_0x012c
        L_0x011d:
            com.google.android.gms.internal.gtm.zzxp r2 = zzd(r32)
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.zzh(r11, r1)
            r5 = r6
            goto L_0x0255
        L_0x012c:
            r10.putInt(r14, r3, r1)
            goto L_0x01bb
        L_0x0131:
            r8 = r2
            r2 = r17
            r11 = r25
            r1 = 2
            r21 = -1
            if (r2 != r1) goto L_0x01bf
            int r0 = com.google.android.gms.internal.gtm.zzsm.zza(r12, r0, r9)
            java.lang.Object r1 = r9.zzc
            r10.putObject(r14, r3, r1)
            goto L_0x01bb
        L_0x0146:
            r8 = r2
            r2 = r17
            r11 = r25
            r1 = 2
            r21 = -1
            if (r2 != r1) goto L_0x01bf
            com.google.android.gms.internal.gtm.zzwx r1 = r15.zzF(r8)
            int r0 = com.google.android.gms.internal.gtm.zzsm.zzd(r1, r12, r0, r13, r9)
            r1 = r6 & r27
            if (r1 != 0) goto L_0x0162
            java.lang.Object r1 = r9.zzc
            r10.putObject(r14, r3, r1)
            goto L_0x01bb
        L_0x0162:
            java.lang.Object r1 = r10.getObject(r14, r3)
            java.lang.Object r2 = r9.zzc
            java.lang.Object r1 = com.google.android.gms.internal.gtm.zzvi.zzg(r1, r2)
            r10.putObject(r14, r3, r1)
            goto L_0x01bb
        L_0x0170:
            r8 = r2
            r2 = r17
            r11 = r25
            r1 = 2
            r21 = -1
            if (r2 != r1) goto L_0x01bf
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            r1 = r24 & r1
            if (r1 != 0) goto L_0x0185
            int r0 = com.google.android.gms.internal.gtm.zzsm.zzg(r12, r0, r9)
            goto L_0x0189
        L_0x0185:
            int r0 = com.google.android.gms.internal.gtm.zzsm.zzh(r12, r0, r9)
        L_0x0189:
            java.lang.Object r1 = r9.zzc
            r10.putObject(r14, r3, r1)
            goto L_0x01bb
        L_0x018f:
            r8 = r2
            r2 = r17
            r11 = r25
            r21 = -1
            if (r2 != 0) goto L_0x01bf
            int r0 = com.google.android.gms.internal.gtm.zzsm.zzm(r12, r0, r9)
            long r1 = r9.zzb
            int r5 = (r1 > r19 ? 1 : (r1 == r19 ? 0 : -1))
            if (r5 == 0) goto L_0x01a4
            r1 = 1
            goto L_0x01a5
        L_0x01a4:
            r1 = 0
        L_0x01a5:
            com.google.android.gms.internal.gtm.zzxy.zzm(r14, r3, r1)
            goto L_0x01bb
        L_0x01a9:
            r8 = r2
            r2 = r17
            r11 = r25
            r21 = -1
            if (r2 != r1) goto L_0x01bf
            int r1 = com.google.android.gms.internal.gtm.zzsm.zzb(r12, r0)
            r10.putInt(r14, r3, r1)
            int r0 = r0 + 4
        L_0x01bb:
            r5 = r6 | r27
            goto L_0x0255
        L_0x01bf:
            r17 = r0
            goto L_0x0237
        L_0x01c3:
            r8 = r2
            r2 = r17
            r11 = r25
            r1 = 1
            r21 = -1
            if (r2 != r1) goto L_0x01de
            long r17 = com.google.android.gms.internal.gtm.zzsm.zzo(r12, r0)
            r5 = r0
            r0 = r10
            r1 = r32
            r2 = r3
            r13 = r5
            r4 = r17
            r0.putLong(r1, r2, r4)
            goto L_0x024f
        L_0x01de:
            r17 = r0
            goto L_0x0273
        L_0x01e2:
            r13 = r0
            r8 = r2
            r2 = r17
            r11 = r25
            r21 = -1
            if (r2 != 0) goto L_0x0235
            int r0 = com.google.android.gms.internal.gtm.zzsm.zzj(r12, r13, r9)
            int r1 = r9.zza
            r10.putInt(r14, r3, r1)
            goto L_0x0251
        L_0x01f7:
            r13 = r0
            r8 = r2
            r2 = r17
            r11 = r25
            r21 = -1
            if (r2 != 0) goto L_0x0235
            int r13 = com.google.android.gms.internal.gtm.zzsm.zzm(r12, r13, r9)
            long r1 = r9.zzb
            r0 = r10
            r17 = r1
            r1 = r32
            r2 = r3
            r4 = r17
            r0.putLong(r1, r2, r4)
            r5 = r6 | r27
            r6 = r7
            r3 = r8
            r1 = r11
            r0 = r13
            r2 = r26
            r13 = r35
            goto L_0x025a
        L_0x021d:
            r13 = r0
            r8 = r2
            r2 = r17
            r11 = r25
            r21 = -1
            if (r2 != r1) goto L_0x0235
            int r0 = com.google.android.gms.internal.gtm.zzsm.zzb(r12, r13)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            com.google.android.gms.internal.gtm.zzxy.zzp(r14, r3, r0)
            int r0 = r13 + 4
            goto L_0x0251
        L_0x0235:
            r17 = r13
        L_0x0237:
            r1 = 1
            goto L_0x0273
        L_0x0239:
            r13 = r0
            r8 = r2
            r2 = r17
            r11 = r25
            r1 = 1
            r21 = -1
            if (r2 != r1) goto L_0x025e
            long r0 = com.google.android.gms.internal.gtm.zzsm.zzo(r12, r13)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            com.google.android.gms.internal.gtm.zzxy.zzo(r14, r3, r0)
        L_0x024f:
            int r0 = r13 + 8
        L_0x0251:
            r5 = r6 | r27
        L_0x0253:
            r13 = r35
        L_0x0255:
            r6 = r7
            r3 = r8
            r1 = r11
            r2 = r26
        L_0x025a:
            r11 = r36
            goto L_0x0019
        L_0x025e:
            r17 = r13
            goto L_0x0273
        L_0x0261:
            java.lang.Object r1 = r10.getObject(r14, r12)
            java.lang.Object r2 = r9.zzc
            java.lang.Object r1 = com.google.android.gms.internal.gtm.zzvi.zzg(r1, r2)
            r10.putObject(r14, r12, r1)
        L_0x026e:
            r5 = r6 | r27
            r12 = r33
            goto L_0x0253
        L_0x0273:
            r0 = r36
            r22 = r6
            r6 = r7
            r21 = r8
            r29 = r10
            r7 = r11
            r2 = r17
            r34 = r26
            r18 = 1
            r26 = -1
            goto L_0x03a5
        L_0x0287:
            r17 = r0
            r12 = r3
            r7 = r25
            r1 = 1
            r21 = -1
            r30 = r8
            r8 = r2
            r2 = r30
            r0 = 27
            if (r11 != r0) goto L_0x02f3
            r0 = 2
            if (r2 != r0) goto L_0x02df
            java.lang.Object r0 = r10.getObject(r14, r12)
            com.google.android.gms.internal.gtm.zzvh r0 = (com.google.android.gms.internal.gtm.zzvh) r0
            boolean r1 = r0.zzc()
            if (r1 != 0) goto L_0x02b9
            int r1 = r0.size()
            if (r1 != 0) goto L_0x02b0
            r3 = 10
            goto L_0x02b2
        L_0x02b0:
            int r3 = r1 + r1
        L_0x02b2:
            com.google.android.gms.internal.gtm.zzvh r0 = r0.zzd(r3)
            r10.putObject(r14, r12, r0)
        L_0x02b9:
            r11 = r0
            com.google.android.gms.internal.gtm.zzwx r0 = r15.zzF(r8)
            r1 = r7
            r2 = r33
            r3 = r17
            r4 = r35
            r22 = r5
            r5 = r11
            r23 = r6
            r6 = r37
            int r0 = com.google.android.gms.internal.gtm.zzsm.zze(r0, r1, r2, r3, r4, r5, r6)
            r12 = r33
            r13 = r35
            r11 = r36
            r3 = r8
            r5 = r22
            r6 = r23
            r2 = r26
            goto L_0x0019
        L_0x02df:
            r22 = r5
            r23 = r6
            r25 = r7
            r21 = r8
            r29 = r10
            r15 = r17
            r34 = r26
            r18 = 1
            r26 = -1
            goto L_0x0380
        L_0x02f3:
            r22 = r5
            r23 = r6
            r0 = 49
            if (r11 > r0) goto L_0x0350
            r3 = r24
            long r5 = (long) r3
            r0 = r31
            r4 = 1
            r1 = r32
            r3 = r2
            r2 = r33
            r24 = r3
            r3 = r17
            r18 = 1
            r4 = r35
            r27 = r5
            r5 = r7
            r6 = r26
            r25 = r7
            r34 = r26
            r7 = r24
            r21 = r8
            r26 = -1
            r29 = r10
            r9 = r27
            r15 = r36
            r15 = r17
            r14 = r37
            int r0 = r0.zzw(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x0347
        L_0x032d:
            r15 = r31
            r14 = r32
            r12 = r33
            r2 = r34
            r13 = r35
            r11 = r36
            r9 = r37
            r3 = r21
            r5 = r22
            r6 = r23
            r1 = r25
            r10 = r29
            goto L_0x0019
        L_0x0347:
            r2 = r0
            r6 = r23
            r7 = r25
            r0 = r36
            goto L_0x03a5
        L_0x0350:
            r25 = r7
            r21 = r8
            r29 = r10
            r15 = r17
            r3 = r24
            r34 = r26
            r18 = 1
            r26 = -1
            r24 = r2
            r0 = 50
            if (r11 != r0) goto L_0x0388
            r7 = r24
            r0 = 2
            if (r7 != r0) goto L_0x0380
            r0 = r31
            r1 = r32
            r2 = r33
            r3 = r15
            r4 = r35
            r5 = r21
            r6 = r12
            r8 = r37
            int r0 = r0.zzt(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x0347
            goto L_0x032d
        L_0x0380:
            r0 = r36
            r2 = r15
            r6 = r23
            r7 = r25
            goto L_0x03a5
        L_0x0388:
            r7 = r24
            r0 = r31
            r1 = r32
            r2 = r33
            r8 = r3
            r3 = r15
            r4 = r35
            r5 = r25
            r6 = r34
            r9 = r11
            r10 = r12
            r12 = r21
            r13 = r37
            int r0 = r0.zzu(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x0347
            goto L_0x032d
        L_0x03a5:
            if (r7 != r0) goto L_0x03ba
            if (r0 == 0) goto L_0x03ba
            r8 = r31
            r13 = r32
            r9 = r0
            r0 = r2
            r2 = r6
            r1 = r7
            r5 = r22
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r35
            goto L_0x059d
        L_0x03ba:
            r8 = r31
            r9 = r0
            boolean r0 = r8.zzh
            if (r0 == 0) goto L_0x0561
            r10 = r37
            com.google.android.gms.internal.gtm.zzuj r0 = r10.zzd
            com.google.android.gms.internal.gtm.zzuj r1 = com.google.android.gms.internal.gtm.zzuj.zza()
            if (r0 == r1) goto L_0x055a
            com.google.android.gms.internal.gtm.zzwk r0 = r8.zzg
            com.google.android.gms.internal.gtm.zzxo<?, ?> r1 = r8.zzo
            com.google.android.gms.internal.gtm.zzuj r3 = r10.zzd
            r11 = r34
            com.google.android.gms.internal.gtm.zzux r12 = r3.zzc(r0, r11)
            if (r12 != 0) goto L_0x03f2
            com.google.android.gms.internal.gtm.zzxp r4 = zzd(r32)
            r0 = r7
            r1 = r33
            r3 = r35
            r5 = r37
            int r0 = com.google.android.gms.internal.gtm.zzsm.zzi(r0, r1, r2, r3, r4, r5)
            r13 = r32
            r15 = r33
        L_0x03ec:
            r34 = r6
            r6 = r35
            goto L_0x057c
        L_0x03f2:
            r13 = r32
            r0 = r13
            com.google.android.gms.internal.gtm.zzuv r0 = (com.google.android.gms.internal.gtm.zzuv) r0
            r0.zzU()
            com.google.android.gms.internal.gtm.zzuo<com.google.android.gms.internal.gtm.zzuw> r14 = r0.zza
            com.google.android.gms.internal.gtm.zzuw r3 = r12.zzd
            com.google.android.gms.internal.gtm.zzye r3 = r3.zzc
            com.google.android.gms.internal.gtm.zzye r4 = com.google.android.gms.internal.gtm.zzye.ENUM
            if (r3 != r4) goto L_0x0432
            r15 = r33
            int r2 = com.google.android.gms.internal.gtm.zzsm.zzj(r15, r2, r10)
            com.google.android.gms.internal.gtm.zzuw r3 = r12.zzd
            com.google.android.gms.internal.gtm.zzvc<?> r3 = r3.zza
            int r3 = r10.zza
            com.google.android.gms.internal.gtm.zzyl r3 = com.google.android.gms.internal.gtm.zzyl.zzc(r3)
            if (r3 != 0) goto L_0x042b
            com.google.android.gms.internal.gtm.zzxp r3 = r0.zzc
            com.google.android.gms.internal.gtm.zzxp r4 = com.google.android.gms.internal.gtm.zzxp.zzc()
            if (r3 != r4) goto L_0x0424
            com.google.android.gms.internal.gtm.zzxp r3 = com.google.android.gms.internal.gtm.zzxp.zze()
            r0.zzc = r3
        L_0x0424:
            int r0 = r10.zza
            com.google.android.gms.internal.gtm.zzwz.zzD(r11, r0, r3, r1)
            r0 = r2
            goto L_0x03ec
        L_0x042b:
            int r0 = r10.zza
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            goto L_0x046e
        L_0x0432:
            r15 = r33
            int r0 = r3.ordinal()
            switch(r0) {
                case 0: goto L_0x0521;
                case 1: goto L_0x050e;
                case 2: goto L_0x04ff;
                case 3: goto L_0x04ff;
                case 4: goto L_0x04f0;
                case 5: goto L_0x04e3;
                case 6: goto L_0x04d6;
                case 7: goto L_0x04c0;
                case 8: goto L_0x04b4;
                case 9: goto L_0x048f;
                case 10: goto L_0x0474;
                case 11: goto L_0x0468;
                case 12: goto L_0x04f0;
                case 13: goto L_0x0460;
                case 14: goto L_0x04d6;
                case 15: goto L_0x04e3;
                case 16: goto L_0x0451;
                case 17: goto L_0x0442;
                default: goto L_0x043b;
            }
        L_0x043b:
            r34 = r6
            r6 = r35
            r4 = 0
            goto L_0x0533
        L_0x0442:
            int r2 = com.google.android.gms.internal.gtm.zzsm.zzm(r15, r2, r10)
            long r0 = r10.zzb
            long r0 = com.google.android.gms.internal.gtm.zztj.zzt(r0)
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            goto L_0x046e
        L_0x0451:
            int r2 = com.google.android.gms.internal.gtm.zzsm.zzj(r15, r2, r10)
            int r0 = r10.zza
            int r0 = com.google.android.gms.internal.gtm.zztj.zzs(r0)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            goto L_0x046e
        L_0x0460:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Shouldn't reach here."
            r0.<init>(r1)
            throw r0
        L_0x0468:
            int r2 = com.google.android.gms.internal.gtm.zzsm.zza(r15, r2, r10)
            java.lang.Object r4 = r10.zzc
        L_0x046e:
            r34 = r6
            r6 = r35
            goto L_0x0533
        L_0x0474:
            com.google.android.gms.internal.gtm.zzwt r0 = com.google.android.gms.internal.gtm.zzwt.zza()
            com.google.android.gms.internal.gtm.zzwk r1 = r12.zzc
            java.lang.Class r1 = r1.getClass()
            com.google.android.gms.internal.gtm.zzwx r0 = r0.zzb(r1)
            r5 = r35
            int r2 = com.google.android.gms.internal.gtm.zzsm.zzd(r0, r15, r2, r5, r10)
            java.lang.Object r4 = r10.zzc
            r34 = r6
            r6 = r5
            goto L_0x0533
        L_0x048f:
            r5 = r35
            com.google.android.gms.internal.gtm.zzwt r0 = com.google.android.gms.internal.gtm.zzwt.zza()
            com.google.android.gms.internal.gtm.zzwk r1 = r12.zzc
            java.lang.Class r1 = r1.getClass()
            com.google.android.gms.internal.gtm.zzwx r0 = r0.zzb(r1)
            int r1 = r11 << 3
            r4 = r1 | 4
            r1 = r33
            r3 = r35
            r34 = r6
            r6 = r5
            r5 = r37
            int r2 = com.google.android.gms.internal.gtm.zzsm.zzc(r0, r1, r2, r3, r4, r5)
            java.lang.Object r4 = r10.zzc
            goto L_0x0533
        L_0x04b4:
            r34 = r6
            r6 = r35
            int r2 = com.google.android.gms.internal.gtm.zzsm.zzg(r15, r2, r10)
            java.lang.Object r4 = r10.zzc
            goto L_0x0533
        L_0x04c0:
            r34 = r6
            r6 = r35
            int r2 = com.google.android.gms.internal.gtm.zzsm.zzm(r15, r2, r10)
            long r0 = r10.zzb
            int r3 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r3 == 0) goto L_0x04d0
            r4 = 1
            goto L_0x04d1
        L_0x04d0:
            r4 = 0
        L_0x04d1:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            goto L_0x0533
        L_0x04d6:
            r34 = r6
            r6 = r35
            int r0 = com.google.android.gms.internal.gtm.zzsm.zzb(r15, r2)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            goto L_0x051e
        L_0x04e3:
            r34 = r6
            r6 = r35
            long r0 = com.google.android.gms.internal.gtm.zzsm.zzo(r15, r2)
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            goto L_0x0531
        L_0x04f0:
            r34 = r6
            r6 = r35
            int r2 = com.google.android.gms.internal.gtm.zzsm.zzj(r15, r2, r10)
            int r0 = r10.zza
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            goto L_0x0533
        L_0x04ff:
            r34 = r6
            r6 = r35
            int r2 = com.google.android.gms.internal.gtm.zzsm.zzm(r15, r2, r10)
            long r0 = r10.zzb
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            goto L_0x0533
        L_0x050e:
            r34 = r6
            r6 = r35
            int r0 = com.google.android.gms.internal.gtm.zzsm.zzb(r15, r2)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            java.lang.Float r4 = java.lang.Float.valueOf(r0)
        L_0x051e:
            int r2 = r2 + 4
            goto L_0x0533
        L_0x0521:
            r34 = r6
            r6 = r35
            long r0 = com.google.android.gms.internal.gtm.zzsm.zzo(r15, r2)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            java.lang.Double r4 = java.lang.Double.valueOf(r0)
        L_0x0531:
            int r2 = r2 + 8
        L_0x0533:
            r12.zza()
            com.google.android.gms.internal.gtm.zzuw r0 = r12.zzd
            com.google.android.gms.internal.gtm.zzye r0 = r0.zzc
            int r0 = r0.ordinal()
            r1 = 9
            if (r0 == r1) goto L_0x0547
            r1 = 10
            if (r0 == r1) goto L_0x0547
            goto L_0x0553
        L_0x0547:
            com.google.android.gms.internal.gtm.zzuw r0 = r12.zzd
            java.lang.Object r0 = r14.zze(r0)
            if (r0 == 0) goto L_0x0553
            java.lang.Object r4 = com.google.android.gms.internal.gtm.zzvi.zzg(r0, r4)
        L_0x0553:
            com.google.android.gms.internal.gtm.zzuw r0 = r12.zzd
            r14.zzi(r0, r4)
            r0 = r2
            goto L_0x057c
        L_0x055a:
            r13 = r32
            r15 = r33
            r11 = r34
            goto L_0x0569
        L_0x0561:
            r13 = r32
            r15 = r33
            r11 = r34
            r10 = r37
        L_0x0569:
            r34 = r6
            r6 = r35
            com.google.android.gms.internal.gtm.zzxp r4 = zzd(r32)
            r0 = r7
            r1 = r33
            r3 = r35
            r5 = r37
            int r0 = com.google.android.gms.internal.gtm.zzsm.zzi(r0, r1, r2, r3, r4, r5)
        L_0x057c:
            r1 = r7
            r2 = r11
            r14 = r13
            r12 = r15
            r3 = r21
            r5 = r22
            r13 = r6
            r15 = r8
            r11 = r9
            r9 = r10
            r10 = r29
            r6 = r34
            goto L_0x0019
        L_0x058e:
            r22 = r5
            r23 = r6
            r29 = r10
            r9 = r11
            r6 = r13
            r13 = r14
            r8 = r15
            r2 = r23
            r3 = 1048575(0xfffff, float:1.469367E-39)
        L_0x059d:
            if (r2 == r3) goto L_0x05a5
            long r2 = (long) r2
            r4 = r29
            r4.putInt(r13, r2, r5)
        L_0x05a5:
            int r2 = r8.zzl
        L_0x05a7:
            int r3 = r8.zzm
            if (r2 >= r3) goto L_0x05b8
            int[] r3 = r8.zzk
            r3 = r3[r2]
            com.google.android.gms.internal.gtm.zzxo<?, ?> r4 = r8.zzo
            r5 = 0
            r8.zzG(r13, r3, r5, r4)
            int r2 = r2 + 1
            goto L_0x05a7
        L_0x05b8:
            if (r9 != 0) goto L_0x05c2
            if (r0 != r6) goto L_0x05bd
            goto L_0x05c6
        L_0x05bd:
            com.google.android.gms.internal.gtm.zzvk r0 = com.google.android.gms.internal.gtm.zzvk.zzg()
            throw r0
        L_0x05c2:
            if (r0 > r6) goto L_0x05c7
            if (r1 != r9) goto L_0x05c7
        L_0x05c6:
            return r0
        L_0x05c7:
            com.google.android.gms.internal.gtm.zzvk r0 = com.google.android.gms.internal.gtm.zzvk.zzg()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzwn.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.gtm.zzsl):int");
    }

    public final T zze() {
        return ((zzuz) this.zzg).zzb(4, (Object) null, (Object) null);
    }

    public final void zzf(T t) {
        int i;
        int i2 = this.zzl;
        while (true) {
            i = this.zzm;
            if (i2 >= i) {
                break;
            }
            long zzC = (long) (zzC(this.zzk[i2]) & 1048575);
            Object zzf2 = zzxy.zzf(t, zzC);
            if (zzf2 != null) {
                ((zzwe) zzf2).zzc();
                zzxy.zzs(t, zzC, zzf2);
            }
            i2++;
        }
        int length = this.zzk.length;
        while (i < length) {
            this.zzn.zzb(t, (long) this.zzk[i]);
            i++;
        }
        this.zzo.zzm(t);
        if (this.zzh) {
            this.zzp.zzf(t);
        }
    }

    public final void zzg(T t, T t2) {
        t2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzC = zzC(i);
            long j = (long) (1048575 & zzC);
            int i2 = this.zzc[i];
            switch (zzB(zzC)) {
                case 0:
                    if (!zzQ(t2, i)) {
                        break;
                    } else {
                        zzxy.zzo(t, j, zzxy.zza(t2, j));
                        zzM(t, i);
                        break;
                    }
                case 1:
                    if (!zzQ(t2, i)) {
                        break;
                    } else {
                        zzxy.zzp(t, j, zzxy.zzb(t2, j));
                        zzM(t, i);
                        break;
                    }
                case 2:
                    if (!zzQ(t2, i)) {
                        break;
                    } else {
                        zzxy.zzr(t, j, zzxy.zzd(t2, j));
                        zzM(t, i);
                        break;
                    }
                case 3:
                    if (!zzQ(t2, i)) {
                        break;
                    } else {
                        zzxy.zzr(t, j, zzxy.zzd(t2, j));
                        zzM(t, i);
                        break;
                    }
                case 4:
                    if (!zzQ(t2, i)) {
                        break;
                    } else {
                        zzxy.zzq(t, j, zzxy.zzc(t2, j));
                        zzM(t, i);
                        break;
                    }
                case 5:
                    if (!zzQ(t2, i)) {
                        break;
                    } else {
                        zzxy.zzr(t, j, zzxy.zzd(t2, j));
                        zzM(t, i);
                        break;
                    }
                case 6:
                    if (!zzQ(t2, i)) {
                        break;
                    } else {
                        zzxy.zzq(t, j, zzxy.zzc(t2, j));
                        zzM(t, i);
                        break;
                    }
                case 7:
                    if (!zzQ(t2, i)) {
                        break;
                    } else {
                        zzxy.zzm(t, j, zzxy.zzw(t2, j));
                        zzM(t, i);
                        break;
                    }
                case 8:
                    if (!zzQ(t2, i)) {
                        break;
                    } else {
                        zzxy.zzs(t, j, zzxy.zzf(t2, j));
                        zzM(t, i);
                        break;
                    }
                case 9:
                    zzJ(t, t2, i);
                    break;
                case 10:
                    if (!zzQ(t2, i)) {
                        break;
                    } else {
                        zzxy.zzs(t, j, zzxy.zzf(t2, j));
                        zzM(t, i);
                        break;
                    }
                case 11:
                    if (!zzQ(t2, i)) {
                        break;
                    } else {
                        zzxy.zzq(t, j, zzxy.zzc(t2, j));
                        zzM(t, i);
                        break;
                    }
                case 12:
                    if (!zzQ(t2, i)) {
                        break;
                    } else {
                        zzxy.zzq(t, j, zzxy.zzc(t2, j));
                        zzM(t, i);
                        break;
                    }
                case 13:
                    if (!zzQ(t2, i)) {
                        break;
                    } else {
                        zzxy.zzq(t, j, zzxy.zzc(t2, j));
                        zzM(t, i);
                        break;
                    }
                case 14:
                    if (!zzQ(t2, i)) {
                        break;
                    } else {
                        zzxy.zzr(t, j, zzxy.zzd(t2, j));
                        zzM(t, i);
                        break;
                    }
                case 15:
                    if (!zzQ(t2, i)) {
                        break;
                    } else {
                        zzxy.zzq(t, j, zzxy.zzc(t2, j));
                        zzM(t, i);
                        break;
                    }
                case 16:
                    if (!zzQ(t2, i)) {
                        break;
                    } else {
                        zzxy.zzr(t, j, zzxy.zzd(t2, j));
                        zzM(t, i);
                        break;
                    }
                case 17:
                    zzJ(t, t2, i);
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
                    this.zzn.zzc(t, t2, j);
                    break;
                case 50:
                    zzwz.zzI(this.zzr, t, t2, j);
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
                    if (!zzT(t2, i2, i)) {
                        break;
                    } else {
                        zzxy.zzs(t, j, zzxy.zzf(t2, j));
                        zzN(t, i2, i);
                        break;
                    }
                case 60:
                    zzK(t, t2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!zzT(t2, i2, i)) {
                        break;
                    } else {
                        zzxy.zzs(t, j, zzxy.zzf(t2, j));
                        zzN(t, i2, i);
                        break;
                    }
                case 68:
                    zzK(t, t2, i);
                    break;
            }
        }
        zzwz.zzF(this.zzo, t, t2);
        if (this.zzh) {
            zzwz.zzE(this.zzp, t, t2);
        }
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void zzh(T r13, com.google.android.gms.internal.gtm.zzww r14, com.google.android.gms.internal.gtm.zzuj r15) throws java.io.IOException {
        /*
            r12 = this;
            r15.getClass()
            com.google.android.gms.internal.gtm.zzxo<?, ?> r7 = r12.zzo
            com.google.android.gms.internal.gtm.zzuk<?> r8 = r12.zzp
            r9 = 0
            r0 = r9
            r10 = r0
        L_0x000a:
            int r1 = r14.zzc()     // Catch:{ all -> 0x0077 }
            int r2 = r12.zzx(r1)     // Catch:{ all -> 0x0077 }
            if (r2 >= 0) goto L_0x007a
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r2) goto L_0x002f
            int r14 = r12.zzl
        L_0x001b:
            int r15 = r12.zzm
            if (r14 >= r15) goto L_0x0029
            int[] r15 = r12.zzk
            r15 = r15[r14]
            r12.zzG(r13, r15, r10, r7)
            int r14 = r14 + 1
            goto L_0x001b
        L_0x0029:
            if (r10 == 0) goto L_0x05b6
            r7.zzn(r13, r10)
            return
        L_0x002f:
            boolean r2 = r12.zzh     // Catch:{ all -> 0x0077 }
            if (r2 != 0) goto L_0x0035
            r2 = r9
            goto L_0x003c
        L_0x0035:
            com.google.android.gms.internal.gtm.zzwk r2 = r12.zzg     // Catch:{ all -> 0x0077 }
            java.lang.Object r1 = r8.zzd(r15, r2, r1)     // Catch:{ all -> 0x0077 }
            r2 = r1
        L_0x003c:
            if (r2 == 0) goto L_0x0051
            if (r0 != 0) goto L_0x0044
            com.google.android.gms.internal.gtm.zzuo r0 = r8.zzc(r13)     // Catch:{ all -> 0x0077 }
        L_0x0044:
            r11 = r0
            r0 = r8
            r1 = r14
            r3 = r15
            r4 = r11
            r5 = r10
            r6 = r7
            java.lang.Object r10 = r0.zze(r1, r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0077 }
            r0 = r11
            goto L_0x000a
        L_0x0051:
            r7.zzq(r14)     // Catch:{ all -> 0x0077 }
            if (r10 != 0) goto L_0x005b
            java.lang.Object r1 = r7.zzc(r13)     // Catch:{ all -> 0x0077 }
            r10 = r1
        L_0x005b:
            boolean r1 = r7.zzp(r10, r14)     // Catch:{ all -> 0x0077 }
            if (r1 != 0) goto L_0x000a
            int r14 = r12.zzl
        L_0x0063:
            int r15 = r12.zzm
            if (r14 >= r15) goto L_0x0071
            int[] r15 = r12.zzk
            r15 = r15[r14]
            r12.zzG(r13, r15, r10, r7)
            int r14 = r14 + 1
            goto L_0x0063
        L_0x0071:
            if (r10 == 0) goto L_0x05b6
            r7.zzn(r13, r10)
            return
        L_0x0077:
            r14 = move-exception
            goto L_0x05b7
        L_0x007a:
            int r3 = r12.zzC(r2)     // Catch:{ all -> 0x0077 }
            int r4 = zzB(r3)     // Catch:{ zzvj -> 0x0591 }
            r5 = 1048575(0xfffff, float:1.469367E-39)
            switch(r4) {
                case 0: goto L_0x0567;
                case 1: goto L_0x0558;
                case 2: goto L_0x0549;
                case 3: goto L_0x053a;
                case 4: goto L_0x052b;
                case 5: goto L_0x051c;
                case 6: goto L_0x050d;
                case 7: goto L_0x04fe;
                case 8: goto L_0x04f6;
                case 9: goto L_0x04c5;
                case 10: goto L_0x04b6;
                case 11: goto L_0x04a7;
                case 12: goto L_0x0485;
                case 13: goto L_0x0476;
                case 14: goto L_0x0467;
                case 15: goto L_0x0458;
                case 16: goto L_0x0449;
                case 17: goto L_0x0418;
                case 18: goto L_0x040a;
                case 19: goto L_0x03fc;
                case 20: goto L_0x03ee;
                case 21: goto L_0x03e0;
                case 22: goto L_0x03d2;
                case 23: goto L_0x03c4;
                case 24: goto L_0x03b6;
                case 25: goto L_0x03a8;
                case 26: goto L_0x0386;
                case 27: goto L_0x0374;
                case 28: goto L_0x0366;
                case 29: goto L_0x0358;
                case 30: goto L_0x0343;
                case 31: goto L_0x0335;
                case 32: goto L_0x0327;
                case 33: goto L_0x0319;
                case 34: goto L_0x030b;
                case 35: goto L_0x02fd;
                case 36: goto L_0x02ef;
                case 37: goto L_0x02e1;
                case 38: goto L_0x02d3;
                case 39: goto L_0x02c5;
                case 40: goto L_0x02b7;
                case 41: goto L_0x02a9;
                case 42: goto L_0x029b;
                case 43: goto L_0x028d;
                case 44: goto L_0x0278;
                case 45: goto L_0x026a;
                case 46: goto L_0x025c;
                case 47: goto L_0x024e;
                case 48: goto L_0x0240;
                case 49: goto L_0x022e;
                case 50: goto L_0x01f8;
                case 51: goto L_0x01e6;
                case 52: goto L_0x01d4;
                case 53: goto L_0x01c2;
                case 54: goto L_0x01b0;
                case 55: goto L_0x019e;
                case 56: goto L_0x018c;
                case 57: goto L_0x017a;
                case 58: goto L_0x0168;
                case 59: goto L_0x0160;
                case 60: goto L_0x012f;
                case 61: goto L_0x0121;
                case 62: goto L_0x010f;
                case 63: goto L_0x00ea;
                case 64: goto L_0x00d8;
                case 65: goto L_0x00c6;
                case 66: goto L_0x00b4;
                case 67: goto L_0x00a2;
                case 68: goto L_0x0090;
                default: goto L_0x0088;
            }     // Catch:{ zzvj -> 0x0591 }
        L_0x0088:
            if (r10 != 0) goto L_0x0577
            java.lang.Object r1 = r7.zzf()     // Catch:{ zzvj -> 0x0591 }
            goto L_0x0576
        L_0x0090:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.zzwx r5 = r12.zzF(r2)     // Catch:{ zzvj -> 0x0591 }
            java.lang.Object r5 = r14.zzs(r5, r15)     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.zzxy.zzs(r13, r3, r5)     // Catch:{ zzvj -> 0x0591 }
            r12.zzN(r13, r1, r2)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x00a2:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzvj -> 0x0591 }
            long r5 = r14.zzn()     // Catch:{ zzvj -> 0x0591 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.zzxy.zzs(r13, r3, r5)     // Catch:{ zzvj -> 0x0591 }
            r12.zzN(r13, r1, r2)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x00b4:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzvj -> 0x0591 }
            int r5 = r14.zzi()     // Catch:{ zzvj -> 0x0591 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.zzxy.zzs(r13, r3, r5)     // Catch:{ zzvj -> 0x0591 }
            r12.zzN(r13, r1, r2)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x00c6:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzvj -> 0x0591 }
            long r5 = r14.zzm()     // Catch:{ zzvj -> 0x0591 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.zzxy.zzs(r13, r3, r5)     // Catch:{ zzvj -> 0x0591 }
            r12.zzN(r13, r1, r2)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x00d8:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzvj -> 0x0591 }
            int r5 = r14.zzh()     // Catch:{ zzvj -> 0x0591 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.zzxy.zzs(r13, r3, r5)     // Catch:{ zzvj -> 0x0591 }
            r12.zzN(r13, r1, r2)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x00ea:
            int r4 = r14.zze()     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.zzvd r6 = r12.zzE(r2)     // Catch:{ zzvj -> 0x0591 }
            if (r6 == 0) goto L_0x0101
            boolean r6 = r6.zza(r4)     // Catch:{ zzvj -> 0x0591 }
            if (r6 == 0) goto L_0x00fb
            goto L_0x0101
        L_0x00fb:
            java.lang.Object r10 = com.google.android.gms.internal.gtm.zzwz.zzD(r1, r4, r10, r7)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x0101:
            r3 = r3 & r5
            long r5 = (long) r3     // Catch:{ zzvj -> 0x0591 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.zzxy.zzs(r13, r5, r3)     // Catch:{ zzvj -> 0x0591 }
            r12.zzN(r13, r1, r2)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x010f:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzvj -> 0x0591 }
            int r5 = r14.zzj()     // Catch:{ zzvj -> 0x0591 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.zzxy.zzs(r13, r3, r5)     // Catch:{ zzvj -> 0x0591 }
            r12.zzN(r13, r1, r2)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x0121:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.zztd r5 = r14.zzq()     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.zzxy.zzs(r13, r3, r5)     // Catch:{ zzvj -> 0x0591 }
            r12.zzN(r13, r1, r2)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x012f:
            boolean r4 = r12.zzT(r13, r1, r2)     // Catch:{ zzvj -> 0x0591 }
            if (r4 == 0) goto L_0x014b
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzvj -> 0x0591 }
            java.lang.Object r5 = com.google.android.gms.internal.gtm.zzxy.zzf(r13, r3)     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.zzwx r6 = r12.zzF(r2)     // Catch:{ zzvj -> 0x0591 }
            java.lang.Object r6 = r14.zzu(r6, r15)     // Catch:{ zzvj -> 0x0591 }
            java.lang.Object r5 = com.google.android.gms.internal.gtm.zzvi.zzg(r5, r6)     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.zzxy.zzs(r13, r3, r5)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x015b
        L_0x014b:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.zzwx r5 = r12.zzF(r2)     // Catch:{ zzvj -> 0x0591 }
            java.lang.Object r5 = r14.zzu(r5, r15)     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.zzxy.zzs(r13, r3, r5)     // Catch:{ zzvj -> 0x0591 }
            r12.zzM(r13, r2)     // Catch:{ zzvj -> 0x0591 }
        L_0x015b:
            r12.zzN(r13, r1, r2)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x0160:
            r12.zzL(r13, r3, r14)     // Catch:{ zzvj -> 0x0591 }
            r12.zzN(r13, r1, r2)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x0168:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzvj -> 0x0591 }
            boolean r5 = r14.zzS()     // Catch:{ zzvj -> 0x0591 }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.zzxy.zzs(r13, r3, r5)     // Catch:{ zzvj -> 0x0591 }
            r12.zzN(r13, r1, r2)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x017a:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzvj -> 0x0591 }
            int r5 = r14.zzf()     // Catch:{ zzvj -> 0x0591 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.zzxy.zzs(r13, r3, r5)     // Catch:{ zzvj -> 0x0591 }
            r12.zzN(r13, r1, r2)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x018c:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzvj -> 0x0591 }
            long r5 = r14.zzk()     // Catch:{ zzvj -> 0x0591 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.zzxy.zzs(r13, r3, r5)     // Catch:{ zzvj -> 0x0591 }
            r12.zzN(r13, r1, r2)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x019e:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzvj -> 0x0591 }
            int r5 = r14.zzg()     // Catch:{ zzvj -> 0x0591 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.zzxy.zzs(r13, r3, r5)     // Catch:{ zzvj -> 0x0591 }
            r12.zzN(r13, r1, r2)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x01b0:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzvj -> 0x0591 }
            long r5 = r14.zzo()     // Catch:{ zzvj -> 0x0591 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.zzxy.zzs(r13, r3, r5)     // Catch:{ zzvj -> 0x0591 }
            r12.zzN(r13, r1, r2)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x01c2:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzvj -> 0x0591 }
            long r5 = r14.zzl()     // Catch:{ zzvj -> 0x0591 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.zzxy.zzs(r13, r3, r5)     // Catch:{ zzvj -> 0x0591 }
            r12.zzN(r13, r1, r2)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x01d4:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzvj -> 0x0591 }
            float r5 = r14.zzb()     // Catch:{ zzvj -> 0x0591 }
            java.lang.Float r5 = java.lang.Float.valueOf(r5)     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.zzxy.zzs(r13, r3, r5)     // Catch:{ zzvj -> 0x0591 }
            r12.zzN(r13, r1, r2)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x01e6:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzvj -> 0x0591 }
            double r5 = r14.zza()     // Catch:{ zzvj -> 0x0591 }
            java.lang.Double r5 = java.lang.Double.valueOf(r5)     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.zzxy.zzs(r13, r3, r5)     // Catch:{ zzvj -> 0x0591 }
            r12.zzN(r13, r1, r2)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x01f8:
            java.lang.Object r1 = r12.zzH(r2)     // Catch:{ zzvj -> 0x0591 }
            int r2 = r12.zzC(r2)     // Catch:{ zzvj -> 0x0591 }
            r2 = r2 & r5
            long r2 = (long) r2     // Catch:{ zzvj -> 0x0591 }
            java.lang.Object r4 = com.google.android.gms.internal.gtm.zzxy.zzf(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            if (r4 == 0) goto L_0x021e
            boolean r5 = com.google.android.gms.internal.gtm.zzwf.zzb(r4)     // Catch:{ zzvj -> 0x0591 }
            if (r5 == 0) goto L_0x0229
            com.google.android.gms.internal.gtm.zzwe r5 = com.google.android.gms.internal.gtm.zzwe.zza()     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.zzwe r5 = r5.zzb()     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.zzwf.zzc(r5, r4)     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.zzxy.zzs(r13, r2, r5)     // Catch:{ zzvj -> 0x0591 }
            r4 = r5
            goto L_0x0229
        L_0x021e:
            com.google.android.gms.internal.gtm.zzwe r4 = com.google.android.gms.internal.gtm.zzwe.zza()     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.zzwe r4 = r4.zzb()     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.zzxy.zzs(r13, r2, r4)     // Catch:{ zzvj -> 0x0591 }
        L_0x0229:
            com.google.android.gms.internal.gtm.zzwe r4 = (com.google.android.gms.internal.gtm.zzwe) r4     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.zzwd r1 = (com.google.android.gms.internal.gtm.zzwd) r1     // Catch:{ zzvj -> 0x0591 }
            throw r9     // Catch:{ zzvj -> 0x0591 }
        L_0x022e:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.zzwx r1 = r12.zzF(r2)     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.zzvy r2 = r12.zzn     // Catch:{ zzvj -> 0x0591 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzvj -> 0x0591 }
            r14.zzF(r2, r1, r15)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x0240:
            com.google.android.gms.internal.gtm.zzvy r1 = r12.zzn     // Catch:{ zzvj -> 0x0591 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzvj -> 0x0591 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            r14.zzM(r1)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x024e:
            com.google.android.gms.internal.gtm.zzvy r1 = r12.zzn     // Catch:{ zzvj -> 0x0591 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzvj -> 0x0591 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            r14.zzL(r1)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x025c:
            com.google.android.gms.internal.gtm.zzvy r1 = r12.zzn     // Catch:{ zzvj -> 0x0591 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzvj -> 0x0591 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            r14.zzK(r1)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x026a:
            com.google.android.gms.internal.gtm.zzvy r1 = r12.zzn     // Catch:{ zzvj -> 0x0591 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzvj -> 0x0591 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            r14.zzJ(r1)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x0278:
            com.google.android.gms.internal.gtm.zzvy r4 = r12.zzn     // Catch:{ zzvj -> 0x0591 }
            r3 = r3 & r5
            long r5 = (long) r3     // Catch:{ zzvj -> 0x0591 }
            java.util.List r3 = r4.zza(r13, r5)     // Catch:{ zzvj -> 0x0591 }
            r14.zzB(r3)     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.zzvd r2 = r12.zzE(r2)     // Catch:{ zzvj -> 0x0591 }
            java.lang.Object r10 = com.google.android.gms.internal.gtm.zzwz.zzC(r1, r3, r2, r10, r7)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x028d:
            com.google.android.gms.internal.gtm.zzvy r1 = r12.zzn     // Catch:{ zzvj -> 0x0591 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzvj -> 0x0591 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            r14.zzQ(r1)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x029b:
            com.google.android.gms.internal.gtm.zzvy r1 = r12.zzn     // Catch:{ zzvj -> 0x0591 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzvj -> 0x0591 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            r14.zzy(r1)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x02a9:
            com.google.android.gms.internal.gtm.zzvy r1 = r12.zzn     // Catch:{ zzvj -> 0x0591 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzvj -> 0x0591 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            r14.zzC(r1)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x02b7:
            com.google.android.gms.internal.gtm.zzvy r1 = r12.zzn     // Catch:{ zzvj -> 0x0591 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzvj -> 0x0591 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            r14.zzD(r1)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x02c5:
            com.google.android.gms.internal.gtm.zzvy r1 = r12.zzn     // Catch:{ zzvj -> 0x0591 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzvj -> 0x0591 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            r14.zzG(r1)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x02d3:
            com.google.android.gms.internal.gtm.zzvy r1 = r12.zzn     // Catch:{ zzvj -> 0x0591 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzvj -> 0x0591 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            r14.zzR(r1)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x02e1:
            com.google.android.gms.internal.gtm.zzvy r1 = r12.zzn     // Catch:{ zzvj -> 0x0591 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzvj -> 0x0591 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            r14.zzH(r1)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x02ef:
            com.google.android.gms.internal.gtm.zzvy r1 = r12.zzn     // Catch:{ zzvj -> 0x0591 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzvj -> 0x0591 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            r14.zzE(r1)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x02fd:
            com.google.android.gms.internal.gtm.zzvy r1 = r12.zzn     // Catch:{ zzvj -> 0x0591 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzvj -> 0x0591 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            r14.zzA(r1)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x030b:
            com.google.android.gms.internal.gtm.zzvy r1 = r12.zzn     // Catch:{ zzvj -> 0x0591 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzvj -> 0x0591 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            r14.zzM(r1)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x0319:
            com.google.android.gms.internal.gtm.zzvy r1 = r12.zzn     // Catch:{ zzvj -> 0x0591 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzvj -> 0x0591 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            r14.zzL(r1)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x0327:
            com.google.android.gms.internal.gtm.zzvy r1 = r12.zzn     // Catch:{ zzvj -> 0x0591 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzvj -> 0x0591 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            r14.zzK(r1)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x0335:
            com.google.android.gms.internal.gtm.zzvy r1 = r12.zzn     // Catch:{ zzvj -> 0x0591 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzvj -> 0x0591 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            r14.zzJ(r1)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x0343:
            com.google.android.gms.internal.gtm.zzvy r4 = r12.zzn     // Catch:{ zzvj -> 0x0591 }
            r3 = r3 & r5
            long r5 = (long) r3     // Catch:{ zzvj -> 0x0591 }
            java.util.List r3 = r4.zza(r13, r5)     // Catch:{ zzvj -> 0x0591 }
            r14.zzB(r3)     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.zzvd r2 = r12.zzE(r2)     // Catch:{ zzvj -> 0x0591 }
            java.lang.Object r10 = com.google.android.gms.internal.gtm.zzwz.zzC(r1, r3, r2, r10, r7)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x0358:
            com.google.android.gms.internal.gtm.zzvy r1 = r12.zzn     // Catch:{ zzvj -> 0x0591 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzvj -> 0x0591 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            r14.zzQ(r1)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x0366:
            com.google.android.gms.internal.gtm.zzvy r1 = r12.zzn     // Catch:{ zzvj -> 0x0591 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzvj -> 0x0591 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            r14.zzz(r1)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x0374:
            com.google.android.gms.internal.gtm.zzwx r1 = r12.zzF(r2)     // Catch:{ zzvj -> 0x0591 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.zzvy r4 = r12.zzn     // Catch:{ zzvj -> 0x0591 }
            java.util.List r2 = r4.zza(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            r14.zzI(r2, r1, r15)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x0386:
            boolean r1 = zzP(r3)     // Catch:{ zzvj -> 0x0591 }
            if (r1 == 0) goto L_0x039a
            com.google.android.gms.internal.gtm.zzvy r1 = r12.zzn     // Catch:{ zzvj -> 0x0591 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzvj -> 0x0591 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            r14.zzP(r1)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x039a:
            com.google.android.gms.internal.gtm.zzvy r1 = r12.zzn     // Catch:{ zzvj -> 0x0591 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzvj -> 0x0591 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            r14.zzN(r1)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x03a8:
            com.google.android.gms.internal.gtm.zzvy r1 = r12.zzn     // Catch:{ zzvj -> 0x0591 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzvj -> 0x0591 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            r14.zzy(r1)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x03b6:
            com.google.android.gms.internal.gtm.zzvy r1 = r12.zzn     // Catch:{ zzvj -> 0x0591 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzvj -> 0x0591 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            r14.zzC(r1)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x03c4:
            com.google.android.gms.internal.gtm.zzvy r1 = r12.zzn     // Catch:{ zzvj -> 0x0591 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzvj -> 0x0591 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            r14.zzD(r1)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x03d2:
            com.google.android.gms.internal.gtm.zzvy r1 = r12.zzn     // Catch:{ zzvj -> 0x0591 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzvj -> 0x0591 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            r14.zzG(r1)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x03e0:
            com.google.android.gms.internal.gtm.zzvy r1 = r12.zzn     // Catch:{ zzvj -> 0x0591 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzvj -> 0x0591 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            r14.zzR(r1)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x03ee:
            com.google.android.gms.internal.gtm.zzvy r1 = r12.zzn     // Catch:{ zzvj -> 0x0591 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzvj -> 0x0591 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            r14.zzH(r1)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x03fc:
            com.google.android.gms.internal.gtm.zzvy r1 = r12.zzn     // Catch:{ zzvj -> 0x0591 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzvj -> 0x0591 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            r14.zzE(r1)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x040a:
            com.google.android.gms.internal.gtm.zzvy r1 = r12.zzn     // Catch:{ zzvj -> 0x0591 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzvj -> 0x0591 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            r14.zzA(r1)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x0418:
            boolean r1 = r12.zzQ(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            if (r1 == 0) goto L_0x0436
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzvj -> 0x0591 }
            java.lang.Object r1 = com.google.android.gms.internal.gtm.zzxy.zzf(r13, r3)     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.zzwx r2 = r12.zzF(r2)     // Catch:{ zzvj -> 0x0591 }
            java.lang.Object r2 = r14.zzs(r2, r15)     // Catch:{ zzvj -> 0x0591 }
            java.lang.Object r1 = com.google.android.gms.internal.gtm.zzvi.zzg(r1, r2)     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.zzxy.zzs(r13, r3, r1)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x0436:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.zzwx r1 = r12.zzF(r2)     // Catch:{ zzvj -> 0x0591 }
            java.lang.Object r1 = r14.zzs(r1, r15)     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.zzxy.zzs(r13, r3, r1)     // Catch:{ zzvj -> 0x0591 }
            r12.zzM(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x0449:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzvj -> 0x0591 }
            long r5 = r14.zzn()     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.zzxy.zzr(r13, r3, r5)     // Catch:{ zzvj -> 0x0591 }
            r12.zzM(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x0458:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzvj -> 0x0591 }
            int r1 = r14.zzi()     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.zzxy.zzq(r13, r3, r1)     // Catch:{ zzvj -> 0x0591 }
            r12.zzM(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x0467:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzvj -> 0x0591 }
            long r5 = r14.zzm()     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.zzxy.zzr(r13, r3, r5)     // Catch:{ zzvj -> 0x0591 }
            r12.zzM(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x0476:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzvj -> 0x0591 }
            int r1 = r14.zzh()     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.zzxy.zzq(r13, r3, r1)     // Catch:{ zzvj -> 0x0591 }
            r12.zzM(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x0485:
            int r4 = r14.zze()     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.zzvd r6 = r12.zzE(r2)     // Catch:{ zzvj -> 0x0591 }
            if (r6 == 0) goto L_0x049c
            boolean r6 = r6.zza(r4)     // Catch:{ zzvj -> 0x0591 }
            if (r6 == 0) goto L_0x0496
            goto L_0x049c
        L_0x0496:
            java.lang.Object r10 = com.google.android.gms.internal.gtm.zzwz.zzD(r1, r4, r10, r7)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x049c:
            r1 = r3 & r5
            long r5 = (long) r1     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.zzxy.zzq(r13, r5, r4)     // Catch:{ zzvj -> 0x0591 }
            r12.zzM(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x04a7:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzvj -> 0x0591 }
            int r1 = r14.zzj()     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.zzxy.zzq(r13, r3, r1)     // Catch:{ zzvj -> 0x0591 }
            r12.zzM(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x04b6:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.zztd r1 = r14.zzq()     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.zzxy.zzs(r13, r3, r1)     // Catch:{ zzvj -> 0x0591 }
            r12.zzM(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x04c5:
            boolean r1 = r12.zzQ(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            if (r1 == 0) goto L_0x04e3
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzvj -> 0x0591 }
            java.lang.Object r1 = com.google.android.gms.internal.gtm.zzxy.zzf(r13, r3)     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.zzwx r2 = r12.zzF(r2)     // Catch:{ zzvj -> 0x0591 }
            java.lang.Object r2 = r14.zzu(r2, r15)     // Catch:{ zzvj -> 0x0591 }
            java.lang.Object r1 = com.google.android.gms.internal.gtm.zzvi.zzg(r1, r2)     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.zzxy.zzs(r13, r3, r1)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x04e3:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.zzwx r1 = r12.zzF(r2)     // Catch:{ zzvj -> 0x0591 }
            java.lang.Object r1 = r14.zzu(r1, r15)     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.zzxy.zzs(r13, r3, r1)     // Catch:{ zzvj -> 0x0591 }
            r12.zzM(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x04f6:
            r12.zzL(r13, r3, r14)     // Catch:{ zzvj -> 0x0591 }
            r12.zzM(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x04fe:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzvj -> 0x0591 }
            boolean r1 = r14.zzS()     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.zzxy.zzm(r13, r3, r1)     // Catch:{ zzvj -> 0x0591 }
            r12.zzM(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x050d:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzvj -> 0x0591 }
            int r1 = r14.zzf()     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.zzxy.zzq(r13, r3, r1)     // Catch:{ zzvj -> 0x0591 }
            r12.zzM(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x051c:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzvj -> 0x0591 }
            long r5 = r14.zzk()     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.zzxy.zzr(r13, r3, r5)     // Catch:{ zzvj -> 0x0591 }
            r12.zzM(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x052b:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzvj -> 0x0591 }
            int r1 = r14.zzg()     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.zzxy.zzq(r13, r3, r1)     // Catch:{ zzvj -> 0x0591 }
            r12.zzM(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x053a:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzvj -> 0x0591 }
            long r5 = r14.zzo()     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.zzxy.zzr(r13, r3, r5)     // Catch:{ zzvj -> 0x0591 }
            r12.zzM(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x0549:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzvj -> 0x0591 }
            long r5 = r14.zzl()     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.zzxy.zzr(r13, r3, r5)     // Catch:{ zzvj -> 0x0591 }
            r12.zzM(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x0558:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzvj -> 0x0591 }
            float r1 = r14.zzb()     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.zzxy.zzp(r13, r3, r1)     // Catch:{ zzvj -> 0x0591 }
            r12.zzM(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x0567:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzvj -> 0x0591 }
            double r5 = r14.zza()     // Catch:{ zzvj -> 0x0591 }
            com.google.android.gms.internal.gtm.zzxy.zzo(r13, r3, r5)     // Catch:{ zzvj -> 0x0591 }
            r12.zzM(r13, r2)     // Catch:{ zzvj -> 0x0591 }
            goto L_0x000a
        L_0x0576:
            r10 = r1
        L_0x0577:
            boolean r1 = r7.zzp(r10, r14)     // Catch:{ zzvj -> 0x0591 }
            if (r1 != 0) goto L_0x000a
            int r14 = r12.zzl
        L_0x057f:
            int r15 = r12.zzm
            if (r14 >= r15) goto L_0x058d
            int[] r15 = r12.zzk
            r15 = r15[r14]
            r12.zzG(r13, r15, r10, r7)
            int r14 = r14 + 1
            goto L_0x057f
        L_0x058d:
            r7.zzn(r13, r10)
            return
        L_0x0591:
            r7.zzq(r14)     // Catch:{ all -> 0x0077 }
            if (r10 != 0) goto L_0x059b
            java.lang.Object r1 = r7.zzc(r13)     // Catch:{ all -> 0x0077 }
            r10 = r1
        L_0x059b:
            boolean r1 = r7.zzp(r10, r14)     // Catch:{ all -> 0x0077 }
            if (r1 != 0) goto L_0x000a
            int r14 = r12.zzl
        L_0x05a3:
            int r15 = r12.zzm
            if (r14 >= r15) goto L_0x05b1
            int[] r15 = r12.zzk
            r15 = r15[r14]
            r12.zzG(r13, r15, r10, r7)
            int r14 = r14 + 1
            goto L_0x05a3
        L_0x05b1:
            if (r10 == 0) goto L_0x05b6
            r7.zzn(r13, r10)
        L_0x05b6:
            return
        L_0x05b7:
            int r15 = r12.zzl
        L_0x05b9:
            int r0 = r12.zzm
            if (r15 >= r0) goto L_0x05c7
            int[] r0 = r12.zzk
            r0 = r0[r15]
            r12.zzG(r13, r0, r10, r7)
            int r15 = r15 + 1
            goto L_0x05b9
        L_0x05c7:
            if (r10 == 0) goto L_0x05cc
            r7.zzn(r13, r10)
        L_0x05cc:
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzwn.zzh(java.lang.Object, com.google.android.gms.internal.gtm.zzww, com.google.android.gms.internal.gtm.zzuj):void");
    }

    public final void zzi(T t, byte[] bArr, int i, int i2, zzsl zzsl) throws IOException {
        if (this.zzj) {
            zzv(t, bArr, i, i2, zzsl);
        } else {
            zzc(t, bArr, i, i2, 0, zzsl);
        }
    }

    public final boolean zzj(T t, T t2) {
        boolean z;
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int zzC = zzC(i);
            long j = (long) (zzC & 1048575);
            switch (zzB(zzC)) {
                case 0:
                    if (zzO(t, t2, i) && Double.doubleToLongBits(zzxy.zza(t, j)) == Double.doubleToLongBits(zzxy.zza(t2, j))) {
                        continue;
                    }
                case 1:
                    if (zzO(t, t2, i) && Float.floatToIntBits(zzxy.zzb(t, j)) == Float.floatToIntBits(zzxy.zzb(t2, j))) {
                        continue;
                    }
                case 2:
                    if (zzO(t, t2, i) && zzxy.zzd(t, j) == zzxy.zzd(t2, j)) {
                        continue;
                    }
                case 3:
                    if (zzO(t, t2, i) && zzxy.zzd(t, j) == zzxy.zzd(t2, j)) {
                        continue;
                    }
                case 4:
                    if (zzO(t, t2, i) && zzxy.zzc(t, j) == zzxy.zzc(t2, j)) {
                        continue;
                    }
                case 5:
                    if (zzO(t, t2, i) && zzxy.zzd(t, j) == zzxy.zzd(t2, j)) {
                        continue;
                    }
                case 6:
                    if (zzO(t, t2, i) && zzxy.zzc(t, j) == zzxy.zzc(t2, j)) {
                        continue;
                    }
                case 7:
                    if (zzO(t, t2, i) && zzxy.zzw(t, j) == zzxy.zzw(t2, j)) {
                        continue;
                    }
                case 8:
                    if (zzO(t, t2, i) && zzwz.zzH(zzxy.zzf(t, j), zzxy.zzf(t2, j))) {
                        continue;
                    }
                case 9:
                    if (zzO(t, t2, i) && zzwz.zzH(zzxy.zzf(t, j), zzxy.zzf(t2, j))) {
                        continue;
                    }
                case 10:
                    if (zzO(t, t2, i) && zzwz.zzH(zzxy.zzf(t, j), zzxy.zzf(t2, j))) {
                        continue;
                    }
                case 11:
                    if (zzO(t, t2, i) && zzxy.zzc(t, j) == zzxy.zzc(t2, j)) {
                        continue;
                    }
                case 12:
                    if (zzO(t, t2, i) && zzxy.zzc(t, j) == zzxy.zzc(t2, j)) {
                        continue;
                    }
                case 13:
                    if (zzO(t, t2, i) && zzxy.zzc(t, j) == zzxy.zzc(t2, j)) {
                        continue;
                    }
                case 14:
                    if (zzO(t, t2, i) && zzxy.zzd(t, j) == zzxy.zzd(t2, j)) {
                        continue;
                    }
                case 15:
                    if (zzO(t, t2, i) && zzxy.zzc(t, j) == zzxy.zzc(t2, j)) {
                        continue;
                    }
                case 16:
                    if (zzO(t, t2, i) && zzxy.zzd(t, j) == zzxy.zzd(t2, j)) {
                        continue;
                    }
                case 17:
                    if (zzO(t, t2, i) && zzwz.zzH(zzxy.zzf(t, j), zzxy.zzf(t2, j))) {
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
                    z = zzwz.zzH(zzxy.zzf(t, j), zzxy.zzf(t2, j));
                    break;
                case 50:
                    z = zzwz.zzH(zzxy.zzf(t, j), zzxy.zzf(t2, j));
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
                    long zzz = (long) (zzz(i) & 1048575);
                    if (zzxy.zzc(t, zzz) == zzxy.zzc(t2, zzz) && zzwz.zzH(zzxy.zzf(t, j), zzxy.zzf(t2, j))) {
                        continue;
                    }
            }
            if (!z) {
                return false;
            }
        }
        if (!this.zzo.zzd(t).equals(this.zzo.zzd(t2))) {
            return false;
        }
        if (this.zzh) {
            return this.zzp.zzb(t).equals(this.zzp.zzb(t2));
        }
        return true;
    }

    public final boolean zzk(T t) {
        int i;
        int i2;
        T t2 = t;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.zzl) {
            int i6 = this.zzk[i5];
            int i7 = this.zzc[i6];
            int zzC = zzC(i6);
            int i8 = this.zzc[i6 + 2];
            int i9 = i8 & 1048575;
            int i11 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = zzb.getInt(t2, (long) i9);
                }
                i = i4;
                i2 = i9;
            } else {
                i2 = i3;
                i = i4;
            }
            if ((268435456 & zzC) != 0 && !zzR(t, i6, i2, i, i11)) {
                return false;
            }
            int zzB = zzB(zzC);
            if (zzB != 9 && zzB != 17) {
                if (zzB != 27) {
                    if (zzB == 60 || zzB == 68) {
                        if (zzT(t2, i7, i6) && !zzS(t2, zzC, zzF(i6))) {
                            return false;
                        }
                    } else if (zzB != 49) {
                        if (zzB == 50 && !((zzwe) zzxy.zzf(t2, (long) (zzC & 1048575))).isEmpty()) {
                            zzwd zzwd = (zzwd) zzH(i6);
                            throw null;
                        }
                    }
                }
                List list = (List) zzxy.zzf(t2, (long) (zzC & 1048575));
                if (!list.isEmpty()) {
                    zzwx zzF = zzF(i6);
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        if (!zzF.zzk(list.get(i12))) {
                            return false;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            } else if (zzR(t, i6, i2, i, i11) && !zzS(t2, zzC, zzF(i6))) {
                return false;
            }
            i5++;
            i3 = i2;
            i4 = i;
        }
        if (!this.zzh || this.zzp.zzb(t2).zzk()) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0507  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzn(T r13, com.google.android.gms.internal.gtm.zztp r14) throws java.io.IOException {
        /*
            r12 = this;
            boolean r0 = r12.zzj
            if (r0 == 0) goto L_0x0525
            boolean r0 = r12.zzh
            r1 = 0
            if (r0 == 0) goto L_0x0022
            com.google.android.gms.internal.gtm.zzuk<?> r0 = r12.zzp
            com.google.android.gms.internal.gtm.zzuo r0 = r0.zzb(r13)
            com.google.android.gms.internal.gtm.zzxk<T, java.lang.Object> r2 = r0.zza
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
            int r6 = r12.zzC(r5)
            int[] r7 = r12.zzc
            r7 = r7[r5]
        L_0x0033:
            if (r2 == 0) goto L_0x0051
            com.google.android.gms.internal.gtm.zzuk<?> r8 = r12.zzp
            int r8 = r8.zza(r2)
            if (r8 > r7) goto L_0x0051
            com.google.android.gms.internal.gtm.zzuk<?> r8 = r12.zzp
            r8.zzj(r14, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x004f
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0033
        L_0x004f:
            r2 = r1
            goto L_0x0033
        L_0x0051:
            int r8 = zzB(r6)
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
            boolean r8 = r12.zzT(r13, r7, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.zzxy.zzf(r13, r8)
            com.google.android.gms.internal.gtm.zzwx r8 = r12.zzF(r5)
            r14.zzq(r7, r6, r8)
            goto L_0x0501
        L_0x0073:
            boolean r8 = r12.zzT(r13, r7, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = zzD(r13, r8)
            r14.zzD(r7, r8)
            goto L_0x0501
        L_0x0084:
            boolean r8 = r12.zzT(r13, r7, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = zzs(r13, r8)
            r14.zzB(r7, r6)
            goto L_0x0501
        L_0x0095:
            boolean r8 = r12.zzT(r13, r7, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = zzD(r13, r8)
            r14.zzz(r7, r8)
            goto L_0x0501
        L_0x00a6:
            boolean r8 = r12.zzT(r13, r7, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = zzs(r13, r8)
            r14.zzx(r7, r6)
            goto L_0x0501
        L_0x00b7:
            boolean r8 = r12.zzT(r13, r7, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = zzs(r13, r8)
            r14.zzi(r7, r6)
            goto L_0x0501
        L_0x00c8:
            boolean r8 = r12.zzT(r13, r7, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = zzs(r13, r8)
            r14.zzI(r7, r6)
            goto L_0x0501
        L_0x00d9:
            boolean r8 = r12.zzT(r13, r7, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.zzxy.zzf(r13, r8)
            com.google.android.gms.internal.gtm.zztd r6 = (com.google.android.gms.internal.gtm.zztd) r6
            r14.zzd(r7, r6)
            goto L_0x0501
        L_0x00ec:
            boolean r8 = r12.zzT(r13, r7, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.zzxy.zzf(r13, r8)
            com.google.android.gms.internal.gtm.zzwx r8 = r12.zzF(r5)
            r14.zzv(r7, r6, r8)
            goto L_0x0501
        L_0x0101:
            boolean r8 = r12.zzT(r13, r7, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.zzxy.zzf(r13, r8)
            zzX(r7, r6, r14)
            goto L_0x0501
        L_0x0112:
            boolean r8 = r12.zzT(r13, r7, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            boolean r6 = zzU(r13, r8)
            r14.zzb(r7, r6)
            goto L_0x0501
        L_0x0123:
            boolean r8 = r12.zzT(r13, r7, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = zzs(r13, r8)
            r14.zzk(r7, r6)
            goto L_0x0501
        L_0x0134:
            boolean r8 = r12.zzT(r13, r7, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = zzD(r13, r8)
            r14.zzm(r7, r8)
            goto L_0x0501
        L_0x0145:
            boolean r8 = r12.zzT(r13, r7, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = zzs(r13, r8)
            r14.zzr(r7, r6)
            goto L_0x0501
        L_0x0156:
            boolean r8 = r12.zzT(r13, r7, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = zzD(r13, r8)
            r14.zzK(r7, r8)
            goto L_0x0501
        L_0x0167:
            boolean r8 = r12.zzT(r13, r7, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = zzD(r13, r8)
            r14.zzt(r7, r8)
            goto L_0x0501
        L_0x0178:
            boolean r8 = r12.zzT(r13, r7, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            float r6 = zzp(r13, r8)
            r14.zzo(r7, r6)
            goto L_0x0501
        L_0x0189:
            boolean r8 = r12.zzT(r13, r7, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            double r8 = zzo(r13, r8)
            r14.zzf(r7, r8)
            goto L_0x0501
        L_0x019a:
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.zzxy.zzf(r13, r8)
            r12.zzW(r14, r7, r6, r5)
            goto L_0x0501
        L_0x01a5:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.zzxy.zzf(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.gtm.zzwx r8 = r12.zzF(r5)
            com.google.android.gms.internal.gtm.zzwz.zzQ(r7, r6, r14, r8)
            goto L_0x0501
        L_0x01ba:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.zzxy.zzf(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.gtm.zzwz.zzX(r7, r6, r14, r9)
            goto L_0x0501
        L_0x01cb:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.zzxy.zzf(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.gtm.zzwz.zzW(r7, r6, r14, r9)
            goto L_0x0501
        L_0x01dc:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.zzxy.zzf(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.gtm.zzwz.zzV(r7, r6, r14, r9)
            goto L_0x0501
        L_0x01ed:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.zzxy.zzf(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.gtm.zzwz.zzU(r7, r6, r14, r9)
            goto L_0x0501
        L_0x01fe:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.zzxy.zzf(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.gtm.zzwz.zzM(r7, r6, r14, r9)
            goto L_0x0501
        L_0x020f:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.zzxy.zzf(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.gtm.zzwz.zzZ(r7, r6, r14, r9)
            goto L_0x0501
        L_0x0220:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.zzxy.zzf(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.gtm.zzwz.zzJ(r7, r6, r14, r9)
            goto L_0x0501
        L_0x0231:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.zzxy.zzf(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.gtm.zzwz.zzN(r7, r6, r14, r9)
            goto L_0x0501
        L_0x0242:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.zzxy.zzf(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.gtm.zzwz.zzO(r7, r6, r14, r9)
            goto L_0x0501
        L_0x0253:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.zzxy.zzf(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.gtm.zzwz.zzR(r7, r6, r14, r9)
            goto L_0x0501
        L_0x0264:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.zzxy.zzf(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.gtm.zzwz.zzaa(r7, r6, r14, r9)
            goto L_0x0501
        L_0x0275:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.zzxy.zzf(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.gtm.zzwz.zzS(r7, r6, r14, r9)
            goto L_0x0501
        L_0x0286:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.zzxy.zzf(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.gtm.zzwz.zzP(r7, r6, r14, r9)
            goto L_0x0501
        L_0x0297:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.zzxy.zzf(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.gtm.zzwz.zzL(r7, r6, r14, r9)
            goto L_0x0501
        L_0x02a8:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.zzxy.zzf(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.gtm.zzwz.zzX(r7, r6, r14, r4)
            goto L_0x0501
        L_0x02b9:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.zzxy.zzf(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.gtm.zzwz.zzW(r7, r6, r14, r4)
            goto L_0x0501
        L_0x02ca:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.zzxy.zzf(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.gtm.zzwz.zzV(r7, r6, r14, r4)
            goto L_0x0501
        L_0x02db:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.zzxy.zzf(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.gtm.zzwz.zzU(r7, r6, r14, r4)
            goto L_0x0501
        L_0x02ec:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.zzxy.zzf(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.gtm.zzwz.zzM(r7, r6, r14, r4)
            goto L_0x0501
        L_0x02fd:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.zzxy.zzf(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.gtm.zzwz.zzZ(r7, r6, r14, r4)
            goto L_0x0501
        L_0x030e:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.zzxy.zzf(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.gtm.zzwz.zzK(r7, r6, r14)
            goto L_0x0501
        L_0x031f:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.zzxy.zzf(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.gtm.zzwx r8 = r12.zzF(r5)
            com.google.android.gms.internal.gtm.zzwz.zzT(r7, r6, r14, r8)
            goto L_0x0501
        L_0x0334:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.zzxy.zzf(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.gtm.zzwz.zzY(r7, r6, r14)
            goto L_0x0501
        L_0x0345:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.zzxy.zzf(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.gtm.zzwz.zzJ(r7, r6, r14, r4)
            goto L_0x0501
        L_0x0356:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.zzxy.zzf(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.gtm.zzwz.zzN(r7, r6, r14, r4)
            goto L_0x0501
        L_0x0367:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.zzxy.zzf(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.gtm.zzwz.zzO(r7, r6, r14, r4)
            goto L_0x0501
        L_0x0378:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.zzxy.zzf(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.gtm.zzwz.zzR(r7, r6, r14, r4)
            goto L_0x0501
        L_0x0389:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.zzxy.zzf(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.gtm.zzwz.zzaa(r7, r6, r14, r4)
            goto L_0x0501
        L_0x039a:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.zzxy.zzf(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.gtm.zzwz.zzS(r7, r6, r14, r4)
            goto L_0x0501
        L_0x03ab:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.zzxy.zzf(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.gtm.zzwz.zzP(r7, r6, r14, r4)
            goto L_0x0501
        L_0x03bc:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.zzxy.zzf(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.gtm.zzwz.zzL(r7, r6, r14, r4)
            goto L_0x0501
        L_0x03cd:
            boolean r8 = r12.zzQ(r13, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.zzxy.zzf(r13, r8)
            com.google.android.gms.internal.gtm.zzwx r8 = r12.zzF(r5)
            r14.zzq(r7, r6, r8)
            goto L_0x0501
        L_0x03e2:
            boolean r8 = r12.zzQ(r13, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = com.google.android.gms.internal.gtm.zzxy.zzd(r13, r8)
            r14.zzD(r7, r8)
            goto L_0x0501
        L_0x03f3:
            boolean r8 = r12.zzQ(r13, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = com.google.android.gms.internal.gtm.zzxy.zzc(r13, r8)
            r14.zzB(r7, r6)
            goto L_0x0501
        L_0x0404:
            boolean r8 = r12.zzQ(r13, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = com.google.android.gms.internal.gtm.zzxy.zzd(r13, r8)
            r14.zzz(r7, r8)
            goto L_0x0501
        L_0x0415:
            boolean r8 = r12.zzQ(r13, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = com.google.android.gms.internal.gtm.zzxy.zzc(r13, r8)
            r14.zzx(r7, r6)
            goto L_0x0501
        L_0x0426:
            boolean r8 = r12.zzQ(r13, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = com.google.android.gms.internal.gtm.zzxy.zzc(r13, r8)
            r14.zzi(r7, r6)
            goto L_0x0501
        L_0x0437:
            boolean r8 = r12.zzQ(r13, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = com.google.android.gms.internal.gtm.zzxy.zzc(r13, r8)
            r14.zzI(r7, r6)
            goto L_0x0501
        L_0x0448:
            boolean r8 = r12.zzQ(r13, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.zzxy.zzf(r13, r8)
            com.google.android.gms.internal.gtm.zztd r6 = (com.google.android.gms.internal.gtm.zztd) r6
            r14.zzd(r7, r6)
            goto L_0x0501
        L_0x045b:
            boolean r8 = r12.zzQ(r13, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.zzxy.zzf(r13, r8)
            com.google.android.gms.internal.gtm.zzwx r8 = r12.zzF(r5)
            r14.zzv(r7, r6, r8)
            goto L_0x0501
        L_0x0470:
            boolean r8 = r12.zzQ(r13, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.gtm.zzxy.zzf(r13, r8)
            zzX(r7, r6, r14)
            goto L_0x0501
        L_0x0481:
            boolean r8 = r12.zzQ(r13, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            boolean r6 = com.google.android.gms.internal.gtm.zzxy.zzw(r13, r8)
            r14.zzb(r7, r6)
            goto L_0x0501
        L_0x0492:
            boolean r8 = r12.zzQ(r13, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = com.google.android.gms.internal.gtm.zzxy.zzc(r13, r8)
            r14.zzk(r7, r6)
            goto L_0x0501
        L_0x04a2:
            boolean r8 = r12.zzQ(r13, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = com.google.android.gms.internal.gtm.zzxy.zzd(r13, r8)
            r14.zzm(r7, r8)
            goto L_0x0501
        L_0x04b2:
            boolean r8 = r12.zzQ(r13, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = com.google.android.gms.internal.gtm.zzxy.zzc(r13, r8)
            r14.zzr(r7, r6)
            goto L_0x0501
        L_0x04c2:
            boolean r8 = r12.zzQ(r13, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = com.google.android.gms.internal.gtm.zzxy.zzd(r13, r8)
            r14.zzK(r7, r8)
            goto L_0x0501
        L_0x04d2:
            boolean r8 = r12.zzQ(r13, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = com.google.android.gms.internal.gtm.zzxy.zzd(r13, r8)
            r14.zzt(r7, r8)
            goto L_0x0501
        L_0x04e2:
            boolean r8 = r12.zzQ(r13, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            float r6 = com.google.android.gms.internal.gtm.zzxy.zzb(r13, r8)
            r14.zzo(r7, r6)
            goto L_0x0501
        L_0x04f2:
            boolean r8 = r12.zzQ(r13, r5)
            if (r8 == 0) goto L_0x0501
            r6 = r6 & r10
            long r8 = (long) r6
            double r8 = com.google.android.gms.internal.gtm.zzxy.zza(r13, r8)
            r14.zzf(r7, r8)
        L_0x0501:
            int r5 = r5 + 3
            goto L_0x0029
        L_0x0505:
            if (r2 == 0) goto L_0x051b
            com.google.android.gms.internal.gtm.zzuk<?> r3 = r12.zzp
            r3.zzj(r14, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0519
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0505
        L_0x0519:
            r2 = r1
            goto L_0x0505
        L_0x051b:
            com.google.android.gms.internal.gtm.zzxo<?, ?> r0 = r12.zzo
            java.lang.Object r13 = r0.zzd(r13)
            r0.zzs(r13, r14)
            return
        L_0x0525:
            r12.zzV(r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzwn.zzn(java.lang.Object, com.google.android.gms.internal.gtm.zztp):void");
    }
}
