package p146k6;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.security.MessageDigest;
import p025b6.C1487b;
import p072e6.C4566d;

/* renamed from: k6.h */
public final class C5502h extends C5499e {

    /* renamed from: b */
    public static final byte[] f18046b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(C1487b.f5389a);

    /* renamed from: a */
    public final void mo5841a(MessageDigest messageDigest) {
        messageDigest.update(f18046b);
    }

    /* renamed from: c */
    public final Bitmap mo21381c(C4566d dVar, Bitmap bitmap, int i, int i2) {
        float f;
        float f2;
        Bitmap.Config config;
        Paint paint = C5516u.f18072a;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        int width = bitmap.getWidth() * i2;
        int height = bitmap.getHeight() * i;
        float f3 = BitmapDescriptorFactory.HUE_RED;
        if (width > height) {
            f2 = ((float) i2) / ((float) bitmap.getHeight());
            f3 = (((float) i) - (((float) bitmap.getWidth()) * f2)) * 0.5f;
            f = BitmapDescriptorFactory.HUE_RED;
        } else {
            f2 = ((float) i) / ((float) bitmap.getWidth());
            f = (((float) i2) - (((float) bitmap.getHeight()) * f2)) * 0.5f;
        }
        matrix.setScale(f2, f2);
        matrix.postTranslate((float) ((int) (f3 + 0.5f)), (float) ((int) (f + 0.5f)));
        if (bitmap.getConfig() != null) {
            config = bitmap.getConfig();
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap e = dVar.mo20087e(i, i2, config);
        e.setHasAlpha(bitmap.hasAlpha());
        C5516u.m13720a(bitmap, e, matrix);
        return e;
    }

    public final boolean equals(Object obj) {
        return obj instanceof C5502h;
    }

    public final int hashCode() {
        return -599754482;
    }
}
