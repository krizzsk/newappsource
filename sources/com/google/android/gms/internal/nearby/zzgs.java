package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.connection.PayloadCallback;
import com.google.android.gms.nearby.connection.PayloadTransferUpdate;

final class zzgs extends zzgp {
    public final /* synthetic */ String zza;
    public final /* synthetic */ PayloadTransferUpdate zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzgs(zzgu zzgu, String str, PayloadTransferUpdate payloadTransferUpdate) {
        super((zzgo) null);
        this.zza = str;
        this.zzb = payloadTransferUpdate;
    }

    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        String str = this.zza;
        PayloadTransferUpdate.Builder builder = new PayloadTransferUpdate.Builder(this.zzb);
        builder.setStatus(2);
        ((PayloadCallback) obj).onPayloadTransferUpdate(str, builder.build());
    }
}
