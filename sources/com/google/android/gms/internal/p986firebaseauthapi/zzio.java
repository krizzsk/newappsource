package com.google.android.gms.internal.p986firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzio */
public final class zzio extends zzacd implements zzadn {
    private zzio() {
        super(zzip.zzb);
    }

    public final zzio zza(zzabe zzabe) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        ((zzip) this.zza).zzf = zzabe;
        return this;
    }

    public final zzio zzb(zziv zziv) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        zzip.zzi((zzip) this.zza, zziv);
        return this;
    }

    public final zzio zzc(int i) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        ((zzip) this.zza).zze = 0;
        return this;
    }

    public /* synthetic */ zzio(zzin zzin) {
        super(zzip.zzb);
    }
}
