package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzbsp;
import com.google.android.gms.internal.ads.zzbst;
import com.google.android.gms.internal.ads.zzbsw;
import com.google.android.gms.internal.ads.zzbsz;
import com.google.android.gms.internal.ads.zzcel;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzcfo;
import com.google.android.gms.internal.ads.zzcfv;
import com.google.android.gms.internal.ads.zzcfy;
import com.google.android.gms.internal.ads.zzfhf;
import com.google.android.gms.internal.ads.zzfhg;
import com.google.android.gms.internal.ads.zzfhs;
import com.google.android.gms.internal.ads.zzfva;
import com.google.android.gms.internal.ads.zzfvj;
import com.google.android.gms.internal.ads.zzfvk;
import com.unity3d.ads.metadata.MediationMetaData;
import org.json.JSONObject;

public final class zze {
    private Context zza;
    private long zzb = 0;

    public final void zza(Context context, zzcfo zzcfo, String str, Runnable runnable, zzfhs zzfhs) {
        zzb(context, zzcfo, true, (zzcel) null, str, (String) null, runnable, zzfhs);
    }

    @VisibleForTesting
    public final void zzb(Context context, zzcfo zzcfo, boolean z, zzcel zzcel, String str, String str2, Runnable runnable, zzfhs zzfhs) {
        PackageInfo packageInfo;
        if (zzt.zzA().elapsedRealtime() - this.zzb < InstallSheetPresenter.LOADING_TIMER_DELAY_IN_MILLIS) {
            zzcfi.zzj("Not retrying to fetch app settings");
            return;
        }
        this.zzb = zzt.zzA().elapsedRealtime();
        if (zzcel != null) {
            long zza2 = zzcel.zza();
            if (zzt.zzA().currentTimeMillis() - zza2 <= ((Long) zzay.zzc().zzb(zzbhy.zzdd)).longValue() && zzcel.zzi()) {
                return;
            }
        }
        if (context == null) {
            zzcfi.zzj("Context not provided to fetch application settings");
        } else if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                applicationContext = context;
            }
            this.zza = applicationContext;
            zzfhg zza3 = zzfhf.zza(context, 4);
            zza3.zzf();
            zzbsz zza4 = zzt.zzf().zza(this.zza, zzcfo, zzfhs);
            zzbst zzbst = zzbsw.zza;
            zzbsp zza5 = zza4.zza("google.afma.config.fetchAppSettings", zzbst, zzbst);
            try {
                JSONObject jSONObject = new JSONObject();
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("app_id", str);
                } else if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put("ad_unit_id", str2);
                }
                jSONObject.put("is_init", z);
                jSONObject.put("pn", context.getPackageName());
                jSONObject.put("experiment_ids", TextUtils.join(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, zzbhy.zza()));
                try {
                    ApplicationInfo applicationInfo = this.zza.getApplicationInfo();
                    if (!(applicationInfo == null || (packageInfo = Wrappers.packageManager(context).getPackageInfo(applicationInfo.packageName, 0)) == null)) {
                        jSONObject.put(MediationMetaData.KEY_VERSION, packageInfo.versionCode);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    com.google.android.gms.ads.internal.util.zze.zza("Error fetching PackageInfo.");
                }
                zzfvj zzb2 = zza5.zzb(jSONObject);
                zzd zzd = new zzd(zzfhs, zza3);
                zzfvk zzfvk = zzcfv.zzf;
                zzfvj zzn = zzfva.zzn(zzb2, zzd, zzfvk);
                if (runnable != null) {
                    zzb2.zzc(runnable, zzfvk);
                }
                zzcfy.zza(zzn, "ConfigLoader.maybeFetchNewAppSettings");
            } catch (Exception e) {
                zzcfi.zzh("Error requesting application settings", e);
                zza3.zze(false);
                zzfhs.zzb(zza3.zzj());
            }
        } else {
            zzcfi.zzj("App settings could not be fetched. Required parameters missing");
        }
    }

    public final void zzc(Context context, zzcfo zzcfo, String str, zzcel zzcel, zzfhs zzfhs) {
        zzb(context, zzcfo, false, zzcel, zzcel != null ? zzcel.zzb() : null, str, (Runnable) null, zzfhs);
    }
}
