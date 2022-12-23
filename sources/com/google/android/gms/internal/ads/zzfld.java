package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.internal.ShowFirstParty;

@ShowFirstParty
public final class zzfld {
    private final Context zza;
    private final Looper zzb;

    public zzfld(Context context, Looper looper) {
        this.zza = context;
        this.zzb = looper;
    }

    public final void zza(String str) {
        zzflr zza2 = zzflt.zza();
        zza2.zza(this.zza.getPackageName());
        zza2.zzc(2);
        zzflo zza3 = zzflp.zza();
        zza3.zza(str);
        zza3.zzb(2);
        zza2.zzb(zza3);
        new zzfle(this.zza, this.zzb, (zzflt) zza2.zzaj()).zza();
    }
}
