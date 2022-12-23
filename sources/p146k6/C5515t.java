package p146k6;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.concurrent.locks.Lock;
import p025b6.C1487b;
import p072e6.C4566d;
import p311x6.C7176l;
import p584jl.C17885a;

/* renamed from: k6.t */
public final class C5515t extends C5499e {

    /* renamed from: c */
    public static final byte[] f18070c = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(C1487b.f5389a);

    /* renamed from: b */
    public final int f18071b;

    public C5515t(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C17885a.m44452o("roundingRadius must be greater than 0.", z);
        this.f18071b = i;
    }

    /* renamed from: a */
    public final void mo5841a(MessageDigest messageDigest) {
        messageDigest.update(f18070c);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f18071b).array());
    }

    /* renamed from: c */
    public final Bitmap mo21381c(C4566d dVar, Bitmap bitmap, int i, int i2) {
        boolean z;
        int i3 = this.f18071b;
        Paint paint = C5516u.f18072a;
        if (i3 > 0) {
            z = true;
        } else {
            z = false;
        }
        C17885a.m44452o("roundingRadius must be greater than 0.", z);
        Bitmap.Config d = C5516u.m13723d(bitmap);
        Bitmap c = C5516u.m13722c(bitmap, dVar);
        Bitmap e = dVar.mo20087e(c.getWidth(), c.getHeight(), d);
        e.setHasAlpha(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(c, tileMode, tileMode);
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setShader(bitmapShader);
        RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) e.getWidth(), (float) e.getHeight());
        Lock lock = C5516u.f18075d;
        lock.lock();
        try {
            Canvas canvas = new Canvas(e);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            float f = (float) i3;
            canvas.drawRoundRect(rectF, f, f, paint2);
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
        if (!(obj instanceof C5515t) || this.f18071b != ((C5515t) obj).f18071b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.f18071b;
        char[] cArr = C7176l.f22265a;
        return ((i + 527) * 31) - 569625254;
    }
}
