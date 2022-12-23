package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzcl;
import com.usebutton.sdk.internal.events.Events;

public final class zzjz {
    private final Context zza;

    public zzjz(Context context) {
        Preconditions.checkNotNull(context);
        this.zza = context;
    }

    private final zzeo zzk() {
        return zzfy.zzp(this.zza, (zzcl) null, (Long) null).zzay();
    }

    public final int zza(Intent intent, int i, int i2) {
        zzfy zzp = zzfy.zzp(this.zza, (zzcl) null, (Long) null);
        zzeo zzay = zzp.zzay();
        if (intent == null) {
            zzay.zzk().zza("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        zzp.zzaw();
        zzay.zzj().zzc("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            zzh(new zzjw(this, i2, zzay, intent));
        }
        return 2;
    }

    public final IBinder zzb(Intent intent) {
        if (intent == null) {
            zzk().zzd().zza("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new zzgq(zzkz.zzt(this.zza), (String) null);
        }
        zzk().zzk().zzb("onBind received unknown action", action);
        return null;
    }

    public final /* synthetic */ void zzc(int i, zzeo zzeo, Intent intent) {
        if (((zzjy) this.zza).zzc(i)) {
            zzeo.zzj().zzb("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i));
            zzk().zzj().zza("Completed wakeful intent.");
            ((zzjy) this.zza).zza(intent);
        }
    }

    public final /* synthetic */ void zzd(zzeo zzeo, JobParameters jobParameters) {
        zzeo.zzj().zza("AppMeasurementJobService processed last upload request.");
        ((zzjy) this.zza).zzb(jobParameters, false);
    }

    public final void zze() {
        zzfy zzp = zzfy.zzp(this.zza, (zzcl) null, (Long) null);
        zzeo zzay = zzp.zzay();
        zzp.zzaw();
        zzay.zzj().zza("Local AppMeasurementService is starting up");
    }

    public final void zzf() {
        zzfy zzp = zzfy.zzp(this.zza, (zzcl) null, (Long) null);
        zzeo zzay = zzp.zzay();
        zzp.zzaw();
        zzay.zzj().zza("Local AppMeasurementService is shutting down");
    }

    public final void zzg(Intent intent) {
        if (intent == null) {
            zzk().zzd().zza("onRebind called with null intent");
            return;
        }
        zzk().zzj().zzb("onRebind called. action", intent.getAction());
    }

    public final void zzh(Runnable runnable) {
        zzkz zzt = zzkz.zzt(this.zza);
        zzt.zzaz().zzp(new zzjx(this, zzt, runnable));
    }

    @TargetApi(24)
    public final boolean zzi(JobParameters jobParameters) {
        zzfy zzp = zzfy.zzp(this.zza, (zzcl) null, (Long) null);
        zzeo zzay = zzp.zzay();
        String string = jobParameters.getExtras().getString(Events.PROPERTY_ACTION);
        zzp.zzaw();
        zzay.zzj().zzb("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        zzh(new zzjv(this, zzay, jobParameters));
        return true;
    }

    public final boolean zzj(Intent intent) {
        if (intent == null) {
            zzk().zzd().zza("onUnbind called with null intent");
            return true;
        }
        zzk().zzj().zzb("onUnbind called for intent. action", intent.getAction());
        return true;
    }
}
