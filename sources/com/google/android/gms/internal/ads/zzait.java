package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import p001a0.C0017h;

public final class zzait {
    private final String zza;
    private final String zzb;

    public zzait(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzait.class == obj.getClass()) {
            zzait zzait = (zzait) obj;
            if (!TextUtils.equals(this.zza, zzait.zza) || !TextUtils.equals(this.zzb, zzait.zzb)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode() + (this.zza.hashCode() * 31);
    }

    public final String toString() {
        return C0017h.m56M("Header[name=", this.zza, ",value=", this.zzb, "]");
    }

    public final String zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }
}
