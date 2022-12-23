package com.google.android.gms.internal.p986firebaseauthapi;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaea */
final class zzaea {
    private static final Class zza;
    private static final zzaep zzb = zzab(false);
    private static final zzaep zzc = zzab(true);
    private static final zzaep zzd = new zzaer();

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zza = cls;
    }

    public static zzaep zzA() {
        return zzc;
    }

    public static zzaep zzB() {
        return zzd;
    }

    public static Object zzC(int i, List list, zzacl zzacl, Object obj, zzaep zzaep) {
        if (zzacl == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = ((Integer) list.get(i3)).intValue();
                if (zzacl.zza()) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    obj = zzD(i, intValue, obj, zzaep);
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
                if (!zzacl.zza()) {
                    obj = zzD(i, intValue2, obj, zzaep);
                    it.remove();
                }
            }
        }
        return obj;
    }

    public static Object zzD(int i, int i2, Object obj, zzaep zzaep) {
        if (obj == null) {
            obj = zzaep.zzf();
        }
        zzaep.zzl(obj, i, (long) i2);
        return obj;
    }

    public static void zzE(zzabv zzabv, Object obj, Object obj2) {
        zzabv.zza(obj2);
        throw null;
    }

    public static void zzF(zzaep zzaep, Object obj, Object obj2) {
        zzaep.zzo(obj, zzaep.zze(zzaep.zzd(obj), zzaep.zzd(obj2)));
    }

    public static void zzG(Class cls) {
        Class cls2;
        if (!zzach.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static boolean zzH(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static void zzI(zzadh zzadh, Object obj, Object obj2, long j) {
        zzaez.zzs(obj, j, zzadh.zzc(zzaez.zzf(obj, j), zzaez.zzf(obj2, j)));
    }

    public static void zzJ(int i, List list, zzabq zzabq, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzabq.zzc(i, list, z);
        }
    }

    public static void zzK(int i, List list, zzabq zzabq) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzabq.zze(i, list);
        }
    }

    public static void zzL(int i, List list, zzabq zzabq, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzabq.zzg(i, list, z);
        }
    }

    public static void zzM(int i, List list, zzabq zzabq, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzabq.zzj(i, list, z);
        }
    }

    public static void zzN(int i, List list, zzabq zzabq, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzabq.zzl(i, list, z);
        }
    }

    public static void zzO(int i, List list, zzabq zzabq, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzabq.zzn(i, list, z);
        }
    }

    public static void zzP(int i, List list, zzabq zzabq, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzabq.zzp(i, list, z);
        }
    }

    public static void zzQ(int i, List list, zzabq zzabq, zzady zzady) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                zzabq.zzq(i, list.get(i2), zzady);
            }
        }
    }

    public static void zzR(int i, List list, zzabq zzabq, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzabq.zzs(i, list, z);
        }
    }

    public static void zzS(int i, List list, zzabq zzabq, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzabq.zzu(i, list, z);
        }
    }

    public static void zzT(int i, List list, zzabq zzabq, zzady zzady) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                zzabq.zzv(i, list.get(i2), zzady);
            }
        }
    }

    public static void zzU(int i, List list, zzabq zzabq, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzabq.zzx(i, list, z);
        }
    }

    public static void zzV(int i, List list, zzabq zzabq, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzabq.zzz(i, list, z);
        }
    }

    public static void zzW(int i, List list, zzabq zzabq, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzabq.zzB(i, list, z);
        }
    }

    public static void zzX(int i, List list, zzabq zzabq, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzabq.zzD(i, list, z);
        }
    }

    public static void zzY(int i, List list, zzabq zzabq) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzabq.zzG(i, list);
        }
    }

    public static void zzZ(int i, List list, zzabq zzabq, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzabq.zzI(i, list, z);
        }
    }

    public static int zza(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzabp.zzE(i << 3) + 1) * size;
    }

    public static void zzaa(int i, List list, zzabq zzabq, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzabq.zzK(i, list, z);
        }
    }

    private static zzaep zzab(boolean z) {
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
            return (zzaep) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
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
        int zzD = zzabp.zzD(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzD += zzabp.zzw((zzabe) list.get(i2));
        }
        return zzD;
    }

    public static int zzd(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzabp.zzD(i) * size) + zze(list);
    }

    public static int zze(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzaci) {
            zzaci zzaci = (zzaci) list;
            i = 0;
            while (i2 < size) {
                i += zzabp.zzy(zzaci.zze(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzabp.zzy(((Integer) list.get(i2)).intValue());
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
        return (zzabp.zzE(i << 3) + 4) * size;
    }

    public static int zzg(List list) {
        return list.size() * 4;
    }

    public static int zzh(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzabp.zzE(i << 3) + 8) * size;
    }

    public static int zzi(List list) {
        return list.size() * 8;
    }

    public static int zzj(int i, List list, zzady zzady) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzabp.zzx(i, (zzadm) list.get(i3), zzady);
        }
        return i2;
    }

    public static int zzk(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzabp.zzD(i) * size) + zzl(list);
    }

    public static int zzl(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzaci) {
            zzaci zzaci = (zzaci) list;
            i = 0;
            while (i2 < size) {
                i += zzabp.zzy(zzaci.zze(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzabp.zzy(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzm(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return (zzabp.zzD(i) * list.size()) + zzn(list);
    }

    public static int zzn(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzadb) {
            zzadb zzadb = (zzadb) list;
            i = 0;
            while (i2 < size) {
                i += zzabp.zzF(zzadb.zze(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzabp.zzF(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzo(int i, Object obj, zzady zzady) {
        if (obj instanceof zzacs) {
            int zzE = zzabp.zzE(i << 3);
            int zza2 = ((zzacs) obj).zza();
            return zzabp.zzE(zza2) + zza2 + zzE;
        }
        return zzabp.zzA((zzadm) obj, zzady) + zzabp.zzE(i << 3);
    }

    public static int zzp(int i, List list, zzady zzady) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzD = zzabp.zzD(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof zzacs) {
                i2 = zzabp.zzz((zzacs) obj);
            } else {
                i2 = zzabp.zzA((zzadm) obj, zzady);
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
        return (zzabp.zzD(i) * size) + zzr(list);
    }

    public static int zzr(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzaci) {
            zzaci zzaci = (zzaci) list;
            i = 0;
            while (i2 < size) {
                int zze = zzaci.zze(i2);
                i += zzabp.zzE((zze >> 31) ^ (zze + zze));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                int intValue = ((Integer) list.get(i2)).intValue();
                i3 = i + zzabp.zzE((intValue >> 31) ^ (intValue + intValue));
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
        return (zzabp.zzD(i) * size) + zzt(list);
    }

    public static int zzt(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzadb) {
            zzadb zzadb = (zzadb) list;
            i = 0;
            while (i2 < size) {
                long zze = zzadb.zze(i2);
                i += zzabp.zzF((zze >> 63) ^ (zze + zze));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                long longValue = ((Long) list.get(i2)).longValue();
                i3 = i + zzabp.zzF((longValue >> 63) ^ (longValue + longValue));
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
        int zzD = zzabp.zzD(i) * size;
        if (list instanceof zzacu) {
            zzacu zzacu = (zzacu) list;
            while (i4 < size) {
                Object zzf = zzacu.zzf(i4);
                if (zzf instanceof zzabe) {
                    i3 = zzabp.zzw((zzabe) zzf);
                } else {
                    i3 = zzabp.zzC((String) zzf);
                }
                zzD = i3 + zzD;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof zzabe) {
                    i2 = zzabp.zzw((zzabe) obj);
                } else {
                    i2 = zzabp.zzC((String) obj);
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
        return (zzabp.zzD(i) * size) + zzw(list);
    }

    public static int zzw(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzaci) {
            zzaci zzaci = (zzaci) list;
            i = 0;
            while (i2 < size) {
                i += zzabp.zzE(zzaci.zze(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzabp.zzE(((Integer) list.get(i2)).intValue());
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
        return (zzabp.zzD(i) * size) + zzy(list);
    }

    public static int zzy(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzadb) {
            zzadb zzadb = (zzadb) list;
            i = 0;
            while (i2 < size) {
                i += zzabp.zzF(zzadb.zze(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzabp.zzF(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static zzaep zzz() {
        return zzb;
    }
}
