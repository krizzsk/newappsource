package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterscrollerAd;

final class zzbvy implements MediationAdLoadCallback {
    public final /* synthetic */ zzbvg zza;
    public final /* synthetic */ zzbuf zzb;

    public zzbvy(zzbwd zzbwd, zzbvg zzbvg, zzbuf zzbuf) {
        this.zza = zzbvg;
        this.zzb = zzbuf;
    }

    public final void onFailure(AdError adError) {
        try {
            this.zza.zzf(adError.zza());
        } catch (RemoteException e) {
            zzcfi.zzh("", e);
        }
    }

    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        MediationInterscrollerAd mediationInterscrollerAd = (MediationInterscrollerAd) obj;
        if (mediationInterscrollerAd == null) {
            zzcfi.zzj("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
            try {
                this.zza.zze("Adapter returned null.");
                return null;
            } catch (RemoteException e) {
                zzcfi.zzh("", e);
                return null;
            }
        } else {
            try {
                this.zza.zzh(new zzbuz(mediationInterscrollerAd));
            } catch (RemoteException e2) {
                zzcfi.zzh("", e2);
            }
            return new zzbwe(this.zzb);
        }
    }

    public final void onFailure(String str) {
        onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
    }
}
