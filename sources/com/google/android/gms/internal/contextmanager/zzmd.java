package com.google.android.gms.internal.contextmanager;

import com.google.android.gms.internal.contextmanager.zznn;

public final class zzmd<ContainingType extends zznn, Type> extends zzln<ContainingType, Type> {
    public final ContainingType zza;
    public final Type zzb;
    public final zznn zzc;
    public final zzmc zzd;

    public zzmd(ContainingType containingtype, Type type, zznn zznn, zzmc zzmc, Class cls) {
        if (containingtype == null) {
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        } else if (zzmc.zzb == zzpd.MESSAGE && zznn == null) {
            throw new IllegalArgumentException("Null messageDefaultInstance");
        } else {
            this.zza = containingtype;
            this.zzb = type;
            this.zzc = zznn;
            this.zzd = zzmc;
        }
    }
}
