package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;

public final class zzesm implements zzetb {
    private final zzcdn zza;
    private final zzfvk zzb;
    private final Context zzc;

    public zzesm(zzcdn zzcdn, zzfvk zzfvk, Context context) {
        this.zza = zzcdn;
        this.zzb = zzfvk;
        this.zzc = context;
    }

    public final int zza() {
        return 34;
    }

    public final zzfvj zzb() {
        return this.zzb.zzb(new zzesl(this));
    }

    public final /* synthetic */ zzesn zzc() throws Exception {
        String str;
        String str2;
        String str3;
        String str4;
        Long l;
        if (!this.zza.zzu(this.zzc)) {
            return new zzesn((String) null, (String) null, (String) null, (String) null, (Long) null);
        }
        String zze = this.zza.zze(this.zzc);
        if (zze == null) {
            str = "";
        } else {
            str = zze;
        }
        String zzc2 = this.zza.zzc(this.zzc);
        if (zzc2 == null) {
            str2 = "";
        } else {
            str2 = zzc2;
        }
        String zza2 = this.zza.zza(this.zzc);
        if (zza2 == null) {
            str3 = "";
        } else {
            str3 = zza2;
        }
        String zzb2 = this.zza.zzb(this.zzc);
        if (zzb2 == null) {
            str4 = "";
        } else {
            str4 = zzb2;
        }
        if ("TIME_OUT".equals(str2)) {
            l = (Long) zzay.zzc().zzb(zzbhy.zzad);
        } else {
            l = null;
        }
        return new zzesn(str, str2, str3, str4, l);
    }
}
