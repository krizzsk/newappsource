package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzbtz;
import com.google.android.gms.internal.ads.zzbyx;
import com.google.android.gms.internal.ads.zzcfl;
import com.google.android.gms.internal.ads.zzcfm;

final class zzam extends zzav {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzbtz zzc;
    public final /* synthetic */ zzau zzd;

    public zzam(zzau zzau, Context context, String str, zzbtz zzbtz) {
        this.zzd = zzau;
        this.zza = context;
        this.zzb = str;
        this.zzc = zzbtz;
    }

    public final /* bridge */ /* synthetic */ Object zza() {
        zzau.zzs(this.zza, "native_ad");
        return new zzep();
    }

    public final /* bridge */ /* synthetic */ Object zzb(zzcc zzcc) throws RemoteException {
        return zzcc.zzb(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, 221310000);
    }

    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        Object zzbm;
        zzbhy.zzc(this.zza);
        if (!((Boolean) zzay.zzc().zzb(zzbhy.zzib)).booleanValue()) {
            return this.zzd.zzb.zza(this.zza, this.zzb, this.zzc);
        }
        try {
            IBinder zze = ((zzbp) zzcfm.zzb(this.zza, "com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl", zzal.zza)).zze(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, 221310000);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            if (queryLocalInterface instanceof zzbo) {
                zzbm = (zzbo) queryLocalInterface;
            } else {
                zzbm = new zzbm(zze);
            }
            return zzbm;
        } catch (RemoteException | zzcfl | NullPointerException e) {
            this.zzd.zzh = zzbyx.zza(this.zza);
            this.zzd.zzh.zzd(e, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        }
    }
}
