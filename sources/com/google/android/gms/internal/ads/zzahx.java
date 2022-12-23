package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;

final class zzahx {
    public static Pair zza(zzyt zzyt) throws IOException {
        zzyt.zzj();
        zzahw zzd = zzd(1684108385, zzyt, new zzdy(8));
        ((zzym) zzyt).zzo(8, false);
        return Pair.create(Long.valueOf(zzyt.zzf()), Long.valueOf(zzd.zzb));
    }

    public static zzahv zzb(zzyt zzyt) throws IOException {
        boolean z;
        byte[] bArr;
        zzdy zzdy = new zzdy(16);
        zzahw zzd = zzd(1718449184, zzyt, zzdy);
        if (zzd.zzb >= 16) {
            z = true;
        } else {
            z = false;
        }
        zzcw.zzf(z);
        zzym zzym = (zzym) zzyt;
        zzym.zzm(zzdy.zzH(), 0, 16, false);
        zzdy.zzF(0);
        int zzi = zzdy.zzi();
        int zzi2 = zzdy.zzi();
        int zzh = zzdy.zzh();
        int zzh2 = zzdy.zzh();
        int zzi3 = zzdy.zzi();
        int zzi4 = zzdy.zzi();
        int i = ((int) zzd.zzb) - 16;
        if (i > 0) {
            bArr = new byte[i];
            zzym.zzm(bArr, 0, i, false);
        } else {
            bArr = zzeg.zzf;
        }
        byte[] bArr2 = bArr;
        ((zzym) zzyt).zzo((int) (zzyt.zze() - zzyt.zzf()), false);
        return new zzahv(zzi, zzi2, zzh, zzh2, zzi3, zzi4, bArr2);
    }

    public static boolean zzc(zzyt zzyt) throws IOException {
        zzdy zzdy = new zzdy(8);
        int i = zzahw.zza(zzyt, zzdy).zza;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        ((zzym) zzyt).zzm(zzdy.zzH(), 0, 4, false);
        zzdy.zzF(0);
        if (zzdy.zze() != 1463899717) {
            return false;
        }
        return true;
    }

    private static zzahw zzd(int i, zzyt zzyt, zzdy zzdy) throws IOException {
        zzahw zza = zzahw.zza(zzyt, zzdy);
        while (zza.zza != i) {
            long j = zza.zzb + 8;
            if (j <= 2147483647L) {
                ((zzym) zzyt).zzo((int) j, false);
                zza = zzahw.zza(zzyt, zzdy);
            } else {
                int i2 = zza.zza;
                throw zzbp.zzc("Chunk is too large (~2GB+) to skip; id: " + i2);
            }
        }
        return zza;
    }
}
