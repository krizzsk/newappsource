package com.google.android.gms.measurement.internal;

final class zzjc extends zzap {
    public final /* synthetic */ zzjs zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzjc(zzjs zzjs, zzgt zzgt) {
        super(zzgt);
        this.zza = zzjs;
    }

    public final void zzc() {
        zzjs zzjs = this.zza;
        zzjs.zzg();
        if (zzjs.zzL()) {
            zzjs.zzs.zzay().zzj().zza("Inactivity, disconnecting from the service");
            zzjs.zzs();
        }
    }
}
