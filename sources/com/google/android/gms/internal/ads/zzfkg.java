package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class zzfkg {
    private final BlockingQueue zza;
    private final ThreadPoolExecutor zzb;
    private final ArrayDeque zzc = new ArrayDeque();
    private zzfkf zzd = null;

    public zzfkg() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.zza = linkedBlockingQueue;
        this.zzb = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private final void zzc() {
        zzfkf zzfkf = (zzfkf) this.zzc.poll();
        this.zzd = zzfkf;
        if (zzfkf != null) {
            zzfkf.executeOnExecutor(this.zzb, new Object[0]);
        }
    }

    public final void zza(zzfkf zzfkf) {
        this.zzd = null;
        zzc();
    }

    public final void zzb(zzfkf zzfkf) {
        zzfkf.zzb(this);
        this.zzc.add(zzfkf);
        if (this.zzd == null) {
            zzc();
        }
    }
}
