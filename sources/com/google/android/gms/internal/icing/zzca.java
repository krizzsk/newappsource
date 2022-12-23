package com.google.android.gms.internal.icing;

final class zzca extends zzcd {
    private final int zzc;

    public zzca(byte[] bArr, int i, int i2) {
        super(bArr);
        zzcf.zzm(0, i2, bArr.length);
        this.zzc = i2;
    }

    public final byte zza(int i) {
        int i2 = this.zzc;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.zza[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(C13715c.m34241g(22, "Index < 0: ", i));
        }
        throw new ArrayIndexOutOfBoundsException(C13715c.m34243i(40, "Index > length: ", i, ", ", i2));
    }

    public final byte zzb(int i) {
        return this.zza[i];
    }

    public final int zzc() {
        return this.zzc;
    }

    public final int zzd() {
        return 0;
    }
}
