package com.google.android.gms.internal.mlkit_common;

import java.util.Iterator;
import java.util.Map;

final class zzat extends zzap {
    private final transient zzao zza;
    /* access modifiers changed from: private */
    public final transient Object[] zzb;
    /* access modifiers changed from: private */
    public final transient int zzc;

    public zzat(zzao zzao, Object[] objArr, int i, int i2) {
        this.zza = zzao;
        this.zzb = objArr;
        this.zzc = i2;
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || !value.equals(this.zza.get(key))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final /* synthetic */ Iterator iterator() {
        return zzf().listIterator(0);
    }

    public final int size() {
        return this.zzc;
    }

    public final int zza(Object[] objArr, int i) {
        return zzf().zza(objArr, 0);
    }

    public final zzay zzd() {
        return zzf().listIterator(0);
    }

    public final zzam zzg() {
        return new zzas(this);
    }
}
