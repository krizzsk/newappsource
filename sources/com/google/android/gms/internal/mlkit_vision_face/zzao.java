package com.google.android.gms.internal.mlkit_vision_face;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

abstract class zzao<K, V> extends zzaq<K, V> implements Serializable {
    /* access modifiers changed from: private */
    public transient Map<K, Collection<V>> zza;
    private transient int zzb;

    public zzao(Map<K, Collection<V>> map) {
        if (map.isEmpty()) {
            this.zza = map;
            return;
        }
        throw new IllegalArgumentException();
    }

    public static /* synthetic */ int zzk(zzao zzao) {
        int i = zzao.zzb;
        zzao.zzb = i - 1;
        return i;
    }

    public static /* synthetic */ int zzl(zzao zzao) {
        int i = zzao.zzb;
        zzao.zzb = i + 1;
        return i;
    }

    public static /* synthetic */ int zzm(zzao zzao, int i) {
        int i2 = zzao.zzb + i;
        zzao.zzb = i2;
        return i2;
    }

    public static /* synthetic */ int zzn(zzao zzao, int i) {
        int i2 = zzao.zzb - i;
        zzao.zzb = i2;
        return i2;
    }

    public static /* synthetic */ void zzo(zzao zzao, Object obj) {
        Collection<V> collection;
        Map<K, Collection<V>> map = zzao.zza;
        map.getClass();
        try {
            collection = map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            collection = null;
        }
        Collection collection2 = collection;
        if (collection2 != null) {
            int size = collection2.size();
            collection2.clear();
            zzao.zzb -= size;
        }
    }

    public Collection<V> zza(@NullableDecl K k, Collection<V> collection) {
        throw null;
    }

    public abstract Collection<V> zzc();

    public final boolean zzd(@NullableDecl K k, @NullableDecl V v) {
        Collection collection = this.zza.get(k);
        if (collection == null) {
            Collection zzc = zzc();
            if (zzc.add(v)) {
                this.zzb++;
                this.zza.put(k, zzc);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (!collection.add(v)) {
            return false;
        } else {
            this.zzb++;
            return true;
        }
    }

    public final void zze() {
        for (Collection<V> clear : this.zza.values()) {
            clear.clear();
        }
        this.zza.clear();
        this.zzb = 0;
    }

    public final Collection<V> zzf(@NullableDecl K k) {
        Collection collection = this.zza.get(k);
        if (collection == null) {
            collection = zzc();
        }
        return zza(k, collection);
    }

    public final List<V> zzg(@NullableDecl K k, List<V> list, @NullableDecl zzal zzal) {
        if (list instanceof RandomAccess) {
            return new zzaj(this, k, list, zzal);
        }
        return new zzan(this, k, list, zzal);
    }

    public final Set<K> zzh() {
        return new zzai(this, this.zza);
    }

    public final Map<K, Collection<V>> zzi() {
        return new zzag(this, this.zza);
    }
}
