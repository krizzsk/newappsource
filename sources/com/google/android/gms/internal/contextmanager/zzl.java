package com.google.android.gms.internal.contextmanager;

import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.HashMap;

public final class zzl<L, W extends IInterface> {
    private final Looper zza;
    private final zzk<L, W> zzb;
    private final HashMap<L, W> zzc = new HashMap<>();

    @VisibleForTesting
    public zzl(Looper looper, zzk<L, W> zzk) {
        this.zza = looper;
        this.zzb = zzk;
    }
}
