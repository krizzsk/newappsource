package na0;

import android.graphics.Bitmap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* renamed from: na0.l */
public final class C12935l {

    /* renamed from: a */
    public final Bitmap f32059a;

    /* renamed from: b */
    public final float[] f32060b;

    /* renamed from: c */
    public final FloatBuffer f32061c;

    /* renamed from: d */
    public final float f32062d;

    /* renamed from: e */
    public final float f32063e;

    /* renamed from: f */
    public final int f32064f;

    /* renamed from: g */
    public final int f32065g;

    public C12935l(Bitmap bitmap, float[] fArr, float f, float f2) {
        this(bitmap, fArr, f, f2, 0, 0);
    }

    /* renamed from: a */
    public static C12935l m32749a(Bitmap bitmap, float f) {
        float f2;
        float width = (float) bitmap.getWidth();
        float f3 = width / width;
        float height = (float) bitmap.getHeight();
        float f4 = height / height;
        float[] fArr = {0.0f, f4, f3, f4, 0.0f, 0.0f, f3, 0.0f};
        if (f < BitmapDescriptorFactory.HUE_RED) {
            float f5 = -f;
            float f6 = width * f5 * 0.0079f;
            f2 = f5 * height * 0.0079f;
            f = f6;
        } else {
            f2 = (height * f) / width;
        }
        return new C12935l(bitmap, fArr, f * 500000.0f, f2 * 500000.0f, 0, 0);
    }

    /* renamed from: b */
    public final int mo39815b() {
        int i;
        Bitmap bitmap = this.f32059a;
        if (bitmap == null) {
            i = 0;
        } else {
            i = bitmap.getAllocationByteCount();
        }
        return (this.f32061c.capacity() * 4) + C16530d.m42021o(this.f32060b.length, 4, i + 4 + 4, 4) + 4 + 4 + 4 + 4;
    }

    public C12935l(Bitmap bitmap, float[] fArr, float f, float f2, int i, int i2) {
        this.f32059a = bitmap;
        this.f32062d = f;
        this.f32063e = f2;
        this.f32064f = i;
        this.f32065g = i2;
        this.f32060b = (float[]) fArr.clone();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect((fArr.length * 32) / 8);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        this.f32061c = asFloatBuffer;
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
    }
}
