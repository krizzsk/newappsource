package com.google.android.gms.nearby.messages.internal;

import java.util.Arrays;

public class zzc {
    private static final char[] zza = "0123456789abcdef".toCharArray();
    private final byte[] zzb;

    public zzc(byte[] bArr) {
        this.zzb = bArr;
    }

    public static String zzb(byte[] bArr) {
        StringBuilder sb = new StringBuilder(r1 + r1);
        for (byte b : bArr) {
            char[] cArr = zza;
            sb.append(cArr[(b >> 4) & 15]);
            sb.append(cArr[b & 15]);
        }
        return sb.toString();
    }

    public static byte[] zzd(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i + i;
            bArr[i] = (byte) (Character.digit(str.charAt(i2 + 1), 16) + (Character.digit(str.charAt(i2), 16) << 4));
        }
        return bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!obj.getClass().isAssignableFrom(getClass())) {
            return false;
        }
        return Arrays.equals(this.zzb, ((zzc) obj).zzb);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zzb);
    }

    public String toString() {
        return zzb(this.zzb);
    }

    public final String zza() {
        return zzb(this.zzb);
    }

    public final byte[] zzc() {
        return this.zzb;
    }
}
