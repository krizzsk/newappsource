package com.appboy.support;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Keep;

@Keep
public class HandlerUtils {
    public static Handler createHandler() {
        return new Handler(Looper.getMainLooper());
    }
}
