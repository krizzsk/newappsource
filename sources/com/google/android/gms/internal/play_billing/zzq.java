package com.google.android.gms.internal.play_billing;

final class zzq<E> extends zzp<E> {
    public static final zzp<Object> zza = new zzq(new Object[0], 0);
    public final transient Object[] zzb;

    public zzq(Object[] objArr, int i) {
        this.zzb = objArr;
    }

    public final E get(int i) {
        zzj.zza(i, 0, "index");
        return this.zzb[i];
    }

    public final int size() {
        return 0;
    }

    public final int zza(Object[] objArr, int i) {
        System.arraycopy(this.zzb, 0, objArr, 0, 0);
        return 0;
    }

    public final int zzb() {
        return 0;
    }

    public final int zzc() {
        return 0;
    }

    public final Object[] zze() {
        return this.zzb;
    }
}
