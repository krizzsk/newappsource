package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

public final /* synthetic */ class zzps {
    public static /* synthetic */ boolean zza(AtomicReference atomicReference, Object obj, Object obj2) {
        boolean z;
        do {
            while (true) {
                if (!atomicReference.compareAndSet((Object) null, obj2)) {
                    if (atomicReference.get() != null) {
                        z = false;
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
            if (z) {
                return true;
            }
        } while (atomicReference.get() == null);
        return false;
    }
}
