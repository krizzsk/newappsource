package com.google.android.gms.internal.mlkit_common;

import p358af.C13437d;

final class zzbd implements zzbi {
    private final int zza;
    private final zzbh zzb;

    public zzbd(int i, zzbh zzbh) {
        this.zza = i;
        this.zzb = zzbh;
    }

    public final Class annotationType() {
        return zzbi.class;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbi)) {
            return false;
        }
        zzbi zzbi = (zzbi) obj;
        if (this.zza != zzbi.zza() || !this.zzb.equals(zzbi.zzb())) {
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

    public final zzbh zzb() {
        return this.zzb;
    }
}
