package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Set;

final class zzfxd implements zzfxh {
    public final /* synthetic */ zzfwm zza;

    public zzfxd(zzfwm zzfwm) {
        this.zza = zzfwm;
    }

    public final zzfwm zza(Class cls) throws GeneralSecurityException {
        if (this.zza.zzc().equals(cls)) {
            return this.zza;
        }
        throw new InternalError("This should never be called, as we always first check supportedPrimitives.");
    }

    public final zzfwm zzb() {
        return this.zza;
    }

    public final Class zzc() {
        return this.zza.getClass();
    }

    public final Class zzd() {
        return null;
    }

    public final Set zze() {
        return Collections.singleton(this.zza.zzc());
    }
}
