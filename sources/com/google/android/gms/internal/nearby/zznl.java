package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.messages.MessageListener;
import java.util.List;

final class zznl extends zznp {
    public final /* synthetic */ List zza;

    public zznl(zznm zznm, List list) {
        this.zza = list;
    }

    public final /* synthetic */ void notifyListener(Object obj) {
        zznm.zzc(this.zza, (MessageListener) obj);
    }
}
