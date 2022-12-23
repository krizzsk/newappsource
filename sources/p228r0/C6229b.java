package p228r0;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: r0.b */
public final class C6229b extends Drawable {

    /* renamed from: a */
    public float f19666a;

    /* renamed from: b */
    public final Paint f19667b;

    /* renamed from: c */
    public final RectF f19668c;

    /* renamed from: d */
    public final Rect f19669d;

    /* renamed from: e */
    public float f19670e;

    /* renamed from: f */
    public boolean f19671f = false;

    /* renamed from: g */
    public boolean f19672g = true;

    /* renamed from: h */
    public ColorStateList f19673h;

    /* renamed from: i */
    public PorterDuffColorFilter f19674i;

    /* renamed from: j */
    public ColorStateList f19675j;

    /* renamed from: k */
    public PorterDuff.Mode f19676k = PorterDuff.Mode.SRC_IN;

    public C6229b(float f, ColorStateList colorStateList) {
        this.f19666a = f;
        this.f19667b = new Paint(5);
        mo22221b(colorStateList);
        this.f19668c = new RectF();
        this.f19669d = new Rect();
    }

    /* renamed from: a */
    public final PorterDuffColorFilter mo22220a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* renamed from: b */
    public final void mo22221b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f19673h = colorStateList;
        this.f19667b.setColor(colorStateList.getColorForState(getState(), this.f19673h.getDefaultColor()));
    }

    /* renamed from: c */
    public final void mo22222c(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f19668c.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        this.f19669d.set(rect);
        if (this.f19671f) {
            float a = C6230c.m14815a(this.f19670e, this.f19666a, this.f19672g);
            float f = this.f19670e;
            float f2 = this.f19666a;
            if (this.f19672g) {
                f = (float) (((1.0d - C6230c.f19677a) * ((double) f2)) + ((double) f));
            }
            this.f19669d.inset((int) Math.ceil((double) f), (int) Math.ceil((double) a));
            this.f19668c.set(this.f19669d);
        }
    }

    public final void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.f19667b;
        if (this.f19674i == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f19674i);
            z = true;
        }
        RectF rectF = this.f19668c;
        float f = this.f19666a;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter((ColorFilter) null);
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f19669d, this.f19666a);
    }

    public final boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f19675j;
        if ((colorStateList2 == null || !colorStateList2.isStateful()) && (((colorStateList = this.f19673h) == null || !colorStateList.isStateful()) && !super.isStateful())) {
            return false;
        }
        return true;
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        mo22222c(rect);
    }

    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f19673h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (colorForState != this.f19667b.getColor()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f19667b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f19675j;
        if (colorStateList2 == null || (mode = this.f19676k) == null) {
            return z;
        }
        this.f19674i = mo22220a(colorStateList2, mode);
        return true;
    }

    public final void setAlpha(int i) {
        this.f19667b.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f19667b.setColorFilter(colorFilter);
    }

    public final void setTintList(ColorStateList colorStateList) {
        this.f19675j = colorStateList;
        this.f19674i = mo22220a(colorStateList, this.f19676k);
        invalidateSelf();
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        this.f19676k = mode;
        this.f19674i = mo22220a(this.f19675j, mode);
        invalidateSelf();
    }
}
