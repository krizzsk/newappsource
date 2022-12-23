package ya0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* renamed from: ya0.c */
public final class C13276c {

    /* renamed from: a */
    public int f32938a = 0;

    /* renamed from: b */
    public int f32939b = 0;

    /* renamed from: c */
    public float[] f32940c = null;

    /* renamed from: d */
    public FloatBuffer f32941d = null;

    /* renamed from: a */
    public final void mo40140a(float f, float f2) {
        int i = this.f32938a;
        if (i + 2 > this.f32939b) {
            mo40143d(i + 2);
        }
        float[] fArr = this.f32940c;
        int i2 = this.f32938a;
        int i3 = i2 + 1;
        fArr[i2] = f;
        this.f32938a = i3 + 1;
        fArr[i3] = f2;
    }

    /* renamed from: b */
    public final void mo40141b(float f, float f2, float f3) {
        int i = this.f32938a;
        if (i + 3 > this.f32939b) {
            mo40143d(i + 3);
        }
        float[] fArr = this.f32940c;
        int i2 = this.f32938a;
        int i3 = i2 + 1;
        fArr[i2] = f;
        int i4 = i3 + 1;
        fArr[i3] = f2;
        this.f32938a = i4 + 1;
        fArr[i4] = f3;
    }

    /* renamed from: c */
    public final FloatBuffer mo40142c(int i, int i2) {
        int i3 = i + i2;
        int i4 = this.f32938a;
        if (i3 > i4) {
            i2 = i4 - i;
        }
        FloatBuffer floatBuffer = this.f32941d;
        if (floatBuffer == null || floatBuffer.capacity() < i2) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect((i2 * 32) / 8);
            allocateDirect.order(ByteOrder.nativeOrder());
            this.f32941d = allocateDirect.asFloatBuffer();
        }
        this.f32941d.position(0);
        float[] fArr = this.f32940c;
        if (fArr != null) {
            this.f32941d.put(fArr, i, i2);
            this.f32941d.position(0);
        }
        return this.f32941d;
    }

    /* renamed from: d */
    public final void mo40143d(int i) {
        int max = Math.max(6144, Math.max(i, (this.f32939b * 3) / 2));
        float[] fArr = new float[max];
        float[] fArr2 = this.f32940c;
        if (fArr2 != null) {
            System.arraycopy(fArr2, 0, fArr, 0, this.f32938a);
        }
        this.f32940c = fArr;
        this.f32939b = max;
    }
}
