package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

abstract class zzfqc extends zzfqf implements Serializable {
    /* access modifiers changed from: private */
    public final transient Map zza;
    private transient int zzb;

    public zzfqc(Map map) {
        zzfos.zze(map.isEmpty());
        this.zza = map;
    }

    public static /* synthetic */ int zzd(zzfqc zzfqc) {
        int i = zzfqc.zzb;
        zzfqc.zzb = i + 1;
        return i;
    }

    public static /* synthetic */ int zze(zzfqc zzfqc) {
        int i = zzfqc.zzb;
        zzfqc.zzb = i - 1;
        return i;
    }

    public static /* synthetic */ int zzf(zzfqc zzfqc, int i) {
        int i2 = zzfqc.zzb + i;
        zzfqc.zzb = i2;
        return i2;
    }

    public static /* synthetic */ int zzg(zzfqc zzfqc, int i) {
        int i2 = zzfqc.zzb - i;
        zzfqc.zzb = i2;
        return i2;
    }

    public static /* synthetic */ void zzq(zzfqc zzfqc, Object obj) {
        Object obj2;
        try {
            obj2 = zzfqc.zza.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            zzfqc.zzb -= size;
        }
    }

    /* access modifiers changed from: package-private */
    public abstract Collection zza();

    public Collection zzb(Collection collection) {
        throw null;
    }

    public Collection zzc(Object obj, Collection collection) {
        throw null;
    }

    public final int zzh() {
        return this.zzb;
    }

    public final Collection zzi() {
        return new zzfqe(this);
    }

    public final Iterator zzj() {
        return new zzfpm(this);
    }

    public final List zzk(Object obj, List list, zzfpz zzfpz) {
        if (list instanceof RandomAccess) {
            return new zzfpv(this, obj, list, zzfpz);
        }
        return new zzfqb(this, obj, list, zzfpz);
    }

    public Map zzm() {
        throw null;
    }

    public final Map zzn() {
        Map map = this.zza;
        if (map instanceof NavigableMap) {
            return new zzfpt(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new zzfpw(this, (SortedMap) map);
        }
        return new zzfpp(this, map);
    }

    public Set zzo() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public final Set zzp() {
        Map map = this.zza;
        if (map instanceof NavigableMap) {
            return new zzfpu(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new zzfpx(this, (SortedMap) map);
        }
        return new zzfps(this, map);
    }

    public final void zzr() {
        for (Collection clear : this.zza.values()) {
            clear.clear();
        }
        this.zza.clear();
        this.zzb = 0;
    }

    public final boolean zzs(Object obj, Object obj2) {
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
