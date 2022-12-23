package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.zzbhy;
import java.util.List;

public class MediationUtils {
    public static final double MIN_HEIGHT_RATIO = 0.7d;
    public static final double MIN_WIDTH_RATIO = 0.5d;

    public static AdSize findClosestSize(Context context, AdSize adSize, List<AdSize> list) {
        AdSize adSize2 = null;
        if (!(list == null || adSize == null)) {
            if (!adSize.zzh() && !adSize.zzi()) {
                float f = context.getResources().getDisplayMetrics().density;
                adSize = new AdSize(Math.round(((float) adSize.getWidthInPixels(context)) / f), Math.round(((float) adSize.getHeightInPixels(context)) / f));
            }
            for (AdSize next : list) {
                if (next != null) {
                    int width = adSize.getWidth();
                    int width2 = next.getWidth();
                    int height = adSize.getHeight();
                    int height2 = next.getHeight();
                    if (((double) width) * 0.5d <= ((double) width2) && width >= width2) {
                        if (adSize.zzi()) {
                            int zza = adSize.zza();
                            if (((Integer) zzay.zzc().zzb(zzbhy.zzgA)).intValue() <= width2) {
                                if (((Integer) zzay.zzc().zzb(zzbhy.zzgB)).intValue() <= height2) {
                                    if (zza < height2) {
                                    }
                                }
                            }
                        } else if (adSize.zzh()) {
                            if (adSize.zzb() < height2) {
                            }
                        } else if (((double) height) * 0.7d <= ((double) height2)) {
                            if (height < height2) {
                            }
                        }
                        if (adSize2 != null) {
                            if (adSize2.getHeight() * adSize2.getWidth() > next.getHeight() * next.getWidth()) {
                            }
                        }
                        adSize2 = next;
                    }
                }
            }
        }
        return adSize2;
    }
}
