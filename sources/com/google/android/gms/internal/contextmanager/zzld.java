package com.google.android.gms.internal.contextmanager;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

public abstract class zzld implements Iterable<Byte>, Serializable {
    private static final Comparator<zzld> zza = new zzkw();
    public static final zzld zzb = new zzlb(zzmn.zzc);
    private static final zzlc zzd = new zzlc((zzku) null);
    private int zzc = 0;

    static {
        int i = zzkp.zza;
    }

    public static int zzk(int i, int i2, int i3) {
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

    public static zzld zzm(byte[] bArr) {
        return zzn(bArr, 0, bArr.length);
    }

    public static zzld zzn(byte[] bArr, int i, int i2) {
        zzk(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new zzlb(bArr2);
    }

    public static zzld zzo(String str) {
        return new zzlb(str.getBytes(zzmn.zza));
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.zzc;
        if (i == 0) {
            int zzd2 = zzd();
            i = zzf(zzd2, 0, zzd2);
            if (i == 0) {
                i = 1;
            }
            this.zzc = i;
        }
        return i;
    }

    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return new zzku(this);
    }

    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(zzd());
        if (zzd() <= 50) {
            str = zzol.zza(this);
        } else {
            str = String.valueOf(zzol.zza(zzg(0, 47))).concat("...");
        }
        objArr[2] = str;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public abstract byte zza(int i);

    public abstract byte zzb(int i);

    public abstract int zzd();

    public abstract void zze(byte[] bArr, int i, int i2, int i3);

    public abstract int zzf(int i, int i2, int i3);

    public abstract zzld zzg(int i, int i2);

    public abstract String zzh(Charset charset);

    public abstract void zzi(zzkt zzkt) throws IOException;

    public abstract boolean zzj();

    public final int zzl() {
        return this.zzc;
    }

    public final String zzp(Charset charset) {
        return zzd() == 0 ? "" : zzh(charset);
    }

    public final byte[] zzq() {
        int zzd2 = zzd();
        if (zzd2 == 0) {
            return zzmn.zzc;
        }
        byte[] bArr = new byte[zzd2];
        zze(bArr, 0, 0, zzd2);
        return bArr;
    }
}
