package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

final class zzha {
    public static /* synthetic */ void zza(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws zzen {
        if (!zze(b2)) {
            if ((((b2 + 112) + (b << 28)) >> 30) == 0 && !zze(b3) && !zze(b4)) {
                byte b5 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
                cArr[i] = (char) ((b5 >>> 10) + 55232);
                cArr[i + 1] = (char) ((b5 & 1023) + 56320);
                return;
            }
        }
        throw zzen.zzc();
    }

    public static /* synthetic */ void zzb(byte b, byte b2, char[] cArr, int i) throws zzen {
        if (b < -62 || zze(b2)) {
            throw zzen.zzc();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    public static /* synthetic */ void zzc(byte b, byte b2, byte b3, char[] cArr, int i) throws zzen {
        if (!zze(b2)) {
            if (b == -32) {
                if (b2 >= -96) {
                    b = -32;
                }
            }
            if (b == -19) {
                if (b2 < -96) {
                    b = -19;
                }
            }
            if (!zze(b3)) {
                cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
                return;
            }
        }
        throw zzen.zzc();
    }

    public static /* synthetic */ boolean zzd(byte b) {
        return b >= 0;
    }

    private static boolean zze(byte b) {
        return b > -65;
    }
}
