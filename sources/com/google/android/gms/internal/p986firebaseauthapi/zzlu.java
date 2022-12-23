package com.google.android.gms.internal.p986firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzlu */
public final class zzlu extends zzacd implements zzadn {
    private zzlu() {
        super(zzlv.zzb);
    }

    public final zzlu zza(zzabe zzabe) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        ((zzlv) this.zza).zzg = zzabe;
        return this;
    }

    public final zzlu zzb(zzmb zzmb) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        zzlv.zzi((zzlv) this.zza, zzmb);
        return this;
    }

    public final zzlu zzc(int i) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        ((zzlv) this.zza).zze = 0;
        return this;
    }

    public /* synthetic */ zzlu(zzlt zzlt) {
        super(zzlv.zzb);
    }
}
