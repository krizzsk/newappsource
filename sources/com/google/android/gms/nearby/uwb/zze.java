package com.google.android.gms.nearby.uwb;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;

@ShowFirstParty
public final class zze implements Api.ApiOptions.HasOptions {
    private final String zza = null;
    private final int zzb;
    private final boolean zzc = false;

    public /* synthetic */ zze(int i, boolean z, String str, zzd zzd) {
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zze)) {
            return false;
        }
        zze zze = (zze) obj;
        boolean z = zze.zzc;
        if (!Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(zze.zzb)) || !Objects.equal((Object) null, (Object) null)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zzb), Boolean.FALSE, null);
    }

    public final int zza() {
        return this.zzb;
    }
}
