package com.appboy.support;

import android.content.Context;
import androidx.annotation.Keep;

@Keep
public class PermissionUtils {
    public static final String TAG = AppboyLogger.getBrazeLogTag(PermissionUtils.class);

    public static boolean hasPermission(Context context, String str) {
        try {
            if (context.checkCallingOrSelfPermission(str) == 0) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            String str2 = TAG;
            AppboyLogger.m5452e(str2, "Failure checking permission " + str, th);
            return false;
        }
    }
}
