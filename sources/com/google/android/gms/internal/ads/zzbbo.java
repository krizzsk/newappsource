package com.google.android.gms.internal.ads;

import java.util.Comparator;

final class zzbbo implements Comparator {
    public zzbbo(zzbbq zzbbq) {
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzbbu zzbbu = (zzbbu) obj;
        zzbbu zzbbu2 = (zzbbu) obj2;
        int i = zzbbu.zzc - zzbbu2.zzc;
        if (i != 0) {
            return i;
        }
        return (int) (zzbbu.zza - zzbbu2.zza);
    }
}
