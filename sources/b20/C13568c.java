package b20;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.tranzmate.R;
import java.security.MessageDigest;
import java.util.concurrent.locks.Lock;
import k00.C17988b;
import p025b6.C1487b;
import p072e6.C4566d;
import p146k6.C5499e;
import p146k6.C5516u;
import p583jk.C17884p;
import p977zz.C20969u0;
import p977zz.C20975x0;

/* renamed from: b20.c */
public final class C13568c extends C5499e {

    /* renamed from: d */
    public static final byte[] f33516d = "com.moovit.image.transformation.BitmapDecoration".getBytes(C1487b.f5389a);

    /* renamed from: b */
    public final Uri f33517b;

    /* renamed from: c */
    public final Drawable f33518c;

    public C13568c(Context context) {
        this.f33517b = C20969u0.m49110a(context.getResources(), Integer.valueOf(R.drawable.ic_star_16_favorite));
        Drawable b = C17988b.m44611b(R.drawable.ic_star_16_favorite, context);
        this.f33518c = (b == null || b.getIntrinsicWidth() == -1 || b.getIntrinsicHeight() == -1) ? null : b;
    }

    /* renamed from: a */
    public final void mo5841a(MessageDigest messageDigest) {
        messageDigest.update(f33516d);
        Uri uri = this.f33517b;
        if (uri != null) {
            C17884p.m44381u(messageDigest, uri.toString());
        }
    }

    /* renamed from: c */
    public final Bitmap mo21381c(C4566d dVar, Bitmap bitmap, int i, int i2) {
        Drawable drawable;
        Bitmap.Config config;
        if (!(this.f33517b == null || (drawable = this.f33518c) == null)) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = this.f33518c.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                int width = (intrinsicWidth / 2) + bitmap.getWidth();
                int height = (intrinsicHeight / 2) + bitmap.getHeight();
                if (bitmap.getConfig() != null) {
                    config = bitmap.getConfig();
                } else {
                    config = Bitmap.Config.ARGB_8888;
                }
                Bitmap e = dVar.mo20087e(width, height, config);
                Lock lock = C5516u.f18075d;
                lock.lock();
                try {
                    Canvas canvas = new Canvas(e);
                    canvas.drawBitmap(bitmap, BitmapDescriptorFactory.HUE_RED, ((float) intrinsicHeight) / 2.0f, (Paint) null);
                    this.f33518c.setBounds(width - intrinsicWidth, 0, width, intrinsicHeight);
                    this.f33518c.draw(canvas);
                    canvas.setBitmap((Bitmap) null);
                    return e;
                } finally {
                    lock.unlock();
                }
            }
        }
        return bitmap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13568c)) {
            return false;
        }
        return C20975x0.m49118e(this.f33517b, ((C13568c) obj).f33517b);
    }

    public final int hashCode() {
        return C17884p.m44333D(-1807245852, C17884p.m44335F(this.f33517b));
    }
}
