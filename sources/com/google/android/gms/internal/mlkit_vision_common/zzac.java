package com.google.android.gms.internal.mlkit_vision_common;

import p358af.C13437d;

final class zzac implements zzah {
    private final int zza;
    private final zzag zzb;

    public zzac(int i, zzag zzag) {
        this.zza = i;
        this.zzb = zzag;
    }

    public final Class annotationType() {
        return zzah.class;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzah)) {
            return false;
        }
        zzah zzah = (zzah) obj;
        if (this.zza != zzah.zza() || !this.zzb.equals(zzah.zzb())) {
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

    public final zzag zzb() {
        return this.zzb;
    }
}
