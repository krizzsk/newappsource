package com.google.android.gms.internal.nearby;

final class zzsh extends zzsc {
    private final Object zza;

    public zzsh(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzsh) {
            return this.zza.equals(((zzsh) obj).zza);
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
