package com.google.android.gms.internal.mlkit_vision_face;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

abstract class zzbv<K, V> extends AbstractMap<K, V> {
    @NullableDecl
    private transient Set<Map.Entry<K, V>> zza;
    @NullableDecl
    private transient Set<K> zzb;
    @NullableDecl
    private transient Collection<V> zzc;

    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.zza;
        if (set != null) {
            return set;
        }
        Set<Map.Entry<K, V>> zza2 = zza();
        this.zza = zza2;
        return zza2;
    }

    public Set<K> keySet() {
        Set<K> set = this.zzb;
        if (set != null) {
            return set;
        }
        zzbt zzbt = new zzbt(this);
        this.zzb = zzbt;
        return zzbt;
    }

    public final Collection<V> values() {
        Collection<V> collection = this.zzc;
        if (collection != null) {
            return collection;
        }
        zzbu zzbu = new zzbu(this);
        this.zzc = zzbu;
        return zzbu;
    }

    public abstract Set<Map.Entry<K, V>> zza();
}
