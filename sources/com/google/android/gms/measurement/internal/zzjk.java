package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzcf;
import java.util.ArrayList;

final class zzjk implements Runnable {
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzq zzc;
    public final /* synthetic */ zzcf zzd;
    public final /* synthetic */ zzjs zze;

    public zzjk(zzjs zzjs, String str, String str2, zzq zzq, zzcf zzcf) {
        this.zze = zzjs;
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzq;
        this.zzd = zzcf;
    }

    public final void run() {
        zzfy zzfy;
        ArrayList arrayList = new ArrayList();
        try {
            zzjs zzjs = this.zze;
            zzee zzh = zzjs.zzb;
            if (zzh == null) {
                zzjs.zzs.zzay().zzd().zzc("Failed to get conditional properties; not connected to service", this.zza, this.zzb);
                zzfy = this.zze.zzs;
            } else {
                Preconditions.checkNotNull(this.zzc);
                arrayList = zzlh.zzH(zzh.zzf(this.zza, this.zzb, this.zzc));
                this.zze.zzQ();
                zzfy = this.zze.zzs;
            }
        } catch (RemoteException e) {
            this.zze.zzs.zzay().zzd().zzd("Failed to get conditional properties; remote exception", this.zza, this.zzb, e);
            zzfy = this.zze.zzs;
        } catch (Throwable th) {
            this.zze.zzs.zzv().zzQ(this.zzd, arrayList);
            throw th;
        }
        zzfy.zzv().zzQ(this.zzd, arrayList);
    }
}
