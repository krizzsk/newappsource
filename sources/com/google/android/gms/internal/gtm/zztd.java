package com.google.android.gms.internal.gtm;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

public abstract class zztd implements Iterable<Byte>, Serializable {
    private static final Comparator<zztd> zza = new zzsv();
    public static final zztd zzb = new zzta(zzvi.zzc);
    private static final zztc zzd = new zztc((zztb) null);
    private int zzc = 0;

    static {
        int i = zzsk.zza;
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

    public static zztd zzm(byte[] bArr) {
        return zzn(bArr, 0, bArr.length);
    }

    public static zztd zzn(byte[] bArr, int i, int i2) {
        zzk(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new zzta(bArr2);
    }

    public static zztd zzo(String str) {
        return new zzta(str.getBytes(zzvi.zza));
    }

    public static zztd zzp(byte[] bArr) {
        return new zzta(bArr);
    }

    public static zztd zzq(byte[] bArr, int i, int i2) {
        return new zzsx(bArr, i, i2);
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
        return new zzst(this);
    }

    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(zzd());
        if (zzd() <= 50) {
            str = zzxm.zza(this);
        } else {
            str = String.valueOf(zzxm.zza(zzg(0, 47))).concat("...");
        }
        objArr[2] = str;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public abstract byte zza(int i);

    public abstract byte zzb(int i);

    public abstract int zzd();

    public abstract void zze(byte[] bArr, int i, int i2, int i3);

    public abstract int zzf(int i, int i2, int i3);

    public abstract zztd zzg(int i, int i2);

    public abstract String zzh(Charset charset);

    public abstract void zzi(zzss zzss) throws IOException;

    public abstract boolean zzj();

    public final int zzl() {
        return this.zzc;
    }

    public final String zzr(Charset charset) {
        return zzd() == 0 ? "" : zzh(charset);
    }
}
