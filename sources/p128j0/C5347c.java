package p128j0;

import android.media.ImageWriter;
import android.view.Surface;
import java.lang.reflect.Method;

/* renamed from: j0.c */
public final class C5347c {

    /* renamed from: a */
    public static Method f17643a;

    static {
        Class<ImageWriter> cls = ImageWriter.class;
        try {
            Class cls2 = Integer.TYPE;
            f17643a = cls.getMethod("newInstance", new Class[]{Surface.class, cls2, cls2});
        } catch (NoSuchMethodException unused) {
        }
    }
}
