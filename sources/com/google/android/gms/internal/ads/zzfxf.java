package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Set;

final class zzfxf implements zzfxh {
    public final /* synthetic */ zzgas zza;
    public final /* synthetic */ zzgar zzb;

    public zzfxf(zzgas zzgas, zzgar zzgar) {
        this.zza = zzgas;
        this.zzb = zzgar;
    }

    public final zzfwm zza(Class cls) throws GeneralSecurityException {
        try {
            return new zzfxc(this.zza, this.zzb, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    public final zzfwm zzb() {
        zzgas zzgas = this.zza;
        return new zzfxc(zzgas, this.zzb, zzgas.zzi());
    }

    public final Class zzc() {
        return this.zza.getClass();
    }

    public final Class zzd() {
        return this.zzb.getClass();
    }

    public final Set zze() {
        return this.zza.zzl();
    }
}
