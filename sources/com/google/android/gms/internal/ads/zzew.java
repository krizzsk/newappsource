package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p358af.C13437d;

public final class zzew {
    public final Uri zza;
    public final int zzb;
    public final byte[] zzc;
    public final Map zzd;
    @Deprecated
    public final long zze;
    public final long zzf;
    public final long zzg;
    public final String zzh;
    public final int zzi;

    static {
        zzbc.zzb("media3.datasource");
    }

    private zzew(Uri uri, long j, int i, byte[] bArr, Map map, long j2, long j3, String str, int i2, Object obj) {
        long j4 = j2;
        long j5 = j + j4;
        boolean z = false;
        zzcw.zzd(j5 >= 0);
        zzcw.zzd(j4 >= 0);
        long j6 = -1;
        if (j3 > 0) {
            j6 = j3;
        } else if (j3 != -1) {
            j6 = j3;
            zzcw.zzd(z);
            this.zza = uri;
            this.zzb = 1;
            this.zzc = null;
            this.zzd = Collections.unmodifiableMap(new HashMap(map));
            this.zzf = j4;
            this.zze = j5;
            this.zzg = j6;
            this.zzh = null;
            this.zzi = i2;
        }
        z = true;
        zzcw.zzd(z);
        this.zza = uri;
        this.zzb = 1;
        this.zzc = null;
        this.zzd = Collections.unmodifiableMap(new HashMap(map));
        this.zzf = j4;
        this.zze = j5;
        this.zzg = j6;
        this.zzh = null;
        this.zzi = i2;
    }

    public /* synthetic */ zzew(Uri uri, long j, int i, byte[] bArr, Map map, long j2, long j3, String str, int i2, Object obj, zzev zzev) {
        this(uri, 0, 1, (byte[]) null, map, j2, -1, (String) null, i2, (Object) null);
    }

    public static String zza(int i) {
        return "GET";
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        long j = this.zzf;
        long j2 = this.zzg;
        int i = this.zzi;
        StringBuilder k = C13555b.m33972k("DataSpec[");
        k.append(zza(1));
        k.append(" ");
        k.append(valueOf);
        k.append(", ");
        k.append(j);
        k.append(", ");
        k.append(j2);
        k.append(", null, ");
        return C13437d.m33707l(k, i, "]");
    }

    public final boolean zzb(int i) {
        return (this.zzi & i) == i;
    }

    @Deprecated
    public zzew(Uri uri, byte[] bArr, long j, long j2, long j3, String str, int i) {
        this(uri, j - j2, 1, (byte[]) null, Collections.emptyMap(), j2, j3, (String) null, i, (Object) null);
    }
}
