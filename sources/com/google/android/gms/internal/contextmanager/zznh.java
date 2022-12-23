package com.google.android.gms.internal.contextmanager;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class zznh<K, V> extends LinkedHashMap<K, V> {
    private static final zznh zza;
    private boolean zzb = true;

    static {
        zznh zznh = new zznh();
        zza = zznh;
        zznh.zzb = false;
    }

    private zznh() {
    }

    public static <K, V> zznh<K, V> zza() {
        return zza;
    }

    private static int zzf(Object obj) {
        if (obj instanceof byte[]) {
            return zzmn.zzb((byte[]) obj);
        }
        if (!(obj instanceof zzmh)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    private final void zzg() {
        if (!this.zzb) {
            throw new UnsupportedOperationException();
        }
    }

    public final void clear() {
        zzg();
        super.clear();
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(value instanceof byte[]) || !(obj2 instanceof byte[])) {
                z = value.equals(obj2);
                continue;
            } else {
                z = Arrays.equals((byte[]) value, (byte[]) obj2);
                continue;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : entrySet()) {
            i += zzf(entry.getValue()) ^ zzf(entry.getKey());
        }
        return i;
    }

    public final V put(K k, V v) {
        zzg();
        zzmn.zze(k);
        zzmn.zze(v);
        return super.put(k, v);
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        zzg();
        for (Object next : map.keySet()) {
            zzmn.zze(next);
            zzmn.zze(map.get(next));
        }
        super.putAll(map);
    }

    public final V remove(Object obj) {
        zzg();
        return super.remove(obj);
    }

    public final zznh<K, V> zzb() {
        return isEmpty() ? new zznh<>() : new zznh<>(this);
    }

    public final void zzc() {
        this.zzb = false;
    }

    public final void zzd(zznh<K, V> zznh) {
        zzg();
        if (!zznh.isEmpty()) {
            putAll(zznh);
        }
    }

    public final boolean zze() {
        return this.zzb;
    }

    private zznh(Map<K, V> map) {
        super(map);
    }
}
