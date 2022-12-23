package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzbo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;
import p001a0.C0016g;

public final class zzdpp {
    private final zzbo zza;
    private final Clock zzb;
    private final Executor zzc;

    public zzdpp(zzbo zzbo, Clock clock, Executor executor) {
        this.zza = zzbo;
        this.zzb = clock;
        this.zzc = executor;
    }

    private final Bitmap zzc(byte[] bArr, BitmapFactory.Options options) {
        long elapsedRealtime = this.zzb.elapsedRealtime();
        boolean z = false;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        long elapsedRealtime2 = this.zzb.elapsedRealtime();
        if (decodeByteArray != null) {
            int width = decodeByteArray.getWidth();
            int height = decodeByteArray.getHeight();
            int allocationByteCount = decodeByteArray.getAllocationByteCount();
            long j = elapsedRealtime2 - elapsedRealtime;
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                z = true;
            }
            StringBuilder s = C0016g.m35s("Decoded image w: ", width, " h:", height, " bytes: ");
            s.append(allocationByteCount);
            s.append(" time: ");
            s.append(j);
            s.append(" on ui thread: ");
            s.append(z);
            zze.zza(s.toString());
        }
        return decodeByteArray;
    }

    public final /* synthetic */ Bitmap zza(double d, boolean z, zzaix zzaix) {
        byte[] bArr = zzaix.zzb;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (d * 160.0d);
        if (!z) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzfc)).booleanValue()) {
            options.inJustDecodeBounds = true;
            zzc(bArr, options);
            options.inJustDecodeBounds = false;
            int i = options.outWidth * options.outHeight;
            if (i > 0) {
                options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros((i - 1) / ((Integer) zzay.zzc().zzb(zzbhy.zzfd)).intValue())) / 2);
            }
        }
        return zzc(bArr, options);
    }

    public final zzfvj zzb(String str, double d, boolean z) {
        return zzfva.zzm(this.zza.zza(str), new zzdpo(this, d, z), this.zzc);
    }
}
