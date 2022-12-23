package p146k6;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p072e6.C4566d;

/* renamed from: k6.u */
public final class C5516u {

    /* renamed from: a */
    public static final Paint f18072a = new Paint(6);

    /* renamed from: b */
    public static final Paint f18073b = new Paint(7);

    /* renamed from: c */
    public static final Paint f18074c;

    /* renamed from: d */
    public static final Lock f18075d;

    /* renamed from: k6.u$a */
    public static final class C5517a implements Lock {
        public final void lock() {
        }

        public final void lockInterruptibly() throws InterruptedException {
        }

        public final Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }

        public final boolean tryLock() {
            return true;
        }

        public final boolean tryLock(long j, TimeUnit timeUnit) throws InterruptedException {
            return true;
        }

        public final void unlock() {
        }
    }

    static {
        Lock lock;
        if (new HashSet(Arrays.asList(new String[]{"XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"})).contains(Build.MODEL)) {
            lock = new ReentrantLock();
        } else {
            lock = new C5517a();
        }
        f18075d = lock;
        Paint paint = new Paint(7);
        f18074c = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    /* renamed from: a */
    public static void m13720a(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        Lock lock = f18075d;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f18072a);
            canvas.setBitmap((Bitmap) null);
            lock.unlock();
        } catch (Throwable th) {
            f18075d.unlock();
            throw th;
        }
    }

    /* renamed from: b */
    public static Bitmap m13721b(C4566d dVar, Bitmap bitmap, int i, int i2) {
        Bitmap.Config config;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        float min = Math.min(((float) i) / ((float) bitmap.getWidth()), ((float) i2) / ((float) bitmap.getHeight()));
        int round = Math.round(((float) bitmap.getWidth()) * min);
        int round2 = Math.round(((float) bitmap.getHeight()) * min);
        if (bitmap.getWidth() == round && bitmap.getHeight() == round2) {
            return bitmap;
        }
        int width = (int) (((float) bitmap.getWidth()) * min);
        int height = (int) (((float) bitmap.getHeight()) * min);
        if (bitmap.getConfig() != null) {
            config = bitmap.getConfig();
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap e = dVar.mo20087e(width, height, config);
        e.setHasAlpha(bitmap.hasAlpha());
        if (Log.isLoggable("TransformationUtils", 2)) {
            bitmap.getWidth();
            bitmap.getHeight();
            e.getWidth();
            e.getHeight();
        }
        Matrix matrix = new Matrix();
        matrix.setScale(min, min);
        m13720a(bitmap, e, matrix);
        return e;
    }

    /* renamed from: c */
    public static Bitmap m13722c(Bitmap bitmap, C4566d dVar) {
        Bitmap.Config d = m13723d(bitmap);
        if (d.equals(bitmap.getConfig())) {
            return bitmap;
        }
        Bitmap e = dVar.mo20087e(bitmap.getWidth(), bitmap.getHeight(), d);
        new Canvas(e).drawBitmap(bitmap, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (Paint) null);
        return e;
    }

    /* renamed from: d */
    public static Bitmap.Config m13723d(Bitmap bitmap) {
        if (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(bitmap.getConfig())) {
            return Bitmap.Config.ARGB_8888;
        }
        return Bitmap.Config.RGBA_F16;
    }
}
