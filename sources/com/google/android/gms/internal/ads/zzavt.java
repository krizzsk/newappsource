package com.google.android.gms.internal.ads;

import android.text.TextUtils;

final class zzavt {
    public final String zza;
    public final boolean zzb;

    public zzavt(String str, boolean z) {
        this.zza = str;
        this.zzb = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == zzavt.class) {
            zzavt zzavt = (zzavt) obj;
            if (!TextUtils.equals(this.zza, zzavt.zza) || this.zzb != zzavt.zzb) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        return (((str == null ? 0 : str.hashCode()) + 31) * 31) + (true != this.zzb ? 1237 : 1231);
    }
}
