package com.google.android.gms.internal.ads;

final class zzbnc extends zzbmd {
    public final /* synthetic */ zzbnf zza;

    public /* synthetic */ zzbnc(zzbnf zzbnf, zzbnb zzbnb) {
        this.zza = zzbnf;
    }

    public final void zze(zzblu zzblu, String str) {
        zzbnf zzbnf = this.zza;
        if (zzbnf.zzb != null) {
            zzbnf.zzb.onCustomClick(zzbnf.zzf(zzblu), str);
        }
    }
}
