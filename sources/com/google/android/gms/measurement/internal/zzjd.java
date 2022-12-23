package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzcf;

final class zzjd implements Runnable {
    public final /* synthetic */ zzaw zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzcf zzc;
    public final /* synthetic */ zzjs zzd;

    public zzjd(zzjs zzjs, zzaw zzaw, String str, zzcf zzcf) {
        this.zzd = zzjs;
        this.zza = zzaw;
        this.zzb = str;
        this.zzc = zzcf;
    }

    public final void run() {
        zzfy zzfy;
        byte[] bArr = null;
        try {
            zzjs zzjs = this.zzd;
            zzee zzh = zzjs.zzb;
            if (zzh == null) {
                zzjs.zzs.zzay().zzd().zza("Discarding data. Failed to send event to service to bundle");
                zzfy = this.zzd.zzs;
            } else {
                bArr = zzh.zzu(this.zza, this.zzb);
                this.zzd.zzQ();
                zzfy = this.zzd.zzs;
            }
        } catch (RemoteException e) {
            this.zzd.zzs.zzay().zzd().zzb("Failed to send event to the service to bundle", e);
            zzfy = this.zzd.zzs;
        } catch (Throwable th) {
            this.zzd.zzs.zzv().zzS(this.zzc, bArr);
            throw th;
        }
        zzfy.zzv().zzS(this.zzc, bArr);
    }
}
