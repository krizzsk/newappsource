package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

final class zzdeg implements Runnable {
    private final WeakReference zza;

    public /* synthetic */ zzdeg(zzdeh zzdeh, zzdef zzdef) {
        this.zza = new WeakReference(zzdeh);
    }

    public final void run() {
        zzdeh zzdeh = (zzdeh) this.zza.get();
        if (zzdeh != null) {
            zzdeh.zzo(zzdee.zza);
        }
    }
}
