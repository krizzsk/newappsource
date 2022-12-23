package com.google.android.gms.internal.nearby;

public final class zzsr extends zzsl {
    public zzsr() {
        super(4);
    }

    public final zzsr zzb(Object obj) {
        obj.getClass();
        super.zza(obj);
        return this;
    }

    public final zzss zzc() {
        int i = this.zzb;
        if (i == 0) {
            return zzsw.zza;
        }
        if (i != 1) {
            zzss zzj = zzss.zzl(i, this.zza);
            this.zzb = zzj.size();
            this.zzc = true;
            return zzj;
        }
        Object obj = this.zza[0];
        obj.getClass();
        return new zzsx(obj);
    }
}
