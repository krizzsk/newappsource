package com.google.android.gms.internal.p986firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmr */
public final class zzmr extends zzacd implements zzadn {
    private zzmr() {
        super(zzmu.zzb);
    }

    public final zzmr zza(zzmt zzmt) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        ((zzmu) this.zza).zzg = zzmt.zza();
        return this;
    }

    public final zzmr zzb(String str) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        ((zzmu) this.zza).zze = str;
        return this;
    }

    public final zzmr zzc(zzabe zzabe) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        ((zzmu) this.zza).zzf = zzabe;
        return this;
    }

    public /* synthetic */ zzmr(zzmq zzmq) {
        super(zzmu.zzb);
    }
}
