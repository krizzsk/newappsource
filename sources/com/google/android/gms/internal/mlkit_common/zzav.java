package com.google.android.gms.internal.mlkit_common;

final class zzav extends zzam {
    private final transient Object[] zza;
    private final transient int zzb;
    private final transient int zzc;

    public zzav(Object[] objArr, int i, int i2) {
        this.zza = objArr;
        this.zzb = i;
        this.zzc = i2;
    }

    public final Object get(int i) {
        zzab.zza(i, this.zzc, "index");
        Object obj = this.zza[i + i + this.zzb];
        obj.getClass();
        return obj;
    }

    public final int size() {
        return this.zzc;
    }
}
