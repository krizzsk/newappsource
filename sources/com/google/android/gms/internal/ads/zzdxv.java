package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzdxv implements zzdxf {
    /* access modifiers changed from: private */
    public final long zza;
    private final String zzb;
    /* access modifiers changed from: private */
    public final zzdxk zzc;
    private final zzfax zzd;

    public zzdxv(long j, Context context, zzdxk zzdxk, zzcnf zzcnf, String str) {
        this.zza = j;
        this.zzb = str;
        this.zzc = zzdxk;
        zzfaz zzu = zzcnf.zzu();
        zzu.zzb(context);
        zzu.zza(str);
        this.zzd = zzu.zzc().zza();
    }

    public final void zza() {
    }

    public final void zzb(zzl zzl) {
        try {
            this.zzd.zzf(zzl, new zzdxt(this));
        } catch (RemoteException e) {
            zzcfi.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzc() {
        try {
            this.zzd.zzk(new zzdxu(this));
            this.zzd.zzm(ObjectWrapper.wrap(null));
        } catch (RemoteException e) {
            zzcfi.zzl("#007 Could not call remote method.", e);
        }
    }
}
