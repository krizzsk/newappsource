package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import p358af.C13437d;

final class zzhn implements Runnable {
    public final /* synthetic */ Bundle zza;
    public final /* synthetic */ zzid zzb;

    public zzhn(zzid zzid, Bundle bundle) {
        this.zzb = zzid;
        this.zza = bundle;
    }

    public final void run() {
        zzid zzid = this.zzb;
        Bundle bundle = this.zza;
        zzid.zzg();
        zzid.zza();
        Preconditions.checkNotNull(bundle);
        String checkNotEmpty = Preconditions.checkNotEmpty(bundle.getString("name"));
        if (!zzid.zzs.zzJ()) {
            C13437d.m33710p(zzid.zzs, "Conditional property not cleared since app measurement is disabled");
            return;
        }
        zzlc zzlc = new zzlc(checkNotEmpty, 0, (Object) null, "");
        try {
            zzac zzac = r4;
            zzac zzac2 = new zzac(bundle.getString("app_id"), "", zzlc, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP), bundle.getBoolean(AppMeasurementSdk.ConditionalUserProperty.ACTIVE), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME), (zzaw) null, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT), (zzaw) null, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE), zzid.zzs.zzv().zzz(bundle.getString("app_id"), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME), bundle.getBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS), "", bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP), true, true));
            zzid.zzs.zzt().zzE(zzac);
        } catch (IllegalArgumentException unused) {
        }
    }
}
