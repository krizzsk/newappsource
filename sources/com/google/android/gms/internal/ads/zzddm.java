package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Set;

public final class zzddm extends zzdhb implements zzbnl {
    private final Bundle zzb = new Bundle();

    public zzddm(Set set) {
        super(set);
    }

    public final synchronized void zza(String str, Bundle bundle) {
        this.zzb.putAll(bundle);
        zzo(zzddl.zza);
    }

    public final synchronized Bundle zzb() {
        return new Bundle(this.zzb);
    }
}
