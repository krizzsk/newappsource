package com.google.android.gms.internal.measurement;

import com.appboy.support.ValidationUtils;
import com.moovit.database.sqlite.SQLiteDatabase;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

final class zzlo<T> implements zzlw<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzmx.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzll zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzkz zzm;
    private final zzmn zzn;
    private final zzjr zzo;
    private final zzlq zzp;
    private final zzlg zzq;

    private zzlo(int[] iArr, Object[] objArr, int i, int i2, zzll zzll, boolean z, boolean z2, int[] iArr2, int i3, int i4, zzlq zzlq, zzkz zzkz, zzmn zzmn, zzjr zzjr, zzlg zzlg, byte[] bArr) {
        zzll zzll2 = zzll;
        zzjr zzjr2 = zzjr;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = z;
        boolean z3 = false;
        if (zzjr2 != null && zzjr2.zzc(zzll)) {
            z3 = true;
        }
        this.zzh = z3;
        this.zzj = iArr2;
        this.zzk = i3;
        this.zzl = i4;
        this.zzp = zzlq;
        this.zzm = zzkz;
        this.zzn = zzmn;
        this.zzo = zzjr2;
        this.zzg = zzll2;
        this.zzq = zzlg;
    }

    private static int zzA(int i) {
        return (i >>> 20) & ValidationUtils.APPBOY_STRING_MAX_LENGTH;
    }

    private final int zzB(int i) {
        return this.zzc[i + 1];
    }

    private static long zzC(Object obj, long j) {
        return ((Long) zzmx.zzf(obj, j)).longValue();
    }

    private final zzki zzD(int i) {
        int i2 = i / 3;
        return (zzki) this.zzd[i2 + i2 + 1];
    }

    private final zzlw zzE(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzlw zzlw = (zzlw) this.zzd[i3];
        if (zzlw != null) {
            return zzlw;
        }
        zzlw zzb2 = zzlt.zza().zzb((Class) this.zzd[i3 + 1]);
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
            StringBuilder h = C16759e.m42352h("Field ", str, " for ", name, " not found. Known fields are ");
            h.append(arrays);
            throw new RuntimeException(h.toString());
        }
    }

    private final void zzH(Object obj, Object obj2, int i) {
        long zzB = (long) (zzB(i) & 1048575);
        if (zzO(obj2, i)) {
            Object zzf2 = zzmx.zzf(obj, zzB);
            Object zzf3 = zzmx.zzf(obj2, zzB);
            if (zzf2 != null && zzf3 != null) {
                zzmx.zzs(obj, zzB, zzkm.zzg(zzf2, zzf3));
                zzJ(obj, i);
            } else if (zzf3 != null) {
                zzmx.zzs(obj, zzB, zzf3);
                zzJ(obj, i);
            }
        }
    }

    private final void zzI(Object obj, Object obj2, int i) {
        Object obj3;
        int zzB = zzB(i);
        int i2 = this.zzc[i];
        long j = (long) (zzB & 1048575);
        if (zzR(obj2, i2, i)) {
            if (zzR(obj, i2, i)) {
                obj3 = zzmx.zzf(obj, j);
            } else {
                obj3 = null;
            }
            Object zzf2 = zzmx.zzf(obj2, j);
            if (obj3 != null && zzf2 != null) {
                zzmx.zzs(obj, j, zzkm.zzg(obj3, zzf2));
                zzK(obj, i2, i);
            } else if (zzf2 != null) {
                zzmx.zzs(obj, j, zzf2);
                zzK(obj, i2, i);
            }
        }
    }

    private final void zzJ(Object obj, int i) {
        int zzy = zzy(i);
        long j = (long) (1048575 & zzy);
        if (j != 1048575) {
            zzmx.zzq(obj, j, (1 << (zzy >>> 20)) | zzmx.zzc(obj, j));
        }
    }

    private final void zzK(Object obj, int i, int i2) {
        zzmx.zzq(obj, (long) (zzy(i2) & 1048575), i);
    }

    private final void zzL(Object obj, zznf zznf) throws IOException {
        int i;
        Object obj2 = obj;
        zznf zznf2 = zznf;
        if (!this.zzh) {
            int length = this.zzc.length;
            Unsafe unsafe = zzb;
            int i2 = 1048575;
            int i3 = 0;
            int i4 = 0;
            int i5 = 1048575;
            while (i3 < length) {
                int zzB = zzB(i3);
                int[] iArr = this.zzc;
                int i6 = iArr[i3];
                int zzA = zzA(zzB);
                if (zzA <= 17) {
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
                long j = (long) (zzB & i2);
                switch (zzA) {
                    case 0:
                        if ((i4 & i) == 0) {
                            break;
                        } else {
                            zznf2.zzf(i6, zzmx.zza(obj2, j));
                            continue;
                        }
                    case 1:
                        if ((i4 & i) != 0) {
                            zznf2.zzo(i6, zzmx.zzb(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 2:
                        if ((i4 & i) != 0) {
                            zznf2.zzt(i6, unsafe.getLong(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 3:
                        if ((i4 & i) != 0) {
                            zznf2.zzJ(i6, unsafe.getLong(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 4:
                        if ((i4 & i) != 0) {
                            zznf2.zzr(i6, unsafe.getInt(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 5:
                        if ((i4 & i) != 0) {
                            zznf2.zzm(i6, unsafe.getLong(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 6:
                        if ((i4 & i) != 0) {
                            zznf2.zzk(i6, unsafe.getInt(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 7:
                        if ((i4 & i) != 0) {
                            zznf2.zzb(i6, zzmx.zzw(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 8:
                        if ((i4 & i) != 0) {
                            zzT(i6, unsafe.getObject(obj2, j), zznf2);
                            break;
                        } else {
                            continue;
                        }
                    case 9:
                        if ((i4 & i) != 0) {
                            zznf2.zzv(i6, unsafe.getObject(obj2, j), zzE(i3));
                            break;
                        } else {
                            continue;
                        }
                    case 10:
                        if ((i4 & i) != 0) {
                            zznf2.zzd(i6, (zzjd) unsafe.getObject(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 11:
                        if ((i4 & i) != 0) {
                            zznf2.zzH(i6, unsafe.getInt(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 12:
                        if ((i4 & i) != 0) {
                            zznf2.zzi(i6, unsafe.getInt(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 13:
                        if ((i4 & i) != 0) {
                            zznf2.zzw(i6, unsafe.getInt(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 14:
                        if ((i4 & i) != 0) {
                            zznf2.zzy(i6, unsafe.getLong(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 15:
                        if ((i4 & i) != 0) {
                            zznf2.zzA(i6, unsafe.getInt(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 16:
                        if ((i4 & i) != 0) {
                            zznf2.zzC(i6, unsafe.getLong(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 17:
                        if ((i4 & i) != 0) {
                            zznf2.zzq(i6, unsafe.getObject(obj2, j), zzE(i3));
                            break;
                        } else {
                            continue;
                        }
                    case 18:
                        zzly.zzJ(this.zzc[i3], (List) unsafe.getObject(obj2, j), zznf2, false);
                        continue;
                    case 19:
                        zzly.zzN(this.zzc[i3], (List) unsafe.getObject(obj2, j), zznf2, false);
                        continue;
                    case 20:
                        zzly.zzQ(this.zzc[i3], (List) unsafe.getObject(obj2, j), zznf2, false);
                        continue;
                    case 21:
                        zzly.zzY(this.zzc[i3], (List) unsafe.getObject(obj2, j), zznf2, false);
                        continue;
                    case 22:
                        zzly.zzP(this.zzc[i3], (List) unsafe.getObject(obj2, j), zznf2, false);
                        continue;
                    case 23:
                        zzly.zzM(this.zzc[i3], (List) unsafe.getObject(obj2, j), zznf2, false);
                        continue;
                    case 24:
                        zzly.zzL(this.zzc[i3], (List) unsafe.getObject(obj2, j), zznf2, false);
                        continue;
                    case 25:
                        zzly.zzH(this.zzc[i3], (List) unsafe.getObject(obj2, j), zznf2, false);
                        continue;
                    case 26:
                        zzly.zzW(this.zzc[i3], (List) unsafe.getObject(obj2, j), zznf2);
                        break;
                    case 27:
                        zzly.zzR(this.zzc[i3], (List) unsafe.getObject(obj2, j), zznf2, zzE(i3));
                        break;
                    case 28:
                        zzly.zzI(this.zzc[i3], (List) unsafe.getObject(obj2, j), zznf2);
                        break;
                    case 29:
                        zzly.zzX(this.zzc[i3], (List) unsafe.getObject(obj2, j), zznf2, false);
                        break;
                    case 30:
                        zzly.zzK(this.zzc[i3], (List) unsafe.getObject(obj2, j), zznf2, false);
                        break;
                    case 31:
                        zzly.zzS(this.zzc[i3], (List) unsafe.getObject(obj2, j), zznf2, false);
                        break;
                    case 32:
                        zzly.zzT(this.zzc[i3], (List) unsafe.getObject(obj2, j), zznf2, false);
                        break;
                    case 33:
                        zzly.zzU(this.zzc[i3], (List) unsafe.getObject(obj2, j), zznf2, false);
                        break;
                    case 34:
                        zzly.zzV(this.zzc[i3], (List) unsafe.getObject(obj2, j), zznf2, false);
                        break;
                    case 35:
                        zzly.zzJ(this.zzc[i3], (List) unsafe.getObject(obj2, j), zznf2, true);
                        break;
                    case 36:
                        zzly.zzN(this.zzc[i3], (List) unsafe.getObject(obj2, j), zznf2, true);
                        break;
                    case 37:
                        zzly.zzQ(this.zzc[i3], (List) unsafe.getObject(obj2, j), zznf2, true);
                        break;
                    case 38:
                        zzly.zzY(this.zzc[i3], (List) unsafe.getObject(obj2, j), zznf2, true);
                        break;
                    case 39:
                        zzly.zzP(this.zzc[i3], (List) unsafe.getObject(obj2, j), zznf2, true);
                        break;
                    case 40:
                        zzly.zzM(this.zzc[i3], (List) unsafe.getObject(obj2, j), zznf2, true);
                        break;
                    case 41:
                        zzly.zzL(this.zzc[i3], (List) unsafe.getObject(obj2, j), zznf2, true);
                        break;
                    case 42:
                        zzly.zzH(this.zzc[i3], (List) unsafe.getObject(obj2, j), zznf2, true);
                        break;
                    case 43:
                        zzly.zzX(this.zzc[i3], (List) unsafe.getObject(obj2, j), zznf2, true);
                        break;
                    case 44:
                        zzly.zzK(this.zzc[i3], (List) unsafe.getObject(obj2, j), zznf2, true);
                        break;
                    case 45:
                        zzly.zzS(this.zzc[i3], (List) unsafe.getObject(obj2, j), zznf2, true);
                        break;
                    case 46:
                        zzly.zzT(this.zzc[i3], (List) unsafe.getObject(obj2, j), zznf2, true);
                        break;
                    case 47:
                        zzly.zzU(this.zzc[i3], (List) unsafe.getObject(obj2, j), zznf2, true);
                        break;
                    case 48:
                        zzly.zzV(this.zzc[i3], (List) unsafe.getObject(obj2, j), zznf2, true);
                        break;
                    case 49:
                        zzly.zzO(this.zzc[i3], (List) unsafe.getObject(obj2, j), zznf2, zzE(i3));
                        break;
                    case 50:
                        zzM(zznf2, i6, unsafe.getObject(obj2, j), i3);
                        break;
                    case 51:
                        if (zzR(obj2, i6, i3)) {
                            zznf2.zzf(i6, zzn(obj2, j));
                            break;
                        }
                        break;
                    case 52:
                        if (zzR(obj2, i6, i3)) {
                            zznf2.zzo(i6, zzo(obj2, j));
                            break;
                        }
                        break;
                    case 53:
                        if (zzR(obj2, i6, i3)) {
                            zznf2.zzt(i6, zzC(obj2, j));
                            break;
                        }
                        break;
                    case 54:
                        if (zzR(obj2, i6, i3)) {
                            zznf2.zzJ(i6, zzC(obj2, j));
                            break;
                        }
                        break;
                    case 55:
                        if (zzR(obj2, i6, i3)) {
                            zznf2.zzr(i6, zzr(obj2, j));
                            break;
                        }
                        break;
                    case 56:
                        if (zzR(obj2, i6, i3)) {
                            zznf2.zzm(i6, zzC(obj2, j));
                            break;
                        }
                        break;
                    case 57:
                        if (zzR(obj2, i6, i3)) {
                            zznf2.zzk(i6, zzr(obj2, j));
                            break;
                        }
                        break;
                    case 58:
                        if (zzR(obj2, i6, i3)) {
                            zznf2.zzb(i6, zzS(obj2, j));
                            break;
                        }
                        break;
                    case 59:
                        if (zzR(obj2, i6, i3)) {
                            zzT(i6, unsafe.getObject(obj2, j), zznf2);
                            break;
                        }
                        break;
                    case 60:
                        if (zzR(obj2, i6, i3)) {
                            zznf2.zzv(i6, unsafe.getObject(obj2, j), zzE(i3));
                            break;
                        }
                        break;
                    case 61:
                        if (zzR(obj2, i6, i3)) {
                            zznf2.zzd(i6, (zzjd) unsafe.getObject(obj2, j));
                            break;
                        }
                        break;
                    case 62:
                        if (zzR(obj2, i6, i3)) {
                            zznf2.zzH(i6, zzr(obj2, j));
                            break;
                        }
                        break;
                    case 63:
                        if (zzR(obj2, i6, i3)) {
                            zznf2.zzi(i6, zzr(obj2, j));
                            break;
                        }
                        break;
                    case 64:
                        if (zzR(obj2, i6, i3)) {
                            zznf2.zzw(i6, zzr(obj2, j));
                            break;
                        }
                        break;
                    case 65:
                        if (zzR(obj2, i6, i3)) {
                            zznf2.zzy(i6, zzC(obj2, j));
                            break;
                        }
                        break;
                    case 66:
                        if (zzR(obj2, i6, i3)) {
                            zznf2.zzA(i6, zzr(obj2, j));
                            break;
                        }
                        break;
                    case 67:
                        if (zzR(obj2, i6, i3)) {
                            zznf2.zzC(i6, zzC(obj2, j));
                            break;
                        }
                        break;
                    case 68:
                        if (zzR(obj2, i6, i3)) {
                            zznf2.zzq(i6, unsafe.getObject(obj2, j), zzE(i3));
                            break;
                        }
                        break;
                }
                i3 += 3;
                i2 = 1048575;
            }
            zzmn zzmn = this.zzn;
            zzmn.zzi(zzmn.zzc(obj2), zznf2);
            return;
        }
        this.zzo.zza(obj2);
        throw null;
    }

    private final void zzM(zznf zznf, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            zzle zzle = (zzle) zzF(i2);
            throw null;
        }
    }

    private final boolean zzN(Object obj, Object obj2, int i) {
        return zzO(obj, i) == zzO(obj2, i);
    }

    private final boolean zzO(Object obj, int i) {
        int zzy = zzy(i);
        long j = (long) (zzy & 1048575);
        if (j == 1048575) {
            int zzB = zzB(i);
            long j2 = (long) (zzB & 1048575);
            switch (zzA(zzB)) {
                case 0:
                    if (Double.doubleToRawLongBits(zzmx.zza(obj, j2)) != 0) {
                        return true;
                    }
                    return false;
                case 1:
                    if (Float.floatToRawIntBits(zzmx.zzb(obj, j2)) != 0) {
                        return true;
                    }
                    return false;
                case 2:
                    if (zzmx.zzd(obj, j2) != 0) {
                        return true;
                    }
                    return false;
                case 3:
                    if (zzmx.zzd(obj, j2) != 0) {
                        return true;
                    }
                    return false;
                case 4:
                    if (zzmx.zzc(obj, j2) != 0) {
                        return true;
                    }
                    return false;
                case 5:
                    if (zzmx.zzd(obj, j2) != 0) {
                        return true;
                    }
                    return false;
                case 6:
                    if (zzmx.zzc(obj, j2) != 0) {
                        return true;
                    }
                    return false;
                case 7:
                    return zzmx.zzw(obj, j2);
                case 8:
                    Object zzf2 = zzmx.zzf(obj, j2);
                    if (zzf2 instanceof String) {
                        if (!((String) zzf2).isEmpty()) {
                            return true;
                        }
                        return false;
                    } else if (!(zzf2 instanceof zzjd)) {
                        throw new IllegalArgumentException();
                    } else if (!zzjd.zzb.equals(zzf2)) {
                        return true;
                    } else {
                        return false;
                    }
                case 9:
                    if (zzmx.zzf(obj, j2) != null) {
                        return true;
                    }
                    return false;
                case 10:
                    if (!zzjd.zzb.equals(zzmx.zzf(obj, j2))) {
                        return true;
                    }
                    return false;
                case 11:
                    if (zzmx.zzc(obj, j2) != 0) {
                        return true;
                    }
                    return false;
                case 12:
                    if (zzmx.zzc(obj, j2) != 0) {
                        return true;
                    }
                    return false;
                case 13:
                    if (zzmx.zzc(obj, j2) != 0) {
                        return true;
                    }
                    return false;
                case 14:
                    if (zzmx.zzd(obj, j2) != 0) {
                        return true;
                    }
                    return false;
                case 15:
                    if (zzmx.zzc(obj, j2) != 0) {
                        return true;
                    }
                    return false;
                case 16:
                    if (zzmx.zzd(obj, j2) != 0) {
                        return true;
                    }
                    return false;
                case 17:
                    if (zzmx.zzf(obj, j2) != null) {
                        return true;
                    }
                    return false;
                default:
                    throw new IllegalArgumentException();
            }
        } else if ((zzmx.zzc(obj, j) & (1 << (zzy >>> 20))) != 0) {
            return true;
        } else {
            return false;
        }
    }

    private final boolean zzP(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzO(obj, i) : (i3 & i4) != 0;
    }

    private static boolean zzQ(Object obj, int i, zzlw zzlw) {
        return zzlw.zzk(zzmx.zzf(obj, (long) (i & 1048575)));
    }

    private final boolean zzR(Object obj, int i, int i2) {
        if (zzmx.zzc(obj, (long) (zzy(i2) & 1048575)) == i) {
            return true;
        }
        return false;
    }

    private static boolean zzS(Object obj, long j) {
        return ((Boolean) zzmx.zzf(obj, j)).booleanValue();
    }

    private static final void zzT(int i, Object obj, zznf zznf) throws IOException {
        if (obj instanceof String) {
            zznf.zzF(i, (String) obj);
        } else {
            zznf.zzd(i, (zzjd) obj);
        }
    }

    public static zzmo zzd(Object obj) {
        zzke zzke = (zzke) obj;
        zzmo zzmo = zzke.zzc;
        if (zzmo != zzmo.zzc()) {
            return zzmo;
        }
        zzmo zze2 = zzmo.zze();
        zzke.zzc = zze2;
        return zze2;
    }

    public static zzlo zzl(Class cls, zzli zzli, zzlq zzlq, zzkz zzkz, zzmn zzmn, zzjr zzjr, zzlg zzlg) {
        if (zzli instanceof zzlv) {
            return zzm((zzlv) zzli, zzlq, zzkz, zzmn, zzjr, zzlg);
        }
        zzmk zzmk = (zzmk) zzli;
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:120:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0260  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x032f  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0378  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.measurement.zzlo zzm(com.google.android.gms.internal.measurement.zzlv r33, com.google.android.gms.internal.measurement.zzlq r34, com.google.android.gms.internal.measurement.zzkz r35, com.google.android.gms.internal.measurement.zzmn r36, com.google.android.gms.internal.measurement.zzjr r37, com.google.android.gms.internal.measurement.zzlg r38) {
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
            com.google.android.gms.internal.measurement.zzll r18 = r33.zza()
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
            com.google.android.gms.internal.measurement.zzlo r0 = new com.google.android.gms.internal.measurement.zzlo
            r4 = r0
            com.google.android.gms.internal.measurement.zzll r9 = r33.zza()
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlo.zzm(com.google.android.gms.internal.measurement.zzlv, com.google.android.gms.internal.measurement.zzlq, com.google.android.gms.internal.measurement.zzkz, com.google.android.gms.internal.measurement.zzmn, com.google.android.gms.internal.measurement.zzjr, com.google.android.gms.internal.measurement.zzlg):com.google.android.gms.internal.measurement.zzlo");
    }

    private static double zzn(Object obj, long j) {
        return ((Double) zzmx.zzf(obj, j)).doubleValue();
    }

    private static float zzo(Object obj, long j) {
        return ((Float) zzmx.zzf(obj, j)).floatValue();
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
            boolean r1 = r14.zzR(r15, r8, r2)
            if (r1 == 0) goto L_0x0543
            java.lang.Object r1 = r0.getObject(r15, r12)
            com.google.android.gms.internal.measurement.zzll r1 = (com.google.android.gms.internal.measurement.zzll) r1
            com.google.android.gms.internal.measurement.zzlw r6 = r14.zzE(r2)
            int r1 = com.google.android.gms.internal.measurement.zzjl.zzu(r8, r1, r6)
            goto L_0x0497
        L_0x0054:
            boolean r6 = r14.zzR(r15, r8, r2)
            if (r6 == 0) goto L_0x0543
            long r6 = zzC(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.measurement.zzjl.zzA(r8)
            long r9 = r6 + r6
            long r6 = r6 >> r1
            long r6 = r6 ^ r9
            int r1 = com.google.android.gms.internal.measurement.zzjl.zzB(r6)
        L_0x006c:
            int r1 = r1 + r8
            goto L_0x0497
        L_0x006f:
            boolean r1 = r14.zzR(r15, r8, r2)
            if (r1 == 0) goto L_0x0543
            int r1 = zzr(r15, r12)
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.measurement.zzjl.zzA(r6)
            int r7 = r1 + r1
            int r1 = r1 >> 31
            r1 = r1 ^ r7
            int r1 = com.google.android.gms.internal.measurement.zzjl.zzA(r1)
            goto L_0x016d
        L_0x008a:
            boolean r1 = r14.zzR(r15, r8, r2)
            if (r1 == 0) goto L_0x0543
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.measurement.zzjl.zzA(r1)
            goto L_0x01b8
        L_0x0098:
            boolean r1 = r14.zzR(r15, r8, r2)
            if (r1 == 0) goto L_0x0543
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.measurement.zzjl.zzA(r1)
            goto L_0x01a8
        L_0x00a6:
            boolean r1 = r14.zzR(r15, r8, r2)
            if (r1 == 0) goto L_0x0543
            int r1 = zzr(r15, r12)
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.measurement.zzjl.zzA(r6)
            int r1 = com.google.android.gms.internal.measurement.zzjl.zzv(r1)
            goto L_0x016d
        L_0x00bc:
            boolean r1 = r14.zzR(r15, r8, r2)
            if (r1 == 0) goto L_0x0543
            int r1 = zzr(r15, r12)
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.measurement.zzjl.zzA(r6)
            int r1 = com.google.android.gms.internal.measurement.zzjl.zzA(r1)
            goto L_0x016d
        L_0x00d2:
            boolean r1 = r14.zzR(r15, r8, r2)
            if (r1 == 0) goto L_0x0543
            java.lang.Object r1 = r0.getObject(r15, r12)
            com.google.android.gms.internal.measurement.zzjd r1 = (com.google.android.gms.internal.measurement.zzjd) r1
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.measurement.zzjl.zzA(r6)
            int r1 = r1.zzd()
            int r7 = com.google.android.gms.internal.measurement.zzjl.zzA(r1)
            goto L_0x011f
        L_0x00ed:
            boolean r1 = r14.zzR(r15, r8, r2)
            if (r1 == 0) goto L_0x0543
            java.lang.Object r1 = r0.getObject(r15, r12)
            com.google.android.gms.internal.measurement.zzlw r6 = r14.zzE(r2)
            int r1 = com.google.android.gms.internal.measurement.zzly.zzo(r8, r1, r6)
            goto L_0x0497
        L_0x0101:
            boolean r1 = r14.zzR(r15, r8, r2)
            if (r1 == 0) goto L_0x0543
            java.lang.Object r1 = r0.getObject(r15, r12)
            boolean r6 = r1 instanceof com.google.android.gms.internal.measurement.zzjd
            if (r6 == 0) goto L_0x0123
            com.google.android.gms.internal.measurement.zzjd r1 = (com.google.android.gms.internal.measurement.zzjd) r1
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.measurement.zzjl.zzA(r6)
            int r1 = r1.zzd()
            int r7 = com.google.android.gms.internal.measurement.zzjl.zzA(r1)
        L_0x011f:
            int r7 = r7 + r1
            int r7 = r7 + r6
            goto L_0x0308
        L_0x0123:
            java.lang.String r1 = (java.lang.String) r1
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.measurement.zzjl.zzA(r6)
            int r1 = com.google.android.gms.internal.measurement.zzjl.zzy(r1)
            goto L_0x016d
        L_0x0130:
            boolean r1 = r14.zzR(r15, r8, r2)
            if (r1 == 0) goto L_0x0543
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.measurement.zzjl.zzA(r1)
        L_0x013c:
            int r1 = r1 + r11
            goto L_0x0497
        L_0x013f:
            boolean r1 = r14.zzR(r15, r8, r2)
            if (r1 == 0) goto L_0x0543
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.measurement.zzjl.zzA(r1)
            goto L_0x01a8
        L_0x014c:
            boolean r1 = r14.zzR(r15, r8, r2)
            if (r1 == 0) goto L_0x0543
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.measurement.zzjl.zzA(r1)
            goto L_0x01b8
        L_0x0159:
            boolean r1 = r14.zzR(r15, r8, r2)
            if (r1 == 0) goto L_0x0543
            int r1 = zzr(r15, r12)
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.measurement.zzjl.zzA(r6)
            int r1 = com.google.android.gms.internal.measurement.zzjl.zzv(r1)
        L_0x016d:
            int r1 = r1 + r6
            goto L_0x0497
        L_0x0170:
            boolean r1 = r14.zzR(r15, r8, r2)
            if (r1 == 0) goto L_0x0543
            long r6 = zzC(r15, r12)
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.measurement.zzjl.zzA(r1)
            int r6 = com.google.android.gms.internal.measurement.zzjl.zzB(r6)
            goto L_0x0199
        L_0x0185:
            boolean r1 = r14.zzR(r15, r8, r2)
            if (r1 == 0) goto L_0x0543
            long r6 = zzC(r15, r12)
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.measurement.zzjl.zzA(r1)
            int r6 = com.google.android.gms.internal.measurement.zzjl.zzB(r6)
        L_0x0199:
            int r1 = r1 + r6
            goto L_0x0497
        L_0x019c:
            boolean r1 = r14.zzR(r15, r8, r2)
            if (r1 == 0) goto L_0x0543
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.measurement.zzjl.zzA(r1)
        L_0x01a8:
            int r1 = r1 + 4
            goto L_0x0497
        L_0x01ac:
            boolean r1 = r14.zzR(r15, r8, r2)
            if (r1 == 0) goto L_0x0543
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.measurement.zzjl.zzA(r1)
        L_0x01b8:
            int r1 = r1 + 8
            goto L_0x0497
        L_0x01bc:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.lang.Object r6 = r14.zzF(r2)
            com.google.android.gms.internal.measurement.zzlg.zza(r8, r1, r6)
            goto L_0x0543
        L_0x01c9:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.measurement.zzlw r6 = r14.zzE(r2)
            int r1 = com.google.android.gms.internal.measurement.zzly.zzj(r8, r1, r6)
            goto L_0x0497
        L_0x01d9:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.measurement.zzly.zzt(r1)
            if (r1 <= 0) goto L_0x0543
            int r6 = com.google.android.gms.internal.measurement.zzjl.zzz(r8)
            int r7 = com.google.android.gms.internal.measurement.zzjl.zzA(r1)
            goto L_0x0306
        L_0x01ef:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.measurement.zzly.zzr(r1)
            if (r1 <= 0) goto L_0x0543
            int r6 = com.google.android.gms.internal.measurement.zzjl.zzz(r8)
            int r7 = com.google.android.gms.internal.measurement.zzjl.zzA(r1)
            goto L_0x0306
        L_0x0205:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.measurement.zzly.zzi(r1)
            if (r1 <= 0) goto L_0x0543
            int r6 = com.google.android.gms.internal.measurement.zzjl.zzz(r8)
            int r7 = com.google.android.gms.internal.measurement.zzjl.zzA(r1)
            goto L_0x0306
        L_0x021b:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.measurement.zzly.zzg(r1)
            if (r1 <= 0) goto L_0x0543
            int r6 = com.google.android.gms.internal.measurement.zzjl.zzz(r8)
            int r7 = com.google.android.gms.internal.measurement.zzjl.zzA(r1)
            goto L_0x0306
        L_0x0231:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.measurement.zzly.zze(r1)
            if (r1 <= 0) goto L_0x0543
            int r6 = com.google.android.gms.internal.measurement.zzjl.zzz(r8)
            int r7 = com.google.android.gms.internal.measurement.zzjl.zzA(r1)
            goto L_0x0306
        L_0x0247:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.measurement.zzly.zzw(r1)
            if (r1 <= 0) goto L_0x0543
            int r6 = com.google.android.gms.internal.measurement.zzjl.zzz(r8)
            int r7 = com.google.android.gms.internal.measurement.zzjl.zzA(r1)
            goto L_0x0306
        L_0x025d:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.measurement.zzly.zzb(r1)
            if (r1 <= 0) goto L_0x0543
            int r6 = com.google.android.gms.internal.measurement.zzjl.zzz(r8)
            int r7 = com.google.android.gms.internal.measurement.zzjl.zzA(r1)
            goto L_0x0306
        L_0x0273:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.measurement.zzly.zzg(r1)
            if (r1 <= 0) goto L_0x0543
            int r6 = com.google.android.gms.internal.measurement.zzjl.zzz(r8)
            int r7 = com.google.android.gms.internal.measurement.zzjl.zzA(r1)
            goto L_0x0306
        L_0x0289:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.measurement.zzly.zzi(r1)
            if (r1 <= 0) goto L_0x0543
            int r6 = com.google.android.gms.internal.measurement.zzjl.zzz(r8)
            int r7 = com.google.android.gms.internal.measurement.zzjl.zzA(r1)
            goto L_0x0306
        L_0x029e:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.measurement.zzly.zzl(r1)
            if (r1 <= 0) goto L_0x0543
            int r6 = com.google.android.gms.internal.measurement.zzjl.zzz(r8)
            int r7 = com.google.android.gms.internal.measurement.zzjl.zzA(r1)
            goto L_0x0306
        L_0x02b3:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.measurement.zzly.zzy(r1)
            if (r1 <= 0) goto L_0x0543
            int r6 = com.google.android.gms.internal.measurement.zzjl.zzz(r8)
            int r7 = com.google.android.gms.internal.measurement.zzjl.zzA(r1)
            goto L_0x0306
        L_0x02c8:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.measurement.zzly.zzn(r1)
            if (r1 <= 0) goto L_0x0543
            int r6 = com.google.android.gms.internal.measurement.zzjl.zzz(r8)
            int r7 = com.google.android.gms.internal.measurement.zzjl.zzA(r1)
            goto L_0x0306
        L_0x02dd:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.measurement.zzly.zzg(r1)
            if (r1 <= 0) goto L_0x0543
            int r6 = com.google.android.gms.internal.measurement.zzjl.zzz(r8)
            int r7 = com.google.android.gms.internal.measurement.zzjl.zzA(r1)
            goto L_0x0306
        L_0x02f2:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.measurement.zzly.zzi(r1)
            if (r1 <= 0) goto L_0x0543
            int r6 = com.google.android.gms.internal.measurement.zzjl.zzz(r8)
            int r7 = com.google.android.gms.internal.measurement.zzjl.zzA(r1)
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
            int r1 = com.google.android.gms.internal.measurement.zzly.zzs(r8, r1, r6)
            goto L_0x0497
        L_0x0318:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = com.google.android.gms.internal.measurement.zzly.zzq(r8, r6, r1)
            goto L_0x0497
        L_0x0325:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = com.google.android.gms.internal.measurement.zzly.zzh(r8, r6, r1)
            goto L_0x0497
        L_0x0332:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = com.google.android.gms.internal.measurement.zzly.zzf(r8, r6, r1)
            goto L_0x0497
        L_0x033f:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = com.google.android.gms.internal.measurement.zzly.zzd(r8, r6, r1)
            goto L_0x0497
        L_0x034c:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = com.google.android.gms.internal.measurement.zzly.zzv(r8, r6, r1)
            goto L_0x0497
        L_0x0359:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.measurement.zzly.zzc(r8, r1)
            goto L_0x0497
        L_0x0365:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.measurement.zzlw r6 = r14.zzE(r2)
            int r1 = com.google.android.gms.internal.measurement.zzly.zzp(r8, r1, r6)
            goto L_0x0497
        L_0x0375:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.measurement.zzly.zzu(r8, r1)
            goto L_0x0497
        L_0x0381:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            r6 = 0
            int r1 = com.google.android.gms.internal.measurement.zzly.zza(r8, r1, r6)
            goto L_0x0497
        L_0x038e:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = com.google.android.gms.internal.measurement.zzly.zzf(r8, r6, r1)
            goto L_0x0497
        L_0x039b:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = com.google.android.gms.internal.measurement.zzly.zzh(r8, r6, r1)
            goto L_0x0497
        L_0x03a8:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = com.google.android.gms.internal.measurement.zzly.zzk(r8, r6, r1)
            goto L_0x0497
        L_0x03b5:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = com.google.android.gms.internal.measurement.zzly.zzx(r8, r6, r1)
            goto L_0x0497
        L_0x03c2:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = com.google.android.gms.internal.measurement.zzly.zzm(r8, r6, r1)
            goto L_0x0497
        L_0x03cf:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = com.google.android.gms.internal.measurement.zzly.zzf(r8, r6, r1)
            goto L_0x0497
        L_0x03dc:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = com.google.android.gms.internal.measurement.zzly.zzh(r8, r6, r1)
            goto L_0x0497
        L_0x03e9:
            r1 = r4 & r7
            if (r1 == 0) goto L_0x0543
            java.lang.Object r1 = r0.getObject(r15, r12)
            com.google.android.gms.internal.measurement.zzll r1 = (com.google.android.gms.internal.measurement.zzll) r1
            com.google.android.gms.internal.measurement.zzlw r6 = r14.zzE(r2)
            int r1 = com.google.android.gms.internal.measurement.zzjl.zzu(r8, r1, r6)
            goto L_0x0497
        L_0x03fd:
            r6 = r7 & r4
            if (r6 == 0) goto L_0x0543
            long r6 = r0.getLong(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.measurement.zzjl.zzA(r8)
            long r9 = r6 + r6
            long r6 = r6 >> r1
            long r6 = r6 ^ r9
            int r1 = com.google.android.gms.internal.measurement.zzjl.zzB(r6)
            goto L_0x006c
        L_0x0415:
            r1 = r4 & r7
            if (r1 == 0) goto L_0x0543
            int r1 = r0.getInt(r15, r12)
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.measurement.zzjl.zzA(r6)
            int r7 = r1 + r1
            int r1 = r1 >> 31
            r1 = r1 ^ r7
            int r1 = com.google.android.gms.internal.measurement.zzjl.zzA(r1)
            goto L_0x016d
        L_0x042e:
            r1 = r4 & r7
            if (r1 == 0) goto L_0x0543
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.measurement.zzjl.zzA(r1)
            goto L_0x01b8
        L_0x043a:
            r1 = r4 & r7
            if (r1 == 0) goto L_0x0543
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.measurement.zzjl.zzA(r1)
            goto L_0x01a8
        L_0x0446:
            r1 = r4 & r7
            if (r1 == 0) goto L_0x0543
            int r1 = r0.getInt(r15, r12)
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.measurement.zzjl.zzA(r6)
            int r1 = com.google.android.gms.internal.measurement.zzjl.zzv(r1)
            goto L_0x016d
        L_0x045a:
            r1 = r4 & r7
            if (r1 == 0) goto L_0x0543
            int r1 = r0.getInt(r15, r12)
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.measurement.zzjl.zzA(r6)
            int r1 = com.google.android.gms.internal.measurement.zzjl.zzA(r1)
            goto L_0x016d
        L_0x046e:
            r1 = r4 & r7
            if (r1 == 0) goto L_0x0543
            java.lang.Object r1 = r0.getObject(r15, r12)
            com.google.android.gms.internal.measurement.zzjd r1 = (com.google.android.gms.internal.measurement.zzjd) r1
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.measurement.zzjl.zzA(r6)
            int r1 = r1.zzd()
            int r7 = com.google.android.gms.internal.measurement.zzjl.zzA(r1)
            goto L_0x04b6
        L_0x0487:
            r1 = r4 & r7
            if (r1 == 0) goto L_0x0543
            java.lang.Object r1 = r0.getObject(r15, r12)
            com.google.android.gms.internal.measurement.zzlw r6 = r14.zzE(r2)
            int r1 = com.google.android.gms.internal.measurement.zzly.zzo(r8, r1, r6)
        L_0x0497:
            int r3 = r3 + r1
            goto L_0x0543
        L_0x049a:
            r1 = r4 & r7
            if (r1 == 0) goto L_0x0543
            java.lang.Object r1 = r0.getObject(r15, r12)
            boolean r6 = r1 instanceof com.google.android.gms.internal.measurement.zzjd
            if (r6 == 0) goto L_0x04bd
            com.google.android.gms.internal.measurement.zzjd r1 = (com.google.android.gms.internal.measurement.zzjd) r1
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.measurement.zzjl.zzA(r6)
            int r1 = r1.zzd()
            int r7 = com.google.android.gms.internal.measurement.zzjl.zzA(r1)
        L_0x04b6:
            int r1 = p379.C16530d.m42011d(r7, r1, r6, r3)
            r3 = r1
            goto L_0x0543
        L_0x04bd:
            java.lang.String r1 = (java.lang.String) r1
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.measurement.zzjl.zzA(r6)
            int r1 = com.google.android.gms.internal.measurement.zzjl.zzy(r1)
            goto L_0x016d
        L_0x04cb:
            r1 = r4 & r7
            if (r1 == 0) goto L_0x0543
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.measurement.zzjl.zzA(r1)
            goto L_0x013c
        L_0x04d7:
            r1 = r4 & r7
            if (r1 == 0) goto L_0x0543
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.measurement.zzjl.zzA(r1)
            goto L_0x01a8
        L_0x04e3:
            r1 = r4 & r7
            if (r1 == 0) goto L_0x0543
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.measurement.zzjl.zzA(r1)
            goto L_0x01b8
        L_0x04ef:
            r1 = r4 & r7
            if (r1 == 0) goto L_0x0543
            int r1 = r0.getInt(r15, r12)
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.measurement.zzjl.zzA(r6)
            int r1 = com.google.android.gms.internal.measurement.zzjl.zzv(r1)
            goto L_0x016d
        L_0x0503:
            r1 = r4 & r7
            if (r1 == 0) goto L_0x0543
            long r6 = r0.getLong(r15, r12)
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.measurement.zzjl.zzA(r1)
            int r6 = com.google.android.gms.internal.measurement.zzjl.zzB(r6)
            goto L_0x0199
        L_0x0517:
            r1 = r4 & r7
            if (r1 == 0) goto L_0x0543
            long r6 = r0.getLong(r15, r12)
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.measurement.zzjl.zzA(r1)
            int r6 = com.google.android.gms.internal.measurement.zzjl.zzB(r6)
            goto L_0x0199
        L_0x052b:
            r1 = r4 & r7
            if (r1 == 0) goto L_0x0543
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.measurement.zzjl.zzA(r1)
            goto L_0x01a8
        L_0x0537:
            r1 = r4 & r7
            if (r1 == 0) goto L_0x0543
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.measurement.zzjl.zzA(r1)
            goto L_0x01b8
        L_0x0543:
            int r2 = r2 + 3
            r1 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x000b
        L_0x054a:
            com.google.android.gms.internal.measurement.zzmn r0 = r14.zzn
            java.lang.Object r1 = r0.zzc(r15)
            int r0 = r0.zza(r1)
            int r3 = r3 + r0
            boolean r0 = r14.zzh
            if (r0 != 0) goto L_0x055a
            return r3
        L_0x055a:
            com.google.android.gms.internal.measurement.zzjr r0 = r14.zzo
            r0.zza(r15)
            r15 = 0
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlo.zzp(java.lang.Object):int");
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
            com.google.android.gms.internal.measurement.zzjw r4 = com.google.android.gms.internal.measurement.zzjw.DOUBLE_LIST_PACKED
            int r4 = r4.zza()
            if (r5 < r4) goto L_0x0031
            com.google.android.gms.internal.measurement.zzjw r4 = com.google.android.gms.internal.measurement.zzjw.SINT64_LIST_PACKED
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
            boolean r4 = r11.zzR(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmx.zzf(r12, r7)
            com.google.android.gms.internal.measurement.zzll r4 = (com.google.android.gms.internal.measurement.zzll) r4
            com.google.android.gms.internal.measurement.zzlw r5 = r11.zzE(r2)
            int r4 = com.google.android.gms.internal.measurement.zzjl.zzu(r6, r4, r5)
            goto L_0x0491
        L_0x004e:
            boolean r5 = r11.zzR(r12, r6, r2)
            if (r5 == 0) goto L_0x054f
            long r7 = zzC(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.zzjl.zzA(r5)
            long r9 = r7 + r7
            long r6 = r7 >> r4
            long r6 = r6 ^ r9
            int r4 = com.google.android.gms.internal.measurement.zzjl.zzB(r6)
            goto L_0x0501
        L_0x0069:
            boolean r4 = r11.zzR(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = zzr(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.zzjl.zzA(r5)
            int r6 = r4 + r4
            int r4 = r4 >> 31
            r4 = r4 ^ r6
            int r4 = com.google.android.gms.internal.measurement.zzjl.zzA(r4)
            goto L_0x0501
        L_0x0084:
            boolean r4 = r11.zzR(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.zzjl.zzA(r4)
            goto L_0x054b
        L_0x0092:
            boolean r4 = r11.zzR(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.zzjl.zzA(r4)
            goto L_0x053b
        L_0x00a0:
            boolean r4 = r11.zzR(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = zzr(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.zzjl.zzA(r5)
            int r4 = com.google.android.gms.internal.measurement.zzjl.zzv(r4)
            goto L_0x0501
        L_0x00b6:
            boolean r4 = r11.zzR(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = zzr(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.zzjl.zzA(r5)
            int r4 = com.google.android.gms.internal.measurement.zzjl.zzA(r4)
            goto L_0x0501
        L_0x00cc:
            boolean r4 = r11.zzR(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmx.zzf(r12, r7)
            com.google.android.gms.internal.measurement.zzjd r4 = (com.google.android.gms.internal.measurement.zzjd) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.zzjl.zzA(r5)
            int r4 = r4.zzd()
            int r6 = com.google.android.gms.internal.measurement.zzjl.zzA(r4)
            goto L_0x04b2
        L_0x00e8:
            boolean r4 = r11.zzR(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmx.zzf(r12, r7)
            com.google.android.gms.internal.measurement.zzlw r5 = r11.zzE(r2)
            int r4 = com.google.android.gms.internal.measurement.zzly.zzo(r6, r4, r5)
            goto L_0x0491
        L_0x00fc:
            boolean r4 = r11.zzR(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmx.zzf(r12, r7)
            boolean r5 = r4 instanceof com.google.android.gms.internal.measurement.zzjd
            if (r5 == 0) goto L_0x011c
            com.google.android.gms.internal.measurement.zzjd r4 = (com.google.android.gms.internal.measurement.zzjd) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.zzjl.zzA(r5)
            int r4 = r4.zzd()
            int r6 = com.google.android.gms.internal.measurement.zzjl.zzA(r4)
            goto L_0x04b2
        L_0x011c:
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.zzjl.zzA(r5)
            int r4 = com.google.android.gms.internal.measurement.zzjl.zzy(r4)
            goto L_0x0501
        L_0x012a:
            boolean r4 = r11.zzR(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.zzjl.zzA(r4)
            goto L_0x04d0
        L_0x0138:
            boolean r4 = r11.zzR(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.zzjl.zzA(r4)
            goto L_0x053b
        L_0x0146:
            boolean r4 = r11.zzR(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.zzjl.zzA(r4)
            goto L_0x054b
        L_0x0154:
            boolean r4 = r11.zzR(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = zzr(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.zzjl.zzA(r5)
            int r4 = com.google.android.gms.internal.measurement.zzjl.zzv(r4)
            goto L_0x0501
        L_0x016a:
            boolean r4 = r11.zzR(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            long r4 = zzC(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.measurement.zzjl.zzA(r6)
            int r4 = com.google.android.gms.internal.measurement.zzjl.zzB(r4)
            goto L_0x052c
        L_0x0180:
            boolean r4 = r11.zzR(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            long r4 = zzC(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.measurement.zzjl.zzA(r6)
            int r4 = com.google.android.gms.internal.measurement.zzjl.zzB(r4)
            goto L_0x052c
        L_0x0196:
            boolean r4 = r11.zzR(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.zzjl.zzA(r4)
            goto L_0x053b
        L_0x01a4:
            boolean r4 = r11.zzR(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.zzjl.zzA(r4)
            goto L_0x054b
        L_0x01b2:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmx.zzf(r12, r7)
            java.lang.Object r5 = r11.zzF(r2)
            com.google.android.gms.internal.measurement.zzlg.zza(r6, r4, r5)
            goto L_0x054f
        L_0x01bf:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmx.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.zzlw r5 = r11.zzE(r2)
            int r4 = com.google.android.gms.internal.measurement.zzly.zzj(r6, r4, r5)
            goto L_0x0491
        L_0x01cf:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzly.zzt(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.measurement.zzjl.zzz(r6)
            int r6 = com.google.android.gms.internal.measurement.zzjl.zzA(r4)
            goto L_0x02fc
        L_0x01e5:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzly.zzr(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.measurement.zzjl.zzz(r6)
            int r6 = com.google.android.gms.internal.measurement.zzjl.zzA(r4)
            goto L_0x02fc
        L_0x01fb:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzly.zzi(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.measurement.zzjl.zzz(r6)
            int r6 = com.google.android.gms.internal.measurement.zzjl.zzA(r4)
            goto L_0x02fc
        L_0x0211:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzly.zzg(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.measurement.zzjl.zzz(r6)
            int r6 = com.google.android.gms.internal.measurement.zzjl.zzA(r4)
            goto L_0x02fc
        L_0x0227:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzly.zze(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.measurement.zzjl.zzz(r6)
            int r6 = com.google.android.gms.internal.measurement.zzjl.zzA(r4)
            goto L_0x02fc
        L_0x023d:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzly.zzw(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.measurement.zzjl.zzz(r6)
            int r6 = com.google.android.gms.internal.measurement.zzjl.zzA(r4)
            goto L_0x02fc
        L_0x0253:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzly.zzb(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.measurement.zzjl.zzz(r6)
            int r6 = com.google.android.gms.internal.measurement.zzjl.zzA(r4)
            goto L_0x02fc
        L_0x0269:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzly.zzg(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.measurement.zzjl.zzz(r6)
            int r6 = com.google.android.gms.internal.measurement.zzjl.zzA(r4)
            goto L_0x02fc
        L_0x027f:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzly.zzi(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.measurement.zzjl.zzz(r6)
            int r6 = com.google.android.gms.internal.measurement.zzjl.zzA(r4)
            goto L_0x02fc
        L_0x0294:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzly.zzl(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.measurement.zzjl.zzz(r6)
            int r6 = com.google.android.gms.internal.measurement.zzjl.zzA(r4)
            goto L_0x02fc
        L_0x02a9:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzly.zzy(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.measurement.zzjl.zzz(r6)
            int r6 = com.google.android.gms.internal.measurement.zzjl.zzA(r4)
            goto L_0x02fc
        L_0x02be:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzly.zzn(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.measurement.zzjl.zzz(r6)
            int r6 = com.google.android.gms.internal.measurement.zzjl.zzA(r4)
            goto L_0x02fc
        L_0x02d3:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzly.zzg(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.measurement.zzjl.zzz(r6)
            int r6 = com.google.android.gms.internal.measurement.zzjl.zzA(r4)
            goto L_0x02fc
        L_0x02e8:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzly.zzi(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.measurement.zzjl.zzz(r6)
            int r6 = com.google.android.gms.internal.measurement.zzjl.zzA(r4)
        L_0x02fc:
            int r6 = r6 + r5
            int r6 = r6 + r4
            goto L_0x04b4
        L_0x0300:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmx.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzly.zzs(r6, r4, r1)
            goto L_0x0491
        L_0x030c:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmx.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzly.zzq(r6, r4, r1)
            goto L_0x0491
        L_0x0318:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmx.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzly.zzh(r6, r4, r1)
            goto L_0x0491
        L_0x0324:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmx.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzly.zzf(r6, r4, r1)
            goto L_0x0491
        L_0x0330:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmx.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzly.zzd(r6, r4, r1)
            goto L_0x0491
        L_0x033c:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmx.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzly.zzv(r6, r4, r1)
            goto L_0x0491
        L_0x0348:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmx.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzly.zzc(r6, r4)
            goto L_0x0491
        L_0x0354:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmx.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.zzlw r5 = r11.zzE(r2)
            int r4 = com.google.android.gms.internal.measurement.zzly.zzp(r6, r4, r5)
            goto L_0x0491
        L_0x0364:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmx.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzly.zzu(r6, r4)
            goto L_0x0491
        L_0x0370:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmx.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzly.zza(r6, r4, r1)
            goto L_0x0491
        L_0x037c:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmx.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzly.zzf(r6, r4, r1)
            goto L_0x0491
        L_0x0388:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmx.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzly.zzh(r6, r4, r1)
            goto L_0x0491
        L_0x0394:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmx.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzly.zzk(r6, r4, r1)
            goto L_0x0491
        L_0x03a0:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmx.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzly.zzx(r6, r4, r1)
            goto L_0x0491
        L_0x03ac:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmx.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzly.zzm(r6, r4, r1)
            goto L_0x0491
        L_0x03b8:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmx.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzly.zzf(r6, r4, r1)
            goto L_0x0491
        L_0x03c4:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmx.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzly.zzh(r6, r4, r1)
            goto L_0x0491
        L_0x03d0:
            boolean r4 = r11.zzO(r12, r2)
            if (r4 == 0) goto L_0x054f
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmx.zzf(r12, r7)
            com.google.android.gms.internal.measurement.zzll r4 = (com.google.android.gms.internal.measurement.zzll) r4
            com.google.android.gms.internal.measurement.zzlw r5 = r11.zzE(r2)
            int r4 = com.google.android.gms.internal.measurement.zzjl.zzu(r6, r4, r5)
            goto L_0x0491
        L_0x03e6:
            boolean r5 = r11.zzO(r12, r2)
            if (r5 == 0) goto L_0x054f
            long r7 = com.google.android.gms.internal.measurement.zzmx.zzd(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.zzjl.zzA(r5)
            long r9 = r7 + r7
            long r6 = r7 >> r4
            long r6 = r6 ^ r9
            int r4 = com.google.android.gms.internal.measurement.zzjl.zzB(r6)
            goto L_0x0501
        L_0x0401:
            boolean r4 = r11.zzO(r12, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = com.google.android.gms.internal.measurement.zzmx.zzc(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.zzjl.zzA(r5)
            int r6 = r4 + r4
            int r4 = r4 >> 31
            r4 = r4 ^ r6
            int r4 = com.google.android.gms.internal.measurement.zzjl.zzA(r4)
            goto L_0x0501
        L_0x041c:
            boolean r4 = r11.zzO(r12, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.zzjl.zzA(r4)
            goto L_0x054b
        L_0x042a:
            boolean r4 = r11.zzO(r12, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.zzjl.zzA(r4)
            goto L_0x053b
        L_0x0438:
            boolean r4 = r11.zzO(r12, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = com.google.android.gms.internal.measurement.zzmx.zzc(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.zzjl.zzA(r5)
            int r4 = com.google.android.gms.internal.measurement.zzjl.zzv(r4)
            goto L_0x0501
        L_0x044e:
            boolean r4 = r11.zzO(r12, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = com.google.android.gms.internal.measurement.zzmx.zzc(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.zzjl.zzA(r5)
            int r4 = com.google.android.gms.internal.measurement.zzjl.zzA(r4)
            goto L_0x0501
        L_0x0464:
            boolean r4 = r11.zzO(r12, r2)
            if (r4 == 0) goto L_0x054f
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmx.zzf(r12, r7)
            com.google.android.gms.internal.measurement.zzjd r4 = (com.google.android.gms.internal.measurement.zzjd) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.zzjl.zzA(r5)
            int r4 = r4.zzd()
            int r6 = com.google.android.gms.internal.measurement.zzjl.zzA(r4)
            goto L_0x04b2
        L_0x047f:
            boolean r4 = r11.zzO(r12, r2)
            if (r4 == 0) goto L_0x054f
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmx.zzf(r12, r7)
            com.google.android.gms.internal.measurement.zzlw r5 = r11.zzE(r2)
            int r4 = com.google.android.gms.internal.measurement.zzly.zzo(r6, r4, r5)
        L_0x0491:
            int r3 = r3 + r4
            goto L_0x054f
        L_0x0494:
            boolean r4 = r11.zzO(r12, r2)
            if (r4 == 0) goto L_0x054f
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmx.zzf(r12, r7)
            boolean r5 = r4 instanceof com.google.android.gms.internal.measurement.zzjd
            if (r5 == 0) goto L_0x04b7
            com.google.android.gms.internal.measurement.zzjd r4 = (com.google.android.gms.internal.measurement.zzjd) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.zzjl.zzA(r5)
            int r4 = r4.zzd()
            int r6 = com.google.android.gms.internal.measurement.zzjl.zzA(r4)
        L_0x04b2:
            int r6 = r6 + r4
            int r6 = r6 + r5
        L_0x04b4:
            int r3 = r3 + r6
            goto L_0x054f
        L_0x04b7:
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.zzjl.zzA(r5)
            int r4 = com.google.android.gms.internal.measurement.zzjl.zzy(r4)
            goto L_0x0501
        L_0x04c4:
            boolean r4 = r11.zzO(r12, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.zzjl.zzA(r4)
        L_0x04d0:
            int r4 = r4 + 1
            goto L_0x0491
        L_0x04d3:
            boolean r4 = r11.zzO(r12, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.zzjl.zzA(r4)
            goto L_0x053b
        L_0x04e0:
            boolean r4 = r11.zzO(r12, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.zzjl.zzA(r4)
            goto L_0x054b
        L_0x04ed:
            boolean r4 = r11.zzO(r12, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = com.google.android.gms.internal.measurement.zzmx.zzc(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.zzjl.zzA(r5)
            int r4 = com.google.android.gms.internal.measurement.zzjl.zzv(r4)
        L_0x0501:
            int r4 = r4 + r5
            goto L_0x0491
        L_0x0503:
            boolean r4 = r11.zzO(r12, r2)
            if (r4 == 0) goto L_0x054f
            long r4 = com.google.android.gms.internal.measurement.zzmx.zzd(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.measurement.zzjl.zzA(r6)
            int r4 = com.google.android.gms.internal.measurement.zzjl.zzB(r4)
            goto L_0x052c
        L_0x0518:
            boolean r4 = r11.zzO(r12, r2)
            if (r4 == 0) goto L_0x054f
            long r4 = com.google.android.gms.internal.measurement.zzmx.zzd(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.measurement.zzjl.zzA(r6)
            int r4 = com.google.android.gms.internal.measurement.zzjl.zzB(r4)
        L_0x052c:
            int r4 = r4 + r6
            goto L_0x0491
        L_0x052f:
            boolean r4 = r11.zzO(r12, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.zzjl.zzA(r4)
        L_0x053b:
            int r4 = r4 + 4
            goto L_0x0491
        L_0x053f:
            boolean r4 = r11.zzO(r12, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.zzjl.zzA(r4)
        L_0x054b:
            int r4 = r4 + 8
            goto L_0x0491
        L_0x054f:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x0553:
            com.google.android.gms.internal.measurement.zzmn r0 = r11.zzn
            java.lang.Object r12 = r0.zzc(r12)
            int r12 = r0.zza(r12)
            int r3 = r3 + r12
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlo.zzq(java.lang.Object):int");
    }

    private static int zzr(Object obj, long j) {
        return ((Integer) zzmx.zzf(obj, j)).intValue();
    }

    private final int zzs(Object obj, byte[] bArr, int i, int i2, int i3, long j, zziq zziq) throws IOException {
        Unsafe unsafe = zzb;
        Object zzF = zzF(i3);
        Object object = unsafe.getObject(obj, j);
        if (!((zzlf) object).zze()) {
            zzlf zzb2 = zzlf.zza().zzb();
            zzlg.zzb(zzb2, object);
            unsafe.putObject(obj, j, zzb2);
        }
        zzle zzle = (zzle) zzF;
        throw null;
    }

    private final int zzt(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, zziq zziq) throws IOException {
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
        zziq zziq2 = zziq;
        Unsafe unsafe = zzb;
        long j3 = (long) (this.zzc[i14 + 2] & 1048575);
        switch (i7) {
            case 51:
                if (i13 == 1) {
                    unsafe.putObject(obj4, j2, Double.valueOf(Double.longBitsToDouble(zzir.zzn(bArr, i))));
                    unsafe.putInt(obj4, j3, i12);
                    return i9 + 8;
                }
                break;
            case 52:
                if (i13 == 5) {
                    unsafe.putObject(obj4, j2, Float.valueOf(Float.intBitsToFloat(zzir.zzb(bArr, i))));
                    unsafe.putInt(obj4, j3, i12);
                    return i9 + 4;
                }
                break;
            case 53:
            case 54:
                if (i13 == 0) {
                    int zzm2 = zzir.zzm(bArr2, i9, zziq2);
                    unsafe.putObject(obj4, j2, Long.valueOf(zziq2.zzb));
                    unsafe.putInt(obj4, j3, i12);
                    return zzm2;
                }
                break;
            case 55:
            case 62:
                if (i13 == 0) {
                    int zzj2 = zzir.zzj(bArr2, i9, zziq2);
                    unsafe.putObject(obj4, j2, Integer.valueOf(zziq2.zza));
                    unsafe.putInt(obj4, j3, i12);
                    return zzj2;
                }
                break;
            case 56:
            case 65:
                if (i13 == 1) {
                    unsafe.putObject(obj4, j2, Long.valueOf(zzir.zzn(bArr, i)));
                    unsafe.putInt(obj4, j3, i12);
                    return i9 + 8;
                }
                break;
            case 57:
            case 64:
                if (i13 == 5) {
                    unsafe.putObject(obj4, j2, Integer.valueOf(zzir.zzb(bArr, i)));
                    unsafe.putInt(obj4, j3, i12);
                    return i9 + 4;
                }
                break;
            case 58:
                if (i13 == 0) {
                    int zzm3 = zzir.zzm(bArr2, i9, zziq2);
                    if (zziq2.zzb != 0) {
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
                    int zzj3 = zzir.zzj(bArr2, i9, zziq2);
                    int i15 = zziq2.zza;
                    if (i15 == 0) {
                        unsafe.putObject(obj4, j2, "");
                    } else if ((i6 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) == 0 || zznc.zzf(bArr2, zzj3, zzj3 + i15)) {
                        unsafe.putObject(obj4, j2, new String(bArr2, zzj3, i15, zzkm.zzb));
                        zzj3 += i15;
                    } else {
                        throw zzko.zzc();
                    }
                    unsafe.putInt(obj4, j3, i12);
                    return zzj3;
                }
                break;
            case 60:
                if (i13 == 2) {
                    int zzd2 = zzir.zzd(zzE(i14), bArr2, i9, i2, zziq2);
                    if (unsafe.getInt(obj4, j3) == i12) {
                        obj2 = unsafe.getObject(obj4, j2);
                    } else {
                        obj2 = null;
                    }
                    if (obj2 == null) {
                        unsafe.putObject(obj4, j2, zziq2.zzc);
                    } else {
                        unsafe.putObject(obj4, j2, zzkm.zzg(obj2, zziq2.zzc));
                    }
                    unsafe.putInt(obj4, j3, i12);
                    return zzd2;
                }
                break;
            case 61:
                if (i13 == 2) {
                    int zza2 = zzir.zza(bArr2, i9, zziq2);
                    unsafe.putObject(obj4, j2, zziq2.zzc);
                    unsafe.putInt(obj4, j3, i12);
                    return zza2;
                }
                break;
            case 63:
                if (i13 == 0) {
                    int zzj4 = zzir.zzj(bArr2, i9, zziq2);
                    int i16 = zziq2.zza;
                    zzki zzD = zzD(i14);
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
                    int zzj5 = zzir.zzj(bArr2, i9, zziq2);
                    unsafe.putObject(obj4, j2, Integer.valueOf(zzjh.zzb(zziq2.zza)));
                    unsafe.putInt(obj4, j3, i12);
                    return zzj5;
                }
                break;
            case 67:
                if (i13 == 0) {
                    int zzm4 = zzir.zzm(bArr2, i9, zziq2);
                    unsafe.putObject(obj4, j2, Long.valueOf(zzjh.zzc(zziq2.zzb)));
                    unsafe.putInt(obj4, j3, i12);
                    return zzm4;
                }
                break;
            case 68:
                if (i13 == 3) {
                    int zzc2 = zzir.zzc(zzE(i14), bArr, i, i2, (i11 & -8) | 4, zziq);
                    if (unsafe.getInt(obj4, j3) == i12) {
                        obj3 = unsafe.getObject(obj4, j2);
                    } else {
                        obj3 = null;
                    }
                    if (obj3 == null) {
                        unsafe.putObject(obj4, j2, zziq2.zzc);
                    } else {
                        unsafe.putObject(obj4, j2, zzkm.zzg(obj3, zziq2.zzc));
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
    private final int zzu(java.lang.Object r31, byte[] r32, int r33, int r34, com.google.android.gms.internal.measurement.zziq r35) throws java.io.IOException {
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
            int r0 = com.google.android.gms.internal.measurement.zzir.zzk(r0, r12, r3, r11)
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
            int r10 = com.google.android.gms.internal.measurement.zzir.zzm(r12, r4, r11)
            long r0 = r11.zzb
            long r21 = com.google.android.gms.internal.measurement.zzjh.zzc(r0)
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
            int r0 = com.google.android.gms.internal.measurement.zzir.zzj(r12, r4, r11)
            int r1 = r11.zza
            int r1 = com.google.android.gms.internal.measurement.zzjh.zzb(r1)
            r7.putInt(r14, r8, r1)
            goto L_0x0237
        L_0x00f0:
            r19 = r7
            r10 = r20
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            r7 = r2
            if (r3 != 0) goto L_0x01c5
            int r0 = com.google.android.gms.internal.measurement.zzir.zzj(r12, r4, r11)
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
            int r0 = com.google.android.gms.internal.measurement.zzir.zza(r12, r4, r11)
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
            com.google.android.gms.internal.measurement.zzlw r0 = r15.zzE(r10)
            int r0 = com.google.android.gms.internal.measurement.zzir.zzd(r0, r12, r4, r13, r11)
            java.lang.Object r1 = r7.getObject(r14, r8)
            if (r1 != 0) goto L_0x0141
            java.lang.Object r1 = r11.zzc
            r7.putObject(r14, r8, r1)
            goto L_0x0237
        L_0x0141:
            java.lang.Object r2 = r11.zzc
            java.lang.Object r1 = com.google.android.gms.internal.measurement.zzkm.zzg(r1, r2)
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
            int r0 = com.google.android.gms.internal.measurement.zzir.zzg(r12, r4, r11)
            goto L_0x0168
        L_0x0164:
            int r0 = com.google.android.gms.internal.measurement.zzir.zzh(r12, r4, r11)
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
            int r0 = com.google.android.gms.internal.measurement.zzir.zzm(r12, r4, r11)
            long r1 = r11.zzb
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0189
            r1 = 1
            goto L_0x018a
        L_0x0189:
            r1 = 0
        L_0x018a:
            com.google.android.gms.internal.measurement.zzmx.zzm(r14, r8, r1)
            goto L_0x0237
        L_0x018f:
            r19 = r7
            r10 = r20
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            r7 = r2
            if (r3 != r0) goto L_0x01c5
            int r0 = com.google.android.gms.internal.measurement.zzir.zzb(r12, r4)
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
            long r21 = com.google.android.gms.internal.measurement.zzir.zzn(r12, r4)
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
            int r0 = com.google.android.gms.internal.measurement.zzir.zzj(r12, r5, r11)
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
            int r17 = com.google.android.gms.internal.measurement.zzir.zzm(r12, r5, r11)
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
            int r0 = com.google.android.gms.internal.measurement.zzir.zzb(r12, r5)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            com.google.android.gms.internal.measurement.zzmx.zzp(r14, r8, r0)
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
            long r0 = com.google.android.gms.internal.measurement.zzir.zzn(r12, r5)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            com.google.android.gms.internal.measurement.zzmx.zzo(r14, r8, r0)
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
            com.google.android.gms.internal.measurement.zzkl r0 = (com.google.android.gms.internal.measurement.zzkl) r0
            boolean r1 = r0.zzc()
            if (r1 != 0) goto L_0x027d
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0275
            r1 = 10
            goto L_0x0276
        L_0x0275:
            int r1 = r1 + r1
        L_0x0276:
            com.google.android.gms.internal.measurement.zzkl r0 = r0.zzd(r1)
            r7.putObject(r14, r8, r0)
        L_0x027d:
            r8 = r0
            com.google.android.gms.internal.measurement.zzlw r0 = r15.zzE(r4)
            r1 = r17
            r2 = r32
            r3 = r5
            r23 = r4
            r4 = r34
            r5 = r8
            r8 = r6
            r6 = r35
            int r0 = com.google.android.gms.internal.measurement.zzir.zze(r0, r1, r2, r3, r4, r5, r6)
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
            com.google.android.gms.internal.measurement.zzmo r4 = zzd(r31)
            r0 = r17
            r1 = r32
            r3 = r34
            r5 = r35
            int r0 = com.google.android.gms.internal.measurement.zzir.zzi(r0, r1, r2, r3, r4, r5)
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
            com.google.android.gms.internal.measurement.zzko r0 = com.google.android.gms.internal.measurement.zzko.zze()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlo.zzu(java.lang.Object, byte[], int, int, com.google.android.gms.internal.measurement.zziq):int");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x044f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01cf  */
    private final int zzv(java.lang.Object r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.gms.internal.measurement.zziq r29) throws java.io.IOException {
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
            com.google.android.gms.internal.measurement.zzkl r12 = (com.google.android.gms.internal.measurement.zzkl) r12
            boolean r13 = r12.zzc()
            if (r13 != 0) goto L_0x0032
            int r13 = r12.size()
            if (r13 != 0) goto L_0x002a
            r13 = 10
            goto L_0x002b
        L_0x002a:
            int r13 = r13 + r13
        L_0x002b:
            com.google.android.gms.internal.measurement.zzkl r12 = r12.zzd(r13)
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
            com.google.android.gms.internal.measurement.zzlw r1 = r15.zzE(r8)
            r6 = r2 & -8
            r6 = r6 | 4
            r21 = r1
            r22 = r17
            r23 = r18
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = com.google.android.gms.internal.measurement.zzir.zzc(r21, r22, r23, r24, r25, r26)
            java.lang.Object r8 = r7.zzc
            r12.add(r8)
            goto L_0x042d
        L_0x005c:
            if (r6 != r14) goto L_0x0080
            com.google.android.gms.internal.measurement.zzla r12 = (com.google.android.gms.internal.measurement.zzla) r12
            int r1 = com.google.android.gms.internal.measurement.zzir.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x0067:
            if (r1 >= r2) goto L_0x0077
            int r1 = com.google.android.gms.internal.measurement.zzir.zzm(r3, r1, r7)
            long r4 = r7.zzb
            long r4 = com.google.android.gms.internal.measurement.zzjh.zzc(r4)
            r12.zzg(r4)
            goto L_0x0067
        L_0x0077:
            if (r1 != r2) goto L_0x007b
            goto L_0x0450
        L_0x007b:
            com.google.android.gms.internal.measurement.zzko r1 = com.google.android.gms.internal.measurement.zzko.zzf()
            throw r1
        L_0x0080:
            if (r6 != 0) goto L_0x044f
            com.google.android.gms.internal.measurement.zzla r12 = (com.google.android.gms.internal.measurement.zzla) r12
            int r1 = com.google.android.gms.internal.measurement.zzir.zzm(r3, r4, r7)
            long r8 = r7.zzb
            long r8 = com.google.android.gms.internal.measurement.zzjh.zzc(r8)
            r12.zzg(r8)
        L_0x0091:
            if (r1 >= r5) goto L_0x00aa
            int r4 = com.google.android.gms.internal.measurement.zzir.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x009c
            goto L_0x00aa
        L_0x009c:
            int r1 = com.google.android.gms.internal.measurement.zzir.zzm(r3, r4, r7)
            long r8 = r7.zzb
            long r8 = com.google.android.gms.internal.measurement.zzjh.zzc(r8)
            r12.zzg(r8)
            goto L_0x0091
        L_0x00aa:
            return r1
        L_0x00ab:
            if (r6 != r14) goto L_0x00cf
            com.google.android.gms.internal.measurement.zzkf r12 = (com.google.android.gms.internal.measurement.zzkf) r12
            int r1 = com.google.android.gms.internal.measurement.zzir.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x00b6:
            if (r1 >= r2) goto L_0x00c6
            int r1 = com.google.android.gms.internal.measurement.zzir.zzj(r3, r1, r7)
            int r4 = r7.zza
            int r4 = com.google.android.gms.internal.measurement.zzjh.zzb(r4)
            r12.zzh(r4)
            goto L_0x00b6
        L_0x00c6:
            if (r1 != r2) goto L_0x00ca
            goto L_0x0450
        L_0x00ca:
            com.google.android.gms.internal.measurement.zzko r1 = com.google.android.gms.internal.measurement.zzko.zzf()
            throw r1
        L_0x00cf:
            if (r6 != 0) goto L_0x044f
            com.google.android.gms.internal.measurement.zzkf r12 = (com.google.android.gms.internal.measurement.zzkf) r12
            int r1 = com.google.android.gms.internal.measurement.zzir.zzj(r3, r4, r7)
            int r4 = r7.zza
            int r4 = com.google.android.gms.internal.measurement.zzjh.zzb(r4)
            r12.zzh(r4)
        L_0x00e0:
            if (r1 >= r5) goto L_0x00f9
            int r4 = com.google.android.gms.internal.measurement.zzir.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x00eb
            goto L_0x00f9
        L_0x00eb:
            int r1 = com.google.android.gms.internal.measurement.zzir.zzj(r3, r4, r7)
            int r4 = r7.zza
            int r4 = com.google.android.gms.internal.measurement.zzjh.zzb(r4)
            r12.zzh(r4)
            goto L_0x00e0
        L_0x00f9:
            return r1
        L_0x00fa:
            if (r6 != r14) goto L_0x0101
            int r2 = com.google.android.gms.internal.measurement.zzir.zzf(r3, r4, r12, r7)
            goto L_0x0112
        L_0x0101:
            if (r6 != 0) goto L_0x044f
            r2 = r20
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r12
            r7 = r29
            int r2 = com.google.android.gms.internal.measurement.zzir.zzl(r2, r3, r4, r5, r6, r7)
        L_0x0112:
            com.google.android.gms.internal.measurement.zzke r1 = (com.google.android.gms.internal.measurement.zzke) r1
            com.google.android.gms.internal.measurement.zzmo r3 = r1.zzc
            com.google.android.gms.internal.measurement.zzmo r4 = com.google.android.gms.internal.measurement.zzmo.zzc()
            if (r3 != r4) goto L_0x011d
            r3 = 0
        L_0x011d:
            com.google.android.gms.internal.measurement.zzki r4 = r15.zzD(r8)
            com.google.android.gms.internal.measurement.zzmn r5 = r0.zzn
            r6 = r21
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzly.zzC(r6, r12, r4, r3, r5)
            if (r3 != 0) goto L_0x012d
            goto L_0x027b
        L_0x012d:
            com.google.android.gms.internal.measurement.zzmo r3 = (com.google.android.gms.internal.measurement.zzmo) r3
            r1.zzc = r3
            return r2
        L_0x0132:
            if (r6 != r14) goto L_0x044f
            int r1 = com.google.android.gms.internal.measurement.zzir.zzj(r3, r4, r7)
            int r4 = r7.zza
            if (r4 < 0) goto L_0x0187
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0182
            if (r4 != 0) goto L_0x0148
            com.google.android.gms.internal.measurement.zzjd r4 = com.google.android.gms.internal.measurement.zzjd.zzb
            r12.add(r4)
            goto L_0x0150
        L_0x0148:
            com.google.android.gms.internal.measurement.zzjd r6 = com.google.android.gms.internal.measurement.zzjd.zzl(r3, r1, r4)
            r12.add(r6)
        L_0x014f:
            int r1 = r1 + r4
        L_0x0150:
            if (r1 >= r5) goto L_0x0181
            int r4 = com.google.android.gms.internal.measurement.zzir.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x015b
            goto L_0x0181
        L_0x015b:
            int r1 = com.google.android.gms.internal.measurement.zzir.zzj(r3, r4, r7)
            int r4 = r7.zza
            if (r4 < 0) goto L_0x017c
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0177
            if (r4 != 0) goto L_0x016f
            com.google.android.gms.internal.measurement.zzjd r4 = com.google.android.gms.internal.measurement.zzjd.zzb
            r12.add(r4)
            goto L_0x0150
        L_0x016f:
            com.google.android.gms.internal.measurement.zzjd r6 = com.google.android.gms.internal.measurement.zzjd.zzl(r3, r1, r4)
            r12.add(r6)
            goto L_0x014f
        L_0x0177:
            com.google.android.gms.internal.measurement.zzko r1 = com.google.android.gms.internal.measurement.zzko.zzf()
            throw r1
        L_0x017c:
            com.google.android.gms.internal.measurement.zzko r1 = com.google.android.gms.internal.measurement.zzko.zzd()
            throw r1
        L_0x0181:
            return r1
        L_0x0182:
            com.google.android.gms.internal.measurement.zzko r1 = com.google.android.gms.internal.measurement.zzko.zzf()
            throw r1
        L_0x0187:
            com.google.android.gms.internal.measurement.zzko r1 = com.google.android.gms.internal.measurement.zzko.zzd()
            throw r1
        L_0x018c:
            if (r6 == r14) goto L_0x0190
            goto L_0x044f
        L_0x0190:
            com.google.android.gms.internal.measurement.zzlw r1 = r15.zzE(r8)
            r21 = r1
            r22 = r20
            r23 = r17
            r24 = r18
            r25 = r19
            r26 = r12
            r27 = r29
            int r1 = com.google.android.gms.internal.measurement.zzir.zze(r21, r22, r23, r24, r25, r26, r27)
            return r1
        L_0x01a7:
            if (r6 != r14) goto L_0x044f
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r24 & r8
            java.lang.String r1 = ""
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 != 0) goto L_0x01fa
            int r4 = com.google.android.gms.internal.measurement.zzir.zzj(r3, r4, r7)
            int r6 = r7.zza
            if (r6 < 0) goto L_0x01f5
            if (r6 != 0) goto L_0x01c2
            r12.add(r1)
            goto L_0x01cd
        L_0x01c2:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.measurement.zzkm.zzb
            r8.<init>(r3, r4, r6, r9)
            r12.add(r8)
        L_0x01cc:
            int r4 = r4 + r6
        L_0x01cd:
            if (r4 >= r5) goto L_0x044f
            int r6 = com.google.android.gms.internal.measurement.zzir.zzj(r3, r4, r7)
            int r8 = r7.zza
            if (r2 != r8) goto L_0x044f
            int r4 = com.google.android.gms.internal.measurement.zzir.zzj(r3, r6, r7)
            int r6 = r7.zza
            if (r6 < 0) goto L_0x01f0
            if (r6 != 0) goto L_0x01e5
            r12.add(r1)
            goto L_0x01cd
        L_0x01e5:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.measurement.zzkm.zzb
            r8.<init>(r3, r4, r6, r9)
            r12.add(r8)
            goto L_0x01cc
        L_0x01f0:
            com.google.android.gms.internal.measurement.zzko r1 = com.google.android.gms.internal.measurement.zzko.zzd()
            throw r1
        L_0x01f5:
            com.google.android.gms.internal.measurement.zzko r1 = com.google.android.gms.internal.measurement.zzko.zzd()
            throw r1
        L_0x01fa:
            int r4 = com.google.android.gms.internal.measurement.zzir.zzj(r3, r4, r7)
            int r6 = r7.zza
            if (r6 < 0) goto L_0x0255
            if (r6 != 0) goto L_0x0208
            r12.add(r1)
            goto L_0x021b
        L_0x0208:
            int r8 = r4 + r6
            boolean r9 = com.google.android.gms.internal.measurement.zznc.zzf(r3, r4, r8)
            if (r9 == 0) goto L_0x0250
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.measurement.zzkm.zzb
            r9.<init>(r3, r4, r6, r10)
            r12.add(r9)
        L_0x021a:
            r4 = r8
        L_0x021b:
            if (r4 >= r5) goto L_0x044f
            int r6 = com.google.android.gms.internal.measurement.zzir.zzj(r3, r4, r7)
            int r8 = r7.zza
            if (r2 != r8) goto L_0x044f
            int r4 = com.google.android.gms.internal.measurement.zzir.zzj(r3, r6, r7)
            int r6 = r7.zza
            if (r6 < 0) goto L_0x024b
            if (r6 != 0) goto L_0x0233
            r12.add(r1)
            goto L_0x021b
        L_0x0233:
            int r8 = r4 + r6
            boolean r9 = com.google.android.gms.internal.measurement.zznc.zzf(r3, r4, r8)
            if (r9 == 0) goto L_0x0246
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.measurement.zzkm.zzb
            r9.<init>(r3, r4, r6, r10)
            r12.add(r9)
            goto L_0x021a
        L_0x0246:
            com.google.android.gms.internal.measurement.zzko r1 = com.google.android.gms.internal.measurement.zzko.zzc()
            throw r1
        L_0x024b:
            com.google.android.gms.internal.measurement.zzko r1 = com.google.android.gms.internal.measurement.zzko.zzd()
            throw r1
        L_0x0250:
            com.google.android.gms.internal.measurement.zzko r1 = com.google.android.gms.internal.measurement.zzko.zzc()
            throw r1
        L_0x0255:
            com.google.android.gms.internal.measurement.zzko r1 = com.google.android.gms.internal.measurement.zzko.zzd()
            throw r1
        L_0x025a:
            r1 = 0
            if (r6 != r14) goto L_0x0283
            com.google.android.gms.internal.measurement.zzis r12 = (com.google.android.gms.internal.measurement.zzis) r12
            int r2 = com.google.android.gms.internal.measurement.zzir.zzj(r3, r4, r7)
            int r4 = r7.zza
            int r4 = r4 + r2
        L_0x0266:
            if (r2 >= r4) goto L_0x0279
            int r2 = com.google.android.gms.internal.measurement.zzir.zzm(r3, r2, r7)
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
            com.google.android.gms.internal.measurement.zzko r1 = com.google.android.gms.internal.measurement.zzko.zzf()
            throw r1
        L_0x0283:
            if (r6 != 0) goto L_0x044f
            com.google.android.gms.internal.measurement.zzis r12 = (com.google.android.gms.internal.measurement.zzis) r12
            int r4 = com.google.android.gms.internal.measurement.zzir.zzm(r3, r4, r7)
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
            int r6 = com.google.android.gms.internal.measurement.zzir.zzj(r3, r4, r7)
            int r8 = r7.zza
            if (r2 == r8) goto L_0x02a2
            goto L_0x02b3
        L_0x02a2:
            int r4 = com.google.android.gms.internal.measurement.zzir.zzm(r3, r6, r7)
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
            com.google.android.gms.internal.measurement.zzkf r12 = (com.google.android.gms.internal.measurement.zzkf) r12
            int r1 = com.google.android.gms.internal.measurement.zzir.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x02bf:
            if (r1 >= r2) goto L_0x02cb
            int r4 = com.google.android.gms.internal.measurement.zzir.zzb(r3, r1)
            r12.zzh(r4)
            int r1 = r1 + 4
            goto L_0x02bf
        L_0x02cb:
            if (r1 != r2) goto L_0x02cf
            goto L_0x0450
        L_0x02cf:
            com.google.android.gms.internal.measurement.zzko r1 = com.google.android.gms.internal.measurement.zzko.zzf()
            throw r1
        L_0x02d4:
            if (r6 != r9) goto L_0x044f
            com.google.android.gms.internal.measurement.zzkf r12 = (com.google.android.gms.internal.measurement.zzkf) r12
            int r1 = com.google.android.gms.internal.measurement.zzir.zzb(r17, r18)
            r12.zzh(r1)
        L_0x02df:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x02f4
            int r4 = com.google.android.gms.internal.measurement.zzir.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x02ec
            goto L_0x02f4
        L_0x02ec:
            int r1 = com.google.android.gms.internal.measurement.zzir.zzb(r3, r4)
            r12.zzh(r1)
            goto L_0x02df
        L_0x02f4:
            return r1
        L_0x02f5:
            if (r6 != r14) goto L_0x0315
            com.google.android.gms.internal.measurement.zzla r12 = (com.google.android.gms.internal.measurement.zzla) r12
            int r1 = com.google.android.gms.internal.measurement.zzir.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x0300:
            if (r1 >= r2) goto L_0x030c
            long r4 = com.google.android.gms.internal.measurement.zzir.zzn(r3, r1)
            r12.zzg(r4)
            int r1 = r1 + 8
            goto L_0x0300
        L_0x030c:
            if (r1 != r2) goto L_0x0310
            goto L_0x0450
        L_0x0310:
            com.google.android.gms.internal.measurement.zzko r1 = com.google.android.gms.internal.measurement.zzko.zzf()
            throw r1
        L_0x0315:
            if (r6 != r13) goto L_0x044f
            com.google.android.gms.internal.measurement.zzla r12 = (com.google.android.gms.internal.measurement.zzla) r12
            long r8 = com.google.android.gms.internal.measurement.zzir.zzn(r17, r18)
            r12.zzg(r8)
        L_0x0320:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0335
            int r4 = com.google.android.gms.internal.measurement.zzir.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x032d
            goto L_0x0335
        L_0x032d:
            long r8 = com.google.android.gms.internal.measurement.zzir.zzn(r3, r4)
            r12.zzg(r8)
            goto L_0x0320
        L_0x0335:
            return r1
        L_0x0336:
            if (r6 != r14) goto L_0x033e
            int r1 = com.google.android.gms.internal.measurement.zzir.zzf(r3, r4, r12, r7)
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
            int r1 = com.google.android.gms.internal.measurement.zzir.zzl(r20, r21, r22, r23, r24, r25)
            return r1
        L_0x0351:
            if (r6 != r14) goto L_0x0371
            com.google.android.gms.internal.measurement.zzla r12 = (com.google.android.gms.internal.measurement.zzla) r12
            int r1 = com.google.android.gms.internal.measurement.zzir.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x035c:
            if (r1 >= r2) goto L_0x0368
            int r1 = com.google.android.gms.internal.measurement.zzir.zzm(r3, r1, r7)
            long r4 = r7.zzb
            r12.zzg(r4)
            goto L_0x035c
        L_0x0368:
            if (r1 != r2) goto L_0x036c
            goto L_0x0450
        L_0x036c:
            com.google.android.gms.internal.measurement.zzko r1 = com.google.android.gms.internal.measurement.zzko.zzf()
            throw r1
        L_0x0371:
            if (r6 != 0) goto L_0x044f
            com.google.android.gms.internal.measurement.zzla r12 = (com.google.android.gms.internal.measurement.zzla) r12
            int r1 = com.google.android.gms.internal.measurement.zzir.zzm(r3, r4, r7)
            long r8 = r7.zzb
            r12.zzg(r8)
        L_0x037e:
            if (r1 >= r5) goto L_0x0393
            int r4 = com.google.android.gms.internal.measurement.zzir.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x0389
            goto L_0x0393
        L_0x0389:
            int r1 = com.google.android.gms.internal.measurement.zzir.zzm(r3, r4, r7)
            long r8 = r7.zzb
            r12.zzg(r8)
            goto L_0x037e
        L_0x0393:
            return r1
        L_0x0394:
            if (r6 != r14) goto L_0x03b8
            com.google.android.gms.internal.measurement.zzjx r12 = (com.google.android.gms.internal.measurement.zzjx) r12
            int r1 = com.google.android.gms.internal.measurement.zzir.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x039f:
            if (r1 >= r2) goto L_0x03af
            int r4 = com.google.android.gms.internal.measurement.zzir.zzb(r3, r1)
            float r4 = java.lang.Float.intBitsToFloat(r4)
            r12.zze(r4)
            int r1 = r1 + 4
            goto L_0x039f
        L_0x03af:
            if (r1 != r2) goto L_0x03b3
            goto L_0x0450
        L_0x03b3:
            com.google.android.gms.internal.measurement.zzko r1 = com.google.android.gms.internal.measurement.zzko.zzf()
            throw r1
        L_0x03b8:
            if (r6 != r9) goto L_0x044f
            com.google.android.gms.internal.measurement.zzjx r12 = (com.google.android.gms.internal.measurement.zzjx) r12
            int r1 = com.google.android.gms.internal.measurement.zzir.zzb(r17, r18)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r12.zze(r1)
        L_0x03c7:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x03e0
            int r4 = com.google.android.gms.internal.measurement.zzir.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x03d4
            goto L_0x03e0
        L_0x03d4:
            int r1 = com.google.android.gms.internal.measurement.zzir.zzb(r3, r4)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r12.zze(r1)
            goto L_0x03c7
        L_0x03e0:
            return r1
        L_0x03e1:
            if (r6 != r14) goto L_0x0404
            com.google.android.gms.internal.measurement.zzjn r12 = (com.google.android.gms.internal.measurement.zzjn) r12
            int r1 = com.google.android.gms.internal.measurement.zzir.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x03ec:
            if (r1 >= r2) goto L_0x03fc
            long r4 = com.google.android.gms.internal.measurement.zzir.zzn(r3, r1)
            double r4 = java.lang.Double.longBitsToDouble(r4)
            r12.zze(r4)
            int r1 = r1 + 8
            goto L_0x03ec
        L_0x03fc:
            if (r1 != r2) goto L_0x03ff
            goto L_0x0450
        L_0x03ff:
            com.google.android.gms.internal.measurement.zzko r1 = com.google.android.gms.internal.measurement.zzko.zzf()
            throw r1
        L_0x0404:
            if (r6 != r13) goto L_0x044f
            com.google.android.gms.internal.measurement.zzjn r12 = (com.google.android.gms.internal.measurement.zzjn) r12
            long r8 = com.google.android.gms.internal.measurement.zzir.zzn(r17, r18)
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r12.zze(r8)
        L_0x0413:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x042c
            int r4 = com.google.android.gms.internal.measurement.zzir.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x0420
            goto L_0x042c
        L_0x0420:
            long r8 = com.google.android.gms.internal.measurement.zzir.zzn(r3, r4)
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r12.zze(r8)
            goto L_0x0413
        L_0x042c:
            return r1
        L_0x042d:
            if (r4 >= r5) goto L_0x044e
            int r8 = com.google.android.gms.internal.measurement.zzir.zzj(r3, r4, r7)
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
            int r4 = com.google.android.gms.internal.measurement.zzir.zzc(r21, r22, r23, r24, r25, r26)
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlo.zzv(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.measurement.zziq):int");
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
            boolean r3 = r8.zzR(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzmx.zzf(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0224
        L_0x0031:
            boolean r3 = r8.zzR(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = zzC(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.zzkm.zzc(r3)
            goto L_0x0224
        L_0x0043:
            boolean r3 = r8.zzR(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = zzr(r9, r5)
            goto L_0x01f3
        L_0x0051:
            boolean r3 = r8.zzR(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = zzC(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.zzkm.zzc(r3)
            goto L_0x0224
        L_0x0063:
            boolean r3 = r8.zzR(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = zzr(r9, r5)
            goto L_0x01f3
        L_0x0071:
            boolean r3 = r8.zzR(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = zzr(r9, r5)
            goto L_0x01f3
        L_0x007f:
            boolean r3 = r8.zzR(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = zzr(r9, r5)
            goto L_0x01f3
        L_0x008d:
            boolean r3 = r8.zzR(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzmx.zzf(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0224
        L_0x009f:
            boolean r3 = r8.zzR(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzmx.zzf(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0224
        L_0x00b1:
            boolean r3 = r8.zzR(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzmx.zzf(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0224
        L_0x00c5:
            boolean r3 = r8.zzR(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            boolean r3 = zzS(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.zzkm.zza(r3)
            goto L_0x0224
        L_0x00d7:
            boolean r3 = r8.zzR(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = zzr(r9, r5)
            goto L_0x01f3
        L_0x00e5:
            boolean r3 = r8.zzR(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = zzC(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.zzkm.zzc(r3)
            goto L_0x0224
        L_0x00f7:
            boolean r3 = r8.zzR(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = zzr(r9, r5)
            goto L_0x01f3
        L_0x0105:
            boolean r3 = r8.zzR(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = zzC(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.zzkm.zzc(r3)
            goto L_0x0224
        L_0x0117:
            boolean r3 = r8.zzR(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = zzC(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.zzkm.zzc(r3)
            goto L_0x0224
        L_0x0129:
            boolean r3 = r8.zzR(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            float r3 = zzo(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0224
        L_0x013b:
            boolean r3 = r8.zzR(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            double r3 = zzn(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.gms.internal.measurement.zzkm.zzc(r3)
            goto L_0x0224
        L_0x0151:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzmx.zzf(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0224
        L_0x015d:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzmx.zzf(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0224
        L_0x0169:
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzmx.zzf(r9, r5)
            if (r3 == 0) goto L_0x01bf
            int r7 = r3.hashCode()
            goto L_0x01bf
        L_0x0174:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.measurement.zzmx.zzd(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.zzkm.zzc(r3)
            goto L_0x0224
        L_0x0180:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.zzmx.zzc(r9, r5)
            goto L_0x01f3
        L_0x0188:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.measurement.zzmx.zzd(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.zzkm.zzc(r3)
            goto L_0x0224
        L_0x0194:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.zzmx.zzc(r9, r5)
            goto L_0x01f3
        L_0x019b:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.zzmx.zzc(r9, r5)
            goto L_0x01f3
        L_0x01a2:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.zzmx.zzc(r9, r5)
            goto L_0x01f3
        L_0x01a9:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzmx.zzf(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0224
        L_0x01b5:
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzmx.zzf(r9, r5)
            if (r3 == 0) goto L_0x01bf
            int r7 = r3.hashCode()
        L_0x01bf:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0226
        L_0x01c3:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzmx.zzf(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0224
        L_0x01d0:
            int r2 = r2 * 53
            boolean r3 = com.google.android.gms.internal.measurement.zzmx.zzw(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.zzkm.zza(r3)
            goto L_0x0224
        L_0x01db:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.zzmx.zzc(r9, r5)
            goto L_0x01f3
        L_0x01e2:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.measurement.zzmx.zzd(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.zzkm.zzc(r3)
            goto L_0x0224
        L_0x01ed:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.zzmx.zzc(r9, r5)
        L_0x01f3:
            int r2 = r2 + r3
            goto L_0x0226
        L_0x01f5:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.measurement.zzmx.zzd(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.zzkm.zzc(r3)
            goto L_0x0224
        L_0x0200:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.measurement.zzmx.zzd(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.zzkm.zzc(r3)
            goto L_0x0224
        L_0x020b:
            int r2 = r2 * 53
            float r3 = com.google.android.gms.internal.measurement.zzmx.zzb(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0224
        L_0x0216:
            int r2 = r2 * 53
            double r3 = com.google.android.gms.internal.measurement.zzmx.zza(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.gms.internal.measurement.zzkm.zzc(r3)
        L_0x0224:
            int r3 = r3 + r2
            r2 = r3
        L_0x0226:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x022a:
            int r2 = r2 * 53
            com.google.android.gms.internal.measurement.zzmn r0 = r8.zzn
            java.lang.Object r0 = r0.zzc(r9)
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            boolean r1 = r8.zzh
            if (r1 != 0) goto L_0x023c
            return r0
        L_0x023c:
            com.google.android.gms.internal.measurement.zzjr r0 = r8.zzo
            r0.zza(r9)
            r9 = 0
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlo.zzb(java.lang.Object):int");
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
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v16, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v38, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v36, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v37, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v38, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v39, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v41, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v29, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x037e, code lost:
        if (r0 != r15) goto L_0x0380;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x039a, code lost:
        r7 = r34;
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x03c6, code lost:
        if (r0 != r15) goto L_0x0380;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x03e8, code lost:
        if (r0 != r15) goto L_0x0380;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0163, code lost:
        r5 = r6 | r25;
        r2 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0167, code lost:
        r3 = r8;
        r1 = r11;
        r6 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x019e, code lost:
        r21 = r3;
        r13 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0200, code lost:
        r5 = r6 | r25;
        r3 = r2;
        r1 = r11;
        r6 = r27;
        r2 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0208, code lost:
        r11 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x020c, code lost:
        r13 = r2;
        r21 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x020f, code lost:
        r18 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x02b0, code lost:
        r0 = r11 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02b2, code lost:
        r5 = r6 | r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02b4, code lost:
        r2 = r32;
        r11 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02b8, code lost:
        r3 = r13;
        r1 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02bd, code lost:
        r21 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02d2, code lost:
        r7 = r34;
        r22 = r6;
        r28 = r10;
        r8 = r18;
        r2 = r21;
        r6 = r27;
        r21 = r13;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzc(java.lang.Object r30, byte[] r31, int r32, int r33, int r34, com.google.android.gms.internal.measurement.zziq r35) throws java.io.IOException {
        /*
            r29 = this;
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r34
            r9 = r35
            sun.misc.Unsafe r10 = zzb
            r16 = 0
            r0 = r32
            r1 = 0
            r2 = -1
            r3 = 0
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
        L_0x0019:
            r17 = 0
            if (r0 >= r13) goto L_0x0455
            int r1 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002c
            int r0 = com.google.android.gms.internal.measurement.zzir.zzk(r0, r12, r1, r9)
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
            r3 = -1
            if (r2 != r3) goto L_0x0050
            r32 = r0
            r2 = r1
            r8 = r4
            r22 = r5
            r28 = r10
            r7 = r11
            r19 = -1
            r21 = 0
            goto L_0x03eb
        L_0x0050:
            int[] r3 = r15.zzc
            int r20 = r2 + 1
            r8 = r3[r20]
            int r11 = zzA(r8)
            r20 = r0
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r8 & r18
            r21 = r1
            long r0 = (long) r0
            r22 = r0
            r0 = 17
            if (r11 > r0) goto L_0x02e2
            int r0 = r2 + 2
            r0 = r3[r0]
            int r3 = r0 >>> 20
            r1 = 1
            int r25 = r1 << r3
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r3
            if (r0 == r6) goto L_0x0089
            r18 = r4
            if (r6 == r3) goto L_0x0081
            long r3 = (long) r6
            r10.putInt(r14, r3, r5)
        L_0x0081:
            long r3 = (long) r0
            int r5 = r10.getInt(r14, r3)
            r27 = r0
            goto L_0x008d
        L_0x0089:
            r18 = r4
            r27 = r6
        L_0x008d:
            r6 = r5
            r0 = 5
            switch(r11) {
                case 0: goto L_0x0297;
                case 1: goto L_0x027b;
                case 2: goto L_0x0254;
                case 3: goto L_0x0254;
                case 4: goto L_0x023b;
                case 5: goto L_0x0213;
                case 6: goto L_0x01e8;
                case 7: goto L_0x01c7;
                case 8: goto L_0x01a3;
                case 9: goto L_0x016d;
                case 10: goto L_0x0149;
                case 11: goto L_0x023b;
                case 12: goto L_0x0112;
                case 13: goto L_0x01e8;
                case 14: goto L_0x0213;
                case 15: goto L_0x00f4;
                case 16: goto L_0x00c1;
                default: goto L_0x0092;
            }
        L_0x0092:
            r13 = r2
            r32 = r20
            r11 = r21
            r4 = r22
            r0 = 3
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r0) goto L_0x02bd
            com.google.android.gms.internal.measurement.zzlw r0 = r15.zzE(r13)
            int r1 = r32 << 3
            r7 = r1 | 4
            r1 = r31
            r2 = r11
            r3 = r33
            r11 = r4
            r4 = r7
            r5 = r35
            int r0 = com.google.android.gms.internal.measurement.zzir.zzc(r0, r1, r2, r3, r4, r5)
            r1 = r6 & r25
            if (r1 != 0) goto L_0x02c0
            java.lang.Object r1 = r9.zzc
            r10.putObject(r14, r11, r1)
            goto L_0x02cd
        L_0x00c1:
            if (r7 != 0) goto L_0x00ea
            r3 = r21
            int r7 = com.google.android.gms.internal.measurement.zzir.zzm(r12, r3, r9)
            long r0 = r9.zzb
            long r4 = com.google.android.gms.internal.measurement.zzjh.zzc(r0)
            r11 = r20
            r0 = r10
            r1 = r30
            r8 = r2
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r22
            r32 = r11
            r11 = r18
            r0.putLong(r1, r2, r4)
            r5 = r6 | r25
            r2 = r32
            r0 = r7
            goto L_0x0167
        L_0x00ea:
            r32 = r20
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            r13 = r2
            goto L_0x02d2
        L_0x00f4:
            r8 = r2
            r11 = r18
            r32 = r20
            r3 = r21
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != 0) goto L_0x019e
            int r0 = com.google.android.gms.internal.measurement.zzir.zzj(r12, r3, r9)
            int r1 = r9.zza
            int r1 = com.google.android.gms.internal.measurement.zzjh.zzb(r1)
            r4 = r22
            r10.putInt(r14, r4, r1)
            goto L_0x0163
        L_0x0112:
            r8 = r2
            r11 = r18
            r32 = r20
            r3 = r21
            r4 = r22
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != 0) goto L_0x019e
            int r0 = com.google.android.gms.internal.measurement.zzir.zzj(r12, r3, r9)
            int r1 = r9.zza
            com.google.android.gms.internal.measurement.zzki r2 = r15.zzD(r8)
            if (r2 == 0) goto L_0x0145
            boolean r2 = r2.zza(r1)
            if (r2 == 0) goto L_0x0135
            goto L_0x0145
        L_0x0135:
            com.google.android.gms.internal.measurement.zzmo r2 = zzd(r30)
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.zzh(r11, r1)
            r2 = r32
            r5 = r6
            goto L_0x0167
        L_0x0145:
            r10.putInt(r14, r4, r1)
            goto L_0x0163
        L_0x0149:
            r8 = r2
            r11 = r18
            r32 = r20
            r3 = r21
            r4 = r22
            r0 = 2
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r0) goto L_0x019e
            int r0 = com.google.android.gms.internal.measurement.zzir.zza(r12, r3, r9)
            java.lang.Object r1 = r9.zzc
            r10.putObject(r14, r4, r1)
        L_0x0163:
            r5 = r6 | r25
            r2 = r32
        L_0x0167:
            r3 = r8
            r1 = r11
            r6 = r27
            goto L_0x0208
        L_0x016d:
            r8 = r2
            r11 = r18
            r32 = r20
            r3 = r21
            r4 = r22
            r0 = 2
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r0) goto L_0x019e
            com.google.android.gms.internal.measurement.zzlw r0 = r15.zzE(r8)
            int r0 = com.google.android.gms.internal.measurement.zzir.zzd(r0, r12, r3, r13, r9)
            r1 = r6 & r25
            if (r1 != 0) goto L_0x0190
            java.lang.Object r1 = r9.zzc
            r10.putObject(r14, r4, r1)
            goto L_0x0163
        L_0x0190:
            java.lang.Object r1 = r10.getObject(r14, r4)
            java.lang.Object r2 = r9.zzc
            java.lang.Object r1 = com.google.android.gms.internal.measurement.zzkm.zzg(r1, r2)
            r10.putObject(r14, r4, r1)
            goto L_0x0163
        L_0x019e:
            r21 = r3
            r13 = r8
            goto L_0x020f
        L_0x01a3:
            r11 = r18
            r32 = r20
            r3 = r21
            r4 = r22
            r0 = 2
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r0) goto L_0x020c
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r8
            if (r0 != 0) goto L_0x01bd
            int r0 = com.google.android.gms.internal.measurement.zzir.zzg(r12, r3, r9)
            goto L_0x01c1
        L_0x01bd:
            int r0 = com.google.android.gms.internal.measurement.zzir.zzh(r12, r3, r9)
        L_0x01c1:
            java.lang.Object r1 = r9.zzc
            r10.putObject(r14, r4, r1)
            goto L_0x0200
        L_0x01c7:
            r11 = r18
            r32 = r20
            r3 = r21
            r4 = r22
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != 0) goto L_0x020c
            int r0 = com.google.android.gms.internal.measurement.zzir.zzm(r12, r3, r9)
            long r7 = r9.zzb
            r17 = 0
            int r3 = (r7 > r17 ? 1 : (r7 == r17 ? 0 : -1))
            if (r3 == 0) goto L_0x01e3
            goto L_0x01e4
        L_0x01e3:
            r1 = 0
        L_0x01e4:
            com.google.android.gms.internal.measurement.zzmx.zzm(r14, r4, r1)
            goto L_0x0200
        L_0x01e8:
            r11 = r18
            r32 = r20
            r3 = r21
            r4 = r22
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r0) goto L_0x020c
            int r0 = com.google.android.gms.internal.measurement.zzir.zzb(r12, r3)
            r10.putInt(r14, r4, r0)
            int r0 = r3 + 4
        L_0x0200:
            r5 = r6 | r25
            r3 = r2
            r1 = r11
            r6 = r27
            r2 = r32
        L_0x0208:
            r11 = r34
            goto L_0x0019
        L_0x020c:
            r13 = r2
            r21 = r3
        L_0x020f:
            r18 = r11
            goto L_0x02d2
        L_0x0213:
            r11 = r18
            r32 = r20
            r3 = r21
            r4 = r22
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r1) goto L_0x0234
            long r7 = com.google.android.gms.internal.measurement.zzir.zzn(r12, r3)
            r0 = r10
            r1 = r30
            r13 = r2
            r18 = r11
            r11 = r3
            r2 = r4
            r4 = r7
            r0.putLong(r1, r2, r4)
            goto L_0x02b0
        L_0x0234:
            r13 = r2
            r18 = r11
            r21 = r3
            goto L_0x02d2
        L_0x023b:
            r13 = r2
            r32 = r20
            r11 = r21
            r4 = r22
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != 0) goto L_0x02bd
            int r0 = com.google.android.gms.internal.measurement.zzir.zzj(r12, r11, r9)
            int r1 = r9.zza
            r10.putInt(r14, r4, r1)
            goto L_0x02b2
        L_0x0254:
            r13 = r2
            r32 = r20
            r11 = r21
            r4 = r22
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != 0) goto L_0x02bd
            int r7 = com.google.android.gms.internal.measurement.zzir.zzm(r12, r11, r9)
            long r2 = r9.zzb
            r0 = r10
            r1 = r30
            r21 = r2
            r2 = r4
            r4 = r21
            r0.putLong(r1, r2, r4)
            r5 = r6 | r25
            r2 = r32
            r11 = r34
            r0 = r7
            goto L_0x02b8
        L_0x027b:
            r13 = r2
            r32 = r20
            r11 = r21
            r4 = r22
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r0) goto L_0x02bd
            int r0 = com.google.android.gms.internal.measurement.zzir.zzb(r12, r11)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            com.google.android.gms.internal.measurement.zzmx.zzp(r14, r4, r0)
            int r0 = r11 + 4
            goto L_0x02b2
        L_0x0297:
            r13 = r2
            r32 = r20
            r11 = r21
            r4 = r22
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r1) goto L_0x02bd
            long r0 = com.google.android.gms.internal.measurement.zzir.zzn(r12, r11)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            com.google.android.gms.internal.measurement.zzmx.zzo(r14, r4, r0)
        L_0x02b0:
            int r0 = r11 + 8
        L_0x02b2:
            r5 = r6 | r25
        L_0x02b4:
            r2 = r32
            r11 = r34
        L_0x02b8:
            r3 = r13
            r1 = r18
            goto L_0x0334
        L_0x02bd:
            r21 = r11
            goto L_0x02d2
        L_0x02c0:
            java.lang.Object r1 = r10.getObject(r14, r11)
            java.lang.Object r2 = r9.zzc
            java.lang.Object r1 = com.google.android.gms.internal.measurement.zzkm.zzg(r1, r2)
            r10.putObject(r14, r11, r1)
        L_0x02cd:
            r5 = r6 | r25
            r12 = r31
            goto L_0x02b4
        L_0x02d2:
            r7 = r34
            r22 = r6
            r28 = r10
            r8 = r18
            r2 = r21
            r6 = r27
            r21 = r13
            goto L_0x03eb
        L_0x02e2:
            r13 = r2
            r18 = r4
            r3 = r11
            r4 = r20
            r11 = r22
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            r0 = 27
            if (r3 != r0) goto L_0x0348
            r0 = 2
            if (r7 != r0) goto L_0x033a
            java.lang.Object r0 = r10.getObject(r14, r11)
            com.google.android.gms.internal.measurement.zzkl r0 = (com.google.android.gms.internal.measurement.zzkl) r0
            boolean r1 = r0.zzc()
            if (r1 != 0) goto L_0x0313
            int r1 = r0.size()
            if (r1 != 0) goto L_0x030b
            r1 = 10
            goto L_0x030c
        L_0x030b:
            int r1 = r1 + r1
        L_0x030c:
            com.google.android.gms.internal.measurement.zzkl r0 = r0.zzd(r1)
            r10.putObject(r14, r11, r0)
        L_0x0313:
            r7 = r0
            com.google.android.gms.internal.measurement.zzlw r0 = r15.zzE(r13)
            r1 = r18
            r2 = r31
            r3 = r21
            r8 = r4
            r4 = r33
            r22 = r5
            r5 = r7
            r27 = r6
            r6 = r35
            int r0 = com.google.android.gms.internal.measurement.zzir.zze(r0, r1, r2, r3, r4, r5, r6)
            r12 = r31
            r11 = r34
            r2 = r8
            r3 = r13
            r5 = r22
        L_0x0334:
            r6 = r27
            r13 = r33
            goto L_0x0019
        L_0x033a:
            r22 = r5
            r27 = r6
            r32 = r4
            r28 = r10
            r15 = r21
            r21 = r13
            goto L_0x03c9
        L_0x0348:
            r22 = r5
            r27 = r6
            r5 = r4
            r0 = 49
            if (r3 > r0) goto L_0x039e
            long r1 = (long) r8
            r0 = r29
            r23 = r1
            r1 = r30
            r2 = r31
            r8 = r3
            r3 = r21
            r4 = r33
            r32 = r5
            r5 = r18
            r6 = r32
            r20 = r8
            r8 = r13
            r28 = r10
            r9 = r23
            r25 = r11
            r15 = r21
            r12 = r34
            r11 = r20
            r21 = r13
            r12 = r25
            r14 = r35
            int r0 = r0.zzv(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x039a
        L_0x0380:
            r15 = r29
            r14 = r30
            r12 = r31
            r2 = r32
            r13 = r33
            r11 = r34
            r9 = r35
            r1 = r18
            r3 = r21
            r5 = r22
            r6 = r27
            r10 = r28
            goto L_0x0019
        L_0x039a:
            r7 = r34
            r2 = r0
            goto L_0x03cc
        L_0x039e:
            r20 = r3
            r32 = r5
            r28 = r10
            r25 = r11
            r15 = r21
            r21 = r13
            r0 = 50
            r9 = r20
            if (r9 != r0) goto L_0x03d1
            r0 = 2
            if (r7 != r0) goto L_0x03c9
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r15
            r4 = r33
            r5 = r21
            r6 = r25
            r8 = r35
            int r0 = r0.zzs(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x039a
            goto L_0x0380
        L_0x03c9:
            r7 = r34
            r2 = r15
        L_0x03cc:
            r8 = r18
            r6 = r27
            goto L_0x03eb
        L_0x03d1:
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r15
            r4 = r33
            r5 = r18
            r6 = r32
            r10 = r25
            r12 = r21
            r13 = r35
            int r0 = r0.zzt(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x039a
            goto L_0x0380
        L_0x03eb:
            if (r8 != r7) goto L_0x03f9
            if (r7 == 0) goto L_0x03f9
            r9 = r29
            r12 = r30
            r0 = r2
            r1 = r8
            r5 = r22
            goto L_0x045e
        L_0x03f9:
            r9 = r29
            boolean r0 = r9.zzh
            if (r0 == 0) goto L_0x042e
            r10 = r35
            com.google.android.gms.internal.measurement.zzjq r0 = r10.zzd
            com.google.android.gms.internal.measurement.zzjq r1 = com.google.android.gms.internal.measurement.zzjq.zza
            if (r0 == r1) goto L_0x0429
            com.google.android.gms.internal.measurement.zzll r1 = r9.zzg
            r11 = r32
            com.google.android.gms.internal.measurement.zzkc r0 = r0.zzb(r1, r11)
            if (r0 != 0) goto L_0x0423
            com.google.android.gms.internal.measurement.zzmo r4 = zzd(r30)
            r0 = r8
            r1 = r31
            r3 = r33
            r5 = r35
            int r0 = com.google.android.gms.internal.measurement.zzir.zzi(r0, r1, r2, r3, r4, r5)
            r12 = r30
            goto L_0x0443
        L_0x0423:
            r12 = r30
            r0 = r12
            com.google.android.gms.internal.measurement.zzkb r0 = (com.google.android.gms.internal.measurement.zzkb) r0
            throw r17
        L_0x0429:
            r12 = r30
            r11 = r32
            goto L_0x0434
        L_0x042e:
            r12 = r30
            r11 = r32
            r10 = r35
        L_0x0434:
            com.google.android.gms.internal.measurement.zzmo r4 = zzd(r30)
            r0 = r8
            r1 = r31
            r3 = r33
            r5 = r35
            int r0 = com.google.android.gms.internal.measurement.zzir.zzi(r0, r1, r2, r3, r4, r5)
        L_0x0443:
            r13 = r33
            r1 = r8
            r15 = r9
            r9 = r10
            r2 = r11
            r14 = r12
            r3 = r21
            r5 = r22
            r10 = r28
            r12 = r31
            r11 = r7
            goto L_0x0019
        L_0x0455:
            r22 = r5
            r27 = r6
            r28 = r10
            r7 = r11
            r12 = r14
            r9 = r15
        L_0x045e:
            r2 = 1048575(0xfffff, float:1.469367E-39)
            if (r6 == r2) goto L_0x0469
            long r3 = (long) r6
            r6 = r28
            r6.putInt(r12, r3, r5)
        L_0x0469:
            int r3 = r9.zzk
        L_0x046b:
            int r4 = r9.zzl
            if (r3 >= r4) goto L_0x0496
            int[] r4 = r9.zzj
            r4 = r4[r3]
            int[] r5 = r9.zzc
            r5 = r5[r4]
            int r5 = r9.zzB(r4)
            r5 = r5 & r2
            long r5 = (long) r5
            java.lang.Object r5 = com.google.android.gms.internal.measurement.zzmx.zzf(r12, r5)
            if (r5 != 0) goto L_0x0484
            goto L_0x048a
        L_0x0484:
            com.google.android.gms.internal.measurement.zzki r6 = r9.zzD(r4)
            if (r6 != 0) goto L_0x048d
        L_0x048a:
            int r3 = r3 + 1
            goto L_0x046b
        L_0x048d:
            com.google.android.gms.internal.measurement.zzlf r5 = (com.google.android.gms.internal.measurement.zzlf) r5
            java.lang.Object r0 = r9.zzF(r4)
            com.google.android.gms.internal.measurement.zzle r0 = (com.google.android.gms.internal.measurement.zzle) r0
            throw r17
        L_0x0496:
            if (r7 != 0) goto L_0x04a2
            r2 = r33
            if (r0 != r2) goto L_0x049d
            goto L_0x04a8
        L_0x049d:
            com.google.android.gms.internal.measurement.zzko r0 = com.google.android.gms.internal.measurement.zzko.zze()
            throw r0
        L_0x04a2:
            r2 = r33
            if (r0 > r2) goto L_0x04a9
            if (r1 != r7) goto L_0x04a9
        L_0x04a8:
            return r0
        L_0x04a9:
            com.google.android.gms.internal.measurement.zzko r0 = com.google.android.gms.internal.measurement.zzko.zze()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlo.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.zziq):int");
    }

    public final Object zze() {
        return ((zzke) this.zzg).zzl(4, (Object) null, (Object) null);
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
            Object zzf2 = zzmx.zzf(obj, zzB);
            if (zzf2 != null) {
                ((zzlf) zzf2).zzc();
                zzmx.zzs(obj, zzB, zzf2);
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
            this.zzo.zzb(obj);
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
                    if (!zzO(obj2, i)) {
                        break;
                    } else {
                        zzmx.zzo(obj, j, zzmx.zza(obj2, j));
                        zzJ(obj, i);
                        break;
                    }
                case 1:
                    if (!zzO(obj2, i)) {
                        break;
                    } else {
                        zzmx.zzp(obj, j, zzmx.zzb(obj2, j));
                        zzJ(obj, i);
                        break;
                    }
                case 2:
                    if (!zzO(obj2, i)) {
                        break;
                    } else {
                        zzmx.zzr(obj, j, zzmx.zzd(obj2, j));
                        zzJ(obj, i);
                        break;
                    }
                case 3:
                    if (!zzO(obj2, i)) {
                        break;
                    } else {
                        zzmx.zzr(obj, j, zzmx.zzd(obj2, j));
                        zzJ(obj, i);
                        break;
                    }
                case 4:
                    if (!zzO(obj2, i)) {
                        break;
                    } else {
                        zzmx.zzq(obj, j, zzmx.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    }
                case 5:
                    if (!zzO(obj2, i)) {
                        break;
                    } else {
                        zzmx.zzr(obj, j, zzmx.zzd(obj2, j));
                        zzJ(obj, i);
                        break;
                    }
                case 6:
                    if (!zzO(obj2, i)) {
                        break;
                    } else {
                        zzmx.zzq(obj, j, zzmx.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    }
                case 7:
                    if (!zzO(obj2, i)) {
                        break;
                    } else {
                        zzmx.zzm(obj, j, zzmx.zzw(obj2, j));
                        zzJ(obj, i);
                        break;
                    }
                case 8:
                    if (!zzO(obj2, i)) {
                        break;
                    } else {
                        zzmx.zzs(obj, j, zzmx.zzf(obj2, j));
                        zzJ(obj, i);
                        break;
                    }
                case 9:
                    zzH(obj, obj2, i);
                    break;
                case 10:
                    if (!zzO(obj2, i)) {
                        break;
                    } else {
                        zzmx.zzs(obj, j, zzmx.zzf(obj2, j));
                        zzJ(obj, i);
                        break;
                    }
                case 11:
                    if (!zzO(obj2, i)) {
                        break;
                    } else {
                        zzmx.zzq(obj, j, zzmx.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    }
                case 12:
                    if (!zzO(obj2, i)) {
                        break;
                    } else {
                        zzmx.zzq(obj, j, zzmx.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    }
                case 13:
                    if (!zzO(obj2, i)) {
                        break;
                    } else {
                        zzmx.zzq(obj, j, zzmx.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    }
                case 14:
                    if (!zzO(obj2, i)) {
                        break;
                    } else {
                        zzmx.zzr(obj, j, zzmx.zzd(obj2, j));
                        zzJ(obj, i);
                        break;
                    }
                case 15:
                    if (!zzO(obj2, i)) {
                        break;
                    } else {
                        zzmx.zzq(obj, j, zzmx.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    }
                case 16:
                    if (!zzO(obj2, i)) {
                        break;
                    } else {
                        zzmx.zzr(obj, j, zzmx.zzd(obj2, j));
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
                    zzly.zzaa(this.zzq, obj, obj2, j);
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
                    if (!zzR(obj2, i2, i)) {
                        break;
                    } else {
                        zzmx.zzs(obj, j, zzmx.zzf(obj2, j));
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
                    if (!zzR(obj2, i2, i)) {
                        break;
                    } else {
                        zzmx.zzs(obj, j, zzmx.zzf(obj2, j));
                        zzK(obj, i2, i);
                        break;
                    }
                case 68:
                    zzI(obj, obj2, i);
                    break;
            }
        }
        zzly.zzF(this.zzn, obj, obj2);
        if (this.zzh) {
            zzly.zzE(this.zzo, obj, obj2);
        }
    }

    public final void zzh(Object obj, byte[] bArr, int i, int i2, zziq zziq) throws IOException {
        if (this.zzi) {
            zzu(obj, bArr, i, i2, zziq);
        } else {
            zzc(obj, bArr, i, i2, 0, zziq);
        }
    }

    public final void zzi(Object obj, zznf zznf) throws IOException {
        if (!this.zzi) {
            zzL(obj, zznf);
        } else if (!this.zzh) {
            int length = this.zzc.length;
            for (int i = 0; i < length; i += 3) {
                int zzB = zzB(i);
                int i2 = this.zzc[i];
                switch (zzA(zzB)) {
                    case 0:
                        if (!zzO(obj, i)) {
                            break;
                        } else {
                            zznf.zzf(i2, zzmx.zza(obj, (long) (zzB & 1048575)));
                            break;
                        }
                    case 1:
                        if (!zzO(obj, i)) {
                            break;
                        } else {
                            zznf.zzo(i2, zzmx.zzb(obj, (long) (zzB & 1048575)));
                            break;
                        }
                    case 2:
                        if (!zzO(obj, i)) {
                            break;
                        } else {
                            zznf.zzt(i2, zzmx.zzd(obj, (long) (zzB & 1048575)));
                            break;
                        }
                    case 3:
                        if (!zzO(obj, i)) {
                            break;
                        } else {
                            zznf.zzJ(i2, zzmx.zzd(obj, (long) (zzB & 1048575)));
                            break;
                        }
                    case 4:
                        if (!zzO(obj, i)) {
                            break;
                        } else {
                            zznf.zzr(i2, zzmx.zzc(obj, (long) (zzB & 1048575)));
                            break;
                        }
                    case 5:
                        if (!zzO(obj, i)) {
                            break;
                        } else {
                            zznf.zzm(i2, zzmx.zzd(obj, (long) (zzB & 1048575)));
                            break;
                        }
                    case 6:
                        if (!zzO(obj, i)) {
                            break;
                        } else {
                            zznf.zzk(i2, zzmx.zzc(obj, (long) (zzB & 1048575)));
                            break;
                        }
                    case 7:
                        if (!zzO(obj, i)) {
                            break;
                        } else {
                            zznf.zzb(i2, zzmx.zzw(obj, (long) (zzB & 1048575)));
                            break;
                        }
                    case 8:
                        if (!zzO(obj, i)) {
                            break;
                        } else {
                            zzT(i2, zzmx.zzf(obj, (long) (zzB & 1048575)), zznf);
                            break;
                        }
                    case 9:
                        if (!zzO(obj, i)) {
                            break;
                        } else {
                            zznf.zzv(i2, zzmx.zzf(obj, (long) (zzB & 1048575)), zzE(i));
                            break;
                        }
                    case 10:
                        if (!zzO(obj, i)) {
                            break;
                        } else {
                            zznf.zzd(i2, (zzjd) zzmx.zzf(obj, (long) (zzB & 1048575)));
                            break;
                        }
                    case 11:
                        if (!zzO(obj, i)) {
                            break;
                        } else {
                            zznf.zzH(i2, zzmx.zzc(obj, (long) (zzB & 1048575)));
                            break;
                        }
                    case 12:
                        if (!zzO(obj, i)) {
                            break;
                        } else {
                            zznf.zzi(i2, zzmx.zzc(obj, (long) (zzB & 1048575)));
                            break;
                        }
                    case 13:
                        if (!zzO(obj, i)) {
                            break;
                        } else {
                            zznf.zzw(i2, zzmx.zzc(obj, (long) (zzB & 1048575)));
                            break;
                        }
                    case 14:
                        if (!zzO(obj, i)) {
                            break;
                        } else {
                            zznf.zzy(i2, zzmx.zzd(obj, (long) (zzB & 1048575)));
                            break;
                        }
                    case 15:
                        if (!zzO(obj, i)) {
                            break;
                        } else {
                            zznf.zzA(i2, zzmx.zzc(obj, (long) (zzB & 1048575)));
                            break;
                        }
                    case 16:
                        if (!zzO(obj, i)) {
                            break;
                        } else {
                            zznf.zzC(i2, zzmx.zzd(obj, (long) (zzB & 1048575)));
                            break;
                        }
                    case 17:
                        if (!zzO(obj, i)) {
                            break;
                        } else {
                            zznf.zzq(i2, zzmx.zzf(obj, (long) (zzB & 1048575)), zzE(i));
                            break;
                        }
                    case 18:
                        zzly.zzJ(i2, (List) zzmx.zzf(obj, (long) (zzB & 1048575)), zznf, false);
                        break;
                    case 19:
                        zzly.zzN(i2, (List) zzmx.zzf(obj, (long) (zzB & 1048575)), zznf, false);
                        break;
                    case 20:
                        zzly.zzQ(i2, (List) zzmx.zzf(obj, (long) (zzB & 1048575)), zznf, false);
                        break;
                    case 21:
                        zzly.zzY(i2, (List) zzmx.zzf(obj, (long) (zzB & 1048575)), zznf, false);
                        break;
                    case 22:
                        zzly.zzP(i2, (List) zzmx.zzf(obj, (long) (zzB & 1048575)), zznf, false);
                        break;
                    case 23:
                        zzly.zzM(i2, (List) zzmx.zzf(obj, (long) (zzB & 1048575)), zznf, false);
                        break;
                    case 24:
                        zzly.zzL(i2, (List) zzmx.zzf(obj, (long) (zzB & 1048575)), zznf, false);
                        break;
                    case 25:
                        zzly.zzH(i2, (List) zzmx.zzf(obj, (long) (zzB & 1048575)), zznf, false);
                        break;
                    case 26:
                        zzly.zzW(i2, (List) zzmx.zzf(obj, (long) (zzB & 1048575)), zznf);
                        break;
                    case 27:
                        zzly.zzR(i2, (List) zzmx.zzf(obj, (long) (zzB & 1048575)), zznf, zzE(i));
                        break;
                    case 28:
                        zzly.zzI(i2, (List) zzmx.zzf(obj, (long) (zzB & 1048575)), zznf);
                        break;
                    case 29:
                        zzly.zzX(i2, (List) zzmx.zzf(obj, (long) (zzB & 1048575)), zznf, false);
                        break;
                    case 30:
                        zzly.zzK(i2, (List) zzmx.zzf(obj, (long) (zzB & 1048575)), zznf, false);
                        break;
                    case 31:
                        zzly.zzS(i2, (List) zzmx.zzf(obj, (long) (zzB & 1048575)), zznf, false);
                        break;
                    case 32:
                        zzly.zzT(i2, (List) zzmx.zzf(obj, (long) (zzB & 1048575)), zznf, false);
                        break;
                    case 33:
                        zzly.zzU(i2, (List) zzmx.zzf(obj, (long) (zzB & 1048575)), zznf, false);
                        break;
                    case 34:
                        zzly.zzV(i2, (List) zzmx.zzf(obj, (long) (zzB & 1048575)), zznf, false);
                        break;
                    case 35:
                        zzly.zzJ(i2, (List) zzmx.zzf(obj, (long) (zzB & 1048575)), zznf, true);
                        break;
                    case 36:
                        zzly.zzN(i2, (List) zzmx.zzf(obj, (long) (zzB & 1048575)), zznf, true);
                        break;
                    case 37:
                        zzly.zzQ(i2, (List) zzmx.zzf(obj, (long) (zzB & 1048575)), zznf, true);
                        break;
                    case 38:
                        zzly.zzY(i2, (List) zzmx.zzf(obj, (long) (zzB & 1048575)), zznf, true);
                        break;
                    case 39:
                        zzly.zzP(i2, (List) zzmx.zzf(obj, (long) (zzB & 1048575)), zznf, true);
                        break;
                    case 40:
                        zzly.zzM(i2, (List) zzmx.zzf(obj, (long) (zzB & 1048575)), zznf, true);
                        break;
                    case 41:
                        zzly.zzL(i2, (List) zzmx.zzf(obj, (long) (zzB & 1048575)), zznf, true);
                        break;
                    case 42:
                        zzly.zzH(i2, (List) zzmx.zzf(obj, (long) (zzB & 1048575)), zznf, true);
                        break;
                    case 43:
                        zzly.zzX(i2, (List) zzmx.zzf(obj, (long) (zzB & 1048575)), zznf, true);
                        break;
                    case 44:
                        zzly.zzK(i2, (List) zzmx.zzf(obj, (long) (zzB & 1048575)), zznf, true);
                        break;
                    case 45:
                        zzly.zzS(i2, (List) zzmx.zzf(obj, (long) (zzB & 1048575)), zznf, true);
                        break;
                    case 46:
                        zzly.zzT(i2, (List) zzmx.zzf(obj, (long) (zzB & 1048575)), zznf, true);
                        break;
                    case 47:
                        zzly.zzU(i2, (List) zzmx.zzf(obj, (long) (zzB & 1048575)), zznf, true);
                        break;
                    case 48:
                        zzly.zzV(i2, (List) zzmx.zzf(obj, (long) (zzB & 1048575)), zznf, true);
                        break;
                    case 49:
                        zzly.zzO(i2, (List) zzmx.zzf(obj, (long) (zzB & 1048575)), zznf, zzE(i));
                        break;
                    case 50:
                        zzM(zznf, i2, zzmx.zzf(obj, (long) (zzB & 1048575)), i);
                        break;
                    case 51:
                        if (!zzR(obj, i2, i)) {
                            break;
                        } else {
                            zznf.zzf(i2, zzn(obj, (long) (zzB & 1048575)));
                            break;
                        }
                    case 52:
                        if (!zzR(obj, i2, i)) {
                            break;
                        } else {
                            zznf.zzo(i2, zzo(obj, (long) (zzB & 1048575)));
                            break;
                        }
                    case 53:
                        if (!zzR(obj, i2, i)) {
                            break;
                        } else {
                            zznf.zzt(i2, zzC(obj, (long) (zzB & 1048575)));
                            break;
                        }
                    case 54:
                        if (!zzR(obj, i2, i)) {
                            break;
                        } else {
                            zznf.zzJ(i2, zzC(obj, (long) (zzB & 1048575)));
                            break;
                        }
                    case 55:
                        if (!zzR(obj, i2, i)) {
                            break;
                        } else {
                            zznf.zzr(i2, zzr(obj, (long) (zzB & 1048575)));
                            break;
                        }
                    case 56:
                        if (!zzR(obj, i2, i)) {
                            break;
                        } else {
                            zznf.zzm(i2, zzC(obj, (long) (zzB & 1048575)));
                            break;
                        }
                    case 57:
                        if (!zzR(obj, i2, i)) {
                            break;
                        } else {
                            zznf.zzk(i2, zzr(obj, (long) (zzB & 1048575)));
                            break;
                        }
                    case 58:
                        if (!zzR(obj, i2, i)) {
                            break;
                        } else {
                            zznf.zzb(i2, zzS(obj, (long) (zzB & 1048575)));
                            break;
                        }
                    case 59:
                        if (!zzR(obj, i2, i)) {
                            break;
                        } else {
                            zzT(i2, zzmx.zzf(obj, (long) (zzB & 1048575)), zznf);
                            break;
                        }
                    case 60:
                        if (!zzR(obj, i2, i)) {
                            break;
                        } else {
                            zznf.zzv(i2, zzmx.zzf(obj, (long) (zzB & 1048575)), zzE(i));
                            break;
                        }
                    case 61:
                        if (!zzR(obj, i2, i)) {
                            break;
                        } else {
                            zznf.zzd(i2, (zzjd) zzmx.zzf(obj, (long) (zzB & 1048575)));
                            break;
                        }
                    case 62:
                        if (!zzR(obj, i2, i)) {
                            break;
                        } else {
                            zznf.zzH(i2, zzr(obj, (long) (zzB & 1048575)));
                            break;
                        }
                    case 63:
                        if (!zzR(obj, i2, i)) {
                            break;
                        } else {
                            zznf.zzi(i2, zzr(obj, (long) (zzB & 1048575)));
                            break;
                        }
                    case 64:
                        if (!zzR(obj, i2, i)) {
                            break;
                        } else {
                            zznf.zzw(i2, zzr(obj, (long) (zzB & 1048575)));
                            break;
                        }
                    case 65:
                        if (!zzR(obj, i2, i)) {
                            break;
                        } else {
                            zznf.zzy(i2, zzC(obj, (long) (zzB & 1048575)));
                            break;
                        }
                    case 66:
                        if (!zzR(obj, i2, i)) {
                            break;
                        } else {
                            zznf.zzA(i2, zzr(obj, (long) (zzB & 1048575)));
                            break;
                        }
                    case 67:
                        if (!zzR(obj, i2, i)) {
                            break;
                        } else {
                            zznf.zzC(i2, zzC(obj, (long) (zzB & 1048575)));
                            break;
                        }
                    case 68:
                        if (!zzR(obj, i2, i)) {
                            break;
                        } else {
                            zznf.zzq(i2, zzmx.zzf(obj, (long) (zzB & 1048575)), zzE(i));
                            break;
                        }
                }
            }
            zzmn zzmn = this.zzn;
            zzmn.zzi(zzmn.zzc(obj), zznf);
        } else {
            this.zzo.zza(obj);
            throw null;
        }
    }

    public final boolean zzj(Object obj, Object obj2) {
        boolean z;
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int zzB = zzB(i);
            long j = (long) (zzB & 1048575);
            switch (zzA(zzB)) {
                case 0:
                    if (zzN(obj, obj2, i) && Double.doubleToLongBits(zzmx.zza(obj, j)) == Double.doubleToLongBits(zzmx.zza(obj2, j))) {
                        continue;
                    }
                case 1:
                    if (zzN(obj, obj2, i) && Float.floatToIntBits(zzmx.zzb(obj, j)) == Float.floatToIntBits(zzmx.zzb(obj2, j))) {
                        continue;
                    }
                case 2:
                    if (zzN(obj, obj2, i) && zzmx.zzd(obj, j) == zzmx.zzd(obj2, j)) {
                        continue;
                    }
                case 3:
                    if (zzN(obj, obj2, i) && zzmx.zzd(obj, j) == zzmx.zzd(obj2, j)) {
                        continue;
                    }
                case 4:
                    if (zzN(obj, obj2, i) && zzmx.zzc(obj, j) == zzmx.zzc(obj2, j)) {
                        continue;
                    }
                case 5:
                    if (zzN(obj, obj2, i) && zzmx.zzd(obj, j) == zzmx.zzd(obj2, j)) {
                        continue;
                    }
                case 6:
                    if (zzN(obj, obj2, i) && zzmx.zzc(obj, j) == zzmx.zzc(obj2, j)) {
                        continue;
                    }
                case 7:
                    if (zzN(obj, obj2, i) && zzmx.zzw(obj, j) == zzmx.zzw(obj2, j)) {
                        continue;
                    }
                case 8:
                    if (zzN(obj, obj2, i) && zzly.zzZ(zzmx.zzf(obj, j), zzmx.zzf(obj2, j))) {
                        continue;
                    }
                case 9:
                    if (zzN(obj, obj2, i) && zzly.zzZ(zzmx.zzf(obj, j), zzmx.zzf(obj2, j))) {
                        continue;
                    }
                case 10:
                    if (zzN(obj, obj2, i) && zzly.zzZ(zzmx.zzf(obj, j), zzmx.zzf(obj2, j))) {
                        continue;
                    }
                case 11:
                    if (zzN(obj, obj2, i) && zzmx.zzc(obj, j) == zzmx.zzc(obj2, j)) {
                        continue;
                    }
                case 12:
                    if (zzN(obj, obj2, i) && zzmx.zzc(obj, j) == zzmx.zzc(obj2, j)) {
                        continue;
                    }
                case 13:
                    if (zzN(obj, obj2, i) && zzmx.zzc(obj, j) == zzmx.zzc(obj2, j)) {
                        continue;
                    }
                case 14:
                    if (zzN(obj, obj2, i) && zzmx.zzd(obj, j) == zzmx.zzd(obj2, j)) {
                        continue;
                    }
                case 15:
                    if (zzN(obj, obj2, i) && zzmx.zzc(obj, j) == zzmx.zzc(obj2, j)) {
                        continue;
                    }
                case 16:
                    if (zzN(obj, obj2, i) && zzmx.zzd(obj, j) == zzmx.zzd(obj2, j)) {
                        continue;
                    }
                case 17:
                    if (zzN(obj, obj2, i) && zzly.zzZ(zzmx.zzf(obj, j), zzmx.zzf(obj2, j))) {
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
                    z = zzly.zzZ(zzmx.zzf(obj, j), zzmx.zzf(obj2, j));
                    break;
                case 50:
                    z = zzly.zzZ(zzmx.zzf(obj, j), zzmx.zzf(obj2, j));
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
                    if (zzmx.zzc(obj, zzy) == zzmx.zzc(obj2, zzy) && zzly.zzZ(zzmx.zzf(obj, j), zzmx.zzf(obj2, j))) {
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
        if (!this.zzh) {
            return true;
        }
        this.zzo.zza(obj);
        this.zzo.zza(obj2);
        throw null;
    }

    public final boolean zzk(Object obj) {
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
            if ((268435456 & zzB) != 0 && !zzP(obj, i6, i2, i, i11)) {
                return false;
            }
            int zzA = zzA(zzB);
            if (zzA != 9 && zzA != 17) {
                if (zzA != 27) {
                    if (zzA == 60 || zzA == 68) {
                        if (zzR(obj2, i7, i6) && !zzQ(obj2, zzB, zzE(i6))) {
                            return false;
                        }
                    } else if (zzA != 49) {
                        if (zzA == 50 && !((zzlf) zzmx.zzf(obj2, (long) (zzB & 1048575))).isEmpty()) {
                            zzle zzle = (zzle) zzF(i6);
                            throw null;
                        }
                    }
                }
                List list = (List) zzmx.zzf(obj2, (long) (zzB & 1048575));
                if (!list.isEmpty()) {
                    zzlw zzE = zzE(i6);
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        if (!zzE.zzk(list.get(i12))) {
                            return false;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            } else if (zzP(obj, i6, i2, i, i11) && !zzQ(obj2, zzB, zzE(i6))) {
                return false;
            }
            i5++;
            i3 = i2;
            i4 = i;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzo.zza(obj2);
        throw null;
    }
}
