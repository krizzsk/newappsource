package com.google.android.gms.internal.icing;

final class zzbn<T> implements zzbm<T> {
    public volatile zzbm<T> zza;

    public zzbn(zzbm<T> zzbm) {
        this.zza = zzbm;
    }

    public final String toString() {
        Object obj = this.zza;
        if (obj == null) {
            obj = "<supplier that returned null>";
        }
        String valueOf = String.valueOf(obj);
        return C13715c.m34245k(new StringBuilder(valueOf.length() + 19), "Suppliers.memoize(", valueOf, ")");
    }
}
