package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.measurement.zzbq;
import com.google.android.gms.internal.measurement.zzbr;
import p358af.C13437d;

public final class zzff implements ServiceConnection {
    public final /* synthetic */ zzfg zza;
    /* access modifiers changed from: private */
    public final String zzb;

    public zzff(zzfg zzfg, String str) {
        this.zza = zzfg;
        this.zzb = str;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder != null) {
            try {
                zzbr zzb2 = zzbq.zzb(iBinder);
                if (zzb2 == null) {
                    this.zza.zza.zzay().zzk().zza("Install Referrer Service implementation was not found");
                    return;
                }
                this.zza.zza.zzay().zzj().zza("Install Referrer Service connected");
                this.zza.zza.zzaz().zzp(new zzfe(this, zzb2, this));
            } catch (RuntimeException e) {
                this.zza.zza.zzay().zzk().zzb("Exception occurred while calling Install Referrer API", e);
            }
        } else {
            C16759e.m42354j(this.zza.zza, "Install Referrer connection returned with null binder");
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C13437d.m33710p(this.zza.zza, "Install Referrer Service disconnected");
    }
}
