package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.tasks.OnTokenCanceledListener;

public final /* synthetic */ class zzar implements OnTokenCanceledListener {
    public final /* synthetic */ ICancelToken zza;

    public /* synthetic */ zzar(ICancelToken iCancelToken) {
        this.zza = iCancelToken;
    }

    public final void onCanceled() {
        ICancelToken iCancelToken = this.zza;
        int i = zzbe.zze;
        try {
            iCancelToken.cancel();
        } catch (RemoteException unused) {
        }
    }
}
