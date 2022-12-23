package com.google.android.gms.internal.ads;

import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;

public final class zzez implements zzeq {
    private final zzfn zza = new zzfn();
    private zzft zzb;
    private String zzc;
    private int zzd = ConnectionsStatusCodes.STATUS_NETWORK_NOT_CONNECTED;
    private int zze = ConnectionsStatusCodes.STATUS_NETWORK_NOT_CONNECTED;
    private boolean zzf;

    public final zzez zzb(boolean z) {
        this.zzf = true;
        return this;
    }

    public final zzez zzc(int i) {
        this.zzd = i;
        return this;
    }

    public final zzez zzd(int i) {
        this.zze = i;
        return this;
    }

    public final zzez zze(zzft zzft) {
        this.zzb = zzft;
        return this;
    }

    public final zzez zzf(String str) {
        this.zzc = str;
        return this;
    }

    /* renamed from: zzg */
    public final zzfe zza() {
        zzfe zzfe = new zzfe(this.zzc, this.zzd, this.zze, this.zzf, this.zza, (zzfot) null, false, (zzfd) null);
        zzft zzft = this.zzb;
        if (zzft != null) {
            zzfe.zzf(zzft);
        }
        return zzfe;
    }
}
