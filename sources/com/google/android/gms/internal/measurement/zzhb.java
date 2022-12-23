package com.google.android.gms.internal.measurement;

import android.content.Context;
import p001a0.C0017h;

final class zzhb extends zzhy {
    private final Context zza;
    private final zzih zzb;

    public zzhb(Context context, zzih zzih) {
        if (context != null) {
            this.zza = context;
            this.zzb = zzih;
            return;
        }
        throw new NullPointerException("Null context");
    }

    public final boolean equals(Object obj) {
        zzih zzih;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzhy) {
            zzhy zzhy = (zzhy) obj;
            if (!this.zza.equals(zzhy.zza()) || ((zzih = this.zzb) != null ? !zzih.equals(zzhy.zzb()) : zzhy.zzb() != null)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.zza.hashCode() ^ 1000003) * 1000003;
        zzih zzih = this.zzb;
        if (zzih == null) {
            i = 0;
        } else {
            i = zzih.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        return C0017h.m56M("FlagsContext{context=", this.zza.toString(), ", hermeticFileOverrides=", String.valueOf(this.zzb), "}");
    }

    public final Context zza() {
        return this.zza;
    }

    public final zzih zzb() {
        return this.zzb;
    }
}
