package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.appsflyer.ServerParameters;

public final class zzetk implements zzeta {
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final boolean zze;
    public final int zzf;

    public zzetk(String str, int i, int i2, int i3, boolean z, int i4) {
        this.zza = str;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = z;
        this.zzf = i4;
    }

    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        Bundle bundle = (Bundle) obj;
        String str = this.zza;
        boolean z = true;
        zzfcj.zzg(bundle, ServerParameters.CARRIER, str, !TextUtils.isEmpty(str));
        Integer valueOf = Integer.valueOf(this.zzb);
        if (this.zzb == -2) {
            z = false;
        }
        zzfcj.zzf(bundle, "cnt", valueOf, z);
        bundle.putInt("gnt", this.zzc);
        bundle.putInt("pt", this.zzd);
        Bundle zza2 = zzfcj.zza(bundle, ServerParameters.DEVICE_KEY);
        bundle.putBundle(ServerParameters.DEVICE_KEY, zza2);
        Bundle zza3 = zzfcj.zza(zza2, ServerParameters.NETWORK);
        zza2.putBundle(ServerParameters.NETWORK, zza3);
        zza3.putInt("active_network_state", this.zzf);
        zza3.putBoolean("active_network_metered", this.zze);
    }
}
