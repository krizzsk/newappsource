package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaqv;

public final class zzba extends zzaqv implements zzbc {
    public zzba(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdClickListener");
    }

    public final void zzb() throws RemoteException {
        zzbl(1, zza());
    }
}
