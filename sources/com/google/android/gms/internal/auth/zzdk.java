package com.google.android.gms.internal.auth;

import java.io.Serializable;

final class zzdk implements Serializable, zzdj {
    public final zzdj zza;
    public volatile transient boolean zzb;
    public transient Object zzc;

    public zzdk(zzdj zzdj) {
        zzdj.getClass();
        this.zza = zzdj;
    }

    public final String toString() {
        Object obj;
        StringBuilder k = C13555b.m33972k("Suppliers.memoize(");
        if (this.zzb) {
            obj = C16530d.m42015h(C13555b.m33972k("<supplier that returned "), this.zzc, ">");
        } else {
            obj = this.zza;
        }
        return C16530d.m42015h(k, obj, ")");
    }

    public final Object zza() {
        if (!this.zzb) {
            synchronized (this) {
                if (!this.zzb) {
                    Object zza2 = this.zza.zza();
                    this.zzc = zza2;
                    this.zzb = true;
                    return zza2;
                }
            }
        }
        return this.zzc;
    }
}
