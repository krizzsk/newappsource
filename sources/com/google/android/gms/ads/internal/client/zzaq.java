package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzbld;
import com.google.android.gms.internal.ads.zzblh;
import com.google.android.gms.internal.ads.zzbyx;
import com.google.android.gms.internal.ads.zzcfl;
import com.google.android.gms.internal.ads.zzcfm;

final class zzaq extends zzav {
    public final /* synthetic */ FrameLayout zza;
    public final /* synthetic */ FrameLayout zzb;
    public final /* synthetic */ Context zzc;
    public final /* synthetic */ zzau zzd;

    public zzaq(zzau zzau, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        this.zzd = zzau;
        this.zza = frameLayout;
        this.zzb = frameLayout2;
        this.zzc = context;
    }

    public final /* bridge */ /* synthetic */ Object zza() {
        zzau.zzs(this.zzc, "native_ad_view_delegate");
        return new zzeu();
    }

    public final /* bridge */ /* synthetic */ Object zzb(zzcc zzcc) throws RemoteException {
        return zzcc.zzh(ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb));
    }

    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzbhy.zzc(this.zzc);
        if (!((Boolean) zzay.zzc().zzb(zzbhy.zzib)).booleanValue()) {
            return this.zzd.zzd.zza(this.zzc, this.zza, this.zzb);
        }
        try {
            return zzbld.zzbB(((zzblh) zzcfm.zzb(this.zzc, "com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl", zzap.zza)).zze(ObjectWrapper.wrap(this.zzc), ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb), 221310000));
        } catch (RemoteException | zzcfl | NullPointerException e) {
            this.zzd.zzh = zzbyx.zza(this.zzc);
            this.zzd.zzh.zzd(e, "ClientApiBroker.createNativeAdViewDelegate");
            return null;
        }
    }
}
