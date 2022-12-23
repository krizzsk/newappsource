package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzi;
import com.google.android.gms.ads.internal.zzt;
import java.lang.ref.WeakReference;

public final class zzcni {
    private final zzcfo zza;
    private final Context zzb;
    private final WeakReference zzc;

    public /* synthetic */ zzcni(zzcng zzcng, zzcnh zzcnh) {
        this.zza = zzcng.zza;
        this.zzb = zzcng.zzb;
        this.zzc = zzcng.zzc;
    }

    public final Context zza() {
        return this.zzb;
    }

    public final zzaoc zzb() {
        return new zzaoc(new zzi(this.zzb, this.zza));
    }

    public final zzbkh zzc() {
        return new zzbkh(this.zzb);
    }

    public final zzcfo zzd() {
        return this.zza;
    }

    public final String zze() {
        return zzt.zzp().zzc(this.zzb, this.zza.zza);
    }

    public final WeakReference zzf() {
        return this.zzc;
    }
}
