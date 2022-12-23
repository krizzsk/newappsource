package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

public abstract class zzdb implements Iterable, Serializable {
    private static final Comparator zza = new zzcu();
    public static final zzdb zzb = new zzcz(zzel.zzd);
    private static final zzda zzd = new zzda((zzcs) null);
    private int zzc = 0;

    static {
        int i = zzcn.zza;
    }

    private static zzdb zzc(Iterator it, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", new Object[]{Integer.valueOf(i)}));
        } else if (i == 1) {
            return (zzdb) it.next();
        } else {
            int i2 = i >>> 1;
            zzdb zzc2 = zzc(it, i2);
            zzdb zzc3 = zzc(it, i - i2);
            if (Integer.MAX_VALUE - zzc2.zzd() >= zzc3.zzd()) {
                return zzga.zzA(zzc2, zzc3);
            }
            throw new IllegalArgumentException(C13715c.m34243i(53, "ByteString would be too long: ", zzc2.zzd(), "+", zzc3.zzd()));
        }
    }

    public static int zzo(int i, int i2, int i3) {
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

    public static zzdb zzr(byte[] bArr, int i, int i2) {
        zzo(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new zzcz(bArr2);
    }

    public static zzdb zzs(String str) {
        return new zzcz(str.getBytes(zzel.zzb));
    }

    public static zzdb zzt(InputStream inputStream) throws IOException {
        zzdb zzdb;
        ArrayList arrayList = new ArrayList();
        int i = 256;
        while (true) {
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                int read = inputStream.read(bArr, i2, i - i2);
                if (read == -1) {
                    break;
                }
                i2 += read;
            }
            if (i2 == 0) {
                zzdb = null;
            } else {
                zzdb = zzr(bArr, 0, i2);
            }
            if (zzdb == null) {
                break;
            }
            arrayList.add(zzdb);
            i = Math.min(i + i, 8192);
        }
        int size = arrayList.size();
        if (size == 0) {
            return zzb;
        }
        return zzc(arrayList.iterator(), size);
    }

    public static void zzw(int i, int i2) {
        if (((i2 - (i + 1)) | i) >= 0) {
            return;
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(C13715c.m34241g(22, "Index < 0: ", i));
        }
        throw new ArrayIndexOutOfBoundsException(C13715c.m34243i(40, "Index > length: ", i, ", ", i2));
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.zzc;
        if (i == 0) {
            int zzd2 = zzd();
            i = zzi(zzd2, 0, zzd2);
            if (i == 0) {
                i = 1;
            }
            this.zzc = i;
        }
        return i;
    }

    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(zzd());
        if (zzd() <= 50) {
            str = zzgn.zza(this);
        } else {
            str = zzgn.zza(zzk(0, 47)).concat("...");
        }
        objArr[2] = str;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public abstract byte zza(int i);

    public abstract byte zzb(int i);

    public abstract int zzd();

    public abstract void zze(byte[] bArr, int i, int i2, int i3);

    public abstract int zzf();

    public abstract boolean zzh();

    public abstract int zzi(int i, int i2, int i3);

    public abstract int zzj(int i, int i2, int i3);

    public abstract zzdb zzk(int i, int i2);

    public abstract String zzl(Charset charset);

    public abstract void zzm(zzcr zzcr) throws IOException;

    public abstract boolean zzn();

    public final int zzp() {
        return this.zzc;
    }

    /* renamed from: zzq */
    public zzcx iterator() {
        return new zzcs(this);
    }

    public final String zzu(Charset charset) {
        return zzd() == 0 ? "" : zzl(charset);
    }

    public final String zzv() {
        return zzu(zzel.zzb);
    }

    @Deprecated
    public final void zzx(byte[] bArr, int i, int i2, int i3) {
        zzo(0, i3, zzd());
        zzo(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            zze(bArr, 0, i2, i3);
        }
    }

    public final byte[] zzy() {
        int zzd2 = zzd();
        if (zzd2 == 0) {
            return zzel.zzd;
        }
        byte[] bArr = new byte[zzd2];
        zze(bArr, 0, 0, zzd2);
        return bArr;
    }
}
