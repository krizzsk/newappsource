package com.google.android.gms.internal.ads;

import android.os.Bundle;

final class zzepv implements zzeta {
    private final String zza;
    private final String zzb;
    private final Bundle zzc;

    public /* synthetic */ zzepv(String str, String str2, Bundle bundle, zzepu zzepu) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = bundle;
    }

    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("consent_string", this.zza);
        bundle.putString("fc_consent", this.zzb);
        bundle.putBundle("iab_consent_info", this.zzc);
    }
}
