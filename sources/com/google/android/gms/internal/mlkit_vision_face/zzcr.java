package com.google.android.gms.internal.mlkit_vision_face;

import java.lang.annotation.Annotation;
import p358af.C13437d;

final class zzcr implements zzcw {
    private final int zza;
    private final zzcv zzb;

    public zzcr(int i, zzcv zzcv) {
        this.zza = i;
        this.zzb = zzcv;
    }

    public final Class<? extends Annotation> annotationType() {
        return zzcw.class;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzcw)) {
            return false;
        }
        zzcw zzcw = (zzcw) obj;
        if (this.zza != zzcw.zza() || !this.zzb.equals(zzcw.zzb())) {
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

    public final zzcv zzb() {
        return this.zzb;
    }
}
