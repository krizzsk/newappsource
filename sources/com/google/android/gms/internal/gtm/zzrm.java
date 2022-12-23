package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.HashMap;
import java.util.Map;

public final class zzrm {
    @VisibleForTesting
    public final Map<String, Object> zza = new HashMap();
    private final Context zzb;
    private final zzsb zzc;
    private final Clock zzd;
    private final Map<String, Object> zze;

    public zzrm(Context context) {
        HashMap hashMap = new HashMap();
        zzsb zzsb = new zzsb(context);
        Clock instance = DefaultClock.getInstance();
        this.zzb = context;
        this.zzd = instance;
        this.zzc = zzsb;
        this.zze = hashMap;
    }
}
