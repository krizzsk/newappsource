package com.google.android.gms.internal.gtm;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Handler;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzfm;
import com.google.android.gms.stats.WakeLock;
import com.usebutton.sdk.internal.events.Events;

public final class zzfn<T extends Context & zzfm> {
    private static Boolean zza;
    /* access modifiers changed from: private */
    public final Handler zzb = new zzga();
    private final T zzc;

    public zzfn(T t) {
        Preconditions.checkNotNull(t);
        this.zzc = t;
    }

    public static boolean zzh(Context context) {
        Preconditions.checkNotNull(context);
        Boolean bool = zza;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = false;
        try {
            ServiceInfo serviceInfo = context.getPackageManager().getServiceInfo(new ComponentName(context, "com.google.android.gms.analytics.AnalyticsService"), 0);
            if (serviceInfo != null && serviceInfo.enabled) {
                z = true;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        zza = Boolean.valueOf(z);
        return z;
    }

    public final int zza(Intent intent, int i, int i2) {
        try {
            synchronized (zzfi.zza) {
                WakeLock wakeLock = zzfi.zzb;
                if (wakeLock != null && wakeLock.isHeld()) {
                    wakeLock.release();
                }
            }
        } catch (SecurityException unused) {
        }
        zzbv zzg = zzbv.zzg(this.zzc);
        zzfb zzm = zzg.zzm();
        if (intent == null) {
            zzm.zzR("AnalyticsService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        zzg.zzj();
        zzm.zzQ("Local AnalyticsService called. startId, action", Integer.valueOf(i2), action);
        if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(action)) {
            zzg(new zzfj(this, i2, zzm));
        }
        return 2;
    }

    public final /* synthetic */ void zzc(int i, zzfb zzfb) {
        if (((zzfm) this.zzc).callServiceStopSelfResult(i)) {
            zzfb.zzO("Local AnalyticsService processed last dispatch request");
        }
    }

    public final /* synthetic */ void zzd(zzfb zzfb, JobParameters jobParameters) {
        zzfb.zzO("AnalyticsJobService processed last dispatch request");
        ((zzfm) this.zzc).zza(jobParameters, false);
    }

    public final void zze() {
        zzbv zzg = zzbv.zzg(this.zzc);
        zzfb zzm = zzg.zzm();
        zzg.zzj();
        zzm.zzO("Local AnalyticsService is starting up");
    }

    public final void zzf() {
        zzbv zzg = zzbv.zzg(this.zzc);
        zzfb zzm = zzg.zzm();
        zzg.zzj();
        zzm.zzO("Local AnalyticsService is shutting down");
    }

    public final void zzg(Runnable runnable) {
        zzbv.zzg(this.zzc).zzf().zze(new zzfl(this, runnable));
    }

    @TargetApi(24)
    public final boolean zzi(JobParameters jobParameters) {
        zzbv zzg = zzbv.zzg(this.zzc);
        zzfb zzm = zzg.zzm();
        String string = jobParameters.getExtras().getString(Events.PROPERTY_ACTION);
        zzg.zzj();
        zzm.zzP("Local AnalyticsJobService called. action", string);
        if (!"com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(string)) {
            return true;
        }
        zzg(new zzfk(this, zzm, jobParameters));
        return true;
    }
}
