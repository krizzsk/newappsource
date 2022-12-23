package com.google.android.gms.internal.ads;

import java.util.Set;

final class zzfue extends zzfuc {
    private zzfue() {
        super((zzfub) null);
    }

    public /* synthetic */ zzfue(zzfub zzfub) {
        super((zzfub) null);
    }

    public final int zza(zzfuf zzfuf) {
        int zzA;
        synchronized (zzfuf) {
            zzA = zzfuf.zzA(zzfuf);
        }
        return zzA;
    }

    public final void zzb(zzfuf zzfuf, Set set, Set set2) {
        synchronized (zzfuf) {
            if (zzfuf.seenExceptions == null) {
                Set unused = zzfuf.seenExceptions = set2;
            }
        }
    }
}
