package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;
import com.google.android.gms.common.internal.ShowFirstParty;

@ShowFirstParty
public final class zzfs {
    private GoogleAnalytics zza;
    private final Context zzb;
    private Tracker zzc;

    public zzfs(Context context) {
        this.zzb = context;
    }

    private final synchronized void zzb(String str) {
        if (this.zza == null) {
            GoogleAnalytics instance = GoogleAnalytics.getInstance(this.zzb);
            this.zza = instance;
            instance.setLogger(new zzfr());
            this.zzc = this.zza.newTracker("_GTM_DEFAULT_TRACKER_");
        }
    }

    public final Tracker zza(String str) {
        zzb("_GTM_DEFAULT_TRACKER_");
        return this.zzc;
    }
}
