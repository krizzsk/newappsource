package com.google.android.gms.internal.icing;

import java.io.IOException;
import java.util.List;

final class zzer {
    private static final Class<?> zza;
    private static final zzfd<?, ?> zzb = zzZ(false);
    private static final zzfd<?, ?> zzc = zzZ(true);
    private static final zzfd<?, ?> zzd = new zzff();

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zza = cls;
    }

    public static zzfd<?, ?> zzA() {
        return zzb;
    }

    public static zzfd<?, ?> zzB() {
        return zzc;
    }

    public static zzfd<?, ?> zzC() {
        return zzd;
    }

    public static boolean zzD(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static <T, FT extends zzct<FT>> void zzE(zzcq<FT> zzcq, T t, T t2) {
        zzcq.zzb(t2);
        throw null;
    }

    public static <T, UT, UB> void zzF(zzfd<UT, UB> zzfd, T t, T t2) {
        zzfd.zza(t, zzfd.zzd(zzfd.zzb(t), zzfd.zzb(t2)));
    }

    public static <T> void zzG(zzdz zzdz, T t, T t2, long j) {
        zzdy zzdy = (zzdy) zzfn.zzn(t, j);
        zzdy zzdy2 = (zzdy) zzfn.zzn(t2, j);
        if (!zzdy2.isEmpty()) {
            if (!zzdy.zzd()) {
                zzdy = zzdy.zzb();
            }
            zzdy.zza(zzdy2);
        }
        zzfn.zzo(t, j, zzdy);
    }

    public static void zzH(int i, List<Double> list, zzcn zzcn, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzcn.zzz(i, list, z);
        }
    }

    public static void zzI(int i, List<Float> list, zzcn zzcn, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzcn.zzy(i, list, z);
        }
    }

    public static void zzJ(int i, List<Long> list, zzcn zzcn, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzcn.zzv(i, list, z);
        }
    }

    public static void zzK(int i, List<Long> list, zzcn zzcn, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzcn.zzw(i, list, z);
        }
    }

    public static void zzL(int i, List<Long> list, zzcn zzcn, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzcn.zzI(i, list, z);
        }
    }

    public static void zzM(int i, List<Long> list, zzcn zzcn, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzcn.zzx(i, list, z);
        }
    }

    public static void zzN(int i, List<Long> list, zzcn zzcn, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzcn.zzG(i, list, z);
        }
    }

    public static void zzO(int i, List<Integer> list, zzcn zzcn, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzcn.zzt(i, list, z);
        }
    }

    public static void zzP(int i, List<Integer> list, zzcn zzcn, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzcn.zzE(i, list, z);
        }
    }

    public static void zzQ(int i, List<Integer> list, zzcn zzcn, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzcn.zzH(i, list, z);
        }
    }

    public static void zzR(int i, List<Integer> list, zzcn zzcn, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzcn.zzu(i, list, z);
        }
    }

    public static void zzS(int i, List<Integer> list, zzcn zzcn, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzcn.zzF(i, list, z);
        }
    }

    public static void zzT(int i, List<Integer> list, zzcn zzcn, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzcn.zzA(i, list, z);
        }
    }

    public static void zzU(int i, List<Boolean> list, zzcn zzcn, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzcn.zzB(i, list, z);
        }
    }

    public static void zzV(int i, List<String> list, zzcn zzcn) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzcn.zzC(i, list);
        }
    }

    public static void zzW(int i, List<zzcf> list, zzcn zzcn) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzcn.zzD(i, list);
        }
    }

    public static void zzX(int i, List<?> list, zzcn zzcn, zzep zzep) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                zzcn.zzr(i, list.get(i2), zzep);
            }
        }
    }

    public static void zzY(int i, List<?> list, zzcn zzcn, zzep zzep) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                zzcn.zzs(i, list.get(i2), zzep);
            }
        }
    }

    private static zzfd<?, ?> zzZ(boolean z) {
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
            return (zzfd) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static void zza(Class<?> cls) {
        Class<?> cls2;
        if (!zzda.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static int zzb(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzdt) {
            zzdt zzdt = (zzdt) list;
            i = 0;
            while (i2 < size) {
                i += zzcm.zzx(zzdt.zzf(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzcm.zzx(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzc(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return (zzcm.zzu(i) * list.size()) + zzb(list);
    }

    public static int zzd(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzdt) {
            zzdt zzdt = (zzdt) list;
            i = 0;
            while (i2 < size) {
                i += zzcm.zzx(zzdt.zzf(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzcm.zzx(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    public static int zze(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzcm.zzu(i) * size) + zzd(list);
    }

    public static int zzf(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzdt) {
            zzdt zzdt = (zzdt) list;
            i = 0;
            while (i2 < size) {
                long zzf = zzdt.zzf(i2);
                i += zzcm.zzx((zzf >> 63) ^ (zzf + zzf));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                long longValue = list.get(i2).longValue();
                i3 = i + zzcm.zzx((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    public static int zzg(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzcm.zzu(i) * size) + zzf(list);
    }

    public static int zzh(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzdb) {
            zzdb zzdb = (zzdb) list;
            i = 0;
            while (i2 < size) {
                i += zzcm.zzv(zzdb.zzd(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzcm.zzv(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzi(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzcm.zzu(i) * size) + zzh(list);
    }

    public static int zzj(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzdb) {
            zzdb zzdb = (zzdb) list;
            i = 0;
            while (i2 < size) {
                i += zzcm.zzv(zzdb.zzd(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzcm.zzv(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzk(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzcm.zzu(i) * size) + zzj(list);
    }

    public static int zzl(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzdb) {
            zzdb zzdb = (zzdb) list;
            i = 0;
            while (i2 < size) {
                i += zzcm.zzw(zzdb.zzd(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzcm.zzw(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzm(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzcm.zzu(i) * size) + zzl(list);
    }

    public static int zzn(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzdb) {
            zzdb zzdb = (zzdb) list;
            i = 0;
            while (i2 < size) {
                int zzd2 = zzdb.zzd(i2);
                i += zzcm.zzw((zzd2 >> 31) ^ (zzd2 + zzd2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                int intValue = list.get(i2).intValue();
                i3 = i + zzcm.zzw((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    public static int zzo(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzcm.zzu(i) * size) + zzn(list);
    }

    public static int zzp(List<?> list) {
        return list.size() * 4;
    }

    public static int zzq(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzcm.zzw(i << 3) + 4) * size;
    }

    public static int zzr(List<?> list) {
        return list.size() * 8;
    }

    public static int zzs(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzcm.zzw(i << 3) + 8) * size;
    }

    public static int zzt(List<?> list) {
        return list.size();
    }

    public static int zzu(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzcm.zzw(i << 3) + 1) * size;
    }

    public static int zzv(int i, List<?> list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int zzu = zzcm.zzu(i) * size;
        if (list instanceof zzdo) {
            zzdo zzdo = (zzdo) list;
            while (i4 < size) {
                Object zzg = zzdo.zzg(i4);
                if (zzg instanceof zzcf) {
                    i3 = zzcm.zzA((zzcf) zzg);
                } else {
                    i3 = zzcm.zzy((String) zzg);
                }
                zzu = i3 + zzu;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof zzcf) {
                    i2 = zzcm.zzA((zzcf) obj);
                } else {
                    i2 = zzcm.zzy((String) obj);
                }
                zzu = i2 + zzu;
                i4++;
            }
        }
        return zzu;
    }

    public static int zzw(int i, Object obj, zzep zzep) {
        if (obj instanceof zzdm) {
            int zzw = zzcm.zzw(i << 3);
            int zza2 = ((zzdm) obj).zza();
            return zzcm.zzw(zza2) + zza2 + zzw;
        }
        return zzcm.zzB((zzee) obj, zzep) + zzcm.zzw(i << 3);
    }

    public static int zzx(int i, List<?> list, zzep zzep) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzu = zzcm.zzu(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof zzdm) {
                i2 = zzcm.zzz((zzdm) obj);
            } else {
                i2 = zzcm.zzB((zzee) obj, zzep);
            }
            zzu = i2 + zzu;
        }
        return zzu;
    }

    public static int zzy(int i, List<zzcf> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzu = zzcm.zzu(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzu += zzcm.zzA(list.get(i2));
        }
        return zzu;
    }

    public static int zzz(int i, List<zzee> list, zzep zzep) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzcm.zzE(i, list.get(i3), zzep);
        }
        return i2;
    }
}
