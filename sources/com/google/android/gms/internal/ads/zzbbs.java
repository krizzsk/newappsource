package com.google.android.gms.internal.ads;

import com.appboy.support.ValidationUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

public final class zzbbs extends zzbbn {
    private MessageDigest zzb;

    public final byte[] zzb(String str) {
        byte[] bArr;
        byte[] bArr2;
        String[] split = str.split(" ");
        int length = split.length;
        int i = 4;
        if (length == 1) {
            int zza = zzbbr.zza(split[0]);
            ByteBuffer allocate = ByteBuffer.allocate(4);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(zza);
            bArr = allocate.array();
        } else {
            if (length < 5) {
                bArr2 = new byte[(length + length)];
                for (int i2 = 0; i2 < split.length; i2++) {
                    int zza2 = zzbbr.zza(split[i2]);
                    char c = (zza2 >> 16) ^ ((char) zza2);
                    byte b = (byte) c;
                    byte[] bArr3 = {b, (byte) (c >> 8)};
                    int i3 = i2 + i2;
                    bArr2[i3] = b;
                    bArr2[i3 + 1] = bArr3[1];
                }
            } else {
                bArr2 = new byte[length];
                for (int i4 = 0; i4 < split.length; i4++) {
                    int zza3 = zzbbr.zza(split[i4]);
                    bArr2[i4] = (byte) ((zza3 >> 24) ^ (((zza3 & ValidationUtils.APPBOY_STRING_MAX_LENGTH) ^ ((zza3 >> 8) & ValidationUtils.APPBOY_STRING_MAX_LENGTH)) ^ ((zza3 >> 16) & ValidationUtils.APPBOY_STRING_MAX_LENGTH)));
                }
            }
            bArr = bArr2;
        }
        this.zzb = zza();
        synchronized (this.zza) {
            MessageDigest messageDigest = this.zzb;
            if (messageDigest == null) {
                byte[] bArr4 = new byte[0];
                return bArr4;
            }
            messageDigest.reset();
            this.zzb.update(bArr);
            byte[] digest = this.zzb.digest();
            int length2 = digest.length;
            if (length2 <= 4) {
                i = length2;
            }
            byte[] bArr5 = new byte[i];
            System.arraycopy(digest, 0, bArr5, 0, i);
            return bArr5;
        }
    }
}