package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;
import com.google.android.gms.internal.measurement.zzbs;
import com.google.android.gms.internal.measurement.zzbt;
import com.usebutton.sdk.internal.events.Events;
import p358af.C13437d;

public final class zzkl extends zzkn {
    private final AlarmManager zza = ((AlarmManager) this.zzs.zzau().getSystemService("alarm"));
    private zzap zzb;
    private Integer zzc;

    public zzkl(zzkz zzkz) {
        super(zzkz);
    }

    private final int zzf() {
        if (this.zzc == null) {
            this.zzc = Integer.valueOf("measurement".concat(String.valueOf(this.zzs.zzau().getPackageName())).hashCode());
        }
        return this.zzc.intValue();
    }

    private final PendingIntent zzh() {
        Context zzau = this.zzs.zzau();
        return PendingIntent.getBroadcast(zzau, 0, new Intent().setClassName(zzau, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), zzbs.zza);
    }

    private final zzap zzi() {
        if (this.zzb == null) {
            this.zzb = new zzkk(this, this.zzf.zzq());
        }
        return this.zzb;
    }

    @TargetApi(24)
    private final void zzj() {
        JobScheduler jobScheduler = (JobScheduler) this.zzs.zzau().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(zzf());
        }
    }

    public final void zza() {
        zzW();
        C13437d.m33710p(this.zzs, "Unscheduling upload");
        AlarmManager alarmManager = this.zza;
        if (alarmManager != null) {
            alarmManager.cancel(zzh());
        }
        zzi().zzb();
        if (Build.VERSION.SDK_INT >= 24) {
            zzj();
        }
    }

    public final boolean zzb() {
        AlarmManager alarmManager = this.zza;
        if (alarmManager != null) {
            alarmManager.cancel(zzh());
        }
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        zzj();
        return false;
    }

    public final void zzd(long j) {
        zzW();
        this.zzs.zzaw();
        Context zzau = this.zzs.zzau();
        if (!zzlh.zzaj(zzau)) {
            this.zzs.zzay().zzc().zza("Receiver not registered/enabled");
        }
        if (!zzlh.zzak(zzau, false)) {
            this.zzs.zzay().zzc().zza("Service not registered/enabled");
        }
        zza();
        this.zzs.zzay().zzj().zzb("Scheduling upload, millis", Long.valueOf(j));
        long elapsedRealtime = this.zzs.zzav().elapsedRealtime() + j;
        this.zzs.zzf();
        if (j < Math.max(0, ((Long) zzeb.zzw.zza((Object) null)).longValue()) && !zzi().zze()) {
            zzi().zzd(j);
        }
        this.zzs.zzaw();
        if (Build.VERSION.SDK_INT >= 24) {
            Context zzau2 = this.zzs.zzau();
            ComponentName componentName = new ComponentName(zzau2, "com.google.android.gms.measurement.AppMeasurementJobService");
            int zzf = zzf();
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString(Events.PROPERTY_ACTION, "com.google.android.gms.measurement.UPLOAD");
            zzbt.zza(zzau2, new JobInfo.Builder(zzf, componentName).setMinimumLatency(j).setOverrideDeadline(j + j).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
            return;
        }
        AlarmManager alarmManager = this.zza;
        if (alarmManager != null) {
            this.zzs.zzf();
            alarmManager.setInexactRepeating(2, elapsedRealtime, Math.max(((Long) zzeb.zzr.zza((Object) null)).longValue(), j), zzh());
        }
    }
}
