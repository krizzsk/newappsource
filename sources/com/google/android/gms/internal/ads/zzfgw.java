package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.appboy.Constants;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.appsflyer.ServerParameters;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.usebutton.sdk.internal.util.DiskLruCache;
import java.util.List;
import java.util.Map;

public final class zzfgw {
    private final Context zza;
    private final String zzb;
    private final String zzc;

    public zzfgw(Context context, zzcfo zzcfo) {
        this.zza = context;
        this.zzb = context.getPackageName();
        this.zzc = zzcfo.zza;
    }

    public final void zza(Map map) {
        String str;
        map.put(Constants.APPBOY_PUSH_SUMMARY_TEXT_KEY, "gmob_sdk");
        map.put("v", "3");
        map.put("os", Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        zzt.zzp();
        map.put(ServerParameters.DEVICE_KEY, zzs.zzq());
        map.put("app", this.zzb);
        zzt.zzp();
        if (true != zzs.zzA(this.zza)) {
            str = "0";
        } else {
            str = DiskLruCache.VERSION_1;
        }
        map.put("is_lite_sdk", str);
        List zzb2 = zzbhy.zzb();
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzfQ)).booleanValue()) {
            zzb2.addAll(zzt.zzo().zzh().zzh().zzd());
        }
        map.put("e", TextUtils.join(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, zzb2));
        map.put("sdkVersion", this.zzc);
    }
}
