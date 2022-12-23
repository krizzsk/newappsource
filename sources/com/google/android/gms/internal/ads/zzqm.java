package com.google.android.gms.internal.ads;

public final /* synthetic */ class zzqm implements zzqx {
    public final /* synthetic */ zzad zza;

    public /* synthetic */ zzqm(zzad zzad) {
        this.zza = zzad;
    }

    public final int zza(Object obj) {
        zzad zzad = this.zza;
        zzqg zzqg = (zzqg) obj;
        int i = zzqy.zza;
        try {
            return !zzqg.zzd(zzad) ? 0 : 1;
        } catch (zzqs unused) {
            return -1;
        }
    }
}
