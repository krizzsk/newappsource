package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;

final class zzdz extends zzdt {
    public final /* synthetic */ Activity zza;
    public final /* synthetic */ zzed zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzdz(zzed zzed, Activity activity) {
        super(zzed.zza, true);
        this.zzb = zzed;
        this.zza = activity;
    }

    public final void zza() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.zzb.zza.zzj)).onActivityPaused(ObjectWrapper.wrap(this.zza), this.zzi);
    }
}
