package com.google.android.gms.measurement.internal;

import android.os.Bundle;

public final class zzep {
    public final String zza;
    public final String zzb;
    public final long zzc;
    public final Bundle zzd;

    public zzep(String str, String str2, Bundle bundle, long j) {
        this.zza = str;
        this.zzb = str2;
        this.zzd = bundle;
        this.zzc = j;
    }

    public static zzep zzb(zzaw zzaw) {
        return new zzep(zzaw.zza, zzaw.zzc, zzaw.zzb.zzc(), zzaw.zzd);
    }

    public final String toString() {
        String str = this.zzb;
        String str2 = this.zza;
        String obj = this.zzd.toString();
        StringBuilder h = C16759e.m42352h("origin=", str, ",name=", str2, ",params=");
        h.append(obj);
        return h.toString();
    }

    public final zzaw zza() {
        return new zzaw(this.zza, new zzau(new Bundle(this.zzd)), this.zzb, this.zzc);
    }
}
