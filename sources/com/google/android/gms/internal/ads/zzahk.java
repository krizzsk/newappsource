package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

public final class zzahk {
    public final int zza;
    public final String zzb;
    public final List zzc;
    public final byte[] zzd;

    public zzahk(int i, String str, List list, byte[] bArr) {
        List list2;
        this.zza = i;
        this.zzb = str;
        if (list == null) {
            list2 = Collections.emptyList();
        } else {
            list2 = Collections.unmodifiableList(list);
        }
        this.zzc = list2;
        this.zzd = bArr;
    }
}
