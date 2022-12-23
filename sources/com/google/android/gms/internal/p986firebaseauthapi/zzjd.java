package com.google.android.gms.internal.p986firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzjd */
public final class zzjd extends zzacd implements zzadn {
    private zzjd() {
        super(zzje.zzb);
    }

    public final zzjd zza(zzabe zzabe) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        ((zzje) this.zza).zzg = zzabe;
        return this;
    }

    public final zzjd zzb(zzjk zzjk) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        zzje.zzi((zzje) this.zza, zzjk);
        return this;
    }

    public final zzjd zzc(int i) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        ((zzje) this.zza).zze = 0;
        return this;
    }

    public /* synthetic */ zzjd(zzjc zzjc) {
        super(zzje.zzb);
    }
}
