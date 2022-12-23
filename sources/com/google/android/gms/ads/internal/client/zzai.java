package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbtz;

final class zzai extends zzav {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ zzq zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ zzbtz zzd;
    public final /* synthetic */ zzau zze;

    public zzai(zzau zzau, Context context, zzq zzq, String str, zzbtz zzbtz) {
        this.zze = zzau;
        this.zza = context;
        this.zzb = zzq;
        this.zzc = str;
        this.zzd = zzbtz;
    }

    public final /* bridge */ /* synthetic */ Object zza() {
        zzau.zzs(this.zza, "app_open");
        return new zzer();
    }

    public final /* bridge */ /* synthetic */ Object zzb(zzcc zzcc) throws RemoteException {
        return zzcc.zzc(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, this.zzd, 221310000);
    }

    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        return this.zze.zza.zza(this.zza, this.zzb, this.zzc, this.zzd, 4);
    }
}
