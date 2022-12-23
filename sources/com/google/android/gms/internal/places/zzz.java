package com.google.android.gms.internal.places;

final class zzz extends zzag {
    private final int zzek;
    private final int zzel;

    public zzz(byte[] bArr, int i, int i2) {
        super(bArr);
        zzw.zzc(i, i + i2, bArr.length);
        this.zzek = i;
        this.zzel = i2;
    }

    public final int size() {
        return this.zzel;
    }

    public final int zzag() {
        return this.zzek;
    }

    public final void zzb(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zzen, zzag(), bArr, 0, i3);
    }

    public final byte zzi(int i) {
        int size = size();
        if (((size - (i + 1)) | i) >= 0) {
            return this.zzen[this.zzek + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(C13715c.m34241g(22, "Index < 0: ", i));
        }
        throw new ArrayIndexOutOfBoundsException(C13715c.m34243i(40, "Index > length: ", i, ", ", size));
    }

    public final byte zzj(int i) {
        return this.zzen[this.zzek + i];
    }
}
