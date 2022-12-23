package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzo;

final class zzbwh implements zzo {
    public final /* synthetic */ zzbwj zza;

    public zzbwh(zzbwj zzbwj) {
        this.zza = zzbwj;
    }

    public final void zzb() {
        zzcfi.zze("Opening AdMobCustomTabsAdapter overlay.");
        zzbwj zzbwj = this.zza;
        zzbwj.zzb.onAdOpened(zzbwj);
    }

    public final void zzbC() {
        zzcfi.zze("Delay close AdMobCustomTabsAdapter overlay.");
    }

    public final void zzbK() {
        zzcfi.zze("AdMobCustomTabsAdapter overlay is resumed.");
    }

    public final void zzbr() {
        zzcfi.zze("AdMobCustomTabsAdapter overlay is paused.");
    }

    public final void zze() {
    }

    public final void zzf(int i) {
        zzcfi.zze("AdMobCustomTabsAdapter overlay is closed.");
        zzbwj zzbwj = this.zza;
        zzbwj.zzb.onAdClosed(zzbwj);
    }
}
