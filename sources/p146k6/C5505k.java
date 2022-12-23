package p146k6;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.concurrent.locks.Lock;
import p072e6.C4566d;
import p072e6.C4567e;

/* renamed from: k6.k */
public final class C5505k {

    /* renamed from: a */
    public static final C5506a f18049a = new C5506a();

    /* renamed from: k6.k$a */
    public class C5506a extends C4567e {
        /* renamed from: d */
        public final void mo20086d(Bitmap bitmap) {
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static C5498d m13697a(C4566d dVar, Drawable drawable, int i, int i2) {
        Drawable current = drawable.getCurrent();
        boolean z = false;
        Bitmap bitmap = null;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (!(current instanceof Animatable)) {
            if (i != Integer.MIN_VALUE || current.getIntrinsicWidth() > 0) {
                if (i2 != Integer.MIN_VALUE || current.getIntrinsicHeight() > 0) {
                    if (current.getIntrinsicWidth() > 0) {
                        i = current.getIntrinsicWidth();
                    }
                    if (current.getIntrinsicHeight() > 0) {
                        i2 = current.getIntrinsicHeight();
                    }
                    Lock lock = C5516u.f18075d;
                    lock.lock();
                    Bitmap e = dVar.mo20087e(i, i2, Bitmap.Config.ARGB_8888);
                    try {
                        Canvas canvas = new Canvas(e);
                        current.setBounds(0, 0, i, i2);
                        current.draw(canvas);
                        canvas.setBitmap((Bitmap) null);
                        lock.unlock();
                        bitmap = e;
                    } catch (Throwable th) {
                        lock.unlock();
                        throw th;
                    }
                } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                    current.toString();
                }
            } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                current.toString();
            }
            z = true;
        }
        if (!z) {
            dVar = f18049a;
        }
        return C5498d.m13681c(bitmap, dVar);
    }
}
