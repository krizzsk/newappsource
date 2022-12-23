package i00;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* renamed from: i00.j */
public final class C17534j {
    /* renamed from: a */
    public static void m43664a(Canvas canvas, Drawable drawable, int i, int i2, int i3, int i4) {
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int min = Math.min(intrinsicHeight, i4);
        int i5 = i2 + i;
        int i6 = min + i3;
        drawable.setBounds(i, i3 - (intrinsicHeight - min), i5, i6);
        canvas.save();
        canvas.clipRect(i, i3, i5, i6);
        drawable.draw(canvas);
        canvas.restore();
    }
}
