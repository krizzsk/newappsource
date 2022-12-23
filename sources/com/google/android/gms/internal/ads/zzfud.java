package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

final class zzfud extends zzfuc {
    public final AtomicReferenceFieldUpdater zza;
    public final AtomicIntegerFieldUpdater zzb;

    public zzfud(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        super((zzfub) null);
        this.zza = atomicReferenceFieldUpdater;
        this.zzb = atomicIntegerFieldUpdater;
    }

    public final int zza(zzfuf zzfuf) {
        return this.zzb.decrementAndGet(zzfuf);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0009 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x000b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzb(com.google.android.gms.internal.ads.zzfuf r3, java.util.Set r4, java.util.Set r5) {
        /*
            r2 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = r2.zza
        L_0x0002:
            r0 = 0
        L_0x0003:
            boolean r1 = r4.compareAndSet(r3, r0, r5)
            if (r1 == 0) goto L_0x000b
            r0 = 1
            goto L_0x0012
        L_0x000b:
            java.lang.Object r1 = r4.get(r3)
            if (r1 == 0) goto L_0x0003
            r0 = 0
        L_0x0012:
            if (r0 == 0) goto L_0x0015
            goto L_0x001b
        L_0x0015:
            java.lang.Object r0 = r4.get(r3)
            if (r0 == 0) goto L_0x0002
        L_0x001b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfud.zzb(com.google.android.gms.internal.ads.zzfuf, java.util.Set, java.util.Set):void");
    }
}
