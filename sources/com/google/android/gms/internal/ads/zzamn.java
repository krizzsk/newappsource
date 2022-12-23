package com.google.android.gms.internal.ads;

import android.util.Base64;

public final class zzamn {
    public static String zza(byte[] bArr, boolean z) {
        return Base64.encodeToString(bArr, true != z ? 2 : 11);
    }

    public static byte[] zzb(String str, boolean z) throws IllegalArgumentException {
        int i;
        String str2;
        if (true != z) {
            i = 2;
        } else {
            i = 11;
        }
        byte[] decode = Base64.decode(str, i);
        if (decode.length != 0 || str.length() <= 0) {
            return decode;
        }
        if (str.length() != 0) {
            str2 = "Unable to decode ".concat(str);
        } else {
            str2 = new String("Unable to decode ");
        }
        throw new IllegalArgumentException(str2);
    }
}
