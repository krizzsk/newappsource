package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

final class zzcq extends zzdt {
    public final /* synthetic */ String zza;
    public final /* synthetic */ zzee zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzcq(zzee zzee, String str) {
        super(zzee, true);
        this.zzb = zzee;
        this.zza = str;
    }

    public final void zza() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.zzb.zzj)).setUserId(this.zza, this.zzh);
    }
}
