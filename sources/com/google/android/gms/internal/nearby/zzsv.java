package com.google.android.gms.internal.nearby;

final class zzsv extends zzsq {
    public static final zzsq zza = new zzsv(new Object[0], 0);
    public final transient Object[] zzb;
    private final transient int zzc;

    public zzsv(Object[] objArr, int i) {
        this.zzb = objArr;
        this.zzc = i;
    }

    public final Object get(int i) {
        zzsg.zza(i, this.zzc, "index");
        Object obj = this.zzb[i];
        obj.getClass();
        return obj;
    }

    public final int size() {
        return this.zzc;
    }

    public final int zza(Object[] objArr, int i) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.zzc);
        return this.zzc;
    }

    public final int zzb() {
        return this.zzc;
    }

    public final int zzc() {
        return 0;
    }

    public final boolean zzf() {
        return false;
    }

    public final Object[] zzg() {
        return this.zzb;
    }
}
