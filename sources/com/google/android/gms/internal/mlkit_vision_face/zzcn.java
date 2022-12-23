package com.google.android.gms.internal.mlkit_vision_face;

final class zzcn extends zzck {
    private final zzcm zza = new zzcm();

    public final void zza(Throwable th, Throwable th2) {
        if (th2 != th) {
            this.zza.zza(th, true).add(th2);
            return;
        }
        throw new IllegalArgumentException("Self suppression is not allowed.", th2);
    }
}
