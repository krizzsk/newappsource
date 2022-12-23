package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

final class zzgd {
    private static final Class zza;
    private static final zzgp zzb = zzab(false);
    private static final zzgp zzc = zzab(true);
    private static final zzgp zzd = new zzgr();

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zza = cls;
    }

    public static zzgp zzA() {
        return zzc;
    }

    public static zzgp zzB() {
        return zzd;
    }

    public static Object zzC(int i, List list, zzeg zzeg, Object obj, zzgp zzgp) {
        if (zzeg == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = ((Integer) list.get(i3)).intValue();
                if (zzeg.zza(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    obj = zzD(i, intValue, obj, zzgp);
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
                if (!zzeg.zza(intValue2)) {
                    obj = zzD(i, intValue2, obj, zzgp);
                    it.remove();
                }
            }
        }
        return obj;
    }

    public static Object zzD(int i, int i2, Object obj, zzgp zzgp) {
        if (obj == null) {
            obj = zzgp.zze();
        }
        zzgp.zzf(obj, i, (long) i2);
        return obj;
    }

    public static void zzE(zzdo zzdo, Object obj, Object obj2) {
        zzds zzb2 = zzdo.zzb(obj2);
        if (!zzb2.zza.isEmpty()) {
            zzdo.zzc(obj).zzh(zzb2);
        }
    }

    public static void zzF(zzgp zzgp, Object obj, Object obj2) {
        zzgp.zzh(obj, zzgp.zzd(zzgp.zzc(obj), zzgp.zzc(obj2)));
    }

    public static void zzG(Class cls) {
        Class cls2;
        if (!zzec.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static boolean zzH(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static void zzI(zzfg zzfg, Object obj, Object obj2, long j) {
        zzgz.zzs(obj, j, zzfg.zzb(zzgz.zzf(obj, j), zzgz.zzf(obj2, j)));
    }

    public static void zzJ(int i, List list, zzdj zzdj, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzdj.zzc(i, list, z);
        }
    }

    public static void zzK(int i, List list, zzdj zzdj) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzdj.zze(i, list);
        }
    }

    public static void zzL(int i, List list, zzdj zzdj, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzdj.zzg(i, list, z);
        }
    }

    public static void zzM(int i, List list, zzdj zzdj, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzdj.zzj(i, list, z);
        }
    }

    public static void zzN(int i, List list, zzdj zzdj, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzdj.zzl(i, list, z);
        }
    }

    public static void zzO(int i, List list, zzdj zzdj, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzdj.zzn(i, list, z);
        }
    }

    public static void zzP(int i, List list, zzdj zzdj, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzdj.zzp(i, list, z);
        }
    }

    public static void zzQ(int i, List list, zzdj zzdj, zzgb zzgb) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                zzdj.zzq(i, list.get(i2), zzgb);
            }
        }
    }

    public static void zzR(int i, List list, zzdj zzdj, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzdj.zzs(i, list, z);
        }
    }

    public static void zzS(int i, List list, zzdj zzdj, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzdj.zzu(i, list, z);
        }
    }

    public static void zzT(int i, List list, zzdj zzdj, zzgb zzgb) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                zzdj.zzv(i, list.get(i2), zzgb);
            }
        }
    }

    public static void zzU(int i, List list, zzdj zzdj, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzdj.zzy(i, list, z);
        }
    }

    public static void zzV(int i, List list, zzdj zzdj, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzdj.zzA(i, list, z);
        }
    }

    public static void zzW(int i, List list, zzdj zzdj, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzdj.zzC(i, list, z);
        }
    }

    public static void zzX(int i, List list, zzdj zzdj, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzdj.zzE(i, list, z);
        }
    }

    public static void zzY(int i, List list, zzdj zzdj) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzdj.zzH(i, list);
        }
    }

    public static void zzZ(int i, List list, zzdj zzdj, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzdj.zzJ(i, list, z);
        }
    }

    public static int zza(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzdi.zzD(i << 3) + 1) * size;
    }

    public static void zzaa(int i, List list, zzdj zzdj, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzdj.zzL(i, list, z);
        }
    }

    private static zzgp zzab(boolean z) {
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
            return (zzgp) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
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
        int zzC = zzdi.zzC(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzC += zzdi.zzu((zzdb) list.get(i2));
        }
        return zzC;
    }

    public static int zzd(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzdi.zzC(i) * size) + zze(list);
    }

    public static int zze(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzed) {
            zzed zzed = (zzed) list;
            i = 0;
            while (i2 < size) {
                i += zzdi.zzx(zzed.zze(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzdi.zzx(((Integer) list.get(i2)).intValue());
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
        return (zzdi.zzD(i << 3) + 4) * size;
    }

    public static int zzg(List list) {
        return list.size() * 4;
    }

    public static int zzh(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzdi.zzD(i << 3) + 8) * size;
    }

    public static int zzi(List list) {
        return list.size() * 8;
    }

    public static int zzj(int i, List list, zzgb zzgb) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzdi.zzv(i, (zzfl) list.get(i3), zzgb);
        }
        return i2;
    }

    public static int zzk(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzdi.zzC(i) * size) + zzl(list);
    }

    public static int zzl(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzed) {
            zzed zzed = (zzed) list;
            i = 0;
            while (i2 < size) {
                i += zzdi.zzx(zzed.zze(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzdi.zzx(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzm(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return (zzdi.zzC(i) * list.size()) + zzn(list);
    }

    public static int zzn(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzfa) {
            zzfa zzfa = (zzfa) list;
            i = 0;
            while (i2 < size) {
                i += zzdi.zzE(zzfa.zze(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzdi.zzE(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzo(int i, Object obj, zzgb zzgb) {
        if (obj instanceof zzet) {
            int zzD = zzdi.zzD(i << 3);
            int zza2 = ((zzet) obj).zza();
            return zzdi.zzD(zza2) + zza2 + zzD;
        }
        return zzdi.zzA((zzfl) obj, zzgb) + zzdi.zzD(i << 3);
    }

    public static int zzp(int i, List list, zzgb zzgb) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzC = zzdi.zzC(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof zzet) {
                i2 = zzdi.zzy((zzet) obj);
            } else {
                i2 = zzdi.zzA((zzfl) obj, zzgb);
            }
            zzC = i2 + zzC;
        }
        return zzC;
    }

    public static int zzq(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzdi.zzC(i) * size) + zzr(list);
    }

    public static int zzr(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzed) {
            zzed zzed = (zzed) list;
            i = 0;
            while (i2 < size) {
                int zze = zzed.zze(i2);
                i += zzdi.zzD((zze >> 31) ^ (zze + zze));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                int intValue = ((Integer) list.get(i2)).intValue();
                i3 = i + zzdi.zzD((intValue >> 31) ^ (intValue + intValue));
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
        return (zzdi.zzC(i) * size) + zzt(list);
    }

    public static int zzt(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzfa) {
            zzfa zzfa = (zzfa) list;
            i = 0;
            while (i2 < size) {
                long zze = zzfa.zze(i2);
                i += zzdi.zzE((zze >> 63) ^ (zze + zze));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                long longValue = ((Long) list.get(i2)).longValue();
                i3 = i + zzdi.zzE((longValue >> 63) ^ (longValue + longValue));
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
        int zzC = zzdi.zzC(i) * size;
        if (list instanceof zzev) {
            zzev zzev = (zzev) list;
            while (i4 < size) {
                Object zzf = zzev.zzf(i4);
                if (zzf instanceof zzdb) {
                    i3 = zzdi.zzu((zzdb) zzf);
                } else {
                    i3 = zzdi.zzB((String) zzf);
                }
                zzC = i3 + zzC;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof zzdb) {
                    i2 = zzdi.zzu((zzdb) obj);
                } else {
                    i2 = zzdi.zzB((String) obj);
                }
                zzC = i2 + zzC;
                i4++;
            }
        }
        return zzC;
    }

    public static int zzv(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzdi.zzC(i) * size) + zzw(list);
    }

    public static int zzw(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzed) {
            zzed zzed = (zzed) list;
            i = 0;
            while (i2 < size) {
                i += zzdi.zzD(zzed.zze(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzdi.zzD(((Integer) list.get(i2)).intValue());
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
        return (zzdi.zzC(i) * size) + zzy(list);
    }

    public static int zzy(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzfa) {
            zzfa zzfa = (zzfa) list;
            i = 0;
            while (i2 < size) {
                i += zzdi.zzE(zzfa.zze(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzdi.zzE(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static zzgp zzz() {
        return zzb;
    }
}
