package com.google.android.gms.internal.icing;

import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.List;

@ShowFirstParty
@VisibleForTesting
public final class zzr {
    private final String zza;
    private String zzb;
    private boolean zzc;
    private boolean zzd;
    private final List<zzm> zze = new ArrayList();
    private String zzf;

    public zzr(String str) {
        this.zza = str;
    }

    public final zzr zza(String str) {
        this.zzb = "blob";
        return this;
    }

    public final zzr zzb(boolean z) {
        this.zzc = true;
        return this;
    }

    public final zzr zzc(boolean z) {
        this.zzd = true;
        return this;
    }

    public final zzr zzd(String str) {
        this.zzf = str;
        return this;
    }

    public final zzs zze() {
        String str = this.zza;
        String str2 = this.zzb;
        boolean z = this.zzc;
        boolean z2 = this.zzd;
        List<zzm> list = this.zze;
        return new zzs(str, str2, z, 1, z2, (String) null, (zzm[]) list.toArray(new zzm[list.size()]), this.zzf, (zzu) null);
    }
}
