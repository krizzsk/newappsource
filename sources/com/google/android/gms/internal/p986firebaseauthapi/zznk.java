package com.google.android.gms.internal.p986firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zznk */
public final class zznk extends zzacd implements zzadn {
    private zznk() {
        super(zznl.zzb);
    }

    public final zznk zza(int i) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        ((zznl) this.zza).zzg = i;
        return this;
    }

    public final zznk zzb(zzoa zzoa) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        ((zznl) this.zza).zzh = zzoa.zza();
        return this;
    }

    public final zznk zzc(String str) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        zznl.zzd((zznl) this.zza, str);
        return this;
    }

    public final zznk zzd(int i) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        ((zznl) this.zza).zzf = zzmw.zza(i);
        return this;
    }

    public /* synthetic */ zznk(zzni zzni) {
        super(zznl.zzb);
    }
}
