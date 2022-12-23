package com.google.android.gms.internal.measurement;

final class zzij implements zzih {
    public volatile zzih zza;
    public volatile boolean zzb;
    public Object zzc;

    public zzij(zzih zzih) {
        zzih.getClass();
        this.zza = zzih;
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
                    zzih zzih = this.zza;
                    zzih.getClass();
                    Object zza2 = zzih.zza();
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
