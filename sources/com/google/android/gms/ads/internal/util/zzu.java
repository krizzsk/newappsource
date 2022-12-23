package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzcfb;
import com.unity3d.services.core.request.metrics.MetricCommonTags;

@TargetApi(24)
public class zzu extends zzt {
    public static final boolean zzf(int i, int i2, int i3) {
        return Math.abs(i - i2) <= i3;
    }

    public final boolean zze(Activity activity, Configuration configuration) {
        int i;
        if (!((Boolean) zzay.zzc().zzb(zzbhy.zzdQ)).booleanValue()) {
            return false;
        }
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzdS)).booleanValue()) {
            return activity.isInMultiWindowMode();
        }
        zzaw.zzb();
        int zzv = zzcfb.zzv(activity, configuration.screenHeightDp);
        int zzv2 = zzcfb.zzv(activity, configuration.screenWidthDp);
        zzt.zzp();
        DisplayMetrics zzr = zzs.zzr((WindowManager) activity.getApplicationContext().getSystemService("window"));
        int i2 = zzr.heightPixels;
        int i3 = zzr.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
        if (identifier > 0) {
            i = activity.getResources().getDimensionPixelSize(identifier);
        } else {
            i = 0;
        }
        long round = Math.round(((double) activity.getResources().getDisplayMetrics().density) + 0.5d);
        int i4 = (int) round;
        int intValue = ((Integer) zzay.zzc().zzb(zzbhy.zzdO)).intValue() * i4;
        if (!zzf(i2, zzv + i, intValue) || !zzf(i3, zzv2, intValue)) {
            return true;
        }
        return false;
    }
}
