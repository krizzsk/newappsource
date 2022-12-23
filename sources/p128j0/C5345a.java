package p128j0;

import android.media.Image;
import android.media.ImageWriter;
import android.os.Build;
import android.view.Surface;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: j0.a */
public final class C5345a {
    /* renamed from: a */
    public static ImageWriter m13398a(int i, Surface surface) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            return C5346b.m13403c(i, surface);
        }
        throw new RuntimeException(C25541a.m63878h("Unable to call newInstance(Surface, int) on API ", i2, ". Version 23 or higher required."));
    }

    /* renamed from: b */
    public static ImageWriter m13399b(Surface surface, int i, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            return ImageWriter.newInstance(surface, i, i2);
        }
        if (i3 >= 26) {
            Method method = C5347c.f17643a;
            Throwable th = null;
            if (i3 >= 26) {
                try {
                    Object invoke = C5347c.f17643a.invoke((Object) null, new Object[]{surface, Integer.valueOf(i), Integer.valueOf(i2)});
                    invoke.getClass();
                    return (ImageWriter) invoke;
                } catch (IllegalAccessException | InvocationTargetException e) {
                    th = e;
                }
            }
            throw new RuntimeException("Unable to invoke newInstance(Surface, int, int) via reflection.", th);
        }
        throw new RuntimeException(C25541a.m63878h("Unable to call newInstance(Surface, int, int) on API ", i3, ". Version 26 or higher required."));
    }

    /* renamed from: c */
    public static void m13400c(ImageWriter imageWriter, Image image) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            C5346b.m13404d(imageWriter, image);
            return;
        }
        throw new RuntimeException(C25541a.m63878h("Unable to call queueInputImage() on API ", i, ". Version 23 or higher required."));
    }
}
