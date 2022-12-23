package com.google.android.gms.internal.ads;

import android.os.RemoteException;

public final /* synthetic */ class zzdrb implements Runnable {
    public final /* synthetic */ zzdrd zza;

    public /* synthetic */ zzdrb(zzdrd zzdrd) {
        this.zza = zzdrd;
    }

    public final void run() {
        try {
            this.zza.zzd();
        } catch (RemoteException e) {
            zzcfi.zzl("#007 Could not call remote method.", e);
        }
    }
}
