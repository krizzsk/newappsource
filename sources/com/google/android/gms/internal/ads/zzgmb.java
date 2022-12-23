package com.google.android.gms.internal.ads;

import com.appboy.support.ValidationUtils;
import com.moovit.database.sqlite.SQLiteDatabase;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

final class zzgmb<T> implements zzgmr<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzgns.zzi();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzgly zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final int[] zzk;
    private final int zzl;
    private final int zzm;
    private final zzglm zzn;
    private final zzgni zzo;
    private final zzgkb zzp;
    private final zzgmd zzq;
    private final zzglt zzr;

    private zzgmb(int[] iArr, Object[] objArr, int i, int i2, zzgly zzgly, boolean z, boolean z2, int[] iArr2, int i3, int i4, zzgmd zzgmd, zzglm zzglm, zzgni zzgni, zzgkb zzgkb, zzglt zzglt, byte[] bArr) {
        zzgly zzgly2 = zzgly;
        zzgkb zzgkb2 = zzgkb;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzgly2 instanceof zzgko;
        this.zzj = z;
        boolean z3 = false;
        if (zzgkb2 != null && zzgkb2.zzh(zzgly)) {
            z3 = true;
        }
        this.zzh = z3;
        this.zzk = iArr2;
        this.zzl = i3;
        this.zzm = i4;
        this.zzq = zzgmd;
        this.zzn = zzglm;
        this.zzo = zzgni;
        this.zzp = zzgkb2;
        this.zzg = zzgly2;
        this.zzr = zzglt;
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

    private static long zzD(Object obj, long j) {
        return ((Long) zzgns.zzh(obj, j)).longValue();
    }

    private final zzgks zzE(int i) {
        int i2 = i / 3;
        return (zzgks) this.zzd[i2 + i2 + 1];
    }

    private final zzgmr zzF(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzgmr zzgmr = (zzgmr) this.zzd[i3];
        if (zzgmr != null) {
            return zzgmr;
        }
        zzgmr zzb2 = zzgmg.zza().zzb((Class) this.zzd[i3 + 1]);
        this.zzd[i3] = zzb2;
        return zzb2;
    }

    private final Object zzG(Object obj, int i, Object obj2, zzgni zzgni) {
        int i2 = this.zzc[i];
        Object zzh2 = zzgns.zzh(obj, (long) (zzC(i) & 1048575));
        if (zzh2 == null || zzE(i) == null) {
            return obj2;
        }
        zzgls zzgls = (zzgls) zzh2;
        zzglr zzglr = (zzglr) zzH(i);
        throw null;
    }

    private final Object zzH(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private static Field zzI(Class cls, String str) {
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
            StringBuilder h = C16759e.m42352h("Field ", str, " for ", name, " not found. Known fields are ");
            h.append(arrays);
            throw new RuntimeException(h.toString());
        }
    }

    private final void zzJ(Object obj, Object obj2, int i) {
        long zzC = (long) (zzC(i) & 1048575);
        if (zzQ(obj2, i)) {
            Object zzh2 = zzgns.zzh(obj, zzC);
            Object zzh3 = zzgns.zzh(obj2, zzC);
            if (zzh2 != null && zzh3 != null) {
                zzgns.zzv(obj, zzC, zzgky.zzg(zzh2, zzh3));
                zzM(obj, i);
            } else if (zzh3 != null) {
                zzgns.zzv(obj, zzC, zzh3);
                zzM(obj, i);
            }
        }
    }

    private final void zzK(Object obj, Object obj2, int i) {
        Object obj3;
        int zzC = zzC(i);
        int i2 = this.zzc[i];
        long j = (long) (zzC & 1048575);
        if (zzT(obj2, i2, i)) {
            if (zzT(obj, i2, i)) {
                obj3 = zzgns.zzh(obj, j);
            } else {
                obj3 = null;
            }
            Object zzh2 = zzgns.zzh(obj2, j);
            if (obj3 != null && zzh2 != null) {
                zzgns.zzv(obj, j, zzgky.zzg(obj3, zzh2));
                zzN(obj, i2, i);
            } else if (zzh2 != null) {
                zzgns.zzv(obj, j, zzh2);
                zzN(obj, i2, i);
            }
        }
    }

    private final void zzL(Object obj, int i, zzgmj zzgmj) throws IOException {
        if (zzP(i)) {
            zzgns.zzv(obj, (long) (i & 1048575), zzgmj.zzu());
        } else if (this.zzi) {
            zzgns.zzv(obj, (long) (i & 1048575), zzgmj.zzt());
        } else {
            zzgns.zzv(obj, (long) (i & 1048575), zzgmj.zzp());
        }
    }

    private final void zzM(Object obj, int i) {
        int zzz = zzz(i);
        long j = (long) (1048575 & zzz);
        if (j != 1048575) {
            zzgns.zzt(obj, j, (1 << (zzz >>> 20)) | zzgns.zzd(obj, j));
        }
    }

    private final void zzN(Object obj, int i, int i2) {
        zzgns.zzt(obj, (long) (zzz(i2) & 1048575), i);
    }

    private final boolean zzO(Object obj, Object obj2, int i) {
        return zzQ(obj, i) == zzQ(obj2, i);
    }

    private static boolean zzP(int i) {
        return (i & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0;
    }

    private final boolean zzQ(Object obj, int i) {
        int zzz = zzz(i);
        long j = (long) (zzz & 1048575);
        if (j == 1048575) {
            int zzC = zzC(i);
            long j2 = (long) (zzC & 1048575);
            switch (zzB(zzC)) {
                case 0:
                    if (Double.doubleToRawLongBits(zzgns.zzb(obj, j2)) != 0) {
                        return true;
                    }
                    return false;
                case 1:
                    if (Float.floatToRawIntBits(zzgns.zzc(obj, j2)) != 0) {
                        return true;
                    }
                    return false;
                case 2:
                    if (zzgns.zzf(obj, j2) != 0) {
                        return true;
                    }
                    return false;
                case 3:
                    if (zzgns.zzf(obj, j2) != 0) {
                        return true;
                    }
                    return false;
                case 4:
                    if (zzgns.zzd(obj, j2) != 0) {
                        return true;
                    }
                    return false;
                case 5:
                    if (zzgns.zzf(obj, j2) != 0) {
                        return true;
                    }
                    return false;
                case 6:
                    if (zzgns.zzd(obj, j2) != 0) {
                        return true;
                    }
                    return false;
                case 7:
                    return zzgns.zzz(obj, j2);
                case 8:
                    Object zzh2 = zzgns.zzh(obj, j2);
                    if (zzh2 instanceof String) {
                        if (!((String) zzh2).isEmpty()) {
                            return true;
                        }
                        return false;
                    } else if (!(zzh2 instanceof zzgjg)) {
                        throw new IllegalArgumentException();
                    } else if (!zzgjg.zzb.equals(zzh2)) {
                        return true;
                    } else {
                        return false;
                    }
                case 9:
                    if (zzgns.zzh(obj, j2) != null) {
                        return true;
                    }
                    return false;
                case 10:
                    if (!zzgjg.zzb.equals(zzgns.zzh(obj, j2))) {
                        return true;
                    }
                    return false;
                case 11:
                    if (zzgns.zzd(obj, j2) != 0) {
                        return true;
                    }
                    return false;
                case 12:
                    if (zzgns.zzd(obj, j2) != 0) {
                        return true;
                    }
                    return false;
                case 13:
                    if (zzgns.zzd(obj, j2) != 0) {
                        return true;
                    }
                    return false;
                case 14:
                    if (zzgns.zzf(obj, j2) != 0) {
                        return true;
                    }
                    return false;
                case 15:
                    if (zzgns.zzd(obj, j2) != 0) {
                        return true;
                    }
                    return false;
                case 16:
                    if (zzgns.zzf(obj, j2) != 0) {
                        return true;
                    }
                    return false;
                case 17:
                    if (zzgns.zzh(obj, j2) != null) {
                        return true;
                    }
                    return false;
                default:
                    throw new IllegalArgumentException();
            }
        } else if ((zzgns.zzd(obj, j) & (1 << (zzz >>> 20))) != 0) {
            return true;
        } else {
            return false;
        }
    }

    private final boolean zzR(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzQ(obj, i) : (i3 & i4) != 0;
    }

    private static boolean zzS(Object obj, int i, zzgmr zzgmr) {
        return zzgmr.zzk(zzgns.zzh(obj, (long) (i & 1048575)));
    }

    private final boolean zzT(Object obj, int i, int i2) {
        if (zzgns.zzd(obj, (long) (zzz(i2) & 1048575)) == i) {
            return true;
        }
        return false;
    }

    private static boolean zzU(Object obj, long j) {
        return ((Boolean) zzgns.zzh(obj, j)).booleanValue();
    }

    private final void zzV(Object obj, zzgjw zzgjw) throws IOException {
        int i;
        Object obj2 = obj;
        zzgjw zzgjw2 = zzgjw;
        if (!this.zzh) {
            int length = this.zzc.length;
            Unsafe unsafe = zzb;
            int i2 = 1048575;
            int i3 = 0;
            int i4 = 0;
            int i5 = 1048575;
            while (i3 < length) {
                int zzC = zzC(i3);
                int[] iArr = this.zzc;
                int i6 = iArr[i3];
                int zzB = zzB(zzC);
                if (zzB <= 17) {
                    int i7 = iArr[i3 + 2];
                    int i8 = i7 & i2;
                    if (i8 != i5) {
                        i4 = unsafe.getInt(obj2, (long) i8);
                        i5 = i8;
                    }
                    i = 1 << (i7 >>> 20);
                } else {
                    i = 0;
                }
                long j = (long) (zzC & i2);
                switch (zzB) {
                    case 0:
                        if ((i4 & i) == 0) {
                            break;
                        } else {
                            zzgjw2.zzf(i6, zzgns.zzb(obj2, j));
                            continue;
                        }
                    case 1:
                        if ((i4 & i) != 0) {
                            zzgjw2.zzo(i6, zzgns.zzc(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 2:
                        if ((i4 & i) != 0) {
                            zzgjw2.zzt(i6, unsafe.getLong(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 3:
                        if ((i4 & i) != 0) {
                            zzgjw2.zzJ(i6, unsafe.getLong(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 4:
                        if ((i4 & i) != 0) {
                            zzgjw2.zzr(i6, unsafe.getInt(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 5:
                        if ((i4 & i) != 0) {
                            zzgjw2.zzm(i6, unsafe.getLong(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 6:
                        if ((i4 & i) != 0) {
                            zzgjw2.zzk(i6, unsafe.getInt(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 7:
                        if ((i4 & i) != 0) {
                            zzgjw2.zzb(i6, zzgns.zzz(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 8:
                        if ((i4 & i) != 0) {
                            zzX(i6, unsafe.getObject(obj2, j), zzgjw2);
                            break;
                        } else {
                            continue;
                        }
                    case 9:
                        if ((i4 & i) != 0) {
                            zzgjw2.zzv(i6, unsafe.getObject(obj2, j), zzF(i3));
                            break;
                        } else {
                            continue;
                        }
                    case 10:
                        if ((i4 & i) != 0) {
                            zzgjw2.zzd(i6, (zzgjg) unsafe.getObject(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 11:
                        if ((i4 & i) != 0) {
                            zzgjw2.zzH(i6, unsafe.getInt(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 12:
                        if ((i4 & i) != 0) {
                            zzgjw2.zzi(i6, unsafe.getInt(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 13:
                        if ((i4 & i) != 0) {
                            zzgjw2.zzw(i6, unsafe.getInt(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 14:
                        if ((i4 & i) != 0) {
                            zzgjw2.zzy(i6, unsafe.getLong(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 15:
                        if ((i4 & i) != 0) {
                            zzgjw2.zzA(i6, unsafe.getInt(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 16:
                        if ((i4 & i) != 0) {
                            zzgjw2.zzC(i6, unsafe.getLong(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 17:
                        if ((i4 & i) != 0) {
                            zzgjw2.zzq(i6, unsafe.getObject(obj2, j), zzF(i3));
                            break;
                        } else {
                            continue;
                        }
                    case 18:
                        zzgmt.zzL(this.zzc[i3], (List) unsafe.getObject(obj2, j), zzgjw2, false);
                        continue;
                    case 19:
                        zzgmt.zzP(this.zzc[i3], (List) unsafe.getObject(obj2, j), zzgjw2, false);
                        continue;
                    case 20:
                        zzgmt.zzS(this.zzc[i3], (List) unsafe.getObject(obj2, j), zzgjw2, false);
                        continue;
                    case 21:
                        zzgmt.zzaa(this.zzc[i3], (List) unsafe.getObject(obj2, j), zzgjw2, false);
                        continue;
                    case 22:
                        zzgmt.zzR(this.zzc[i3], (List) unsafe.getObject(obj2, j), zzgjw2, false);
                        continue;
                    case 23:
                        zzgmt.zzO(this.zzc[i3], (List) unsafe.getObject(obj2, j), zzgjw2, false);
                        continue;
                    case 24:
                        zzgmt.zzN(this.zzc[i3], (List) unsafe.getObject(obj2, j), zzgjw2, false);
                        continue;
                    case 25:
                        zzgmt.zzJ(this.zzc[i3], (List) unsafe.getObject(obj2, j), zzgjw2, false);
                        continue;
                    case 26:
                        zzgmt.zzY(this.zzc[i3], (List) unsafe.getObject(obj2, j), zzgjw2);
                        break;
                    case 27:
                        zzgmt.zzT(this.zzc[i3], (List) unsafe.getObject(obj2, j), zzgjw2, zzF(i3));
                        break;
                    case 28:
                        zzgmt.zzK(this.zzc[i3], (List) unsafe.getObject(obj2, j), zzgjw2);
                        break;
                    case 29:
                        zzgmt.zzZ(this.zzc[i3], (List) unsafe.getObject(obj2, j), zzgjw2, false);
                        break;
                    case 30:
                        zzgmt.zzM(this.zzc[i3], (List) unsafe.getObject(obj2, j), zzgjw2, false);
                        break;
                    case 31:
                        zzgmt.zzU(this.zzc[i3], (List) unsafe.getObject(obj2, j), zzgjw2, false);
                        break;
                    case 32:
                        zzgmt.zzV(this.zzc[i3], (List) unsafe.getObject(obj2, j), zzgjw2, false);
                        break;
                    case 33:
                        zzgmt.zzW(this.zzc[i3], (List) unsafe.getObject(obj2, j), zzgjw2, false);
                        break;
                    case 34:
                        zzgmt.zzX(this.zzc[i3], (List) unsafe.getObject(obj2, j), zzgjw2, false);
                        break;
                    case 35:
                        zzgmt.zzL(this.zzc[i3], (List) unsafe.getObject(obj2, j), zzgjw2, true);
                        break;
                    case 36:
                        zzgmt.zzP(this.zzc[i3], (List) unsafe.getObject(obj2, j), zzgjw2, true);
                        break;
                    case 37:
                        zzgmt.zzS(this.zzc[i3], (List) unsafe.getObject(obj2, j), zzgjw2, true);
                        break;
                    case 38:
                        zzgmt.zzaa(this.zzc[i3], (List) unsafe.getObject(obj2, j), zzgjw2, true);
                        break;
                    case 39:
                        zzgmt.zzR(this.zzc[i3], (List) unsafe.getObject(obj2, j), zzgjw2, true);
                        break;
                    case 40:
                        zzgmt.zzO(this.zzc[i3], (List) unsafe.getObject(obj2, j), zzgjw2, true);
                        break;
                    case 41:
                        zzgmt.zzN(this.zzc[i3], (List) unsafe.getObject(obj2, j), zzgjw2, true);
                        break;
                    case 42:
                        zzgmt.zzJ(this.zzc[i3], (List) unsafe.getObject(obj2, j), zzgjw2, true);
                        break;
                    case 43:
                        zzgmt.zzZ(this.zzc[i3], (List) unsafe.getObject(obj2, j), zzgjw2, true);
                        break;
                    case 44:
                        zzgmt.zzM(this.zzc[i3], (List) unsafe.getObject(obj2, j), zzgjw2, true);
                        break;
                    case 45:
                        zzgmt.zzU(this.zzc[i3], (List) unsafe.getObject(obj2, j), zzgjw2, true);
                        break;
                    case 46:
                        zzgmt.zzV(this.zzc[i3], (List) unsafe.getObject(obj2, j), zzgjw2, true);
                        break;
                    case 47:
                        zzgmt.zzW(this.zzc[i3], (List) unsafe.getObject(obj2, j), zzgjw2, true);
                        break;
                    case 48:
                        zzgmt.zzX(this.zzc[i3], (List) unsafe.getObject(obj2, j), zzgjw2, true);
                        break;
                    case 49:
                        zzgmt.zzQ(this.zzc[i3], (List) unsafe.getObject(obj2, j), zzgjw2, zzF(i3));
                        break;
                    case 50:
                        zzW(zzgjw2, i6, unsafe.getObject(obj2, j), i3);
                        break;
                    case 51:
                        if (zzT(obj2, i6, i3)) {
                            zzgjw2.zzf(i6, zzo(obj2, j));
                            break;
                        }
                        break;
                    case 52:
                        if (zzT(obj2, i6, i3)) {
                            zzgjw2.zzo(i6, zzp(obj2, j));
                            break;
                        }
                        break;
                    case 53:
                        if (zzT(obj2, i6, i3)) {
                            zzgjw2.zzt(i6, zzD(obj2, j));
                            break;
                        }
                        break;
                    case 54:
                        if (zzT(obj2, i6, i3)) {
                            zzgjw2.zzJ(i6, zzD(obj2, j));
                            break;
                        }
                        break;
                    case 55:
                        if (zzT(obj2, i6, i3)) {
                            zzgjw2.zzr(i6, zzs(obj2, j));
                            break;
                        }
                        break;
                    case 56:
                        if (zzT(obj2, i6, i3)) {
                            zzgjw2.zzm(i6, zzD(obj2, j));
                            break;
                        }
                        break;
                    case 57:
                        if (zzT(obj2, i6, i3)) {
                            zzgjw2.zzk(i6, zzs(obj2, j));
                            break;
                        }
                        break;
                    case 58:
                        if (zzT(obj2, i6, i3)) {
                            zzgjw2.zzb(i6, zzU(obj2, j));
                            break;
                        }
                        break;
                    case 59:
                        if (zzT(obj2, i6, i3)) {
                            zzX(i6, unsafe.getObject(obj2, j), zzgjw2);
                            break;
                        }
                        break;
                    case 60:
                        if (zzT(obj2, i6, i3)) {
                            zzgjw2.zzv(i6, unsafe.getObject(obj2, j), zzF(i3));
                            break;
                        }
                        break;
                    case 61:
                        if (zzT(obj2, i6, i3)) {
                            zzgjw2.zzd(i6, (zzgjg) unsafe.getObject(obj2, j));
                            break;
                        }
                        break;
                    case 62:
                        if (zzT(obj2, i6, i3)) {
                            zzgjw2.zzH(i6, zzs(obj2, j));
                            break;
                        }
                        break;
                    case 63:
                        if (zzT(obj2, i6, i3)) {
                            zzgjw2.zzi(i6, zzs(obj2, j));
                            break;
                        }
                        break;
                    case 64:
                        if (zzT(obj2, i6, i3)) {
                            zzgjw2.zzw(i6, zzs(obj2, j));
                            break;
                        }
                        break;
                    case 65:
                        if (zzT(obj2, i6, i3)) {
                            zzgjw2.zzy(i6, zzD(obj2, j));
                            break;
                        }
                        break;
                    case 66:
                        if (zzT(obj2, i6, i3)) {
                            zzgjw2.zzA(i6, zzs(obj2, j));
                            break;
                        }
                        break;
                    case 67:
                        if (zzT(obj2, i6, i3)) {
                            zzgjw2.zzC(i6, zzD(obj2, j));
                            break;
                        }
                        break;
                    case 68:
                        if (zzT(obj2, i6, i3)) {
                            zzgjw2.zzq(i6, unsafe.getObject(obj2, j), zzF(i3));
                            break;
                        }
                        break;
                }
                i3 += 3;
                i2 = 1048575;
            }
            zzgni zzgni = this.zzo;
            zzgni.zzr(zzgni.zzd(obj2), zzgjw2);
            return;
        }
        this.zzp.zza(obj2);
        throw null;
    }

    private final void zzW(zzgjw zzgjw, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            zzglr zzglr = (zzglr) zzH(i2);
            throw null;
        }
    }

    private static final void zzX(int i, Object obj, zzgjw zzgjw) throws IOException {
        if (obj instanceof String) {
            zzgjw.zzF(i, (String) obj);
        } else {
            zzgjw.zzd(i, (zzgjg) obj);
        }
    }

    public static zzgnj zzd(Object obj) {
        zzgko zzgko = (zzgko) obj;
        zzgnj zzgnj = zzgko.zzc;
        if (zzgnj != zzgnj.zzc()) {
            return zzgnj;
        }
        zzgnj zze2 = zzgnj.zze();
        zzgko.zzc = zze2;
        return zze2;
    }

    public static zzgmb zzl(Class cls, zzglv zzglv, zzgmd zzgmd, zzglm zzglm, zzgni zzgni, zzgkb zzgkb, zzglt zzglt) {
        if (zzglv instanceof zzgmi) {
            return zzm((zzgmi) zzglv, zzgmd, zzglm, zzgni, zzgkb, zzglt);
        }
        zzgnf zzgnf = (zzgnf) zzglv;
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:120:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0260  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x032f  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0378  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.zzgmb zzm(com.google.android.gms.internal.ads.zzgmi r33, com.google.android.gms.internal.ads.zzgmd r34, com.google.android.gms.internal.ads.zzglm r35, com.google.android.gms.internal.ads.zzgni r36, com.google.android.gms.internal.ads.zzgkb r37, com.google.android.gms.internal.ads.zzglt r38) {
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
            com.google.android.gms.internal.ads.zzgly r18 = r33.zza()
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
            com.google.android.gms.internal.ads.zzgmb r0 = new com.google.android.gms.internal.ads.zzgmb
            r4 = r0
            com.google.android.gms.internal.ads.zzgly r9 = r33.zza()
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgmb.zzm(com.google.android.gms.internal.ads.zzgmi, com.google.android.gms.internal.ads.zzgmd, com.google.android.gms.internal.ads.zzglm, com.google.android.gms.internal.ads.zzgni, com.google.android.gms.internal.ads.zzgkb, com.google.android.gms.internal.ads.zzglt):com.google.android.gms.internal.ads.zzgmb");
    }

    private static double zzo(Object obj, long j) {
        return ((Double) zzgns.zzh(obj, j)).doubleValue();
    }

    private static float zzp(Object obj, long j) {
        return ((Float) zzgns.zzh(obj, j)).floatValue();
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
    private final int zzq(java.lang.Object r15) {
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
            int r6 = r14.zzC(r2)
            int[] r7 = r14.zzc
            r8 = r7[r2]
            int r9 = zzB(r6)
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
            boolean r1 = r14.zzT(r15, r8, r2)
            if (r1 == 0) goto L_0x0543
            java.lang.Object r1 = r0.getObject(r15, r12)
            com.google.android.gms.internal.ads.zzgly r1 = (com.google.android.gms.internal.ads.zzgly) r1
            com.google.android.gms.internal.ads.zzgmr r6 = r14.zzF(r2)
            int r1 = com.google.android.gms.internal.ads.zzgjv.zzx(r8, r1, r6)
            goto L_0x0497
        L_0x0054:
            boolean r6 = r14.zzT(r15, r8, r2)
            if (r6 == 0) goto L_0x0543
            long r6 = zzD(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.ads.zzgjv.zzE(r8)
            long r9 = r6 + r6
            long r6 = r6 >> r1
            long r6 = r6 ^ r9
            int r1 = com.google.android.gms.internal.ads.zzgjv.zzF(r6)
        L_0x006c:
            int r1 = r1 + r8
            goto L_0x0497
        L_0x006f:
            boolean r1 = r14.zzT(r15, r8, r2)
            if (r1 == 0) goto L_0x0543
            int r1 = zzs(r15, r12)
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.ads.zzgjv.zzE(r6)
            int r7 = r1 + r1
            int r1 = r1 >> 31
            r1 = r1 ^ r7
            int r1 = com.google.android.gms.internal.ads.zzgjv.zzE(r1)
            goto L_0x016d
        L_0x008a:
            boolean r1 = r14.zzT(r15, r8, r2)
            if (r1 == 0) goto L_0x0543
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.ads.zzgjv.zzE(r1)
            goto L_0x01b8
        L_0x0098:
            boolean r1 = r14.zzT(r15, r8, r2)
            if (r1 == 0) goto L_0x0543
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.ads.zzgjv.zzE(r1)
            goto L_0x01a8
        L_0x00a6:
            boolean r1 = r14.zzT(r15, r8, r2)
            if (r1 == 0) goto L_0x0543
            int r1 = zzs(r15, r12)
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.ads.zzgjv.zzE(r6)
            int r1 = com.google.android.gms.internal.ads.zzgjv.zzy(r1)
            goto L_0x016d
        L_0x00bc:
            boolean r1 = r14.zzT(r15, r8, r2)
            if (r1 == 0) goto L_0x0543
            int r1 = zzs(r15, r12)
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.ads.zzgjv.zzE(r6)
            int r1 = com.google.android.gms.internal.ads.zzgjv.zzE(r1)
            goto L_0x016d
        L_0x00d2:
            boolean r1 = r14.zzT(r15, r8, r2)
            if (r1 == 0) goto L_0x0543
            java.lang.Object r1 = r0.getObject(r15, r12)
            com.google.android.gms.internal.ads.zzgjg r1 = (com.google.android.gms.internal.ads.zzgjg) r1
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.ads.zzgjv.zzE(r6)
            int r1 = r1.zzd()
            int r7 = com.google.android.gms.internal.ads.zzgjv.zzE(r1)
            goto L_0x011f
        L_0x00ed:
            boolean r1 = r14.zzT(r15, r8, r2)
            if (r1 == 0) goto L_0x0543
            java.lang.Object r1 = r0.getObject(r15, r12)
            com.google.android.gms.internal.ads.zzgmr r6 = r14.zzF(r2)
            int r1 = com.google.android.gms.internal.ads.zzgmt.zzo(r8, r1, r6)
            goto L_0x0497
        L_0x0101:
            boolean r1 = r14.zzT(r15, r8, r2)
            if (r1 == 0) goto L_0x0543
            java.lang.Object r1 = r0.getObject(r15, r12)
            boolean r6 = r1 instanceof com.google.android.gms.internal.ads.zzgjg
            if (r6 == 0) goto L_0x0123
            com.google.android.gms.internal.ads.zzgjg r1 = (com.google.android.gms.internal.ads.zzgjg) r1
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.ads.zzgjv.zzE(r6)
            int r1 = r1.zzd()
            int r7 = com.google.android.gms.internal.ads.zzgjv.zzE(r1)
        L_0x011f:
            int r7 = r7 + r1
            int r7 = r7 + r6
            goto L_0x0308
        L_0x0123:
            java.lang.String r1 = (java.lang.String) r1
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.ads.zzgjv.zzE(r6)
            int r1 = com.google.android.gms.internal.ads.zzgjv.zzC(r1)
            goto L_0x016d
        L_0x0130:
            boolean r1 = r14.zzT(r15, r8, r2)
            if (r1 == 0) goto L_0x0543
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.ads.zzgjv.zzE(r1)
        L_0x013c:
            int r1 = r1 + r11
            goto L_0x0497
        L_0x013f:
            boolean r1 = r14.zzT(r15, r8, r2)
            if (r1 == 0) goto L_0x0543
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.ads.zzgjv.zzE(r1)
            goto L_0x01a8
        L_0x014c:
            boolean r1 = r14.zzT(r15, r8, r2)
            if (r1 == 0) goto L_0x0543
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.ads.zzgjv.zzE(r1)
            goto L_0x01b8
        L_0x0159:
            boolean r1 = r14.zzT(r15, r8, r2)
            if (r1 == 0) goto L_0x0543
            int r1 = zzs(r15, r12)
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.ads.zzgjv.zzE(r6)
            int r1 = com.google.android.gms.internal.ads.zzgjv.zzy(r1)
        L_0x016d:
            int r1 = r1 + r6
            goto L_0x0497
        L_0x0170:
            boolean r1 = r14.zzT(r15, r8, r2)
            if (r1 == 0) goto L_0x0543
            long r6 = zzD(r15, r12)
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.ads.zzgjv.zzE(r1)
            int r6 = com.google.android.gms.internal.ads.zzgjv.zzF(r6)
            goto L_0x0199
        L_0x0185:
            boolean r1 = r14.zzT(r15, r8, r2)
            if (r1 == 0) goto L_0x0543
            long r6 = zzD(r15, r12)
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.ads.zzgjv.zzE(r1)
            int r6 = com.google.android.gms.internal.ads.zzgjv.zzF(r6)
        L_0x0199:
            int r1 = r1 + r6
            goto L_0x0497
        L_0x019c:
            boolean r1 = r14.zzT(r15, r8, r2)
            if (r1 == 0) goto L_0x0543
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.ads.zzgjv.zzE(r1)
        L_0x01a8:
            int r1 = r1 + 4
            goto L_0x0497
        L_0x01ac:
            boolean r1 = r14.zzT(r15, r8, r2)
            if (r1 == 0) goto L_0x0543
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.ads.zzgjv.zzE(r1)
        L_0x01b8:
            int r1 = r1 + 8
            goto L_0x0497
        L_0x01bc:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.lang.Object r6 = r14.zzH(r2)
            com.google.android.gms.internal.ads.zzglt.zza(r8, r1, r6)
            goto L_0x0543
        L_0x01c9:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.ads.zzgmr r6 = r14.zzF(r2)
            int r1 = com.google.android.gms.internal.ads.zzgmt.zzj(r8, r1, r6)
            goto L_0x0497
        L_0x01d9:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.ads.zzgmt.zzt(r1)
            if (r1 <= 0) goto L_0x0543
            int r6 = com.google.android.gms.internal.ads.zzgjv.zzD(r8)
            int r7 = com.google.android.gms.internal.ads.zzgjv.zzE(r1)
            goto L_0x0306
        L_0x01ef:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.ads.zzgmt.zzr(r1)
            if (r1 <= 0) goto L_0x0543
            int r6 = com.google.android.gms.internal.ads.zzgjv.zzD(r8)
            int r7 = com.google.android.gms.internal.ads.zzgjv.zzE(r1)
            goto L_0x0306
        L_0x0205:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.ads.zzgmt.zzi(r1)
            if (r1 <= 0) goto L_0x0543
            int r6 = com.google.android.gms.internal.ads.zzgjv.zzD(r8)
            int r7 = com.google.android.gms.internal.ads.zzgjv.zzE(r1)
            goto L_0x0306
        L_0x021b:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.ads.zzgmt.zzg(r1)
            if (r1 <= 0) goto L_0x0543
            int r6 = com.google.android.gms.internal.ads.zzgjv.zzD(r8)
            int r7 = com.google.android.gms.internal.ads.zzgjv.zzE(r1)
            goto L_0x0306
        L_0x0231:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.ads.zzgmt.zze(r1)
            if (r1 <= 0) goto L_0x0543
            int r6 = com.google.android.gms.internal.ads.zzgjv.zzD(r8)
            int r7 = com.google.android.gms.internal.ads.zzgjv.zzE(r1)
            goto L_0x0306
        L_0x0247:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.ads.zzgmt.zzw(r1)
            if (r1 <= 0) goto L_0x0543
            int r6 = com.google.android.gms.internal.ads.zzgjv.zzD(r8)
            int r7 = com.google.android.gms.internal.ads.zzgjv.zzE(r1)
            goto L_0x0306
        L_0x025d:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.ads.zzgmt.zzb(r1)
            if (r1 <= 0) goto L_0x0543
            int r6 = com.google.android.gms.internal.ads.zzgjv.zzD(r8)
            int r7 = com.google.android.gms.internal.ads.zzgjv.zzE(r1)
            goto L_0x0306
        L_0x0273:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.ads.zzgmt.zzg(r1)
            if (r1 <= 0) goto L_0x0543
            int r6 = com.google.android.gms.internal.ads.zzgjv.zzD(r8)
            int r7 = com.google.android.gms.internal.ads.zzgjv.zzE(r1)
            goto L_0x0306
        L_0x0289:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.ads.zzgmt.zzi(r1)
            if (r1 <= 0) goto L_0x0543
            int r6 = com.google.android.gms.internal.ads.zzgjv.zzD(r8)
            int r7 = com.google.android.gms.internal.ads.zzgjv.zzE(r1)
            goto L_0x0306
        L_0x029e:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.ads.zzgmt.zzl(r1)
            if (r1 <= 0) goto L_0x0543
            int r6 = com.google.android.gms.internal.ads.zzgjv.zzD(r8)
            int r7 = com.google.android.gms.internal.ads.zzgjv.zzE(r1)
            goto L_0x0306
        L_0x02b3:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.ads.zzgmt.zzy(r1)
            if (r1 <= 0) goto L_0x0543
            int r6 = com.google.android.gms.internal.ads.zzgjv.zzD(r8)
            int r7 = com.google.android.gms.internal.ads.zzgjv.zzE(r1)
            goto L_0x0306
        L_0x02c8:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.ads.zzgmt.zzn(r1)
            if (r1 <= 0) goto L_0x0543
            int r6 = com.google.android.gms.internal.ads.zzgjv.zzD(r8)
            int r7 = com.google.android.gms.internal.ads.zzgjv.zzE(r1)
            goto L_0x0306
        L_0x02dd:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.ads.zzgmt.zzg(r1)
            if (r1 <= 0) goto L_0x0543
            int r6 = com.google.android.gms.internal.ads.zzgjv.zzD(r8)
            int r7 = com.google.android.gms.internal.ads.zzgjv.zzE(r1)
            goto L_0x0306
        L_0x02f2:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.ads.zzgmt.zzi(r1)
            if (r1 <= 0) goto L_0x0543
            int r6 = com.google.android.gms.internal.ads.zzgjv.zzD(r8)
            int r7 = com.google.android.gms.internal.ads.zzgjv.zzE(r1)
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
            int r1 = com.google.android.gms.internal.ads.zzgmt.zzs(r8, r1, r6)
            goto L_0x0497
        L_0x0318:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = com.google.android.gms.internal.ads.zzgmt.zzq(r8, r6, r1)
            goto L_0x0497
        L_0x0325:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = com.google.android.gms.internal.ads.zzgmt.zzh(r8, r6, r1)
            goto L_0x0497
        L_0x0332:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = com.google.android.gms.internal.ads.zzgmt.zzf(r8, r6, r1)
            goto L_0x0497
        L_0x033f:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = com.google.android.gms.internal.ads.zzgmt.zzd(r8, r6, r1)
            goto L_0x0497
        L_0x034c:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = com.google.android.gms.internal.ads.zzgmt.zzv(r8, r6, r1)
            goto L_0x0497
        L_0x0359:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.ads.zzgmt.zzc(r8, r1)
            goto L_0x0497
        L_0x0365:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.ads.zzgmr r6 = r14.zzF(r2)
            int r1 = com.google.android.gms.internal.ads.zzgmt.zzp(r8, r1, r6)
            goto L_0x0497
        L_0x0375:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.ads.zzgmt.zzu(r8, r1)
            goto L_0x0497
        L_0x0381:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            r6 = 0
            int r1 = com.google.android.gms.internal.ads.zzgmt.zza(r8, r1, r6)
            goto L_0x0497
        L_0x038e:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = com.google.android.gms.internal.ads.zzgmt.zzf(r8, r6, r1)
            goto L_0x0497
        L_0x039b:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = com.google.android.gms.internal.ads.zzgmt.zzh(r8, r6, r1)
            goto L_0x0497
        L_0x03a8:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = com.google.android.gms.internal.ads.zzgmt.zzk(r8, r6, r1)
            goto L_0x0497
        L_0x03b5:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = com.google.android.gms.internal.ads.zzgmt.zzx(r8, r6, r1)
            goto L_0x0497
        L_0x03c2:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = com.google.android.gms.internal.ads.zzgmt.zzm(r8, r6, r1)
            goto L_0x0497
        L_0x03cf:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = com.google.android.gms.internal.ads.zzgmt.zzf(r8, r6, r1)
            goto L_0x0497
        L_0x03dc:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = com.google.android.gms.internal.ads.zzgmt.zzh(r8, r6, r1)
            goto L_0x0497
        L_0x03e9:
            r1 = r4 & r7
            if (r1 == 0) goto L_0x0543
            java.lang.Object r1 = r0.getObject(r15, r12)
            com.google.android.gms.internal.ads.zzgly r1 = (com.google.android.gms.internal.ads.zzgly) r1
            com.google.android.gms.internal.ads.zzgmr r6 = r14.zzF(r2)
            int r1 = com.google.android.gms.internal.ads.zzgjv.zzx(r8, r1, r6)
            goto L_0x0497
        L_0x03fd:
            r6 = r7 & r4
            if (r6 == 0) goto L_0x0543
            long r6 = r0.getLong(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.ads.zzgjv.zzE(r8)
            long r9 = r6 + r6
            long r6 = r6 >> r1
            long r6 = r6 ^ r9
            int r1 = com.google.android.gms.internal.ads.zzgjv.zzF(r6)
            goto L_0x006c
        L_0x0415:
            r1 = r4 & r7
            if (r1 == 0) goto L_0x0543
            int r1 = r0.getInt(r15, r12)
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.ads.zzgjv.zzE(r6)
            int r7 = r1 + r1
            int r1 = r1 >> 31
            r1 = r1 ^ r7
            int r1 = com.google.android.gms.internal.ads.zzgjv.zzE(r1)
            goto L_0x016d
        L_0x042e:
            r1 = r4 & r7
            if (r1 == 0) goto L_0x0543
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.ads.zzgjv.zzE(r1)
            goto L_0x01b8
        L_0x043a:
            r1 = r4 & r7
            if (r1 == 0) goto L_0x0543
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.ads.zzgjv.zzE(r1)
            goto L_0x01a8
        L_0x0446:
            r1 = r4 & r7
            if (r1 == 0) goto L_0x0543
            int r1 = r0.getInt(r15, r12)
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.ads.zzgjv.zzE(r6)
            int r1 = com.google.android.gms.internal.ads.zzgjv.zzy(r1)
            goto L_0x016d
        L_0x045a:
            r1 = r4 & r7
            if (r1 == 0) goto L_0x0543
            int r1 = r0.getInt(r15, r12)
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.ads.zzgjv.zzE(r6)
            int r1 = com.google.android.gms.internal.ads.zzgjv.zzE(r1)
            goto L_0x016d
        L_0x046e:
            r1 = r4 & r7
            if (r1 == 0) goto L_0x0543
            java.lang.Object r1 = r0.getObject(r15, r12)
            com.google.android.gms.internal.ads.zzgjg r1 = (com.google.android.gms.internal.ads.zzgjg) r1
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.ads.zzgjv.zzE(r6)
            int r1 = r1.zzd()
            int r7 = com.google.android.gms.internal.ads.zzgjv.zzE(r1)
            goto L_0x04b6
        L_0x0487:
            r1 = r4 & r7
            if (r1 == 0) goto L_0x0543
            java.lang.Object r1 = r0.getObject(r15, r12)
            com.google.android.gms.internal.ads.zzgmr r6 = r14.zzF(r2)
            int r1 = com.google.android.gms.internal.ads.zzgmt.zzo(r8, r1, r6)
        L_0x0497:
            int r3 = r3 + r1
            goto L_0x0543
        L_0x049a:
            r1 = r4 & r7
            if (r1 == 0) goto L_0x0543
            java.lang.Object r1 = r0.getObject(r15, r12)
            boolean r6 = r1 instanceof com.google.android.gms.internal.ads.zzgjg
            if (r6 == 0) goto L_0x04bd
            com.google.android.gms.internal.ads.zzgjg r1 = (com.google.android.gms.internal.ads.zzgjg) r1
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.ads.zzgjv.zzE(r6)
            int r1 = r1.zzd()
            int r7 = com.google.android.gms.internal.ads.zzgjv.zzE(r1)
        L_0x04b6:
            int r1 = p379.C16530d.m42011d(r7, r1, r6, r3)
            r3 = r1
            goto L_0x0543
        L_0x04bd:
            java.lang.String r1 = (java.lang.String) r1
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.ads.zzgjv.zzE(r6)
            int r1 = com.google.android.gms.internal.ads.zzgjv.zzC(r1)
            goto L_0x016d
        L_0x04cb:
            r1 = r4 & r7
            if (r1 == 0) goto L_0x0543
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.ads.zzgjv.zzE(r1)
            goto L_0x013c
        L_0x04d7:
            r1 = r4 & r7
            if (r1 == 0) goto L_0x0543
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.ads.zzgjv.zzE(r1)
            goto L_0x01a8
        L_0x04e3:
            r1 = r4 & r7
            if (r1 == 0) goto L_0x0543
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.ads.zzgjv.zzE(r1)
            goto L_0x01b8
        L_0x04ef:
            r1 = r4 & r7
            if (r1 == 0) goto L_0x0543
            int r1 = r0.getInt(r15, r12)
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.ads.zzgjv.zzE(r6)
            int r1 = com.google.android.gms.internal.ads.zzgjv.zzy(r1)
            goto L_0x016d
        L_0x0503:
            r1 = r4 & r7
            if (r1 == 0) goto L_0x0543
            long r6 = r0.getLong(r15, r12)
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.ads.zzgjv.zzE(r1)
            int r6 = com.google.android.gms.internal.ads.zzgjv.zzF(r6)
            goto L_0x0199
        L_0x0517:
            r1 = r4 & r7
            if (r1 == 0) goto L_0x0543
            long r6 = r0.getLong(r15, r12)
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.ads.zzgjv.zzE(r1)
            int r6 = com.google.android.gms.internal.ads.zzgjv.zzF(r6)
            goto L_0x0199
        L_0x052b:
            r1 = r4 & r7
            if (r1 == 0) goto L_0x0543
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.ads.zzgjv.zzE(r1)
            goto L_0x01a8
        L_0x0537:
            r1 = r4 & r7
            if (r1 == 0) goto L_0x0543
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.ads.zzgjv.zzE(r1)
            goto L_0x01b8
        L_0x0543:
            int r2 = r2 + 3
            r1 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x000b
        L_0x054a:
            com.google.android.gms.internal.ads.zzgni r0 = r14.zzo
            java.lang.Object r1 = r0.zzd(r15)
            int r0 = r0.zza(r1)
            int r3 = r3 + r0
            boolean r0 = r14.zzh
            if (r0 != 0) goto L_0x055a
            return r3
        L_0x055a:
            com.google.android.gms.internal.ads.zzgkb r0 = r14.zzp
            r0.zza(r15)
            r15 = 0
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgmb.zzq(java.lang.Object):int");
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
    private final int zzr(java.lang.Object r12) {
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
            com.google.android.gms.internal.ads.zzgkg r4 = com.google.android.gms.internal.ads.zzgkg.DOUBLE_LIST_PACKED
            int r4 = r4.zza()
            if (r5 < r4) goto L_0x0031
            com.google.android.gms.internal.ads.zzgkg r4 = com.google.android.gms.internal.ads.zzgkg.SINT64_LIST_PACKED
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
            java.lang.Object r4 = com.google.android.gms.internal.ads.zzgns.zzh(r12, r7)
            com.google.android.gms.internal.ads.zzgly r4 = (com.google.android.gms.internal.ads.zzgly) r4
            com.google.android.gms.internal.ads.zzgmr r5 = r11.zzF(r2)
            int r4 = com.google.android.gms.internal.ads.zzgjv.zzx(r6, r4, r5)
            goto L_0x0491
        L_0x004e:
            boolean r5 = r11.zzT(r12, r6, r2)
            if (r5 == 0) goto L_0x054f
            long r7 = zzD(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.ads.zzgjv.zzE(r5)
            long r9 = r7 + r7
            long r6 = r7 >> r4
            long r6 = r6 ^ r9
            int r4 = com.google.android.gms.internal.ads.zzgjv.zzF(r6)
            goto L_0x0501
        L_0x0069:
            boolean r4 = r11.zzT(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = zzs(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.ads.zzgjv.zzE(r5)
            int r6 = r4 + r4
            int r4 = r4 >> 31
            r4 = r4 ^ r6
            int r4 = com.google.android.gms.internal.ads.zzgjv.zzE(r4)
            goto L_0x0501
        L_0x0084:
            boolean r4 = r11.zzT(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.zzgjv.zzE(r4)
            goto L_0x054b
        L_0x0092:
            boolean r4 = r11.zzT(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.zzgjv.zzE(r4)
            goto L_0x053b
        L_0x00a0:
            boolean r4 = r11.zzT(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = zzs(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.ads.zzgjv.zzE(r5)
            int r4 = com.google.android.gms.internal.ads.zzgjv.zzy(r4)
            goto L_0x0501
        L_0x00b6:
            boolean r4 = r11.zzT(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = zzs(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.ads.zzgjv.zzE(r5)
            int r4 = com.google.android.gms.internal.ads.zzgjv.zzE(r4)
            goto L_0x0501
        L_0x00cc:
            boolean r4 = r11.zzT(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            java.lang.Object r4 = com.google.android.gms.internal.ads.zzgns.zzh(r12, r7)
            com.google.android.gms.internal.ads.zzgjg r4 = (com.google.android.gms.internal.ads.zzgjg) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.ads.zzgjv.zzE(r5)
            int r4 = r4.zzd()
            int r6 = com.google.android.gms.internal.ads.zzgjv.zzE(r4)
            goto L_0x04b2
        L_0x00e8:
            boolean r4 = r11.zzT(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            java.lang.Object r4 = com.google.android.gms.internal.ads.zzgns.zzh(r12, r7)
            com.google.android.gms.internal.ads.zzgmr r5 = r11.zzF(r2)
            int r4 = com.google.android.gms.internal.ads.zzgmt.zzo(r6, r4, r5)
            goto L_0x0491
        L_0x00fc:
            boolean r4 = r11.zzT(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            java.lang.Object r4 = com.google.android.gms.internal.ads.zzgns.zzh(r12, r7)
            boolean r5 = r4 instanceof com.google.android.gms.internal.ads.zzgjg
            if (r5 == 0) goto L_0x011c
            com.google.android.gms.internal.ads.zzgjg r4 = (com.google.android.gms.internal.ads.zzgjg) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.ads.zzgjv.zzE(r5)
            int r4 = r4.zzd()
            int r6 = com.google.android.gms.internal.ads.zzgjv.zzE(r4)
            goto L_0x04b2
        L_0x011c:
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.ads.zzgjv.zzE(r5)
            int r4 = com.google.android.gms.internal.ads.zzgjv.zzC(r4)
            goto L_0x0501
        L_0x012a:
            boolean r4 = r11.zzT(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.zzgjv.zzE(r4)
            goto L_0x04d0
        L_0x0138:
            boolean r4 = r11.zzT(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.zzgjv.zzE(r4)
            goto L_0x053b
        L_0x0146:
            boolean r4 = r11.zzT(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.zzgjv.zzE(r4)
            goto L_0x054b
        L_0x0154:
            boolean r4 = r11.zzT(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = zzs(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.ads.zzgjv.zzE(r5)
            int r4 = com.google.android.gms.internal.ads.zzgjv.zzy(r4)
            goto L_0x0501
        L_0x016a:
            boolean r4 = r11.zzT(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            long r4 = zzD(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.ads.zzgjv.zzE(r6)
            int r4 = com.google.android.gms.internal.ads.zzgjv.zzF(r4)
            goto L_0x052c
        L_0x0180:
            boolean r4 = r11.zzT(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            long r4 = zzD(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.ads.zzgjv.zzE(r6)
            int r4 = com.google.android.gms.internal.ads.zzgjv.zzF(r4)
            goto L_0x052c
        L_0x0196:
            boolean r4 = r11.zzT(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.zzgjv.zzE(r4)
            goto L_0x053b
        L_0x01a4:
            boolean r4 = r11.zzT(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.zzgjv.zzE(r4)
            goto L_0x054b
        L_0x01b2:
            java.lang.Object r4 = com.google.android.gms.internal.ads.zzgns.zzh(r12, r7)
            java.lang.Object r5 = r11.zzH(r2)
            com.google.android.gms.internal.ads.zzglt.zza(r6, r4, r5)
            goto L_0x054f
        L_0x01bf:
            java.lang.Object r4 = com.google.android.gms.internal.ads.zzgns.zzh(r12, r7)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.zzgmr r5 = r11.zzF(r2)
            int r4 = com.google.android.gms.internal.ads.zzgmt.zzj(r6, r4, r5)
            goto L_0x0491
        L_0x01cf:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.zzgmt.zzt(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.ads.zzgjv.zzD(r6)
            int r6 = com.google.android.gms.internal.ads.zzgjv.zzE(r4)
            goto L_0x02fc
        L_0x01e5:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.zzgmt.zzr(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.ads.zzgjv.zzD(r6)
            int r6 = com.google.android.gms.internal.ads.zzgjv.zzE(r4)
            goto L_0x02fc
        L_0x01fb:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.zzgmt.zzi(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.ads.zzgjv.zzD(r6)
            int r6 = com.google.android.gms.internal.ads.zzgjv.zzE(r4)
            goto L_0x02fc
        L_0x0211:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.zzgmt.zzg(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.ads.zzgjv.zzD(r6)
            int r6 = com.google.android.gms.internal.ads.zzgjv.zzE(r4)
            goto L_0x02fc
        L_0x0227:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.zzgmt.zze(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.ads.zzgjv.zzD(r6)
            int r6 = com.google.android.gms.internal.ads.zzgjv.zzE(r4)
            goto L_0x02fc
        L_0x023d:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.zzgmt.zzw(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.ads.zzgjv.zzD(r6)
            int r6 = com.google.android.gms.internal.ads.zzgjv.zzE(r4)
            goto L_0x02fc
        L_0x0253:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.zzgmt.zzb(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.ads.zzgjv.zzD(r6)
            int r6 = com.google.android.gms.internal.ads.zzgjv.zzE(r4)
            goto L_0x02fc
        L_0x0269:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.zzgmt.zzg(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.ads.zzgjv.zzD(r6)
            int r6 = com.google.android.gms.internal.ads.zzgjv.zzE(r4)
            goto L_0x02fc
        L_0x027f:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.zzgmt.zzi(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.ads.zzgjv.zzD(r6)
            int r6 = com.google.android.gms.internal.ads.zzgjv.zzE(r4)
            goto L_0x02fc
        L_0x0294:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.zzgmt.zzl(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.ads.zzgjv.zzD(r6)
            int r6 = com.google.android.gms.internal.ads.zzgjv.zzE(r4)
            goto L_0x02fc
        L_0x02a9:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.zzgmt.zzy(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.ads.zzgjv.zzD(r6)
            int r6 = com.google.android.gms.internal.ads.zzgjv.zzE(r4)
            goto L_0x02fc
        L_0x02be:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.zzgmt.zzn(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.ads.zzgjv.zzD(r6)
            int r6 = com.google.android.gms.internal.ads.zzgjv.zzE(r4)
            goto L_0x02fc
        L_0x02d3:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.zzgmt.zzg(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.ads.zzgjv.zzD(r6)
            int r6 = com.google.android.gms.internal.ads.zzgjv.zzE(r4)
            goto L_0x02fc
        L_0x02e8:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.zzgmt.zzi(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.ads.zzgjv.zzD(r6)
            int r6 = com.google.android.gms.internal.ads.zzgjv.zzE(r4)
        L_0x02fc:
            int r6 = r6 + r5
            int r6 = r6 + r4
            goto L_0x04b4
        L_0x0300:
            java.lang.Object r4 = com.google.android.gms.internal.ads.zzgns.zzh(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.zzgmt.zzs(r6, r4, r1)
            goto L_0x0491
        L_0x030c:
            java.lang.Object r4 = com.google.android.gms.internal.ads.zzgns.zzh(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.zzgmt.zzq(r6, r4, r1)
            goto L_0x0491
        L_0x0318:
            java.lang.Object r4 = com.google.android.gms.internal.ads.zzgns.zzh(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.zzgmt.zzh(r6, r4, r1)
            goto L_0x0491
        L_0x0324:
            java.lang.Object r4 = com.google.android.gms.internal.ads.zzgns.zzh(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.zzgmt.zzf(r6, r4, r1)
            goto L_0x0491
        L_0x0330:
            java.lang.Object r4 = com.google.android.gms.internal.ads.zzgns.zzh(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.zzgmt.zzd(r6, r4, r1)
            goto L_0x0491
        L_0x033c:
            java.lang.Object r4 = com.google.android.gms.internal.ads.zzgns.zzh(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.zzgmt.zzv(r6, r4, r1)
            goto L_0x0491
        L_0x0348:
            java.lang.Object r4 = com.google.android.gms.internal.ads.zzgns.zzh(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.zzgmt.zzc(r6, r4)
            goto L_0x0491
        L_0x0354:
            java.lang.Object r4 = com.google.android.gms.internal.ads.zzgns.zzh(r12, r7)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.zzgmr r5 = r11.zzF(r2)
            int r4 = com.google.android.gms.internal.ads.zzgmt.zzp(r6, r4, r5)
            goto L_0x0491
        L_0x0364:
            java.lang.Object r4 = com.google.android.gms.internal.ads.zzgns.zzh(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.zzgmt.zzu(r6, r4)
            goto L_0x0491
        L_0x0370:
            java.lang.Object r4 = com.google.android.gms.internal.ads.zzgns.zzh(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.zzgmt.zza(r6, r4, r1)
            goto L_0x0491
        L_0x037c:
            java.lang.Object r4 = com.google.android.gms.internal.ads.zzgns.zzh(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.zzgmt.zzf(r6, r4, r1)
            goto L_0x0491
        L_0x0388:
            java.lang.Object r4 = com.google.android.gms.internal.ads.zzgns.zzh(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.zzgmt.zzh(r6, r4, r1)
            goto L_0x0491
        L_0x0394:
            java.lang.Object r4 = com.google.android.gms.internal.ads.zzgns.zzh(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.zzgmt.zzk(r6, r4, r1)
            goto L_0x0491
        L_0x03a0:
            java.lang.Object r4 = com.google.android.gms.internal.ads.zzgns.zzh(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.zzgmt.zzx(r6, r4, r1)
            goto L_0x0491
        L_0x03ac:
            java.lang.Object r4 = com.google.android.gms.internal.ads.zzgns.zzh(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.zzgmt.zzm(r6, r4, r1)
            goto L_0x0491
        L_0x03b8:
            java.lang.Object r4 = com.google.android.gms.internal.ads.zzgns.zzh(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.zzgmt.zzf(r6, r4, r1)
            goto L_0x0491
        L_0x03c4:
            java.lang.Object r4 = com.google.android.gms.internal.ads.zzgns.zzh(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.zzgmt.zzh(r6, r4, r1)
            goto L_0x0491
        L_0x03d0:
            boolean r4 = r11.zzQ(r12, r2)
            if (r4 == 0) goto L_0x054f
            java.lang.Object r4 = com.google.android.gms.internal.ads.zzgns.zzh(r12, r7)
            com.google.android.gms.internal.ads.zzgly r4 = (com.google.android.gms.internal.ads.zzgly) r4
            com.google.android.gms.internal.ads.zzgmr r5 = r11.zzF(r2)
            int r4 = com.google.android.gms.internal.ads.zzgjv.zzx(r6, r4, r5)
            goto L_0x0491
        L_0x03e6:
            boolean r5 = r11.zzQ(r12, r2)
            if (r5 == 0) goto L_0x054f
            long r7 = com.google.android.gms.internal.ads.zzgns.zzf(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.ads.zzgjv.zzE(r5)
            long r9 = r7 + r7
            long r6 = r7 >> r4
            long r6 = r6 ^ r9
            int r4 = com.google.android.gms.internal.ads.zzgjv.zzF(r6)
            goto L_0x0501
        L_0x0401:
            boolean r4 = r11.zzQ(r12, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = com.google.android.gms.internal.ads.zzgns.zzd(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.ads.zzgjv.zzE(r5)
            int r6 = r4 + r4
            int r4 = r4 >> 31
            r4 = r4 ^ r6
            int r4 = com.google.android.gms.internal.ads.zzgjv.zzE(r4)
            goto L_0x0501
        L_0x041c:
            boolean r4 = r11.zzQ(r12, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.zzgjv.zzE(r4)
            goto L_0x054b
        L_0x042a:
            boolean r4 = r11.zzQ(r12, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.zzgjv.zzE(r4)
            goto L_0x053b
        L_0x0438:
            boolean r4 = r11.zzQ(r12, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = com.google.android.gms.internal.ads.zzgns.zzd(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.ads.zzgjv.zzE(r5)
            int r4 = com.google.android.gms.internal.ads.zzgjv.zzy(r4)
            goto L_0x0501
        L_0x044e:
            boolean r4 = r11.zzQ(r12, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = com.google.android.gms.internal.ads.zzgns.zzd(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.ads.zzgjv.zzE(r5)
            int r4 = com.google.android.gms.internal.ads.zzgjv.zzE(r4)
            goto L_0x0501
        L_0x0464:
            boolean r4 = r11.zzQ(r12, r2)
            if (r4 == 0) goto L_0x054f
            java.lang.Object r4 = com.google.android.gms.internal.ads.zzgns.zzh(r12, r7)
            com.google.android.gms.internal.ads.zzgjg r4 = (com.google.android.gms.internal.ads.zzgjg) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.ads.zzgjv.zzE(r5)
            int r4 = r4.zzd()
            int r6 = com.google.android.gms.internal.ads.zzgjv.zzE(r4)
            goto L_0x04b2
        L_0x047f:
            boolean r4 = r11.zzQ(r12, r2)
            if (r4 == 0) goto L_0x054f
            java.lang.Object r4 = com.google.android.gms.internal.ads.zzgns.zzh(r12, r7)
            com.google.android.gms.internal.ads.zzgmr r5 = r11.zzF(r2)
            int r4 = com.google.android.gms.internal.ads.zzgmt.zzo(r6, r4, r5)
        L_0x0491:
            int r3 = r3 + r4
            goto L_0x054f
        L_0x0494:
            boolean r4 = r11.zzQ(r12, r2)
            if (r4 == 0) goto L_0x054f
            java.lang.Object r4 = com.google.android.gms.internal.ads.zzgns.zzh(r12, r7)
            boolean r5 = r4 instanceof com.google.android.gms.internal.ads.zzgjg
            if (r5 == 0) goto L_0x04b7
            com.google.android.gms.internal.ads.zzgjg r4 = (com.google.android.gms.internal.ads.zzgjg) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.ads.zzgjv.zzE(r5)
            int r4 = r4.zzd()
            int r6 = com.google.android.gms.internal.ads.zzgjv.zzE(r4)
        L_0x04b2:
            int r6 = r6 + r4
            int r6 = r6 + r5
        L_0x04b4:
            int r3 = r3 + r6
            goto L_0x054f
        L_0x04b7:
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.ads.zzgjv.zzE(r5)
            int r4 = com.google.android.gms.internal.ads.zzgjv.zzC(r4)
            goto L_0x0501
        L_0x04c4:
            boolean r4 = r11.zzQ(r12, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.zzgjv.zzE(r4)
        L_0x04d0:
            int r4 = r4 + 1
            goto L_0x0491
        L_0x04d3:
            boolean r4 = r11.zzQ(r12, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.zzgjv.zzE(r4)
            goto L_0x053b
        L_0x04e0:
            boolean r4 = r11.zzQ(r12, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.zzgjv.zzE(r4)
            goto L_0x054b
        L_0x04ed:
            boolean r4 = r11.zzQ(r12, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = com.google.android.gms.internal.ads.zzgns.zzd(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.ads.zzgjv.zzE(r5)
            int r4 = com.google.android.gms.internal.ads.zzgjv.zzy(r4)
        L_0x0501:
            int r4 = r4 + r5
            goto L_0x0491
        L_0x0503:
            boolean r4 = r11.zzQ(r12, r2)
            if (r4 == 0) goto L_0x054f
            long r4 = com.google.android.gms.internal.ads.zzgns.zzf(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.ads.zzgjv.zzE(r6)
            int r4 = com.google.android.gms.internal.ads.zzgjv.zzF(r4)
            goto L_0x052c
        L_0x0518:
            boolean r4 = r11.zzQ(r12, r2)
            if (r4 == 0) goto L_0x054f
            long r4 = com.google.android.gms.internal.ads.zzgns.zzf(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.ads.zzgjv.zzE(r6)
            int r4 = com.google.android.gms.internal.ads.zzgjv.zzF(r4)
        L_0x052c:
            int r4 = r4 + r6
            goto L_0x0491
        L_0x052f:
            boolean r4 = r11.zzQ(r12, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.zzgjv.zzE(r4)
        L_0x053b:
            int r4 = r4 + 4
            goto L_0x0491
        L_0x053f:
            boolean r4 = r11.zzQ(r12, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.zzgjv.zzE(r4)
        L_0x054b:
            int r4 = r4 + 8
            goto L_0x0491
        L_0x054f:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x0553:
            com.google.android.gms.internal.ads.zzgni r0 = r11.zzo
            java.lang.Object r12 = r0.zzd(r12)
            int r12 = r0.zza(r12)
            int r3 = r3 + r12
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgmb.zzr(java.lang.Object):int");
    }

    private static int zzs(Object obj, long j) {
        return ((Integer) zzgns.zzh(obj, j)).intValue();
    }

    private final int zzt(Object obj, byte[] bArr, int i, int i2, int i3, long j, zzgis zzgis) throws IOException {
        Unsafe unsafe = zzb;
        Object zzH = zzH(i3);
        Object object = unsafe.getObject(obj, j);
        if (zzglt.zzb(object)) {
            zzgls zzb2 = zzgls.zza().zzb();
            zzglt.zzc(zzb2, object);
            unsafe.putObject(obj, j, zzb2);
        }
        zzglr zzglr = (zzglr) zzH;
        throw null;
    }

    private final int zzu(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, zzgis zzgis) throws IOException {
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
        zzgis zzgis2 = zzgis;
        Unsafe unsafe = zzb;
        long j3 = (long) (this.zzc[i14 + 2] & 1048575);
        switch (i7) {
            case 51:
                if (i13 == 1) {
                    unsafe.putObject(obj4, j2, Double.valueOf(Double.longBitsToDouble(zzgit.zzn(bArr, i))));
                    unsafe.putInt(obj4, j3, i12);
                    return i9 + 8;
                }
                break;
            case 52:
                if (i13 == 5) {
                    unsafe.putObject(obj4, j2, Float.valueOf(Float.intBitsToFloat(zzgit.zzb(bArr, i))));
                    unsafe.putInt(obj4, j3, i12);
                    return i9 + 4;
                }
                break;
            case 53:
            case 54:
                if (i13 == 0) {
                    int zzm2 = zzgit.zzm(bArr2, i9, zzgis2);
                    unsafe.putObject(obj4, j2, Long.valueOf(zzgis2.zzb));
                    unsafe.putInt(obj4, j3, i12);
                    return zzm2;
                }
                break;
            case 55:
            case 62:
                if (i13 == 0) {
                    int zzj2 = zzgit.zzj(bArr2, i9, zzgis2);
                    unsafe.putObject(obj4, j2, Integer.valueOf(zzgis2.zza));
                    unsafe.putInt(obj4, j3, i12);
                    return zzj2;
                }
                break;
            case 56:
            case 65:
                if (i13 == 1) {
                    unsafe.putObject(obj4, j2, Long.valueOf(zzgit.zzn(bArr, i)));
                    unsafe.putInt(obj4, j3, i12);
                    return i9 + 8;
                }
                break;
            case 57:
            case 64:
                if (i13 == 5) {
                    unsafe.putObject(obj4, j2, Integer.valueOf(zzgit.zzb(bArr, i)));
                    unsafe.putInt(obj4, j3, i12);
                    return i9 + 4;
                }
                break;
            case 58:
                if (i13 == 0) {
                    int zzm3 = zzgit.zzm(bArr2, i9, zzgis2);
                    if (zzgis2.zzb != 0) {
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
                    int zzj3 = zzgit.zzj(bArr2, i9, zzgis2);
                    int i15 = zzgis2.zza;
                    if (i15 == 0) {
                        unsafe.putObject(obj4, j2, "");
                    } else if ((i6 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) == 0 || zzgnx.zzj(bArr2, zzj3, zzj3 + i15)) {
                        unsafe.putObject(obj4, j2, new String(bArr2, zzj3, i15, zzgky.zzb));
                        zzj3 += i15;
                    } else {
                        throw zzgla.zzd();
                    }
                    unsafe.putInt(obj4, j3, i12);
                    return zzj3;
                }
                break;
            case 60:
                if (i13 == 2) {
                    int zzd2 = zzgit.zzd(zzF(i14), bArr2, i9, i2, zzgis2);
                    if (unsafe.getInt(obj4, j3) == i12) {
                        obj2 = unsafe.getObject(obj4, j2);
                    } else {
                        obj2 = null;
                    }
                    if (obj2 == null) {
                        unsafe.putObject(obj4, j2, zzgis2.zzc);
                    } else {
                        unsafe.putObject(obj4, j2, zzgky.zzg(obj2, zzgis2.zzc));
                    }
                    unsafe.putInt(obj4, j3, i12);
                    return zzd2;
                }
                break;
            case 61:
                if (i13 == 2) {
                    int zza2 = zzgit.zza(bArr2, i9, zzgis2);
                    unsafe.putObject(obj4, j2, zzgis2.zzc);
                    unsafe.putInt(obj4, j3, i12);
                    return zza2;
                }
                break;
            case 63:
                if (i13 == 0) {
                    int zzj4 = zzgit.zzj(bArr2, i9, zzgis2);
                    int i16 = zzgis2.zza;
                    zzgks zzE = zzE(i14);
                    if (zzE == null || zzE.zza(i16)) {
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
                    int zzj5 = zzgit.zzj(bArr2, i9, zzgis2);
                    unsafe.putObject(obj4, j2, Integer.valueOf(zzgjo.zzF(zzgis2.zza)));
                    unsafe.putInt(obj4, j3, i12);
                    return zzj5;
                }
                break;
            case 67:
                if (i13 == 0) {
                    int zzm4 = zzgit.zzm(bArr2, i9, zzgis2);
                    unsafe.putObject(obj4, j2, Long.valueOf(zzgjo.zzG(zzgis2.zzb)));
                    unsafe.putInt(obj4, j3, i12);
                    return zzm4;
                }
                break;
            case 68:
                if (i13 == 3) {
                    int zzc2 = zzgit.zzc(zzF(i14), bArr, i, i2, (i11 & -8) | 4, zzgis);
                    if (unsafe.getInt(obj4, j3) == i12) {
                        obj3 = unsafe.getObject(obj4, j2);
                    } else {
                        obj3 = null;
                    }
                    if (obj3 == null) {
                        unsafe.putObject(obj4, j2, zzgis2.zzc);
                    } else {
                        unsafe.putObject(obj4, j2, zzgky.zzg(obj3, zzgis2.zzc));
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
    private final int zzv(java.lang.Object r31, byte[] r32, int r33, int r34, com.google.android.gms.internal.ads.zzgis r35) throws java.io.IOException {
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
            int r0 = com.google.android.gms.internal.ads.zzgit.zzk(r0, r12, r3, r11)
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
            r19 = -1
            r23 = 0
            goto L_0x0354
        L_0x004e:
            int[] r0 = r15.zzc
            int r1 = r2 + 1
            r1 = r0[r1]
            int r10 = zzB(r1)
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
            int r10 = com.google.android.gms.internal.ads.zzgit.zzm(r12, r4, r11)
            long r0 = r11.zzb
            long r21 = com.google.android.gms.internal.ads.zzgjo.zzG(r0)
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
            int r0 = com.google.android.gms.internal.ads.zzgit.zzj(r12, r4, r11)
            int r1 = r11.zza
            int r1 = com.google.android.gms.internal.ads.zzgjo.zzF(r1)
            r7.putInt(r14, r8, r1)
            goto L_0x0237
        L_0x00f0:
            r19 = r7
            r10 = r20
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            r7 = r2
            if (r3 != 0) goto L_0x01c5
            int r0 = com.google.android.gms.internal.ads.zzgit.zzj(r12, r4, r11)
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
            int r0 = com.google.android.gms.internal.ads.zzgit.zza(r12, r4, r11)
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
            com.google.android.gms.internal.ads.zzgmr r0 = r15.zzF(r10)
            int r0 = com.google.android.gms.internal.ads.zzgit.zzd(r0, r12, r4, r13, r11)
            java.lang.Object r1 = r7.getObject(r14, r8)
            if (r1 != 0) goto L_0x0141
            java.lang.Object r1 = r11.zzc
            r7.putObject(r14, r8, r1)
            goto L_0x0237
        L_0x0141:
            java.lang.Object r2 = r11.zzc
            java.lang.Object r1 = com.google.android.gms.internal.ads.zzgky.zzg(r1, r2)
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
            int r0 = com.google.android.gms.internal.ads.zzgit.zzg(r12, r4, r11)
            goto L_0x0168
        L_0x0164:
            int r0 = com.google.android.gms.internal.ads.zzgit.zzh(r12, r4, r11)
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
            int r0 = com.google.android.gms.internal.ads.zzgit.zzm(r12, r4, r11)
            long r1 = r11.zzb
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0189
            r1 = 1
            goto L_0x018a
        L_0x0189:
            r1 = 0
        L_0x018a:
            com.google.android.gms.internal.ads.zzgns.zzp(r14, r8, r1)
            goto L_0x0237
        L_0x018f:
            r19 = r7
            r10 = r20
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            r7 = r2
            if (r3 != r0) goto L_0x01c5
            int r0 = com.google.android.gms.internal.ads.zzgit.zzb(r12, r4)
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
            long r21 = com.google.android.gms.internal.ads.zzgit.zzn(r12, r4)
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
            int r0 = com.google.android.gms.internal.ads.zzgit.zzj(r12, r5, r11)
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
            int r17 = com.google.android.gms.internal.ads.zzgit.zzm(r12, r5, r11)
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
            int r0 = com.google.android.gms.internal.ads.zzgit.zzb(r12, r5)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            com.google.android.gms.internal.ads.zzgns.zzs(r14, r8, r0)
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
            long r0 = com.google.android.gms.internal.ads.zzgit.zzn(r12, r5)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            com.google.android.gms.internal.ads.zzgns.zzr(r14, r8, r0)
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
            com.google.android.gms.internal.ads.zzgkx r0 = (com.google.android.gms.internal.ads.zzgkx) r0
            boolean r1 = r0.zzc()
            if (r1 != 0) goto L_0x027d
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0275
            r1 = 10
            goto L_0x0276
        L_0x0275:
            int r1 = r1 + r1
        L_0x0276:
            com.google.android.gms.internal.ads.zzgkx r0 = r0.zzd(r1)
            r7.putObject(r14, r8, r0)
        L_0x027d:
            r8 = r0
            com.google.android.gms.internal.ads.zzgmr r0 = r15.zzF(r4)
            r1 = r17
            r2 = r32
            r3 = r5
            r23 = r4
            r4 = r34
            r5 = r8
            r8 = r6
            r6 = r35
            int r0 = com.google.android.gms.internal.ads.zzgit.zze(r0, r1, r2, r3, r4, r5, r6)
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
            int r0 = r0.zzw(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
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
            int r0 = r0.zzt(r1, r2, r3, r4, r5, r6, r8)
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
            int r0 = r0.zzu(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x02fd
            goto L_0x02e9
        L_0x0354:
            com.google.android.gms.internal.ads.zzgnj r4 = zzd(r31)
            r0 = r17
            r1 = r32
            r3 = r34
            r5 = r35
            int r0 = com.google.android.gms.internal.ads.zzgit.zzi(r0, r1, r2, r3, r4, r5)
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
            com.google.android.gms.internal.ads.zzgla r0 = com.google.android.gms.internal.ads.zzgla.zzg()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgmb.zzv(java.lang.Object, byte[], int, int, com.google.android.gms.internal.ads.zzgis):int");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x044f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01cf  */
    private final int zzw(java.lang.Object r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.gms.internal.ads.zzgis r29) throws java.io.IOException {
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
            com.google.android.gms.internal.ads.zzgkx r12 = (com.google.android.gms.internal.ads.zzgkx) r12
            boolean r13 = r12.zzc()
            if (r13 != 0) goto L_0x0032
            int r13 = r12.size()
            if (r13 != 0) goto L_0x002a
            r13 = 10
            goto L_0x002b
        L_0x002a:
            int r13 = r13 + r13
        L_0x002b:
            com.google.android.gms.internal.ads.zzgkx r12 = r12.zzd(r13)
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
            com.google.android.gms.internal.ads.zzgmr r1 = r15.zzF(r8)
            r6 = r2 & -8
            r6 = r6 | 4
            r21 = r1
            r22 = r17
            r23 = r18
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = com.google.android.gms.internal.ads.zzgit.zzc(r21, r22, r23, r24, r25, r26)
            java.lang.Object r8 = r7.zzc
            r12.add(r8)
            goto L_0x042d
        L_0x005c:
            if (r6 != r14) goto L_0x0080
            com.google.android.gms.internal.ads.zzgln r12 = (com.google.android.gms.internal.ads.zzgln) r12
            int r1 = com.google.android.gms.internal.ads.zzgit.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x0067:
            if (r1 >= r2) goto L_0x0077
            int r1 = com.google.android.gms.internal.ads.zzgit.zzm(r3, r1, r7)
            long r4 = r7.zzb
            long r4 = com.google.android.gms.internal.ads.zzgjo.zzG(r4)
            r12.zzg(r4)
            goto L_0x0067
        L_0x0077:
            if (r1 != r2) goto L_0x007b
            goto L_0x0450
        L_0x007b:
            com.google.android.gms.internal.ads.zzgla r1 = com.google.android.gms.internal.ads.zzgla.zzj()
            throw r1
        L_0x0080:
            if (r6 != 0) goto L_0x044f
            com.google.android.gms.internal.ads.zzgln r12 = (com.google.android.gms.internal.ads.zzgln) r12
            int r1 = com.google.android.gms.internal.ads.zzgit.zzm(r3, r4, r7)
            long r8 = r7.zzb
            long r8 = com.google.android.gms.internal.ads.zzgjo.zzG(r8)
            r12.zzg(r8)
        L_0x0091:
            if (r1 >= r5) goto L_0x00aa
            int r4 = com.google.android.gms.internal.ads.zzgit.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x009c
            goto L_0x00aa
        L_0x009c:
            int r1 = com.google.android.gms.internal.ads.zzgit.zzm(r3, r4, r7)
            long r8 = r7.zzb
            long r8 = com.google.android.gms.internal.ads.zzgjo.zzG(r8)
            r12.zzg(r8)
            goto L_0x0091
        L_0x00aa:
            return r1
        L_0x00ab:
            if (r6 != r14) goto L_0x00cf
            com.google.android.gms.internal.ads.zzgkp r12 = (com.google.android.gms.internal.ads.zzgkp) r12
            int r1 = com.google.android.gms.internal.ads.zzgit.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x00b6:
            if (r1 >= r2) goto L_0x00c6
            int r1 = com.google.android.gms.internal.ads.zzgit.zzj(r3, r1, r7)
            int r4 = r7.zza
            int r4 = com.google.android.gms.internal.ads.zzgjo.zzF(r4)
            r12.zzh(r4)
            goto L_0x00b6
        L_0x00c6:
            if (r1 != r2) goto L_0x00ca
            goto L_0x0450
        L_0x00ca:
            com.google.android.gms.internal.ads.zzgla r1 = com.google.android.gms.internal.ads.zzgla.zzj()
            throw r1
        L_0x00cf:
            if (r6 != 0) goto L_0x044f
            com.google.android.gms.internal.ads.zzgkp r12 = (com.google.android.gms.internal.ads.zzgkp) r12
            int r1 = com.google.android.gms.internal.ads.zzgit.zzj(r3, r4, r7)
            int r4 = r7.zza
            int r4 = com.google.android.gms.internal.ads.zzgjo.zzF(r4)
            r12.zzh(r4)
        L_0x00e0:
            if (r1 >= r5) goto L_0x00f9
            int r4 = com.google.android.gms.internal.ads.zzgit.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x00eb
            goto L_0x00f9
        L_0x00eb:
            int r1 = com.google.android.gms.internal.ads.zzgit.zzj(r3, r4, r7)
            int r4 = r7.zza
            int r4 = com.google.android.gms.internal.ads.zzgjo.zzF(r4)
            r12.zzh(r4)
            goto L_0x00e0
        L_0x00f9:
            return r1
        L_0x00fa:
            if (r6 != r14) goto L_0x0101
            int r2 = com.google.android.gms.internal.ads.zzgit.zzf(r3, r4, r12, r7)
            goto L_0x0112
        L_0x0101:
            if (r6 != 0) goto L_0x044f
            r2 = r20
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r12
            r7 = r29
            int r2 = com.google.android.gms.internal.ads.zzgit.zzl(r2, r3, r4, r5, r6, r7)
        L_0x0112:
            com.google.android.gms.internal.ads.zzgko r1 = (com.google.android.gms.internal.ads.zzgko) r1
            com.google.android.gms.internal.ads.zzgnj r3 = r1.zzc
            com.google.android.gms.internal.ads.zzgnj r4 = com.google.android.gms.internal.ads.zzgnj.zzc()
            if (r3 != r4) goto L_0x011d
            r3 = 0
        L_0x011d:
            com.google.android.gms.internal.ads.zzgks r4 = r15.zzE(r8)
            com.google.android.gms.internal.ads.zzgni r5 = r0.zzo
            r6 = r21
            java.lang.Object r3 = com.google.android.gms.internal.ads.zzgmt.zzC(r6, r12, r4, r3, r5)
            if (r3 != 0) goto L_0x012d
            goto L_0x027b
        L_0x012d:
            com.google.android.gms.internal.ads.zzgnj r3 = (com.google.android.gms.internal.ads.zzgnj) r3
            r1.zzc = r3
            return r2
        L_0x0132:
            if (r6 != r14) goto L_0x044f
            int r1 = com.google.android.gms.internal.ads.zzgit.zzj(r3, r4, r7)
            int r4 = r7.zza
            if (r4 < 0) goto L_0x0187
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0182
            if (r4 != 0) goto L_0x0148
            com.google.android.gms.internal.ads.zzgjg r4 = com.google.android.gms.internal.ads.zzgjg.zzb
            r12.add(r4)
            goto L_0x0150
        L_0x0148:
            com.google.android.gms.internal.ads.zzgjg r6 = com.google.android.gms.internal.ads.zzgjg.zzw(r3, r1, r4)
            r12.add(r6)
        L_0x014f:
            int r1 = r1 + r4
        L_0x0150:
            if (r1 >= r5) goto L_0x0181
            int r4 = com.google.android.gms.internal.ads.zzgit.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x015b
            goto L_0x0181
        L_0x015b:
            int r1 = com.google.android.gms.internal.ads.zzgit.zzj(r3, r4, r7)
            int r4 = r7.zza
            if (r4 < 0) goto L_0x017c
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0177
            if (r4 != 0) goto L_0x016f
            com.google.android.gms.internal.ads.zzgjg r4 = com.google.android.gms.internal.ads.zzgjg.zzb
            r12.add(r4)
            goto L_0x0150
        L_0x016f:
            com.google.android.gms.internal.ads.zzgjg r6 = com.google.android.gms.internal.ads.zzgjg.zzw(r3, r1, r4)
            r12.add(r6)
            goto L_0x014f
        L_0x0177:
            com.google.android.gms.internal.ads.zzgla r1 = com.google.android.gms.internal.ads.zzgla.zzj()
            throw r1
        L_0x017c:
            com.google.android.gms.internal.ads.zzgla r1 = com.google.android.gms.internal.ads.zzgla.zzf()
            throw r1
        L_0x0181:
            return r1
        L_0x0182:
            com.google.android.gms.internal.ads.zzgla r1 = com.google.android.gms.internal.ads.zzgla.zzj()
            throw r1
        L_0x0187:
            com.google.android.gms.internal.ads.zzgla r1 = com.google.android.gms.internal.ads.zzgla.zzf()
            throw r1
        L_0x018c:
            if (r6 == r14) goto L_0x0190
            goto L_0x044f
        L_0x0190:
            com.google.android.gms.internal.ads.zzgmr r1 = r15.zzF(r8)
            r21 = r1
            r22 = r20
            r23 = r17
            r24 = r18
            r25 = r19
            r26 = r12
            r27 = r29
            int r1 = com.google.android.gms.internal.ads.zzgit.zze(r21, r22, r23, r24, r25, r26, r27)
            return r1
        L_0x01a7:
            if (r6 != r14) goto L_0x044f
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r24 & r8
            java.lang.String r1 = ""
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 != 0) goto L_0x01fa
            int r4 = com.google.android.gms.internal.ads.zzgit.zzj(r3, r4, r7)
            int r6 = r7.zza
            if (r6 < 0) goto L_0x01f5
            if (r6 != 0) goto L_0x01c2
            r12.add(r1)
            goto L_0x01cd
        L_0x01c2:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.ads.zzgky.zzb
            r8.<init>(r3, r4, r6, r9)
            r12.add(r8)
        L_0x01cc:
            int r4 = r4 + r6
        L_0x01cd:
            if (r4 >= r5) goto L_0x044f
            int r6 = com.google.android.gms.internal.ads.zzgit.zzj(r3, r4, r7)
            int r8 = r7.zza
            if (r2 != r8) goto L_0x044f
            int r4 = com.google.android.gms.internal.ads.zzgit.zzj(r3, r6, r7)
            int r6 = r7.zza
            if (r6 < 0) goto L_0x01f0
            if (r6 != 0) goto L_0x01e5
            r12.add(r1)
            goto L_0x01cd
        L_0x01e5:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.ads.zzgky.zzb
            r8.<init>(r3, r4, r6, r9)
            r12.add(r8)
            goto L_0x01cc
        L_0x01f0:
            com.google.android.gms.internal.ads.zzgla r1 = com.google.android.gms.internal.ads.zzgla.zzf()
            throw r1
        L_0x01f5:
            com.google.android.gms.internal.ads.zzgla r1 = com.google.android.gms.internal.ads.zzgla.zzf()
            throw r1
        L_0x01fa:
            int r4 = com.google.android.gms.internal.ads.zzgit.zzj(r3, r4, r7)
            int r6 = r7.zza
            if (r6 < 0) goto L_0x0255
            if (r6 != 0) goto L_0x0208
            r12.add(r1)
            goto L_0x021b
        L_0x0208:
            int r8 = r4 + r6
            boolean r9 = com.google.android.gms.internal.ads.zzgnx.zzj(r3, r4, r8)
            if (r9 == 0) goto L_0x0250
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.ads.zzgky.zzb
            r9.<init>(r3, r4, r6, r10)
            r12.add(r9)
        L_0x021a:
            r4 = r8
        L_0x021b:
            if (r4 >= r5) goto L_0x044f
            int r6 = com.google.android.gms.internal.ads.zzgit.zzj(r3, r4, r7)
            int r8 = r7.zza
            if (r2 != r8) goto L_0x044f
            int r4 = com.google.android.gms.internal.ads.zzgit.zzj(r3, r6, r7)
            int r6 = r7.zza
            if (r6 < 0) goto L_0x024b
            if (r6 != 0) goto L_0x0233
            r12.add(r1)
            goto L_0x021b
        L_0x0233:
            int r8 = r4 + r6
            boolean r9 = com.google.android.gms.internal.ads.zzgnx.zzj(r3, r4, r8)
            if (r9 == 0) goto L_0x0246
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.ads.zzgky.zzb
            r9.<init>(r3, r4, r6, r10)
            r12.add(r9)
            goto L_0x021a
        L_0x0246:
            com.google.android.gms.internal.ads.zzgla r1 = com.google.android.gms.internal.ads.zzgla.zzd()
            throw r1
        L_0x024b:
            com.google.android.gms.internal.ads.zzgla r1 = com.google.android.gms.internal.ads.zzgla.zzf()
            throw r1
        L_0x0250:
            com.google.android.gms.internal.ads.zzgla r1 = com.google.android.gms.internal.ads.zzgla.zzd()
            throw r1
        L_0x0255:
            com.google.android.gms.internal.ads.zzgla r1 = com.google.android.gms.internal.ads.zzgla.zzf()
            throw r1
        L_0x025a:
            r1 = 0
            if (r6 != r14) goto L_0x0283
            com.google.android.gms.internal.ads.zzgiu r12 = (com.google.android.gms.internal.ads.zzgiu) r12
            int r2 = com.google.android.gms.internal.ads.zzgit.zzj(r3, r4, r7)
            int r4 = r7.zza
            int r4 = r4 + r2
        L_0x0266:
            if (r2 >= r4) goto L_0x0279
            int r2 = com.google.android.gms.internal.ads.zzgit.zzm(r3, r2, r7)
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
            com.google.android.gms.internal.ads.zzgla r1 = com.google.android.gms.internal.ads.zzgla.zzj()
            throw r1
        L_0x0283:
            if (r6 != 0) goto L_0x044f
            com.google.android.gms.internal.ads.zzgiu r12 = (com.google.android.gms.internal.ads.zzgiu) r12
            int r4 = com.google.android.gms.internal.ads.zzgit.zzm(r3, r4, r7)
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
            int r6 = com.google.android.gms.internal.ads.zzgit.zzj(r3, r4, r7)
            int r8 = r7.zza
            if (r2 == r8) goto L_0x02a2
            goto L_0x02b3
        L_0x02a2:
            int r4 = com.google.android.gms.internal.ads.zzgit.zzm(r3, r6, r7)
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
            com.google.android.gms.internal.ads.zzgkp r12 = (com.google.android.gms.internal.ads.zzgkp) r12
            int r1 = com.google.android.gms.internal.ads.zzgit.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x02bf:
            if (r1 >= r2) goto L_0x02cb
            int r4 = com.google.android.gms.internal.ads.zzgit.zzb(r3, r1)
            r12.zzh(r4)
            int r1 = r1 + 4
            goto L_0x02bf
        L_0x02cb:
            if (r1 != r2) goto L_0x02cf
            goto L_0x0450
        L_0x02cf:
            com.google.android.gms.internal.ads.zzgla r1 = com.google.android.gms.internal.ads.zzgla.zzj()
            throw r1
        L_0x02d4:
            if (r6 != r9) goto L_0x044f
            com.google.android.gms.internal.ads.zzgkp r12 = (com.google.android.gms.internal.ads.zzgkp) r12
            int r1 = com.google.android.gms.internal.ads.zzgit.zzb(r17, r18)
            r12.zzh(r1)
        L_0x02df:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x02f4
            int r4 = com.google.android.gms.internal.ads.zzgit.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x02ec
            goto L_0x02f4
        L_0x02ec:
            int r1 = com.google.android.gms.internal.ads.zzgit.zzb(r3, r4)
            r12.zzh(r1)
            goto L_0x02df
        L_0x02f4:
            return r1
        L_0x02f5:
            if (r6 != r14) goto L_0x0315
            com.google.android.gms.internal.ads.zzgln r12 = (com.google.android.gms.internal.ads.zzgln) r12
            int r1 = com.google.android.gms.internal.ads.zzgit.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x0300:
            if (r1 >= r2) goto L_0x030c
            long r4 = com.google.android.gms.internal.ads.zzgit.zzn(r3, r1)
            r12.zzg(r4)
            int r1 = r1 + 8
            goto L_0x0300
        L_0x030c:
            if (r1 != r2) goto L_0x0310
            goto L_0x0450
        L_0x0310:
            com.google.android.gms.internal.ads.zzgla r1 = com.google.android.gms.internal.ads.zzgla.zzj()
            throw r1
        L_0x0315:
            if (r6 != r13) goto L_0x044f
            com.google.android.gms.internal.ads.zzgln r12 = (com.google.android.gms.internal.ads.zzgln) r12
            long r8 = com.google.android.gms.internal.ads.zzgit.zzn(r17, r18)
            r12.zzg(r8)
        L_0x0320:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0335
            int r4 = com.google.android.gms.internal.ads.zzgit.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x032d
            goto L_0x0335
        L_0x032d:
            long r8 = com.google.android.gms.internal.ads.zzgit.zzn(r3, r4)
            r12.zzg(r8)
            goto L_0x0320
        L_0x0335:
            return r1
        L_0x0336:
            if (r6 != r14) goto L_0x033e
            int r1 = com.google.android.gms.internal.ads.zzgit.zzf(r3, r4, r12, r7)
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
            int r1 = com.google.android.gms.internal.ads.zzgit.zzl(r20, r21, r22, r23, r24, r25)
            return r1
        L_0x0351:
            if (r6 != r14) goto L_0x0371
            com.google.android.gms.internal.ads.zzgln r12 = (com.google.android.gms.internal.ads.zzgln) r12
            int r1 = com.google.android.gms.internal.ads.zzgit.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x035c:
            if (r1 >= r2) goto L_0x0368
            int r1 = com.google.android.gms.internal.ads.zzgit.zzm(r3, r1, r7)
            long r4 = r7.zzb
            r12.zzg(r4)
            goto L_0x035c
        L_0x0368:
            if (r1 != r2) goto L_0x036c
            goto L_0x0450
        L_0x036c:
            com.google.android.gms.internal.ads.zzgla r1 = com.google.android.gms.internal.ads.zzgla.zzj()
            throw r1
        L_0x0371:
            if (r6 != 0) goto L_0x044f
            com.google.android.gms.internal.ads.zzgln r12 = (com.google.android.gms.internal.ads.zzgln) r12
            int r1 = com.google.android.gms.internal.ads.zzgit.zzm(r3, r4, r7)
            long r8 = r7.zzb
            r12.zzg(r8)
        L_0x037e:
            if (r1 >= r5) goto L_0x0393
            int r4 = com.google.android.gms.internal.ads.zzgit.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x0389
            goto L_0x0393
        L_0x0389:
            int r1 = com.google.android.gms.internal.ads.zzgit.zzm(r3, r4, r7)
            long r8 = r7.zzb
            r12.zzg(r8)
            goto L_0x037e
        L_0x0393:
            return r1
        L_0x0394:
            if (r6 != r14) goto L_0x03b8
            com.google.android.gms.internal.ads.zzgkh r12 = (com.google.android.gms.internal.ads.zzgkh) r12
            int r1 = com.google.android.gms.internal.ads.zzgit.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x039f:
            if (r1 >= r2) goto L_0x03af
            int r4 = com.google.android.gms.internal.ads.zzgit.zzb(r3, r1)
            float r4 = java.lang.Float.intBitsToFloat(r4)
            r12.zze(r4)
            int r1 = r1 + 4
            goto L_0x039f
        L_0x03af:
            if (r1 != r2) goto L_0x03b3
            goto L_0x0450
        L_0x03b3:
            com.google.android.gms.internal.ads.zzgla r1 = com.google.android.gms.internal.ads.zzgla.zzj()
            throw r1
        L_0x03b8:
            if (r6 != r9) goto L_0x044f
            com.google.android.gms.internal.ads.zzgkh r12 = (com.google.android.gms.internal.ads.zzgkh) r12
            int r1 = com.google.android.gms.internal.ads.zzgit.zzb(r17, r18)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r12.zze(r1)
        L_0x03c7:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x03e0
            int r4 = com.google.android.gms.internal.ads.zzgit.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x03d4
            goto L_0x03e0
        L_0x03d4:
            int r1 = com.google.android.gms.internal.ads.zzgit.zzb(r3, r4)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r12.zze(r1)
            goto L_0x03c7
        L_0x03e0:
            return r1
        L_0x03e1:
            if (r6 != r14) goto L_0x0404
            com.google.android.gms.internal.ads.zzgjx r12 = (com.google.android.gms.internal.ads.zzgjx) r12
            int r1 = com.google.android.gms.internal.ads.zzgit.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x03ec:
            if (r1 >= r2) goto L_0x03fc
            long r4 = com.google.android.gms.internal.ads.zzgit.zzn(r3, r1)
            double r4 = java.lang.Double.longBitsToDouble(r4)
            r12.zze(r4)
            int r1 = r1 + 8
            goto L_0x03ec
        L_0x03fc:
            if (r1 != r2) goto L_0x03ff
            goto L_0x0450
        L_0x03ff:
            com.google.android.gms.internal.ads.zzgla r1 = com.google.android.gms.internal.ads.zzgla.zzj()
            throw r1
        L_0x0404:
            if (r6 != r13) goto L_0x044f
            com.google.android.gms.internal.ads.zzgjx r12 = (com.google.android.gms.internal.ads.zzgjx) r12
            long r8 = com.google.android.gms.internal.ads.zzgit.zzn(r17, r18)
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r12.zze(r8)
        L_0x0413:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x042c
            int r4 = com.google.android.gms.internal.ads.zzgit.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x0420
            goto L_0x042c
        L_0x0420:
            long r8 = com.google.android.gms.internal.ads.zzgit.zzn(r3, r4)
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r12.zze(r8)
            goto L_0x0413
        L_0x042c:
            return r1
        L_0x042d:
            if (r4 >= r5) goto L_0x044e
            int r8 = com.google.android.gms.internal.ads.zzgit.zzj(r3, r4, r7)
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
            int r4 = com.google.android.gms.internal.ads.zzgit.zzc(r21, r22, r23, r24, r25, r26)
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgmb.zzw(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.ads.zzgis):int");
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

    public final int zza(Object obj) {
        return this.zzj ? zzr(obj) : zzq(obj);
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
            java.lang.Object r3 = com.google.android.gms.internal.ads.zzgns.zzh(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0224
        L_0x0031:
            boolean r3 = r8.zzT(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = zzD(r9, r5)
            int r3 = com.google.android.gms.internal.ads.zzgky.zzc(r3)
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
            int r3 = com.google.android.gms.internal.ads.zzgky.zzc(r3)
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
            java.lang.Object r3 = com.google.android.gms.internal.ads.zzgns.zzh(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0224
        L_0x009f:
            boolean r3 = r8.zzT(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.ads.zzgns.zzh(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0224
        L_0x00b1:
            boolean r3 = r8.zzT(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.ads.zzgns.zzh(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0224
        L_0x00c5:
            boolean r3 = r8.zzT(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            boolean r3 = zzU(r9, r5)
            int r3 = com.google.android.gms.internal.ads.zzgky.zza(r3)
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
            int r3 = com.google.android.gms.internal.ads.zzgky.zzc(r3)
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
            int r3 = com.google.android.gms.internal.ads.zzgky.zzc(r3)
            goto L_0x0224
        L_0x0117:
            boolean r3 = r8.zzT(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = zzD(r9, r5)
            int r3 = com.google.android.gms.internal.ads.zzgky.zzc(r3)
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
            int r3 = com.google.android.gms.internal.ads.zzgky.zzc(r3)
            goto L_0x0224
        L_0x0151:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.ads.zzgns.zzh(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0224
        L_0x015d:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.ads.zzgns.zzh(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0224
        L_0x0169:
            java.lang.Object r3 = com.google.android.gms.internal.ads.zzgns.zzh(r9, r5)
            if (r3 == 0) goto L_0x01bf
            int r7 = r3.hashCode()
            goto L_0x01bf
        L_0x0174:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.ads.zzgns.zzf(r9, r5)
            int r3 = com.google.android.gms.internal.ads.zzgky.zzc(r3)
            goto L_0x0224
        L_0x0180:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.ads.zzgns.zzd(r9, r5)
            goto L_0x01f3
        L_0x0188:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.ads.zzgns.zzf(r9, r5)
            int r3 = com.google.android.gms.internal.ads.zzgky.zzc(r3)
            goto L_0x0224
        L_0x0194:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.ads.zzgns.zzd(r9, r5)
            goto L_0x01f3
        L_0x019b:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.ads.zzgns.zzd(r9, r5)
            goto L_0x01f3
        L_0x01a2:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.ads.zzgns.zzd(r9, r5)
            goto L_0x01f3
        L_0x01a9:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.ads.zzgns.zzh(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0224
        L_0x01b5:
            java.lang.Object r3 = com.google.android.gms.internal.ads.zzgns.zzh(r9, r5)
            if (r3 == 0) goto L_0x01bf
            int r7 = r3.hashCode()
        L_0x01bf:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0226
        L_0x01c3:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.ads.zzgns.zzh(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0224
        L_0x01d0:
            int r2 = r2 * 53
            boolean r3 = com.google.android.gms.internal.ads.zzgns.zzz(r9, r5)
            int r3 = com.google.android.gms.internal.ads.zzgky.zza(r3)
            goto L_0x0224
        L_0x01db:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.ads.zzgns.zzd(r9, r5)
            goto L_0x01f3
        L_0x01e2:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.ads.zzgns.zzf(r9, r5)
            int r3 = com.google.android.gms.internal.ads.zzgky.zzc(r3)
            goto L_0x0224
        L_0x01ed:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.ads.zzgns.zzd(r9, r5)
        L_0x01f3:
            int r2 = r2 + r3
            goto L_0x0226
        L_0x01f5:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.ads.zzgns.zzf(r9, r5)
            int r3 = com.google.android.gms.internal.ads.zzgky.zzc(r3)
            goto L_0x0224
        L_0x0200:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.ads.zzgns.zzf(r9, r5)
            int r3 = com.google.android.gms.internal.ads.zzgky.zzc(r3)
            goto L_0x0224
        L_0x020b:
            int r2 = r2 * 53
            float r3 = com.google.android.gms.internal.ads.zzgns.zzc(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0224
        L_0x0216:
            int r2 = r2 * 53
            double r3 = com.google.android.gms.internal.ads.zzgns.zzb(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.gms.internal.ads.zzgky.zzc(r3)
        L_0x0224:
            int r3 = r3 + r2
            r2 = r3
        L_0x0226:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x022a:
            int r2 = r2 * 53
            com.google.android.gms.internal.ads.zzgni r0 = r8.zzo
            java.lang.Object r0 = r0.zzd(r9)
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            boolean r1 = r8.zzh
            if (r1 != 0) goto L_0x023c
            return r0
        L_0x023c:
            com.google.android.gms.internal.ads.zzgkb r0 = r8.zzp
            r0.zza(r9)
            r9 = 0
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgmb.zzb(java.lang.Object):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:109:0x036b, code lost:
        if (r0 != r15) goto L_0x036d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0387, code lost:
        r8 = r31;
        r7 = r33;
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x03af, code lost:
        if (r0 != r15) goto L_0x036d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x03d4, code lost:
        if (r0 != r15) goto L_0x036d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x022a, code lost:
        r4 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0266, code lost:
        r5 = r6 | r24;
        r3 = r7;
        r0 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x02a9, code lost:
        r5 = r6 | r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x02ab, code lost:
        r3 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x02ac, code lost:
        r1 = r11;
        r2 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x02c5, code lost:
        r2 = r4;
        r20 = r6;
        r18 = r7;
        r26 = r10;
        r8 = r11;
        r23 = r19;
        r6 = r25;
        r7 = r33;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzc(java.lang.Object r29, byte[] r30, int r31, int r32, int r33, com.google.android.gms.internal.ads.zzgis r34) throws java.io.IOException {
        /*
            r28 = this;
            r15 = r28
            r14 = r29
            r12 = r30
            r13 = r32
            r11 = r33
            r9 = r34
            sun.misc.Unsafe r10 = zzb
            r16 = 0
            r0 = r31
            r1 = 0
            r2 = -1
            r3 = 0
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
        L_0x0019:
            if (r0 >= r13) goto L_0x0448
            int r1 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0028
            int r0 = com.google.android.gms.internal.ads.zzgit.zzk(r0, r12, r1, r9)
            int r1 = r9.zza
            goto L_0x002d
        L_0x0028:
            r27 = r1
            r1 = r0
            r0 = r27
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
            r3 = -1
            if (r2 != r3) goto L_0x0050
            r2 = r0
            r8 = r1
            r20 = r5
            r23 = r7
            r26 = r10
            r7 = r11
            r17 = -1
            r18 = 0
            goto L_0x03d7
        L_0x0050:
            int[] r3 = r15.zzc
            int r19 = r2 + 1
            r4 = r3[r19]
            int r11 = zzB(r4)
            r19 = r1
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r4 & r17
            r21 = r0
            long r0 = (long) r1
            r22 = r0
            r0 = 17
            if (r11 > r0) goto L_0x02d5
            int r0 = r2 + 2
            r0 = r3[r0]
            int r3 = r0 >>> 20
            r1 = 1
            int r24 = r1 << r3
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r3
            if (r0 == r6) goto L_0x0089
            r17 = r2
            if (r6 == r3) goto L_0x0081
            long r1 = (long) r6
            r10.putInt(r14, r1, r5)
        L_0x0081:
            long r1 = (long) r0
            int r5 = r10.getInt(r14, r1)
            r25 = r0
            goto L_0x008d
        L_0x0089:
            r17 = r2
            r25 = r6
        L_0x008d:
            r6 = r5
            r0 = 5
            switch(r11) {
                case 0: goto L_0x028a;
                case 1: goto L_0x026b;
                case 2: goto L_0x0249;
                case 3: goto L_0x0249;
                case 4: goto L_0x022d;
                case 5: goto L_0x0209;
                case 6: goto L_0x01ed;
                case 7: goto L_0x01c8;
                case 8: goto L_0x01a1;
                case 9: goto L_0x016d;
                case 10: goto L_0x0150;
                case 11: goto L_0x022d;
                case 12: goto L_0x0118;
                case 13: goto L_0x01ed;
                case 14: goto L_0x0209;
                case 15: goto L_0x00f8;
                case 16: goto L_0x00c4;
                default: goto L_0x0092;
            }
        L_0x0092:
            r11 = r19
            r4 = r21
            r2 = r22
            r0 = 3
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r7
            r7 = r17
            r17 = -1
            if (r8 != r0) goto L_0x02c5
            com.google.android.gms.internal.ads.zzgmr r0 = r15.zzF(r7)
            int r1 = r19 << 3
            r5 = r1 | 4
            r1 = r30
            r12 = r2
            r2 = r4
            r3 = r32
            r4 = r5
            r5 = r34
            int r0 = com.google.android.gms.internal.ads.zzgit.zzc(r0, r1, r2, r3, r4, r5)
            r1 = r6 & r24
            if (r1 != 0) goto L_0x02b1
            java.lang.Object r1 = r9.zzc
            r10.putObject(r14, r12, r1)
            goto L_0x02be
        L_0x00c4:
            if (r8 != 0) goto L_0x00e9
            r1 = r21
            int r8 = com.google.android.gms.internal.ads.zzgit.zzm(r12, r1, r9)
            long r0 = r9.zzb
            long r4 = com.google.android.gms.internal.ads.zzgjo.zzG(r0)
            r1 = r22
            r0 = r10
            r11 = r19
            r1 = r29
            r19 = r7
            r7 = r17
            r17 = -1
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r22
            r0.putLong(r1, r2, r4)
            goto L_0x0266
        L_0x00e9:
            r11 = r19
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r7
            r7 = r17
            r17 = -1
            r4 = r21
            goto L_0x02c5
        L_0x00f8:
            r11 = r19
            r1 = r21
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r7
            r7 = r17
            r17 = -1
            if (r8 != 0) goto L_0x022a
            int r0 = com.google.android.gms.internal.ads.zzgit.zzj(r12, r1, r9)
            int r1 = r9.zza
            int r1 = com.google.android.gms.internal.ads.zzgjo.zzF(r1)
            r2 = r22
            r10.putInt(r14, r2, r1)
            goto L_0x02a9
        L_0x0118:
            r11 = r19
            r1 = r21
            r2 = r22
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r7
            r7 = r17
            r17 = -1
            if (r8 != 0) goto L_0x022a
            int r0 = com.google.android.gms.internal.ads.zzgit.zzj(r12, r1, r9)
            int r1 = r9.zza
            com.google.android.gms.internal.ads.zzgks r4 = r15.zzE(r7)
            if (r4 == 0) goto L_0x014b
            boolean r4 = r4.zza(r1)
            if (r4 == 0) goto L_0x013c
            goto L_0x014b
        L_0x013c:
            com.google.android.gms.internal.ads.zzgnj r2 = zzd(r29)
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.zzh(r11, r1)
            r5 = r6
            goto L_0x02ab
        L_0x014b:
            r10.putInt(r14, r2, r1)
            goto L_0x02a9
        L_0x0150:
            r11 = r19
            r1 = r21
            r2 = r22
            r0 = 2
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r7
            r7 = r17
            r17 = -1
            if (r8 != r0) goto L_0x022a
            int r0 = com.google.android.gms.internal.ads.zzgit.zza(r12, r1, r9)
            java.lang.Object r1 = r9.zzc
            r10.putObject(r14, r2, r1)
            goto L_0x02a9
        L_0x016d:
            r11 = r19
            r1 = r21
            r2 = r22
            r0 = 2
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r7
            r7 = r17
            r17 = -1
            if (r8 != r0) goto L_0x022a
            com.google.android.gms.internal.ads.zzgmr r0 = r15.zzF(r7)
            int r0 = com.google.android.gms.internal.ads.zzgit.zzd(r0, r12, r1, r13, r9)
            r1 = r6 & r24
            if (r1 != 0) goto L_0x0192
            java.lang.Object r1 = r9.zzc
            r10.putObject(r14, r2, r1)
            goto L_0x02a9
        L_0x0192:
            java.lang.Object r1 = r10.getObject(r14, r2)
            java.lang.Object r4 = r9.zzc
            java.lang.Object r1 = com.google.android.gms.internal.ads.zzgky.zzg(r1, r4)
            r10.putObject(r14, r2, r1)
            goto L_0x02a9
        L_0x01a1:
            r11 = r19
            r1 = r21
            r2 = r22
            r0 = 2
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r7
            r7 = r17
            r17 = -1
            if (r8 != r0) goto L_0x022a
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r4
            if (r0 != 0) goto L_0x01bd
            int r0 = com.google.android.gms.internal.ads.zzgit.zzg(r12, r1, r9)
            goto L_0x01c1
        L_0x01bd:
            int r0 = com.google.android.gms.internal.ads.zzgit.zzh(r12, r1, r9)
        L_0x01c1:
            java.lang.Object r1 = r9.zzc
            r10.putObject(r14, r2, r1)
            goto L_0x02a9
        L_0x01c8:
            r11 = r19
            r1 = r21
            r2 = r22
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r7
            r7 = r17
            r17 = -1
            if (r8 != 0) goto L_0x022a
            int r0 = com.google.android.gms.internal.ads.zzgit.zzm(r12, r1, r9)
            long r4 = r9.zzb
            r20 = 0
            int r1 = (r4 > r20 ? 1 : (r4 == r20 ? 0 : -1))
            if (r1 == 0) goto L_0x01e7
            r1 = 1
            goto L_0x01e8
        L_0x01e7:
            r1 = 0
        L_0x01e8:
            com.google.android.gms.internal.ads.zzgns.zzp(r14, r2, r1)
            goto L_0x02a9
        L_0x01ed:
            r11 = r19
            r1 = r21
            r2 = r22
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r7
            r7 = r17
            r17 = -1
            if (r8 != r0) goto L_0x022a
            int r0 = com.google.android.gms.internal.ads.zzgit.zzb(r12, r1)
            r10.putInt(r14, r2, r0)
            int r0 = r1 + 4
            goto L_0x02a9
        L_0x0209:
            r11 = r19
            r1 = r21
            r2 = r22
            r0 = 1
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r7
            r7 = r17
            r17 = -1
            if (r8 != r0) goto L_0x022a
            long r4 = com.google.android.gms.internal.ads.zzgit.zzn(r12, r1)
            r8 = r1
            r0 = r10
            r1 = r29
            r0.putLong(r1, r2, r4)
            int r0 = r8 + 8
            goto L_0x02a9
        L_0x022a:
            r4 = r1
            goto L_0x02c5
        L_0x022d:
            r11 = r19
            r4 = r21
            r2 = r22
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r7
            r7 = r17
            r17 = -1
            if (r8 != 0) goto L_0x02c5
            int r0 = com.google.android.gms.internal.ads.zzgit.zzj(r12, r4, r9)
            int r1 = r9.zza
            r10.putInt(r14, r2, r1)
            goto L_0x02a9
        L_0x0249:
            r11 = r19
            r4 = r21
            r2 = r22
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r7
            r7 = r17
            r17 = -1
            if (r8 != 0) goto L_0x02c5
            int r8 = com.google.android.gms.internal.ads.zzgit.zzm(r12, r4, r9)
            long r4 = r9.zzb
            r0 = r10
            r1 = r29
            r0.putLong(r1, r2, r4)
        L_0x0266:
            r5 = r6 | r24
            r3 = r7
            r0 = r8
            goto L_0x02ac
        L_0x026b:
            r11 = r19
            r4 = r21
            r2 = r22
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r7
            r7 = r17
            r17 = -1
            if (r8 != r0) goto L_0x02c5
            int r0 = com.google.android.gms.internal.ads.zzgit.zzb(r12, r4)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            com.google.android.gms.internal.ads.zzgns.zzs(r14, r2, r0)
            int r0 = r4 + 4
            goto L_0x02a9
        L_0x028a:
            r11 = r19
            r4 = r21
            r2 = r22
            r0 = 1
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r7
            r7 = r17
            r17 = -1
            if (r8 != r0) goto L_0x02c5
            long r0 = com.google.android.gms.internal.ads.zzgit.zzn(r12, r4)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            com.google.android.gms.internal.ads.zzgns.zzr(r14, r2, r0)
            int r0 = r4 + 8
        L_0x02a9:
            r5 = r6 | r24
        L_0x02ab:
            r3 = r7
        L_0x02ac:
            r1 = r11
            r2 = r19
            goto L_0x0329
        L_0x02b1:
            java.lang.Object r1 = r10.getObject(r14, r12)
            java.lang.Object r2 = r9.zzc
            java.lang.Object r1 = com.google.android.gms.internal.ads.zzgky.zzg(r1, r2)
            r10.putObject(r14, r12, r1)
        L_0x02be:
            r5 = r6 | r24
            r12 = r30
            r13 = r32
            goto L_0x02ab
        L_0x02c5:
            r2 = r4
            r20 = r6
            r18 = r7
            r26 = r10
            r8 = r11
            r23 = r19
            r6 = r25
            r7 = r33
            goto L_0x03d7
        L_0x02d5:
            r3 = r19
            r12 = r22
            r17 = -1
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r7
            r7 = r2
            r2 = r21
            r0 = 27
            if (r11 != r0) goto L_0x033e
            r0 = 2
            if (r8 != r0) goto L_0x032f
            java.lang.Object r0 = r10.getObject(r14, r12)
            com.google.android.gms.internal.ads.zzgkx r0 = (com.google.android.gms.internal.ads.zzgkx) r0
            boolean r1 = r0.zzc()
            if (r1 != 0) goto L_0x0307
            int r1 = r0.size()
            if (r1 != 0) goto L_0x02ff
            r1 = 10
            goto L_0x0300
        L_0x02ff:
            int r1 = r1 + r1
        L_0x0300:
            com.google.android.gms.internal.ads.zzgkx r0 = r0.zzd(r1)
            r10.putObject(r14, r12, r0)
        L_0x0307:
            r8 = r0
            com.google.android.gms.internal.ads.zzgmr r0 = r15.zzF(r7)
            r1 = r3
            r4 = r2
            r2 = r30
            r11 = r3
            r3 = r4
            r4 = r32
            r20 = r5
            r5 = r8
            r25 = r6
            r6 = r34
            int r0 = com.google.android.gms.internal.ads.zzgit.zze(r0, r1, r2, r3, r4, r5, r6)
            r12 = r30
            r13 = r32
            r3 = r7
            r1 = r11
            r2 = r19
            r5 = r20
        L_0x0329:
            r6 = r25
            r11 = r33
            goto L_0x0019
        L_0x032f:
            r20 = r5
            r25 = r6
            r15 = r2
            r31 = r3
            r18 = r7
            r26 = r10
            r23 = r19
            goto L_0x03b2
        L_0x033e:
            r20 = r5
            r25 = r6
            r5 = r2
            r6 = r3
            r0 = 49
            if (r11 > r0) goto L_0x038d
            long r3 = (long) r4
            r0 = r28
            r1 = r29
            r2 = r30
            r21 = r3
            r3 = r5
            r4 = r32
            r15 = r5
            r5 = r6
            r31 = r6
            r6 = r19
            r18 = r7
            r23 = r19
            r7 = r8
            r8 = r18
            r26 = r10
            r9 = r21
            r14 = r34
            int r0 = r0.zzw(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x0387
        L_0x036d:
            r15 = r28
            r14 = r29
            r12 = r30
            r1 = r31
            r13 = r32
            r11 = r33
            r9 = r34
            r3 = r18
            r5 = r20
            r2 = r23
            r6 = r25
            r10 = r26
            goto L_0x0019
        L_0x0387:
            r8 = r31
            r7 = r33
            r2 = r0
            goto L_0x03b7
        L_0x038d:
            r15 = r5
            r31 = r6
            r18 = r7
            r26 = r10
            r23 = r19
            r0 = 50
            if (r11 != r0) goto L_0x03ba
            r0 = 2
            if (r8 != r0) goto L_0x03b2
            r0 = r28
            r1 = r29
            r2 = r30
            r3 = r15
            r4 = r32
            r5 = r18
            r6 = r12
            r8 = r34
            int r0 = r0.zzt(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x0387
            goto L_0x036d
        L_0x03b2:
            r8 = r31
            r7 = r33
            r2 = r15
        L_0x03b7:
            r6 = r25
            goto L_0x03d7
        L_0x03ba:
            r0 = r28
            r1 = r29
            r2 = r30
            r3 = r15
            r9 = r4
            r4 = r32
            r5 = r31
            r6 = r23
            r7 = r8
            r8 = r9
            r9 = r11
            r10 = r12
            r12 = r18
            r13 = r34
            int r0 = r0.zzu(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x0387
            goto L_0x036d
        L_0x03d7:
            if (r8 != r7) goto L_0x03e9
            if (r7 == 0) goto L_0x03e9
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r9 = r28
            r12 = r29
            r0 = r2
            r1 = r8
            r5 = r20
            r2 = 0
            goto L_0x0455
        L_0x03e9:
            r9 = r28
            boolean r0 = r9.zzh
            if (r0 == 0) goto L_0x0421
            r10 = r34
            com.google.android.gms.internal.ads.zzgka r0 = r10.zzd
            com.google.android.gms.internal.ads.zzgka r1 = com.google.android.gms.internal.ads.zzgka.zza()
            if (r0 == r1) goto L_0x041e
            com.google.android.gms.internal.ads.zzgly r0 = r9.zzg
            com.google.android.gms.internal.ads.zzgka r1 = r10.zzd
            r11 = r23
            com.google.android.gms.internal.ads.zzgkm r0 = r1.zzc(r0, r11)
            if (r0 != 0) goto L_0x0417
            com.google.android.gms.internal.ads.zzgnj r4 = zzd(r29)
            r0 = r8
            r1 = r30
            r3 = r32
            r5 = r34
            int r0 = com.google.android.gms.internal.ads.zzgit.zzi(r0, r1, r2, r3, r4, r5)
            r12 = r29
            goto L_0x0436
        L_0x0417:
            r12 = r29
            r0 = r12
            com.google.android.gms.internal.ads.zzgkl r0 = (com.google.android.gms.internal.ads.zzgkl) r0
            r2 = 0
            throw r2
        L_0x041e:
            r12 = r29
            goto L_0x0425
        L_0x0421:
            r12 = r29
            r10 = r34
        L_0x0425:
            r11 = r23
            com.google.android.gms.internal.ads.zzgnj r4 = zzd(r29)
            r0 = r8
            r1 = r30
            r3 = r32
            r5 = r34
            int r0 = com.google.android.gms.internal.ads.zzgit.zzi(r0, r1, r2, r3, r4, r5)
        L_0x0436:
            r13 = r32
            r1 = r8
            r15 = r9
            r9 = r10
            r2 = r11
            r14 = r12
            r3 = r18
            r5 = r20
            r10 = r26
            r12 = r30
            r11 = r7
            goto L_0x0019
        L_0x0448:
            r20 = r5
            r25 = r6
            r26 = r10
            r7 = r11
            r12 = r14
            r9 = r15
            r2 = 0
            r3 = 1048575(0xfffff, float:1.469367E-39)
        L_0x0455:
            if (r6 == r3) goto L_0x045d
            long r3 = (long) r6
            r6 = r26
            r6.putInt(r12, r3, r5)
        L_0x045d:
            int r3 = r9.zzl
        L_0x045f:
            int r4 = r9.zzm
            if (r3 >= r4) goto L_0x046f
            int[] r4 = r9.zzk
            r4 = r4[r3]
            com.google.android.gms.internal.ads.zzgni r5 = r9.zzo
            r9.zzG(r12, r4, r2, r5)
            int r3 = r3 + 1
            goto L_0x045f
        L_0x046f:
            if (r7 != 0) goto L_0x047b
            r2 = r32
            if (r0 != r2) goto L_0x0476
            goto L_0x0481
        L_0x0476:
            com.google.android.gms.internal.ads.zzgla r0 = com.google.android.gms.internal.ads.zzgla.zzg()
            throw r0
        L_0x047b:
            r2 = r32
            if (r0 > r2) goto L_0x0482
            if (r1 != r7) goto L_0x0482
        L_0x0481:
            return r0
        L_0x0482:
            com.google.android.gms.internal.ads.zzgla r0 = com.google.android.gms.internal.ads.zzgla.zzg()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgmb.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.zzgis):int");
    }

    public final Object zze() {
        return ((zzgko) this.zzg).zzb(4, (Object) null, (Object) null);
    }

    public final void zzf(Object obj) {
        int i;
        int i2 = this.zzl;
        while (true) {
            i = this.zzm;
            if (i2 >= i) {
                break;
            }
            long zzC = (long) (zzC(this.zzk[i2]) & 1048575);
            Object zzh2 = zzgns.zzh(obj, zzC);
            if (zzh2 != null) {
                ((zzgls) zzh2).zzc();
                zzgns.zzv(obj, zzC, zzh2);
            }
            i2++;
        }
        int length = this.zzk.length;
        while (i < length) {
            this.zzn.zzb(obj, (long) this.zzk[i]);
            i++;
        }
        this.zzo.zzm(obj);
        if (this.zzh) {
            this.zzp.zze(obj);
        }
    }

    public final void zzg(Object obj, Object obj2) {
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzC = zzC(i);
            long j = (long) (1048575 & zzC);
            int i2 = this.zzc[i];
            switch (zzB(zzC)) {
                case 0:
                    if (!zzQ(obj2, i)) {
                        break;
                    } else {
                        zzgns.zzr(obj, j, zzgns.zzb(obj2, j));
                        zzM(obj, i);
                        break;
                    }
                case 1:
                    if (!zzQ(obj2, i)) {
                        break;
                    } else {
                        zzgns.zzs(obj, j, zzgns.zzc(obj2, j));
                        zzM(obj, i);
                        break;
                    }
                case 2:
                    if (!zzQ(obj2, i)) {
                        break;
                    } else {
                        zzgns.zzu(obj, j, zzgns.zzf(obj2, j));
                        zzM(obj, i);
                        break;
                    }
                case 3:
                    if (!zzQ(obj2, i)) {
                        break;
                    } else {
                        zzgns.zzu(obj, j, zzgns.zzf(obj2, j));
                        zzM(obj, i);
                        break;
                    }
                case 4:
                    if (!zzQ(obj2, i)) {
                        break;
                    } else {
                        zzgns.zzt(obj, j, zzgns.zzd(obj2, j));
                        zzM(obj, i);
                        break;
                    }
                case 5:
                    if (!zzQ(obj2, i)) {
                        break;
                    } else {
                        zzgns.zzu(obj, j, zzgns.zzf(obj2, j));
                        zzM(obj, i);
                        break;
                    }
                case 6:
                    if (!zzQ(obj2, i)) {
                        break;
                    } else {
                        zzgns.zzt(obj, j, zzgns.zzd(obj2, j));
                        zzM(obj, i);
                        break;
                    }
                case 7:
                    if (!zzQ(obj2, i)) {
                        break;
                    } else {
                        zzgns.zzp(obj, j, zzgns.zzz(obj2, j));
                        zzM(obj, i);
                        break;
                    }
                case 8:
                    if (!zzQ(obj2, i)) {
                        break;
                    } else {
                        zzgns.zzv(obj, j, zzgns.zzh(obj2, j));
                        zzM(obj, i);
                        break;
                    }
                case 9:
                    zzJ(obj, obj2, i);
                    break;
                case 10:
                    if (!zzQ(obj2, i)) {
                        break;
                    } else {
                        zzgns.zzv(obj, j, zzgns.zzh(obj2, j));
                        zzM(obj, i);
                        break;
                    }
                case 11:
                    if (!zzQ(obj2, i)) {
                        break;
                    } else {
                        zzgns.zzt(obj, j, zzgns.zzd(obj2, j));
                        zzM(obj, i);
                        break;
                    }
                case 12:
                    if (!zzQ(obj2, i)) {
                        break;
                    } else {
                        zzgns.zzt(obj, j, zzgns.zzd(obj2, j));
                        zzM(obj, i);
                        break;
                    }
                case 13:
                    if (!zzQ(obj2, i)) {
                        break;
                    } else {
                        zzgns.zzt(obj, j, zzgns.zzd(obj2, j));
                        zzM(obj, i);
                        break;
                    }
                case 14:
                    if (!zzQ(obj2, i)) {
                        break;
                    } else {
                        zzgns.zzu(obj, j, zzgns.zzf(obj2, j));
                        zzM(obj, i);
                        break;
                    }
                case 15:
                    if (!zzQ(obj2, i)) {
                        break;
                    } else {
                        zzgns.zzt(obj, j, zzgns.zzd(obj2, j));
                        zzM(obj, i);
                        break;
                    }
                case 16:
                    if (!zzQ(obj2, i)) {
                        break;
                    } else {
                        zzgns.zzu(obj, j, zzgns.zzf(obj2, j));
                        zzM(obj, i);
                        break;
                    }
                case 17:
                    zzJ(obj, obj2, i);
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
                    this.zzn.zzc(obj, obj2, j);
                    break;
                case 50:
                    zzgmt.zzI(this.zzr, obj, obj2, j);
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
                    if (!zzT(obj2, i2, i)) {
                        break;
                    } else {
                        zzgns.zzv(obj, j, zzgns.zzh(obj2, j));
                        zzN(obj, i2, i);
                        break;
                    }
                case 60:
                    zzK(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!zzT(obj2, i2, i)) {
                        break;
                    } else {
                        zzgns.zzv(obj, j, zzgns.zzh(obj2, j));
                        zzN(obj, i2, i);
                        break;
                    }
                case 68:
                    zzK(obj, obj2, i);
                    break;
            }
        }
        zzgmt.zzF(this.zzo, obj, obj2);
        if (this.zzh) {
            zzgmt.zzE(this.zzp, obj, obj2);
        }
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void zzh(java.lang.Object r13, com.google.android.gms.internal.ads.zzgmj r14, com.google.android.gms.internal.ads.zzgka r15) throws java.io.IOException {
        /*
            r12 = this;
            r15.getClass()
            com.google.android.gms.internal.ads.zzgni r7 = r12.zzo
            com.google.android.gms.internal.ads.zzgkb r8 = r12.zzp
            r9 = 0
            r0 = r9
            r10 = r0
        L_0x000a:
            int r1 = r14.zzc()     // Catch:{ all -> 0x0079 }
            int r2 = r12.zzx(r1)     // Catch:{ all -> 0x0079 }
            if (r2 >= 0) goto L_0x007c
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r2) goto L_0x0030
            int r14 = r12.zzl
        L_0x001b:
            int r15 = r12.zzm
            if (r14 >= r15) goto L_0x002a
            int[] r15 = r12.zzk
            r15 = r15[r14]
            java.lang.Object r10 = r12.zzG(r13, r15, r10, r7)
            int r14 = r14 + 1
            goto L_0x001b
        L_0x002a:
            if (r10 == 0) goto L_0x05c4
            r7.zzn(r13, r10)
            return
        L_0x0030:
            boolean r2 = r12.zzh     // Catch:{ all -> 0x0079 }
            if (r2 != 0) goto L_0x0036
            r2 = r9
            goto L_0x003d
        L_0x0036:
            com.google.android.gms.internal.ads.zzgly r2 = r12.zzg     // Catch:{ all -> 0x0079 }
            java.lang.Object r1 = r8.zzc(r15, r2, r1)     // Catch:{ all -> 0x0079 }
            r2 = r1
        L_0x003d:
            if (r2 == 0) goto L_0x0052
            if (r0 != 0) goto L_0x0045
            com.google.android.gms.internal.ads.zzgkf r0 = r8.zzb(r13)     // Catch:{ all -> 0x0079 }
        L_0x0045:
            r11 = r0
            r0 = r8
            r1 = r14
            r3 = r15
            r4 = r11
            r5 = r10
            r6 = r7
            java.lang.Object r10 = r0.zzd(r1, r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0079 }
            r0 = r11
            goto L_0x000a
        L_0x0052:
            r7.zzq(r14)     // Catch:{ all -> 0x0079 }
            if (r10 != 0) goto L_0x005c
            java.lang.Object r1 = r7.zzc(r13)     // Catch:{ all -> 0x0079 }
            r10 = r1
        L_0x005c:
            boolean r1 = r7.zzp(r10, r14)     // Catch:{ all -> 0x0079 }
            if (r1 != 0) goto L_0x000a
            int r14 = r12.zzl
        L_0x0064:
            int r15 = r12.zzm
            if (r14 >= r15) goto L_0x0073
            int[] r15 = r12.zzk
            r15 = r15[r14]
            java.lang.Object r10 = r12.zzG(r13, r15, r10, r7)
            int r14 = r14 + 1
            goto L_0x0064
        L_0x0073:
            if (r10 == 0) goto L_0x05c4
            r7.zzn(r13, r10)
            return
        L_0x0079:
            r14 = move-exception
            goto L_0x05c5
        L_0x007c:
            int r3 = r12.zzC(r2)     // Catch:{ all -> 0x0079 }
            int r4 = zzB(r3)     // Catch:{ zzgkz -> 0x059e }
            r5 = 1048575(0xfffff, float:1.469367E-39)
            switch(r4) {
                case 0: goto L_0x0571;
                case 1: goto L_0x0562;
                case 2: goto L_0x0553;
                case 3: goto L_0x0544;
                case 4: goto L_0x0535;
                case 5: goto L_0x0526;
                case 6: goto L_0x0517;
                case 7: goto L_0x0508;
                case 8: goto L_0x0500;
                case 9: goto L_0x04cf;
                case 10: goto L_0x04c0;
                case 11: goto L_0x04b1;
                case 12: goto L_0x048f;
                case 13: goto L_0x0480;
                case 14: goto L_0x0471;
                case 15: goto L_0x0462;
                case 16: goto L_0x0453;
                case 17: goto L_0x0422;
                case 18: goto L_0x0414;
                case 19: goto L_0x0406;
                case 20: goto L_0x03f8;
                case 21: goto L_0x03ea;
                case 22: goto L_0x03dc;
                case 23: goto L_0x03ce;
                case 24: goto L_0x03c0;
                case 25: goto L_0x03b2;
                case 26: goto L_0x0388;
                case 27: goto L_0x0376;
                case 28: goto L_0x0368;
                case 29: goto L_0x035a;
                case 30: goto L_0x0345;
                case 31: goto L_0x0337;
                case 32: goto L_0x0329;
                case 33: goto L_0x031b;
                case 34: goto L_0x030d;
                case 35: goto L_0x02ff;
                case 36: goto L_0x02f1;
                case 37: goto L_0x02e3;
                case 38: goto L_0x02d5;
                case 39: goto L_0x02c7;
                case 40: goto L_0x02b9;
                case 41: goto L_0x02ab;
                case 42: goto L_0x029d;
                case 43: goto L_0x028f;
                case 44: goto L_0x027a;
                case 45: goto L_0x026c;
                case 46: goto L_0x025e;
                case 47: goto L_0x0250;
                case 48: goto L_0x0242;
                case 49: goto L_0x0230;
                case 50: goto L_0x01fa;
                case 51: goto L_0x01e8;
                case 52: goto L_0x01d6;
                case 53: goto L_0x01c4;
                case 54: goto L_0x01b2;
                case 55: goto L_0x01a0;
                case 56: goto L_0x018e;
                case 57: goto L_0x017c;
                case 58: goto L_0x016a;
                case 59: goto L_0x0162;
                case 60: goto L_0x0131;
                case 61: goto L_0x0123;
                case 62: goto L_0x0111;
                case 63: goto L_0x00ec;
                case 64: goto L_0x00da;
                case 65: goto L_0x00c8;
                case 66: goto L_0x00b6;
                case 67: goto L_0x00a4;
                case 68: goto L_0x0092;
                default: goto L_0x008a;
            }     // Catch:{ zzgkz -> 0x059e }
        L_0x008a:
            if (r10 != 0) goto L_0x0581
            java.lang.Object r1 = r7.zzf()     // Catch:{ zzgkz -> 0x059e }
            goto L_0x0580
        L_0x0092:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzgkz -> 0x059e }
            com.google.android.gms.internal.ads.zzgmr r5 = r12.zzF(r2)     // Catch:{ zzgkz -> 0x059e }
            java.lang.Object r5 = r14.zzr(r5, r15)     // Catch:{ zzgkz -> 0x059e }
            com.google.android.gms.internal.ads.zzgns.zzv(r13, r3, r5)     // Catch:{ zzgkz -> 0x059e }
            r12.zzN(r13, r1, r2)     // Catch:{ zzgkz -> 0x059e }
            goto L_0x000a
        L_0x00a4:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzgkz -> 0x059e }
            long r5 = r14.zzn()     // Catch:{ zzgkz -> 0x059e }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ zzgkz -> 0x059e }
            com.google.android.gms.internal.ads.zzgns.zzv(r13, r3, r5)     // Catch:{ zzgkz -> 0x059e }
            r12.zzN(r13, r1, r2)     // Catch:{ zzgkz -> 0x059e }
            goto L_0x000a
        L_0x00b6:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzgkz -> 0x059e }
            int r5 = r14.zzi()     // Catch:{ zzgkz -> 0x059e }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ zzgkz -> 0x059e }
            com.google.android.gms.internal.ads.zzgns.zzv(r13, r3, r5)     // Catch:{ zzgkz -> 0x059e }
            r12.zzN(r13, r1, r2)     // Catch:{ zzgkz -> 0x059e }
            goto L_0x000a
        L_0x00c8:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzgkz -> 0x059e }
            long r5 = r14.zzm()     // Catch:{ zzgkz -> 0x059e }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ zzgkz -> 0x059e }
            com.google.android.gms.internal.ads.zzgns.zzv(r13, r3, r5)     // Catch:{ zzgkz -> 0x059e }
            r12.zzN(r13, r1, r2)     // Catch:{ zzgkz -> 0x059e }
            goto L_0x000a
        L_0x00da:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzgkz -> 0x059e }
            int r5 = r14.zzh()     // Catch:{ zzgkz -> 0x059e }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ zzgkz -> 0x059e }
            com.google.android.gms.internal.ads.zzgns.zzv(r13, r3, r5)     // Catch:{ zzgkz -> 0x059e }
            r12.zzN(r13, r1, r2)     // Catch:{ zzgkz -> 0x059e }
            goto L_0x000a
        L_0x00ec:
            int r4 = r14.zze()     // Catch:{ zzgkz -> 0x059e }
            com.google.android.gms.internal.ads.zzgks r6 = r12.zzE(r2)     // Catch:{ zzgkz -> 0x059e }
            if (r6 == 0) goto L_0x0103
            boolean r6 = r6.zza(r4)     // Catch:{ zzgkz -> 0x059e }
            if (r6 == 0) goto L_0x00fd
            goto L_0x0103
        L_0x00fd:
            java.lang.Object r10 = com.google.android.gms.internal.ads.zzgmt.zzD(r1, r4, r10, r7)     // Catch:{ zzgkz -> 0x059e }
            goto L_0x000a
        L_0x0103:
            r3 = r3 & r5
            long r5 = (long) r3     // Catch:{ zzgkz -> 0x059e }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)     // Catch:{ zzgkz -> 0x059e }
            com.google.android.gms.internal.ads.zzgns.zzv(r13, r5, r3)     // Catch:{ zzgkz -> 0x059e }
            r12.zzN(r13, r1, r2)     // Catch:{ zzgkz -> 0x059e }
            goto L_0x000a
        L_0x0111:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzgkz -> 0x059e }
            int r5 = r14.zzj()     // Catch:{ zzgkz -> 0x059e }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ zzgkz -> 0x059e }
            com.google.android.gms.internal.ads.zzgns.zzv(r13, r3, r5)     // Catch:{ zzgkz -> 0x059e }
            r12.zzN(r13, r1, r2)     // Catch:{ zzgkz -> 0x059e }
            goto L_0x000a
        L_0x0123:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzgkz -> 0x059e }
            com.google.android.gms.internal.ads.zzgjg r5 = r14.zzp()     // Catch:{ zzgkz -> 0x059e }
            com.google.android.gms.internal.ads.zzgns.zzv(r13, r3, r5)     // Catch:{ zzgkz -> 0x059e }
            r12.zzN(r13, r1, r2)     // Catch:{ zzgkz -> 0x059e }
            goto L_0x000a
        L_0x0131:
            boolean r4 = r12.zzT(r13, r1, r2)     // Catch:{ zzgkz -> 0x059e }
            if (r4 == 0) goto L_0x014d
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzgkz -> 0x059e }
            java.lang.Object r5 = com.google.android.gms.internal.ads.zzgns.zzh(r13, r3)     // Catch:{ zzgkz -> 0x059e }
            com.google.android.gms.internal.ads.zzgmr r6 = r12.zzF(r2)     // Catch:{ zzgkz -> 0x059e }
            java.lang.Object r6 = r14.zzs(r6, r15)     // Catch:{ zzgkz -> 0x059e }
            java.lang.Object r5 = com.google.android.gms.internal.ads.zzgky.zzg(r5, r6)     // Catch:{ zzgkz -> 0x059e }
            com.google.android.gms.internal.ads.zzgns.zzv(r13, r3, r5)     // Catch:{ zzgkz -> 0x059e }
            goto L_0x015d
        L_0x014d:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzgkz -> 0x059e }
            com.google.android.gms.internal.ads.zzgmr r5 = r12.zzF(r2)     // Catch:{ zzgkz -> 0x059e }
            java.lang.Object r5 = r14.zzs(r5, r15)     // Catch:{ zzgkz -> 0x059e }
            com.google.android.gms.internal.ads.zzgns.zzv(r13, r3, r5)     // Catch:{ zzgkz -> 0x059e }
            r12.zzM(r13, r2)     // Catch:{ zzgkz -> 0x059e }
        L_0x015d:
            r12.zzN(r13, r1, r2)     // Catch:{ zzgkz -> 0x059e }
            goto L_0x000a
        L_0x0162:
            r12.zzL(r13, r3, r14)     // Catch:{ zzgkz -> 0x059e }
            r12.zzN(r13, r1, r2)     // Catch:{ zzgkz -> 0x059e }
            goto L_0x000a
        L_0x016a:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzgkz -> 0x059e }
            boolean r5 = r14.zzN()     // Catch:{ zzgkz -> 0x059e }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ zzgkz -> 0x059e }
            com.google.android.gms.internal.ads.zzgns.zzv(r13, r3, r5)     // Catch:{ zzgkz -> 0x059e }
            r12.zzN(r13, r1, r2)     // Catch:{ zzgkz -> 0x059e }
            goto L_0x000a
        L_0x017c:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzgkz -> 0x059e }
            int r5 = r14.zzf()     // Catch:{ zzgkz -> 0x059e }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ zzgkz -> 0x059e }
            com.google.android.gms.internal.ads.zzgns.zzv(r13, r3, r5)     // Catch:{ zzgkz -> 0x059e }
            r12.zzN(r13, r1, r2)     // Catch:{ zzgkz -> 0x059e }
            goto L_0x000a
        L_0x018e:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzgkz -> 0x059e }
            long r5 = r14.zzk()     // Catch:{ zzgkz -> 0x059e }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ zzgkz -> 0x059e }
            com.google.android.gms.internal.ads.zzgns.zzv(r13, r3, r5)     // Catch:{ zzgkz -> 0x059e }
            r12.zzN(r13, r1, r2)     // Catch:{ zzgkz -> 0x059e }
            goto L_0x000a
        L_0x01a0:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzgkz -> 0x059e }
            int r5 = r14.zzg()     // Catch:{ zzgkz -> 0x059e }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ zzgkz -> 0x059e }
            com.google.android.gms.internal.ads.zzgns.zzv(r13, r3, r5)     // Catch:{ zzgkz -> 0x059e }
            r12.zzN(r13, r1, r2)     // Catch:{ zzgkz -> 0x059e }
            goto L_0x000a
        L_0x01b2:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzgkz -> 0x059e }
            long r5 = r14.zzo()     // Catch:{ zzgkz -> 0x059e }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ zzgkz -> 0x059e }
            com.google.android.gms.internal.ads.zzgns.zzv(r13, r3, r5)     // Catch:{ zzgkz -> 0x059e }
            r12.zzN(r13, r1, r2)     // Catch:{ zzgkz -> 0x059e }
            goto L_0x000a
        L_0x01c4:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzgkz -> 0x059e }
            long r5 = r14.zzl()     // Catch:{ zzgkz -> 0x059e }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ zzgkz -> 0x059e }
            com.google.android.gms.internal.ads.zzgns.zzv(r13, r3, r5)     // Catch:{ zzgkz -> 0x059e }
            r12.zzN(r13, r1, r2)     // Catch:{ zzgkz -> 0x059e }
            goto L_0x000a
        L_0x01d6:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzgkz -> 0x059e }
            float r5 = r14.zzb()     // Catch:{ zzgkz -> 0x059e }
            java.lang.Float r5 = java.lang.Float.valueOf(r5)     // Catch:{ zzgkz -> 0x059e }
            com.google.android.gms.internal.ads.zzgns.zzv(r13, r3, r5)     // Catch:{ zzgkz -> 0x059e }
            r12.zzN(r13, r1, r2)     // Catch:{ zzgkz -> 0x059e }
            goto L_0x000a
        L_0x01e8:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzgkz -> 0x059e }
            double r5 = r14.zza()     // Catch:{ zzgkz -> 0x059e }
            java.lang.Double r5 = java.lang.Double.valueOf(r5)     // Catch:{ zzgkz -> 0x059e }
            com.google.android.gms.internal.ads.zzgns.zzv(r13, r3, r5)     // Catch:{ zzgkz -> 0x059e }
            r12.zzN(r13, r1, r2)     // Catch:{ zzgkz -> 0x059e }
            goto L_0x000a
        L_0x01fa:
            java.lang.Object r1 = r12.zzH(r2)     // Catch:{ zzgkz -> 0x059e }
            int r2 = r12.zzC(r2)     // Catch:{ zzgkz -> 0x059e }
            r2 = r2 & r5
            long r2 = (long) r2     // Catch:{ zzgkz -> 0x059e }
            java.lang.Object r4 = com.google.android.gms.internal.ads.zzgns.zzh(r13, r2)     // Catch:{ zzgkz -> 0x059e }
            if (r4 == 0) goto L_0x0220
            boolean r5 = com.google.android.gms.internal.ads.zzglt.zzb(r4)     // Catch:{ zzgkz -> 0x059e }
            if (r5 == 0) goto L_0x022b
            com.google.android.gms.internal.ads.zzgls r5 = com.google.android.gms.internal.ads.zzgls.zza()     // Catch:{ zzgkz -> 0x059e }
            com.google.android.gms.internal.ads.zzgls r5 = r5.zzb()     // Catch:{ zzgkz -> 0x059e }
            com.google.android.gms.internal.ads.zzglt.zzc(r5, r4)     // Catch:{ zzgkz -> 0x059e }
            com.google.android.gms.internal.ads.zzgns.zzv(r13, r2, r5)     // Catch:{ zzgkz -> 0x059e }
            r4 = r5
            goto L_0x022b
        L_0x0220:
            com.google.android.gms.internal.ads.zzgls r4 = com.google.android.gms.internal.ads.zzgls.zza()     // Catch:{ zzgkz -> 0x059e }
            com.google.android.gms.internal.ads.zzgls r4 = r4.zzb()     // Catch:{ zzgkz -> 0x059e }
            com.google.android.gms.internal.ads.zzgns.zzv(r13, r2, r4)     // Catch:{ zzgkz -> 0x059e }
        L_0x022b:
            com.google.android.gms.internal.ads.zzgls r4 = (com.google.android.gms.internal.ads.zzgls) r4     // Catch:{ zzgkz -> 0x059e }
            com.google.android.gms.internal.ads.zzglr r1 = (com.google.android.gms.internal.ads.zzglr) r1     // Catch:{ zzgkz -> 0x059e }
            throw r9     // Catch:{ zzgkz -> 0x059e }
        L_0x0230:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzgkz -> 0x059e }
            com.google.android.gms.internal.ads.zzgmr r1 = r12.zzF(r2)     // Catch:{ zzgkz -> 0x059e }
            com.google.android.gms.internal.ads.zzglm r2 = r12.zzn     // Catch:{ zzgkz -> 0x059e }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzgkz -> 0x059e }
            r14.zzC(r2, r1, r15)     // Catch:{ zzgkz -> 0x059e }
            goto L_0x000a
        L_0x0242:
            com.google.android.gms.internal.ads.zzglm r1 = r12.zzn     // Catch:{ zzgkz -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzgkz -> 0x059e }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzgkz -> 0x059e }
            r14.zzJ(r1)     // Catch:{ zzgkz -> 0x059e }
            goto L_0x000a
        L_0x0250:
            com.google.android.gms.internal.ads.zzglm r1 = r12.zzn     // Catch:{ zzgkz -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzgkz -> 0x059e }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzgkz -> 0x059e }
            r14.zzI(r1)     // Catch:{ zzgkz -> 0x059e }
            goto L_0x000a
        L_0x025e:
            com.google.android.gms.internal.ads.zzglm r1 = r12.zzn     // Catch:{ zzgkz -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzgkz -> 0x059e }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzgkz -> 0x059e }
            r14.zzH(r1)     // Catch:{ zzgkz -> 0x059e }
            goto L_0x000a
        L_0x026c:
            com.google.android.gms.internal.ads.zzglm r1 = r12.zzn     // Catch:{ zzgkz -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzgkz -> 0x059e }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzgkz -> 0x059e }
            r14.zzG(r1)     // Catch:{ zzgkz -> 0x059e }
            goto L_0x000a
        L_0x027a:
            com.google.android.gms.internal.ads.zzglm r4 = r12.zzn     // Catch:{ zzgkz -> 0x059e }
            r3 = r3 & r5
            long r5 = (long) r3     // Catch:{ zzgkz -> 0x059e }
            java.util.List r3 = r4.zza(r13, r5)     // Catch:{ zzgkz -> 0x059e }
            r14.zzy(r3)     // Catch:{ zzgkz -> 0x059e }
            com.google.android.gms.internal.ads.zzgks r2 = r12.zzE(r2)     // Catch:{ zzgkz -> 0x059e }
            java.lang.Object r10 = com.google.android.gms.internal.ads.zzgmt.zzC(r1, r3, r2, r10, r7)     // Catch:{ zzgkz -> 0x059e }
            goto L_0x000a
        L_0x028f:
            com.google.android.gms.internal.ads.zzglm r1 = r12.zzn     // Catch:{ zzgkz -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzgkz -> 0x059e }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzgkz -> 0x059e }
            r14.zzL(r1)     // Catch:{ zzgkz -> 0x059e }
            goto L_0x000a
        L_0x029d:
            com.google.android.gms.internal.ads.zzglm r1 = r12.zzn     // Catch:{ zzgkz -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzgkz -> 0x059e }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzgkz -> 0x059e }
            r14.zzv(r1)     // Catch:{ zzgkz -> 0x059e }
            goto L_0x000a
        L_0x02ab:
            com.google.android.gms.internal.ads.zzglm r1 = r12.zzn     // Catch:{ zzgkz -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzgkz -> 0x059e }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzgkz -> 0x059e }
            r14.zzz(r1)     // Catch:{ zzgkz -> 0x059e }
            goto L_0x000a
        L_0x02b9:
            com.google.android.gms.internal.ads.zzglm r1 = r12.zzn     // Catch:{ zzgkz -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzgkz -> 0x059e }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzgkz -> 0x059e }
            r14.zzA(r1)     // Catch:{ zzgkz -> 0x059e }
            goto L_0x000a
        L_0x02c7:
            com.google.android.gms.internal.ads.zzglm r1 = r12.zzn     // Catch:{ zzgkz -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzgkz -> 0x059e }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzgkz -> 0x059e }
            r14.zzD(r1)     // Catch:{ zzgkz -> 0x059e }
            goto L_0x000a
        L_0x02d5:
            com.google.android.gms.internal.ads.zzglm r1 = r12.zzn     // Catch:{ zzgkz -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzgkz -> 0x059e }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzgkz -> 0x059e }
            r14.zzM(r1)     // Catch:{ zzgkz -> 0x059e }
            goto L_0x000a
        L_0x02e3:
            com.google.android.gms.internal.ads.zzglm r1 = r12.zzn     // Catch:{ zzgkz -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzgkz -> 0x059e }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzgkz -> 0x059e }
            r14.zzE(r1)     // Catch:{ zzgkz -> 0x059e }
            goto L_0x000a
        L_0x02f1:
            com.google.android.gms.internal.ads.zzglm r1 = r12.zzn     // Catch:{ zzgkz -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzgkz -> 0x059e }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzgkz -> 0x059e }
            r14.zzB(r1)     // Catch:{ zzgkz -> 0x059e }
            goto L_0x000a
        L_0x02ff:
            com.google.android.gms.internal.ads.zzglm r1 = r12.zzn     // Catch:{ zzgkz -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzgkz -> 0x059e }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzgkz -> 0x059e }
            r14.zzx(r1)     // Catch:{ zzgkz -> 0x059e }
            goto L_0x000a
        L_0x030d:
            com.google.android.gms.internal.ads.zzglm r1 = r12.zzn     // Catch:{ zzgkz -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzgkz -> 0x059e }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzgkz -> 0x059e }
            r14.zzJ(r1)     // Catch:{ zzgkz -> 0x059e }
            goto L_0x000a
        L_0x031b:
            com.google.android.gms.internal.ads.zzglm r1 = r12.zzn     // Catch:{ zzgkz -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzgkz -> 0x059e }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzgkz -> 0x059e }
            r14.zzI(r1)     // Catch:{ zzgkz -> 0x059e }
            goto L_0x000a
        L_0x0329:
            com.google.android.gms.internal.ads.zzglm r1 = r12.zzn     // Catch:{ zzgkz -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzgkz -> 0x059e }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzgkz -> 0x059e }
            r14.zzH(r1)     // Catch:{ zzgkz -> 0x059e }
            goto L_0x000a
        L_0x0337:
            com.google.android.gms.internal.ads.zzglm r1 = r12.zzn     // Catch:{ zzgkz -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzgkz -> 0x059e }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzgkz -> 0x059e }
            r14.zzG(r1)     // Catch:{ zzgkz -> 0x059e }
            goto L_0x000a
        L_0x0345:
            com.google.android.gms.internal.ads.zzglm r4 = r12.zzn     // Catch:{ zzgkz -> 0x059e }
            r3 = r3 & r5
            long r5 = (long) r3     // Catch:{ zzgkz -> 0x059e }
            java.util.List r3 = r4.zza(r13, r5)     // Catch:{ zzgkz -> 0x059e }
            r14.zzy(r3)     // Catch:{ zzgkz -> 0x059e }
            com.google.android.gms.internal.ads.zzgks r2 = r12.zzE(r2)     // Catch:{ zzgkz -> 0x059e }
            java.lang.Object r10 = com.google.android.gms.internal.ads.zzgmt.zzC(r1, r3, r2, r10, r7)     // Catch:{ zzgkz -> 0x059e }
            goto L_0x000a
        L_0x035a:
            com.google.android.gms.internal.ads.zzglm r1 = r12.zzn     // Catch:{ zzgkz -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzgkz -> 0x059e }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzgkz -> 0x059e }
            r14.zzL(r1)     // Catch:{ zzgkz -> 0x059e }
            goto L_0x000a
        L_0x0368:
            com.google.android.gms.internal.ads.zzglm r1 = r12.zzn     // Catch:{ zzgkz -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzgkz -> 0x059e }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzgkz -> 0x059e }
            r14.zzw(r1)     // Catch:{ zzgkz -> 0x059e }
            goto L_0x000a
        L_0x0376:
            com.google.android.gms.internal.ads.zzgmr r1 = r12.zzF(r2)     // Catch:{ zzgkz -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzgkz -> 0x059e }
            com.google.android.gms.internal.ads.zzglm r4 = r12.zzn     // Catch:{ zzgkz -> 0x059e }
            java.util.List r2 = r4.zza(r13, r2)     // Catch:{ zzgkz -> 0x059e }
            r14.zzF(r2, r1, r15)     // Catch:{ zzgkz -> 0x059e }
            goto L_0x000a
        L_0x0388:
            boolean r1 = zzP(r3)     // Catch:{ zzgkz -> 0x059e }
            if (r1 == 0) goto L_0x03a0
            com.google.android.gms.internal.ads.zzglm r1 = r12.zzn     // Catch:{ zzgkz -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzgkz -> 0x059e }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzgkz -> 0x059e }
            r2 = r14
            com.google.android.gms.internal.ads.zzgjp r2 = (com.google.android.gms.internal.ads.zzgjp) r2     // Catch:{ zzgkz -> 0x059e }
            r3 = 1
            r2.zzK(r1, r3)     // Catch:{ zzgkz -> 0x059e }
            goto L_0x000a
        L_0x03a0:
            com.google.android.gms.internal.ads.zzglm r1 = r12.zzn     // Catch:{ zzgkz -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzgkz -> 0x059e }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzgkz -> 0x059e }
            r2 = r14
            com.google.android.gms.internal.ads.zzgjp r2 = (com.google.android.gms.internal.ads.zzgjp) r2     // Catch:{ zzgkz -> 0x059e }
            r3 = 0
            r2.zzK(r1, r3)     // Catch:{ zzgkz -> 0x059e }
            goto L_0x000a
        L_0x03b2:
            com.google.android.gms.internal.ads.zzglm r1 = r12.zzn     // Catch:{ zzgkz -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzgkz -> 0x059e }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzgkz -> 0x059e }
            r14.zzv(r1)     // Catch:{ zzgkz -> 0x059e }
            goto L_0x000a
        L_0x03c0:
            com.google.android.gms.internal.ads.zzglm r1 = r12.zzn     // Catch:{ zzgkz -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzgkz -> 0x059e }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzgkz -> 0x059e }
            r14.zzz(r1)     // Catch:{ zzgkz -> 0x059e }
            goto L_0x000a
        L_0x03ce:
            com.google.android.gms.internal.ads.zzglm r1 = r12.zzn     // Catch:{ zzgkz -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzgkz -> 0x059e }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzgkz -> 0x059e }
            r14.zzA(r1)     // Catch:{ zzgkz -> 0x059e }
            goto L_0x000a
        L_0x03dc:
            com.google.android.gms.internal.ads.zzglm r1 = r12.zzn     // Catch:{ zzgkz -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzgkz -> 0x059e }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzgkz -> 0x059e }
            r14.zzD(r1)     // Catch:{ zzgkz -> 0x059e }
            goto L_0x000a
        L_0x03ea:
            com.google.android.gms.internal.ads.zzglm r1 = r12.zzn     // Catch:{ zzgkz -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzgkz -> 0x059e }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzgkz -> 0x059e }
            r14.zzM(r1)     // Catch:{ zzgkz -> 0x059e }
            goto L_0x000a
        L_0x03f8:
            com.google.android.gms.internal.ads.zzglm r1 = r12.zzn     // Catch:{ zzgkz -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzgkz -> 0x059e }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzgkz -> 0x059e }
            r14.zzE(r1)     // Catch:{ zzgkz -> 0x059e }
            goto L_0x000a
        L_0x0406:
            com.google.android.gms.internal.ads.zzglm r1 = r12.zzn     // Catch:{ zzgkz -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzgkz -> 0x059e }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzgkz -> 0x059e }
            r14.zzB(r1)     // Catch:{ zzgkz -> 0x059e }
            goto L_0x000a
        L_0x0414:
            com.google.android.gms.internal.ads.zzglm r1 = r12.zzn     // Catch:{ zzgkz -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzgkz -> 0x059e }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzgkz -> 0x059e }
            r14.zzx(r1)     // Catch:{ zzgkz -> 0x059e }
            goto L_0x000a
        L_0x0422:
            boolean r1 = r12.zzQ(r13, r2)     // Catch:{ zzgkz -> 0x059e }
            if (r1 == 0) goto L_0x0440
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzgkz -> 0x059e }
            java.lang.Object r1 = com.google.android.gms.internal.ads.zzgns.zzh(r13, r3)     // Catch:{ zzgkz -> 0x059e }
            com.google.android.gms.internal.ads.zzgmr r2 = r12.zzF(r2)     // Catch:{ zzgkz -> 0x059e }
            java.lang.Object r2 = r14.zzr(r2, r15)     // Catch:{ zzgkz -> 0x059e }
            java.lang.Object r1 = com.google.android.gms.internal.ads.zzgky.zzg(r1, r2)     // Catch:{ zzgkz -> 0x059e }
            com.google.android.gms.internal.ads.zzgns.zzv(r13, r3, r1)     // Catch:{ zzgkz -> 0x059e }
            goto L_0x000a
        L_0x0440:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzgkz -> 0x059e }
            com.google.android.gms.internal.ads.zzgmr r1 = r12.zzF(r2)     // Catch:{ zzgkz -> 0x059e }
            java.lang.Object r1 = r14.zzr(r1, r15)     // Catch:{ zzgkz -> 0x059e }
            com.google.android.gms.internal.ads.zzgns.zzv(r13, r3, r1)     // Catch:{ zzgkz -> 0x059e }
            r12.zzM(r13, r2)     // Catch:{ zzgkz -> 0x059e }
            goto L_0x000a
        L_0x0453:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzgkz -> 0x059e }
            long r5 = r14.zzn()     // Catch:{ zzgkz -> 0x059e }
            com.google.android.gms.internal.ads.zzgns.zzu(r13, r3, r5)     // Catch:{ zzgkz -> 0x059e }
            r12.zzM(r13, r2)     // Catch:{ zzgkz -> 0x059e }
            goto L_0x000a
        L_0x0462:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzgkz -> 0x059e }
            int r1 = r14.zzi()     // Catch:{ zzgkz -> 0x059e }
            com.google.android.gms.internal.ads.zzgns.zzt(r13, r3, r1)     // Catch:{ zzgkz -> 0x059e }
            r12.zzM(r13, r2)     // Catch:{ zzgkz -> 0x059e }
            goto L_0x000a
        L_0x0471:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzgkz -> 0x059e }
            long r5 = r14.zzm()     // Catch:{ zzgkz -> 0x059e }
            com.google.android.gms.internal.ads.zzgns.zzu(r13, r3, r5)     // Catch:{ zzgkz -> 0x059e }
            r12.zzM(r13, r2)     // Catch:{ zzgkz -> 0x059e }
            goto L_0x000a
        L_0x0480:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzgkz -> 0x059e }
            int r1 = r14.zzh()     // Catch:{ zzgkz -> 0x059e }
            com.google.android.gms.internal.ads.zzgns.zzt(r13, r3, r1)     // Catch:{ zzgkz -> 0x059e }
            r12.zzM(r13, r2)     // Catch:{ zzgkz -> 0x059e }
            goto L_0x000a
        L_0x048f:
            int r4 = r14.zze()     // Catch:{ zzgkz -> 0x059e }
            com.google.android.gms.internal.ads.zzgks r6 = r12.zzE(r2)     // Catch:{ zzgkz -> 0x059e }
            if (r6 == 0) goto L_0x04a6
            boolean r6 = r6.zza(r4)     // Catch:{ zzgkz -> 0x059e }
            if (r6 == 0) goto L_0x04a0
            goto L_0x04a6
        L_0x04a0:
            java.lang.Object r10 = com.google.android.gms.internal.ads.zzgmt.zzD(r1, r4, r10, r7)     // Catch:{ zzgkz -> 0x059e }
            goto L_0x000a
        L_0x04a6:
            r1 = r3 & r5
            long r5 = (long) r1     // Catch:{ zzgkz -> 0x059e }
            com.google.android.gms.internal.ads.zzgns.zzt(r13, r5, r4)     // Catch:{ zzgkz -> 0x059e }
            r12.zzM(r13, r2)     // Catch:{ zzgkz -> 0x059e }
            goto L_0x000a
        L_0x04b1:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzgkz -> 0x059e }
            int r1 = r14.zzj()     // Catch:{ zzgkz -> 0x059e }
            com.google.android.gms.internal.ads.zzgns.zzt(r13, r3, r1)     // Catch:{ zzgkz -> 0x059e }
            r12.zzM(r13, r2)     // Catch:{ zzgkz -> 0x059e }
            goto L_0x000a
        L_0x04c0:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzgkz -> 0x059e }
            com.google.android.gms.internal.ads.zzgjg r1 = r14.zzp()     // Catch:{ zzgkz -> 0x059e }
            com.google.android.gms.internal.ads.zzgns.zzv(r13, r3, r1)     // Catch:{ zzgkz -> 0x059e }
            r12.zzM(r13, r2)     // Catch:{ zzgkz -> 0x059e }
            goto L_0x000a
        L_0x04cf:
            boolean r1 = r12.zzQ(r13, r2)     // Catch:{ zzgkz -> 0x059e }
            if (r1 == 0) goto L_0x04ed
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzgkz -> 0x059e }
            java.lang.Object r1 = com.google.android.gms.internal.ads.zzgns.zzh(r13, r3)     // Catch:{ zzgkz -> 0x059e }
            com.google.android.gms.internal.ads.zzgmr r2 = r12.zzF(r2)     // Catch:{ zzgkz -> 0x059e }
            java.lang.Object r2 = r14.zzs(r2, r15)     // Catch:{ zzgkz -> 0x059e }
            java.lang.Object r1 = com.google.android.gms.internal.ads.zzgky.zzg(r1, r2)     // Catch:{ zzgkz -> 0x059e }
            com.google.android.gms.internal.ads.zzgns.zzv(r13, r3, r1)     // Catch:{ zzgkz -> 0x059e }
            goto L_0x000a
        L_0x04ed:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzgkz -> 0x059e }
            com.google.android.gms.internal.ads.zzgmr r1 = r12.zzF(r2)     // Catch:{ zzgkz -> 0x059e }
            java.lang.Object r1 = r14.zzs(r1, r15)     // Catch:{ zzgkz -> 0x059e }
            com.google.android.gms.internal.ads.zzgns.zzv(r13, r3, r1)     // Catch:{ zzgkz -> 0x059e }
            r12.zzM(r13, r2)     // Catch:{ zzgkz -> 0x059e }
            goto L_0x000a
        L_0x0500:
            r12.zzL(r13, r3, r14)     // Catch:{ zzgkz -> 0x059e }
            r12.zzM(r13, r2)     // Catch:{ zzgkz -> 0x059e }
            goto L_0x000a
        L_0x0508:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzgkz -> 0x059e }
            boolean r1 = r14.zzN()     // Catch:{ zzgkz -> 0x059e }
            com.google.android.gms.internal.ads.zzgns.zzp(r13, r3, r1)     // Catch:{ zzgkz -> 0x059e }
            r12.zzM(r13, r2)     // Catch:{ zzgkz -> 0x059e }
            goto L_0x000a
        L_0x0517:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzgkz -> 0x059e }
            int r1 = r14.zzf()     // Catch:{ zzgkz -> 0x059e }
            com.google.android.gms.internal.ads.zzgns.zzt(r13, r3, r1)     // Catch:{ zzgkz -> 0x059e }
            r12.zzM(r13, r2)     // Catch:{ zzgkz -> 0x059e }
            goto L_0x000a
        L_0x0526:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzgkz -> 0x059e }
            long r5 = r14.zzk()     // Catch:{ zzgkz -> 0x059e }
            com.google.android.gms.internal.ads.zzgns.zzu(r13, r3, r5)     // Catch:{ zzgkz -> 0x059e }
            r12.zzM(r13, r2)     // Catch:{ zzgkz -> 0x059e }
            goto L_0x000a
        L_0x0535:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzgkz -> 0x059e }
            int r1 = r14.zzg()     // Catch:{ zzgkz -> 0x059e }
            com.google.android.gms.internal.ads.zzgns.zzt(r13, r3, r1)     // Catch:{ zzgkz -> 0x059e }
            r12.zzM(r13, r2)     // Catch:{ zzgkz -> 0x059e }
            goto L_0x000a
        L_0x0544:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzgkz -> 0x059e }
            long r5 = r14.zzo()     // Catch:{ zzgkz -> 0x059e }
            com.google.android.gms.internal.ads.zzgns.zzu(r13, r3, r5)     // Catch:{ zzgkz -> 0x059e }
            r12.zzM(r13, r2)     // Catch:{ zzgkz -> 0x059e }
            goto L_0x000a
        L_0x0553:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzgkz -> 0x059e }
            long r5 = r14.zzl()     // Catch:{ zzgkz -> 0x059e }
            com.google.android.gms.internal.ads.zzgns.zzu(r13, r3, r5)     // Catch:{ zzgkz -> 0x059e }
            r12.zzM(r13, r2)     // Catch:{ zzgkz -> 0x059e }
            goto L_0x000a
        L_0x0562:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzgkz -> 0x059e }
            float r1 = r14.zzb()     // Catch:{ zzgkz -> 0x059e }
            com.google.android.gms.internal.ads.zzgns.zzs(r13, r3, r1)     // Catch:{ zzgkz -> 0x059e }
            r12.zzM(r13, r2)     // Catch:{ zzgkz -> 0x059e }
            goto L_0x000a
        L_0x0571:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzgkz -> 0x059e }
            double r5 = r14.zza()     // Catch:{ zzgkz -> 0x059e }
            com.google.android.gms.internal.ads.zzgns.zzr(r13, r3, r5)     // Catch:{ zzgkz -> 0x059e }
            r12.zzM(r13, r2)     // Catch:{ zzgkz -> 0x059e }
            goto L_0x000a
        L_0x0580:
            r10 = r1
        L_0x0581:
            boolean r1 = r7.zzp(r10, r14)     // Catch:{ zzgkz -> 0x059e }
            if (r1 != 0) goto L_0x000a
            int r14 = r12.zzl
        L_0x0589:
            int r15 = r12.zzm
            if (r14 >= r15) goto L_0x0598
            int[] r15 = r12.zzk
            r15 = r15[r14]
            java.lang.Object r10 = r12.zzG(r13, r15, r10, r7)
            int r14 = r14 + 1
            goto L_0x0589
        L_0x0598:
            if (r10 == 0) goto L_0x05c4
            r7.zzn(r13, r10)
            return
        L_0x059e:
            r7.zzq(r14)     // Catch:{ all -> 0x0079 }
            if (r10 != 0) goto L_0x05a8
            java.lang.Object r1 = r7.zzc(r13)     // Catch:{ all -> 0x0079 }
            r10 = r1
        L_0x05a8:
            boolean r1 = r7.zzp(r10, r14)     // Catch:{ all -> 0x0079 }
            if (r1 != 0) goto L_0x000a
            int r14 = r12.zzl
        L_0x05b0:
            int r15 = r12.zzm
            if (r14 >= r15) goto L_0x05bf
            int[] r15 = r12.zzk
            r15 = r15[r14]
            java.lang.Object r10 = r12.zzG(r13, r15, r10, r7)
            int r14 = r14 + 1
            goto L_0x05b0
        L_0x05bf:
            if (r10 == 0) goto L_0x05c4
            r7.zzn(r13, r10)
        L_0x05c4:
            return
        L_0x05c5:
            int r15 = r12.zzl
        L_0x05c7:
            int r0 = r12.zzm
            if (r15 >= r0) goto L_0x05d6
            int[] r0 = r12.zzk
            r0 = r0[r15]
            java.lang.Object r10 = r12.zzG(r13, r0, r10, r7)
            int r15 = r15 + 1
            goto L_0x05c7
        L_0x05d6:
            if (r10 == 0) goto L_0x05db
            r7.zzn(r13, r10)
        L_0x05db:
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgmb.zzh(java.lang.Object, com.google.android.gms.internal.ads.zzgmj, com.google.android.gms.internal.ads.zzgka):void");
    }

    public final void zzi(Object obj, byte[] bArr, int i, int i2, zzgis zzgis) throws IOException {
        if (this.zzj) {
            zzv(obj, bArr, i, i2, zzgis);
        } else {
            zzc(obj, bArr, i, i2, 0, zzgis);
        }
    }

    public final boolean zzj(Object obj, Object obj2) {
        boolean z;
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int zzC = zzC(i);
            long j = (long) (zzC & 1048575);
            switch (zzB(zzC)) {
                case 0:
                    if (zzO(obj, obj2, i) && Double.doubleToLongBits(zzgns.zzb(obj, j)) == Double.doubleToLongBits(zzgns.zzb(obj2, j))) {
                        continue;
                    }
                case 1:
                    if (zzO(obj, obj2, i) && Float.floatToIntBits(zzgns.zzc(obj, j)) == Float.floatToIntBits(zzgns.zzc(obj2, j))) {
                        continue;
                    }
                case 2:
                    if (zzO(obj, obj2, i) && zzgns.zzf(obj, j) == zzgns.zzf(obj2, j)) {
                        continue;
                    }
                case 3:
                    if (zzO(obj, obj2, i) && zzgns.zzf(obj, j) == zzgns.zzf(obj2, j)) {
                        continue;
                    }
                case 4:
                    if (zzO(obj, obj2, i) && zzgns.zzd(obj, j) == zzgns.zzd(obj2, j)) {
                        continue;
                    }
                case 5:
                    if (zzO(obj, obj2, i) && zzgns.zzf(obj, j) == zzgns.zzf(obj2, j)) {
                        continue;
                    }
                case 6:
                    if (zzO(obj, obj2, i) && zzgns.zzd(obj, j) == zzgns.zzd(obj2, j)) {
                        continue;
                    }
                case 7:
                    if (zzO(obj, obj2, i) && zzgns.zzz(obj, j) == zzgns.zzz(obj2, j)) {
                        continue;
                    }
                case 8:
                    if (zzO(obj, obj2, i) && zzgmt.zzH(zzgns.zzh(obj, j), zzgns.zzh(obj2, j))) {
                        continue;
                    }
                case 9:
                    if (zzO(obj, obj2, i) && zzgmt.zzH(zzgns.zzh(obj, j), zzgns.zzh(obj2, j))) {
                        continue;
                    }
                case 10:
                    if (zzO(obj, obj2, i) && zzgmt.zzH(zzgns.zzh(obj, j), zzgns.zzh(obj2, j))) {
                        continue;
                    }
                case 11:
                    if (zzO(obj, obj2, i) && zzgns.zzd(obj, j) == zzgns.zzd(obj2, j)) {
                        continue;
                    }
                case 12:
                    if (zzO(obj, obj2, i) && zzgns.zzd(obj, j) == zzgns.zzd(obj2, j)) {
                        continue;
                    }
                case 13:
                    if (zzO(obj, obj2, i) && zzgns.zzd(obj, j) == zzgns.zzd(obj2, j)) {
                        continue;
                    }
                case 14:
                    if (zzO(obj, obj2, i) && zzgns.zzf(obj, j) == zzgns.zzf(obj2, j)) {
                        continue;
                    }
                case 15:
                    if (zzO(obj, obj2, i) && zzgns.zzd(obj, j) == zzgns.zzd(obj2, j)) {
                        continue;
                    }
                case 16:
                    if (zzO(obj, obj2, i) && zzgns.zzf(obj, j) == zzgns.zzf(obj2, j)) {
                        continue;
                    }
                case 17:
                    if (zzO(obj, obj2, i) && zzgmt.zzH(zzgns.zzh(obj, j), zzgns.zzh(obj2, j))) {
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
                    z = zzgmt.zzH(zzgns.zzh(obj, j), zzgns.zzh(obj2, j));
                    break;
                case 50:
                    z = zzgmt.zzH(zzgns.zzh(obj, j), zzgns.zzh(obj2, j));
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
                    if (zzgns.zzd(obj, zzz) == zzgns.zzd(obj2, zzz) && zzgmt.zzH(zzgns.zzh(obj, j), zzgns.zzh(obj2, j))) {
                        continue;
                    }
            }
            if (!z) {
                return false;
            }
        }
        if (!this.zzo.zzd(obj).equals(this.zzo.zzd(obj2))) {
            return false;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzp.zza(obj);
        this.zzp.zza(obj2);
        throw null;
    }

    public final boolean zzk(Object obj) {
        int i;
        int i2;
        Object obj2 = obj;
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
                    i4 = zzb.getInt(obj2, (long) i9);
                }
                i = i4;
                i2 = i9;
            } else {
                i2 = i3;
                i = i4;
            }
            if ((268435456 & zzC) != 0 && !zzR(obj, i6, i2, i, i11)) {
                return false;
            }
            int zzB = zzB(zzC);
            if (zzB != 9 && zzB != 17) {
                if (zzB != 27) {
                    if (zzB == 60 || zzB == 68) {
                        if (zzT(obj2, i7, i6) && !zzS(obj2, zzC, zzF(i6))) {
                            return false;
                        }
                    } else if (zzB != 49) {
                        if (zzB == 50 && !((zzgls) zzgns.zzh(obj2, (long) (zzC & 1048575))).isEmpty()) {
                            zzglr zzglr = (zzglr) zzH(i6);
                            throw null;
                        }
                    }
                }
                List list = (List) zzgns.zzh(obj2, (long) (zzC & 1048575));
                if (!list.isEmpty()) {
                    zzgmr zzF = zzF(i6);
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        if (!zzF.zzk(list.get(i12))) {
                            return false;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            } else if (zzR(obj, i6, i2, i, i11) && !zzS(obj2, zzC, zzF(i6))) {
                return false;
            }
            i5++;
            i3 = i2;
            i4 = i;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzp.zza(obj2);
        throw null;
    }

    public final void zzn(Object obj, zzgjw zzgjw) throws IOException {
        if (!this.zzj) {
            zzV(obj, zzgjw);
        } else if (!this.zzh) {
            int length = this.zzc.length;
            for (int i = 0; i < length; i += 3) {
                int zzC = zzC(i);
                int i2 = this.zzc[i];
                switch (zzB(zzC)) {
                    case 0:
                        if (!zzQ(obj, i)) {
                            break;
                        } else {
                            zzgjw.zzf(i2, zzgns.zzb(obj, (long) (zzC & 1048575)));
                            break;
                        }
                    case 1:
                        if (!zzQ(obj, i)) {
                            break;
                        } else {
                            zzgjw.zzo(i2, zzgns.zzc(obj, (long) (zzC & 1048575)));
                            break;
                        }
                    case 2:
                        if (!zzQ(obj, i)) {
                            break;
                        } else {
                            zzgjw.zzt(i2, zzgns.zzf(obj, (long) (zzC & 1048575)));
                            break;
                        }
                    case 3:
                        if (!zzQ(obj, i)) {
                            break;
                        } else {
                            zzgjw.zzJ(i2, zzgns.zzf(obj, (long) (zzC & 1048575)));
                            break;
                        }
                    case 4:
                        if (!zzQ(obj, i)) {
                            break;
                        } else {
                            zzgjw.zzr(i2, zzgns.zzd(obj, (long) (zzC & 1048575)));
                            break;
                        }
                    case 5:
                        if (!zzQ(obj, i)) {
                            break;
                        } else {
                            zzgjw.zzm(i2, zzgns.zzf(obj, (long) (zzC & 1048575)));
                            break;
                        }
                    case 6:
                        if (!zzQ(obj, i)) {
                            break;
                        } else {
                            zzgjw.zzk(i2, zzgns.zzd(obj, (long) (zzC & 1048575)));
                            break;
                        }
                    case 7:
                        if (!zzQ(obj, i)) {
                            break;
                        } else {
                            zzgjw.zzb(i2, zzgns.zzz(obj, (long) (zzC & 1048575)));
                            break;
                        }
                    case 8:
                        if (!zzQ(obj, i)) {
                            break;
                        } else {
                            zzX(i2, zzgns.zzh(obj, (long) (zzC & 1048575)), zzgjw);
                            break;
                        }
                    case 9:
                        if (!zzQ(obj, i)) {
                            break;
                        } else {
                            zzgjw.zzv(i2, zzgns.zzh(obj, (long) (zzC & 1048575)), zzF(i));
                            break;
                        }
                    case 10:
                        if (!zzQ(obj, i)) {
                            break;
                        } else {
                            zzgjw.zzd(i2, (zzgjg) zzgns.zzh(obj, (long) (zzC & 1048575)));
                            break;
                        }
                    case 11:
                        if (!zzQ(obj, i)) {
                            break;
                        } else {
                            zzgjw.zzH(i2, zzgns.zzd(obj, (long) (zzC & 1048575)));
                            break;
                        }
                    case 12:
                        if (!zzQ(obj, i)) {
                            break;
                        } else {
                            zzgjw.zzi(i2, zzgns.zzd(obj, (long) (zzC & 1048575)));
                            break;
                        }
                    case 13:
                        if (!zzQ(obj, i)) {
                            break;
                        } else {
                            zzgjw.zzw(i2, zzgns.zzd(obj, (long) (zzC & 1048575)));
                            break;
                        }
                    case 14:
                        if (!zzQ(obj, i)) {
                            break;
                        } else {
                            zzgjw.zzy(i2, zzgns.zzf(obj, (long) (zzC & 1048575)));
                            break;
                        }
                    case 15:
                        if (!zzQ(obj, i)) {
                            break;
                        } else {
                            zzgjw.zzA(i2, zzgns.zzd(obj, (long) (zzC & 1048575)));
                            break;
                        }
                    case 16:
                        if (!zzQ(obj, i)) {
                            break;
                        } else {
                            zzgjw.zzC(i2, zzgns.zzf(obj, (long) (zzC & 1048575)));
                            break;
                        }
                    case 17:
                        if (!zzQ(obj, i)) {
                            break;
                        } else {
                            zzgjw.zzq(i2, zzgns.zzh(obj, (long) (zzC & 1048575)), zzF(i));
                            break;
                        }
                    case 18:
                        zzgmt.zzL(i2, (List) zzgns.zzh(obj, (long) (zzC & 1048575)), zzgjw, false);
                        break;
                    case 19:
                        zzgmt.zzP(i2, (List) zzgns.zzh(obj, (long) (zzC & 1048575)), zzgjw, false);
                        break;
                    case 20:
                        zzgmt.zzS(i2, (List) zzgns.zzh(obj, (long) (zzC & 1048575)), zzgjw, false);
                        break;
                    case 21:
                        zzgmt.zzaa(i2, (List) zzgns.zzh(obj, (long) (zzC & 1048575)), zzgjw, false);
                        break;
                    case 22:
                        zzgmt.zzR(i2, (List) zzgns.zzh(obj, (long) (zzC & 1048575)), zzgjw, false);
                        break;
                    case 23:
                        zzgmt.zzO(i2, (List) zzgns.zzh(obj, (long) (zzC & 1048575)), zzgjw, false);
                        break;
                    case 24:
                        zzgmt.zzN(i2, (List) zzgns.zzh(obj, (long) (zzC & 1048575)), zzgjw, false);
                        break;
                    case 25:
                        zzgmt.zzJ(i2, (List) zzgns.zzh(obj, (long) (zzC & 1048575)), zzgjw, false);
                        break;
                    case 26:
                        zzgmt.zzY(i2, (List) zzgns.zzh(obj, (long) (zzC & 1048575)), zzgjw);
                        break;
                    case 27:
                        zzgmt.zzT(i2, (List) zzgns.zzh(obj, (long) (zzC & 1048575)), zzgjw, zzF(i));
                        break;
                    case 28:
                        zzgmt.zzK(i2, (List) zzgns.zzh(obj, (long) (zzC & 1048575)), zzgjw);
                        break;
                    case 29:
                        zzgmt.zzZ(i2, (List) zzgns.zzh(obj, (long) (zzC & 1048575)), zzgjw, false);
                        break;
                    case 30:
                        zzgmt.zzM(i2, (List) zzgns.zzh(obj, (long) (zzC & 1048575)), zzgjw, false);
                        break;
                    case 31:
                        zzgmt.zzU(i2, (List) zzgns.zzh(obj, (long) (zzC & 1048575)), zzgjw, false);
                        break;
                    case 32:
                        zzgmt.zzV(i2, (List) zzgns.zzh(obj, (long) (zzC & 1048575)), zzgjw, false);
                        break;
                    case 33:
                        zzgmt.zzW(i2, (List) zzgns.zzh(obj, (long) (zzC & 1048575)), zzgjw, false);
                        break;
                    case 34:
                        zzgmt.zzX(i2, (List) zzgns.zzh(obj, (long) (zzC & 1048575)), zzgjw, false);
                        break;
                    case 35:
                        zzgmt.zzL(i2, (List) zzgns.zzh(obj, (long) (zzC & 1048575)), zzgjw, true);
                        break;
                    case 36:
                        zzgmt.zzP(i2, (List) zzgns.zzh(obj, (long) (zzC & 1048575)), zzgjw, true);
                        break;
                    case 37:
                        zzgmt.zzS(i2, (List) zzgns.zzh(obj, (long) (zzC & 1048575)), zzgjw, true);
                        break;
                    case 38:
                        zzgmt.zzaa(i2, (List) zzgns.zzh(obj, (long) (zzC & 1048575)), zzgjw, true);
                        break;
                    case 39:
                        zzgmt.zzR(i2, (List) zzgns.zzh(obj, (long) (zzC & 1048575)), zzgjw, true);
                        break;
                    case 40:
                        zzgmt.zzO(i2, (List) zzgns.zzh(obj, (long) (zzC & 1048575)), zzgjw, true);
                        break;
                    case 41:
                        zzgmt.zzN(i2, (List) zzgns.zzh(obj, (long) (zzC & 1048575)), zzgjw, true);
                        break;
                    case 42:
                        zzgmt.zzJ(i2, (List) zzgns.zzh(obj, (long) (zzC & 1048575)), zzgjw, true);
                        break;
                    case 43:
                        zzgmt.zzZ(i2, (List) zzgns.zzh(obj, (long) (zzC & 1048575)), zzgjw, true);
                        break;
                    case 44:
                        zzgmt.zzM(i2, (List) zzgns.zzh(obj, (long) (zzC & 1048575)), zzgjw, true);
                        break;
                    case 45:
                        zzgmt.zzU(i2, (List) zzgns.zzh(obj, (long) (zzC & 1048575)), zzgjw, true);
                        break;
                    case 46:
                        zzgmt.zzV(i2, (List) zzgns.zzh(obj, (long) (zzC & 1048575)), zzgjw, true);
                        break;
                    case 47:
                        zzgmt.zzW(i2, (List) zzgns.zzh(obj, (long) (zzC & 1048575)), zzgjw, true);
                        break;
                    case 48:
                        zzgmt.zzX(i2, (List) zzgns.zzh(obj, (long) (zzC & 1048575)), zzgjw, true);
                        break;
                    case 49:
                        zzgmt.zzQ(i2, (List) zzgns.zzh(obj, (long) (zzC & 1048575)), zzgjw, zzF(i));
                        break;
                    case 50:
                        zzW(zzgjw, i2, zzgns.zzh(obj, (long) (zzC & 1048575)), i);
                        break;
                    case 51:
                        if (!zzT(obj, i2, i)) {
                            break;
                        } else {
                            zzgjw.zzf(i2, zzo(obj, (long) (zzC & 1048575)));
                            break;
                        }
                    case 52:
                        if (!zzT(obj, i2, i)) {
                            break;
                        } else {
                            zzgjw.zzo(i2, zzp(obj, (long) (zzC & 1048575)));
                            break;
                        }
                    case 53:
                        if (!zzT(obj, i2, i)) {
                            break;
                        } else {
                            zzgjw.zzt(i2, zzD(obj, (long) (zzC & 1048575)));
                            break;
                        }
                    case 54:
                        if (!zzT(obj, i2, i)) {
                            break;
                        } else {
                            zzgjw.zzJ(i2, zzD(obj, (long) (zzC & 1048575)));
                            break;
                        }
                    case 55:
                        if (!zzT(obj, i2, i)) {
                            break;
                        } else {
                            zzgjw.zzr(i2, zzs(obj, (long) (zzC & 1048575)));
                            break;
                        }
                    case 56:
                        if (!zzT(obj, i2, i)) {
                            break;
                        } else {
                            zzgjw.zzm(i2, zzD(obj, (long) (zzC & 1048575)));
                            break;
                        }
                    case 57:
                        if (!zzT(obj, i2, i)) {
                            break;
                        } else {
                            zzgjw.zzk(i2, zzs(obj, (long) (zzC & 1048575)));
                            break;
                        }
                    case 58:
                        if (!zzT(obj, i2, i)) {
                            break;
                        } else {
                            zzgjw.zzb(i2, zzU(obj, (long) (zzC & 1048575)));
                            break;
                        }
                    case 59:
                        if (!zzT(obj, i2, i)) {
                            break;
                        } else {
                            zzX(i2, zzgns.zzh(obj, (long) (zzC & 1048575)), zzgjw);
                            break;
                        }
                    case 60:
                        if (!zzT(obj, i2, i)) {
                            break;
                        } else {
                            zzgjw.zzv(i2, zzgns.zzh(obj, (long) (zzC & 1048575)), zzF(i));
                            break;
                        }
                    case 61:
                        if (!zzT(obj, i2, i)) {
                            break;
                        } else {
                            zzgjw.zzd(i2, (zzgjg) zzgns.zzh(obj, (long) (zzC & 1048575)));
                            break;
                        }
                    case 62:
                        if (!zzT(obj, i2, i)) {
                            break;
                        } else {
                            zzgjw.zzH(i2, zzs(obj, (long) (zzC & 1048575)));
                            break;
                        }
                    case 63:
                        if (!zzT(obj, i2, i)) {
                            break;
                        } else {
                            zzgjw.zzi(i2, zzs(obj, (long) (zzC & 1048575)));
                            break;
                        }
                    case 64:
                        if (!zzT(obj, i2, i)) {
                            break;
                        } else {
                            zzgjw.zzw(i2, zzs(obj, (long) (zzC & 1048575)));
                            break;
                        }
                    case 65:
                        if (!zzT(obj, i2, i)) {
                            break;
                        } else {
                            zzgjw.zzy(i2, zzD(obj, (long) (zzC & 1048575)));
                            break;
                        }
                    case 66:
                        if (!zzT(obj, i2, i)) {
                            break;
                        } else {
                            zzgjw.zzA(i2, zzs(obj, (long) (zzC & 1048575)));
                            break;
                        }
                    case 67:
                        if (!zzT(obj, i2, i)) {
                            break;
                        } else {
                            zzgjw.zzC(i2, zzD(obj, (long) (zzC & 1048575)));
                            break;
                        }
                    case 68:
                        if (!zzT(obj, i2, i)) {
                            break;
                        } else {
                            zzgjw.zzq(i2, zzgns.zzh(obj, (long) (zzC & 1048575)), zzF(i));
                            break;
                        }
                }
            }
            zzgni zzgni = this.zzo;
            zzgni.zzr(zzgni.zzd(obj), zzgjw);
        } else {
            this.zzp.zza(obj);
            throw null;
        }
    }
}
