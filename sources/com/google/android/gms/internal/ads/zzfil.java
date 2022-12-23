package com.google.android.gms.internal.ads;

import android.view.View;

public abstract class zzfil {
    public static zzfil zza(zzfim zzfim, zzfin zzfin) {
        if (zzfij.zzb()) {
            return new zzfip(zzfim, zzfin);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }

    public abstract void zzb(View view, zzfir zzfir, String str);

    public abstract void zzc();

    public abstract void zzd(View view);

    public abstract void zze();
}
