package b20;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.security.MessageDigest;
import p025b6.C1487b;
import p072e6.C4566d;
import p146k6.C5499e;
import p583jk.C17884p;

/* renamed from: b20.d */
public final class C13569d extends C5499e {

    /* renamed from: d */
    public static final byte[] f33519d = "com.moovit.image.transformation.CircleStrokeBitmapTransformation".getBytes(C1487b.f5389a);

    /* renamed from: b */
    public final Paint f33520b = new Paint(1);

    /* renamed from: c */
    public final Paint f33521c;

    public C13569d(int i, int i2) {
        Paint paint = new Paint(5);
        this.f33521c = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(i);
        paint.setStrokeWidth((float) i2);
    }

    /* renamed from: a */
    public final void mo5841a(MessageDigest messageDigest) {
        messageDigest.update(f33519d);
        C17884p.m44380t(messageDigest, this.f33521c.getColor());
        C17884p.m44380t(messageDigest, Float.floatToIntBits(this.f33521c.getStrokeWidth()));
    }

    /* renamed from: c */
    public final Bitmap mo21381c(C4566d dVar, Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap e = dVar.mo20087e(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(e);
        canvas.drawBitmap(bitmap, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.f33520b);
        canvas.drawCircle(((float) width) / 2.0f, ((float) height) / 2.0f, ((float) Math.min(width, height)) / 2.0f, this.f33521c);
        return e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13569d)) {
            return false;
        }
        C13569d dVar = (C13569d) obj;
        if (this.f33521c.getColor() == dVar.f33521c.getColor() && this.f33521c.getStrokeWidth() == dVar.f33521c.getStrokeWidth()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F("com.moovit.image.transformation.CircleStrokeBitmapTransformation"), this.f33521c.getColor(), Float.floatToIntBits(this.f33521c.getStrokeWidth()));
    }
}
