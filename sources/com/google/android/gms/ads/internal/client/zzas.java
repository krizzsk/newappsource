package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzblj;
import com.google.android.gms.internal.ads.zzbln;
import com.google.android.gms.internal.ads.zzbyx;
import com.google.android.gms.internal.ads.zzcfl;
import com.google.android.gms.internal.ads.zzcfm;
import java.util.HashMap;

final class zzas extends zzav {
    public final /* synthetic */ View zza;
    public final /* synthetic */ HashMap zzb;
    public final /* synthetic */ HashMap zzc;
    public final /* synthetic */ zzau zzd;

    public zzas(zzau zzau, View view, HashMap hashMap, HashMap hashMap2) {
        this.zzd = zzau;
        this.zza = view;
        this.zzb = hashMap;
        this.zzc = hashMap2;
    }

    public final /* bridge */ /* synthetic */ Object zza() {
        zzau.zzs(this.zza.getContext(), "native_ad_view_holder_delegate");
        return new zzev();
    }

    public final /* bridge */ /* synthetic */ Object zzb(zzcc zzcc) throws RemoteException {
        return zzcc.zzi(ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb), ObjectWrapper.wrap(this.zzc));
    }

    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzbhy.zzc(this.zza.getContext());
        if (!((Boolean) zzay.zzc().zzb(zzbhy.zzib)).booleanValue()) {
            return this.zzd.zzg.zza(this.zza, this.zzb, this.zzc);
        }
        try {
            return zzblj.zze(((zzbln) zzcfm.zzb(this.zza.getContext(), "com.google.android.gms.ads.ChimeraNativeAdViewHolderDelegateCreatorImpl", zzar.zza)).zze(ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb), ObjectWrapper.wrap(this.zzc)));
        } catch (RemoteException | zzcfl | NullPointerException e) {
            this.zzd.zzh = zzbyx.zza(this.zza.getContext());
            this.zzd.zzh.zzd(e, "ClientApiBroker.createNativeAdViewHolderDelegate");
            return null;
        }
    }
}
