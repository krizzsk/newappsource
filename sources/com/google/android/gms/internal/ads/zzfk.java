package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

public class zzfk extends zzes {
    public final zzew zzb;
    public final int zzc;

    public zzfk(zzew zzew, int i, int i2) {
        super(zzb(AdError.REMOTE_ADS_SERVICE_ERROR, 1));
        this.zzb = zzew;
        this.zzc = 1;
    }

    public static zzfk zza(IOException iOException, zzew zzew, int i) {
        String message = iOException.getMessage();
        boolean z = iOException instanceof SocketTimeoutException;
        int i2 = AdError.INTERNAL_ERROR_CODE;
        if (z) {
            i2 = AdError.CACHE_ERROR_CODE;
        } else if (iOException instanceof InterruptedIOException) {
            i2 = 1004;
        } else if (message != null && zzfoa.zza(message).matches("cleartext.*not permitted.*")) {
            i2 = 2007;
        }
        if (i2 == 2007) {
            return new zzfj(iOException, zzew);
        }
        return new zzfk(iOException, zzew, i2, i);
    }

    private static int zzb(int i, int i2) {
        if (i != 2000) {
            return i;
        }
        if (i2 != 1) {
            return 2000;
        }
        return AdError.INTERNAL_ERROR_CODE;
    }

    public zzfk(IOException iOException, zzew zzew, int i, int i2) {
        super((Throwable) iOException, zzb(i, i2));
        this.zzb = zzew;
        this.zzc = i2;
    }

    public zzfk(String str, zzew zzew, int i, int i2) {
        super(str, zzb(i, i2));
        this.zzb = zzew;
        this.zzc = i2;
    }

    public zzfk(String str, IOException iOException, zzew zzew, int i, int i2) {
        super(str, iOException, zzb(i, i2));
        this.zzb = zzew;
        this.zzc = i2;
    }
}
