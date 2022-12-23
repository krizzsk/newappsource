package com.google.android.gms.internal.ads;

public final class zzgbg extends zzgkk implements zzglz {
    private zzgbg() {
        super(zzgbh.zzb);
    }

    public final zzgbg zza(zzgjg zzgjg) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        ((zzgbh) this.zza).zzf = zzgjg;
        return this;
    }

    public final zzgbg zzb(zzgbn zzgbn) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        zzgbh.zzj((zzgbh) this.zza, zzgbn);
        return this;
    }

    public final zzgbg zzc(int i) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        ((zzgbh) this.zza).zze = 0;
        return this;
    }

    public /* synthetic */ zzgbg(zzgbf zzgbf) {
        super(zzgbh.zzb);
    }
}
