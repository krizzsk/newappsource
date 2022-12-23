package com.appboy.support;

import android.content.Context;
import androidx.annotation.Keep;

@Keep
public class PackageUtils {
    public static final String TAG = AppboyLogger.getBrazeLogTag(PackageUtils.class);
    public static String sPackageName;

    public static String getResourcePackageName(Context context) {
        String str = sPackageName;
        if (str != null) {
            return str;
        }
        String packageName = context.getPackageName();
        sPackageName = packageName;
        return packageName;
    }

    public static void setResourcePackageName(String str) {
        if (!StringUtils.isNullOrBlank(str)) {
            sPackageName = str;
        } else {
            AppboyLogger.m5459w(TAG, "Package name may not be null or blank");
        }
    }
}
