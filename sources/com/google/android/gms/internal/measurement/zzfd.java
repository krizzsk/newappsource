package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

public final class zzfd extends zzka implements zzlm {
    private zzfd() {
        super(zzfe.zza);
    }

    public final int zza() {
        return ((zzfe) this.zza).zzb();
    }

    public final zzfc zzb(int i) {
        return ((zzfe) this.zza).zzd(i);
    }

    public final zzfd zzc() {
        if (this.zzb) {
            zzaI();
            this.zzb = false;
        }
        ((zzfe) this.zza).zzk = zzke.zzbD();
        return this;
    }

    public final zzfd zzd(int i, zzfb zzfb) {
        if (this.zzb) {
            zzaI();
            this.zzb = false;
        }
        zzfe.zzo((zzfe) this.zza, i, (zzfc) zzfb.zzaE());
        return this;
    }

    public final String zze() {
        return ((zzfe) this.zza).zzi();
    }

    public final List zzf() {
        return Collections.unmodifiableList(((zzfe) this.zza).zzj());
    }

    public final List zzg() {
        return Collections.unmodifiableList(((zzfe) this.zza).zzk());
    }

    public /* synthetic */ zzfd(zzey zzey) {
        super(zzfe.zza);
    }
}
