package com.google.android.gms.internal.icing;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

public abstract class zzcf implements Iterable<Byte>, Serializable {
    public static final zzcf zzb = new zzcd(zzdh.zzc);
    private static final Comparator<zzcf> zzc = new zzby();
    private static final zzce zzd = new zzce((zzbx) null);
    private int zza = 0;

    static {
        int i = zzbu.zza;
    }

    public static zzcf zzj(String str) {
        return new zzcd(str.getBytes(zzdh.zza));
    }

    public static int zzm(int i, int i2, int i3) {
        if (((i3 - i2) | i2) >= 0) {
            return i2;
        }
        throw new IndexOutOfBoundsException(C13715c.m34243i(37, "End index: ", i2, " >= ", i3));
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.zza;
        if (i == 0) {
            int zzc2 = zzc();
            i = zzi(zzc2, 0, zzc2);
            if (i == 0) {
                i = 1;
            }
            this.zza = i;
        }
        return i;
    }

    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return new zzbx(this);
    }

    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(zzc());
        if (zzc() <= 50) {
            str = zzfb.zza(this);
        } else {
            str = String.valueOf(zzfb.zza(zze(0, 47))).concat("...");
        }
        objArr[2] = str;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public abstract byte zza(int i);

    public abstract byte zzb(int i);

    public abstract int zzc();

    public abstract zzcf zze(int i, int i2);

    public abstract void zzf(zzbw zzbw) throws IOException;

    public abstract String zzg(Charset charset);

    public abstract boolean zzh();

    public abstract int zzi(int i, int i2, int i3);

    public final String zzk(Charset charset) {
        return zzc() == 0 ? "" : zzg(charset);
    }

    public final int zzl() {
        return this.zza;
    }
}
