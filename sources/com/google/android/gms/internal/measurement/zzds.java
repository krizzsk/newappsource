package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;

final class zzds extends zzdt {
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ Object zzc;
    public final /* synthetic */ boolean zzd;
    public final /* synthetic */ zzee zze;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzds(zzee zzee, String str, String str2, Object obj, boolean z) {
        super(zzee, true);
        this.zze = zzee;
        this.zza = str;
        this.zzb = str2;
        this.zzc = obj;
        this.zzd = z;
    }

    public final void zza() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.zze.zzj)).setUserProperty(this.zza, this.zzb, ObjectWrapper.wrap(this.zzc), this.zzd, this.zzh);
    }
}
