package p977zz;

import android.graphics.Bitmap;

/* renamed from: zz.w0 */
public final class C20973w0 extends ThreadLocal<Bitmap> {

    /* renamed from: a */
    public final /* synthetic */ int f52730a;

    /* renamed from: b */
    public final /* synthetic */ int f52731b;

    /* renamed from: c */
    public final /* synthetic */ Bitmap.Config f52732c;

    public C20973w0(int i, int i2, Bitmap.Config config) {
        this.f52730a = i;
        this.f52731b = i2;
        this.f52732c = config;
    }

    public final Object initialValue() {
        return Bitmap.createBitmap(this.f52730a, this.f52731b, this.f52732c);
    }
}
