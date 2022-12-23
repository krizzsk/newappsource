package com.google.android.gms.internal.places;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;

public abstract class zzw implements Serializable, Iterable<Byte> {
    public static final zzw zzeg = new zzag(zzbd.zziz);
    private static final zzac zzeh;
    private static final Comparator<zzw> zzej = new zzy();
    private int zzei = 0;

    static {
        zzac zzac;
        if (zzp.zzy()) {
            zzac = new zzaf((zzv) null);
        } else {
            zzac = new zzaa((zzv) null);
        }
        zzeh = zzac;
    }

    /* access modifiers changed from: private */
    public static int zzb(byte b) {
        return b & 255;
    }

    public static zzw zzc(byte[] bArr, int i, int i2) {
        zzc(i, i + i2, bArr.length);
        return new zzag(zzeh.zzd(bArr, i, i2));
    }

    public static zzw zzi(String str) {
        return new zzag(str.getBytes(zzbd.UTF_8));
    }

    public static zzae zzk(int i) {
        return new zzae(i, (zzv) null);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.zzei;
        if (i == 0) {
            int size = size();
            i = zzb(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.zzei = i;
        }
        return i;
    }

    public /* synthetic */ Iterator iterator() {
        return new zzv(this);
    }

    public abstract int size();

    public final byte[] toByteArray() {
        int size = size();
        if (size == 0) {
            return zzbd.zziz;
        }
        byte[] bArr = new byte[size];
        zzb(bArr, 0, 0, size);
        return bArr;
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size())});
    }

    public final String zzad() {
        Charset charset = zzbd.UTF_8;
        if (size() == 0) {
            return "";
        }
        return zzb(charset);
    }

    public abstract boolean zzae();

    public final int zzaf() {
        return this.zzei;
    }

    public abstract int zzb(int i, int i2, int i3);

    public abstract zzw zzb(int i, int i2);

    public abstract String zzb(Charset charset);

    public abstract void zzb(zzt zzt) throws IOException;

    public abstract void zzb(byte[] bArr, int i, int i2, int i3);

    public abstract byte zzi(int i);

    public abstract byte zzj(int i);

    public static int zzc(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(C13715c.m34242h(32, "Beginning index: ", i, " < 0"));
        } else if (i2 < i) {
            throw new IndexOutOfBoundsException(C13715c.m34243i(66, "Beginning index larger than ending index: ", i, ", ", i2));
        } else {
            throw new IndexOutOfBoundsException(C13715c.m34243i(37, "End index: ", i2, " >= ", i3));
        }
    }
}
