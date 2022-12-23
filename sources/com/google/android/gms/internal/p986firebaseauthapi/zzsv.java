package com.google.android.gms.internal.p986firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsv */
final class zzsv implements zzxi {
    public final /* synthetic */ zzzq zza;
    public final /* synthetic */ zzyt zzb;
    public final /* synthetic */ zzwc zzc;
    public final /* synthetic */ zzza zzd;
    public final /* synthetic */ zzxh zze;
    public final /* synthetic */ zzuh zzf;

    public zzsv(zzuh zzuh, zzzq zzzq, zzyt zzyt, zzwc zzwc, zzza zzza, zzxh zzxh) {
        this.zzf = zzuh;
        this.zza = zzzq;
        this.zzb = zzyt;
        this.zzc = zzwc;
        this.zzd = zzza;
        this.zze = zzxh;
    }

    public final void zza(String str) {
        this.zze.zza(str);
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzzr zzzr = (zzzr) obj;
        if (this.zza.zzn("EMAIL")) {
            this.zzb.zzg((String) null);
        } else {
            zzzq zzzq = this.zza;
            if (zzzq.zzk() != null) {
                this.zzb.zzg(zzzq.zzk());
            }
        }
        if (this.zza.zzn("DISPLAY_NAME")) {
            this.zzb.zzf((String) null);
        } else {
            zzzq zzzq2 = this.zza;
            if (zzzq2.zzj() != null) {
                this.zzb.zzf(zzzq2.zzj());
            }
        }
        if (this.zza.zzn("PHOTO_URL")) {
            this.zzb.zzj((String) null);
        } else {
            zzzq zzzq3 = this.zza;
            if (zzzq3.zzm() != null) {
                this.zzb.zzj(zzzq3.zzm());
            }
        }
        if (!TextUtils.isEmpty(this.zza.zzl())) {
            this.zzb.zzi(Base64Utils.encode("redacted".getBytes()));
        }
        List zzf2 = zzzr.zzf();
        if (zzf2 == null) {
            zzf2 = new ArrayList();
        }
        this.zzb.zzk(zzf2);
        zzwc zzwc = this.zzc;
        zzza zzza = this.zzd;
        Preconditions.checkNotNull(zzza);
        Preconditions.checkNotNull(zzzr);
        String zzd2 = zzzr.zzd();
        String zze2 = zzzr.zze();
        if (!TextUtils.isEmpty(zzd2) && !TextUtils.isEmpty(zze2)) {
            zzza = new zzza(zze2, zzd2, Long.valueOf(zzzr.zzb()), zzza.zzg());
        }
        zzwc.zzi(zzza, this.zzb);
    }
}
