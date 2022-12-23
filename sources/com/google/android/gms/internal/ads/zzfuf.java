package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzftr;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;
import p988j$.util.concurrent.ConcurrentHashMap;

abstract class zzfuf extends zzftr.zzi {
    private static final zzfuc zzaV;
    private static final Logger zzaW = Logger.getLogger(zzfuf.class.getName());
    private volatile int remaining;
    /* access modifiers changed from: private */
    public volatile Set<Throwable> seenExceptions = null;

    static {
        Throwable th;
        zzfuc zzfuc;
        try {
            zzfuc = new zzfud(AtomicReferenceFieldUpdater.newUpdater(zzfuf.class, Set.class, "seenExceptions"), AtomicIntegerFieldUpdater.newUpdater(zzfuf.class, "remaining"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            zzfuc = new zzfue((zzfub) null);
        }
        zzaV = zzfuc;
        if (th != null) {
            zzaW.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    public zzfuf(int i) {
        this.remaining = i;
    }

    public static /* synthetic */ int zzA(zzfuf zzfuf) {
        int i = zzfuf.remaining - 1;
        zzfuf.remaining = i;
        return i;
    }

    public final int zzB() {
        return zzaV.zza(this);
    }

    public final Set zzE() {
        Set<Throwable> set = this.seenExceptions;
        if (set != null) {
            return set;
        }
        Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        zzf(newSetFromMap);
        zzaV.zzb(this, (Set) null, newSetFromMap);
        Set<Throwable> set2 = this.seenExceptions;
        set2.getClass();
        return set2;
    }

    public final void zzF() {
        this.seenExceptions = null;
    }

    public abstract void zzf(Set set);
}
