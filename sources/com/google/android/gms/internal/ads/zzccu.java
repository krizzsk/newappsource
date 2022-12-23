package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.common.util.Clock;

public final class zzccu extends zzcdo {
    private final Clock zzb;
    private final zzccu zzc = this;
    private final zzgqh zzd;
    private final zzgqh zze;
    private final zzgqh zzf;
    private final zzgqh zzg;
    private final zzgqh zzh;
    private final zzgqh zzi;
    private final zzgqh zzj;
    private final zzgqh zzk;

    public /* synthetic */ zzccu(Context context, Clock clock, zzg zzg2, zzcdn zzcdn, zzcct zzcct) {
        this.zzb = clock;
        zzgpu zza = zzgpv.zza(context);
        this.zzd = zza;
        zzgpu zza2 = zzgpv.zza(zzg2);
        this.zze = zza2;
        zzgpu zza3 = zzgpv.zza(zzcdn);
        this.zzf = zza3;
        this.zzg = zzgpt.zzc(new zzccm(zza, zza2, zza3));
        zzgpu zza4 = zzgpv.zza(clock);
        this.zzh = zza4;
        zzgqh zzc2 = zzgpt.zzc(new zzcco(zza4, zza2, zza3));
        this.zzi = zzc2;
        zzccq zzccq = new zzccq(zza4, zzc2);
        this.zzj = zzccq;
        this.zzk = zzgpt.zzc(new zzcdt(zza, zzccq));
    }

    public final zzccl zza() {
        return (zzccl) this.zzg.zzb();
    }

    public final zzccp zzb() {
        return new zzccp(this.zzb, (zzccn) this.zzi.zzb());
    }

    public final zzcds zzc() {
        return (zzcds) this.zzk.zzb();
    }
}
