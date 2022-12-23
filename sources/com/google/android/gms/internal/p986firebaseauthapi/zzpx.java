package com.google.android.gms.internal.p986firebaseauthapi;

import java.util.Arrays;
import p358af.C13437d;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzpx */
public final class zzpx {
    private final byte[] zza;

    private zzpx(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.zza = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i2);
    }

    public static zzpx zzb(byte[] bArr) {
        if (bArr != null) {
            return new zzpx(bArr, 0, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzpx)) {
            return false;
        }
        return Arrays.equals(((zzpx) obj).zza, this.zza);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final String toString() {
        return C13437d.m33706k("Bytes(", zzpl.zza(this.zza), ")");
    }

    public final int zza() {
        return this.zza.length;
    }

    public final byte[] zzc() {
        byte[] bArr = this.zza;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }
}
