package p481fc;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;

/* renamed from: fc.a */
public final class C16948a extends InsetDrawable {
    public C16948a(Drawable drawable, int i, int i2, int i3, int i4) {
        super(drawable, i, i2, i3, i4);
    }

    public final int getMinimumHeight() {
        return -1;
    }

    public final int getMinimumWidth() {
        return -1;
    }

    public final boolean getPadding(Rect rect) {
        return false;
    }
}
