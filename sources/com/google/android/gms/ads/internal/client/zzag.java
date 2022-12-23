package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.p983h5.OnH5AdsEventListener;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbpd;
import com.google.android.gms.internal.ads.zzbpm;
import com.google.android.gms.internal.ads.zzbpq;
import com.google.android.gms.internal.ads.zzbtz;
import com.google.android.gms.internal.ads.zzcfl;
import com.google.android.gms.internal.ads.zzcfm;

final class zzag extends zzav {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ zzbtz zzb;
    public final /* synthetic */ OnH5AdsEventListener zzc;

    public zzag(zzau zzau, Context context, zzbtz zzbtz, OnH5AdsEventListener onH5AdsEventListener) {
        this.zza = context;
        this.zzb = zzbtz;
        this.zzc = onH5AdsEventListener;
    }

    public final /* synthetic */ Object zza() {
        return new zzbpq();
    }

    public final /* bridge */ /* synthetic */ Object zzb(zzcc zzcc) throws RemoteException {
        return zzcc.zzj(ObjectWrapper.wrap(this.zza), this.zzb, 221310000, new zzbpd(this.zzc));
    }

    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        try {
            return ((zzbpm) zzcfm.zzb(this.zza, "com.google.android.gms.ads.DynamiteH5AdsManagerCreatorImpl", zzaf.zza)).zze(ObjectWrapper.wrap(this.zza), this.zzb, 221310000, new zzbpd(this.zzc));
        } catch (RemoteException | zzcfl | NullPointerException unused) {
            return null;
        }
    }
}
