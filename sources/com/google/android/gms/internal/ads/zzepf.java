package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.appsflyer.ServerParameters;

public final class zzepf implements zzeta {
    public final double zza;
    public final boolean zzb;

    public zzepf(double d, boolean z) {
        this.zza = d;
        this.zzb = z;
    }

    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle zza2 = zzfcj.zza(bundle, ServerParameters.DEVICE_KEY);
        bundle.putBundle(ServerParameters.DEVICE_KEY, zza2);
        Bundle zza3 = zzfcj.zza(zza2, "battery");
        zza2.putBundle("battery", zza3);
        zza3.putBoolean("is_charging", this.zzb);
        zza3.putDouble("battery_level", this.zza);
    }
}
