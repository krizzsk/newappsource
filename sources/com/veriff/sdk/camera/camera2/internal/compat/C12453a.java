package com.veriff.sdk.camera.camera2.internal.compat;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import com.veriff.sdk.camera.camera2.internal.compat.CameraManagerCompat;

/* renamed from: com.veriff.sdk.camera.camera2.internal.compat.a */
public final /* synthetic */ class C12453a {
    /* renamed from: a */
    public static CameraManagerCompat.CameraManagerCompatImpl m32189a(Context context, Handler handler) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            return new CameraManagerCompatApi29Impl(context);
        }
        if (i >= 28) {
            return CameraManagerCompatApi28Impl.create(context);
        }
        return CameraManagerCompatBaseImpl.create(context, handler);
    }
}
