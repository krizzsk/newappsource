package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.lang.ref.WeakReference;

public final class zzdss extends zzcxw {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzdlf zze;
    private final zzdio zzf;
    private final zzdcf zzg;
    private final zzddm zzh;
    private final zzcyq zzi;
    private final zzcba zzj;
    private final zzfld zzk;
    private boolean zzl = false;

    public zzdss(zzcxv zzcxv, Context context, zzcli zzcli, zzdlf zzdlf, zzdio zzdio, zzdcf zzdcf, zzddm zzddm, zzcyq zzcyq, zzfbg zzfbg, zzfld zzfld) {
        super(zzcxv);
        String str;
        int i;
        this.zzc = context;
        this.zze = zzdlf;
        this.zzd = new WeakReference(zzcli);
        this.zzf = zzdio;
        this.zzg = zzdcf;
        this.zzh = zzddm;
        this.zzi = zzcyq;
        this.zzk = zzfld;
        zzcaw zzcaw = zzfbg.zzm;
        if (zzcaw != null) {
            str = zzcaw.zza;
        } else {
            str = "";
        }
        if (zzcaw != null) {
            i = zzcaw.zzb;
        } else {
            i = 1;
        }
        this.zzj = new zzcbu(str, i);
    }

    public final void finalize() throws Throwable {
        try {
            zzcli zzcli = (zzcli) this.zzd.get();
            if (((Boolean) zzay.zzc().zzb(zzbhy.zzfH)).booleanValue()) {
                if (!this.zzl && zzcli != null) {
                    zzcfv.zze.execute(new zzdsr(zzcli));
                }
            } else if (zzcli != null) {
                zzcli.destroy();
            }
        } finally {
            super.finalize();
        }
    }

    public final Bundle zza() {
        return this.zzh.zzb();
    }

    public final zzcba zzc() {
        return this.zzj;
    }

    public final boolean zzd() {
        return this.zzi.zzg();
    }

    public final boolean zze() {
        return this.zzl;
    }

    public final boolean zzf() {
        zzcli zzcli = (zzcli) this.zzd.get();
        if (zzcli == null || zzcli.zzaD()) {
            return false;
        }
        return true;
    }

    public final boolean zzg(boolean z, Activity activity) {
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzay)).booleanValue()) {
            zzt.zzp();
            if (zzs.zzC(this.zzc)) {
                zzcfi.zzj("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.zzg.zzb();
                if (((Boolean) zzay.zzc().zzb(zzbhy.zzaz)).booleanValue()) {
                    this.zzk.zza(this.zza.zzb.zzb.zzb);
                }
                return false;
            }
        }
        if (this.zzl) {
            zzcfi.zzj("The rewarded ad have been showed.");
            this.zzg.zza(zzfcx.zzd(10, (String) null, (zze) null));
            return false;
        }
        this.zzl = true;
        this.zzf.zzb();
        Context context = activity;
        if (activity == null) {
            context = this.zzc;
        }
        try {
            this.zze.zza(z, context, this.zzg);
            this.zzf.zza();
            return true;
        } catch (zzdle e) {
            this.zzg.zze(e);
            return false;
        }
    }
}
