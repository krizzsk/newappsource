package k00;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import ce0.C21100e;

/* renamed from: k00.e */
public final class C17992e extends Drawable {

    /* renamed from: a */
    public final int f46073a;

    /* renamed from: b */
    public final int f46074b;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C17992e(android.content.Context r2, int r3, int r4) {
        /*
            r1 = this;
            android.content.res.Resources r2 = r2.getResources()
            r0 = 0
            if (r3 != 0) goto L_0x0009
            r3 = 0
            goto L_0x000d
        L_0x0009:
            int r3 = r2.getDimensionPixelSize(r3)
        L_0x000d:
            if (r4 != 0) goto L_0x0010
            goto L_0x0014
        L_0x0010:
            int r0 = r2.getDimensionPixelSize(r4)
        L_0x0014:
            r1.<init>(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k00.C17992e.<init>(android.content.Context, int, int):void");
    }

    public final void draw(Canvas canvas) {
    }

    public final int getIntrinsicHeight() {
        return this.f46074b;
    }

    public final int getIntrinsicWidth() {
        return this.f46073a;
    }

    public final int getOpacity() {
        return 0;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public C17992e(int i, int i2) {
        C21100e.m49359q(i, "width");
        this.f46073a = i;
        C21100e.m49359q(i2, "height");
        this.f46074b = i2;
    }
}
