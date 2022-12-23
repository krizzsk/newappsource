package com.google.android.gms.internal.base;

import android.os.Build;
import com.appboy.support.AppboyImageUtils;

public final class zap {
    public static final int zaa = (Build.VERSION.SDK_INT >= 31 ? AppboyImageUtils.MAX_IMAGE_CACHE_SIZE_BYTES : 0);
}
