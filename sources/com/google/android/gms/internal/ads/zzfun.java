package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

final class zzfun extends zzfua {
    /* access modifiers changed from: private */
    public zzfum zza;

    public zzfun(zzfrc zzfrc, boolean z, Executor executor, Callable callable) {
        super(zzfrc, z, false);
        this.zza = new zzful(this, callable, executor);
        zzw();
    }

    public final void zzg(int i, Object obj) {
    }

    public final void zzr() {
        zzfum zzfum = this.zza;
        if (zzfum != null) {
            zzfum.zzh();
        }
    }

    public final void zzv() {
        zzfum zzfum = this.zza;
        if (zzfum != null) {
            zzfum.zzf();
        }
    }

    public final void zzz(int i) {
        super.zzz(i);
        if (i == 1) {
            this.zza = null;
        }
    }
}
