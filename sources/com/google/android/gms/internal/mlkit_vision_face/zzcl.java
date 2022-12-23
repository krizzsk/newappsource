package com.google.android.gms.internal.mlkit_vision_face;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

final class zzcl extends WeakReference<Throwable> {
    private final int zza;

    public zzcl(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        this.zza = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == zzcl.class) {
            if (this == obj) {
                return true;
            }
            zzcl zzcl = (zzcl) obj;
            if (this.zza == zzcl.zza && get() == zzcl.get()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.zza;
    }
}
