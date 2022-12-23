package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.internal.Objects;

final class zzgt {
    private final String zza;
    private final long zzb;

    public zzgt(String str, long j) {
        this.zza = str;
        this.zzb = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzgt) {
            zzgt zzgt = (zzgt) obj;
            if (!Objects.equal(this.zza, zzgt.zza) || !Objects.equal(Long.valueOf(this.zzb), Long.valueOf(zzgt.zzb))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, Long.valueOf(this.zzb));
    }

    public final String zza() {
        return this.zza;
    }
}
