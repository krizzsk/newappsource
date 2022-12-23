package com.google.android.gms.internal.mlkit_vision_face;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

class zzad<K, V> extends zzao<K, V> implements zzbp<K, V> {
    public zzad(Map<K, Collection<V>> map) {
        super(map);
    }

    public final Collection<V> zza(K k, Collection<V> collection) {
        return zzg(k, (List) collection, (zzal) null);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.util.List<V>, java.util.Collection] */
    public final List<V> zzb(@NullableDecl K k) {
        return super.zzf(k);
    }

    public /* bridge */ /* synthetic */ Collection zzc() {
        throw null;
    }
}
