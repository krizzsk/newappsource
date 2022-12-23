package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.overlay.zzw;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

final class zzeha implements zzdlf {
    private final Context zza;
    private final zzcfo zzb;
    private final zzfvj zzc;
    private final zzfbg zzd;
    private final zzcli zze;
    private final zzfby zzf;
    private final zzboo zzg;
    private final boolean zzh;

    public zzeha(Context context, zzcfo zzcfo, zzfvj zzfvj, zzfbg zzfbg, zzcli zzcli, zzfby zzfby, boolean z, zzboo zzboo) {
        this.zza = context;
        this.zzb = zzcfo;
        this.zzc = zzfvj;
        this.zzd = zzfbg;
        this.zze = zzcli;
        this.zzf = zzfby;
        this.zzg = zzboo;
        this.zzh = z;
    }

    public final void zza(boolean z, Context context, zzdcf zzdcf) {
        boolean z2;
        boolean z3;
        float f;
        zzdjz zzdjz = (zzdjz) zzfva.zzq(this.zzc);
        this.zze.zzap(true);
        if (this.zzh) {
            z2 = this.zzg.zze(false);
        } else {
            z2 = false;
        }
        zzt.zzp();
        boolean zzE = zzs.zzE(this.zza);
        boolean z4 = this.zzh;
        if (z4) {
            z3 = this.zzg.zzd();
        } else {
            z3 = false;
        }
        if (z4) {
            f = this.zzg.zza();
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        zzj zzj = new zzj(z2, zzE, z3, f, -1, z, this.zzd.zzP, false);
        if (zzdcf != null) {
            zzdcf.zzf();
        }
        zzt.zzj();
        zzdku zzj2 = zzdjz.zzj();
        zzcli zzcli = this.zze;
        zzfbg zzfbg = this.zzd;
        int i = zzfbg.zzR;
        zzcfo zzcfo = this.zzb;
        String str = zzfbg.zzC;
        zzfbl zzfbl = zzfbg.zzt;
        AdOverlayInfoParcel adOverlayInfoParcel = r4;
        AdOverlayInfoParcel adOverlayInfoParcel2 = new AdOverlayInfoParcel((zza) null, (zzo) zzj2, (zzw) null, zzcli, i, zzcfo, str, zzj, zzfbl.zzb, zzfbl.zza, this.zzf.zzf, zzdcf);
        zzm.zza(context, adOverlayInfoParcel, true);
    }
}
