package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.VisibleForTesting;
import java.util.PriorityQueue;

public final class zzbbv {
    @VisibleForTesting
    public static long zza(long j, int i) {
        return i == 1 ? j : (i & 1) == 0 ? zza((j * j) % 1073807359, i >> 1) % 1073807359 : ((zza((j * j) % 1073807359, i >> 1) % 1073807359) * j) % 1073807359;
    }

    @VisibleForTesting
    public static String zzb(String[] strArr, int i, int i2) {
        int i3 = i2 + i;
        if (strArr.length < i3) {
            zzcfi.zzg("Unable to construct shingle");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i4 = i3 - 1;
            if (i < i4) {
                sb.append(strArr[i]);
                sb.append(' ');
                i++;
            } else {
                sb.append(strArr[i4]);
                return sb.toString();
            }
        }
    }

    public static void zzc(String[] strArr, int i, int i2, PriorityQueue priorityQueue) {
        String[] strArr2 = strArr;
        int length = strArr2.length;
        if (length < 6) {
            zzd(i, zze(strArr2, 0, length), zzb(strArr2, 0, length), length, priorityQueue);
            return;
        }
        long zze = zze(strArr2, 0, 6);
        zzd(i, zze, zzb(strArr2, 0, 6), 6, priorityQueue);
        long zza = zza(16785407, 5);
        int i3 = 1;
        while (true) {
            int length2 = strArr2.length;
            if (i3 < length2 - 5) {
                zze = (((((long) zzbbr.zza(strArr2[i3 + 5])) + 2147483647L) % 1073807359) + (((((zze + 1073807359) - ((((((long) zzbbr.zza(strArr2[i3 - 1])) + 2147483647L) % 1073807359) * zza) % 1073807359)) % 1073807359) * 16785407) % 1073807359)) % 1073807359;
                zzd(i, zze, zzb(strArr2, i3, 6), length2, priorityQueue);
                i3++;
            } else {
                return;
            }
        }
    }

    @VisibleForTesting
    public static void zzd(int i, long j, String str, int i2, PriorityQueue priorityQueue) {
        zzbbu zzbbu = new zzbbu(j, str, i2);
        if ((priorityQueue.size() != i || (((zzbbu) priorityQueue.peek()).zzc <= zzbbu.zzc && ((zzbbu) priorityQueue.peek()).zza <= zzbbu.zza)) && !priorityQueue.contains(zzbbu)) {
            priorityQueue.add(zzbbu);
            if (priorityQueue.size() > i) {
                priorityQueue.poll();
            }
        }
    }

    private static long zze(String[] strArr, int i, int i2) {
        long zza = (((long) zzbbr.zza(strArr[0])) + 2147483647L) % 1073807359;
        for (int i3 = 1; i3 < i2; i3++) {
            zza = (((((long) zzbbr.zza(strArr[i3])) + 2147483647L) % 1073807359) + ((zza * 16785407) % 1073807359)) % 1073807359;
        }
        return zza;
    }
}
