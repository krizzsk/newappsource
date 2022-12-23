package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import java.io.IOException;
import java.util.Map;

public final class zzfm extends zzfk {
    public final int zzd;
    public final String zze;
    public final Map zzf;
    public final byte[] zzg;

    public zzfm(int i, String str, IOException iOException, Map map, zzew zzew, byte[] bArr) {
        super(C16759e.m42349e("Response code: ", i), iOException, zzew, AdError.INTERNAL_ERROR_2004, 1);
        this.zzd = i;
        this.zze = str;
        this.zzf = map;
        this.zzg = bArr;
    }
}
