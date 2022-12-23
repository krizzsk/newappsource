package com.google.android.gms.internal.auth;

final class zzdl implements zzdj {
    public volatile zzdj zza;
    public volatile boolean zzb;
    public Object zzc;

    public zzdl(zzdj zzdj) {
        zzdj.getClass();
        this.zza = zzdj;
    }

    public final String toString() {
        Object obj = this.zza;
        StringBuilder k = C13555b.m33972k("Suppliers.memoize(");
        if (obj == null) {
            obj = C16530d.m42015h(C13555b.m33972k("<supplier that returned "), this.zzc, ">");
        }
        return C16530d.m42015h(k, obj, ")");
    }

    public final Object zza() {
        if (!this.zzb) {
            synchronized (this) {
                if (!this.zzb) {
                    zzdj zzdj = this.zza;
                    zzdj.getClass();
                    Object zza2 = zzdj.zza();
                    this.zzc = zza2;
                    this.zzb = true;
                    this.zza = null;
                    return zza2;
                }
            }
        }
        return this.zzc;
    }
}
