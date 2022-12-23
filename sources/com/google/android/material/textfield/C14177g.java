package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import p811tc.C19648g;
import p811tc.C19654k;

/* renamed from: com.google.android.material.textfield.g */
public final class C14177g extends C19648g {

    /* renamed from: z */
    public final RectF f35588z;

    public C14177g() {
        this((C19654k) null);
    }

    /* renamed from: g */
    public final void mo42603g(Canvas canvas) {
        if (this.f35588z.isEmpty()) {
            super.mo42603g(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(this.f35588z);
        } else {
            canvas.clipRect(this.f35588z, Region.Op.DIFFERENCE);
        }
        super.mo42603g(canvas);
        canvas.restore();
    }

    /* renamed from: w */
    public final void mo42604w(float f, float f2, float f3, float f4) {
        RectF rectF = this.f35588z;
        if (f != rectF.left || f2 != rectF.top || f3 != rectF.right || f4 != rectF.bottom) {
            rectF.set(f, f2, f3, f4);
            invalidateSelf();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14177g(C19654k kVar) {
        super(kVar == null ? new C19654k() : kVar);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f35588z = new RectF();
    }
}
