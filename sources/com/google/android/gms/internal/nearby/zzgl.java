package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.connection.Connections;
import com.google.android.gms.nearby.connection.Payload;

final class zzgl extends zzgp {
    public final /* synthetic */ zzli zza;
    public final /* synthetic */ zzgn zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzgl(zzgn zzgn, zzli zzli) {
        super((zzgo) null);
        this.zzb = zzgn;
        this.zza = zzli;
    }

    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        Connections.MessageListener messageListener = (Connections.MessageListener) obj;
        Payload zza2 = zzmd.zza(this.zzb.zza, this.zza.zza());
        if (zza2 == null) {
            String.format("Failed to convert incoming ParcelablePayload %d to Payload.", new Object[]{Long.valueOf(this.zza.zza().zzb())});
        } else if (zza2.getType() == 1) {
            messageListener.onMessageReceived(this.zza.zzb(), zza2.asBytes(), this.zza.zzc());
        }
    }
}
