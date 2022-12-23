package com.google.android.gms.internal.contextmanager;

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

final class zznq<T> implements zznz<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzox.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zznn zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zznb zzm;
    private final zzon<?, ?> zzn;
    private final zzlq<?> zzo;
    private final zznt zzp;
    private final zzni zzq;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: com.google.android.gms.internal.contextmanager.zznn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: com.google.android.gms.internal.contextmanager.zznt} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.google.android.gms.internal.contextmanager.zzni} */
    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.android.gms.internal.contextmanager.zzlq<?>, com.google.android.gms.internal.contextmanager.zzlq] */
    /* JADX WARNING: type inference failed for: r3v2, types: [int] */
    /* JADX WARNING: type inference failed for: r3v8, types: [int] */
    /* JADX WARNING: type inference failed for: r3v11, types: [com.google.android.gms.internal.contextmanager.zznb] */
    /* JADX WARNING: type inference failed for: r3v12, types: [com.google.android.gms.internal.contextmanager.zzon<?, ?>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private zznq(int[] r6, int[] r7, java.lang.Object[] r8, int r9, int r10, com.google.android.gms.internal.contextmanager.zznn r11, boolean r12, boolean r13, int[] r14, int r15, int r16, com.google.android.gms.internal.contextmanager.zznt r17, com.google.android.gms.internal.contextmanager.zznb r18, com.google.android.gms.internal.contextmanager.zzon<?, ?> r19, com.google.android.gms.internal.contextmanager.zzlq<?> r20, com.google.android.gms.internal.contextmanager.zzni r21) {
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
            r3 = r11
            r0.zzi = r3
            r3 = 0
            if (r2 == 0) goto L_0x0020
            boolean r4 = r2.zzf(r10)
            if (r4 == 0) goto L_0x0020
            r3 = 1
        L_0x0020:
            r0.zzh = r3
            r3 = r13
            r0.zzj = r3
            r3 = r14
            r0.zzk = r3
            r3 = r15
            r0.zzl = r3
            r3 = r16
            r0.zzp = r3
            r3 = r17
            r0.zzm = r3
            r3 = r18
            r0.zzn = r3
            r0.zzo = r2
            r0.zzg = r1
            r1 = r20
            r0.zzq = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.contextmanager.zznq.<init>(int[], java.lang.Object[], int, int, com.google.android.gms.internal.contextmanager.zznn, boolean, boolean, int[], int, int, com.google.android.gms.internal.contextmanager.zznt, com.google.android.gms.internal.contextmanager.zznb, com.google.android.gms.internal.contextmanager.zzon, com.google.android.gms.internal.contextmanager.zzlq, com.google.android.gms.internal.contextmanager.zzni, byte[]):void");
    }

    private static int zzA(int i) {
        return (i >>> 20) & ValidationUtils.APPBOY_STRING_MAX_LENGTH;
    }

    private final int zzB(int i) {
        return this.zzc[i + 1];
    }

    private static <T> long zzC(T t, long j) {
        return ((Long) zzox.zzf(t, j)).longValue();
    }

    private final zzmj zzD(int i) {
        int i2 = i / 3;
        return (zzmj) this.zzd[i2 + i2 + 1];
    }

    private final zznz zzE(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        zznz zznz = (zznz) this.zzd[i3];
        if (zznz != null) {
            return zznz;
        }
        zznz zzb2 = zznw.zza().zzb((Class) this.zzd[i3 + 1]);
        this.zzd[i3] = zzb2;
        return zzb2;
    }

    private final Object zzF(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private static Field zzG(Class<?> cls, String str) {
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

    private final void zzH(T t, T t2, int i) {
        long zzB = (long) (zzB(i) & 1048575);
        if (zzM(t2, i)) {
            Object zzf2 = zzox.zzf(t, zzB);
            Object zzf3 = zzox.zzf(t2, zzB);
            if (zzf2 != null && zzf3 != null) {
                zzox.zzs(t, zzB, zzmn.zzg(zzf2, zzf3));
                zzJ(t, i);
            } else if (zzf3 != null) {
                zzox.zzs(t, zzB, zzf3);
                zzJ(t, i);
            }
        }
    }

    private final void zzI(T t, T t2, int i) {
        Object obj;
        int zzB = zzB(i);
        int i2 = this.zzc[i];
        long j = (long) (zzB & 1048575);
        if (zzP(t2, i2, i)) {
            if (zzP(t, i2, i)) {
                obj = zzox.zzf(t, j);
            } else {
                obj = null;
            }
            Object zzf2 = zzox.zzf(t2, j);
            if (obj != null && zzf2 != null) {
                zzox.zzs(t, j, zzmn.zzg(obj, zzf2));
                zzK(t, i2, i);
            } else if (zzf2 != null) {
                zzox.zzs(t, j, zzf2);
                zzK(t, i2, i);
            }
        }
    }

    private final void zzJ(T t, int i) {
        int zzy = zzy(i);
        long j = (long) (1048575 & zzy);
        if (j != 1048575) {
            zzox.zzq(t, j, (1 << (zzy >>> 20)) | zzox.zzc(t, j));
        }
    }

    private final void zzK(T t, int i, int i2) {
        zzox.zzq(t, (long) (zzy(i2) & 1048575), i);
    }

    private final boolean zzL(T t, T t2, int i) {
        return zzM(t, i) == zzM(t2, i);
    }

    private final boolean zzM(T t, int i) {
        int zzy = zzy(i);
        long j = (long) (zzy & 1048575);
        if (j == 1048575) {
            int zzB = zzB(i);
            long j2 = (long) (zzB & 1048575);
            switch (zzA(zzB)) {
                case 0:
                    if (zzox.zza(t, j2) != 0.0d) {
                        return true;
                    }
                    return false;
                case 1:
                    if (zzox.zzb(t, j2) != BitmapDescriptorFactory.HUE_RED) {
                        return true;
                    }
                    return false;
                case 2:
                    if (zzox.zzd(t, j2) != 0) {
                        return true;
                    }
                    return false;
                case 3:
                    if (zzox.zzd(t, j2) != 0) {
                        return true;
                    }
                    return false;
                case 4:
                    if (zzox.zzc(t, j2) != 0) {
                        return true;
                    }
                    return false;
                case 5:
                    if (zzox.zzd(t, j2) != 0) {
                        return true;
                    }
                    return false;
                case 6:
                    if (zzox.zzc(t, j2) != 0) {
                        return true;
                    }
                    return false;
                case 7:
                    return zzox.zzw(t, j2);
                case 8:
                    Object zzf2 = zzox.zzf(t, j2);
                    if (zzf2 instanceof String) {
                        if (!((String) zzf2).isEmpty()) {
                            return true;
                        }
                        return false;
                    } else if (!(zzf2 instanceof zzld)) {
                        throw new IllegalArgumentException();
                    } else if (!zzld.zzb.equals(zzf2)) {
                        return true;
                    } else {
                        return false;
                    }
                case 9:
                    if (zzox.zzf(t, j2) != null) {
                        return true;
                    }
                    return false;
                case 10:
                    if (!zzld.zzb.equals(zzox.zzf(t, j2))) {
                        return true;
                    }
                    return false;
                case 11:
                    if (zzox.zzc(t, j2) != 0) {
                        return true;
                    }
                    return false;
                case 12:
                    if (zzox.zzc(t, j2) != 0) {
                        return true;
                    }
                    return false;
                case 13:
                    if (zzox.zzc(t, j2) != 0) {
                        return true;
                    }
                    return false;
                case 14:
                    if (zzox.zzd(t, j2) != 0) {
                        return true;
                    }
                    return false;
                case 15:
                    if (zzox.zzc(t, j2) != 0) {
                        return true;
                    }
                    return false;
                case 16:
                    if (zzox.zzd(t, j2) != 0) {
                        return true;
                    }
                    return false;
                case 17:
                    if (zzox.zzf(t, j2) != null) {
                        return true;
                    }
                    return false;
                default:
                    throw new IllegalArgumentException();
            }
        } else if ((zzox.zzc(t, j) & (1 << (zzy >>> 20))) != 0) {
            return true;
        } else {
            return false;
        }
    }

    private final boolean zzN(T t, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzM(t, i) : (i3 & i4) != 0;
    }

    private static boolean zzO(Object obj, int i, zznz zznz) {
        return zznz.zzj(zzox.zzf(obj, (long) (i & 1048575)));
    }

    private final boolean zzP(T t, int i, int i2) {
        if (zzox.zzc(t, (long) (zzy(i2) & 1048575)) == i) {
            return true;
        }
        return false;
    }

    private static <T> boolean zzQ(T t, long j) {
        return ((Boolean) zzox.zzf(t, j)).booleanValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x02e0  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x02f0  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x02ff  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0312  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0321  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0331  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0341  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0351  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0361  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0371  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0381  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0391  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x03a1  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x03b2  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x03bf  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x03cc  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x03d9  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x03e6  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x03f3  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0400  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x040f  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0420  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x042c  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0438  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0444  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0450  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x045c  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0468  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0474  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0480  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0494  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01e0  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0200  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0210  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0230  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0240  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0260  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0270  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0280  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0290  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x02a0  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x02b0  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x02c0  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x02d0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzR(T r18, com.google.android.gms.internal.contextmanager.zzll r19) throws java.io.IOException {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r0.zzh
            if (r3 == 0) goto L_0x0023
            com.google.android.gms.internal.contextmanager.zzlq<?> r3 = r0.zzo
            com.google.android.gms.internal.contextmanager.zzlu r3 = r3.zzb(r1)
            com.google.android.gms.internal.contextmanager.zzoj<T, java.lang.Object> r5 = r3.zza
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
            if (r10 >= r6) goto L_0x0492
            int r13 = r0.zzB(r10)
            int[] r14 = r0.zzc
            r14 = r14[r10]
            int r15 = zzA(r13)
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
            if (r5 == 0) goto L_0x007b
            com.google.android.gms.internal.contextmanager.zzlq<?> r9 = r0.zzo
            r9.zza(r5)
            r9 = 106879161(0x65ed8b9, float:4.1912782E-35)
            if (r14 < r9) goto L_0x007b
            com.google.android.gms.internal.contextmanager.zzlq<?> r9 = r0.zzo
            r9.zzg(r2, r5)
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0079
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x005b
        L_0x0079:
            r5 = 0
            goto L_0x005b
        L_0x007b:
            r9 = r13 & r8
            long r8 = (long) r9
            switch(r15) {
                case 0: goto L_0x0480;
                case 1: goto L_0x0474;
                case 2: goto L_0x0468;
                case 3: goto L_0x045c;
                case 4: goto L_0x0450;
                case 5: goto L_0x0444;
                case 6: goto L_0x0438;
                case 7: goto L_0x042c;
                case 8: goto L_0x0420;
                case 9: goto L_0x040f;
                case 10: goto L_0x0400;
                case 11: goto L_0x03f3;
                case 12: goto L_0x03e6;
                case 13: goto L_0x03d9;
                case 14: goto L_0x03cc;
                case 15: goto L_0x03bf;
                case 16: goto L_0x03b2;
                case 17: goto L_0x03a1;
                case 18: goto L_0x0391;
                case 19: goto L_0x0381;
                case 20: goto L_0x0371;
                case 21: goto L_0x0361;
                case 22: goto L_0x0351;
                case 23: goto L_0x0341;
                case 24: goto L_0x0331;
                case 25: goto L_0x0321;
                case 26: goto L_0x0312;
                case 27: goto L_0x02ff;
                case 28: goto L_0x02f0;
                case 29: goto L_0x02e0;
                case 30: goto L_0x02d0;
                case 31: goto L_0x02c0;
                case 32: goto L_0x02b0;
                case 33: goto L_0x02a0;
                case 34: goto L_0x0290;
                case 35: goto L_0x0280;
                case 36: goto L_0x0270;
                case 37: goto L_0x0260;
                case 38: goto L_0x0250;
                case 39: goto L_0x0240;
                case 40: goto L_0x0230;
                case 41: goto L_0x0220;
                case 42: goto L_0x0210;
                case 43: goto L_0x0200;
                case 44: goto L_0x01f0;
                case 45: goto L_0x01e0;
                case 46: goto L_0x01d0;
                case 47: goto L_0x01c0;
                case 48: goto L_0x01b0;
                case 49: goto L_0x019d;
                case 50: goto L_0x0194;
                case 51: goto L_0x0185;
                case 52: goto L_0x0176;
                case 53: goto L_0x0167;
                case 54: goto L_0x0158;
                case 55: goto L_0x0149;
                case 56: goto L_0x013a;
                case 57: goto L_0x012b;
                case 58: goto L_0x011c;
                case 59: goto L_0x010d;
                case 60: goto L_0x00fa;
                case 61: goto L_0x00ea;
                case 62: goto L_0x00dc;
                case 63: goto L_0x00ce;
                case 64: goto L_0x00c0;
                case 65: goto L_0x00b2;
                case 66: goto L_0x00a4;
                case 67: goto L_0x0096;
                case 68: goto L_0x0084;
                default: goto L_0x0081;
            }
        L_0x0081:
            r15 = 0
            goto L_0x048b
        L_0x0084:
            boolean r4 = r0.zzP(r1, r14, r10)
            if (r4 == 0) goto L_0x0081
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.android.gms.internal.contextmanager.zznz r8 = r0.zzE(r10)
            r2.zzq(r14, r4, r8)
            goto L_0x0081
        L_0x0096:
            boolean r4 = r0.zzP(r1, r14, r10)
            if (r4 == 0) goto L_0x0081
            long r8 = zzC(r1, r8)
            r2.zzD(r14, r8)
            goto L_0x0081
        L_0x00a4:
            boolean r4 = r0.zzP(r1, r14, r10)
            if (r4 == 0) goto L_0x0081
            int r4 = zzr(r1, r8)
            r2.zzB(r14, r4)
            goto L_0x0081
        L_0x00b2:
            boolean r4 = r0.zzP(r1, r14, r10)
            if (r4 == 0) goto L_0x0081
            long r8 = zzC(r1, r8)
            r2.zzz(r14, r8)
            goto L_0x0081
        L_0x00c0:
            boolean r4 = r0.zzP(r1, r14, r10)
            if (r4 == 0) goto L_0x0081
            int r4 = zzr(r1, r8)
            r2.zzx(r14, r4)
            goto L_0x0081
        L_0x00ce:
            boolean r4 = r0.zzP(r1, r14, r10)
            if (r4 == 0) goto L_0x0081
            int r4 = zzr(r1, r8)
            r2.zzi(r14, r4)
            goto L_0x0081
        L_0x00dc:
            boolean r4 = r0.zzP(r1, r14, r10)
            if (r4 == 0) goto L_0x0081
            int r4 = zzr(r1, r8)
            r2.zzI(r14, r4)
            goto L_0x0081
        L_0x00ea:
            boolean r4 = r0.zzP(r1, r14, r10)
            if (r4 == 0) goto L_0x0081
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.android.gms.internal.contextmanager.zzld r4 = (com.google.android.gms.internal.contextmanager.zzld) r4
            r2.zzd(r14, r4)
            goto L_0x0081
        L_0x00fa:
            boolean r4 = r0.zzP(r1, r14, r10)
            if (r4 == 0) goto L_0x0081
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.android.gms.internal.contextmanager.zznz r8 = r0.zzE(r10)
            r2.zzv(r14, r4, r8)
            goto L_0x0081
        L_0x010d:
            boolean r4 = r0.zzP(r1, r14, r10)
            if (r4 == 0) goto L_0x0081
            java.lang.Object r4 = r7.getObject(r1, r8)
            zzT(r14, r4, r2)
            goto L_0x0081
        L_0x011c:
            boolean r4 = r0.zzP(r1, r14, r10)
            if (r4 == 0) goto L_0x0081
            boolean r4 = zzQ(r1, r8)
            r2.zzb(r14, r4)
            goto L_0x0081
        L_0x012b:
            boolean r4 = r0.zzP(r1, r14, r10)
            if (r4 == 0) goto L_0x0081
            int r4 = zzr(r1, r8)
            r2.zzk(r14, r4)
            goto L_0x0081
        L_0x013a:
            boolean r4 = r0.zzP(r1, r14, r10)
            if (r4 == 0) goto L_0x0081
            long r8 = zzC(r1, r8)
            r2.zzm(r14, r8)
            goto L_0x0081
        L_0x0149:
            boolean r4 = r0.zzP(r1, r14, r10)
            if (r4 == 0) goto L_0x0081
            int r4 = zzr(r1, r8)
            r2.zzr(r14, r4)
            goto L_0x0081
        L_0x0158:
            boolean r4 = r0.zzP(r1, r14, r10)
            if (r4 == 0) goto L_0x0081
            long r8 = zzC(r1, r8)
            r2.zzK(r14, r8)
            goto L_0x0081
        L_0x0167:
            boolean r4 = r0.zzP(r1, r14, r10)
            if (r4 == 0) goto L_0x0081
            long r8 = zzC(r1, r8)
            r2.zzt(r14, r8)
            goto L_0x0081
        L_0x0176:
            boolean r4 = r0.zzP(r1, r14, r10)
            if (r4 == 0) goto L_0x0081
            float r4 = zzo(r1, r8)
            r2.zzo(r14, r4)
            goto L_0x0081
        L_0x0185:
            boolean r4 = r0.zzP(r1, r14, r10)
            if (r4 == 0) goto L_0x0081
            double r8 = zzn(r1, r8)
            r2.zzf(r14, r8)
            goto L_0x0081
        L_0x0194:
            java.lang.Object r4 = r7.getObject(r1, r8)
            r0.zzS(r2, r14, r4, r10)
            goto L_0x0081
        L_0x019d:
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.contextmanager.zznz r9 = r0.zzE(r10)
            com.google.android.gms.internal.contextmanager.zzob.zzQ(r4, r8, r2, r9)
            goto L_0x0081
        L_0x01b0:
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            r14 = 1
            com.google.android.gms.internal.contextmanager.zzob.zzX(r4, r8, r2, r14)
            goto L_0x0081
        L_0x01c0:
            r14 = 1
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.contextmanager.zzob.zzW(r4, r8, r2, r14)
            goto L_0x0081
        L_0x01d0:
            r14 = 1
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.contextmanager.zzob.zzV(r4, r8, r2, r14)
            goto L_0x0081
        L_0x01e0:
            r14 = 1
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.contextmanager.zzob.zzU(r4, r8, r2, r14)
            goto L_0x0081
        L_0x01f0:
            r14 = 1
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.contextmanager.zzob.zzM(r4, r8, r2, r14)
            goto L_0x0081
        L_0x0200:
            r14 = 1
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.contextmanager.zzob.zzZ(r4, r8, r2, r14)
            goto L_0x0081
        L_0x0210:
            r14 = 1
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.contextmanager.zzob.zzJ(r4, r8, r2, r14)
            goto L_0x0081
        L_0x0220:
            r14 = 1
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.contextmanager.zzob.zzN(r4, r8, r2, r14)
            goto L_0x0081
        L_0x0230:
            r14 = 1
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.contextmanager.zzob.zzO(r4, r8, r2, r14)
            goto L_0x0081
        L_0x0240:
            r14 = 1
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.contextmanager.zzob.zzR(r4, r8, r2, r14)
            goto L_0x0081
        L_0x0250:
            r14 = 1
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.contextmanager.zzob.zzaa(r4, r8, r2, r14)
            goto L_0x0081
        L_0x0260:
            r14 = 1
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.contextmanager.zzob.zzS(r4, r8, r2, r14)
            goto L_0x0081
        L_0x0270:
            r14 = 1
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.contextmanager.zzob.zzP(r4, r8, r2, r14)
            goto L_0x0081
        L_0x0280:
            r14 = 1
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.contextmanager.zzob.zzL(r4, r8, r2, r14)
            goto L_0x0081
        L_0x0290:
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            r14 = 0
            com.google.android.gms.internal.contextmanager.zzob.zzX(r4, r8, r2, r14)
            goto L_0x0081
        L_0x02a0:
            r14 = 0
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.contextmanager.zzob.zzW(r4, r8, r2, r14)
            goto L_0x0081
        L_0x02b0:
            r14 = 0
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.contextmanager.zzob.zzV(r4, r8, r2, r14)
            goto L_0x0081
        L_0x02c0:
            r14 = 0
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.contextmanager.zzob.zzU(r4, r8, r2, r14)
            goto L_0x0081
        L_0x02d0:
            r14 = 0
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.contextmanager.zzob.zzM(r4, r8, r2, r14)
            goto L_0x0081
        L_0x02e0:
            r14 = 0
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.contextmanager.zzob.zzZ(r4, r8, r2, r14)
            goto L_0x0081
        L_0x02f0:
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.contextmanager.zzob.zzK(r4, r8, r2)
            goto L_0x0081
        L_0x02ff:
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.contextmanager.zznz r9 = r0.zzE(r10)
            com.google.android.gms.internal.contextmanager.zzob.zzT(r4, r8, r2, r9)
            goto L_0x0081
        L_0x0312:
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.contextmanager.zzob.zzY(r4, r8, r2)
            goto L_0x0081
        L_0x0321:
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            r15 = 0
            com.google.android.gms.internal.contextmanager.zzob.zzJ(r4, r8, r2, r15)
            goto L_0x048b
        L_0x0331:
            r15 = 0
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.contextmanager.zzob.zzN(r4, r8, r2, r15)
            goto L_0x048b
        L_0x0341:
            r15 = 0
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.contextmanager.zzob.zzO(r4, r8, r2, r15)
            goto L_0x048b
        L_0x0351:
            r15 = 0
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.contextmanager.zzob.zzR(r4, r8, r2, r15)
            goto L_0x048b
        L_0x0361:
            r15 = 0
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.contextmanager.zzob.zzaa(r4, r8, r2, r15)
            goto L_0x048b
        L_0x0371:
            r15 = 0
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.contextmanager.zzob.zzS(r4, r8, r2, r15)
            goto L_0x048b
        L_0x0381:
            r15 = 0
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.contextmanager.zzob.zzP(r4, r8, r2, r15)
            goto L_0x048b
        L_0x0391:
            r15 = 0
            int[] r4 = r0.zzc
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.contextmanager.zzob.zzL(r4, r8, r2, r15)
            goto L_0x048b
        L_0x03a1:
            r15 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x048b
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.android.gms.internal.contextmanager.zznz r8 = r0.zzE(r10)
            r2.zzq(r14, r4, r8)
            goto L_0x048b
        L_0x03b2:
            r15 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x048b
            long r8 = r7.getLong(r1, r8)
            r2.zzD(r14, r8)
            goto L_0x048b
        L_0x03bf:
            r15 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x048b
            int r4 = r7.getInt(r1, r8)
            r2.zzB(r14, r4)
            goto L_0x048b
        L_0x03cc:
            r15 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x048b
            long r8 = r7.getLong(r1, r8)
            r2.zzz(r14, r8)
            goto L_0x048b
        L_0x03d9:
            r15 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x048b
            int r4 = r7.getInt(r1, r8)
            r2.zzx(r14, r4)
            goto L_0x048b
        L_0x03e6:
            r15 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x048b
            int r4 = r7.getInt(r1, r8)
            r2.zzi(r14, r4)
            goto L_0x048b
        L_0x03f3:
            r15 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x048b
            int r4 = r7.getInt(r1, r8)
            r2.zzI(r14, r4)
            goto L_0x048b
        L_0x0400:
            r15 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x048b
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.android.gms.internal.contextmanager.zzld r4 = (com.google.android.gms.internal.contextmanager.zzld) r4
            r2.zzd(r14, r4)
            goto L_0x048b
        L_0x040f:
            r15 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x048b
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.android.gms.internal.contextmanager.zznz r8 = r0.zzE(r10)
            r2.zzv(r14, r4, r8)
            goto L_0x048b
        L_0x0420:
            r15 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x048b
            java.lang.Object r4 = r7.getObject(r1, r8)
            zzT(r14, r4, r2)
            goto L_0x048b
        L_0x042c:
            r15 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x048b
            boolean r4 = com.google.android.gms.internal.contextmanager.zzox.zzw(r1, r8)
            r2.zzb(r14, r4)
            goto L_0x048b
        L_0x0438:
            r15 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x048b
            int r4 = r7.getInt(r1, r8)
            r2.zzk(r14, r4)
            goto L_0x048b
        L_0x0444:
            r15 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x048b
            long r8 = r7.getLong(r1, r8)
            r2.zzm(r14, r8)
            goto L_0x048b
        L_0x0450:
            r15 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x048b
            int r4 = r7.getInt(r1, r8)
            r2.zzr(r14, r4)
            goto L_0x048b
        L_0x045c:
            r15 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x048b
            long r8 = r7.getLong(r1, r8)
            r2.zzK(r14, r8)
            goto L_0x048b
        L_0x0468:
            r15 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x048b
            long r8 = r7.getLong(r1, r8)
            r2.zzt(r14, r8)
            goto L_0x048b
        L_0x0474:
            r15 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x048b
            float r4 = com.google.android.gms.internal.contextmanager.zzox.zzb(r1, r8)
            r2.zzo(r14, r4)
            goto L_0x048b
        L_0x0480:
            r15 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x048b
            double r8 = com.google.android.gms.internal.contextmanager.zzox.zza(r1, r8)
            r2.zzf(r14, r8)
        L_0x048b:
            int r10 = r10 + 3
            r8 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0032
        L_0x0492:
            if (r5 == 0) goto L_0x04a9
            com.google.android.gms.internal.contextmanager.zzlq<?> r4 = r0.zzo
            r4.zzg(r2, r5)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x04a7
            java.lang.Object r4 = r3.next()
            r5 = r4
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0492
        L_0x04a7:
            r5 = 0
            goto L_0x0492
        L_0x04a9:
            com.google.android.gms.internal.contextmanager.zzon<?, ?> r3 = r0.zzn
            java.lang.Object r1 = r3.zzc(r1)
            r3.zzj(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.contextmanager.zznq.zzR(java.lang.Object, com.google.android.gms.internal.contextmanager.zzll):void");
    }

    private final <K, V> void zzS(zzll zzll, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            zzng zzng = (zzng) zzF(i2);
            throw null;
        }
    }

    private static final void zzT(int i, Object obj, zzll zzll) throws IOException {
        if (obj instanceof String) {
            zzll.zzG(i, (String) obj);
        } else {
            zzll.zzd(i, (zzld) obj);
        }
    }

    public static zzoo zzd(Object obj) {
        zzmf zzmf = (zzmf) obj;
        zzoo zzoo = zzmf.zzc;
        if (zzoo != zzoo.zzc()) {
            return zzoo;
        }
        zzoo zze2 = zzoo.zze();
        zzmf.zzc = zze2;
        return zze2;
    }

    public static <T> zznq<T> zzk(Class<T> cls, zznk zznk, zznt zznt, zznb zznb, zzon<?, ?> zzon, zzlq<?> zzlq, zzni zzni) {
        if (zznk instanceof zzny) {
            return zzl((zzny) zznk, zznt, zznb, zzon, zzlq, zzni);
        }
        zzok zzok = (zzok) zznk;
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:120:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0260  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x032f  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0378  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> com.google.android.gms.internal.contextmanager.zznq<T> zzl(com.google.android.gms.internal.contextmanager.zzny r33, com.google.android.gms.internal.contextmanager.zznt r34, com.google.android.gms.internal.contextmanager.zznb r35, com.google.android.gms.internal.contextmanager.zzon<?, ?> r36, com.google.android.gms.internal.contextmanager.zzlq<?> r37, com.google.android.gms.internal.contextmanager.zzni r38) {
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
            com.google.android.gms.internal.contextmanager.zznn r18 = r33.zza()
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
            com.google.android.gms.internal.contextmanager.zznq r0 = new com.google.android.gms.internal.contextmanager.zznq
            r4 = r0
            com.google.android.gms.internal.contextmanager.zznn r9 = r33.zza()
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.contextmanager.zznq.zzl(com.google.android.gms.internal.contextmanager.zzny, com.google.android.gms.internal.contextmanager.zznt, com.google.android.gms.internal.contextmanager.zznb, com.google.android.gms.internal.contextmanager.zzon, com.google.android.gms.internal.contextmanager.zzlq, com.google.android.gms.internal.contextmanager.zzni):com.google.android.gms.internal.contextmanager.zznq");
    }

    private static <T> double zzn(T t, long j) {
        return ((Double) zzox.zzf(t, j)).doubleValue();
    }

    private static <T> float zzo(T t, long j) {
        return ((Float) zzox.zzf(t, j)).floatValue();
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
    private final int zzp(T r15) {
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
            int r7 = r14.zzB(r3)
            int[] r8 = r14.zzc
            r8 = r8[r3]
            int r9 = zzA(r7)
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
            boolean r7 = r14.zzP(r15, r8, r3)
            if (r7 == 0) goto L_0x0532
            java.lang.Object r7 = r0.getObject(r15, r12)
            com.google.android.gms.internal.contextmanager.zznn r7 = (com.google.android.gms.internal.contextmanager.zznn) r7
            com.google.android.gms.internal.contextmanager.zznz r9 = r14.zzE(r3)
            int r7 = com.google.android.gms.internal.contextmanager.zzlk.zzv(r8, r7, r9)
            goto L_0x0486
        L_0x0057:
            boolean r9 = r14.zzP(r15, r8, r3)
            if (r9 == 0) goto L_0x0532
            long r9 = zzC(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r8)
            long r11 = r9 + r9
            long r9 = r9 >> r7
            long r9 = r9 ^ r11
            int r7 = com.google.android.gms.internal.contextmanager.zzlk.zzE(r9)
            goto L_0x04eb
        L_0x0071:
            boolean r7 = r14.zzP(r15, r8, r3)
            if (r7 == 0) goto L_0x0532
            int r7 = zzr(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r8)
            int r9 = r7 + r7
            int r7 = r7 >> 31
            r7 = r7 ^ r9
            int r7 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r7)
            goto L_0x04eb
        L_0x008c:
            boolean r7 = r14.zzP(r15, r8, r3)
            if (r7 == 0) goto L_0x0532
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r7)
            goto L_0x052e
        L_0x009a:
            boolean r7 = r14.zzP(r15, r8, r3)
            if (r7 == 0) goto L_0x0532
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r7)
            goto L_0x0520
        L_0x00a8:
            boolean r7 = r14.zzP(r15, r8, r3)
            if (r7 == 0) goto L_0x0532
            int r7 = zzr(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r8)
            int r7 = com.google.android.gms.internal.contextmanager.zzlk.zzx(r7)
            goto L_0x04eb
        L_0x00be:
            boolean r7 = r14.zzP(r15, r8, r3)
            if (r7 == 0) goto L_0x0532
            int r7 = zzr(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r8)
            int r7 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r7)
            goto L_0x04eb
        L_0x00d4:
            boolean r7 = r14.zzP(r15, r8, r3)
            if (r7 == 0) goto L_0x0532
            java.lang.Object r7 = r0.getObject(r15, r12)
            com.google.android.gms.internal.contextmanager.zzld r7 = (com.google.android.gms.internal.contextmanager.zzld) r7
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r8)
            int r7 = r7.zzd()
            int r9 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r7)
            goto L_0x04a5
        L_0x00f0:
            boolean r7 = r14.zzP(r15, r8, r3)
            if (r7 == 0) goto L_0x0532
            java.lang.Object r7 = r0.getObject(r15, r12)
            com.google.android.gms.internal.contextmanager.zznz r9 = r14.zzE(r3)
            int r7 = com.google.android.gms.internal.contextmanager.zzob.zzo(r8, r7, r9)
            goto L_0x0486
        L_0x0104:
            boolean r7 = r14.zzP(r15, r8, r3)
            if (r7 == 0) goto L_0x0532
            java.lang.Object r7 = r0.getObject(r15, r12)
            boolean r9 = r7 instanceof com.google.android.gms.internal.contextmanager.zzld
            if (r9 == 0) goto L_0x0124
            com.google.android.gms.internal.contextmanager.zzld r7 = (com.google.android.gms.internal.contextmanager.zzld) r7
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r8)
            int r7 = r7.zzd()
            int r9 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r7)
            goto L_0x04a5
        L_0x0124:
            java.lang.String r7 = (java.lang.String) r7
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r8)
            int r7 = com.google.android.gms.internal.contextmanager.zzlk.zzB(r7)
            goto L_0x04eb
        L_0x0132:
            boolean r7 = r14.zzP(r15, r8, r3)
            if (r7 == 0) goto L_0x0532
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r7)
            goto L_0x04c1
        L_0x0140:
            boolean r7 = r14.zzP(r15, r8, r3)
            if (r7 == 0) goto L_0x0532
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r7)
            goto L_0x0520
        L_0x014e:
            boolean r7 = r14.zzP(r15, r8, r3)
            if (r7 == 0) goto L_0x0532
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r7)
            goto L_0x052e
        L_0x015c:
            boolean r7 = r14.zzP(r15, r8, r3)
            if (r7 == 0) goto L_0x0532
            int r7 = zzr(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r8)
            int r7 = com.google.android.gms.internal.contextmanager.zzlk.zzx(r7)
            goto L_0x04eb
        L_0x0172:
            boolean r7 = r14.zzP(r15, r8, r3)
            if (r7 == 0) goto L_0x0532
            long r9 = zzC(r15, r12)
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r7)
            int r8 = com.google.android.gms.internal.contextmanager.zzlk.zzE(r9)
            goto L_0x0512
        L_0x0188:
            boolean r7 = r14.zzP(r15, r8, r3)
            if (r7 == 0) goto L_0x0532
            long r9 = zzC(r15, r12)
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r7)
            int r8 = com.google.android.gms.internal.contextmanager.zzlk.zzE(r9)
            goto L_0x0512
        L_0x019e:
            boolean r7 = r14.zzP(r15, r8, r3)
            if (r7 == 0) goto L_0x0532
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r7)
            goto L_0x0520
        L_0x01ac:
            boolean r7 = r14.zzP(r15, r8, r3)
            if (r7 == 0) goto L_0x0532
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r7)
            goto L_0x052e
        L_0x01ba:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.lang.Object r9 = r14.zzF(r3)
            com.google.android.gms.internal.contextmanager.zzni.zza(r8, r7, r9)
            goto L_0x0532
        L_0x01c7:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.contextmanager.zznz r9 = r14.zzE(r3)
            int r7 = com.google.android.gms.internal.contextmanager.zzob.zzj(r8, r7, r9)
            goto L_0x0486
        L_0x01d7:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.contextmanager.zzob.zzt(r7)
            if (r7 <= 0) goto L_0x0532
            int r8 = com.google.android.gms.internal.contextmanager.zzlk.zzC(r8)
            int r9 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r7)
            goto L_0x0304
        L_0x01ed:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.contextmanager.zzob.zzr(r7)
            if (r7 <= 0) goto L_0x0532
            int r8 = com.google.android.gms.internal.contextmanager.zzlk.zzC(r8)
            int r9 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r7)
            goto L_0x0304
        L_0x0203:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.contextmanager.zzob.zzi(r7)
            if (r7 <= 0) goto L_0x0532
            int r8 = com.google.android.gms.internal.contextmanager.zzlk.zzC(r8)
            int r9 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r7)
            goto L_0x0304
        L_0x0219:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.contextmanager.zzob.zzg(r7)
            if (r7 <= 0) goto L_0x0532
            int r8 = com.google.android.gms.internal.contextmanager.zzlk.zzC(r8)
            int r9 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r7)
            goto L_0x0304
        L_0x022f:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.contextmanager.zzob.zze(r7)
            if (r7 <= 0) goto L_0x0532
            int r8 = com.google.android.gms.internal.contextmanager.zzlk.zzC(r8)
            int r9 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r7)
            goto L_0x0304
        L_0x0245:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.contextmanager.zzob.zzw(r7)
            if (r7 <= 0) goto L_0x0532
            int r8 = com.google.android.gms.internal.contextmanager.zzlk.zzC(r8)
            int r9 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r7)
            goto L_0x0304
        L_0x025b:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.contextmanager.zzob.zzb(r7)
            if (r7 <= 0) goto L_0x0532
            int r8 = com.google.android.gms.internal.contextmanager.zzlk.zzC(r8)
            int r9 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r7)
            goto L_0x0304
        L_0x0271:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.contextmanager.zzob.zzg(r7)
            if (r7 <= 0) goto L_0x0532
            int r8 = com.google.android.gms.internal.contextmanager.zzlk.zzC(r8)
            int r9 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r7)
            goto L_0x0304
        L_0x0287:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.contextmanager.zzob.zzi(r7)
            if (r7 <= 0) goto L_0x0532
            int r8 = com.google.android.gms.internal.contextmanager.zzlk.zzC(r8)
            int r9 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r7)
            goto L_0x0304
        L_0x029c:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.contextmanager.zzob.zzl(r7)
            if (r7 <= 0) goto L_0x0532
            int r8 = com.google.android.gms.internal.contextmanager.zzlk.zzC(r8)
            int r9 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r7)
            goto L_0x0304
        L_0x02b1:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.contextmanager.zzob.zzy(r7)
            if (r7 <= 0) goto L_0x0532
            int r8 = com.google.android.gms.internal.contextmanager.zzlk.zzC(r8)
            int r9 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r7)
            goto L_0x0304
        L_0x02c6:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.contextmanager.zzob.zzn(r7)
            if (r7 <= 0) goto L_0x0532
            int r8 = com.google.android.gms.internal.contextmanager.zzlk.zzC(r8)
            int r9 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r7)
            goto L_0x0304
        L_0x02db:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.contextmanager.zzob.zzg(r7)
            if (r7 <= 0) goto L_0x0532
            int r8 = com.google.android.gms.internal.contextmanager.zzlk.zzC(r8)
            int r9 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r7)
            goto L_0x0304
        L_0x02f0:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.contextmanager.zzob.zzi(r7)
            if (r7 <= 0) goto L_0x0532
            int r8 = com.google.android.gms.internal.contextmanager.zzlk.zzC(r8)
            int r9 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r7)
        L_0x0304:
            int r9 = r9 + r8
            int r9 = r9 + r7
            goto L_0x04a7
        L_0x0308:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.contextmanager.zzob.zzs(r8, r7, r2)
            goto L_0x0486
        L_0x0314:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.contextmanager.zzob.zzq(r8, r7, r2)
            goto L_0x0486
        L_0x0320:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.contextmanager.zzob.zzh(r8, r7, r2)
            goto L_0x0486
        L_0x032c:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.contextmanager.zzob.zzf(r8, r7, r2)
            goto L_0x0486
        L_0x0338:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.contextmanager.zzob.zzd(r8, r7, r2)
            goto L_0x0486
        L_0x0344:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.contextmanager.zzob.zzv(r8, r7, r2)
            goto L_0x0486
        L_0x0350:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.contextmanager.zzob.zzc(r8, r7)
            goto L_0x0486
        L_0x035c:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.contextmanager.zznz r9 = r14.zzE(r3)
            int r7 = com.google.android.gms.internal.contextmanager.zzob.zzp(r8, r7, r9)
            goto L_0x0486
        L_0x036c:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.contextmanager.zzob.zzu(r8, r7)
            goto L_0x0486
        L_0x0378:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.contextmanager.zzob.zza(r8, r7, r2)
            goto L_0x0486
        L_0x0384:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.contextmanager.zzob.zzf(r8, r7, r2)
            goto L_0x0486
        L_0x0390:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.contextmanager.zzob.zzh(r8, r7, r2)
            goto L_0x0486
        L_0x039c:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.contextmanager.zzob.zzk(r8, r7, r2)
            goto L_0x0486
        L_0x03a8:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.contextmanager.zzob.zzx(r8, r7, r2)
            goto L_0x0486
        L_0x03b4:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.contextmanager.zzob.zzm(r8, r7, r2)
            goto L_0x0486
        L_0x03c0:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.contextmanager.zzob.zzf(r8, r7, r2)
            goto L_0x0486
        L_0x03cc:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.contextmanager.zzob.zzh(r8, r7, r2)
            goto L_0x0486
        L_0x03d8:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0532
            java.lang.Object r7 = r0.getObject(r15, r12)
            com.google.android.gms.internal.contextmanager.zznn r7 = (com.google.android.gms.internal.contextmanager.zznn) r7
            com.google.android.gms.internal.contextmanager.zznz r9 = r14.zzE(r3)
            int r7 = com.google.android.gms.internal.contextmanager.zzlk.zzv(r8, r7, r9)
            goto L_0x0486
        L_0x03ec:
            r9 = r5 & r10
            if (r9 == 0) goto L_0x0532
            long r9 = r0.getLong(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r8)
            long r11 = r9 + r9
            long r9 = r9 >> r7
            long r9 = r9 ^ r11
            int r7 = com.google.android.gms.internal.contextmanager.zzlk.zzE(r9)
            goto L_0x04eb
        L_0x0404:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0532
            int r7 = r0.getInt(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r8)
            int r9 = r7 + r7
            int r7 = r7 >> 31
            r7 = r7 ^ r9
            int r7 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r7)
            goto L_0x04eb
        L_0x041d:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0532
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r7)
            goto L_0x052e
        L_0x0429:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0532
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r7)
            goto L_0x0520
        L_0x0435:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0532
            int r7 = r0.getInt(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r8)
            int r7 = com.google.android.gms.internal.contextmanager.zzlk.zzx(r7)
            goto L_0x04eb
        L_0x0449:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0532
            int r7 = r0.getInt(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r8)
            int r7 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r7)
            goto L_0x04eb
        L_0x045d:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0532
            java.lang.Object r7 = r0.getObject(r15, r12)
            com.google.android.gms.internal.contextmanager.zzld r7 = (com.google.android.gms.internal.contextmanager.zzld) r7
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r8)
            int r7 = r7.zzd()
            int r9 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r7)
            goto L_0x04a5
        L_0x0476:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0532
            java.lang.Object r7 = r0.getObject(r15, r12)
            com.google.android.gms.internal.contextmanager.zznz r9 = r14.zzE(r3)
            int r7 = com.google.android.gms.internal.contextmanager.zzob.zzo(r8, r7, r9)
        L_0x0486:
            int r4 = r4 + r7
            goto L_0x0532
        L_0x0489:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0532
            java.lang.Object r7 = r0.getObject(r15, r12)
            boolean r9 = r7 instanceof com.google.android.gms.internal.contextmanager.zzld
            if (r9 == 0) goto L_0x04aa
            com.google.android.gms.internal.contextmanager.zzld r7 = (com.google.android.gms.internal.contextmanager.zzld) r7
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r8)
            int r7 = r7.zzd()
            int r9 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r7)
        L_0x04a5:
            int r9 = r9 + r7
            int r9 = r9 + r8
        L_0x04a7:
            int r4 = r4 + r9
            goto L_0x0532
        L_0x04aa:
            java.lang.String r7 = (java.lang.String) r7
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r8)
            int r7 = com.google.android.gms.internal.contextmanager.zzlk.zzB(r7)
            goto L_0x04eb
        L_0x04b7:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0532
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r7)
        L_0x04c1:
            int r7 = r7 + r11
            goto L_0x0486
        L_0x04c3:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0532
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r7)
            goto L_0x0520
        L_0x04ce:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0532
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r7)
            goto L_0x052e
        L_0x04d9:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0532
            int r7 = r0.getInt(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r8)
            int r7 = com.google.android.gms.internal.contextmanager.zzlk.zzx(r7)
        L_0x04eb:
            int r7 = r7 + r8
            goto L_0x0486
        L_0x04ed:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0532
            long r9 = r0.getLong(r15, r12)
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r7)
            int r8 = com.google.android.gms.internal.contextmanager.zzlk.zzE(r9)
            goto L_0x0512
        L_0x0500:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0532
            long r9 = r0.getLong(r15, r12)
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r7)
            int r8 = com.google.android.gms.internal.contextmanager.zzlk.zzE(r9)
        L_0x0512:
            int r8 = r8 + r7
            int r8 = r8 + r4
            r4 = r8
            goto L_0x0532
        L_0x0516:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0532
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r7)
        L_0x0520:
            int r7 = r7 + 4
            goto L_0x0486
        L_0x0524:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0532
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r7)
        L_0x052e:
            int r7 = r7 + 8
            goto L_0x0486
        L_0x0532:
            int r3 = r3 + 3
            goto L_0x000c
        L_0x0536:
            com.google.android.gms.internal.contextmanager.zzon<?, ?> r0 = r14.zzn
            java.lang.Object r1 = r0.zzc(r15)
            int r0 = r0.zza(r1)
            int r4 = r4 + r0
            boolean r0 = r14.zzh
            if (r0 == 0) goto L_0x0593
            com.google.android.gms.internal.contextmanager.zzlq<?> r0 = r14.zzo
            com.google.android.gms.internal.contextmanager.zzlu r15 = r0.zzb(r15)
            r0 = 0
        L_0x054c:
            com.google.android.gms.internal.contextmanager.zzoj<T, java.lang.Object> r1 = r15.zza
            int r1 = r1.zzb()
            if (r2 >= r1) goto L_0x056c
            com.google.android.gms.internal.contextmanager.zzoj<T, java.lang.Object> r1 = r15.zza
            java.util.Map$Entry r1 = r1.zzg(r2)
            java.lang.Object r3 = r1.getKey()
            com.google.android.gms.internal.contextmanager.zzlt r3 = (com.google.android.gms.internal.contextmanager.zzlt) r3
            java.lang.Object r1 = r1.getValue()
            int r1 = com.google.android.gms.internal.contextmanager.zzlu.zza(r3, r1)
            int r0 = r0 + r1
            int r2 = r2 + 1
            goto L_0x054c
        L_0x056c:
            com.google.android.gms.internal.contextmanager.zzoj<T, java.lang.Object> r15 = r15.zza
            java.lang.Iterable r15 = r15.zzc()
            java.util.Iterator r15 = r15.iterator()
        L_0x0576:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L_0x0592
            java.lang.Object r1 = r15.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            com.google.android.gms.internal.contextmanager.zzlt r2 = (com.google.android.gms.internal.contextmanager.zzlt) r2
            java.lang.Object r1 = r1.getValue()
            int r1 = com.google.android.gms.internal.contextmanager.zzlu.zza(r2, r1)
            int r0 = r0 + r1
            goto L_0x0576
        L_0x0592:
            int r4 = r4 + r0
        L_0x0593:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.contextmanager.zznq.zzp(java.lang.Object):int");
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
    private final int zzq(T r12) {
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
            com.google.android.gms.internal.contextmanager.zzlv r4 = com.google.android.gms.internal.contextmanager.zzlv.DOUBLE_LIST_PACKED
            int r4 = r4.zza()
            if (r5 < r4) goto L_0x0031
            com.google.android.gms.internal.contextmanager.zzlv r4 = com.google.android.gms.internal.contextmanager.zzlv.SINT64_LIST_PACKED
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
            java.lang.Object r4 = com.google.android.gms.internal.contextmanager.zzox.zzf(r12, r7)
            com.google.android.gms.internal.contextmanager.zznn r4 = (com.google.android.gms.internal.contextmanager.zznn) r4
            com.google.android.gms.internal.contextmanager.zznz r5 = r11.zzE(r2)
            int r4 = com.google.android.gms.internal.contextmanager.zzlk.zzv(r6, r4, r5)
            goto L_0x0491
        L_0x004e:
            boolean r5 = r11.zzP(r12, r6, r2)
            if (r5 == 0) goto L_0x054f
            long r7 = zzC(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r5)
            long r9 = r7 + r7
            long r6 = r7 >> r4
            long r6 = r6 ^ r9
            int r4 = com.google.android.gms.internal.contextmanager.zzlk.zzE(r6)
            goto L_0x0501
        L_0x0069:
            boolean r4 = r11.zzP(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = zzr(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r5)
            int r6 = r4 + r4
            int r4 = r4 >> 31
            r4 = r4 ^ r6
            int r4 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r4)
            goto L_0x0501
        L_0x0084:
            boolean r4 = r11.zzP(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r4)
            goto L_0x054b
        L_0x0092:
            boolean r4 = r11.zzP(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r4)
            goto L_0x053b
        L_0x00a0:
            boolean r4 = r11.zzP(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = zzr(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r5)
            int r4 = com.google.android.gms.internal.contextmanager.zzlk.zzx(r4)
            goto L_0x0501
        L_0x00b6:
            boolean r4 = r11.zzP(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = zzr(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r5)
            int r4 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r4)
            goto L_0x0501
        L_0x00cc:
            boolean r4 = r11.zzP(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            java.lang.Object r4 = com.google.android.gms.internal.contextmanager.zzox.zzf(r12, r7)
            com.google.android.gms.internal.contextmanager.zzld r4 = (com.google.android.gms.internal.contextmanager.zzld) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r5)
            int r4 = r4.zzd()
            int r6 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r4)
            goto L_0x04b2
        L_0x00e8:
            boolean r4 = r11.zzP(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            java.lang.Object r4 = com.google.android.gms.internal.contextmanager.zzox.zzf(r12, r7)
            com.google.android.gms.internal.contextmanager.zznz r5 = r11.zzE(r2)
            int r4 = com.google.android.gms.internal.contextmanager.zzob.zzo(r6, r4, r5)
            goto L_0x0491
        L_0x00fc:
            boolean r4 = r11.zzP(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            java.lang.Object r4 = com.google.android.gms.internal.contextmanager.zzox.zzf(r12, r7)
            boolean r5 = r4 instanceof com.google.android.gms.internal.contextmanager.zzld
            if (r5 == 0) goto L_0x011c
            com.google.android.gms.internal.contextmanager.zzld r4 = (com.google.android.gms.internal.contextmanager.zzld) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r5)
            int r4 = r4.zzd()
            int r6 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r4)
            goto L_0x04b2
        L_0x011c:
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r5)
            int r4 = com.google.android.gms.internal.contextmanager.zzlk.zzB(r4)
            goto L_0x0501
        L_0x012a:
            boolean r4 = r11.zzP(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r4)
            goto L_0x04d0
        L_0x0138:
            boolean r4 = r11.zzP(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r4)
            goto L_0x053b
        L_0x0146:
            boolean r4 = r11.zzP(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r4)
            goto L_0x054b
        L_0x0154:
            boolean r4 = r11.zzP(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = zzr(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r5)
            int r4 = com.google.android.gms.internal.contextmanager.zzlk.zzx(r4)
            goto L_0x0501
        L_0x016a:
            boolean r4 = r11.zzP(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            long r4 = zzC(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r6)
            int r4 = com.google.android.gms.internal.contextmanager.zzlk.zzE(r4)
            goto L_0x052c
        L_0x0180:
            boolean r4 = r11.zzP(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            long r4 = zzC(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r6)
            int r4 = com.google.android.gms.internal.contextmanager.zzlk.zzE(r4)
            goto L_0x052c
        L_0x0196:
            boolean r4 = r11.zzP(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r4)
            goto L_0x053b
        L_0x01a4:
            boolean r4 = r11.zzP(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r4)
            goto L_0x054b
        L_0x01b2:
            java.lang.Object r4 = com.google.android.gms.internal.contextmanager.zzox.zzf(r12, r7)
            java.lang.Object r5 = r11.zzF(r2)
            com.google.android.gms.internal.contextmanager.zzni.zza(r6, r4, r5)
            goto L_0x054f
        L_0x01bf:
            java.lang.Object r4 = com.google.android.gms.internal.contextmanager.zzox.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.contextmanager.zznz r5 = r11.zzE(r2)
            int r4 = com.google.android.gms.internal.contextmanager.zzob.zzj(r6, r4, r5)
            goto L_0x0491
        L_0x01cf:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.contextmanager.zzob.zzt(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.contextmanager.zzlk.zzC(r6)
            int r6 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r4)
            goto L_0x02fc
        L_0x01e5:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.contextmanager.zzob.zzr(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.contextmanager.zzlk.zzC(r6)
            int r6 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r4)
            goto L_0x02fc
        L_0x01fb:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.contextmanager.zzob.zzi(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.contextmanager.zzlk.zzC(r6)
            int r6 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r4)
            goto L_0x02fc
        L_0x0211:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.contextmanager.zzob.zzg(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.contextmanager.zzlk.zzC(r6)
            int r6 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r4)
            goto L_0x02fc
        L_0x0227:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.contextmanager.zzob.zze(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.contextmanager.zzlk.zzC(r6)
            int r6 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r4)
            goto L_0x02fc
        L_0x023d:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.contextmanager.zzob.zzw(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.contextmanager.zzlk.zzC(r6)
            int r6 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r4)
            goto L_0x02fc
        L_0x0253:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.contextmanager.zzob.zzb(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.contextmanager.zzlk.zzC(r6)
            int r6 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r4)
            goto L_0x02fc
        L_0x0269:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.contextmanager.zzob.zzg(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.contextmanager.zzlk.zzC(r6)
            int r6 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r4)
            goto L_0x02fc
        L_0x027f:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.contextmanager.zzob.zzi(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.contextmanager.zzlk.zzC(r6)
            int r6 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r4)
            goto L_0x02fc
        L_0x0294:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.contextmanager.zzob.zzl(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.contextmanager.zzlk.zzC(r6)
            int r6 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r4)
            goto L_0x02fc
        L_0x02a9:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.contextmanager.zzob.zzy(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.contextmanager.zzlk.zzC(r6)
            int r6 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r4)
            goto L_0x02fc
        L_0x02be:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.contextmanager.zzob.zzn(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.contextmanager.zzlk.zzC(r6)
            int r6 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r4)
            goto L_0x02fc
        L_0x02d3:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.contextmanager.zzob.zzg(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.contextmanager.zzlk.zzC(r6)
            int r6 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r4)
            goto L_0x02fc
        L_0x02e8:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.contextmanager.zzob.zzi(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.contextmanager.zzlk.zzC(r6)
            int r6 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r4)
        L_0x02fc:
            int r6 = r6 + r5
            int r6 = r6 + r4
            goto L_0x04b4
        L_0x0300:
            java.lang.Object r4 = com.google.android.gms.internal.contextmanager.zzox.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.contextmanager.zzob.zzs(r6, r4, r1)
            goto L_0x0491
        L_0x030c:
            java.lang.Object r4 = com.google.android.gms.internal.contextmanager.zzox.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.contextmanager.zzob.zzq(r6, r4, r1)
            goto L_0x0491
        L_0x0318:
            java.lang.Object r4 = com.google.android.gms.internal.contextmanager.zzox.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.contextmanager.zzob.zzh(r6, r4, r1)
            goto L_0x0491
        L_0x0324:
            java.lang.Object r4 = com.google.android.gms.internal.contextmanager.zzox.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.contextmanager.zzob.zzf(r6, r4, r1)
            goto L_0x0491
        L_0x0330:
            java.lang.Object r4 = com.google.android.gms.internal.contextmanager.zzox.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.contextmanager.zzob.zzd(r6, r4, r1)
            goto L_0x0491
        L_0x033c:
            java.lang.Object r4 = com.google.android.gms.internal.contextmanager.zzox.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.contextmanager.zzob.zzv(r6, r4, r1)
            goto L_0x0491
        L_0x0348:
            java.lang.Object r4 = com.google.android.gms.internal.contextmanager.zzox.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.contextmanager.zzob.zzc(r6, r4)
            goto L_0x0491
        L_0x0354:
            java.lang.Object r4 = com.google.android.gms.internal.contextmanager.zzox.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.contextmanager.zznz r5 = r11.zzE(r2)
            int r4 = com.google.android.gms.internal.contextmanager.zzob.zzp(r6, r4, r5)
            goto L_0x0491
        L_0x0364:
            java.lang.Object r4 = com.google.android.gms.internal.contextmanager.zzox.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.contextmanager.zzob.zzu(r6, r4)
            goto L_0x0491
        L_0x0370:
            java.lang.Object r4 = com.google.android.gms.internal.contextmanager.zzox.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.contextmanager.zzob.zza(r6, r4, r1)
            goto L_0x0491
        L_0x037c:
            java.lang.Object r4 = com.google.android.gms.internal.contextmanager.zzox.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.contextmanager.zzob.zzf(r6, r4, r1)
            goto L_0x0491
        L_0x0388:
            java.lang.Object r4 = com.google.android.gms.internal.contextmanager.zzox.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.contextmanager.zzob.zzh(r6, r4, r1)
            goto L_0x0491
        L_0x0394:
            java.lang.Object r4 = com.google.android.gms.internal.contextmanager.zzox.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.contextmanager.zzob.zzk(r6, r4, r1)
            goto L_0x0491
        L_0x03a0:
            java.lang.Object r4 = com.google.android.gms.internal.contextmanager.zzox.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.contextmanager.zzob.zzx(r6, r4, r1)
            goto L_0x0491
        L_0x03ac:
            java.lang.Object r4 = com.google.android.gms.internal.contextmanager.zzox.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.contextmanager.zzob.zzm(r6, r4, r1)
            goto L_0x0491
        L_0x03b8:
            java.lang.Object r4 = com.google.android.gms.internal.contextmanager.zzox.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.contextmanager.zzob.zzf(r6, r4, r1)
            goto L_0x0491
        L_0x03c4:
            java.lang.Object r4 = com.google.android.gms.internal.contextmanager.zzox.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.contextmanager.zzob.zzh(r6, r4, r1)
            goto L_0x0491
        L_0x03d0:
            boolean r4 = r11.zzM(r12, r2)
            if (r4 == 0) goto L_0x054f
            java.lang.Object r4 = com.google.android.gms.internal.contextmanager.zzox.zzf(r12, r7)
            com.google.android.gms.internal.contextmanager.zznn r4 = (com.google.android.gms.internal.contextmanager.zznn) r4
            com.google.android.gms.internal.contextmanager.zznz r5 = r11.zzE(r2)
            int r4 = com.google.android.gms.internal.contextmanager.zzlk.zzv(r6, r4, r5)
            goto L_0x0491
        L_0x03e6:
            boolean r5 = r11.zzM(r12, r2)
            if (r5 == 0) goto L_0x054f
            long r7 = com.google.android.gms.internal.contextmanager.zzox.zzd(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r5)
            long r9 = r7 + r7
            long r6 = r7 >> r4
            long r6 = r6 ^ r9
            int r4 = com.google.android.gms.internal.contextmanager.zzlk.zzE(r6)
            goto L_0x0501
        L_0x0401:
            boolean r4 = r11.zzM(r12, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = com.google.android.gms.internal.contextmanager.zzox.zzc(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r5)
            int r6 = r4 + r4
            int r4 = r4 >> 31
            r4 = r4 ^ r6
            int r4 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r4)
            goto L_0x0501
        L_0x041c:
            boolean r4 = r11.zzM(r12, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r4)
            goto L_0x054b
        L_0x042a:
            boolean r4 = r11.zzM(r12, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r4)
            goto L_0x053b
        L_0x0438:
            boolean r4 = r11.zzM(r12, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = com.google.android.gms.internal.contextmanager.zzox.zzc(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r5)
            int r4 = com.google.android.gms.internal.contextmanager.zzlk.zzx(r4)
            goto L_0x0501
        L_0x044e:
            boolean r4 = r11.zzM(r12, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = com.google.android.gms.internal.contextmanager.zzox.zzc(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r5)
            int r4 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r4)
            goto L_0x0501
        L_0x0464:
            boolean r4 = r11.zzM(r12, r2)
            if (r4 == 0) goto L_0x054f
            java.lang.Object r4 = com.google.android.gms.internal.contextmanager.zzox.zzf(r12, r7)
            com.google.android.gms.internal.contextmanager.zzld r4 = (com.google.android.gms.internal.contextmanager.zzld) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r5)
            int r4 = r4.zzd()
            int r6 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r4)
            goto L_0x04b2
        L_0x047f:
            boolean r4 = r11.zzM(r12, r2)
            if (r4 == 0) goto L_0x054f
            java.lang.Object r4 = com.google.android.gms.internal.contextmanager.zzox.zzf(r12, r7)
            com.google.android.gms.internal.contextmanager.zznz r5 = r11.zzE(r2)
            int r4 = com.google.android.gms.internal.contextmanager.zzob.zzo(r6, r4, r5)
        L_0x0491:
            int r3 = r3 + r4
            goto L_0x054f
        L_0x0494:
            boolean r4 = r11.zzM(r12, r2)
            if (r4 == 0) goto L_0x054f
            java.lang.Object r4 = com.google.android.gms.internal.contextmanager.zzox.zzf(r12, r7)
            boolean r5 = r4 instanceof com.google.android.gms.internal.contextmanager.zzld
            if (r5 == 0) goto L_0x04b7
            com.google.android.gms.internal.contextmanager.zzld r4 = (com.google.android.gms.internal.contextmanager.zzld) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r5)
            int r4 = r4.zzd()
            int r6 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r4)
        L_0x04b2:
            int r6 = r6 + r4
            int r6 = r6 + r5
        L_0x04b4:
            int r3 = r3 + r6
            goto L_0x054f
        L_0x04b7:
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r5)
            int r4 = com.google.android.gms.internal.contextmanager.zzlk.zzB(r4)
            goto L_0x0501
        L_0x04c4:
            boolean r4 = r11.zzM(r12, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r4)
        L_0x04d0:
            int r4 = r4 + 1
            goto L_0x0491
        L_0x04d3:
            boolean r4 = r11.zzM(r12, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r4)
            goto L_0x053b
        L_0x04e0:
            boolean r4 = r11.zzM(r12, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r4)
            goto L_0x054b
        L_0x04ed:
            boolean r4 = r11.zzM(r12, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = com.google.android.gms.internal.contextmanager.zzox.zzc(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r5)
            int r4 = com.google.android.gms.internal.contextmanager.zzlk.zzx(r4)
        L_0x0501:
            int r4 = r4 + r5
            goto L_0x0491
        L_0x0503:
            boolean r4 = r11.zzM(r12, r2)
            if (r4 == 0) goto L_0x054f
            long r4 = com.google.android.gms.internal.contextmanager.zzox.zzd(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r6)
            int r4 = com.google.android.gms.internal.contextmanager.zzlk.zzE(r4)
            goto L_0x052c
        L_0x0518:
            boolean r4 = r11.zzM(r12, r2)
            if (r4 == 0) goto L_0x054f
            long r4 = com.google.android.gms.internal.contextmanager.zzox.zzd(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r6)
            int r4 = com.google.android.gms.internal.contextmanager.zzlk.zzE(r4)
        L_0x052c:
            int r4 = r4 + r6
            goto L_0x0491
        L_0x052f:
            boolean r4 = r11.zzM(r12, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r4)
        L_0x053b:
            int r4 = r4 + 4
            goto L_0x0491
        L_0x053f:
            boolean r4 = r11.zzM(r12, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.contextmanager.zzlk.zzD(r4)
        L_0x054b:
            int r4 = r4 + 8
            goto L_0x0491
        L_0x054f:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x0553:
            com.google.android.gms.internal.contextmanager.zzon<?, ?> r0 = r11.zzn
            java.lang.Object r12 = r0.zzc(r12)
            int r12 = r0.zza(r12)
            int r3 = r3 + r12
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.contextmanager.zznq.zzq(java.lang.Object):int");
    }

    private static <T> int zzr(T t, long j) {
        return ((Integer) zzox.zzf(t, j)).intValue();
    }

    private final <K, V> int zzs(T t, byte[] bArr, int i, int i2, int i3, long j, zzkq zzkq) throws IOException {
        Unsafe unsafe = zzb;
        Object zzF = zzF(i3);
        Object object = unsafe.getObject(t, j);
        if (!((zznh) object).zze()) {
            zznh zzb2 = zznh.zza().zzb();
            zzni.zzb(zzb2, object);
            unsafe.putObject(t, j, zzb2);
        }
        zzng zzng = (zzng) zzF;
        throw null;
    }

    private final int zzt(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, zzkq zzkq) throws IOException {
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
        zzkq zzkq2 = zzkq;
        Unsafe unsafe = zzb;
        long j3 = (long) (this.zzc[i14 + 2] & 1048575);
        switch (i7) {
            case 51:
                if (i13 == 1) {
                    unsafe.putObject(t2, j2, Double.valueOf(Double.longBitsToDouble(zzkr.zzo(bArr, i))));
                    unsafe.putInt(t2, j3, i12);
                    return i9 + 8;
                }
                break;
            case 52:
                if (i13 == 5) {
                    unsafe.putObject(t2, j2, Float.valueOf(Float.intBitsToFloat(zzkr.zzb(bArr, i))));
                    unsafe.putInt(t2, j3, i12);
                    return i9 + 4;
                }
                break;
            case 53:
            case 54:
                if (i13 == 0) {
                    int zzm2 = zzkr.zzm(bArr2, i9, zzkq2);
                    unsafe.putObject(t2, j2, Long.valueOf(zzkq2.zzb));
                    unsafe.putInt(t2, j3, i12);
                    return zzm2;
                }
                break;
            case 55:
            case 62:
                if (i13 == 0) {
                    int zzj2 = zzkr.zzj(bArr2, i9, zzkq2);
                    unsafe.putObject(t2, j2, Integer.valueOf(zzkq2.zza));
                    unsafe.putInt(t2, j3, i12);
                    return zzj2;
                }
                break;
            case 56:
            case 65:
                if (i13 == 1) {
                    unsafe.putObject(t2, j2, Long.valueOf(zzkr.zzo(bArr, i)));
                    unsafe.putInt(t2, j3, i12);
                    return i9 + 8;
                }
                break;
            case 57:
            case 64:
                if (i13 == 5) {
                    unsafe.putObject(t2, j2, Integer.valueOf(zzkr.zzb(bArr, i)));
                    unsafe.putInt(t2, j3, i12);
                    return i9 + 4;
                }
                break;
            case 58:
                if (i13 == 0) {
                    int zzm3 = zzkr.zzm(bArr2, i9, zzkq2);
                    if (zzkq2.zzb != 0) {
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
                    int zzj3 = zzkr.zzj(bArr2, i9, zzkq2);
                    int i15 = zzkq2.zza;
                    if (i15 == 0) {
                        unsafe.putObject(t2, j2, "");
                    } else if ((i6 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) == 0 || zzpc.zzf(bArr2, zzj3, zzj3 + i15)) {
                        unsafe.putObject(t2, j2, new String(bArr2, zzj3, i15, zzmn.zza));
                        zzj3 += i15;
                    } else {
                        throw zzmp.zzc();
                    }
                    unsafe.putInt(t2, j3, i12);
                    return zzj3;
                }
                break;
            case 60:
                if (i13 == 2) {
                    int zzd2 = zzkr.zzd(zzE(i14), bArr2, i9, i2, zzkq2);
                    if (unsafe.getInt(t2, j3) == i12) {
                        obj = unsafe.getObject(t2, j2);
                    } else {
                        obj = null;
                    }
                    if (obj == null) {
                        unsafe.putObject(t2, j2, zzkq2.zzc);
                    } else {
                        unsafe.putObject(t2, j2, zzmn.zzg(obj, zzkq2.zzc));
                    }
                    unsafe.putInt(t2, j3, i12);
                    return zzd2;
                }
                break;
            case 61:
                if (i13 == 2) {
                    int zza2 = zzkr.zza(bArr2, i9, zzkq2);
                    unsafe.putObject(t2, j2, zzkq2.zzc);
                    unsafe.putInt(t2, j3, i12);
                    return zza2;
                }
                break;
            case 63:
                if (i13 == 0) {
                    int zzj4 = zzkr.zzj(bArr2, i9, zzkq2);
                    int i16 = zzkq2.zza;
                    zzmj zzD = zzD(i14);
                    if (zzD == null || zzD.zza(i16)) {
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
                    int zzj5 = zzkr.zzj(bArr2, i9, zzkq2);
                    unsafe.putObject(t2, j2, Integer.valueOf(zzlg.zzb(zzkq2.zza)));
                    unsafe.putInt(t2, j3, i12);
                    return zzj5;
                }
                break;
            case 67:
                if (i13 == 0) {
                    int zzm4 = zzkr.zzm(bArr2, i9, zzkq2);
                    unsafe.putObject(t2, j2, Long.valueOf(zzlg.zzc(zzkq2.zzb)));
                    unsafe.putInt(t2, j3, i12);
                    return zzm4;
                }
                break;
            case 68:
                if (i13 == 3) {
                    int zzc2 = zzkr.zzc(zzE(i14), bArr, i, i2, (i11 & -8) | 4, zzkq);
                    if (unsafe.getInt(t2, j3) == i12) {
                        obj2 = unsafe.getObject(t2, j2);
                    } else {
                        obj2 = null;
                    }
                    if (obj2 == null) {
                        unsafe.putObject(t2, j2, zzkq2.zzc);
                    } else {
                        unsafe.putObject(t2, j2, zzmn.zzg(obj2, zzkq2.zzc));
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
    private final int zzu(T r31, byte[] r32, int r33, int r34, com.google.android.gms.internal.contextmanager.zzkq r35) throws java.io.IOException {
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
            int r0 = com.google.android.gms.internal.contextmanager.zzkr.zzk(r0, r12, r3, r11)
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
            r18 = -1
            r19 = 0
            goto L_0x0317
        L_0x004e:
            int[] r0 = r15.zzc
            int r1 = r2 + 1
            r1 = r0[r1]
            int r0 = zzA(r1)
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
            int r17 = com.google.android.gms.internal.contextmanager.zzkr.zzm(r12, r4, r11)
            long r0 = r11.zzb
            long r4 = com.google.android.gms.internal.contextmanager.zzlg.zzc(r0)
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
            int r0 = com.google.android.gms.internal.contextmanager.zzkr.zzj(r12, r4, r11)
            int r1 = r11.zza
            int r1 = com.google.android.gms.internal.contextmanager.zzlg.zzb(r1)
            r10.putInt(r14, r8, r1)
            goto L_0x0207
        L_0x00d6:
            r13 = r20
            r20 = r33
            if (r3 != 0) goto L_0x0126
            int r0 = com.google.android.gms.internal.contextmanager.zzkr.zzj(r12, r4, r11)
            int r1 = r11.zza
            r10.putInt(r14, r8, r1)
            goto L_0x0207
        L_0x00e7:
            r13 = r20
            r0 = 2
            r20 = r33
            if (r3 != r0) goto L_0x0126
            int r0 = com.google.android.gms.internal.contextmanager.zzkr.zza(r12, r4, r11)
            java.lang.Object r1 = r11.zzc
            r10.putObject(r14, r8, r1)
            goto L_0x0207
        L_0x00f9:
            r13 = r20
            r0 = 2
            r20 = r33
            if (r3 != r0) goto L_0x0124
            com.google.android.gms.internal.contextmanager.zznz r0 = r15.zzE(r13)
            r2 = r34
            r19 = 1048575(0xfffff, float:1.469367E-39)
            int r0 = com.google.android.gms.internal.contextmanager.zzkr.zzd(r0, r12, r4, r2, r11)
            java.lang.Object r1 = r10.getObject(r14, r8)
            if (r1 != 0) goto L_0x011a
            java.lang.Object r1 = r11.zzc
            r10.putObject(r14, r8, r1)
            goto L_0x017d
        L_0x011a:
            java.lang.Object r3 = r11.zzc
            java.lang.Object r1 = com.google.android.gms.internal.contextmanager.zzmn.zzg(r1, r3)
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
            int r0 = com.google.android.gms.internal.contextmanager.zzkr.zzg(r12, r4, r11)
            goto L_0x0146
        L_0x0142:
            int r0 = com.google.android.gms.internal.contextmanager.zzkr.zzh(r12, r4, r11)
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
            int r0 = com.google.android.gms.internal.contextmanager.zzkr.zzm(r12, r4, r11)
            long r3 = r11.zzb
            r22 = 0
            int r1 = (r3 > r22 ? 1 : (r3 == r22 ? 0 : -1))
            if (r1 == 0) goto L_0x0164
            goto L_0x0165
        L_0x0164:
            r5 = 0
        L_0x0165:
            com.google.android.gms.internal.contextmanager.zzox.zzm(r14, r8, r5)
            goto L_0x017d
        L_0x0169:
            r2 = r34
            r13 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            if (r3 != r1) goto L_0x020a
            int r0 = com.google.android.gms.internal.contextmanager.zzkr.zzb(r12, r4)
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
            long r22 = com.google.android.gms.internal.contextmanager.zzkr.zzo(r12, r4)
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
            int r0 = com.google.android.gms.internal.contextmanager.zzkr.zzj(r12, r4, r11)
            int r1 = r11.zza
            r10.putInt(r14, r8, r1)
            goto L_0x0207
        L_0x01bc:
            r13 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            if (r3 != 0) goto L_0x020a
            int r17 = com.google.android.gms.internal.contextmanager.zzkr.zzm(r12, r4, r11)
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
            int r0 = com.google.android.gms.internal.contextmanager.zzkr.zzb(r12, r4)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            com.google.android.gms.internal.contextmanager.zzox.zzp(r14, r8, r0)
            int r0 = r4 + 4
            goto L_0x0207
        L_0x01f1:
            r13 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            if (r3 != r5) goto L_0x020a
            long r0 = com.google.android.gms.internal.contextmanager.zzkr.zzo(r12, r4)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            com.google.android.gms.internal.contextmanager.zzox.zzo(r14, r8, r0)
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
            com.google.android.gms.internal.contextmanager.zzmm r0 = (com.google.android.gms.internal.contextmanager.zzmm) r0
            boolean r1 = r0.zzc()
            if (r1 != 0) goto L_0x0241
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0239
            r1 = 10
            goto L_0x023a
        L_0x0239:
            int r1 = r1 + r1
        L_0x023a:
            com.google.android.gms.internal.contextmanager.zzmm r0 = r0.zzd(r1)
            r10.putObject(r14, r8, r0)
        L_0x0241:
            r5 = r0
            com.google.android.gms.internal.contextmanager.zznz r0 = r15.zzE(r13)
            r1 = r17
            r2 = r32
            r3 = r4
            r4 = r34
            r8 = r6
            r6 = r35
            int r0 = com.google.android.gms.internal.contextmanager.zzkr.zze(r0, r1, r2, r3, r4, r5, r6)
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
            int r0 = r0.zzv(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
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
            int r0 = r0.zzs(r1, r2, r3, r4, r5, r6, r8)
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
            int r0 = r0.zzt(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x02be
            goto L_0x02aa
        L_0x0317:
            com.google.android.gms.internal.contextmanager.zzoo r4 = zzd(r31)
            r0 = r17
            r1 = r32
            r3 = r34
            r5 = r35
            int r0 = com.google.android.gms.internal.contextmanager.zzkr.zzi(r0, r1, r2, r3, r4, r5)
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
            com.google.android.gms.internal.contextmanager.zzmp r0 = com.google.android.gms.internal.contextmanager.zzmp.zze()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.contextmanager.zznq.zzu(java.lang.Object, byte[], int, int, com.google.android.gms.internal.contextmanager.zzkq):int");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x044f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01cf  */
    private final int zzv(T r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.gms.internal.contextmanager.zzkq r29) throws java.io.IOException {
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
            com.google.android.gms.internal.contextmanager.zzmm r12 = (com.google.android.gms.internal.contextmanager.zzmm) r12
            boolean r13 = r12.zzc()
            if (r13 != 0) goto L_0x0032
            int r13 = r12.size()
            if (r13 != 0) goto L_0x002a
            r13 = 10
            goto L_0x002b
        L_0x002a:
            int r13 = r13 + r13
        L_0x002b:
            com.google.android.gms.internal.contextmanager.zzmm r12 = r12.zzd(r13)
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
            com.google.android.gms.internal.contextmanager.zznz r1 = r15.zzE(r8)
            r6 = r2 & -8
            r6 = r6 | 4
            r21 = r1
            r22 = r17
            r23 = r18
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = com.google.android.gms.internal.contextmanager.zzkr.zzc(r21, r22, r23, r24, r25, r26)
            java.lang.Object r8 = r7.zzc
            r12.add(r8)
            goto L_0x042d
        L_0x005c:
            if (r6 != r14) goto L_0x0080
            com.google.android.gms.internal.contextmanager.zznc r12 = (com.google.android.gms.internal.contextmanager.zznc) r12
            int r1 = com.google.android.gms.internal.contextmanager.zzkr.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x0067:
            if (r1 >= r2) goto L_0x0077
            int r1 = com.google.android.gms.internal.contextmanager.zzkr.zzm(r3, r1, r7)
            long r4 = r7.zzb
            long r4 = com.google.android.gms.internal.contextmanager.zzlg.zzc(r4)
            r12.zzf(r4)
            goto L_0x0067
        L_0x0077:
            if (r1 != r2) goto L_0x007b
            goto L_0x0450
        L_0x007b:
            com.google.android.gms.internal.contextmanager.zzmp r1 = com.google.android.gms.internal.contextmanager.zzmp.zzg()
            throw r1
        L_0x0080:
            if (r6 != 0) goto L_0x044f
            com.google.android.gms.internal.contextmanager.zznc r12 = (com.google.android.gms.internal.contextmanager.zznc) r12
            int r1 = com.google.android.gms.internal.contextmanager.zzkr.zzm(r3, r4, r7)
            long r8 = r7.zzb
            long r8 = com.google.android.gms.internal.contextmanager.zzlg.zzc(r8)
            r12.zzf(r8)
        L_0x0091:
            if (r1 >= r5) goto L_0x00aa
            int r4 = com.google.android.gms.internal.contextmanager.zzkr.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x009c
            goto L_0x00aa
        L_0x009c:
            int r1 = com.google.android.gms.internal.contextmanager.zzkr.zzm(r3, r4, r7)
            long r8 = r7.zzb
            long r8 = com.google.android.gms.internal.contextmanager.zzlg.zzc(r8)
            r12.zzf(r8)
            goto L_0x0091
        L_0x00aa:
            return r1
        L_0x00ab:
            if (r6 != r14) goto L_0x00cf
            com.google.android.gms.internal.contextmanager.zzmg r12 = (com.google.android.gms.internal.contextmanager.zzmg) r12
            int r1 = com.google.android.gms.internal.contextmanager.zzkr.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x00b6:
            if (r1 >= r2) goto L_0x00c6
            int r1 = com.google.android.gms.internal.contextmanager.zzkr.zzj(r3, r1, r7)
            int r4 = r7.zza
            int r4 = com.google.android.gms.internal.contextmanager.zzlg.zzb(r4)
            r12.zzh(r4)
            goto L_0x00b6
        L_0x00c6:
            if (r1 != r2) goto L_0x00ca
            goto L_0x0450
        L_0x00ca:
            com.google.android.gms.internal.contextmanager.zzmp r1 = com.google.android.gms.internal.contextmanager.zzmp.zzg()
            throw r1
        L_0x00cf:
            if (r6 != 0) goto L_0x044f
            com.google.android.gms.internal.contextmanager.zzmg r12 = (com.google.android.gms.internal.contextmanager.zzmg) r12
            int r1 = com.google.android.gms.internal.contextmanager.zzkr.zzj(r3, r4, r7)
            int r4 = r7.zza
            int r4 = com.google.android.gms.internal.contextmanager.zzlg.zzb(r4)
            r12.zzh(r4)
        L_0x00e0:
            if (r1 >= r5) goto L_0x00f9
            int r4 = com.google.android.gms.internal.contextmanager.zzkr.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x00eb
            goto L_0x00f9
        L_0x00eb:
            int r1 = com.google.android.gms.internal.contextmanager.zzkr.zzj(r3, r4, r7)
            int r4 = r7.zza
            int r4 = com.google.android.gms.internal.contextmanager.zzlg.zzb(r4)
            r12.zzh(r4)
            goto L_0x00e0
        L_0x00f9:
            return r1
        L_0x00fa:
            if (r6 != r14) goto L_0x0101
            int r2 = com.google.android.gms.internal.contextmanager.zzkr.zzf(r3, r4, r12, r7)
            goto L_0x0112
        L_0x0101:
            if (r6 != 0) goto L_0x044f
            r2 = r20
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r12
            r7 = r29
            int r2 = com.google.android.gms.internal.contextmanager.zzkr.zzl(r2, r3, r4, r5, r6, r7)
        L_0x0112:
            com.google.android.gms.internal.contextmanager.zzmf r1 = (com.google.android.gms.internal.contextmanager.zzmf) r1
            com.google.android.gms.internal.contextmanager.zzoo r3 = r1.zzc
            com.google.android.gms.internal.contextmanager.zzoo r4 = com.google.android.gms.internal.contextmanager.zzoo.zzc()
            if (r3 != r4) goto L_0x011d
            r3 = 0
        L_0x011d:
            com.google.android.gms.internal.contextmanager.zzmj r4 = r15.zzD(r8)
            com.google.android.gms.internal.contextmanager.zzon<?, ?> r5 = r0.zzn
            r6 = r21
            java.lang.Object r3 = com.google.android.gms.internal.contextmanager.zzob.zzC(r6, r12, r4, r3, r5)
            if (r3 != 0) goto L_0x012d
            goto L_0x027b
        L_0x012d:
            com.google.android.gms.internal.contextmanager.zzoo r3 = (com.google.android.gms.internal.contextmanager.zzoo) r3
            r1.zzc = r3
            return r2
        L_0x0132:
            if (r6 != r14) goto L_0x044f
            int r1 = com.google.android.gms.internal.contextmanager.zzkr.zzj(r3, r4, r7)
            int r4 = r7.zza
            if (r4 < 0) goto L_0x0187
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0182
            if (r4 != 0) goto L_0x0148
            com.google.android.gms.internal.contextmanager.zzld r4 = com.google.android.gms.internal.contextmanager.zzld.zzb
            r12.add(r4)
            goto L_0x0150
        L_0x0148:
            com.google.android.gms.internal.contextmanager.zzld r6 = com.google.android.gms.internal.contextmanager.zzld.zzn(r3, r1, r4)
            r12.add(r6)
        L_0x014f:
            int r1 = r1 + r4
        L_0x0150:
            if (r1 >= r5) goto L_0x0181
            int r4 = com.google.android.gms.internal.contextmanager.zzkr.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x015b
            goto L_0x0181
        L_0x015b:
            int r1 = com.google.android.gms.internal.contextmanager.zzkr.zzj(r3, r4, r7)
            int r4 = r7.zza
            if (r4 < 0) goto L_0x017c
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0177
            if (r4 != 0) goto L_0x016f
            com.google.android.gms.internal.contextmanager.zzld r4 = com.google.android.gms.internal.contextmanager.zzld.zzb
            r12.add(r4)
            goto L_0x0150
        L_0x016f:
            com.google.android.gms.internal.contextmanager.zzld r6 = com.google.android.gms.internal.contextmanager.zzld.zzn(r3, r1, r4)
            r12.add(r6)
            goto L_0x014f
        L_0x0177:
            com.google.android.gms.internal.contextmanager.zzmp r1 = com.google.android.gms.internal.contextmanager.zzmp.zzg()
            throw r1
        L_0x017c:
            com.google.android.gms.internal.contextmanager.zzmp r1 = com.google.android.gms.internal.contextmanager.zzmp.zzd()
            throw r1
        L_0x0181:
            return r1
        L_0x0182:
            com.google.android.gms.internal.contextmanager.zzmp r1 = com.google.android.gms.internal.contextmanager.zzmp.zzg()
            throw r1
        L_0x0187:
            com.google.android.gms.internal.contextmanager.zzmp r1 = com.google.android.gms.internal.contextmanager.zzmp.zzd()
            throw r1
        L_0x018c:
            if (r6 == r14) goto L_0x0190
            goto L_0x044f
        L_0x0190:
            com.google.android.gms.internal.contextmanager.zznz r1 = r15.zzE(r8)
            r21 = r1
            r22 = r20
            r23 = r17
            r24 = r18
            r25 = r19
            r26 = r12
            r27 = r29
            int r1 = com.google.android.gms.internal.contextmanager.zzkr.zze(r21, r22, r23, r24, r25, r26, r27)
            return r1
        L_0x01a7:
            if (r6 != r14) goto L_0x044f
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r24 & r8
            java.lang.String r1 = ""
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 != 0) goto L_0x01fa
            int r4 = com.google.android.gms.internal.contextmanager.zzkr.zzj(r3, r4, r7)
            int r6 = r7.zza
            if (r6 < 0) goto L_0x01f5
            if (r6 != 0) goto L_0x01c2
            r12.add(r1)
            goto L_0x01cd
        L_0x01c2:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.contextmanager.zzmn.zza
            r8.<init>(r3, r4, r6, r9)
            r12.add(r8)
        L_0x01cc:
            int r4 = r4 + r6
        L_0x01cd:
            if (r4 >= r5) goto L_0x044f
            int r6 = com.google.android.gms.internal.contextmanager.zzkr.zzj(r3, r4, r7)
            int r8 = r7.zza
            if (r2 != r8) goto L_0x044f
            int r4 = com.google.android.gms.internal.contextmanager.zzkr.zzj(r3, r6, r7)
            int r6 = r7.zza
            if (r6 < 0) goto L_0x01f0
            if (r6 != 0) goto L_0x01e5
            r12.add(r1)
            goto L_0x01cd
        L_0x01e5:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.contextmanager.zzmn.zza
            r8.<init>(r3, r4, r6, r9)
            r12.add(r8)
            goto L_0x01cc
        L_0x01f0:
            com.google.android.gms.internal.contextmanager.zzmp r1 = com.google.android.gms.internal.contextmanager.zzmp.zzd()
            throw r1
        L_0x01f5:
            com.google.android.gms.internal.contextmanager.zzmp r1 = com.google.android.gms.internal.contextmanager.zzmp.zzd()
            throw r1
        L_0x01fa:
            int r4 = com.google.android.gms.internal.contextmanager.zzkr.zzj(r3, r4, r7)
            int r6 = r7.zza
            if (r6 < 0) goto L_0x0255
            if (r6 != 0) goto L_0x0208
            r12.add(r1)
            goto L_0x021b
        L_0x0208:
            int r8 = r4 + r6
            boolean r9 = com.google.android.gms.internal.contextmanager.zzpc.zzf(r3, r4, r8)
            if (r9 == 0) goto L_0x0250
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.contextmanager.zzmn.zza
            r9.<init>(r3, r4, r6, r10)
            r12.add(r9)
        L_0x021a:
            r4 = r8
        L_0x021b:
            if (r4 >= r5) goto L_0x044f
            int r6 = com.google.android.gms.internal.contextmanager.zzkr.zzj(r3, r4, r7)
            int r8 = r7.zza
            if (r2 != r8) goto L_0x044f
            int r4 = com.google.android.gms.internal.contextmanager.zzkr.zzj(r3, r6, r7)
            int r6 = r7.zza
            if (r6 < 0) goto L_0x024b
            if (r6 != 0) goto L_0x0233
            r12.add(r1)
            goto L_0x021b
        L_0x0233:
            int r8 = r4 + r6
            boolean r9 = com.google.android.gms.internal.contextmanager.zzpc.zzf(r3, r4, r8)
            if (r9 == 0) goto L_0x0246
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.contextmanager.zzmn.zza
            r9.<init>(r3, r4, r6, r10)
            r12.add(r9)
            goto L_0x021a
        L_0x0246:
            com.google.android.gms.internal.contextmanager.zzmp r1 = com.google.android.gms.internal.contextmanager.zzmp.zzc()
            throw r1
        L_0x024b:
            com.google.android.gms.internal.contextmanager.zzmp r1 = com.google.android.gms.internal.contextmanager.zzmp.zzd()
            throw r1
        L_0x0250:
            com.google.android.gms.internal.contextmanager.zzmp r1 = com.google.android.gms.internal.contextmanager.zzmp.zzc()
            throw r1
        L_0x0255:
            com.google.android.gms.internal.contextmanager.zzmp r1 = com.google.android.gms.internal.contextmanager.zzmp.zzd()
            throw r1
        L_0x025a:
            r1 = 0
            if (r6 != r14) goto L_0x0283
            com.google.android.gms.internal.contextmanager.zzks r12 = (com.google.android.gms.internal.contextmanager.zzks) r12
            int r2 = com.google.android.gms.internal.contextmanager.zzkr.zzj(r3, r4, r7)
            int r4 = r7.zza
            int r4 = r4 + r2
        L_0x0266:
            if (r2 >= r4) goto L_0x0279
            int r2 = com.google.android.gms.internal.contextmanager.zzkr.zzm(r3, r2, r7)
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
            com.google.android.gms.internal.contextmanager.zzmp r1 = com.google.android.gms.internal.contextmanager.zzmp.zzg()
            throw r1
        L_0x0283:
            if (r6 != 0) goto L_0x044f
            com.google.android.gms.internal.contextmanager.zzks r12 = (com.google.android.gms.internal.contextmanager.zzks) r12
            int r4 = com.google.android.gms.internal.contextmanager.zzkr.zzm(r3, r4, r7)
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
            int r6 = com.google.android.gms.internal.contextmanager.zzkr.zzj(r3, r4, r7)
            int r8 = r7.zza
            if (r2 == r8) goto L_0x02a2
            goto L_0x02b3
        L_0x02a2:
            int r4 = com.google.android.gms.internal.contextmanager.zzkr.zzm(r3, r6, r7)
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
            com.google.android.gms.internal.contextmanager.zzmg r12 = (com.google.android.gms.internal.contextmanager.zzmg) r12
            int r1 = com.google.android.gms.internal.contextmanager.zzkr.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x02bf:
            if (r1 >= r2) goto L_0x02cb
            int r4 = com.google.android.gms.internal.contextmanager.zzkr.zzb(r3, r1)
            r12.zzh(r4)
            int r1 = r1 + 4
            goto L_0x02bf
        L_0x02cb:
            if (r1 != r2) goto L_0x02cf
            goto L_0x0450
        L_0x02cf:
            com.google.android.gms.internal.contextmanager.zzmp r1 = com.google.android.gms.internal.contextmanager.zzmp.zzg()
            throw r1
        L_0x02d4:
            if (r6 != r9) goto L_0x044f
            com.google.android.gms.internal.contextmanager.zzmg r12 = (com.google.android.gms.internal.contextmanager.zzmg) r12
            int r1 = com.google.android.gms.internal.contextmanager.zzkr.zzb(r17, r18)
            r12.zzh(r1)
        L_0x02df:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x02f4
            int r4 = com.google.android.gms.internal.contextmanager.zzkr.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x02ec
            goto L_0x02f4
        L_0x02ec:
            int r1 = com.google.android.gms.internal.contextmanager.zzkr.zzb(r3, r4)
            r12.zzh(r1)
            goto L_0x02df
        L_0x02f4:
            return r1
        L_0x02f5:
            if (r6 != r14) goto L_0x0315
            com.google.android.gms.internal.contextmanager.zznc r12 = (com.google.android.gms.internal.contextmanager.zznc) r12
            int r1 = com.google.android.gms.internal.contextmanager.zzkr.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x0300:
            if (r1 >= r2) goto L_0x030c
            long r4 = com.google.android.gms.internal.contextmanager.zzkr.zzo(r3, r1)
            r12.zzf(r4)
            int r1 = r1 + 8
            goto L_0x0300
        L_0x030c:
            if (r1 != r2) goto L_0x0310
            goto L_0x0450
        L_0x0310:
            com.google.android.gms.internal.contextmanager.zzmp r1 = com.google.android.gms.internal.contextmanager.zzmp.zzg()
            throw r1
        L_0x0315:
            if (r6 != r13) goto L_0x044f
            com.google.android.gms.internal.contextmanager.zznc r12 = (com.google.android.gms.internal.contextmanager.zznc) r12
            long r8 = com.google.android.gms.internal.contextmanager.zzkr.zzo(r17, r18)
            r12.zzf(r8)
        L_0x0320:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0335
            int r4 = com.google.android.gms.internal.contextmanager.zzkr.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x032d
            goto L_0x0335
        L_0x032d:
            long r8 = com.google.android.gms.internal.contextmanager.zzkr.zzo(r3, r4)
            r12.zzf(r8)
            goto L_0x0320
        L_0x0335:
            return r1
        L_0x0336:
            if (r6 != r14) goto L_0x033e
            int r1 = com.google.android.gms.internal.contextmanager.zzkr.zzf(r3, r4, r12, r7)
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
            int r1 = com.google.android.gms.internal.contextmanager.zzkr.zzl(r20, r21, r22, r23, r24, r25)
            return r1
        L_0x0351:
            if (r6 != r14) goto L_0x0371
            com.google.android.gms.internal.contextmanager.zznc r12 = (com.google.android.gms.internal.contextmanager.zznc) r12
            int r1 = com.google.android.gms.internal.contextmanager.zzkr.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x035c:
            if (r1 >= r2) goto L_0x0368
            int r1 = com.google.android.gms.internal.contextmanager.zzkr.zzm(r3, r1, r7)
            long r4 = r7.zzb
            r12.zzf(r4)
            goto L_0x035c
        L_0x0368:
            if (r1 != r2) goto L_0x036c
            goto L_0x0450
        L_0x036c:
            com.google.android.gms.internal.contextmanager.zzmp r1 = com.google.android.gms.internal.contextmanager.zzmp.zzg()
            throw r1
        L_0x0371:
            if (r6 != 0) goto L_0x044f
            com.google.android.gms.internal.contextmanager.zznc r12 = (com.google.android.gms.internal.contextmanager.zznc) r12
            int r1 = com.google.android.gms.internal.contextmanager.zzkr.zzm(r3, r4, r7)
            long r8 = r7.zzb
            r12.zzf(r8)
        L_0x037e:
            if (r1 >= r5) goto L_0x0393
            int r4 = com.google.android.gms.internal.contextmanager.zzkr.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x0389
            goto L_0x0393
        L_0x0389:
            int r1 = com.google.android.gms.internal.contextmanager.zzkr.zzm(r3, r4, r7)
            long r8 = r7.zzb
            r12.zzf(r8)
            goto L_0x037e
        L_0x0393:
            return r1
        L_0x0394:
            if (r6 != r14) goto L_0x03b8
            com.google.android.gms.internal.contextmanager.zzlw r12 = (com.google.android.gms.internal.contextmanager.zzlw) r12
            int r1 = com.google.android.gms.internal.contextmanager.zzkr.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x039f:
            if (r1 >= r2) goto L_0x03af
            int r4 = com.google.android.gms.internal.contextmanager.zzkr.zzb(r3, r1)
            float r4 = java.lang.Float.intBitsToFloat(r4)
            r12.zze(r4)
            int r1 = r1 + 4
            goto L_0x039f
        L_0x03af:
            if (r1 != r2) goto L_0x03b3
            goto L_0x0450
        L_0x03b3:
            com.google.android.gms.internal.contextmanager.zzmp r1 = com.google.android.gms.internal.contextmanager.zzmp.zzg()
            throw r1
        L_0x03b8:
            if (r6 != r9) goto L_0x044f
            com.google.android.gms.internal.contextmanager.zzlw r12 = (com.google.android.gms.internal.contextmanager.zzlw) r12
            int r1 = com.google.android.gms.internal.contextmanager.zzkr.zzb(r17, r18)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r12.zze(r1)
        L_0x03c7:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x03e0
            int r4 = com.google.android.gms.internal.contextmanager.zzkr.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x03d4
            goto L_0x03e0
        L_0x03d4:
            int r1 = com.google.android.gms.internal.contextmanager.zzkr.zzb(r3, r4)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r12.zze(r1)
            goto L_0x03c7
        L_0x03e0:
            return r1
        L_0x03e1:
            if (r6 != r14) goto L_0x0404
            com.google.android.gms.internal.contextmanager.zzlm r12 = (com.google.android.gms.internal.contextmanager.zzlm) r12
            int r1 = com.google.android.gms.internal.contextmanager.zzkr.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x03ec:
            if (r1 >= r2) goto L_0x03fc
            long r4 = com.google.android.gms.internal.contextmanager.zzkr.zzo(r3, r1)
            double r4 = java.lang.Double.longBitsToDouble(r4)
            r12.zze(r4)
            int r1 = r1 + 8
            goto L_0x03ec
        L_0x03fc:
            if (r1 != r2) goto L_0x03ff
            goto L_0x0450
        L_0x03ff:
            com.google.android.gms.internal.contextmanager.zzmp r1 = com.google.android.gms.internal.contextmanager.zzmp.zzg()
            throw r1
        L_0x0404:
            if (r6 != r13) goto L_0x044f
            com.google.android.gms.internal.contextmanager.zzlm r12 = (com.google.android.gms.internal.contextmanager.zzlm) r12
            long r8 = com.google.android.gms.internal.contextmanager.zzkr.zzo(r17, r18)
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r12.zze(r8)
        L_0x0413:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x042c
            int r4 = com.google.android.gms.internal.contextmanager.zzkr.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x0420
            goto L_0x042c
        L_0x0420:
            long r8 = com.google.android.gms.internal.contextmanager.zzkr.zzo(r3, r4)
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r12.zze(r8)
            goto L_0x0413
        L_0x042c:
            return r1
        L_0x042d:
            if (r4 >= r5) goto L_0x044e
            int r8 = com.google.android.gms.internal.contextmanager.zzkr.zzj(r3, r4, r7)
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
            int r4 = com.google.android.gms.internal.contextmanager.zzkr.zzc(r21, r22, r23, r24, r25, r26)
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.contextmanager.zznq.zzv(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.contextmanager.zzkq):int");
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

    public final int zza(T t) {
        return this.zzi ? zzq(t) : zzp(t);
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
            java.lang.Object r3 = com.google.android.gms.internal.contextmanager.zzox.zzf(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0224
        L_0x0031:
            boolean r3 = r8.zzP(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = zzC(r9, r5)
            int r3 = com.google.android.gms.internal.contextmanager.zzmn.zzc(r3)
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
            int r3 = com.google.android.gms.internal.contextmanager.zzmn.zzc(r3)
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
            java.lang.Object r3 = com.google.android.gms.internal.contextmanager.zzox.zzf(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0224
        L_0x009f:
            boolean r3 = r8.zzP(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.contextmanager.zzox.zzf(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0224
        L_0x00b1:
            boolean r3 = r8.zzP(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.contextmanager.zzox.zzf(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0224
        L_0x00c5:
            boolean r3 = r8.zzP(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            boolean r3 = zzQ(r9, r5)
            int r3 = com.google.android.gms.internal.contextmanager.zzmn.zza(r3)
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
            int r3 = com.google.android.gms.internal.contextmanager.zzmn.zzc(r3)
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
            int r3 = com.google.android.gms.internal.contextmanager.zzmn.zzc(r3)
            goto L_0x0224
        L_0x0117:
            boolean r3 = r8.zzP(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = zzC(r9, r5)
            int r3 = com.google.android.gms.internal.contextmanager.zzmn.zzc(r3)
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
            int r3 = com.google.android.gms.internal.contextmanager.zzmn.zzc(r3)
            goto L_0x0224
        L_0x0151:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.contextmanager.zzox.zzf(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0224
        L_0x015d:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.contextmanager.zzox.zzf(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0224
        L_0x0169:
            java.lang.Object r3 = com.google.android.gms.internal.contextmanager.zzox.zzf(r9, r5)
            if (r3 == 0) goto L_0x01bf
            int r7 = r3.hashCode()
            goto L_0x01bf
        L_0x0174:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.contextmanager.zzox.zzd(r9, r5)
            int r3 = com.google.android.gms.internal.contextmanager.zzmn.zzc(r3)
            goto L_0x0224
        L_0x0180:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.contextmanager.zzox.zzc(r9, r5)
            goto L_0x01f3
        L_0x0188:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.contextmanager.zzox.zzd(r9, r5)
            int r3 = com.google.android.gms.internal.contextmanager.zzmn.zzc(r3)
            goto L_0x0224
        L_0x0194:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.contextmanager.zzox.zzc(r9, r5)
            goto L_0x01f3
        L_0x019b:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.contextmanager.zzox.zzc(r9, r5)
            goto L_0x01f3
        L_0x01a2:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.contextmanager.zzox.zzc(r9, r5)
            goto L_0x01f3
        L_0x01a9:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.contextmanager.zzox.zzf(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0224
        L_0x01b5:
            java.lang.Object r3 = com.google.android.gms.internal.contextmanager.zzox.zzf(r9, r5)
            if (r3 == 0) goto L_0x01bf
            int r7 = r3.hashCode()
        L_0x01bf:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0226
        L_0x01c3:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.contextmanager.zzox.zzf(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0224
        L_0x01d0:
            int r2 = r2 * 53
            boolean r3 = com.google.android.gms.internal.contextmanager.zzox.zzw(r9, r5)
            int r3 = com.google.android.gms.internal.contextmanager.zzmn.zza(r3)
            goto L_0x0224
        L_0x01db:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.contextmanager.zzox.zzc(r9, r5)
            goto L_0x01f3
        L_0x01e2:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.contextmanager.zzox.zzd(r9, r5)
            int r3 = com.google.android.gms.internal.contextmanager.zzmn.zzc(r3)
            goto L_0x0224
        L_0x01ed:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.contextmanager.zzox.zzc(r9, r5)
        L_0x01f3:
            int r2 = r2 + r3
            goto L_0x0226
        L_0x01f5:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.contextmanager.zzox.zzd(r9, r5)
            int r3 = com.google.android.gms.internal.contextmanager.zzmn.zzc(r3)
            goto L_0x0224
        L_0x0200:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.contextmanager.zzox.zzd(r9, r5)
            int r3 = com.google.android.gms.internal.contextmanager.zzmn.zzc(r3)
            goto L_0x0224
        L_0x020b:
            int r2 = r2 * 53
            float r3 = com.google.android.gms.internal.contextmanager.zzox.zzb(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0224
        L_0x0216:
            int r2 = r2 * 53
            double r3 = com.google.android.gms.internal.contextmanager.zzox.zza(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.gms.internal.contextmanager.zzmn.zzc(r3)
        L_0x0224:
            int r3 = r3 + r2
            r2 = r3
        L_0x0226:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x022a:
            int r2 = r2 * 53
            com.google.android.gms.internal.contextmanager.zzon<?, ?> r0 = r8.zzn
            java.lang.Object r0 = r0.zzc(r9)
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            boolean r1 = r8.zzh
            if (r1 == 0) goto L_0x024a
            int r0 = r0 * 53
            com.google.android.gms.internal.contextmanager.zzlq<?> r1 = r8.zzo
            com.google.android.gms.internal.contextmanager.zzlu r9 = r1.zzb(r9)
            com.google.android.gms.internal.contextmanager.zzoj<T, java.lang.Object> r9 = r9.zza
            int r9 = r9.hashCode()
            int r0 = r0 + r9
        L_0x024a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.contextmanager.zznq.zzb(java.lang.Object):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v50, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v45, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v36, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v37, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v38, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v39, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v40, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v41, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v42, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v75, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v41, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x037f, code lost:
        if (r0 != r15) goto L_0x0381;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x039b, code lost:
        r7 = r35;
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x03c5, code lost:
        if (r0 != r15) goto L_0x0381;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x03e8, code lost:
        if (r0 != r15) goto L_0x0381;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0476, code lost:
        r33 = r6;
        r0 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x048d, code lost:
        r6 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x054e, code lost:
        r2 = r2 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0563, code lost:
        r2 = r2 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0565, code lost:
        r0 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0567, code lost:
        r1 = r12.zzd;
        r3 = r1.zzc;
        r1 = r1.zzb.ordinal();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0573, code lost:
        if (r1 == 9) goto L_0x057a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0577, code lost:
        if (r1 == 10) goto L_0x057a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x057a, code lost:
        r1 = r14.zze(r12.zzd);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0580, code lost:
        if (r1 == null) goto L_0x0586;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0582, code lost:
        r0 = com.google.android.gms.internal.contextmanager.zzmn.zzg(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0586, code lost:
        r14.zzi(r12.zzd, r0);
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0158, code lost:
        r2 = r1;
        r22 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01fb, code lost:
        r1 = r6 | r27;
        r3 = r8;
        r2 = r11;
        r6 = r24;
        r11 = r35;
        r29 = r5;
        r5 = r1;
        r1 = r13;
        r13 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x022e, code lost:
        r2 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0268, code lost:
        r5 = r6 | r27;
        r0 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0288, code lost:
        r22 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x02a8, code lost:
        r5 = r6 | r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02aa, code lost:
        r3 = r8;
        r2 = r11;
        r1 = r13;
        r6 = r24;
        r13 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02b3, code lost:
        r22 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02d1, code lost:
        r7 = r35;
        r19 = r8;
        r28 = r10;
        r33 = r11;
        r8 = r22;
        r18 = true;
        r29 = r24;
        r24 = r6;
        r6 = r29;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzc(T r31, byte[] r32, int r33, int r34, int r35, com.google.android.gms.internal.contextmanager.zzkq r36) throws java.io.IOException {
        /*
            r30 = this;
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r9 = r36
            sun.misc.Unsafe r10 = zzb
            r16 = 0
            r0 = r33
            r1 = 0
            r2 = -1
            r3 = 0
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
        L_0x0019:
            r17 = 0
            if (r0 >= r13) goto L_0x05c7
            int r1 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002c
            int r0 = com.google.android.gms.internal.contextmanager.zzkr.zzk(r0, r12, r1, r9)
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
            r33 = r0
            r2 = r1
            r8 = r4
            r24 = r5
            r28 = r10
            r7 = r11
            r18 = 1
            r19 = 0
            r23 = -1
            goto L_0x03eb
        L_0x0054:
            int[] r3 = r15.zzc
            int r23 = r2 + 1
            r3 = r3[r23]
            int r11 = zzA(r3)
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r3 & r18
            r25 = r3
            r24 = r4
            long r3 = (long) r8
            r8 = 17
            r26 = r0
            if (r11 > r8) goto L_0x02e7
            int[] r8 = r15.zzc
            int r27 = r2 + 2
            r8 = r8[r27]
            int r27 = r8 >>> 20
            r22 = 1
            int r27 = r22 << r27
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r8 & r13
            if (r8 == r6) goto L_0x008e
            r18 = r1
            if (r6 == r13) goto L_0x0088
            long r0 = (long) r6
            r10.putInt(r14, r0, r5)
        L_0x0088:
            long r0 = (long) r8
            int r5 = r10.getInt(r14, r0)
            goto L_0x0091
        L_0x008e:
            r18 = r1
            r8 = r6
        L_0x0091:
            r6 = r5
            r0 = 5
            switch(r11) {
                case 0: goto L_0x028c;
                case 1: goto L_0x026c;
                case 2: goto L_0x0249;
                case 3: goto L_0x0249;
                case 4: goto L_0x0230;
                case 5: goto L_0x020b;
                case 6: goto L_0x01e2;
                case 7: goto L_0x01c1;
                case 8: goto L_0x019b;
                case 9: goto L_0x0161;
                case 10: goto L_0x0141;
                case 11: goto L_0x0230;
                case 12: goto L_0x010f;
                case 13: goto L_0x01e2;
                case 14: goto L_0x020b;
                case 15: goto L_0x00f5;
                case 16: goto L_0x00c7;
                default: goto L_0x0096;
            }
        L_0x0096:
            r13 = r24
            r11 = r26
            r0 = 3
            r1 = 1
            r24 = r8
            r8 = r2
            r2 = r18
            r18 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r0) goto L_0x02b3
            com.google.android.gms.internal.contextmanager.zznz r0 = r15.zzE(r8)
            int r1 = r11 << 3
            r5 = r1 | 4
            r1 = r32
            r22 = r13
            r12 = r3
            r3 = r34
            r4 = r5
            r5 = r36
            int r0 = com.google.android.gms.internal.contextmanager.zzkr.zzc(r0, r1, r2, r3, r4, r5)
            r1 = r6 & r27
            if (r1 != 0) goto L_0x02b6
            java.lang.Object r1 = r9.zzc
            r10.putObject(r14, r12, r1)
            goto L_0x02c3
        L_0x00c7:
            if (r7 != 0) goto L_0x00e8
            r1 = r18
            int r7 = com.google.android.gms.internal.contextmanager.zzkr.zzm(r12, r1, r9)
            long r0 = r9.zzb
            long r17 = com.google.android.gms.internal.contextmanager.zzlg.zzc(r0)
            r11 = r26
            r0 = r10
            r1 = r31
            r5 = r2
            r2 = r3
            r13 = r24
            r24 = r8
            r8 = r5
            r4 = r17
            r0.putLong(r1, r2, r4)
            goto L_0x0268
        L_0x00e8:
            r13 = r24
            r11 = r26
            r24 = r8
            r8 = r2
            r22 = r13
            r2 = r18
            goto L_0x015b
        L_0x00f5:
            r1 = r18
            r13 = r24
            r11 = r26
            r24 = r8
            r8 = r2
            if (r7 != 0) goto L_0x0158
            int r0 = com.google.android.gms.internal.contextmanager.zzkr.zzj(r12, r1, r9)
            int r1 = r9.zza
            int r1 = com.google.android.gms.internal.contextmanager.zzlg.zzb(r1)
            r10.putInt(r14, r3, r1)
            goto L_0x02a8
        L_0x010f:
            r1 = r18
            r13 = r24
            r11 = r26
            r24 = r8
            r8 = r2
            if (r7 != 0) goto L_0x0158
            int r0 = com.google.android.gms.internal.contextmanager.zzkr.zzj(r12, r1, r9)
            int r1 = r9.zza
            com.google.android.gms.internal.contextmanager.zzmj r2 = r15.zzD(r8)
            if (r2 == 0) goto L_0x013c
            boolean r2 = r2.zza(r1)
            if (r2 == 0) goto L_0x012d
            goto L_0x013c
        L_0x012d:
            com.google.android.gms.internal.contextmanager.zzoo r2 = zzd(r31)
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.zzh(r13, r1)
            r5 = r6
            goto L_0x02aa
        L_0x013c:
            r10.putInt(r14, r3, r1)
            goto L_0x02a8
        L_0x0141:
            r1 = r18
            r13 = r24
            r11 = r26
            r0 = 2
            r24 = r8
            r8 = r2
            if (r7 != r0) goto L_0x0158
            int r0 = com.google.android.gms.internal.contextmanager.zzkr.zza(r12, r1, r9)
            java.lang.Object r1 = r9.zzc
            r10.putObject(r14, r3, r1)
            goto L_0x02a8
        L_0x0158:
            r2 = r1
            r22 = r13
        L_0x015b:
            r1 = 1
            r18 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x02d1
        L_0x0161:
            r1 = r18
            r13 = r24
            r11 = r26
            r0 = 2
            r24 = r8
            r8 = r2
            if (r7 != r0) goto L_0x0194
            com.google.android.gms.internal.contextmanager.zznz r0 = r15.zzE(r8)
            r5 = r34
            r18 = 1048575(0xfffff, float:1.469367E-39)
            int r0 = com.google.android.gms.internal.contextmanager.zzkr.zzd(r0, r12, r1, r5, r9)
            r1 = r6 & r27
            if (r1 != 0) goto L_0x0185
            java.lang.Object r1 = r9.zzc
            r10.putObject(r14, r3, r1)
            goto L_0x01fb
        L_0x0185:
            java.lang.Object r1 = r10.getObject(r14, r3)
            java.lang.Object r2 = r9.zzc
            java.lang.Object r1 = com.google.android.gms.internal.contextmanager.zzmn.zzg(r1, r2)
            r10.putObject(r14, r3, r1)
            goto L_0x01fb
        L_0x0194:
            r5 = r34
            r18 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x022e
        L_0x019b:
            r5 = r34
            r1 = r18
            r13 = r24
            r11 = r26
            r0 = 2
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r24 = r8
            r8 = r2
            if (r7 != r0) goto L_0x022e
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r25 & r0
            if (r0 != 0) goto L_0x01b7
            int r0 = com.google.android.gms.internal.contextmanager.zzkr.zzg(r12, r1, r9)
            goto L_0x01bb
        L_0x01b7:
            int r0 = com.google.android.gms.internal.contextmanager.zzkr.zzh(r12, r1, r9)
        L_0x01bb:
            java.lang.Object r1 = r9.zzc
            r10.putObject(r14, r3, r1)
            goto L_0x01fb
        L_0x01c1:
            r5 = r34
            r1 = r18
            r13 = r24
            r11 = r26
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r24 = r8
            r8 = r2
            if (r7 != 0) goto L_0x022e
            int r0 = com.google.android.gms.internal.contextmanager.zzkr.zzm(r12, r1, r9)
            long r1 = r9.zzb
            int r7 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r7 == 0) goto L_0x01dd
            r1 = 1
            goto L_0x01de
        L_0x01dd:
            r1 = 0
        L_0x01de:
            com.google.android.gms.internal.contextmanager.zzox.zzm(r14, r3, r1)
            goto L_0x01fb
        L_0x01e2:
            r5 = r34
            r1 = r18
            r13 = r24
            r11 = r26
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r24 = r8
            r8 = r2
            if (r7 != r0) goto L_0x022e
            int r0 = com.google.android.gms.internal.contextmanager.zzkr.zzb(r12, r1)
            r10.putInt(r14, r3, r0)
            int r0 = r1 + 4
        L_0x01fb:
            r1 = r6 | r27
            r3 = r8
            r2 = r11
            r6 = r24
            r11 = r35
            r29 = r5
            r5 = r1
            r1 = r13
            r13 = r29
            goto L_0x0019
        L_0x020b:
            r5 = r34
            r1 = r18
            r13 = r24
            r11 = r26
            r0 = 1
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r24 = r8
            r8 = r2
            if (r7 != r0) goto L_0x022e
            long r19 = com.google.android.gms.internal.contextmanager.zzkr.zzo(r12, r1)
            r0 = r10
            r7 = r1
            r1 = r31
            r2 = r3
            r4 = r19
            r0.putLong(r1, r2, r4)
            int r0 = r7 + 8
            goto L_0x02a8
        L_0x022e:
            r2 = r1
            goto L_0x0288
        L_0x0230:
            r13 = r24
            r11 = r26
            r24 = r8
            r8 = r2
            r2 = r18
            r18 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != 0) goto L_0x0288
            int r0 = com.google.android.gms.internal.contextmanager.zzkr.zzj(r12, r2, r9)
            int r1 = r9.zza
            r10.putInt(r14, r3, r1)
            goto L_0x02a8
        L_0x0249:
            r13 = r24
            r11 = r26
            r24 = r8
            r8 = r2
            r2 = r18
            r18 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != 0) goto L_0x0288
            int r7 = com.google.android.gms.internal.contextmanager.zzkr.zzm(r12, r2, r9)
            long r1 = r9.zzb
            r0 = r10
            r19 = r1
            r1 = r31
            r2 = r3
            r4 = r19
            r0.putLong(r1, r2, r4)
        L_0x0268:
            r5 = r6 | r27
            r0 = r7
            goto L_0x02aa
        L_0x026c:
            r13 = r24
            r11 = r26
            r24 = r8
            r8 = r2
            r2 = r18
            r18 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r0) goto L_0x0288
            int r0 = com.google.android.gms.internal.contextmanager.zzkr.zzb(r12, r2)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            com.google.android.gms.internal.contextmanager.zzox.zzp(r14, r3, r0)
            int r0 = r2 + 4
            goto L_0x02a8
        L_0x0288:
            r22 = r13
            r1 = 1
            goto L_0x02d1
        L_0x028c:
            r13 = r24
            r11 = r26
            r1 = 1
            r24 = r8
            r8 = r2
            r2 = r18
            r18 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r1) goto L_0x02b3
            long r0 = com.google.android.gms.internal.contextmanager.zzkr.zzo(r12, r2)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            com.google.android.gms.internal.contextmanager.zzox.zzo(r14, r3, r0)
            int r0 = r2 + 8
        L_0x02a8:
            r5 = r6 | r27
        L_0x02aa:
            r3 = r8
            r2 = r11
            r1 = r13
            r6 = r24
            r13 = r34
            goto L_0x0339
        L_0x02b3:
            r22 = r13
            goto L_0x02d1
        L_0x02b6:
            java.lang.Object r1 = r10.getObject(r14, r12)
            java.lang.Object r2 = r9.zzc
            java.lang.Object r1 = com.google.android.gms.internal.contextmanager.zzmn.zzg(r1, r2)
            r10.putObject(r14, r12, r1)
        L_0x02c3:
            r5 = r6 | r27
            r12 = r32
            r13 = r34
            r3 = r8
            r2 = r11
            r1 = r22
            r6 = r24
            goto L_0x0339
        L_0x02d1:
            r7 = r35
            r19 = r8
            r28 = r10
            r33 = r11
            r8 = r22
            r18 = 1
            r23 = -1
            r29 = r24
            r24 = r6
            r6 = r29
            goto L_0x03eb
        L_0x02e7:
            r8 = r2
            r12 = r3
            r22 = r24
            r4 = r26
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r1
            r1 = 1
            r0 = 27
            if (r11 != r0) goto L_0x034e
            r0 = 2
            if (r7 != r0) goto L_0x033d
            java.lang.Object r0 = r10.getObject(r14, r12)
            com.google.android.gms.internal.contextmanager.zzmm r0 = (com.google.android.gms.internal.contextmanager.zzmm) r0
            boolean r1 = r0.zzc()
            if (r1 != 0) goto L_0x0317
            int r1 = r0.size()
            if (r1 != 0) goto L_0x030e
            r3 = 10
            goto L_0x0310
        L_0x030e:
            int r3 = r1 + r1
        L_0x0310:
            com.google.android.gms.internal.contextmanager.zzmm r0 = r0.zzd(r3)
            r10.putObject(r14, r12, r0)
        L_0x0317:
            r7 = r0
            com.google.android.gms.internal.contextmanager.zznz r0 = r15.zzE(r8)
            r1 = r22
            r3 = r2
            r2 = r32
            r11 = r4
            r4 = r34
            r24 = r5
            r5 = r7
            r26 = r6
            r6 = r36
            int r0 = com.google.android.gms.internal.contextmanager.zzkr.zze(r0, r1, r2, r3, r4, r5, r6)
            r12 = r32
            r13 = r34
            r3 = r8
            r2 = r11
            r5 = r24
            r6 = r26
        L_0x0339:
            r11 = r35
            goto L_0x0019
        L_0x033d:
            r24 = r5
            r26 = r6
            r15 = r2
            r33 = r4
            r19 = r8
            r28 = r10
            r18 = 1
            r23 = -1
            goto L_0x03c8
        L_0x034e:
            r3 = r2
            r24 = r5
            r26 = r6
            r5 = r4
            r0 = 49
            if (r11 > r0) goto L_0x039f
            r4 = r25
            r25 = r10
            long r9 = (long) r4
            r0 = r30
            r27 = 1
            r1 = r31
            r2 = r32
            r6 = r3
            r4 = 10
            r4 = r34
            r33 = r5
            r5 = r22
            r15 = r6
            r6 = r33
            r19 = r8
            r18 = 1
            r23 = -1
            r28 = r25
            r14 = r36
            int r0 = r0.zzv(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x039b
        L_0x0381:
            r15 = r30
            r14 = r31
            r12 = r32
            r2 = r33
            r13 = r34
            r11 = r35
            r9 = r36
            r3 = r19
            r1 = r22
            r5 = r24
            r6 = r26
            r10 = r28
            goto L_0x0019
        L_0x039b:
            r7 = r35
            r2 = r0
            goto L_0x03cb
        L_0x039f:
            r15 = r3
            r33 = r5
            r19 = r8
            r28 = r10
            r4 = r25
            r18 = 1
            r23 = -1
            r0 = 50
            if (r11 != r0) goto L_0x03d0
            r0 = 2
            if (r7 != r0) goto L_0x03c8
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r19
            r6 = r12
            r8 = r36
            int r0 = r0.zzs(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x039b
            goto L_0x0381
        L_0x03c8:
            r7 = r35
            r2 = r15
        L_0x03cb:
            r8 = r22
            r6 = r26
            goto L_0x03eb
        L_0x03d0:
            r0 = r30
            r1 = r31
            r2 = r32
            r8 = r4
            r3 = r15
            r4 = r34
            r5 = r22
            r6 = r33
            r9 = r11
            r10 = r12
            r12 = r19
            r13 = r36
            int r0 = r0.zzt(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x039b
            goto L_0x0381
        L_0x03eb:
            if (r8 != r7) goto L_0x03ff
            if (r7 == 0) goto L_0x03ff
            r9 = r30
            r13 = r31
            r0 = r2
            r2 = r6
            r1 = r8
            r5 = r24
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r34
            goto L_0x05d6
        L_0x03ff:
            r9 = r30
            boolean r0 = r9.zzh
            if (r0 == 0) goto L_0x059a
            r10 = r36
            com.google.android.gms.internal.contextmanager.zzlp r0 = r10.zzd
            com.google.android.gms.internal.contextmanager.zzlp r1 = com.google.android.gms.internal.contextmanager.zzlp.zza()
            if (r0 == r1) goto L_0x0593
            com.google.android.gms.internal.contextmanager.zznn r0 = r9.zzg
            com.google.android.gms.internal.contextmanager.zzlp r1 = r10.zzd
            r11 = r33
            com.google.android.gms.internal.contextmanager.zzmd r12 = r1.zzc(r0, r11)
            if (r12 != 0) goto L_0x0434
            com.google.android.gms.internal.contextmanager.zzoo r4 = zzd(r31)
            r0 = r8
            r1 = r32
            r3 = r34
            r5 = r36
            int r0 = com.google.android.gms.internal.contextmanager.zzkr.zzi(r0, r1, r2, r3, r4, r5)
            r13 = r31
            r15 = r32
            r33 = r6
            r6 = r34
            goto L_0x05b5
        L_0x0434:
            r13 = r31
            r0 = r13
            com.google.android.gms.internal.contextmanager.zzmb r0 = (com.google.android.gms.internal.contextmanager.zzmb) r0
            r0.zzc()
            com.google.android.gms.internal.contextmanager.zzlu<com.google.android.gms.internal.contextmanager.zzmc> r14 = r0.zza
            com.google.android.gms.internal.contextmanager.zzmc r0 = r12.zzd
            com.google.android.gms.internal.contextmanager.zzpd r0 = r0.zzb
            com.google.android.gms.internal.contextmanager.zzpd r1 = com.google.android.gms.internal.contextmanager.zzpd.ENUM
            if (r0 == r1) goto L_0x058d
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L_0x0551;
                case 1: goto L_0x053c;
                case 2: goto L_0x052b;
                case 3: goto L_0x052b;
                case 4: goto L_0x051a;
                case 5: goto L_0x050b;
                case 6: goto L_0x04fc;
                case 7: goto L_0x04e3;
                case 8: goto L_0x04d5;
                case 9: goto L_0x04ae;
                case 10: goto L_0x0491;
                case 11: goto L_0x0483;
                case 12: goto L_0x051a;
                case 13: goto L_0x047b;
                case 14: goto L_0x04fc;
                case 15: goto L_0x050b;
                case 16: goto L_0x0466;
                case 17: goto L_0x0455;
                default: goto L_0x044d;
            }
        L_0x044d:
            r15 = r32
            r33 = r6
            r6 = r34
            goto L_0x0565
        L_0x0455:
            r15 = r32
            int r2 = com.google.android.gms.internal.contextmanager.zzkr.zzm(r15, r2, r10)
            long r0 = r10.zzb
            long r0 = com.google.android.gms.internal.contextmanager.zzlg.zzc(r0)
            java.lang.Long r17 = java.lang.Long.valueOf(r0)
            goto L_0x0476
        L_0x0466:
            r15 = r32
            int r2 = com.google.android.gms.internal.contextmanager.zzkr.zzj(r15, r2, r10)
            int r0 = r10.zza
            int r0 = com.google.android.gms.internal.contextmanager.zzlg.zzb(r0)
            java.lang.Integer r17 = java.lang.Integer.valueOf(r0)
        L_0x0476:
            r33 = r6
            r0 = r17
            goto L_0x048d
        L_0x047b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Shouldn't reach here."
            r0.<init>(r1)
            throw r0
        L_0x0483:
            r15 = r32
            int r2 = com.google.android.gms.internal.contextmanager.zzkr.zza(r15, r2, r10)
            java.lang.Object r0 = r10.zzc
            r33 = r6
        L_0x048d:
            r6 = r34
            goto L_0x0567
        L_0x0491:
            r15 = r32
            com.google.android.gms.internal.contextmanager.zznw r0 = com.google.android.gms.internal.contextmanager.zznw.zza()
            com.google.android.gms.internal.contextmanager.zznn r1 = r12.zzc
            java.lang.Class r1 = r1.getClass()
            com.google.android.gms.internal.contextmanager.zznz r0 = r0.zzb(r1)
            r5 = r34
            int r2 = com.google.android.gms.internal.contextmanager.zzkr.zzd(r0, r15, r2, r5, r10)
            java.lang.Object r0 = r10.zzc
            r33 = r6
            r6 = r5
            goto L_0x0567
        L_0x04ae:
            r15 = r32
            r5 = r34
            com.google.android.gms.internal.contextmanager.zznw r0 = com.google.android.gms.internal.contextmanager.zznw.zza()
            com.google.android.gms.internal.contextmanager.zznn r1 = r12.zzc
            java.lang.Class r1 = r1.getClass()
            com.google.android.gms.internal.contextmanager.zznz r0 = r0.zzb(r1)
            int r1 = r11 << 3
            r4 = r1 | 4
            r1 = r32
            r3 = r34
            r33 = r6
            r6 = r5
            r5 = r36
            int r2 = com.google.android.gms.internal.contextmanager.zzkr.zzc(r0, r1, r2, r3, r4, r5)
            java.lang.Object r0 = r10.zzc
            goto L_0x0567
        L_0x04d5:
            r15 = r32
            r33 = r6
            r6 = r34
            int r2 = com.google.android.gms.internal.contextmanager.zzkr.zzg(r15, r2, r10)
            java.lang.Object r0 = r10.zzc
            goto L_0x0567
        L_0x04e3:
            r15 = r32
            r33 = r6
            r6 = r34
            int r2 = com.google.android.gms.internal.contextmanager.zzkr.zzm(r15, r2, r10)
            long r0 = r10.zzb
            int r3 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r3 == 0) goto L_0x04f4
            goto L_0x04f6
        L_0x04f4:
            r18 = 0
        L_0x04f6:
            java.lang.Boolean r17 = java.lang.Boolean.valueOf(r18)
            goto L_0x0565
        L_0x04fc:
            r15 = r32
            r33 = r6
            r6 = r34
            int r0 = com.google.android.gms.internal.contextmanager.zzkr.zzb(r15, r2)
            java.lang.Integer r17 = java.lang.Integer.valueOf(r0)
            goto L_0x054e
        L_0x050b:
            r15 = r32
            r33 = r6
            r6 = r34
            long r0 = com.google.android.gms.internal.contextmanager.zzkr.zzo(r15, r2)
            java.lang.Long r17 = java.lang.Long.valueOf(r0)
            goto L_0x0563
        L_0x051a:
            r15 = r32
            r33 = r6
            r6 = r34
            int r2 = com.google.android.gms.internal.contextmanager.zzkr.zzj(r15, r2, r10)
            int r0 = r10.zza
            java.lang.Integer r17 = java.lang.Integer.valueOf(r0)
            goto L_0x0565
        L_0x052b:
            r15 = r32
            r33 = r6
            r6 = r34
            int r2 = com.google.android.gms.internal.contextmanager.zzkr.zzm(r15, r2, r10)
            long r0 = r10.zzb
            java.lang.Long r17 = java.lang.Long.valueOf(r0)
            goto L_0x0565
        L_0x053c:
            r15 = r32
            r33 = r6
            r6 = r34
            int r0 = com.google.android.gms.internal.contextmanager.zzkr.zzb(r15, r2)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            java.lang.Float r17 = java.lang.Float.valueOf(r0)
        L_0x054e:
            int r2 = r2 + 4
            goto L_0x0565
        L_0x0551:
            r15 = r32
            r33 = r6
            r6 = r34
            long r0 = com.google.android.gms.internal.contextmanager.zzkr.zzo(r15, r2)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            java.lang.Double r17 = java.lang.Double.valueOf(r0)
        L_0x0563:
            int r2 = r2 + 8
        L_0x0565:
            r0 = r17
        L_0x0567:
            com.google.android.gms.internal.contextmanager.zzmc r1 = r12.zzd
            boolean r3 = r1.zzc
            com.google.android.gms.internal.contextmanager.zzpd r1 = r1.zzb
            int r1 = r1.ordinal()
            r3 = 9
            if (r1 == r3) goto L_0x057a
            r3 = 10
            if (r1 == r3) goto L_0x057a
            goto L_0x0586
        L_0x057a:
            com.google.android.gms.internal.contextmanager.zzmc r1 = r12.zzd
            java.lang.Object r1 = r14.zze(r1)
            if (r1 == 0) goto L_0x0586
            java.lang.Object r0 = com.google.android.gms.internal.contextmanager.zzmn.zzg(r1, r0)
        L_0x0586:
            com.google.android.gms.internal.contextmanager.zzmc r1 = r12.zzd
            r14.zzi(r1, r0)
            r0 = r2
            goto L_0x05b5
        L_0x058d:
            r15 = r32
            com.google.android.gms.internal.contextmanager.zzkr.zzj(r15, r2, r10)
            throw r17
        L_0x0593:
            r13 = r31
            r15 = r32
            r11 = r33
            goto L_0x05a2
        L_0x059a:
            r13 = r31
            r15 = r32
            r11 = r33
            r10 = r36
        L_0x05a2:
            r33 = r6
            r6 = r34
            com.google.android.gms.internal.contextmanager.zzoo r4 = zzd(r31)
            r0 = r8
            r1 = r32
            r3 = r34
            r5 = r36
            int r0 = com.google.android.gms.internal.contextmanager.zzkr.zzi(r0, r1, r2, r3, r4, r5)
        L_0x05b5:
            r1 = r8
            r2 = r11
            r14 = r13
            r12 = r15
            r3 = r19
            r5 = r24
            r13 = r6
            r11 = r7
            r15 = r9
            r9 = r10
            r10 = r28
            r6 = r33
            goto L_0x0019
        L_0x05c7:
            r24 = r5
            r26 = r6
            r28 = r10
            r7 = r11
            r6 = r13
            r13 = r14
            r9 = r15
            r2 = r26
            r3 = 1048575(0xfffff, float:1.469367E-39)
        L_0x05d6:
            if (r2 == r3) goto L_0x05de
            long r10 = (long) r2
            r2 = r28
            r2.putInt(r13, r10, r5)
        L_0x05de:
            int r2 = r9.zzk
        L_0x05e0:
            int r4 = r9.zzl
            if (r2 >= r4) goto L_0x060b
            int[] r4 = r9.zzj
            r4 = r4[r2]
            int[] r5 = r9.zzc
            r5 = r5[r4]
            int r5 = r9.zzB(r4)
            r5 = r5 & r3
            long r10 = (long) r5
            java.lang.Object r5 = com.google.android.gms.internal.contextmanager.zzox.zzf(r13, r10)
            if (r5 != 0) goto L_0x05f9
            goto L_0x05ff
        L_0x05f9:
            com.google.android.gms.internal.contextmanager.zzmj r8 = r9.zzD(r4)
            if (r8 != 0) goto L_0x0602
        L_0x05ff:
            int r2 = r2 + 1
            goto L_0x05e0
        L_0x0602:
            com.google.android.gms.internal.contextmanager.zznh r5 = (com.google.android.gms.internal.contextmanager.zznh) r5
            java.lang.Object r0 = r9.zzF(r4)
            com.google.android.gms.internal.contextmanager.zzng r0 = (com.google.android.gms.internal.contextmanager.zzng) r0
            throw r17
        L_0x060b:
            if (r7 != 0) goto L_0x0615
            if (r0 != r6) goto L_0x0610
            goto L_0x0619
        L_0x0610:
            com.google.android.gms.internal.contextmanager.zzmp r0 = com.google.android.gms.internal.contextmanager.zzmp.zze()
            throw r0
        L_0x0615:
            if (r0 > r6) goto L_0x061a
            if (r1 != r7) goto L_0x061a
        L_0x0619:
            return r0
        L_0x061a:
            com.google.android.gms.internal.contextmanager.zzmp r0 = com.google.android.gms.internal.contextmanager.zzmp.zze()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.contextmanager.zznq.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.contextmanager.zzkq):int");
    }

    public final T zze() {
        return ((zzmf) this.zzg).zzf(4, (Object) null, (Object) null);
    }

    public final void zzf(T t) {
        int i;
        int i2 = this.zzk;
        while (true) {
            i = this.zzl;
            if (i2 >= i) {
                break;
            }
            long zzB = (long) (zzB(this.zzj[i2]) & 1048575);
            Object zzf2 = zzox.zzf(t, zzB);
            if (zzf2 != null) {
                ((zznh) zzf2).zzc();
                zzox.zzs(t, zzB, zzf2);
            }
            i2++;
        }
        int length = this.zzj.length;
        while (i < length) {
            this.zzm.zza(t, (long) this.zzj[i]);
            i++;
        }
        this.zzn.zzg(t);
        if (this.zzh) {
            this.zzo.zze(t);
        }
    }

    public final void zzg(T t, T t2) {
        t2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzB = zzB(i);
            long j = (long) (1048575 & zzB);
            int i2 = this.zzc[i];
            switch (zzA(zzB)) {
                case 0:
                    if (!zzM(t2, i)) {
                        break;
                    } else {
                        zzox.zzo(t, j, zzox.zza(t2, j));
                        zzJ(t, i);
                        break;
                    }
                case 1:
                    if (!zzM(t2, i)) {
                        break;
                    } else {
                        zzox.zzp(t, j, zzox.zzb(t2, j));
                        zzJ(t, i);
                        break;
                    }
                case 2:
                    if (!zzM(t2, i)) {
                        break;
                    } else {
                        zzox.zzr(t, j, zzox.zzd(t2, j));
                        zzJ(t, i);
                        break;
                    }
                case 3:
                    if (!zzM(t2, i)) {
                        break;
                    } else {
                        zzox.zzr(t, j, zzox.zzd(t2, j));
                        zzJ(t, i);
                        break;
                    }
                case 4:
                    if (!zzM(t2, i)) {
                        break;
                    } else {
                        zzox.zzq(t, j, zzox.zzc(t2, j));
                        zzJ(t, i);
                        break;
                    }
                case 5:
                    if (!zzM(t2, i)) {
                        break;
                    } else {
                        zzox.zzr(t, j, zzox.zzd(t2, j));
                        zzJ(t, i);
                        break;
                    }
                case 6:
                    if (!zzM(t2, i)) {
                        break;
                    } else {
                        zzox.zzq(t, j, zzox.zzc(t2, j));
                        zzJ(t, i);
                        break;
                    }
                case 7:
                    if (!zzM(t2, i)) {
                        break;
                    } else {
                        zzox.zzm(t, j, zzox.zzw(t2, j));
                        zzJ(t, i);
                        break;
                    }
                case 8:
                    if (!zzM(t2, i)) {
                        break;
                    } else {
                        zzox.zzs(t, j, zzox.zzf(t2, j));
                        zzJ(t, i);
                        break;
                    }
                case 9:
                    zzH(t, t2, i);
                    break;
                case 10:
                    if (!zzM(t2, i)) {
                        break;
                    } else {
                        zzox.zzs(t, j, zzox.zzf(t2, j));
                        zzJ(t, i);
                        break;
                    }
                case 11:
                    if (!zzM(t2, i)) {
                        break;
                    } else {
                        zzox.zzq(t, j, zzox.zzc(t2, j));
                        zzJ(t, i);
                        break;
                    }
                case 12:
                    if (!zzM(t2, i)) {
                        break;
                    } else {
                        zzox.zzq(t, j, zzox.zzc(t2, j));
                        zzJ(t, i);
                        break;
                    }
                case 13:
                    if (!zzM(t2, i)) {
                        break;
                    } else {
                        zzox.zzq(t, j, zzox.zzc(t2, j));
                        zzJ(t, i);
                        break;
                    }
                case 14:
                    if (!zzM(t2, i)) {
                        break;
                    } else {
                        zzox.zzr(t, j, zzox.zzd(t2, j));
                        zzJ(t, i);
                        break;
                    }
                case 15:
                    if (!zzM(t2, i)) {
                        break;
                    } else {
                        zzox.zzq(t, j, zzox.zzc(t2, j));
                        zzJ(t, i);
                        break;
                    }
                case 16:
                    if (!zzM(t2, i)) {
                        break;
                    } else {
                        zzox.zzr(t, j, zzox.zzd(t2, j));
                        zzJ(t, i);
                        break;
                    }
                case 17:
                    zzH(t, t2, i);
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
                    this.zzm.zzb(t, t2, j);
                    break;
                case 50:
                    zzob.zzI(this.zzq, t, t2, j);
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
                    if (!zzP(t2, i2, i)) {
                        break;
                    } else {
                        zzox.zzs(t, j, zzox.zzf(t2, j));
                        zzK(t, i2, i);
                        break;
                    }
                case 60:
                    zzI(t, t2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!zzP(t2, i2, i)) {
                        break;
                    } else {
                        zzox.zzs(t, j, zzox.zzf(t2, j));
                        zzK(t, i2, i);
                        break;
                    }
                case 68:
                    zzI(t, t2, i);
                    break;
            }
        }
        zzob.zzF(this.zzn, t, t2);
        if (this.zzh) {
            zzob.zzE(this.zzo, t, t2);
        }
    }

    public final void zzh(T t, byte[] bArr, int i, int i2, zzkq zzkq) throws IOException {
        if (this.zzi) {
            zzu(t, bArr, i, i2, zzkq);
        } else {
            zzc(t, bArr, i, i2, 0, zzkq);
        }
    }

    public final boolean zzi(T t, T t2) {
        boolean z;
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int zzB = zzB(i);
            long j = (long) (zzB & 1048575);
            switch (zzA(zzB)) {
                case 0:
                    if (zzL(t, t2, i) && Double.doubleToLongBits(zzox.zza(t, j)) == Double.doubleToLongBits(zzox.zza(t2, j))) {
                        continue;
                    }
                case 1:
                    if (zzL(t, t2, i) && Float.floatToIntBits(zzox.zzb(t, j)) == Float.floatToIntBits(zzox.zzb(t2, j))) {
                        continue;
                    }
                case 2:
                    if (zzL(t, t2, i) && zzox.zzd(t, j) == zzox.zzd(t2, j)) {
                        continue;
                    }
                case 3:
                    if (zzL(t, t2, i) && zzox.zzd(t, j) == zzox.zzd(t2, j)) {
                        continue;
                    }
                case 4:
                    if (zzL(t, t2, i) && zzox.zzc(t, j) == zzox.zzc(t2, j)) {
                        continue;
                    }
                case 5:
                    if (zzL(t, t2, i) && zzox.zzd(t, j) == zzox.zzd(t2, j)) {
                        continue;
                    }
                case 6:
                    if (zzL(t, t2, i) && zzox.zzc(t, j) == zzox.zzc(t2, j)) {
                        continue;
                    }
                case 7:
                    if (zzL(t, t2, i) && zzox.zzw(t, j) == zzox.zzw(t2, j)) {
                        continue;
                    }
                case 8:
                    if (zzL(t, t2, i) && zzob.zzH(zzox.zzf(t, j), zzox.zzf(t2, j))) {
                        continue;
                    }
                case 9:
                    if (zzL(t, t2, i) && zzob.zzH(zzox.zzf(t, j), zzox.zzf(t2, j))) {
                        continue;
                    }
                case 10:
                    if (zzL(t, t2, i) && zzob.zzH(zzox.zzf(t, j), zzox.zzf(t2, j))) {
                        continue;
                    }
                case 11:
                    if (zzL(t, t2, i) && zzox.zzc(t, j) == zzox.zzc(t2, j)) {
                        continue;
                    }
                case 12:
                    if (zzL(t, t2, i) && zzox.zzc(t, j) == zzox.zzc(t2, j)) {
                        continue;
                    }
                case 13:
                    if (zzL(t, t2, i) && zzox.zzc(t, j) == zzox.zzc(t2, j)) {
                        continue;
                    }
                case 14:
                    if (zzL(t, t2, i) && zzox.zzd(t, j) == zzox.zzd(t2, j)) {
                        continue;
                    }
                case 15:
                    if (zzL(t, t2, i) && zzox.zzc(t, j) == zzox.zzc(t2, j)) {
                        continue;
                    }
                case 16:
                    if (zzL(t, t2, i) && zzox.zzd(t, j) == zzox.zzd(t2, j)) {
                        continue;
                    }
                case 17:
                    if (zzL(t, t2, i) && zzob.zzH(zzox.zzf(t, j), zzox.zzf(t2, j))) {
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
                    z = zzob.zzH(zzox.zzf(t, j), zzox.zzf(t2, j));
                    break;
                case 50:
                    z = zzob.zzH(zzox.zzf(t, j), zzox.zzf(t2, j));
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
                    if (zzox.zzc(t, zzy) == zzox.zzc(t2, zzy) && zzob.zzH(zzox.zzf(t, j), zzox.zzf(t2, j))) {
                        continue;
                    }
            }
            if (!z) {
                return false;
            }
        }
        if (!this.zzn.zzc(t).equals(this.zzn.zzc(t2))) {
            return false;
        }
        if (this.zzh) {
            return this.zzo.zzb(t).equals(this.zzo.zzb(t2));
        }
        return true;
    }

    public final boolean zzj(T t) {
        int i;
        int i2;
        T t2 = t;
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
                    i4 = zzb.getInt(t2, (long) i9);
                }
                i = i4;
                i2 = i9;
            } else {
                i2 = i3;
                i = i4;
            }
            if ((268435456 & zzB) != 0 && !zzN(t, i6, i2, i, i11)) {
                return false;
            }
            int zzA = zzA(zzB);
            if (zzA != 9 && zzA != 17) {
                if (zzA != 27) {
                    if (zzA == 60 || zzA == 68) {
                        if (zzP(t2, i7, i6) && !zzO(t2, zzB, zzE(i6))) {
                            return false;
                        }
                    } else if (zzA != 49) {
                        if (zzA == 50 && !((zznh) zzox.zzf(t2, (long) (zzB & 1048575))).isEmpty()) {
                            zzng zzng = (zzng) zzF(i6);
                            throw null;
                        }
                    }
                }
                List list = (List) zzox.zzf(t2, (long) (zzB & 1048575));
                if (!list.isEmpty()) {
                    zznz zzE = zzE(i6);
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        if (!zzE.zzj(list.get(i12))) {
                            return false;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            } else if (zzN(t, i6, i2, i, i11) && !zzO(t2, zzB, zzE(i6))) {
                return false;
            }
            i5++;
            i3 = i2;
            i4 = i;
        }
        if (!this.zzh || this.zzo.zzb(t2).zzk()) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0358  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0369  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x037a  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x038b  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x039c  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x03ad  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x03be  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x03cf  */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x03e4  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x03f5  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0406  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0417  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0428  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0439  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x044a  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x045d  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0472  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0483  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0494  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x04a4  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x04b4  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x04c4  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x04d4  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x04e4  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x04f4  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0509  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x0503 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01de  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0200  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0211  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0255  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0266  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0277  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0288  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0299  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x02aa  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x02bb  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x02cc  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x02dd  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x02ee  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x02ff  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0310  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0321  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0336  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0347  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzm(T r13, com.google.android.gms.internal.contextmanager.zzll r14) throws java.io.IOException {
        /*
            r12 = this;
            boolean r0 = r12.zzi
            if (r0 == 0) goto L_0x0527
            boolean r0 = r12.zzh
            r1 = 0
            if (r0 == 0) goto L_0x0022
            com.google.android.gms.internal.contextmanager.zzlq<?> r0 = r12.zzo
            com.google.android.gms.internal.contextmanager.zzlu r0 = r0.zzb(r13)
            com.google.android.gms.internal.contextmanager.zzoj<T, java.lang.Object> r2 = r0.zza
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
            if (r5 >= r3) goto L_0x0507
            int r6 = r12.zzB(r5)
            int[] r7 = r12.zzc
            r7 = r7[r5]
        L_0x0033:
            if (r2 == 0) goto L_0x0053
            com.google.android.gms.internal.contextmanager.zzlq<?> r8 = r12.zzo
            r8.zza(r2)
            r8 = 106879161(0x65ed8b9, float:4.1912782E-35)
            if (r7 < r8) goto L_0x0053
            com.google.android.gms.internal.contextmanager.zzlq<?> r8 = r12.zzo
            r8.zzg(r14, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0051
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0033
        L_0x0051:
            r2 = r1
            goto L_0x0033
        L_0x0053:
            int r8 = zzA(r6)
            r9 = 1
            r10 = 1048575(0xfffff, float:1.469367E-39)
            switch(r8) {
                case 0: goto L_0x04f4;
                case 1: goto L_0x04e4;
                case 2: goto L_0x04d4;
                case 3: goto L_0x04c4;
                case 4: goto L_0x04b4;
                case 5: goto L_0x04a4;
                case 6: goto L_0x0494;
                case 7: goto L_0x0483;
                case 8: goto L_0x0472;
                case 9: goto L_0x045d;
                case 10: goto L_0x044a;
                case 11: goto L_0x0439;
                case 12: goto L_0x0428;
                case 13: goto L_0x0417;
                case 14: goto L_0x0406;
                case 15: goto L_0x03f5;
                case 16: goto L_0x03e4;
                case 17: goto L_0x03cf;
                case 18: goto L_0x03be;
                case 19: goto L_0x03ad;
                case 20: goto L_0x039c;
                case 21: goto L_0x038b;
                case 22: goto L_0x037a;
                case 23: goto L_0x0369;
                case 24: goto L_0x0358;
                case 25: goto L_0x0347;
                case 26: goto L_0x0336;
                case 27: goto L_0x0321;
                case 28: goto L_0x0310;
                case 29: goto L_0x02ff;
                case 30: goto L_0x02ee;
                case 31: goto L_0x02dd;
                case 32: goto L_0x02cc;
                case 33: goto L_0x02bb;
                case 34: goto L_0x02aa;
                case 35: goto L_0x0299;
                case 36: goto L_0x0288;
                case 37: goto L_0x0277;
                case 38: goto L_0x0266;
                case 39: goto L_0x0255;
                case 40: goto L_0x0244;
                case 41: goto L_0x0233;
                case 42: goto L_0x0222;
                case 43: goto L_0x0211;
                case 44: goto L_0x0200;
                case 45: goto L_0x01ef;
                case 46: goto L_0x01de;
                case 47: goto L_0x01cd;
                case 48: goto L_0x01bc;
                case 49: goto L_0x01a7;
                case 50: goto L_0x019c;
                case 51: goto L_0x018b;
                case 52: goto L_0x017a;
                case 53: goto L_0x0169;
                case 54: goto L_0x0158;
                case 55: goto L_0x0147;
                case 56: goto L_0x0136;
                case 57: goto L_0x0125;
                case 58: goto L_0x0114;
                case 59: goto L_0x0103;
                case 60: goto L_0x00ee;
                case 61: goto L_0x00db;
                case 62: goto L_0x00ca;
                case 63: goto L_0x00b9;
                case 64: goto L_0x00a8;
                case 65: goto L_0x0097;
                case 66: goto L_0x0086;
                case 67: goto L_0x0075;
                case 68: goto L_0x0060;
                default: goto L_0x005e;
            }
        L_0x005e:
            goto L_0x0503
        L_0x0060:
            boolean r8 = r12.zzP(r13, r7, r5)
            if (r8 == 0) goto L_0x0503
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.contextmanager.zzox.zzf(r13, r8)
            com.google.android.gms.internal.contextmanager.zznz r8 = r12.zzE(r5)
            r14.zzq(r7, r6, r8)
            goto L_0x0503
        L_0x0075:
            boolean r8 = r12.zzP(r13, r7, r5)
            if (r8 == 0) goto L_0x0503
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = zzC(r13, r8)
            r14.zzD(r7, r8)
            goto L_0x0503
        L_0x0086:
            boolean r8 = r12.zzP(r13, r7, r5)
            if (r8 == 0) goto L_0x0503
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = zzr(r13, r8)
            r14.zzB(r7, r6)
            goto L_0x0503
        L_0x0097:
            boolean r8 = r12.zzP(r13, r7, r5)
            if (r8 == 0) goto L_0x0503
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = zzC(r13, r8)
            r14.zzz(r7, r8)
            goto L_0x0503
        L_0x00a8:
            boolean r8 = r12.zzP(r13, r7, r5)
            if (r8 == 0) goto L_0x0503
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = zzr(r13, r8)
            r14.zzx(r7, r6)
            goto L_0x0503
        L_0x00b9:
            boolean r8 = r12.zzP(r13, r7, r5)
            if (r8 == 0) goto L_0x0503
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = zzr(r13, r8)
            r14.zzi(r7, r6)
            goto L_0x0503
        L_0x00ca:
            boolean r8 = r12.zzP(r13, r7, r5)
            if (r8 == 0) goto L_0x0503
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = zzr(r13, r8)
            r14.zzI(r7, r6)
            goto L_0x0503
        L_0x00db:
            boolean r8 = r12.zzP(r13, r7, r5)
            if (r8 == 0) goto L_0x0503
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.contextmanager.zzox.zzf(r13, r8)
            com.google.android.gms.internal.contextmanager.zzld r6 = (com.google.android.gms.internal.contextmanager.zzld) r6
            r14.zzd(r7, r6)
            goto L_0x0503
        L_0x00ee:
            boolean r8 = r12.zzP(r13, r7, r5)
            if (r8 == 0) goto L_0x0503
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.contextmanager.zzox.zzf(r13, r8)
            com.google.android.gms.internal.contextmanager.zznz r8 = r12.zzE(r5)
            r14.zzv(r7, r6, r8)
            goto L_0x0503
        L_0x0103:
            boolean r8 = r12.zzP(r13, r7, r5)
            if (r8 == 0) goto L_0x0503
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.contextmanager.zzox.zzf(r13, r8)
            zzT(r7, r6, r14)
            goto L_0x0503
        L_0x0114:
            boolean r8 = r12.zzP(r13, r7, r5)
            if (r8 == 0) goto L_0x0503
            r6 = r6 & r10
            long r8 = (long) r6
            boolean r6 = zzQ(r13, r8)
            r14.zzb(r7, r6)
            goto L_0x0503
        L_0x0125:
            boolean r8 = r12.zzP(r13, r7, r5)
            if (r8 == 0) goto L_0x0503
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = zzr(r13, r8)
            r14.zzk(r7, r6)
            goto L_0x0503
        L_0x0136:
            boolean r8 = r12.zzP(r13, r7, r5)
            if (r8 == 0) goto L_0x0503
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = zzC(r13, r8)
            r14.zzm(r7, r8)
            goto L_0x0503
        L_0x0147:
            boolean r8 = r12.zzP(r13, r7, r5)
            if (r8 == 0) goto L_0x0503
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = zzr(r13, r8)
            r14.zzr(r7, r6)
            goto L_0x0503
        L_0x0158:
            boolean r8 = r12.zzP(r13, r7, r5)
            if (r8 == 0) goto L_0x0503
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = zzC(r13, r8)
            r14.zzK(r7, r8)
            goto L_0x0503
        L_0x0169:
            boolean r8 = r12.zzP(r13, r7, r5)
            if (r8 == 0) goto L_0x0503
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = zzC(r13, r8)
            r14.zzt(r7, r8)
            goto L_0x0503
        L_0x017a:
            boolean r8 = r12.zzP(r13, r7, r5)
            if (r8 == 0) goto L_0x0503
            r6 = r6 & r10
            long r8 = (long) r6
            float r6 = zzo(r13, r8)
            r14.zzo(r7, r6)
            goto L_0x0503
        L_0x018b:
            boolean r8 = r12.zzP(r13, r7, r5)
            if (r8 == 0) goto L_0x0503
            r6 = r6 & r10
            long r8 = (long) r6
            double r8 = zzn(r13, r8)
            r14.zzf(r7, r8)
            goto L_0x0503
        L_0x019c:
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.contextmanager.zzox.zzf(r13, r8)
            r12.zzS(r14, r7, r6, r5)
            goto L_0x0503
        L_0x01a7:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.contextmanager.zzox.zzf(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.contextmanager.zznz r8 = r12.zzE(r5)
            com.google.android.gms.internal.contextmanager.zzob.zzQ(r7, r6, r14, r8)
            goto L_0x0503
        L_0x01bc:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.contextmanager.zzox.zzf(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.contextmanager.zzob.zzX(r7, r6, r14, r9)
            goto L_0x0503
        L_0x01cd:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.contextmanager.zzox.zzf(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.contextmanager.zzob.zzW(r7, r6, r14, r9)
            goto L_0x0503
        L_0x01de:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.contextmanager.zzox.zzf(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.contextmanager.zzob.zzV(r7, r6, r14, r9)
            goto L_0x0503
        L_0x01ef:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.contextmanager.zzox.zzf(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.contextmanager.zzob.zzU(r7, r6, r14, r9)
            goto L_0x0503
        L_0x0200:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.contextmanager.zzox.zzf(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.contextmanager.zzob.zzM(r7, r6, r14, r9)
            goto L_0x0503
        L_0x0211:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.contextmanager.zzox.zzf(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.contextmanager.zzob.zzZ(r7, r6, r14, r9)
            goto L_0x0503
        L_0x0222:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.contextmanager.zzox.zzf(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.contextmanager.zzob.zzJ(r7, r6, r14, r9)
            goto L_0x0503
        L_0x0233:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.contextmanager.zzox.zzf(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.contextmanager.zzob.zzN(r7, r6, r14, r9)
            goto L_0x0503
        L_0x0244:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.contextmanager.zzox.zzf(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.contextmanager.zzob.zzO(r7, r6, r14, r9)
            goto L_0x0503
        L_0x0255:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.contextmanager.zzox.zzf(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.contextmanager.zzob.zzR(r7, r6, r14, r9)
            goto L_0x0503
        L_0x0266:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.contextmanager.zzox.zzf(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.contextmanager.zzob.zzaa(r7, r6, r14, r9)
            goto L_0x0503
        L_0x0277:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.contextmanager.zzox.zzf(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.contextmanager.zzob.zzS(r7, r6, r14, r9)
            goto L_0x0503
        L_0x0288:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.contextmanager.zzox.zzf(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.contextmanager.zzob.zzP(r7, r6, r14, r9)
            goto L_0x0503
        L_0x0299:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.contextmanager.zzox.zzf(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.contextmanager.zzob.zzL(r7, r6, r14, r9)
            goto L_0x0503
        L_0x02aa:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.contextmanager.zzox.zzf(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.contextmanager.zzob.zzX(r7, r6, r14, r4)
            goto L_0x0503
        L_0x02bb:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.contextmanager.zzox.zzf(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.contextmanager.zzob.zzW(r7, r6, r14, r4)
            goto L_0x0503
        L_0x02cc:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.contextmanager.zzox.zzf(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.contextmanager.zzob.zzV(r7, r6, r14, r4)
            goto L_0x0503
        L_0x02dd:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.contextmanager.zzox.zzf(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.contextmanager.zzob.zzU(r7, r6, r14, r4)
            goto L_0x0503
        L_0x02ee:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.contextmanager.zzox.zzf(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.contextmanager.zzob.zzM(r7, r6, r14, r4)
            goto L_0x0503
        L_0x02ff:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.contextmanager.zzox.zzf(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.contextmanager.zzob.zzZ(r7, r6, r14, r4)
            goto L_0x0503
        L_0x0310:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.contextmanager.zzox.zzf(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.contextmanager.zzob.zzK(r7, r6, r14)
            goto L_0x0503
        L_0x0321:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.contextmanager.zzox.zzf(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.contextmanager.zznz r8 = r12.zzE(r5)
            com.google.android.gms.internal.contextmanager.zzob.zzT(r7, r6, r14, r8)
            goto L_0x0503
        L_0x0336:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.contextmanager.zzox.zzf(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.contextmanager.zzob.zzY(r7, r6, r14)
            goto L_0x0503
        L_0x0347:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.contextmanager.zzox.zzf(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.contextmanager.zzob.zzJ(r7, r6, r14, r4)
            goto L_0x0503
        L_0x0358:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.contextmanager.zzox.zzf(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.contextmanager.zzob.zzN(r7, r6, r14, r4)
            goto L_0x0503
        L_0x0369:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.contextmanager.zzox.zzf(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.contextmanager.zzob.zzO(r7, r6, r14, r4)
            goto L_0x0503
        L_0x037a:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.contextmanager.zzox.zzf(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.contextmanager.zzob.zzR(r7, r6, r14, r4)
            goto L_0x0503
        L_0x038b:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.contextmanager.zzox.zzf(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.contextmanager.zzob.zzaa(r7, r6, r14, r4)
            goto L_0x0503
        L_0x039c:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.contextmanager.zzox.zzf(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.contextmanager.zzob.zzS(r7, r6, r14, r4)
            goto L_0x0503
        L_0x03ad:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.contextmanager.zzox.zzf(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.contextmanager.zzob.zzP(r7, r6, r14, r4)
            goto L_0x0503
        L_0x03be:
            int[] r7 = r12.zzc
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.contextmanager.zzox.zzf(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.contextmanager.zzob.zzL(r7, r6, r14, r4)
            goto L_0x0503
        L_0x03cf:
            boolean r8 = r12.zzM(r13, r5)
            if (r8 == 0) goto L_0x0503
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.contextmanager.zzox.zzf(r13, r8)
            com.google.android.gms.internal.contextmanager.zznz r8 = r12.zzE(r5)
            r14.zzq(r7, r6, r8)
            goto L_0x0503
        L_0x03e4:
            boolean r8 = r12.zzM(r13, r5)
            if (r8 == 0) goto L_0x0503
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = com.google.android.gms.internal.contextmanager.zzox.zzd(r13, r8)
            r14.zzD(r7, r8)
            goto L_0x0503
        L_0x03f5:
            boolean r8 = r12.zzM(r13, r5)
            if (r8 == 0) goto L_0x0503
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = com.google.android.gms.internal.contextmanager.zzox.zzc(r13, r8)
            r14.zzB(r7, r6)
            goto L_0x0503
        L_0x0406:
            boolean r8 = r12.zzM(r13, r5)
            if (r8 == 0) goto L_0x0503
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = com.google.android.gms.internal.contextmanager.zzox.zzd(r13, r8)
            r14.zzz(r7, r8)
            goto L_0x0503
        L_0x0417:
            boolean r8 = r12.zzM(r13, r5)
            if (r8 == 0) goto L_0x0503
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = com.google.android.gms.internal.contextmanager.zzox.zzc(r13, r8)
            r14.zzx(r7, r6)
            goto L_0x0503
        L_0x0428:
            boolean r8 = r12.zzM(r13, r5)
            if (r8 == 0) goto L_0x0503
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = com.google.android.gms.internal.contextmanager.zzox.zzc(r13, r8)
            r14.zzi(r7, r6)
            goto L_0x0503
        L_0x0439:
            boolean r8 = r12.zzM(r13, r5)
            if (r8 == 0) goto L_0x0503
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = com.google.android.gms.internal.contextmanager.zzox.zzc(r13, r8)
            r14.zzI(r7, r6)
            goto L_0x0503
        L_0x044a:
            boolean r8 = r12.zzM(r13, r5)
            if (r8 == 0) goto L_0x0503
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.contextmanager.zzox.zzf(r13, r8)
            com.google.android.gms.internal.contextmanager.zzld r6 = (com.google.android.gms.internal.contextmanager.zzld) r6
            r14.zzd(r7, r6)
            goto L_0x0503
        L_0x045d:
            boolean r8 = r12.zzM(r13, r5)
            if (r8 == 0) goto L_0x0503
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.contextmanager.zzox.zzf(r13, r8)
            com.google.android.gms.internal.contextmanager.zznz r8 = r12.zzE(r5)
            r14.zzv(r7, r6, r8)
            goto L_0x0503
        L_0x0472:
            boolean r8 = r12.zzM(r13, r5)
            if (r8 == 0) goto L_0x0503
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.contextmanager.zzox.zzf(r13, r8)
            zzT(r7, r6, r14)
            goto L_0x0503
        L_0x0483:
            boolean r8 = r12.zzM(r13, r5)
            if (r8 == 0) goto L_0x0503
            r6 = r6 & r10
            long r8 = (long) r6
            boolean r6 = com.google.android.gms.internal.contextmanager.zzox.zzw(r13, r8)
            r14.zzb(r7, r6)
            goto L_0x0503
        L_0x0494:
            boolean r8 = r12.zzM(r13, r5)
            if (r8 == 0) goto L_0x0503
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = com.google.android.gms.internal.contextmanager.zzox.zzc(r13, r8)
            r14.zzk(r7, r6)
            goto L_0x0503
        L_0x04a4:
            boolean r8 = r12.zzM(r13, r5)
            if (r8 == 0) goto L_0x0503
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = com.google.android.gms.internal.contextmanager.zzox.zzd(r13, r8)
            r14.zzm(r7, r8)
            goto L_0x0503
        L_0x04b4:
            boolean r8 = r12.zzM(r13, r5)
            if (r8 == 0) goto L_0x0503
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = com.google.android.gms.internal.contextmanager.zzox.zzc(r13, r8)
            r14.zzr(r7, r6)
            goto L_0x0503
        L_0x04c4:
            boolean r8 = r12.zzM(r13, r5)
            if (r8 == 0) goto L_0x0503
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = com.google.android.gms.internal.contextmanager.zzox.zzd(r13, r8)
            r14.zzK(r7, r8)
            goto L_0x0503
        L_0x04d4:
            boolean r8 = r12.zzM(r13, r5)
            if (r8 == 0) goto L_0x0503
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = com.google.android.gms.internal.contextmanager.zzox.zzd(r13, r8)
            r14.zzt(r7, r8)
            goto L_0x0503
        L_0x04e4:
            boolean r8 = r12.zzM(r13, r5)
            if (r8 == 0) goto L_0x0503
            r6 = r6 & r10
            long r8 = (long) r6
            float r6 = com.google.android.gms.internal.contextmanager.zzox.zzb(r13, r8)
            r14.zzo(r7, r6)
            goto L_0x0503
        L_0x04f4:
            boolean r8 = r12.zzM(r13, r5)
            if (r8 == 0) goto L_0x0503
            r6 = r6 & r10
            long r8 = (long) r6
            double r8 = com.google.android.gms.internal.contextmanager.zzox.zza(r13, r8)
            r14.zzf(r7, r8)
        L_0x0503:
            int r5 = r5 + 3
            goto L_0x0029
        L_0x0507:
            if (r2 == 0) goto L_0x051d
            com.google.android.gms.internal.contextmanager.zzlq<?> r3 = r12.zzo
            r3.zzg(r14, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x051b
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0507
        L_0x051b:
            r2 = r1
            goto L_0x0507
        L_0x051d:
            com.google.android.gms.internal.contextmanager.zzon<?, ?> r0 = r12.zzn
            java.lang.Object r13 = r0.zzc(r13)
            r0.zzj(r13, r14)
            return
        L_0x0527:
            r12.zzR(r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.contextmanager.zznq.zzm(java.lang.Object, com.google.android.gms.internal.contextmanager.zzll):void");
    }
}
