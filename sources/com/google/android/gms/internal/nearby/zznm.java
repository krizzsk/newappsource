package com.google.android.gms.internal.nearby;

import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.nearby.messages.MessageListener;
import com.google.android.gms.nearby.messages.internal.Update;
import com.google.android.gms.nearby.messages.internal.zzn;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class zznm extends zzn {
    private final ListenerHolder zza;

    public zznm(ListenerHolder listenerHolder) {
        this.zza = listenerHolder;
    }

    public static void zzb(Intent intent, MessageListener messageListener) {
        Iterable iterable;
        Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.nearby.messages.UPDATES");
        if (bundleExtra == null) {
            iterable = Collections.emptyList();
        } else {
            iterable = bundleExtra.getParcelableArrayList("com.google.android.gms.nearby.messages.UPDATES");
        }
        zzc(iterable, messageListener);
    }

    public static void zzc(Iterable iterable, MessageListener messageListener) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Update update = (Update) it.next();
            if (update.zza(1)) {
                messageListener.onFound(update.zzc);
            }
            if (update.zza(2)) {
                messageListener.onLost(update.zzc);
            }
            if (update.zza(4)) {
                messageListener.onDistanceChanged(update.zzc, update.zzd);
            }
            if (update.zza(8)) {
                messageListener.onBleSignalChanged(update.zzc, update.zze);
            }
            update.zza(16);
        }
    }

    public final void zzd(List list) throws RemoteException {
        this.zza.notifyListener(new zznl(this, list));
    }
}
