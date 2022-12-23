package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

final class zzgmt {
    private static final Class zza;
    private static final zzgni zzb = zzab(false);
    private static final zzgni zzc = zzab(true);
    private static final zzgni zzd = new zzgnk();

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zza = cls;
    }

    public static zzgni zzA() {
        return zzc;
    }

    public static zzgni zzB() {
        return zzd;
    }

    public static Object zzC(int i, List list, zzgks zzgks, Object obj, zzgni zzgni) {
        if (zzgks == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = ((Integer) list.get(i3)).intValue();
                if (zzgks.zza(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    obj = zzD(i, intValue, obj, zzgni);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return obj;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!zzgks.zza(intValue2)) {
                    obj = zzD(i, intValue2, obj, zzgni);
                    it.remove();
                }
            }
        }
        return obj;
    }

    public static Object zzD(int i, int i2, Object obj, zzgni zzgni) {
        if (obj == null) {
            obj = zzgni.zzf();
        }
        zzgni.zzl(obj, i, (long) i2);
        return obj;
    }

    public static void zzE(zzgkb zzgkb, Object obj, Object obj2) {
        zzgkb.zza(obj2);
        throw null;
    }

    public static void zzF(zzgni zzgni, Object obj, Object obj2) {
        zzgni.zzo(obj, zzgni.zze(zzgni.zzd(obj), zzgni.zzd(obj2)));
    }

    public static void zzG(Class cls) {
        Class cls2;
        if (!zzgko.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static boolean zzH(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static void zzI(zzglt zzglt, Object obj, Object obj2, long j) {
        zzgns.zzv(obj, j, zzglt.zzc(zzgns.zzh(obj, j), zzgns.zzh(obj2, j)));
    }

    public static void zzJ(int i, List list, zzgjw zzgjw, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgjw.zzc(i, list, z);
        }
    }

    public static void zzK(int i, List list, zzgjw zzgjw) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgjw.zze(i, list);
        }
    }

    public static void zzL(int i, List list, zzgjw zzgjw, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgjw.zzg(i, list, z);
        }
    }

    public static void zzM(int i, List list, zzgjw zzgjw, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgjw.zzj(i, list, z);
        }
    }

    public static void zzN(int i, List list, zzgjw zzgjw, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgjw.zzl(i, list, z);
        }
    }

    public static void zzO(int i, List list, zzgjw zzgjw, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgjw.zzn(i, list, z);
        }
    }

    public static void zzP(int i, List list, zzgjw zzgjw, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgjw.zzp(i, list, z);
        }
    }

    public static void zzQ(int i, List list, zzgjw zzgjw, zzgmr zzgmr) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                zzgjw.zzq(i, list.get(i2), zzgmr);
            }
        }
    }

    public static void zzR(int i, List list, zzgjw zzgjw, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgjw.zzs(i, list, z);
        }
    }

    public static void zzS(int i, List list, zzgjw zzgjw, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgjw.zzu(i, list, z);
        }
    }

    public static void zzT(int i, List list, zzgjw zzgjw, zzgmr zzgmr) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                zzgjw.zzv(i, list.get(i2), zzgmr);
            }
        }
    }

    public static void zzU(int i, List list, zzgjw zzgjw, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgjw.zzx(i, list, z);
        }
    }

    public static void zzV(int i, List list, zzgjw zzgjw, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgjw.zzz(i, list, z);
        }
    }

    public static void zzW(int i, List list, zzgjw zzgjw, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgjw.zzB(i, list, z);
        }
    }

    public static void zzX(int i, List list, zzgjw zzgjw, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgjw.zzD(i, list, z);
        }
    }

    public static void zzY(int i, List list, zzgjw zzgjw) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgjw.zzG(i, list);
        }
    }

    public static void zzZ(int i, List list, zzgjw zzgjw, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgjw.zzI(i, list, z);
        }
    }

    public static int zza(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgjv.zzE(i << 3) + 1) * size;
    }

    public static void zzaa(int i, List list, zzgjw zzgjw, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgjw.zzK(i, list, z);
        }
    }

    private static zzgni zzab(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (zzgni) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static int zzb(List list) {
        return list.size();
    }

    public static int zzc(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzD = zzgjv.zzD(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzD += zzgjv.zzw((zzgjg) list.get(i2));
        }
        return zzD;
    }

    public static int zzd(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgjv.zzD(i) * size) + zze(list);
    }

    public static int zze(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgkp) {
            zzgkp zzgkp = (zzgkp) list;
            i = 0;
            while (i2 < size) {
                i += zzgjv.zzy(zzgkp.zze(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzgjv.zzy(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzf(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgjv.zzE(i << 3) + 4) * size;
    }

    public static int zzg(List list) {
        return list.size() * 4;
    }

    public static int zzh(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgjv.zzE(i << 3) + 8) * size;
    }

    public static int zzi(List list) {
        return list.size() * 8;
    }

    public static int zzj(int i, List list, zzgmr zzgmr) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzgjv.zzx(i, (zzgly) list.get(i3), zzgmr);
        }
        return i2;
    }

    public static int zzk(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgjv.zzD(i) * size) + zzl(list);
    }

    public static int zzl(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgkp) {
            zzgkp zzgkp = (zzgkp) list;
            i = 0;
            while (i2 < size) {
                i += zzgjv.zzy(zzgkp.zze(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzgjv.zzy(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzm(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return (zzgjv.zzD(i) * list.size()) + zzn(list);
    }

    public static int zzn(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgln) {
            zzgln zzgln = (zzgln) list;
            i = 0;
            while (i2 < size) {
                i += zzgjv.zzF(zzgln.zze(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzgjv.zzF(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzo(int i, Object obj, zzgmr zzgmr) {
        if (obj instanceof zzgle) {
            int zzE = zzgjv.zzE(i << 3);
            int zza2 = ((zzgle) obj).zza();
            return zzgjv.zzE(zza2) + zza2 + zzE;
        }
        return zzgjv.zzA((zzgly) obj, zzgmr) + zzgjv.zzE(i << 3);
    }

    public static int zzp(int i, List list, zzgmr zzgmr) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzD = zzgjv.zzD(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof zzgle) {
                i2 = zzgjv.zzz((zzgle) obj);
            } else {
                i2 = zzgjv.zzA((zzgly) obj, zzgmr);
            }
            zzD = i2 + zzD;
        }
        return zzD;
    }

    public static int zzq(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgjv.zzD(i) * size) + zzr(list);
    }

    public static int zzr(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgkp) {
            zzgkp zzgkp = (zzgkp) list;
            i = 0;
            while (i2 < size) {
                int zze = zzgkp.zze(i2);
                i += zzgjv.zzE((zze >> 31) ^ (zze + zze));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                int intValue = ((Integer) list.get(i2)).intValue();
                i3 = i + zzgjv.zzE((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    public static int zzs(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgjv.zzD(i) * size) + zzt(list);
    }

    public static int zzt(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgln) {
            zzgln zzgln = (zzgln) list;
            i = 0;
            while (i2 < size) {
                long zze = zzgln.zze(i2);
                i += zzgjv.zzF((zze >> 63) ^ (zze + zze));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                long longValue = ((Long) list.get(i2)).longValue();
                i3 = i + zzgjv.zzF((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    public static int zzu(int i, List list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int zzD = zzgjv.zzD(i) * size;
        if (list instanceof zzglg) {
            zzglg zzglg = (zzglg) list;
            while (i4 < size) {
                Object zzf = zzglg.zzf(i4);
                if (zzf instanceof zzgjg) {
                    i3 = zzgjv.zzw((zzgjg) zzf);
                } else {
                    i3 = zzgjv.zzC((String) zzf);
                }
                zzD = i3 + zzD;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof zzgjg) {
                    i2 = zzgjv.zzw((zzgjg) obj);
                } else {
                    i2 = zzgjv.zzC((String) obj);
                }
                zzD = i2 + zzD;
                i4++;
            }
        }
        return zzD;
    }

    public static int zzv(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgjv.zzD(i) * size) + zzw(list);
    }

    public static int zzw(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgkp) {
            zzgkp zzgkp = (zzgkp) list;
            i = 0;
            while (i2 < size) {
                i += zzgjv.zzE(zzgkp.zze(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzgjv.zzE(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzx(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgjv.zzD(i) * size) + zzy(list);
    }

    public static int zzy(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgln) {
            zzgln zzgln = (zzgln) list;
            i = 0;
            while (i2 < size) {
                i += zzgjv.zzF(zzgln.zze(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzgjv.zzF(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static zzgni zzz() {
        return zzb;
    }
}
