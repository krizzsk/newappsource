package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzbu;
import java.util.concurrent.Executor;

public final class zzehf implements zzefg {
    private final Context zza;
    private final zzdkx zzb;
    private final zzcfo zzc;
    private final Executor zzd;

    public zzehf(Context context, zzcfo zzcfo, zzdkx zzdkx, Executor executor) {
        this.zza = context;
        this.zzc = zzcfo;
        this.zzb = zzdkx;
        this.zzd = executor;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfbs zzfbs, zzfbg zzfbg, zzefb zzefb) throws zzfcd, zzeio {
        zzdjz zze = this.zzb.zze(new zzcyl(zzfbs, zzfbg, zzefb.zza), new zzdkc(new zzehe(this, zzefb), (zzcli) null));
        zze.zzd().zzj(new zzcti((zzfct) zzefb.zzb), this.zzd);
        ((zzegu) zzefb.zzc).zzc(zze.zzi());
        return zze.zzg();
    }

    public final void zzb(zzfbs zzfbs, zzfbg zzfbg, zzefb zzefb) throws zzfcd {
        ((zzfct) zzefb.zzb).zzn(this.zza, zzfbs.zza.zza.zzd, zzfbg.zzw.toString(), zzbu.zzl(zzfbg.zzt), (zzbuf) zzefb.zzc);
    }

    public final /* synthetic */ void zzc(zzefb zzefb, boolean z, Context context, zzdcf zzdcf) throws zzdle {
        try {
            ((zzfct) zzefb.zzb).zzu(z);
            if (this.zzc.zzc < ((Integer) zzay.zzc().zzb(zzbhy.zzaB)).intValue()) {
                ((zzfct) zzefb.zzb).zzv();
            } else {
                ((zzfct) zzefb.zzb).zzw(context);
            }
        } catch (zzfcd e) {
            zzcfi.zzi("Cannot show interstitial.");
            throw new zzdle(e.getCause());
        }
    }
}
