package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class zzeqm implements zzeta {
    private final Boolean zza;

    public zzeqm(Boolean bool) {
        this.zza = bool;
    }

    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        Bundle bundle = (Bundle) obj;
        Boolean bool = this.zza;
        if (bool != null) {
            bundle.putBoolean("hw_accel", bool.booleanValue());
        }
    }
}
