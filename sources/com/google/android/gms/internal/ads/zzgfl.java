package com.google.android.gms.internal.ads;

public final class zzgfl extends zzgkk implements zzglz {
    private zzgfl() {
        super(zzgfm.zzb);
    }

    public final zzgfl zza(String str) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        zzgfm.zzg((zzgfm) this.zza, str);
        return this;
    }

    public final zzgfl zzb(zzgjg zzgjg) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        ((zzgfm) this.zza).zzf = zzgjg;
        return this;
    }

    public final zzgfl zzc(int i) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        ((zzgfm) this.zza).zzg = zzggn.zza(i);
        return this;
    }

    public /* synthetic */ zzgfl(zzgfk zzgfk) {
        super(zzgfm.zzb);
    }
}
