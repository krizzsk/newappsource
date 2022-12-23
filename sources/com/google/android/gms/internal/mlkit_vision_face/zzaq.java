package com.google.android.gms.internal.mlkit_vision_face;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

abstract class zzaq<K, V> implements zzbx<K, V> {
    @NullableDecl
    private transient Set<K> zza;
    @NullableDecl
    private transient Map<K, Collection<V>> zzb;

    public final boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzbx)) {
            return false;
        }
        return zzq().equals(((zzbx) obj).zzq());
    }

    public final int hashCode() {
        return zzq().hashCode();
    }

    public final String toString() {
        return ((zzag) zzq()).zza.toString();
    }

    public boolean zzd(@NullableDecl K k, @NullableDecl V v) {
        throw null;
    }

    public abstract Set<K> zzh();

    public abstract Map<K, Collection<V>> zzi();

    public final Set<K> zzp() {
        Set<K> set = this.zza;
        if (set != null) {
            return set;
        }
        Set<K> zzh = zzh();
        this.zza = zzh;
        return zzh;
    }

    public final Map<K, Collection<V>> zzq() {
        Map<K, Collection<V>> map = this.zzb;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> zzi = zzi();
        this.zzb = zzi;
        return zzi;
    }
}
