package com.google.android.gms.internal.p986firebaseauthapi;

import android.text.TextUtils;
import com.google.firebase.auth.zze;
import p382be.C13597f;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zztm */
final class zztm implements zzxi {
    public final /* synthetic */ zztn zza;

    public zztm(zztn zztn) {
        this.zza = zztn;
    }

    public final void zza(String str) {
        this.zza.zzb.zzh(C13597f.m34015a(str));
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzaal zzaal = (zzaal) obj;
        if (TextUtils.isEmpty(zzaal.zzb()) || TextUtils.isEmpty(zzaal.zzc())) {
            this.zza.zzb.zzh(C13597f.m34015a("INTERNAL_SUCCESS_SIGN_OUT"));
            return;
        }
        zzza zzza = new zzza(zzaal.zzc(), zzaal.zzb(), Long.valueOf(zzzc.zza(zzaal.zzb())), "Bearer");
        zztn zztn = this.zza;
        zztn.zzc.zzO(zzza, (String) null, (String) null, Boolean.FALSE, (zze) null, zztn.zzb, this);
    }
}
