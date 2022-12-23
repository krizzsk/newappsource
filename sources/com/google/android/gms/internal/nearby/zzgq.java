package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.connection.Payload;
import com.google.android.gms.nearby.connection.PayloadCallback;

final class zzgq extends zzgp {
    public final /* synthetic */ zzli zza;
    public final /* synthetic */ Payload zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzgq(zzgu zzgu, zzli zzli, Payload payload) {
        super((zzgo) null);
        this.zza = zzli;
        this.zzb = payload;
    }

    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        ((PayloadCallback) obj).onPayloadReceived(this.zza.zzb(), this.zzb);
    }
}
