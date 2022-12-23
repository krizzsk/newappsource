package p146k6;

import android.graphics.Bitmap;
import android.graphics.Paint;
import java.security.MessageDigest;
import p025b6.C1487b;
import p072e6.C4566d;

/* renamed from: k6.i */
public final class C5503i extends C5499e {

    /* renamed from: b */
    public static final byte[] f18047b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(C1487b.f5389a);

    /* renamed from: a */
    public final void mo5841a(MessageDigest messageDigest) {
        messageDigest.update(f18047b);
    }

    /* renamed from: c */
    public final Bitmap mo21381c(C4566d dVar, Bitmap bitmap, int i, int i2) {
        Paint paint = C5516u.f18072a;
        if (bitmap.getWidth() > i || bitmap.getHeight() > i2) {
            return C5516u.m13721b(dVar, bitmap, i, i2);
        }
        return bitmap;
    }

    public final boolean equals(Object obj) {
        return obj instanceof C5503i;
    }

    public final int hashCode() {
        return -670243078;
    }
}
