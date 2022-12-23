package com.google.android.gms.internal.ads;

import java.io.IOException;

final class zzaak implements zzyh {
    private final zzzf zza;
    private final int zzb;
    private final zzza zzc = new zzza();

    public /* synthetic */ zzaak(zzzf zzzf, int i, zzaaj zzaaj) {
        this.zza = zzzf;
        this.zzb = i;
    }

    private final long zzc(zzyt zzyt) throws IOException {
        zzyt zzyt2 = zzyt;
        while (zzyt.zze() < zzyt.zzd() - 6) {
            zzzf zzzf = this.zza;
            int i = this.zzb;
            zzza zzza = this.zzc;
            long zze = zzyt.zze();
            byte[] bArr = new byte[2];
            zzym zzym = (zzym) zzyt2;
            zzym.zzm(bArr, 0, 2, false);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i) {
                zzyt.zzj();
                zzym.zzl((int) (zze - zzyt.zzf()), false);
            } else {
                zzdy zzdy = new zzdy(16);
                System.arraycopy(bArr, 0, zzdy.zzH(), 0, 2);
                zzdy.zzE(zzyw.zza(zzyt2, zzdy.zzH(), 2, 14));
                zzyt.zzj();
                zzym.zzl((int) (zze - zzyt.zzf()), false);
                if (zzzb.zzc(zzdy, zzzf, i, zzza)) {
                    break;
                }
            }
            zzym.zzl(1, false);
        }
        if (zzyt.zze() < zzyt.zzd() - 6) {
            return this.zzc.zza;
        }
        ((zzym) zzyt2).zzl((int) (zzyt.zzd() - zzyt.zze()), false);
        return this.zza.zzj;
    }

    public final zzyg zza(zzyt zzyt, long j) throws IOException {
        long zzf = zzyt.zzf();
        long zzc2 = zzc(zzyt);
        long zze = zzyt.zze();
        ((zzym) zzyt).zzl(Math.max(6, this.zza.zzc), false);
        long zzc3 = zzc(zzyt);
        long zze2 = zzyt.zze();
        if (zzc2 <= j && zzc3 > j) {
            return zzyg.zze(zze);
        }
        if (zzc3 <= j) {
            return zzyg.zzf(zzc3, zze2);
        }
        return zzyg.zzd(zzc2, zzf);
    }

    public final /* synthetic */ void zzb() {
    }
}
