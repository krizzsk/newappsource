package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Objects;

public final class zzcah extends zzcaj {
    private final String zza;
    private final int zzb;

    public zzcah(String str, int i) {
        this.zza = str;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzcah)) {
            zzcah zzcah = (zzcah) obj;
            if (!Objects.equal(this.zza, zzcah.zza) || !Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(zzcah.zzb))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zza;
    }
}
