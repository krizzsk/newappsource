package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.appsflyer.ServerParameters;

public final class zzequ implements zzeta {
    public final Bundle zza;

    public zzequ(Bundle bundle) {
        this.zza = bundle;
    }

    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle zza2 = zzfcj.zza(bundle, ServerParameters.DEVICE_KEY);
        zza2.putBundle("android_mem_info", this.zza);
        bundle.putBundle(ServerParameters.DEVICE_KEY, zza2);
    }
}
