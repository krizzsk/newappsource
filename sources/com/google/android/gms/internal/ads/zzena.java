package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import p090g1.C4732a;

public final class zzena implements zzetb {
    private final Context zza;

    public zzena(Context context) {
        this.zza = context;
    }

    public final int zza() {
        return 2;
    }

    public final zzfvj zzb() {
        boolean z;
        if (!((Boolean) zzay.zzc().zzb(zzbhy.zzcq)).booleanValue()) {
            return zzfva.zzi((Object) null);
        }
        if (C4732a.checkSelfPermission(this.zza, "com.google.android.gms.permission.AD_ID") == 0) {
            z = true;
        } else {
            z = false;
        }
        return zzfva.zzi(new zzenb(z));
    }
}
