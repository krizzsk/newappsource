package com.google.android.gms.internal.contextmanager;

import java.util.Map;

final class zzms<K> implements Map.Entry<K, Object> {
    private final Map.Entry<K, zzmu> zza;

    public /* synthetic */ zzms(Map.Entry entry, zzmr zzmr) {
        this.zza = entry;
    }

    public final K getKey() {
        return this.zza.getKey();
    }

    public final Object getValue() {
        if (this.zza.getValue() == null) {
            return null;
        }
        throw null;
    }

    public final Object setValue(Object obj) {
        if (obj instanceof zznn) {
            return this.zza.getValue().zzc((zznn) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }

    public final zzmu zza() {
        return this.zza.getValue();
    }
}
