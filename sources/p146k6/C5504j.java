package p146k6;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import java.security.MessageDigest;
import java.util.concurrent.locks.Lock;
import p025b6.C1487b;
import p072e6.C4566d;

/* renamed from: k6.j */
public final class C5504j extends C5499e {

    /* renamed from: b */
    public static final byte[] f18048b = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1".getBytes(C1487b.f5389a);

    /* renamed from: a */
    public final void mo5841a(MessageDigest messageDigest) {
        messageDigest.update(f18048b);
    }

    /* renamed from: c */
    public final Bitmap mo21381c(C4566d dVar, Bitmap bitmap, int i, int i2) {
        Paint paint = C5516u.f18072a;
        int min = Math.min(i, i2);
        float f = (float) min;
        float f2 = f / 2.0f;
        float width = (float) bitmap.getWidth();
        float height = (float) bitmap.getHeight();
        float max = Math.max(f / width, f / height);
        float f3 = width * max;
        float f4 = max * height;
        float f5 = (f - f3) / 2.0f;
        float f6 = (f - f4) / 2.0f;
        RectF rectF = new RectF(f5, f6, f3 + f5, f4 + f6);
        Bitmap c = C5516u.m13722c(bitmap, dVar);
        Bitmap e = dVar.mo20087e(min, min, C5516u.m13723d(bitmap));
        e.setHasAlpha(true);
        Lock lock = C5516u.f18075d;
        lock.lock();
        try {
            Canvas canvas = new Canvas(e);
            canvas.drawCircle(f2, f2, f2, C5516u.f18073b);
            canvas.drawBitmap(c, (Rect) null, rectF, C5516u.f18074c);
            canvas.setBitmap((Bitmap) null);
            lock.unlock();
            if (!c.equals(bitmap)) {
                dVar.mo20086d(c);
            }
            return e;
        } catch (Throwable th) {
            C5516u.f18075d.unlock();
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        return obj instanceof C5504j;
    }

    public final int hashCode() {
        return 1101716364;
    }
}
