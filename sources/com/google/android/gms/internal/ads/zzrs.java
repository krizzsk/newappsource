package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

public final class zzrs {
    private static final AtomicLong zzd = new AtomicLong();
    public final zzew zza;
    public final Uri zzb;
    public final Map zzc;

    public zzrs(long j, zzew zzew, Uri uri, Map map, long j2, long j3, long j4) {
        this.zza = zzew;
        this.zzb = uri;
        this.zzc = map;
    }

    public static long zza() {
        return zzd.getAndIncrement();
    }
}
