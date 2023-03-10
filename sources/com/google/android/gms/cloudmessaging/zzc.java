package com.google.android.gms.cloudmessaging;

import android.os.Build;
import android.util.Log;

public final class zzc extends ClassLoader {
    public final Class<?> loadClass(String str, boolean z) throws ClassNotFoundException {
        if (!"com.google.android.gms.iid.MessengerCompat".equals(str)) {
            return super.loadClass(str, z);
        }
        if (Log.isLoggable("CloudMessengerCompat", 3) || Build.VERSION.SDK_INT != 23) {
            return zzd.class;
        }
        boolean isLoggable = Log.isLoggable("CloudMessengerCompat", 3);
        return zzd.class;
    }
}
