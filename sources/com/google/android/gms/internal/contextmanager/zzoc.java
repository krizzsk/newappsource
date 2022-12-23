package com.google.android.gms.internal.contextmanager;

import java.util.Map;

final class zzoc extends zzoj {
    public zzoc(int i) {
        super(i, (zzoc) null);
    }

    public final void zza() {
        if (!zzj()) {
            for (int i = 0; i < zzb(); i++) {
                ((zzlt) zzg(i).getKey()).zzg();
            }
            for (Map.Entry key : zzc()) {
                ((zzlt) key.getKey()).zzg();
            }
        }
        super.zza();
    }
}
