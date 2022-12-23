package com.google.android.gms.internal.icing;

import android.content.Context;
import p001a0.C0017h;

final class zzbd extends zzbh {
    private final Context zza;
    private final zzbm zzb;

    public zzbd(Context context, zzbm zzbm) {
        if (context != null) {
            this.zza = context;
            this.zzb = zzbm;
            return;
        }
        throw new NullPointerException("Null context");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzbh) {
            zzbh zzbh = (zzbh) obj;
            if (!this.zza.equals(zzbh.zza()) || !this.zzb.equals(zzbh.zzb())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        String valueOf2 = String.valueOf(this.zzb);
        StringBuilder sb = new StringBuilder(valueOf.length() + 46 + valueOf2.length());
        C0017h.m61R(sb, "FlagsContext{context=", valueOf, ", hermeticFileOverrides=", valueOf2);
        sb.append("}");
        return sb.toString();
    }

    public final Context zza() {
        return this.zza;
    }

    public final zzbm zzb() {
        return this.zzb;
    }
}
