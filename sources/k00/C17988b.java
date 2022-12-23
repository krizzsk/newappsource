package k00;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import p127j.C5344a;
import p141k1.C5450a;
import p977zz.C20941h;

/* renamed from: k00.b */
public final class C17988b {
    /* renamed from: a */
    public static Bitmap m44610a(int i, Context context) {
        Drawable b = m44611b(i, context);
        if (b == null) {
            StringBuilder k = C13555b.m33972k("Unable to resolve the given drawable resource: ");
            k.append(Integer.toHexString(i));
            throw new IllegalStateException(k.toString());
        } else if (b instanceof BitmapDrawable) {
            return ((BitmapDrawable) b).getBitmap();
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(b.getIntrinsicWidth(), b.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            int intrinsicWidth = b.getIntrinsicWidth();
            int intrinsicHeight = b.getIntrinsicHeight();
            Rect bounds = b.getBounds();
            b.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            b.draw(canvas);
            b.setBounds(bounds);
            return createBitmap;
        }
    }

    /* renamed from: b */
    public static Drawable m44611b(int i, Context context) {
        if (i == 0) {
            return null;
        }
        return C5344a.m13397a(context, i);
    }

    /* renamed from: c */
    public static Drawable m44612c(Context context, int i, int i2) {
        Drawable b = m44611b(i, context);
        if (b == null) {
            return null;
        }
        ColorStateList valueOf = ColorStateList.valueOf(C20941h.m49043f(i2, context));
        Drawable g = C5450a.m13604g(b.mutate());
        C5450a.C5452b.m13617h(g, valueOf);
        return g;
    }
}
