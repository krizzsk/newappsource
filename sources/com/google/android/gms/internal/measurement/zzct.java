package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

final class zzct extends zzdt {
    public final /* synthetic */ Bundle zza;
    public final /* synthetic */ zzee zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzct(zzee zzee, Bundle bundle) {
        super(zzee, true);
        this.zzb = zzee;
        this.zza = bundle;
    }

    public final void zza() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.zzb.zzj)).setConsent(this.zza, this.zzh);
    }
}
