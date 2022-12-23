package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final /* synthetic */ class zzul implements Comparator {
    public static final /* synthetic */ zzul zza = new zzul();

    private /* synthetic */ zzul() {
    }

    public final int compare(Object obj, Object obj2) {
        List list = (List) obj;
        List list2 = (List) obj2;
        zzfqw zzj = zzfqw.zzj();
        zzvc zzvc = zzvc.zza;
        zzfqw zzb = zzj.zzc((zzve) Collections.max(list, zzvc), (zzve) Collections.max(list2, zzvc), zzvc).zzb(list.size(), list2.size());
        zzvd zzvd = zzvd.zza;
        return zzb.zzc((zzve) Collections.max(list, zzvd), (zzve) Collections.max(list2, zzvd), zzvd).zza();
    }
}
