package com.google.android.gms.measurement.internal;

import com.appsflyer.ServerParameters;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.util.HashMap;
import java.util.concurrent.Callable;

public final /* synthetic */ class zzfi implements Callable {
    public final /* synthetic */ zzfp zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzfi(zzfp zzfp, String str) {
        this.zza = zzfp;
        this.zzb = str;
    }

    public final Object call() {
        zzfp zzfp = this.zza;
        String str = this.zzb;
        zzh zzj = zzfp.zzf.zzi().zzj(str);
        HashMap hashMap = new HashMap();
        hashMap.put(ServerParameters.PLATFORM, MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
        hashMap.put("package_name", str);
        zzfp.zzs.zzf().zzh();
        hashMap.put("gmp_version", 73000L);
        if (zzj != null) {
            String zzw = zzj.zzw();
            if (zzw != null) {
                hashMap.put("app_version", zzw);
            }
            hashMap.put("app_version_int", Long.valueOf(zzj.zzb()));
            hashMap.put("dynamite_version", Long.valueOf(zzj.zzk()));
        }
        return hashMap;
    }
}
