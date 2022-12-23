package com.google.android.gms.internal.p986firebaseauthapi;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabe */
public abstract class zzabe implements Iterable, Serializable {
    private static final Comparator zza = new zzaaw();
    public static final zzabe zzb = new zzabb(zzacn.zzd);
    private static final zzabd zzd = new zzabd((zzabc) null);
    private int zzc = 0;

    static {
        int i = zzaaq.zza;
    }

    public static int zzl(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(C25541a.m63878h("Beginning index: ", i, " < 0"));
        } else if (i2 < i) {
            throw new IndexOutOfBoundsException(C13715c.m34244j("Beginning index larger than ending index: ", i, ", ", i2));
        } else {
            throw new IndexOutOfBoundsException(C13715c.m34244j("End index: ", i2, " >= ", i3));
        }
    }

    public static zzabe zzn(byte[] bArr) {
        return zzo(bArr, 0, bArr.length);
    }

    public static zzabe zzo(byte[] bArr, int i, int i2) {
        zzl(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new zzabb(bArr2);
    }

    public static zzabe zzp(String str) {
        return new zzabb(str.getBytes(zzacn.zzb));
    }

    public static zzabe zzq(byte[] bArr) {
        return new zzabb(bArr);
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

    public final /* synthetic */ Iterator iterator() {
        return new zzaav(this);
    }

    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(zzd());
        if (zzd() <= 50) {
            str = zzaen.zza(this);
        } else {
            str = zzaen.zza(zzg(0, 47)).concat("...");
        }
        objArr[2] = str;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public abstract byte zza(int i);

    public abstract byte zzb(int i);

    public abstract int zzd();

    public abstract void zze(byte[] bArr, int i, int i2, int i3);

    public abstract int zzf(int i, int i2, int i3);

    public abstract zzabe zzg(int i, int i2);

    public abstract zzabi zzh();

    public abstract String zzi(Charset charset);

    public abstract void zzj(zzaau zzaau) throws IOException;

    public abstract boolean zzk();

    public final int zzm() {
        return this.zzc;
    }

    public final String zzr(Charset charset) {
        return zzd() == 0 ? "" : zzi(charset);
    }

    public final boolean zzs() {
        return zzd() == 0;
    }

    public final byte[] zzt() {
        int zzd2 = zzd();
        if (zzd2 == 0) {
            return zzacn.zzd;
        }
        byte[] bArr = new byte[zzd2];
        zze(bArr, 0, 0, zzd2);
        return bArr;
    }
}
