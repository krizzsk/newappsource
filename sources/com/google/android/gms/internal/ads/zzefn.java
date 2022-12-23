package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

final class zzefn implements zzdlf {
    private final zzcfo zza;
    private final zzfvj zzb;
    private final zzfbg zzc;
    private final zzcli zzd;
    private final zzfby zze;
    private final zzboo zzf;
    private final boolean zzg;

    public zzefn(zzcfo zzcfo, zzfvj zzfvj, zzfbg zzfbg, zzcli zzcli, zzfby zzfby, boolean z, zzboo zzboo) {
        this.zza = zzcfo;
        this.zzb = zzfvj;
        this.zzc = zzfbg;
        this.zzd = zzcli;
        this.zze = zzfby;
        this.zzg = z;
        this.zzf = zzboo;
    }

    public final void zza(boolean z, Context context, zzdcf zzdcf) {
        boolean z2;
        boolean z3;
        float f;
        int i;
        zzcvf zzcvf = (zzcvf) zzfva.zzq(this.zzb);
        this.zzd.zzap(true);
        if (this.zzg) {
            z2 = this.zzf.zze(true);
        } else {
            z2 = true;
        }
        boolean z4 = this.zzg;
        if (z4) {
            z3 = this.zzf.zzd();
        } else {
            z3 = false;
        }
        if (z4) {
            f = this.zzf.zza();
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        zzj zzj = new zzj(z2, true, z3, f, -1, z, this.zzc.zzP, false);
        if (zzdcf != null) {
            zzdcf.zzf();
        }
        zzt.zzj();
        zzdku zzg2 = zzcvf.zzg();
        zzcli zzcli = this.zzd;
        int i2 = this.zzc.zzR;
        if (i2 == -1) {
            zzw zzw = this.zze.zzj;
            if (zzw != null) {
                int i3 = zzw.zza;
                if (i3 == 1) {
                    i = 7;
                } else if (i3 == 2) {
                    i = 6;
                }
                zzcfo zzcfo = this.zza;
                zzfbg zzfbg = this.zzc;
                String str = zzfbg.zzC;
                zzfbl zzfbl = zzfbg.zzt;
                AdOverlayInfoParcel adOverlayInfoParcel = r4;
                AdOverlayInfoParcel adOverlayInfoParcel2 = new AdOverlayInfoParcel((zza) null, (zzo) zzg2, (com.google.android.gms.ads.internal.overlay.zzw) null, zzcli, i, zzcfo, str, zzj, zzfbl.zzb, zzfbl.zza, this.zze.zzf, zzdcf);
                zzm.zza(context, adOverlayInfoParcel, true);
            }
            zzcfi.zze("Error setting app open orientation; no targeting orientation available.");
            i2 = this.zzc.zzR;
        }
        i = i2;
        zzcfo zzcfo2 = this.zza;
        zzfbg zzfbg2 = this.zzc;
        String str2 = zzfbg2.zzC;
        zzfbl zzfbl2 = zzfbg2.zzt;
        AdOverlayInfoParcel adOverlayInfoParcel3 = adOverlayInfoParcel2;
        AdOverlayInfoParcel adOverlayInfoParcel22 = new AdOverlayInfoParcel((zza) null, (zzo) zzg2, (com.google.android.gms.ads.internal.overlay.zzw) null, zzcli, i, zzcfo2, str2, zzj, zzfbl2.zzb, zzfbl2.zza, this.zze.zzf, zzdcf);
        zzm.zza(context, adOverlayInfoParcel3, true);
    }
}
