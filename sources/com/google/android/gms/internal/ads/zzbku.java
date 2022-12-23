package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzbku implements NativeCustomTemplateAd.DisplayOpenMeasurement {
    private final zzblu zza;

    public zzbku(zzblu zzblu) {
        this.zza = zzblu;
        try {
            zzblu.zzl();
        } catch (RemoteException e) {
            zzcfi.zzh("", e);
        }
    }

    public final void setView(View view) {
        try {
            this.zza.zzo(ObjectWrapper.wrap(view));
        } catch (RemoteException e) {
            zzcfi.zzh("", e);
        }
    }

    public final boolean start() {
        try {
            return this.zza.zzr();
        } catch (RemoteException e) {
            zzcfi.zzh("", e);
            return false;
        }
    }
}
