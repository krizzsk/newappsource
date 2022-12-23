package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;

final class zzafh extends zzafl {
    private static final byte[] zza = {79, 112, 117, 115, 72, 101, 97, 100};
    private static final byte[] zzb = {79, 112, 117, 115, 84, 97, 103, 115};

    public static boolean zzd(zzdy zzdy) {
        return zzk(zzdy, zza);
    }

    private static boolean zzk(zzdy zzdy, byte[] bArr) {
        if (zzdy.zza() < 8) {
            return false;
        }
        int zzc = zzdy.zzc();
        byte[] bArr2 = new byte[8];
        zzdy.zzB(bArr2, 0, 8);
        zzdy.zzF(zzc);
        return Arrays.equals(bArr2, bArr);
    }

    public final long zza(zzdy zzdy) {
        int i;
        byte[] zzH = zzdy.zzH();
        byte b = zzH[0] & 255;
        byte b2 = b & 3;
        byte b3 = 2;
        if (b2 == 0) {
            b3 = 1;
        } else if (!(b2 == 1 || b2 == 2)) {
            b3 = zzH[1] & 63;
        }
        int i2 = b >> 3;
        int i3 = i2 & 3;
        if (i2 >= 16) {
            i = 2500 << i3;
        } else if (i2 >= 12) {
            i = 10000 << (i3 & 1);
        } else if (i3 == 3) {
            i = 60000;
        } else {
            i = 10000 << i3;
        }
        return zzg(((long) b3) * ((long) i));
    }

    public final boolean zzc(zzdy zzdy, long j, zzafi zzafi) throws zzbp {
        boolean z = false;
        if (zzk(zzdy, zza)) {
            byte[] copyOf = Arrays.copyOf(zzdy.zzH(), zzdy.zzd());
            byte b = copyOf[9] & 255;
            List zza2 = zzzq.zza(copyOf);
            if (zzafi.zza == null) {
                z = true;
            }
            zzcw.zzf(z);
            zzab zzab = new zzab();
            zzab.zzS("audio/opus");
            zzab.zzw(b);
            zzab.zzT(48000);
            zzab.zzI(zza2);
            zzafi.zza = zzab.zzY();
            return true;
        } else if (zzk(zzdy, zzb)) {
            zzcw.zzb(zzafi.zza);
            zzdy.zzG(8);
            zzbl zzb2 = zzaaf.zzb(zzfrh.zzn(zzaaf.zzc(zzdy, false, false).zzb));
            if (zzb2 == null) {
                return true;
            }
            zzab zzb3 = zzafi.zza.zzb();
            zzb3.zzM(zzb2.zzd(zzafi.zza.zzk));
            zzafi.zza = zzb3.zzY();
            return true;
        } else {
            zzcw.zzb(zzafi.zza);
            return false;
        }
    }
}
