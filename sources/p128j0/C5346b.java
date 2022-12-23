package p128j0;

import android.media.Image;
import android.media.ImageWriter;
import android.view.Surface;

/* renamed from: j0.b */
public final class C5346b {
    /* renamed from: a */
    public static void m13401a(ImageWriter imageWriter) {
        imageWriter.close();
    }

    /* renamed from: b */
    public static Image m13402b(ImageWriter imageWriter) {
        return imageWriter.dequeueInputImage();
    }

    /* renamed from: c */
    public static ImageWriter m13403c(int i, Surface surface) {
        return ImageWriter.newInstance(surface, i);
    }

    /* renamed from: d */
    public static void m13404d(ImageWriter imageWriter, Image image) {
        imageWriter.queueInputImage(image);
    }
}
