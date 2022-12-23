package com.google.android.gms.internal.ads;

import android.os.IBinder;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;

final class zzejx implements zzddb {
    public boolean zza = false;
    public final /* synthetic */ zzefb zzb;
    public final /* synthetic */ zzcga zzc;
    public final /* synthetic */ zzejy zzd;

    public zzejx(zzejy zzejy, zzefb zzefb, zzcga zzcga) {
        this.zzd = zzejy;
        this.zzb = zzefb;
        this.zzc = zzcga;
    }

    private final synchronized void zze(zze zze) {
        int i = 1;
        if (true == ((Boolean) zzay.zzc().zzb(zzbhy.zzeu)).booleanValue()) {
            i = 3;
        }
        this.zzc.zze(new zzefc(i, zze));
    }

    public final synchronized void zza(int i) {
        if (!this.zza) {
            this.zza = true;
            zze(new zze(i, zzejy.zze(this.zzb.zza, i), AdError.UNDEFINED_DOMAIN, (zze) null, (IBinder) null));
        }
    }

    public final synchronized void zzb(zze zze) {
        if (!this.zza) {
            this.zza = true;
            zze(zze);
        }
    }

    public final synchronized void zzc(int i, String str) {
        if (!this.zza) {
            this.zza = true;
            if (str == null) {
                str = zzejy.zze(this.zzb.zza, i);
            }
            zze(new zze(i, str, AdError.UNDEFINED_DOMAIN, (zze) null, (IBinder) null));
        }
    }

    public final synchronized void zzd() {
        this.zzc.zzd((Object) null);
    }
}
