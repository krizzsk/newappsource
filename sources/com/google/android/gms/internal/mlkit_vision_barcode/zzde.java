package com.google.android.gms.internal.mlkit_vision_barcode;

import p358af.C13437d;

final class zzde implements zzdj {
    private final int zza;
    private final zzdi zzb;

    public zzde(int i, zzdi zzdi) {
        this.zza = i;
        this.zzb = zzdi;
    }

    public final Class annotationType() {
        return zzdj.class;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzdj)) {
            return false;
        }
        zzdj zzdj = (zzdj) obj;
        if (this.zza != zzdj.zza() || !this.zzb.equals(zzdj.zzb())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.zza ^ 14552422) + (this.zzb.hashCode() ^ 2041407134);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("@com.google.firebase.encoders.proto.Protobuf", "(tag=");
        n.append(this.zza);
        n.append("intEncoding=");
        n.append(this.zzb);
        n.append(')');
        return n.toString();
    }

    public final int zza() {
        return this.zza;
    }

    public final zzdi zzb() {
        return this.zzb;
    }
}
