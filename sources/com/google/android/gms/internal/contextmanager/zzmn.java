package com.google.android.gms.internal.contextmanager;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class zzmn {
    public static final Charset zza = Charset.forName("UTF-8");
    public static final Charset zzb = Charset.forName("ISO-8859-1");
    public static final byte[] zzc;
    public static final ByteBuffer zzd;
    public static final zzlg zze;

    static {
        byte[] bArr = new byte[0];
        zzc = bArr;
        zzd = ByteBuffer.wrap(bArr);
        int i = zzlg.zza;
        zzlf zzlf = new zzlf(bArr, 0, 0, false, (zzle) null);
        try {
            zzlf.zza(0);
            zze = zzlf;
        } catch (zzmp e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static int zza(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int zzb(byte[] bArr) {
        int length = bArr.length;
        int zzd2 = zzd(length, bArr, 0, length);
        if (zzd2 == 0) {
            return 1;
        }
        return zzd2;
    }

    public static int zzc(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static int zzd(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    public static <T> T zze(T t) {
        t.getClass();
        return t;
    }

    public static <T> T zzf(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static Object zzg(Object obj, Object obj2) {
        return ((zznn) obj).zzK().zzn((zznn) obj2).zzt();
    }

    public static String zzh(byte[] bArr) {
        return new String(bArr, zza);
    }

    public static boolean zzi(zznn zznn) {
        if (!(zznn instanceof zzkn)) {
            return false;
        }
        zzkn zzkn = (zzkn) zznn;
        throw null;
    }

    public static boolean zzj(byte[] bArr) {
        return zzpc.zze(bArr);
    }
}
