package com.android.billingclient.api;

import android.os.Bundle;
import android.os.ResultReceiver;
import com.android.billingclient.api.C1949f;
import com.google.android.gms.internal.play_billing.zza;

final class zzy extends ResultReceiver {
    public final void onReceiveResult(int i, Bundle bundle) {
        C1949f.C1950a a = C1949f.m5364a();
        a.f6772a = i;
        a.f6773b = zza.zzh(bundle, "BillingClient");
        a.mo9574a();
        throw null;
    }
}
