package com.google.android.gms.internal.p986firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.zze;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zztf */
final class zztf implements zzxi {
    public final /* synthetic */ zzxi zza;
    public final /* synthetic */ zztg zzb;

    public zztf(zztg zztg, zzxi zzxi) {
        this.zzb = zztg;
        this.zza = zzxi;
    }

    public final void zza(String str) {
        this.zza.zza(str);
    }

    public final void zzb(Object obj) {
        zzaaj zzaaj = (zzaaj) obj;
        if (!TextUtils.isEmpty(zzaaj.zzf())) {
            this.zzb.zzb.zzg(new Status(17025), new PhoneAuthCredential((String) null, (String) null, zzaaj.zzd(), zzaaj.zzf(), (String) null, false, true));
            return;
        }
        zzza zzza = new zzza(zzaaj.zze(), zzaaj.zzc(), Long.valueOf(zzaaj.zzb()), "Bearer");
        this.zzb.zzc.zzO(zzza, (String) null, "phone", Boolean.valueOf(zzaaj.zzg()), (zze) null, this.zzb.zzb, this.zza);
    }
}
