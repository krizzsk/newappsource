package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

final class zzbwl implements DialogInterface.OnClickListener {
    public final /* synthetic */ zzbwm zza;

    public zzbwl(zzbwm zzbwm) {
        this.zza = zzbwm;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zza.zzg("Operation denied by user.");
    }
}
