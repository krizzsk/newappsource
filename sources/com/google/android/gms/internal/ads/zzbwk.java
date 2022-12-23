package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;

final class zzbwk implements DialogInterface.OnClickListener {
    public final /* synthetic */ zzbwm zza;

    public zzbwk(zzbwm zzbwm) {
        this.zza = zzbwm;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Intent zzb = this.zza.zzb();
        zzt.zzp();
        zzs.zzI(this.zza.zzb, zzb);
    }
}
