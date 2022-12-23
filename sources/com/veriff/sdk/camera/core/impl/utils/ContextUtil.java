package com.veriff.sdk.camera.core.impl.utils;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;

public final class ContextUtil {

    public static class Api30Impl {
        public static Context createAttributionContext(Context context, String str) {
            return context.createAttributionContext(str);
        }

        public static String getAttributionTag(Context context) {
            return context.getAttributionTag();
        }
    }

    public static Context getApplicationContext(Context context) {
        String attributionTag;
        Context applicationContext = context.getApplicationContext();
        if (Build.VERSION.SDK_INT < 30 || (attributionTag = Api30Impl.getAttributionTag(context)) == null) {
            return applicationContext;
        }
        return Api30Impl.createAttributionContext(applicationContext, attributionTag);
    }

    public static Context getBaseContext(ContextWrapper contextWrapper) {
        String attributionTag;
        Context baseContext = contextWrapper.getBaseContext();
        if (Build.VERSION.SDK_INT < 30 || (attributionTag = Api30Impl.getAttributionTag(contextWrapper)) == null) {
            return baseContext;
        }
        return Api30Impl.createAttributionContext(baseContext, attributionTag);
    }
}
