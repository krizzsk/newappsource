package android.media;

import android.annotation.NonNull;
import android.view.Surface;

public /* synthetic */ class ImageWriter implements AutoCloseable {
    static {
        throw new NoClassDefFoundError();
    }

    @NonNull
    public static native /* synthetic */ ImageWriter newInstance(@NonNull Surface surface, int i);

    public native /* synthetic */ void close();

    public native /* synthetic */ Image dequeueInputImage();

    public native /* synthetic */ void queueInputImage(Image image);
}
