package com.google.android.gms.internal.mlkit_common;

import com.google.android.gms.common.internal.Objects;

public final class zziu {
    private final zziq zza;
    private final zzis zzb = null;
    private final zzis zzc = null;
    private final Boolean zzd = null;

    public /* synthetic */ zziu(zzir zzir, zzit zzit) {
        this.zza = zzir.zza;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zziu) && Objects.equal(this.zza, ((zziu) obj).zza) && Objects.equal((Object) null, (Object) null) && Objects.equal((Object) null, (Object) null) && Objects.equal((Object) null, (Object) null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, null, null, null);
    }

    @zzbi(zza = 1)
    public final zziq zza() {
        return this.zza;
    }
}
