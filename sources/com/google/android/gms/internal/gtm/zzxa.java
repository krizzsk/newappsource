package com.google.android.gms.internal.gtm;

import java.util.Map;

final class zzxa extends zzxk {
    public zzxa(int i) {
        super(i, (zzxj) null);
    }

    public final void zza() {
        if (!zzj()) {
            for (int i = 0; i < zzb(); i++) {
                ((zzun) zzg(i).getKey()).zzg();
            }
            for (Map.Entry key : zzc()) {
                ((zzun) key.getKey()).zzg();
            }
        }
        super.zza();
    }
}
