package com.google.android.gms.internal.p986firebaseauthapi;

import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxu */
final class zzxu extends zzwc {
    public final /* synthetic */ zzxx zza;
    private final String zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzxu(zzxx zzxx, zzwc zzwc, String str) {
        super(zzwc);
        this.zza = zzxx;
        this.zzb = str;
    }

    public final void zzb(String str) {
        zzxx.zza.mo65850d("onCodeSent", new Object[0]);
        zzxw zzxw = (zzxw) this.zza.zzd.get(this.zzb);
        if (zzxw != null) {
            for (zzwc zzb2 : zzxw.zzb) {
                zzb2.zzb(str);
            }
            zzxw.zzg = true;
            zzxw.zzd = str;
            if (zzxw.zza <= 0) {
                this.zza.zzh(this.zzb);
            } else if (!zzxw.zzc) {
                this.zza.zzn(this.zzb);
            } else if (!zzag.zzd(zzxw.zze)) {
                zzxx.zze(this.zza, this.zzb);
            }
        }
    }

    public final void zzh(Status status) {
        zzxx.zza.mo65852e(C25541a.m63882l("SMS verification code request failed: ", CommonStatusCodes.getStatusCodeString(status.getStatusCode()), " ", status.getStatusMessage()), new Object[0]);
        zzxw zzxw = (zzxw) this.zza.zzd.get(this.zzb);
        if (zzxw != null) {
            for (zzwc zzh : zzxw.zzb) {
                zzh.zzh(status);
            }
            this.zza.zzj(this.zzb);
        }
    }
}
