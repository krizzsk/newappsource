package com.google.android.gms.internal.p986firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zznu */
public final class zznu extends zzacd implements zzadn {
    private zznu() {
        super(zznv.zzb);
    }

    public final zznu zza(zzny zzny) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        zznv.zzg((zznv) this.zza, zzny);
        return this;
    }

    public final zznu zzb(int i) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        ((zznv) this.zza).zze = 0;
        return this;
    }

    public /* synthetic */ zznu(zznt zznt) {
        super(zznv.zzb);
    }
}
