package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Future;

public final class zzbdh {
    /* access modifiers changed from: private */
    public zzbcw zza;
    /* access modifiers changed from: private */
    public boolean zzb;
    private final Context zzc;
    /* access modifiers changed from: private */
    public final Object zzd = new Object();

    public zzbdh(Context context) {
        this.zzc = context;
    }

    public static /* bridge */ /* synthetic */ void zze(zzbdh zzbdh) {
        synchronized (zzbdh.zzd) {
            zzbcw zzbcw = zzbdh.zza;
            if (zzbcw != null) {
                zzbcw.disconnect();
                zzbdh.zza = null;
                Binder.flushPendingCommands();
            }
        }
    }

    public final Future zzc(zzbcx zzbcx) {
        zzbdb zzbdb = new zzbdb(this);
        zzbdf zzbdf = new zzbdf(this, zzbcx, zzbdb);
        zzbdg zzbdg = new zzbdg(this, zzbdb);
        synchronized (this.zzd) {
            zzbcw zzbcw = new zzbcw(this.zzc, zzt.zzt().zzb(), zzbdf, zzbdg);
            this.zza = zzbcw;
            zzbcw.checkAvailabilityAndConnect();
        }
        return zzbdb;
    }
}
