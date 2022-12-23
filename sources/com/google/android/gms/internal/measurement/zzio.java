package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

abstract class zzio extends AbstractList implements zzkl {
    private boolean zza = true;

    public void add(int i, Object obj) {
        zzbP();
        super.add(i, obj);
    }

    public boolean addAll(int i, Collection collection) {
        zzbP();
        return super.addAll(i, collection);
    }

    public void clear() {
        zzbP();
        super.clear();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public Object remove(int i) {
        zzbP();
        return super.remove(i);
    }

    public final boolean removeAll(Collection collection) {
        zzbP();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection collection) {
        zzbP();
        return super.retainAll(collection);
    }

    public Object set(int i, Object obj) {
        zzbP();
        return super.set(i, obj);
    }

    public final void zzb() {
        this.zza = false;
    }

    public final void zzbP() {
        if (!this.zza) {
            throw new UnsupportedOperationException();
        }
    }

    public final boolean zzc() {
        return this.zza;
    }

    public boolean add(Object obj) {
        zzbP();
        return super.add(obj);
    }

    public boolean addAll(Collection collection) {
        zzbP();
        return super.addAll(collection);
    }

    public final boolean remove(Object obj) {
        zzbP();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }
}
