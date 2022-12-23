package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;

public abstract class zzbb implements Serializable, Iterable<Byte> {
    public static final zzbb zzfi = new zzbi(zzci.zzkt);
    private static final zzbf zzfj = (zzaw.zzx() ? new zzbj((zzbc) null) : new zzbd((zzbc) null));
    private int zzfk = 0;

    public static int zzb(int i, int i2, int i3) {
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

    public static zzbb zzb(byte[] bArr, int i, int i2) {
        return new zzbi(zzfj.zzc(bArr, i, i2));
    }

    public static zzbb zzf(String str) {
        return new zzbi(str.getBytes(zzci.UTF_8));
    }

    public static zzbg zzk(int i) {
        return new zzbg(i, (zzbc) null);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.zzfk;
        if (i == 0) {
            int size = size();
            i = zza(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.zzfk = i;
        }
        return i;
    }

    public /* synthetic */ Iterator iterator() {
        return new zzbc(this);
    }

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size())});
    }

    public abstract int zza(int i, int i2, int i3);

    public abstract zzbb zza(int i, int i2);

    public abstract String zza(Charset charset);

    public abstract void zza(zzba zzba) throws IOException;

    public abstract boolean zzaa();

    public final int zzab() {
        return this.zzfk;
    }

    public abstract byte zzj(int i);

    public final String zzz() {
        return size() == 0 ? "" : zza(zzci.UTF_8);
    }
}
