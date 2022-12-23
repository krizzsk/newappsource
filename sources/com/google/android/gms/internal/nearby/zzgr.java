package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.connection.PayloadCallback;

final class zzgr extends zzgp {
    public final /* synthetic */ zzlk zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzgr(zzgu zzgu, zzlk zzlk) {
        super((zzgo) null);
        this.zza = zzlk;
    }

    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        ((PayloadCallback) obj).onPayloadTransferUpdate(this.zza.zzb(), this.zza.zza());
    }
}
