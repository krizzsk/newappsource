package h00;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: h00.a */
public final class C17291a extends ReplacementSpan {

    /* renamed from: b */
    public final int f44668b = 15;

    /* renamed from: c */
    public float[] f44669c = new float[0];

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        canvas.drawText(charSequence, i, i2, f, (float) i4, paint);
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        int i3 = i2 - i;
        if (this.f44669c.length < i3) {
            this.f44669c = new float[i3];
        }
        paint.getTextWidths(charSequence, i, i2, this.f44669c);
        float f = BitmapDescriptorFactory.HUE_RED;
        for (int i4 = 0; i4 < i3; i4++) {
            f += this.f44669c[i4];
        }
        return Math.round(f) + this.f44668b;
    }
}
