package com.google.android.gms.internal.mlkit_common;

import android.system.OsConstants;
import android.system.StructStat;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.concurrent.Callable;

final class zzo {
    public final long zza;
    public final long zzb;
    public final boolean zzc;

    private zzo(long j, long j2, boolean z) {
        this.zza = j;
        this.zzb = j2;
        this.zzc = z;
    }

    public static zzo zza(FileDescriptor fileDescriptor) throws IOException {
        StructStat structStat = (StructStat) zzc(new zzi(fileDescriptor));
        return new zzo(structStat.st_dev, structStat.st_ino, OsConstants.S_ISLNK(structStat.st_mode));
    }

    public static zzo zzb(String str) throws IOException {
        StructStat structStat = (StructStat) zzc(new zzj(str));
        return new zzo(structStat.st_dev, structStat.st_ino, OsConstants.S_ISLNK(structStat.st_mode));
    }

    private static Object zzc(Callable callable) throws IOException {
        try {
            return callable.call();
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }
}
