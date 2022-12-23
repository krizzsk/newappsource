package com.google.android.gms.internal.play_billing;

final class zzn<E> extends zzl<E> {
    private final zzp<E> zza;

    public zzn(zzp<E> zzp, int i) {
        super(zzp.size(), i);
        this.zza = zzp;
    }

    public final E zza(int i) {
        return this.zza.get(i);
    }
}
