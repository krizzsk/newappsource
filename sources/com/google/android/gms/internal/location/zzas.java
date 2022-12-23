package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.OnTokenCanceledListener;
import java.util.concurrent.atomic.AtomicReference;

public final /* synthetic */ class zzas implements OnTokenCanceledListener {
    public final /* synthetic */ zzbe zza;
    public final /* synthetic */ AtomicReference zzb;

    public /* synthetic */ zzas(zzbe zzbe, AtomicReference atomicReference) {
        this.zza = zzbe;
        this.zzb = atomicReference;
    }

    public final void onCanceled() {
        zzbe zzbe = this.zza;
        ListenerHolder.ListenerKey listenerKey = ((ListenerHolder) Preconditions.checkNotNull((ListenerHolder) this.zzb.get())).getListenerKey();
        if (listenerKey != null) {
            try {
                zzbe.zzy(listenerKey, (zzai) null);
            } catch (RemoteException unused) {
            }
        }
    }
}
