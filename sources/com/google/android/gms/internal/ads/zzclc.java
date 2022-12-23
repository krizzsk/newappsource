package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

final class zzclc implements DialogInterface.OnClickListener {
    public final /* synthetic */ JsResult zza;

    public zzclc(JsResult jsResult) {
        this.zza = jsResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zza.confirm();
    }
}
