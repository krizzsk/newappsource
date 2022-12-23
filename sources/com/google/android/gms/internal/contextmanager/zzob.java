package com.google.android.gms.internal.contextmanager;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

final class zzob {
    private static final Class<?> zza;
    private static final zzon<?, ?> zzb = zzab(false);
    private static final zzon<?, ?> zzc = zzab(true);
    private static final zzon<?, ?> zzd = new zzop();

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zza = cls;
    }

    public static zzon<?, ?> zzA() {
        return zzc;
    }

    public static zzon<?, ?> zzB() {
        return zzd;
    }

    public static <UT, UB> UB zzC(int i, List<Integer> list, zzmj zzmj, UB ub, zzon<UT, UB> zzon) {
        if (zzmj == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (zzmj.zza(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = zzD(i, intValue, ub, zzon);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return ub;
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!zzmj.zza(intValue2)) {
                    ub = zzD(i, intValue2, ub, zzon);
                    it.remove();
                }
            }
        }
        return ub;
    }

    public static <UT, UB> UB zzD(int i, int i2, UB ub, zzon<UT, UB> zzon) {
        if (ub == null) {
            ub = zzon.zze();
        }
        zzon.zzf(ub, i, (long) i2);
        return ub;
    }

    public static <T, FT extends zzlt<FT>> void zzE(zzlq<FT> zzlq, T t, T t2) {
        zzlu<FT> zzb2 = zzlq.zzb(t2);
        if (!zzb2.zza.isEmpty()) {
            zzlq.zzc(t).zzh(zzb2);
        }
    }

    public static <T, UT, UB> void zzF(zzon<UT, UB> zzon, T t, T t2) {
        zzon.zzh(t, zzon.zzd(zzon.zzc(t), zzon.zzc(t2)));
    }

    public static void zzG(Class<?> cls) {
        Class<?> cls2;
        if (!zzmf.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static boolean zzH(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static <T> void zzI(zzni zzni, T t, T t2, long j) {
        zzox.zzs(t, j, zzni.zzb(zzox.zzf(t, j), zzox.zzf(t2, j)));
    }

    public static void zzJ(int i, List<Boolean> list, zzll zzll, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzll.zzc(i, list, z);
        }
    }

    public static void zzK(int i, List<zzld> list, zzll zzll) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzll.zze(i, list);
        }
    }

    public static void zzL(int i, List<Double> list, zzll zzll, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzll.zzg(i, list, z);
        }
    }

    public static void zzM(int i, List<Integer> list, zzll zzll, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzll.zzj(i, list, z);
        }
    }

    public static void zzN(int i, List<Integer> list, zzll zzll, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzll.zzl(i, list, z);
        }
    }

    public static void zzO(int i, List<Long> list, zzll zzll, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzll.zzn(i, list, z);
        }
    }

    public static void zzP(int i, List<Float> list, zzll zzll, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzll.zzp(i, list, z);
        }
    }

    public static void zzQ(int i, List<?> list, zzll zzll, zznz zznz) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                zzll.zzq(i, list.get(i2), zznz);
            }
        }
    }

    public static void zzR(int i, List<Integer> list, zzll zzll, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzll.zzs(i, list, z);
        }
    }

    public static void zzS(int i, List<Long> list, zzll zzll, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzll.zzu(i, list, z);
        }
    }

    public static void zzT(int i, List<?> list, zzll zzll, zznz zznz) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                zzll.zzv(i, list.get(i2), zznz);
            }
        }
    }

    public static void zzU(int i, List<Integer> list, zzll zzll, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzll.zzy(i, list, z);
        }
    }

    public static void zzV(int i, List<Long> list, zzll zzll, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzll.zzA(i, list, z);
        }
    }

    public static void zzW(int i, List<Integer> list, zzll zzll, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzll.zzC(i, list, z);
        }
    }

    public static void zzX(int i, List<Long> list, zzll zzll, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzll.zzE(i, list, z);
        }
    }

    public static void zzY(int i, List<String> list, zzll zzll) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzll.zzH(i, list);
        }
    }

    public static void zzZ(int i, List<Integer> list, zzll zzll, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzll.zzJ(i, list, z);
        }
    }

    public static int zza(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzlk.zzD(i << 3) + 1) * size;
    }

    public static void zzaa(int i, List<Long> list, zzll zzll, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzll.zzL(i, list, z);
        }
    }

    private static zzon<?, ?> zzab(boolean z) {
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
            return (zzon) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static int zzb(List<?> list) {
        return list.size();
    }

    public static int zzc(int i, List<zzld> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzC = zzlk.zzC(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzC += zzlk.zzu(list.get(i2));
        }
        return zzC;
    }

    public static int zzd(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzlk.zzC(i) * size) + zze(list);
    }

    public static int zze(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzmg) {
            zzmg zzmg = (zzmg) list;
            i = 0;
            while (i2 < size) {
                i += zzlk.zzx(zzmg.zze(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzlk.zzx(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzf(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzlk.zzD(i << 3) + 4) * size;
    }

    public static int zzg(List<?> list) {
        return list.size() * 4;
    }

    public static int zzh(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzlk.zzD(i << 3) + 8) * size;
    }

    public static int zzi(List<?> list) {
        return list.size() * 8;
    }

    public static int zzj(int i, List<zznn> list, zznz zznz) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzlk.zzv(i, list.get(i3), zznz);
        }
        return i2;
    }

    public static int zzk(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzlk.zzC(i) * size) + zzl(list);
    }

    public static int zzl(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzmg) {
            zzmg zzmg = (zzmg) list;
            i = 0;
            while (i2 < size) {
                i += zzlk.zzx(zzmg.zze(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzlk.zzx(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzm(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return (zzlk.zzC(i) * list.size()) + zzn(list);
    }

    public static int zzn(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zznc) {
            zznc zznc = (zznc) list;
            i = 0;
            while (i2 < size) {
                i += zzlk.zzE(zznc.zze(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzlk.zzE(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzo(int i, Object obj, zznz zznz) {
        if (obj instanceof zzmv) {
            int zzD = zzlk.zzD(i << 3);
            int zza2 = ((zzmv) obj).zza();
            return zzlk.zzD(zza2) + zza2 + zzD;
        }
        return zzlk.zzA((zznn) obj, zznz) + zzlk.zzD(i << 3);
    }

    public static int zzp(int i, List<?> list, zznz zznz) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzC = zzlk.zzC(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof zzmv) {
                i2 = zzlk.zzy((zzmv) obj);
            } else {
                i2 = zzlk.zzA((zznn) obj, zznz);
            }
            zzC = i2 + zzC;
        }
        return zzC;
    }

    public static int zzq(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzlk.zzC(i) * size) + zzr(list);
    }

    public static int zzr(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzmg) {
            zzmg zzmg = (zzmg) list;
            i = 0;
            while (i2 < size) {
                int zze = zzmg.zze(i2);
                i += zzlk.zzD((zze >> 31) ^ (zze + zze));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                int intValue = list.get(i2).intValue();
                i3 = i + zzlk.zzD((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    public static int zzs(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzlk.zzC(i) * size) + zzt(list);
    }

    public static int zzt(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zznc) {
            zznc zznc = (zznc) list;
            i = 0;
            while (i2 < size) {
                long zze = zznc.zze(i2);
                i += zzlk.zzE((zze >> 63) ^ (zze + zze));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                long longValue = list.get(i2).longValue();
                i3 = i + zzlk.zzE((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    public static int zzu(int i, List<?> list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int zzC = zzlk.zzC(i) * size;
        if (list instanceof zzmx) {
            zzmx zzmx = (zzmx) list;
            while (i4 < size) {
                Object zzf = zzmx.zzf(i4);
                if (zzf instanceof zzld) {
                    i3 = zzlk.zzu((zzld) zzf);
                } else {
                    i3 = zzlk.zzB((String) zzf);
                }
                zzC = i3 + zzC;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof zzld) {
                    i2 = zzlk.zzu((zzld) obj);
                } else {
                    i2 = zzlk.zzB((String) obj);
                }
                zzC = i2 + zzC;
                i4++;
            }
        }
        return zzC;
    }

    public static int zzv(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzlk.zzC(i) * size) + zzw(list);
    }

    public static int zzw(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzmg) {
            zzmg zzmg = (zzmg) list;
            i = 0;
            while (i2 < size) {
                i += zzlk.zzD(zzmg.zze(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzlk.zzD(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzx(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzlk.zzC(i) * size) + zzy(list);
    }

    public static int zzy(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zznc) {
            zznc zznc = (zznc) list;
            i = 0;
            while (i2 < size) {
                i += zzlk.zzE(zznc.zze(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzlk.zzE(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    public static zzon<?, ?> zzz() {
        return zzb;
    }
}
