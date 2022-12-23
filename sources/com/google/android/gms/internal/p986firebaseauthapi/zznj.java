package com.google.android.gms.internal.p986firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zznj */
public final class zznj extends zzacd implements zzadn {
    private zznj() {
        super(zznm.zzb);
    }

    public final zznj zza(zznl zznl) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        zznm.zze((zznm) this.zza, zznl);
        return this;
    }

    public final zznj zzb(int i) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        ((zznm) this.zza).zze = i;
        return this;
    }

    public /* synthetic */ zznj(zzni zzni) {
        super(zznm.zzb);
    }
}
