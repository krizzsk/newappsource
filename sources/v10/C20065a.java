package v10;

import android.graphics.Bitmap;
import android.graphics.PointF;
import ce0.C21100e;

/* renamed from: v10.a */
public final class C20065a {

    /* renamed from: a */
    public final Bitmap f50909a;

    /* renamed from: b */
    public final PointF f50910b;

    public C20065a(Bitmap bitmap, PointF pointF) {
        C21100e.m49373x(bitmap, "bitmap");
        this.f50909a = bitmap;
        this.f50910b = pointF;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("AnchoredBitmap{w=");
        k.append(this.f50909a.getWidth());
        k.append(", h=");
        k.append(this.f50909a.getHeight());
        k.append(", anchor=");
        k.append(this.f50910b);
        k.append('}');
        return k.toString();
    }
}
