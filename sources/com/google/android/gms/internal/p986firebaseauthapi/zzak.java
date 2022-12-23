package com.google.android.gms.internal.p986firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzak */
final class zzak extends zzal {
    public final transient int zza;
    public final transient int zzb;
    public final /* synthetic */ zzal zzc;

    public zzak(zzal zzal, int i, int i2) {
        this.zzc = zzal;
        this.zza = i;
        this.zzb = i2;
    }

    public final Object get(int i) {
        zzy.zza(i, this.zzb, "index");
        return this.zzc.get(i + this.zza);
    }

    public final int size() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    public final Object[] zze() {
        return this.zzc.zze();
    }

    /* renamed from: zzf */
    public final zzal subList(int i, int i2) {
        zzy.zzc(i, i2, this.zzb);
        zzal zzal = this.zzc;
        int i3 = this.zza;
        return zzal.subList(i + i3, i2 + i3);
    }
}
