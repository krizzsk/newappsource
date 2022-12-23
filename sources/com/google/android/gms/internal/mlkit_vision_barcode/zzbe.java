package com.google.android.gms.internal.mlkit_vision_barcode;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

abstract class zzbe extends zzbg implements Serializable {
    /* access modifiers changed from: private */
    public transient Map zza;
    private transient int zzb;

    public zzbe(Map map) {
        if (map.isEmpty()) {
            this.zza = map;
            return;
        }
        throw new IllegalArgumentException();
    }

    public static /* synthetic */ int zzd(zzbe zzbe) {
        int i = zzbe.zzb;
        zzbe.zzb = i + 1;
        return i;
    }

    public static /* synthetic */ int zze(zzbe zzbe) {
        int i = zzbe.zzb;
        zzbe.zzb = i - 1;
        return i;
    }

    public static /* synthetic */ int zzf(zzbe zzbe, int i) {
        int i2 = zzbe.zzb + i;
        zzbe.zzb = i2;
        return i2;
    }

    public static /* synthetic */ int zzg(zzbe zzbe, int i) {
        int i2 = zzbe.zzb - i;
        zzbe.zzb = i2;
        return i2;
    }

    public static /* synthetic */ void zzm(zzbe zzbe, Object obj) {
        Object obj2;
        Map map = zzbe.zza;
        map.getClass();
        try {
            obj2 = map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            zzbe.zzb -= size;
        }
    }

    /* access modifiers changed from: package-private */
    public abstract Collection zza();

    public Collection zzb(Object obj, Collection collection) {
        throw null;
    }

    public final Collection zzh(Object obj) {
        Collection collection = (Collection) this.zza.get(obj);
        if (collection == null) {
            collection = zza();
        }
        return zzb(obj, collection);
    }

    public final List zzi(Object obj, List list, zzbb zzbb) {
        if (list instanceof RandomAccess) {
            return new zzaz(this, obj, list, zzbb);
        }
        return new zzbd(this, obj, list, zzbb);
    }

    public final Map zzk() {
        return new zzaw(this, this.zza);
    }

    public final Set zzl() {
        return new zzay(this, this.zza);
    }

    public final void zzn() {
        for (Collection clear : this.zza.values()) {
            clear.clear();
        }
        this.zza.clear();
        this.zzb = 0;
    }

    public final boolean zzo(Object obj, Object obj2) {
        Collection collection = (Collection) this.zza.get(obj);
        if (collection == null) {
            Collection zza2 = zza();
            if (zza2.add(obj2)) {
                this.zzb++;
                this.zza.put(obj, zza2);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (!collection.add(obj2)) {
            return false;
        } else {
            this.zzb++;
            return true;
        }
    }
}
