package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

final class zzpz {
    private long zza;
    private long zzb;
    private boolean zzc;

    private final long zzd(long j) {
        return Math.max(0, ((this.zzb - 529) * 1000000) / j) + this.zza;
    }

    public final long zza(zzad zzad) {
        return zzd((long) zzad.zzA);
    }

    public final long zzb(zzad zzad, zzgc zzgc) {
        if (this.zzb == 0) {
            this.zza = zzgc.zzd;
        }
        if (this.zzc) {
            return zzgc.zzd;
        }
        ByteBuffer byteBuffer = zzgc.zzb;
        byteBuffer.getClass();
        byte b = 0;
        for (int i = 0; i < 4; i++) {
            b = (b << 8) | (byteBuffer.get(i) & 255);
        }
        int zzc2 = zzzm.zzc(b);
        if (zzc2 == -1) {
            this.zzc = true;
            this.zzb = 0;
            long j = zzgc.zzd;
            this.zza = j;
            return j;
        }
        long zzd = zzd((long) zzad.zzA);
        this.zzb += (long) zzc2;
        return zzd;
    }

    public final void zzc() {
        this.zza = 0;
        this.zzb = 0;
        this.zzc = false;
    }
}
