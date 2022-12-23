package com.google.android.gms.internal.p986firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzab */
final class zzab extends zzad {
    public final /* synthetic */ zzp zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzab(zzac zzac, zzaf zzaf, CharSequence charSequence, zzp zzp) {
        super(zzaf, charSequence);
        this.zza = zzp;
    }

    public final int zzc(int i) {
        return ((zzs) this.zza).zza.end();
    }

    public final int zzd(int i) {
        if (((zzs) this.zza).zza.find(i)) {
            return ((zzs) this.zza).zza.start();
        }
        return -1;
    }
}
