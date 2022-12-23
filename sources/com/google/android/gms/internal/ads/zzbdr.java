package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ExecutorService;

public final class zzbdr {
    @VisibleForTesting
    public zzara zza;
    @VisibleForTesting
    public boolean zzb;
    /* access modifiers changed from: private */
    public final ExecutorService zzc;

    public zzbdr() {
        this.zzc = zzcex.zzb;
    }

    /* access modifiers changed from: private */
    /* renamed from: zzc */
    public final void zzb(Context context) {
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzdU)).booleanValue()) {
            try {
                this.zza = (zzara) zzcfm.zzb(context, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", zzbdn.zza);
                this.zza.zze(ObjectWrapper.wrap(context), "GMA_SDK");
                this.zzb = true;
            } catch (RemoteException | zzcfl | NullPointerException unused) {
                zzcfi.zze("Cannot dynamite load clearcut");
            }
        }
    }

    public zzbdr(Context context) {
        ExecutorService executorService = zzcex.zzb;
        this.zzc = executorService;
        zzbhy.zzc(context);
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzin)).booleanValue()) {
            executorService.execute(new zzbdm(this, context));
        } else {
            zzb(context);
        }
    }
}
