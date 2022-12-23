package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

public abstract class zzek implements zzer {
    private final boolean zza;
    private final ArrayList zzb = new ArrayList(1);
    private int zzc;
    private zzew zzd;

    public zzek(boolean z) {
        this.zza = z;
    }

    public /* synthetic */ Map zze() {
        return Collections.emptyMap();
    }

    public final void zzf(zzft zzft) {
        zzft.getClass();
        if (!this.zzb.contains(zzft)) {
            this.zzb.add(zzft);
            this.zzc++;
        }
    }

    public final void zzg(int i) {
        zzew zzew = this.zzd;
        int i2 = zzeg.zza;
        for (int i3 = 0; i3 < this.zzc; i3++) {
            ((zzft) this.zzb.get(i3)).zza(this, zzew, this.zza, i);
        }
    }

    public final void zzh() {
        zzew zzew = this.zzd;
        int i = zzeg.zza;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            ((zzft) this.zzb.get(i2)).zzb(this, zzew, this.zza);
        }
        this.zzd = null;
    }

    public final void zzi(zzew zzew) {
        for (int i = 0; i < this.zzc; i++) {
            ((zzft) this.zzb.get(i)).zzc(this, zzew, this.zza);
        }
    }

    public final void zzj(zzew zzew) {
        this.zzd = zzew;
        for (int i = 0; i < this.zzc; i++) {
            ((zzft) this.zzb.get(i)).zzd(this, zzew, this.zza);
        }
    }
}
