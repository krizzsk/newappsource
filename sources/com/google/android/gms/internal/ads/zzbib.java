package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import com.appboy.Constants;
import com.appsflyer.ServerParameters;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.usebutton.sdk.internal.util.DiskLruCache;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

public final class zzbib {
    private final String zza = ((String) zzbji.zzb.zze());
    private final Map zzb;
    private final Context zzc;
    private final String zzd;

    public zzbib(Context context, String str) {
        String str2;
        String str3;
        this.zzc = context;
        this.zzd = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzb = linkedHashMap;
        linkedHashMap.put(Constants.APPBOY_PUSH_SUMMARY_TEXT_KEY, "gmob_sdk");
        linkedHashMap.put("v", "3");
        linkedHashMap.put("os", Build.VERSION.RELEASE);
        linkedHashMap.put("api_v", Build.VERSION.SDK);
        zzt.zzp();
        linkedHashMap.put(ServerParameters.DEVICE_KEY, zzs.zzq());
        if (context.getApplicationContext() != null) {
            str2 = context.getApplicationContext().getPackageName();
        } else {
            str2 = context.getPackageName();
        }
        linkedHashMap.put("app", str2);
        zzt.zzp();
        if (true != zzs.zzA(context)) {
            str3 = "0";
        } else {
            str3 = DiskLruCache.VERSION_1;
        }
        linkedHashMap.put("is_lite_sdk", str3);
        Future zzb2 = zzt.zzm().zzb(context);
        try {
            linkedHashMap.put("network_coarse", Integer.toString(((zzbzz) zzb2.get()).zzk));
            linkedHashMap.put("network_fine", Integer.toString(((zzbzz) zzb2.get()).zzl));
        } catch (Exception e) {
            zzt.zzo().zzt(e, "CsiConfiguration.CsiConfiguration");
        }
    }

    public final Context zza() {
        return this.zzc;
    }

    public final String zzb() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zza;
    }

    public final Map zzd() {
        return this.zzb;
    }
}
