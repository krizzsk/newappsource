package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbtz;
import com.google.android.gms.internal.ads.zzbxn;
import com.google.android.gms.internal.ads.zzcfl;
import com.google.android.gms.internal.ads.zzcfm;

final class zzae extends zzav {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ zzbtz zzb;

    public zzae(zzau zzau, Context context, zzbtz zzbtz) {
        this.zza = context;
        this.zzb = zzbtz;
    }

    public final /* bridge */ /* synthetic */ Object zza() {
        return null;
    }

    public final /* bridge */ /* synthetic */ Object zzb(zzcc zzcc) throws RemoteException {
        return zzcc.zzk(ObjectWrapper.wrap(this.zza), this.zzb, 221310000);
    }

    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        try {
            return ((zzbxn) zzcfm.zzb(this.zza, "com.google.android.gms.ads.DynamiteOfflineUtilsCreatorImpl", zzad.zza)).zze(ObjectWrapper.wrap(this.zza), this.zzb, 221310000);
        } catch (RemoteException | zzcfl | NullPointerException unused) {
            return null;
        }
    }
}
