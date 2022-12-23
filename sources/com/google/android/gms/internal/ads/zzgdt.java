package com.google.android.gms.internal.ads;

public final class zzgdt extends zzgkk implements zzglz {
    private zzgdt() {
        super(zzgdu.zzb);
    }

    public final zzgdt zza(zzgdo zzgdo) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        zzgdu.zzh((zzgdu) this.zza, zzgdo);
        return this;
    }

    public final zzgdt zzb(zzged zzged) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        zzgdu.zzg((zzgdu) this.zza, zzged);
        return this;
    }

    public final zzgdt zzc(int i) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        ((zzgdu) this.zza).zzg = zzgdl.zza(i);
        return this;
    }

    public /* synthetic */ zzgdt(zzgds zzgds) {
        super(zzgdu.zzb);
    }
}
