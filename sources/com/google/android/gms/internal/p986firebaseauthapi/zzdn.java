package com.google.android.gms.internal.p986firebaseauthapi;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdn */
abstract class zzdn {
    public int[] zza;
    private final int zzb;

    public zzdn(byte[] bArr, int i) throws InvalidKeyException {
        if (bArr.length == 32) {
            this.zza = zzdj.zzd(bArr);
            this.zzb = i;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    public abstract int zza();

    public abstract int[] zzb(int[] iArr, int i);

    public final ByteBuffer zzc(byte[] bArr, int i) {
        int[] zzb2 = zzb(zzdj.zzd(bArr), i);
        int[] iArr = (int[]) zzb2.clone();
        zzdj.zzc(iArr);
        for (int i2 = 0; i2 < 16; i2++) {
            zzb2[i2] = zzb2[i2] + iArr[i2];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(zzb2, 0, 16);
        return order;
    }

    public final byte[] zzd(byte[] bArr, ByteBuffer byteBuffer) throws GeneralSecurityException {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        if (bArr.length == zza()) {
            int remaining = byteBuffer.remaining();
            int i = (remaining / 64) + 1;
            for (int i2 = 0; i2 < i; i2++) {
                ByteBuffer zzc = zzc(bArr, this.zzb + i2);
                if (i2 == i - 1) {
                    zzor.zza(allocate, byteBuffer, zzc, remaining % 64);
                } else {
                    zzor.zza(allocate, byteBuffer, zzc, 64);
                }
            }
            return allocate.array();
        }
        StringBuilder k = C13555b.m33972k("The nonce length (in bytes) must be ");
        k.append(zza());
        throw new GeneralSecurityException(k.toString());
    }
}
