package com.google.android.gms.internal.ads;

final class zzaea implements zzady {
    private final int zza;
    private final int zzb;
    private final zzdy zzc;

    public zzaea(zzadv zzadv, zzad zzad) {
        zzdy zzdy = zzadv.zza;
        this.zzc = zzdy;
        zzdy.zzF(12);
        int zzn = zzdy.zzn();
        if ("audio/raw".equals(zzad.zzm)) {
            int zzo = zzeg.zzo(zzad.zzB, zzad.zzz);
            if (zzn == 0 || zzn % zzo != 0) {
                zzn = zzo;
            }
        }
        this.zza = zzn == 0 ? -1 : zzn;
        this.zzb = zzdy.zzn();
    }

    public final int zza() {
        return this.zza;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        int i = this.zza;
        return i == -1 ? this.zzc.zzn() : i;
    }
}
