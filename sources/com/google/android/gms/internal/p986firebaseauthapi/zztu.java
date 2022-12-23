package com.google.android.gms.internal.p986firebaseauthapi;

import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zztu */
final class zztu implements zzxi {
    public final /* synthetic */ zzxi zza;
    public final /* synthetic */ zzza zzb;
    public final /* synthetic */ zztv zzc;

    public zztu(zztv zztv, zzxi zzxi, zzza zzza) {
        this.zzc = zztv;
        this.zza = zzxi;
        this.zzb = zzza;
    }

    public final void zza(String str) {
        this.zza.zza(str);
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List zzb2 = ((zzyr) obj).zzb();
        if (zzb2 == null || zzb2.isEmpty()) {
            this.zza.zza("No users");
        } else {
            this.zzc.zza.zzi(this.zzb, (zzyt) zzb2.get(0));
        }
    }
}
