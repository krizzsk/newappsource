package com.google.android.gms.tagmanager;

import android.util.LruCache;

final class zzda extends LruCache {
    public final /* synthetic */ zzr zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzda(zzdb zzdb, int i, zzr zzr) {
        super(1048576);
        this.zza = zzr;
    }

    public final int sizeOf(Object obj, Object obj2) {
        return this.zza.zza(obj, obj2);
    }
}
