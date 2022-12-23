package p107h5;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.os.Build;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.Closeable;
import p584jl.C17885a;

/* renamed from: h5.g */
public final class C5059g {

    /* renamed from: a */
    public static final C5060a f17057a = new C5060a();

    /* renamed from: b */
    public static final C5061b f17058b = new C5061b();

    /* renamed from: c */
    public static final C5062c f17059c = new C5062c();

    /* renamed from: d */
    public static final C5063d f17060d = new C5063d();

    /* renamed from: e */
    public static final float f17061e = ((float) (Math.sqrt(2.0d) / 2.0d));

    /* renamed from: f */
    public static float f17062f = -1.0f;

    /* renamed from: h5.g$a */
    public class C5060a extends ThreadLocal<PathMeasure> {
        public final Object initialValue() {
            return new PathMeasure();
        }
    }

    /* renamed from: h5.g$b */
    public class C5061b extends ThreadLocal<Path> {
        public final Object initialValue() {
            return new Path();
        }
    }

    /* renamed from: h5.g$c */
    public class C5062c extends ThreadLocal<Path> {
        public final Object initialValue() {
            return new Path();
        }
    }

    /* renamed from: h5.g$d */
    public class C5063d extends ThreadLocal<float[]> {
        public final Object initialValue() {
            return new float[4];
        }
    }

    /* renamed from: a */
    public static void m12908a(Path path, float f, float f2, float f3) {
        PathMeasure pathMeasure = (PathMeasure) f17057a.get();
        Path path2 = (Path) f17058b.get();
        Path path3 = (Path) f17059c.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f == 1.0f && f2 == BitmapDescriptorFactory.HUE_RED) {
            C17885a.m44412M();
        } else if (length < 1.0f || ((double) Math.abs((f2 - f) - 1.0f)) < 0.01d) {
            C17885a.m44412M();
        } else {
            float f4 = f * length;
            float f5 = f2 * length;
            float f6 = f3 * length;
            float min = Math.min(f4, f5) + f6;
            float max = Math.max(f4, f5) + f6;
            if (min >= length && max >= length) {
                min = (float) C5058f.m12906c(min, length);
                max = (float) C5058f.m12906c(max, length);
            }
            if (min < BitmapDescriptorFactory.HUE_RED) {
                min = (float) C5058f.m12906c(min, length);
            }
            if (max < BitmapDescriptorFactory.HUE_RED) {
                max = (float) C5058f.m12906c(max, length);
            }
            int i = (min > max ? 1 : (min == max ? 0 : -1));
            if (i == 0) {
                path.reset();
                C17885a.m44412M();
                return;
            }
            if (i >= 0) {
                min -= length;
            }
            path2.reset();
            pathMeasure.getSegment(min, max, path2, true);
            if (max > length) {
                path3.reset();
                pathMeasure.getSegment(BitmapDescriptorFactory.HUE_RED, max % length, path3, true);
                path2.addPath(path3);
            } else if (min < BitmapDescriptorFactory.HUE_RED) {
                path3.reset();
                pathMeasure.getSegment(min + length, length, path3, true);
                path2.addPath(path3);
            }
            path.set(path2);
            C17885a.m44412M();
        }
    }

    /* renamed from: b */
    public static void m12909b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: c */
    public static float m12910c() {
        if (f17062f == -1.0f) {
            f17062f = Resources.getSystem().getDisplayMetrics().density;
        }
        return f17062f;
    }

    /* renamed from: d */
    public static float m12911d(Matrix matrix) {
        float[] fArr = (float[]) f17060d.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f = f17061e;
        fArr[2] = f;
        fArr[3] = f;
        matrix.mapPoints(fArr);
        return (float) Math.hypot((double) (fArr[2] - fArr[0]), (double) (fArr[3] - fArr[1]));
    }

    /* renamed from: e */
    public static void m12912e(Canvas canvas, RectF rectF, Paint paint, int i) {
        if (Build.VERSION.SDK_INT < 23) {
            canvas.saveLayer(rectF, paint, i);
        } else {
            canvas.saveLayer(rectF, paint);
        }
        C17885a.m44412M();
    }
}
