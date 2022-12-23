package com.google.android.gms.internal.p986firebaseauthapi;

import com.google.firebase.auth.zze;
import p382be.C13597f;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zztq */
final class zztq implements zzxi {
    public final /* synthetic */ zztr zza;

    public zztq(zztr zztr) {
        this.zza = zztr;
    }

    public final void zza(String str) {
        this.zza.zzb.zzh(C13597f.m34015a(str));
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzyl zzyl = (zzyl) obj;
        zzza zzza = new zzza(zzyl.zzc(), zzyl.zzb(), Long.valueOf(zzzc.zza(zzyl.zzb())), "Bearer");
        zztr zztr = this.zza;
        zztr.zzc.zzO(zzza, (String) null, (String) null, Boolean.FALSE, (zze) null, zztr.zzb, this);
    }
}
