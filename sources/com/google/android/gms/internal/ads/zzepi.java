package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class zzepi implements zzetb {
    private final zzeyc zza;

    public zzepi(zzeyc zzeyc) {
        this.zza = zzeyc;
    }

    public final int zza() {
        return 15;
    }

    public final zzfvj zzb() {
        zzeyc zzeyc = this.zza;
        zzeph zzeph = null;
        if (!(zzeyc == null || zzeyc.zza() == null || zzeyc.zza().isEmpty())) {
            zzeph = new zzeph(this);
        }
        return zzfva.zzi(zzeph);
    }

    public final /* synthetic */ void zzc(Bundle bundle) {
        bundle.putString("key_schema", this.zza.zza());
    }
}
