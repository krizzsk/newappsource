package com.google.android.gms.internal.ads;

import android.text.TextUtils;

final class zzqq {
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;

    public zzqq(String str, boolean z, boolean z2) {
        this.zza = str;
        this.zzb = z;
        this.zzc = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == zzqq.class) {
            zzqq zzqq = (zzqq) obj;
            if (TextUtils.equals(this.zza, zzqq.zza) && this.zzb == zzqq.zzb && this.zzc == zzqq.zzc) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int d = C13715c.m34238d(this.zza, 31, 31);
        int i2 = 1237;
        if (true != this.zzb) {
            i = 1237;
        } else {
            i = 1231;
        }
        int i3 = (d + i) * 31;
        if (true == this.zzc) {
            i2 = 1231;
        }
        return i3 + i2;
    }
}
