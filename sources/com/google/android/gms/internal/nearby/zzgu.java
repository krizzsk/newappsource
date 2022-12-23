package com.google.android.gms.internal.nearby;

import android.content.Context;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.nearby.connection.Payload;
import com.google.android.gms.nearby.connection.PayloadTransferUpdate;
import java.util.Map;
import p241s0.C6302b;

@VisibleForTesting
final class zzgu extends zzkf implements zzgk {
    private final Context zza;
    private final ListenerHolder zzb;
    private final Map zzc = new C6302b();
    private final zzlt zzd;

    public zzgu(Context context, ListenerHolder listenerHolder, zzlt zzlt) {
        this.zza = (Context) Preconditions.checkNotNull(context);
        this.zzb = (ListenerHolder) Preconditions.checkNotNull(listenerHolder);
        this.zzd = zzlt;
    }

    public final synchronized void zzb(zzli zzli) {
        Payload zza2 = zzmd.zza(this.zza, zzli.zza());
        if (zza2 == null) {
            String.format("Failed to convert incoming ParcelablePayload %d to Payload.", new Object[]{Long.valueOf(zzli.zza().zzb())});
            return;
        }
        Map map = this.zzc;
        zzgt zzgt = new zzgt(zzli.zzb(), zzli.zza().zzb());
        PayloadTransferUpdate.Builder builder = new PayloadTransferUpdate.Builder();
        builder.setPayloadId(zzli.zza().zzb());
        map.put(zzgt, builder.build());
        this.zzb.notifyListener(new zzgq(this, zzli, zza2));
    }

    public final synchronized void zzc(zzlk zzlk) {
        if (zzlk.zza().getStatus() == 3) {
            this.zzc.put(new zzgt(zzlk.zzb(), zzlk.zza().getPayloadId()), zzlk.zza());
        } else {
            this.zzc.remove(new zzgt(zzlk.zzb(), zzlk.zza().getPayloadId()));
            zzlt zzlt = this.zzd;
            if (zzlt != null) {
                zzlt.zzc(zzlk.zza().getPayloadId());
            }
        }
        this.zzb.notifyListener(new zzgr(this, zzlk));
    }

    public final synchronized void zzf() {
        for (Map.Entry entry : this.zzc.entrySet()) {
            this.zzb.notifyListener(new zzgs(this, ((zzgt) entry.getKey()).zza(), (PayloadTransferUpdate) entry.getValue()));
        }
        this.zzc.clear();
    }
}
