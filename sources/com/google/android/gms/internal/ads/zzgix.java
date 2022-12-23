package com.google.android.gms.internal.ads;

import java.util.Comparator;

final class zzgix implements Comparator {
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzgjg zzgjg = (zzgjg) obj;
        zzgjg zzgjg2 = (zzgjg) obj2;
        zzgja zzs = zzgjg.iterator();
        zzgja zzs2 = zzgjg2.iterator();
        while (zzs.hasNext() && zzs2.hasNext()) {
            int compareTo = Integer.valueOf(zzs.zza() & 255).compareTo(Integer.valueOf(zzs2.zza() & 255));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(zzgjg.zzd()).compareTo(Integer.valueOf(zzgjg2.zzd()));
    }
}
