package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Map;

final class zzeq implements Map.Entry {
    private final Map.Entry zza;

    public /* synthetic */ zzeq(Map.Entry entry, zzep zzep) {
        this.zza = entry;
    }

    public final Object getKey() {
        return this.zza.getKey();
    }

    public final Object getValue() {
        if (((zzes) this.zza.getValue()) == null) {
            return null;
        }
        throw null;
    }

    public final Object setValue(Object obj) {
        if (obj instanceof zzfl) {
            return ((zzes) this.zza.getValue()).zzc((zzfl) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }

    public final zzes zza() {
        return (zzes) this.zza.getValue();
    }
}
