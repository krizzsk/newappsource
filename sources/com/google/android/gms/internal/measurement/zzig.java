package com.google.android.gms.internal.measurement;

final class zzig extends zzif {
    private final Object zza;

    public zzig(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzig) {
            return this.zza.equals(((zzig) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        return C16530d.m42015h(C13555b.m33972k("Optional.of("), this.zza, ")");
    }

    public final Object zza() {
        return this.zza;
    }

    public final boolean zzb() {
        return true;
    }
}
