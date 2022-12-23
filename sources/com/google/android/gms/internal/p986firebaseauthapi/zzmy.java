package com.google.android.gms.internal.p986firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmy */
public final class zzmy extends zzacd implements zzadn {
    private zzmy() {
        super(zzmz.zzb);
    }

    public final zzmy zza(zzoa zzoa) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        ((zzmz) this.zza).zzg = zzoa.zza();
        return this;
    }

    public final zzmy zzb(String str) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        zzmz.zzg((zzmz) this.zza, str);
        return this;
    }

    public final zzmy zzc(zzabe zzabe) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        ((zzmz) this.zza).zzf = zzabe;
        return this;
    }

    public /* synthetic */ zzmy(zzmx zzmx) {
        super(zzmz.zzb);
    }
}
