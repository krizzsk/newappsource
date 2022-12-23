package com.google.android.gms.internal.ads;

import java.util.Set;

public final class zzdck extends zzdhb {
    private boolean zzb = false;

    public zzdck(Set set) {
        super(set);
    }

    public final synchronized void zza() {
        if (!this.zzb) {
            zzo(zzdcj.zza);
            this.zzb = true;
        }
    }
}
