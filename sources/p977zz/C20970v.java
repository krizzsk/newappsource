package p977zz;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ReplacementSpan;
import ce0.C21100e;

/* renamed from: zz.v */
public final class C20970v extends ReplacementSpan {

    /* renamed from: b */
    public final Drawable f52724b;

    /* renamed from: c */
    public final int f52725c;

    public C20970v(Drawable drawable, int i) {
        C21100e.m49373x(drawable, "drawable");
        this.f52724b = drawable;
        this.f52725c = i;
        drawable.setBounds(0, 0, Math.max(0, drawable.getIntrinsicWidth()), Math.max(0, drawable.getIntrinsicHeight()));
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int i6;
        int i7;
        int i8;
        Rect bounds = this.f52724b.getBounds();
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        int i9 = this.f52725c;
        if (i9 == 0) {
            i7 = fontMetricsInt.top;
        } else if (i9 != 1) {
            if (i9 != 2) {
                if (i9 == 3) {
                    i8 = bounds.height();
                } else if (i9 == 4) {
                    i4 += fontMetricsInt.descent;
                    i8 = bounds.height();
                } else if (i9 != 5) {
                    i6 = 0;
                } else {
                    i4 += fontMetricsInt.bottom;
                    i8 = bounds.height();
                }
                i6 = i4 - i8;
            } else {
                i6 = (((fontMetricsInt.ascent + fontMetricsInt.descent) / 2) + i4) - (bounds.height() / 2);
            }
            canvas.save();
            canvas.translate(f, (float) i6);
            this.f52724b.draw(canvas);
            canvas.restore();
        } else {
            i7 = fontMetricsInt.ascent;
        }
        i6 = i7 + i4;
        canvas.save();
        canvas.translate(f, (float) i6);
        this.f52724b.draw(canvas);
        canvas.restore();
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Rect bounds = this.f52724b.getBounds();
        Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
        if (fontMetricsInt != null) {
            int i3 = this.f52725c;
            if (i3 == 0) {
                fontMetricsInt.ascent = 0;
                fontMetricsInt.top = 0;
                int height = bounds.height() + fontMetricsInt2.top;
                fontMetricsInt.descent = height;
                fontMetricsInt.bottom = height;
            } else if (i3 == 1) {
                fontMetricsInt.ascent = 0;
                fontMetricsInt.top = 0;
                int height2 = bounds.height() + fontMetricsInt2.ascent;
                fontMetricsInt.descent = height2;
                fontMetricsInt.bottom = height2;
            } else if (i3 == 2) {
                int height3 = bounds.height() / 2;
                int i4 = (fontMetricsInt2.ascent + fontMetricsInt2.descent) / 2;
                int i5 = i4 - height3;
                fontMetricsInt.ascent = i5;
                fontMetricsInt.top = i5;
                int i6 = i4 + height3;
                fontMetricsInt.descent = i6;
                fontMetricsInt.bottom = i6;
            } else if (i3 == 3) {
                int i7 = -bounds.height();
                fontMetricsInt.ascent = i7;
                fontMetricsInt.top = i7;
                fontMetricsInt.descent = 0;
                fontMetricsInt.bottom = 0;
            } else if (i3 == 4) {
                int i8 = (-bounds.height()) + fontMetricsInt2.descent;
                fontMetricsInt.ascent = i8;
                fontMetricsInt.top = i8;
                fontMetricsInt.descent = 0;
                fontMetricsInt.bottom = 0;
            } else if (i3 == 5) {
                int i9 = (-bounds.height()) + fontMetricsInt2.bottom;
                fontMetricsInt.ascent = i9;
                fontMetricsInt.top = i9;
                fontMetricsInt.descent = 0;
                fontMetricsInt.bottom = 0;
            }
        }
        return bounds.width();
    }
}
