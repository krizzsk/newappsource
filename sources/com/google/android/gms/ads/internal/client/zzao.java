package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzbyx;
import com.google.android.gms.internal.ads.zzcfl;
import com.google.android.gms.internal.ads.zzcfm;

final class zzao extends zzav {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ zzau zzb;

    public zzao(zzau zzau, Context context) {
        this.zzb = zzau;
        this.zza = context;
    }

    public final /* bridge */ /* synthetic */ Object zza() {
        zzau.zzs(this.zza, "mobile_ads_settings");
        return new zzet();
    }

    public final /* bridge */ /* synthetic */ Object zzb(zzcc zzcc) throws RemoteException {
        return zzcc.zzg(ObjectWrapper.wrap(this.zza), 221310000);
    }

    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        Object zzck;
        zzbhy.zzc(this.zza);
        if (!((Boolean) zzay.zzc().zzb(zzbhy.zzib)).booleanValue()) {
            return this.zzb.zzc.zza(this.zza);
        }
        try {
            IBinder zze = ((zzcn) zzcfm.zzb(this.zza, "com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl", zzan.zza)).zze(ObjectWrapper.wrap(this.zza), 221310000);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            if (queryLocalInterface instanceof zzcm) {
                zzck = (zzcm) queryLocalInterface;
            } else {
                zzck = new zzck(zze);
            }
            return zzck;
        } catch (RemoteException | zzcfl | NullPointerException e) {
            this.zzb.zzh = zzbyx.zza(this.zza);
            this.zzb.zzh.zzd(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        }
    }
}
