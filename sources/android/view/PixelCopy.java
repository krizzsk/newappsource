package android.view;

import android.annotation.NonNull;
import android.graphics.Bitmap;
import android.os.Handler;

public final /* synthetic */ class PixelCopy {

    public /* synthetic */ interface OnPixelCopyFinishedListener {
        static {
            throw new NoClassDefFoundError();
        }
    }

    static {
        throw new NoClassDefFoundError();
    }

    public static native /* synthetic */ void request(@NonNull SurfaceView surfaceView, @NonNull Bitmap bitmap, @NonNull OnPixelCopyFinishedListener onPixelCopyFinishedListener, @NonNull Handler handler);
}
