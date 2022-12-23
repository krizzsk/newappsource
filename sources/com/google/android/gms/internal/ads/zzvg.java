package com.google.android.gms.internal.ads;

public final class zzvg {
    public final zzck zza;
    public final int[] zzb;

    public zzvg(zzck zzck, int[] iArr, int i) {
        if (iArr.length == 0) {
            zzdn.zza("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.zza = zzck;
        this.zzb = iArr;
    }
}
