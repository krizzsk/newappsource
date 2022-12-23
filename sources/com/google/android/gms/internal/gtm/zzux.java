package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzwk;

public final class zzux<ContainingType extends zzwk, Type> extends zzuh<ContainingType, Type> {
    public final ContainingType zza;
    public final Type zzb;
    public final zzwk zzc;
    public final zzuw zzd;

    public zzux(ContainingType containingtype, Type type, zzwk zzwk, zzuw zzuw, Class cls) {
        if (containingtype == null) {
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        } else if (zzuw.zzc == zzye.MESSAGE && zzwk == null) {
            throw new IllegalArgumentException("Null messageDefaultInstance");
        } else {
            this.zza = containingtype;
            this.zzb = type;
            this.zzc = zzwk;
            this.zzd = zzuw;
        }
    }

    public final boolean zza() {
        boolean z = this.zzd.zzd;
        return false;
    }
}
