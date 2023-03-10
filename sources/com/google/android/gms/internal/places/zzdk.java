package com.google.android.gms.internal.places;

import java.util.Map;

final class zzdk implements Comparable, Map.Entry {
    private Object value;
    private final /* synthetic */ zzdb zzma;
    private final Comparable zzme;

    public zzdk(zzdb zzdb, Map.Entry entry) {
        this(zzdb, (Comparable) entry.getKey(), entry.getValue());
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((zzdk) obj).getKey());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return equals(this.zzme, entry.getKey()) && equals(this.value, entry.getValue());
    }

    public final /* synthetic */ Object getKey() {
        return this.zzme;
    }

    public final Object getValue() {
        return this.value;
    }

    public final int hashCode() {
        Comparable comparable = this.zzme;
        int i = 0;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.value;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode ^ i;
    }

    public final Object setValue(Object obj) {
        this.zzma.zzcx();
        Object obj2 = this.value;
        this.value = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzme);
        String valueOf2 = String.valueOf(this.value);
        return C25541a.m63875e(valueOf2.length() + valueOf.length() + 1, valueOf, "=", valueOf2);
    }

    public zzdk(zzdb zzdb, Comparable comparable, Object obj) {
        this.zzma = zzdb;
        this.zzme = comparable;
        this.value = obj;
    }

    private static boolean equals(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }
}
