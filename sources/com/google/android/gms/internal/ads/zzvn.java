package com.google.android.gms.internal.ads;

public abstract class zzvn {
    private zzvm zza;
    private zzvv zzb;

    public boolean zzh() {
        throw null;
    }

    public abstract zzvo zzj(zzjv[] zzjvArr, zztz zztz, zzsb zzsb, zzci zzci) throws zzgu;

    public abstract void zzk(Object obj);

    public final zzvv zzl() {
        zzvv zzvv = this.zzb;
        zzvv.getClass();
        return zzvv;
    }

    public final void zzm(zzvm zzvm, zzvv zzvv) {
        this.zza = zzvm;
        this.zzb = zzvv;
    }

    public final void zzn() {
        zzvm zzvm = this.zza;
        if (zzvm != null) {
            zzvm.zzj();
        }
    }
}
