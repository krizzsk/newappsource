package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

@TargetApi(14)
final class zzic implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ zzid zza;

    public /* synthetic */ zzic(zzid zzid, zzib zzib) {
        this.zza = zzid;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zzfy zzfy;
        boolean z;
        String str;
        try {
            this.zza.zzs.zzay().zzj().zza("onActivityCreated");
            Intent intent = activity.getIntent();
            if (intent == null) {
                zzfy = this.zza.zzs;
            } else {
                Uri data = intent.getData();
                if (data != null) {
                    if (data.isHierarchical()) {
                        this.zza.zzs.zzv();
                        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                        boolean z2 = true;
                        if ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (true != z) {
                            str = "auto";
                        } else {
                            str = "gs";
                        }
                        String str2 = str;
                        String queryParameter = data.getQueryParameter("referrer");
                        if (bundle != null) {
                            z2 = false;
                        }
                        this.zza.zzs.zzaz().zzp(new zzia(this, z2, data, str2, queryParameter));
                        zzfy = this.zza.zzs;
                    }
                }
                zzfy = this.zza.zzs;
            }
        } catch (RuntimeException e) {
            this.zza.zzs.zzay().zzd().zzb("Throwable caught in onActivityCreated", e);
            zzfy = this.zza.zzs;
        } catch (Throwable th) {
            this.zza.zzs.zzs().zzr(activity, bundle);
            throw th;
        }
        zzfy.zzs().zzr(activity, bundle);
    }

    public final void onActivityDestroyed(Activity activity) {
        this.zza.zzs.zzs().zzs(activity);
    }

    public final void onActivityPaused(Activity activity) {
        this.zza.zzs.zzs().zzt(activity);
        zzki zzu = this.zza.zzs.zzu();
        zzu.zzs.zzaz().zzp(new zzkb(zzu, zzu.zzs.zzav().elapsedRealtime()));
    }

    public final void onActivityResumed(Activity activity) {
        zzki zzu = this.zza.zzs.zzu();
        zzu.zzs.zzaz().zzp(new zzka(zzu, zzu.zzs.zzav().elapsedRealtime()));
        this.zza.zzs.zzs().zzu(activity);
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.zza.zzs.zzs().zzv(activity, bundle);
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}
