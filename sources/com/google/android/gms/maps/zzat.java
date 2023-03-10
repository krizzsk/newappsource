package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.zzaq;

final class zzat extends zzaq {
    public final /* synthetic */ OnMapReadyCallback zza;

    public zzat(zzau zzau, OnMapReadyCallback onMapReadyCallback) {
        this.zza = onMapReadyCallback;
    }

    public final void zzb(IGoogleMapDelegate iGoogleMapDelegate) throws RemoteException {
        this.zza.onMapReady(new GoogleMap(iGoogleMapDelegate));
    }
}
