package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbtz;
import com.google.android.gms.internal.ads.zzcbp;

final class zzat extends zzav {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzbtz zzc;
    public final /* synthetic */ zzau zzd;

    public zzat(zzau zzau, Context context, String str, zzbtz zzbtz) {
        this.zzd = zzau;
        this.zza = context;
        this.zzb = str;
        this.zzc = zzbtz;
    }

    public final /* bridge */ /* synthetic */ Object zza() {
        zzau.zzs(this.zza, "rewarded");
        return new zzex();
    }

    public final /* bridge */ /* synthetic */ Object zzb(zzcc zzcc) throws RemoteException {
        return zzcc.zzn(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, 221310000);
    }

    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        return zzcbp.zza(this.zza, this.zzb, this.zzc);
    }
}
