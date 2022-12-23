package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

abstract class zzfqf implements zzfsd {
    private transient Set zza;
    private transient Collection zzb;
    private transient Map zzc;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzfsd)) {
            return false;
        }
        return zzu().equals(((zzfsd) obj).zzu());
    }

    public final int hashCode() {
        return zzu().hashCode();
    }

    public final String toString() {
        return zzu().toString();
    }

    public abstract Collection zzi();

    public Iterator zzj() {
        throw null;
    }

    public abstract Map zzm();

    public abstract Set zzo();

    public boolean zzs(Object obj, Object obj2) {
        throw null;
    }

    public final Collection zzt() {
        Collection collection = this.zzb;
        if (collection != null) {
            return collection;
        }
        Collection zzi = zzi();
        this.zzb = zzi;
        return zzi;
    }

    public final Map zzu() {
        Map map = this.zzc;
        if (map != null) {
            return map;
        }
        Map zzm = zzm();
        this.zzc = zzm;
        return zzm;
    }

    public final Set zzv() {
        Set set = this.zza;
        if (set != null) {
            return set;
        }
        Set zzo = zzo();
        this.zza = zzo;
        return zzo;
    }
}
