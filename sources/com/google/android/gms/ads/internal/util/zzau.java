package com.google.android.gms.ads.internal.util;

import android.content.DialogInterface;
import android.net.Uri;
import com.google.android.gms.ads.internal.zzt;

final class zzau implements DialogInterface.OnClickListener {
    public final /* synthetic */ zzav zza;

    public zzau(zzav zzav) {
        this.zza = zzav;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        zzt.zzp();
        zzs.zzP(this.zza.zza, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}
