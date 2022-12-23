package com.google.android.gms.internal.mlkit_vision_face;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

final class zzag extends zzbv {
    public final transient Map zza;
    public final /* synthetic */ zzao zzb;

    public zzag(zzao zzao, Map map) {
        this.zzb = zzao;
        this.zza = map;
    }

    public final void clear() {
        if (this.zza == this.zzb.zza) {
            this.zzb.zze();
        } else {
            zzbo.zza(new zzaf(this));
        }
    }

    public final boolean containsKey(Object obj) {
        return zzbw.zzb(this.zza, obj);
    }

    public final boolean equals(@NullableDecl Object obj) {
        return this == obj || this.zza.equals(obj);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Collection collection = (Collection) zzbw.zza(this.zza, obj);
        if (collection == null) {
            return null;
        }
        return this.zzb.zza(obj, collection);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final Set keySet() {
        return this.zzb.zzp();
    }

    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.zza.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection zzc = this.zzb.zzc();
        zzc.addAll(collection);
        zzao.zzn(this.zzb, collection.size());
        collection.clear();
        return zzc;
    }

    public final int size() {
        return this.zza.size();
    }

    public final String toString() {
        return this.zza.toString();
    }

    public final Set<Map.Entry> zza() {
        return new zzae(this);
    }
}
