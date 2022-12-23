package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.gms.tasks.OnFailureListener;

public final /* synthetic */ class zznn implements OnFailureListener {
    public final /* synthetic */ zzno zza;
    public final /* synthetic */ long zzb;

    public /* synthetic */ zznn(zzno zzno, long j) {
        this.zza = zzno;
        this.zzb = j;
    }

    public final void onFailure(Exception exc) {
        this.zza.zzb(this.zzb, exc);
    }
}
