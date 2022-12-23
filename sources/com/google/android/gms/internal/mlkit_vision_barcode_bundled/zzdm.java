package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

final class zzdm {
    private final Object zza;
    private final int zzb;

    public zzdm(Object obj, int i) {
        this.zza = obj;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzdm)) {
            return false;
        }
        zzdm zzdm = (zzdm) obj;
        if (this.zza == zzdm.zza && this.zzb == zzdm.zzb) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}
