package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;
import com.google.android.gms.safetynet.SafetyNetStatusCodes;

public final class zzayz {
    private static final byte[] zza = {0, 0, 0, 1};
    private static final int[] zzb = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, SafetyNetStatusCodes.SAFE_BROWSING_UNSUPPORTED_THREAT_TYPES, 11025, ConnectionsStatusCodes.STATUS_NETWORK_NOT_CONNECTED, 7350};
    private static final int[] zzc = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static Pair zza(byte[] bArr) {
        boolean z;
        zzazf zzazf = new zzazf(bArr, bArr.length);
        int zzc2 = zzc(zzazf);
        int zzd = zzd(zzazf);
        int zza2 = zzazf.zza(4);
        if (zzc2 == 5 || zzc2 == 29) {
            zzd = zzd(zzazf);
            if (zzc(zzazf) == 22) {
                zza2 = zzazf.zza(4);
            }
        }
        int i = zzc[zza2];
        if (i != -1) {
            z = true;
        } else {
            z = false;
        }
        zzayy.zzc(z);
        return Pair.create(Integer.valueOf(zzd), Integer.valueOf(i));
    }

    public static byte[] zzb(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[(i2 + 4)];
        System.arraycopy(zza, 0, bArr2, 0, 4);
        System.arraycopy(bArr, i, bArr2, 4, i2);
        return bArr2;
    }

    private static int zzc(zzazf zzazf) {
        int zza2 = zzazf.zza(5);
        if (zza2 == 31) {
            return zzazf.zza(6) + 32;
        }
        return zza2;
    }

    private static int zzd(zzazf zzazf) {
        boolean z;
        int zza2 = zzazf.zza(4);
        if (zza2 == 15) {
            return zzazf.zza(24);
        }
        if (zza2 < 13) {
            z = true;
        } else {
            z = false;
        }
        zzayy.zzc(z);
        return zzb[zza2];
    }
}
