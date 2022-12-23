package com.google.android.gms.internal.gtm;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

final class zzwz {
    private static final Class<?> zza;
    private static final zzxo<?, ?> zzb = zzab(false);
    private static final zzxo<?, ?> zzc = zzab(true);
    private static final zzxo<?, ?> zzd = new zzxq();

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zza = cls;
    }

    public static zzxo<?, ?> zzA() {
        return zzc;
    }

    public static zzxo<?, ?> zzB() {
        return zzd;
    }

    public static <UT, UB> UB zzC(int i, List<Integer> list, zzvd zzvd, UB ub, zzxo<UT, UB> zzxo) {
        if (zzvd == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (zzvd.zza(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = zzD(i, intValue, ub, zzxo);
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
                if (!zzvd.zza(intValue2)) {
                    ub = zzD(i, intValue2, ub, zzxo);
                    it.remove();
                }
            }
        }
        return ub;
    }

    public static <UT, UB> UB zzD(int i, int i2, UB ub, zzxo<UT, UB> zzxo) {
        if (ub == null) {
            ub = zzxo.zzf();
        }
        zzxo.zzl(ub, i, (long) i2);
        return ub;
    }

    public static <T, FT extends zzun<FT>> void zzE(zzuk<FT> zzuk, T t, T t2) {
        zzuo<FT> zzb2 = zzuk.zzb(t2);
        if (!zzb2.zza.isEmpty()) {
            zzuk.zzc(t).zzh(zzb2);
        }
    }

    public static <T, UT, UB> void zzF(zzxo<UT, UB> zzxo, T t, T t2) {
        zzxo.zzo(t, zzxo.zze(zzxo.zzd(t), zzxo.zzd(t2)));
    }

    public static void zzG(Class<?> cls) {
        Class<?> cls2;
        if (!zzuz.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static boolean zzH(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static <T> void zzI(zzwf zzwf, T t, T t2, long j) {
        zzxy.zzs(t, j, zzwf.zzc(zzxy.zzf(t, j), zzxy.zzf(t2, j)));
    }

    public static void zzJ(int i, List<Boolean> list, zztp zztp, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zztp.zzc(i, list, z);
        }
    }

    public static void zzK(int i, List<zztd> list, zztp zztp) throws IOException {
        if (list != null && !list.isEmpty()) {
            zztp.zze(i, list);
        }
    }

    public static void zzL(int i, List<Double> list, zztp zztp, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zztp.zzg(i, list, z);
        }
    }

    public static void zzM(int i, List<Integer> list, zztp zztp, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zztp.zzj(i, list, z);
        }
    }

    public static void zzN(int i, List<Integer> list, zztp zztp, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zztp.zzl(i, list, z);
        }
    }

    public static void zzO(int i, List<Long> list, zztp zztp, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zztp.zzn(i, list, z);
        }
    }

    public static void zzP(int i, List<Float> list, zztp zztp, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zztp.zzp(i, list, z);
        }
    }

    public static void zzQ(int i, List<?> list, zztp zztp, zzwx zzwx) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                zztp.zzq(i, list.get(i2), zzwx);
            }
        }
    }

    public static void zzR(int i, List<Integer> list, zztp zztp, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zztp.zzs(i, list, z);
        }
    }

    public static void zzS(int i, List<Long> list, zztp zztp, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zztp.zzu(i, list, z);
        }
    }

    public static void zzT(int i, List<?> list, zztp zztp, zzwx zzwx) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                zztp.zzv(i, list.get(i2), zzwx);
            }
        }
    }

    public static void zzU(int i, List<Integer> list, zztp zztp, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zztp.zzy(i, list, z);
        }
    }

    public static void zzV(int i, List<Long> list, zztp zztp, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zztp.zzA(i, list, z);
        }
    }

    public static void zzW(int i, List<Integer> list, zztp zztp, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zztp.zzC(i, list, z);
        }
    }

    public static void zzX(int i, List<Long> list, zztp zztp, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zztp.zzE(i, list, z);
        }
    }

    public static void zzY(int i, List<String> list, zztp zztp) throws IOException {
        if (list != null && !list.isEmpty()) {
            zztp.zzH(i, list);
        }
    }

    public static void zzZ(int i, List<Integer> list, zztp zztp, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zztp.zzJ(i, list, z);
        }
    }

    public static int zza(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzto.zzD(i << 3) + 1) * size;
    }

    public static void zzaa(int i, List<Long> list, zztp zztp, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zztp.zzL(i, list, z);
        }
    }

    private static zzxo<?, ?> zzab(boolean z) {
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
            return (zzxo) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static int zzb(List<?> list) {
        return list.size();
    }

    public static int zzc(int i, List<zztd> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzC = zzto.zzC(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzC += zzto.zzu(list.get(i2));
        }
        return zzC;
    }

    public static int zzd(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzto.zzC(i) * size) + zze(list);
    }

    public static int zze(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzva) {
            zzva zzva = (zzva) list;
            i = 0;
            while (i2 < size) {
                i += zzto.zzx(zzva.zze(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzto.zzx(list.get(i2).intValue());
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
        return (zzto.zzD(i << 3) + 4) * size;
    }

    public static int zzg(List<?> list) {
        return list.size() * 4;
    }

    public static int zzh(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzto.zzD(i << 3) + 8) * size;
    }

    public static int zzi(List<?> list) {
        return list.size() * 8;
    }

    public static int zzj(int i, List<zzwk> list, zzwx zzwx) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzto.zzv(i, list.get(i3), zzwx);
        }
        return i2;
    }

    public static int zzk(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzto.zzC(i) * size) + zzl(list);
    }

    public static int zzl(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzva) {
            zzva zzva = (zzva) list;
            i = 0;
            while (i2 < size) {
                i += zzto.zzx(zzva.zze(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzto.zzx(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzm(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return (zzto.zzC(i) * list.size()) + zzn(list);
    }

    public static int zzn(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzvz) {
            zzvz zzvz = (zzvz) list;
            i = 0;
            while (i2 < size) {
                i += zzto.zzE(zzvz.zze(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzto.zzE(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzo(int i, Object obj, zzwx zzwx) {
        if (obj instanceof zzvq) {
            int zzD = zzto.zzD(i << 3);
            int zza2 = ((zzvq) obj).zza();
            return zzto.zzD(zza2) + zza2 + zzD;
        }
        return zzto.zzA((zzwk) obj, zzwx) + zzto.zzD(i << 3);
    }

    public static int zzp(int i, List<?> list, zzwx zzwx) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzC = zzto.zzC(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof zzvq) {
                i2 = zzto.zzy((zzvq) obj);
            } else {
                i2 = zzto.zzA((zzwk) obj, zzwx);
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
        return (zzto.zzC(i) * size) + zzr(list);
    }

    public static int zzr(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzva) {
            zzva zzva = (zzva) list;
            i = 0;
            while (i2 < size) {
                int zze = zzva.zze(i2);
                i += zzto.zzD((zze >> 31) ^ (zze + zze));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                int intValue = list.get(i2).intValue();
                i3 = i + zzto.zzD((intValue >> 31) ^ (intValue + intValue));
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
        return (zzto.zzC(i) * size) + zzt(list);
    }

    public static int zzt(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzvz) {
            zzvz zzvz = (zzvz) list;
            i = 0;
            while (i2 < size) {
                long zze = zzvz.zze(i2);
                i += zzto.zzE((zze >> 63) ^ (zze + zze));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                long longValue = list.get(i2).longValue();
                i3 = i + zzto.zzE((longValue >> 63) ^ (longValue + longValue));
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
        int zzC = zzto.zzC(i) * size;
        if (list instanceof zzvs) {
            zzvs zzvs = (zzvs) list;
            while (i4 < size) {
                Object zzf = zzvs.zzf(i4);
                if (zzf instanceof zztd) {
                    i3 = zzto.zzu((zztd) zzf);
                } else {
                    i3 = zzto.zzB((String) zzf);
                }
                zzC = i3 + zzC;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof zztd) {
                    i2 = zzto.zzu((zztd) obj);
                } else {
                    i2 = zzto.zzB((String) obj);
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
        return (zzto.zzC(i) * size) + zzw(list);
    }

    public static int zzw(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzva) {
            zzva zzva = (zzva) list;
            i = 0;
            while (i2 < size) {
                i += zzto.zzD(zzva.zze(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzto.zzD(list.get(i2).intValue());
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
        return (zzto.zzC(i) * size) + zzy(list);
    }

    public static int zzy(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzvz) {
            zzvz zzvz = (zzvz) list;
            i = 0;
            while (i2 < size) {
                i += zzto.zzE(zzvz.zze(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzto.zzE(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    public static zzxo<?, ?> zzz() {
        return zzb;
    }
}
