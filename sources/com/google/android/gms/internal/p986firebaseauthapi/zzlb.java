package com.google.android.gms.internal.p986firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzlb */
public final class zzlb extends zzacd implements zzadn {
    private zzlb() {
        super(zzlc.zzb);
    }

    public final zzlb zza(zzkw zzkw) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        zzlc.zzg((zzlc) this.zza, zzkw);
        return this;
    }

    public final zzlb zzb(zzll zzll) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        zzlc.zzf((zzlc) this.zza, zzll);
        return this;
    }

    public final zzlb zzc(int i) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        ((zzlc) this.zza).zzg = zzkt.zza(i);
        return this;
    }

    public /* synthetic */ zzlb(zzla zzla) {
        super(zzlc.zzb);
    }
}
