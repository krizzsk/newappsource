package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

final class zzbwq implements DialogInterface.OnClickListener {
    public final /* synthetic */ zzbwr zza;

    public zzbwq(zzbwr zzbwr) {
        this.zza = zzbwr;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zza.zzg("User canceled the download.");
    }
}
