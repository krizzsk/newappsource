package com.google.android.gms.internal.p986firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmo */
public final class zzmo extends zzacd implements zzadn {
    private zzmo() {
        super(zzmp.zzb);
    }

    public final zzmo zza(zzmj zzmj) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        zzmp.zzi((zzmp) this.zza, zzmj);
        return this;
    }

    public final zzmo zzb(zzabe zzabe) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        ((zzmp) this.zza).zzg = zzabe;
        return this;
    }

    public final zzmo zzc(int i) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        ((zzmp) this.zza).zze = 0;
        return this;
    }

    public /* synthetic */ zzmo(zzmn zzmn) {
        super(zzmp.zzb);
    }
}
