package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;

public final class zzdlk implements zzdbs, zzdip {
    private final zzccv zza;
    private final Context zzb;
    private final zzcdn zzc;
    private final View zzd;
    private String zze;
    private final zzbdv zzf;

    public zzdlk(zzccv zzccv, Context context, zzcdn zzcdn, View view, zzbdv zzbdv) {
        this.zza = zzccv;
        this.zzb = context;
        this.zzc = zzcdn;
        this.zzd = view;
        this.zzf = zzbdv;
    }

    public final void zzbv() {
    }

    public final void zze() {
    }

    public final void zzf() {
        String str;
        if (this.zzf != zzbdv.APP_OPEN) {
            String zzd2 = this.zzc.zzd(this.zzb);
            this.zze = zzd2;
            if (this.zzf == zzbdv.REWARD_BASED_VIDEO_AD) {
                str = "/Rewarded";
            } else {
                str = "/Interstitial";
            }
            this.zze = String.valueOf(zzd2).concat(str);
        }
    }

    public final void zzj() {
        this.zza.zzb(false);
    }

    public final void zzm() {
    }

    public final void zzo() {
        View view = this.zzd;
        if (!(view == null || this.zze == null)) {
            this.zzc.zzs(view.getContext(), this.zze);
        }
        this.zza.zzb(true);
    }

    public final void zzp(zzcak zzcak, String str, String str2) {
        if (this.zzc.zzu(this.zzb)) {
            try {
                zzcdn zzcdn = this.zzc;
                Context context = this.zzb;
                zzcdn.zzo(context, zzcdn.zza(context), this.zza.zza(), zzcak.zzc(), zzcak.zzb());
            } catch (RemoteException e) {
                zzcfi.zzk("Remote Exception to get reward item.", e);
            }
        }
    }

    public final void zzr() {
    }
}
