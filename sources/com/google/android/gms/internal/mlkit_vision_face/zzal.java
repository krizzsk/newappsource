package com.google.android.gms.internal.mlkit_vision_face;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

class zzal extends AbstractCollection {
    @NullableDecl
    public final Object zza;
    public Collection zzb;
    @NullableDecl
    public final zzal zzc;
    @NullableDecl
    public final Collection zzd;
    public final /* synthetic */ zzao zze;

    public zzal(@NullableDecl zzao zzao, Object obj, @NullableDecl Collection collection, zzal zzal) {
        this.zze = zzao;
        this.zza = obj;
        this.zzb = collection;
        this.zzc = zzal;
        this.zzd = zzal == null ? null : zzal.zzb;
    }

    public final boolean add(Object obj) {
        zza();
        boolean isEmpty = this.zzb.isEmpty();
        boolean add = this.zzb.add(obj);
        if (!add) {
            return add;
        }
        zzao.zzl(this.zze);
        if (!isEmpty) {
            return add;
        }
        zzc();
        return true;
    }

    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.zzb.addAll(collection);
        if (!addAll) {
            return addAll;
        }
        zzao.zzm(this.zze, this.zzb.size() - size);
        if (size != 0) {
            return addAll;
        }
        zzc();
        return true;
    }

    public final void clear() {
        int size = size();
        if (size != 0) {
            this.zzb.clear();
            zzao.zzn(this.zze, size);
            zzb();
        }
    }

    public final boolean contains(Object obj) {
        zza();
        return this.zzb.contains(obj);
    }

    public final boolean containsAll(Collection<?> collection) {
        zza();
        return this.zzb.containsAll(collection);
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        zza();
        return this.zzb.equals(obj);
    }

    public final int hashCode() {
        zza();
        return this.zzb.hashCode();
    }

    public final Iterator iterator() {
        zza();
        return new zzak(this);
    }

    public final boolean remove(Object obj) {
        zza();
        boolean remove = this.zzb.remove(obj);
        if (remove) {
            zzao.zzk(this.zze);
            zzb();
        }
        return remove;
    }

    public final boolean removeAll(Collection<?> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.zzb.removeAll(collection);
        if (removeAll) {
            zzao.zzm(this.zze, this.zzb.size() - size);
            zzb();
        }
        return removeAll;
    }

    public final boolean retainAll(Collection<?> collection) {
        collection.getClass();
        int size = size();
        boolean retainAll = this.zzb.retainAll(collection);
        if (retainAll) {
            zzao.zzm(this.zze, this.zzb.size() - size);
            zzb();
        }
        return retainAll;
    }

    public final int size() {
        zza();
        return this.zzb.size();
    }

    public final String toString() {
        zza();
        return this.zzb.toString();
    }

    /* access modifiers changed from: package-private */
    public final void zza() {
        Collection collection;
        zzal zzal = this.zzc;
        if (zzal != null) {
            zzal.zza();
            if (this.zzc.zzb != this.zzd) {
                throw new ConcurrentModificationException();
            }
        } else if (this.zzb.isEmpty() && (collection = (Collection) this.zze.zza.get(this.zza)) != null) {
            this.zzb = collection;
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzb() {
        zzal zzal = this.zzc;
        if (zzal != null) {
            zzal.zzb();
        } else if (this.zzb.isEmpty()) {
            this.zze.zza.remove(this.zza);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzc() {
        zzal zzal = this.zzc;
        if (zzal != null) {
            zzal.zzc();
        } else {
            this.zze.zza.put(this.zza, this.zzb);
        }
    }
}
