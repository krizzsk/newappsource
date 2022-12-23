package ya0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.opengl.GLUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.HashMap;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: ya0.d */
public final class C13277d {

    /* renamed from: a */
    public static final FloatBuffer f32942a;

    /* renamed from: b */
    public static HashMap f32943b = new HashMap();

    /* renamed from: c */
    public static Point f32944c = new Point();

    /* renamed from: d */
    public static Canvas f32945d = new Canvas();

    /* renamed from: e */
    public static Rect f32946e = new Rect();

    /* renamed from: f */
    public static Rect f32947f = new Rect();

    static {
        float[] fArr = {-0.5f, -0.5f, BitmapDescriptorFactory.HUE_RED, 0.5f, -0.5f, BitmapDescriptorFactory.HUE_RED, -0.5f, 0.5f, BitmapDescriptorFactory.HUE_RED, 0.5f, 0.5f, BitmapDescriptorFactory.HUE_RED};
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(48);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        f32942a = asFloatBuffer;
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
    }

    /* renamed from: a */
    public static int m33403a(GL10 gl10, Bitmap bitmap) {
        if (bitmap.getWidth() < 2 || bitmap.getHeight() < 2 || (bitmap.getWidth() & (bitmap.getWidth() - 1)) != 0 || (bitmap.getHeight() & (bitmap.getHeight() - 1)) != 0) {
            return m33404b(gl10, bitmap);
        }
        int[] iArr = new int[1];
        gl10.glGenTextures(1, iArr, 0);
        int i = iArr[0];
        gl10.glBindTexture(3553, i);
        gl10.glTexParameterx(3553, 10241, 9987);
        gl10.glTexParameterx(3553, 10240, 9729);
        Bitmap c = m33405c(bitmap, bitmap.getWidth(), bitmap.getHeight());
        int height = c.getHeight();
        int width = c.getWidth();
        int i2 = 0;
        while (true) {
            if (height < 1 && width < 1) {
                break;
            }
            GLUtils.texImage2D(3553, i2, c, 0);
            if (height <= 1 && width == 1) {
                break;
            }
            height = Math.max(height / 2, 1);
            width = Math.max(width / 2, 1);
            c = m33405c(c, width, height);
            i2++;
        }
        return i;
    }

    /* renamed from: b */
    public static int m33404b(GL10 gl10, Bitmap bitmap) {
        int[] iArr = new int[1];
        gl10.glGenTextures(1, iArr, 0);
        int i = iArr[0];
        gl10.glBindTexture(3553, i);
        gl10.glTexParameterx(3553, 10241, 9729);
        gl10.glTexParameterx(3553, 10240, 9729);
        GLUtils.texImage2D(3553, 0, bitmap, 0);
        return i;
    }

    /* renamed from: c */
    public static synchronized Bitmap m33405c(Bitmap bitmap, int i, int i2) {
        Bitmap bitmap2;
        synchronized (C13277d.class) {
            if (bitmap.getWidth() == i && bitmap.getHeight() == i2 && bitmap.getConfig() == Bitmap.Config.ARGB_8888) {
                return bitmap;
            }
            Point point = f32944c;
            point.set(i, i2);
            SoftReference softReference = (SoftReference) f32943b.get(point);
            if (softReference == null) {
                bitmap2 = null;
            } else {
                bitmap2 = (Bitmap) softReference.get();
            }
            if (bitmap2 == null) {
                bitmap2 = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                f32943b.put(new Point(point), new SoftReference(bitmap2));
            }
            f32946e.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
            f32947f.set(0, 0, i, i2);
            bitmap2.eraseColor(0);
            f32945d.setBitmap(bitmap2);
            f32945d.drawBitmap(bitmap, f32946e, f32947f, (Paint) null);
            f32945d.setBitmap((Bitmap) null);
            return bitmap2;
        }
    }

    /* renamed from: d */
    public static void m33406d(GL10 gl10, int i) {
        if (i != 0) {
            gl10.glDeleteTextures(1, new int[]{i}, 0);
        }
    }
}
