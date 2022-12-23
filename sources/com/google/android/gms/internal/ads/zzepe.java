package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.appsflyer.ServerParameters;

public final class zzepe implements zzetb {
    private final zzfvk zza;
    private final Context zzb;

    public zzepe(zzfvk zzfvk, Context context) {
        this.zza = zzfvk;
        this.zzb = context;
    }

    public final int zza() {
        return 14;
    }

    public final zzfvj zzb() {
        return this.zza.zzb(new zzepd(this));
    }

    public final /* synthetic */ zzepf zzc() throws Exception {
        double d;
        Intent registerReceiver = this.zzb.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra(ServerParameters.STATUS, -1);
            d = ((double) registerReceiver.getIntExtra("level", -1)) / ((double) registerReceiver.getIntExtra("scale", -1));
            if (intExtra == 2 || intExtra == 5) {
                z = true;
            }
        } else {
            d = -1.0d;
        }
        return new zzepf(d, z);
    }
}
