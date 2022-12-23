package com.google.android.gms.internal.mlkit_vision_face;

final class zzca<E> extends zzbl<E> {
    public static final zzbl<Object> zza = new zzca(new Object[0], 0);
    public final transient Object[] zzb;
    private final transient int zzc;

    public zzca(Object[] objArr, int i) {
        this.zzb = objArr;
        this.zzc = i;
    }

    public final E get(int i) {
        zzaa.zzb(i, this.zzc, "index");
        return this.zzb[i];
    }

    public final int size() {
        return this.zzc;
    }

    public final Object[] zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return 0;
    }

    public final int zzd() {
        return this.zzc;
    }

    public final int zze(Object[] objArr, int i) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.zzc);
        return this.zzc;
    }
}
