package com.google.android.gms.tagmanager;

import android.annotation.TargetApi;
import android.util.LruCache;

@TargetApi(12)
final class zzdb<K, V> {
    private final LruCache<K, V> zza;

    public zzdb(int i, zzr<K, V> zzr) {
        this.zza = new zzda(this, 1048576, zzr);
    }

    public final V zza(K k) {
        return this.zza.get(k);
    }

    public final void zzb(K k, V v) {
        this.zza.put(k, v);
    }
}
