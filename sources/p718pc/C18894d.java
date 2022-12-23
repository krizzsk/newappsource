package p718pc;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.progressindicator.CircularProgressIndicatorSpec;
import com.google.android.play.core.assetpacks.C14256d1;

/* renamed from: pc.d */
public final class C18894d extends C18906l<CircularProgressIndicatorSpec> {

    /* renamed from: c */
    public int f48088c = 1;

    /* renamed from: d */
    public float f48089d;

    /* renamed from: e */
    public float f48090e;

    /* renamed from: f */
    public float f48091f;

    public C18894d(CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(circularProgressIndicatorSpec);
    }

    /* renamed from: a */
    public final void mo51382a(Canvas canvas, float f) {
        int i;
        S s = this.f48126a;
        float f2 = (((float) ((CircularProgressIndicatorSpec) s).f35224g) / 2.0f) + ((float) ((CircularProgressIndicatorSpec) s).f35225h);
        canvas.translate(f2, f2);
        canvas.rotate(-90.0f);
        float f3 = -f2;
        canvas.clipRect(f3, f3, f2, f2);
        S s2 = this.f48126a;
        if (((CircularProgressIndicatorSpec) s2).f35226i == 0) {
            i = 1;
        } else {
            i = -1;
        }
        this.f48088c = i;
        this.f48089d = ((float) ((CircularProgressIndicatorSpec) s2).f48082a) * f;
        this.f48090e = ((float) ((CircularProgressIndicatorSpec) s2).f48083b) * f;
        this.f48091f = ((float) (((CircularProgressIndicatorSpec) s2).f35224g - ((CircularProgressIndicatorSpec) s2).f48082a)) / 2.0f;
        if ((this.f48127b.mo51404d() && ((CircularProgressIndicatorSpec) this.f48126a).f48086e == 2) || (this.f48127b.mo51403c() && ((CircularProgressIndicatorSpec) this.f48126a).f48087f == 1)) {
            this.f48091f = (((1.0f - f) * ((float) ((CircularProgressIndicatorSpec) this.f48126a).f48082a)) / 2.0f) + this.f48091f;
        } else if ((this.f48127b.mo51404d() && ((CircularProgressIndicatorSpec) this.f48126a).f48086e == 1) || (this.f48127b.mo51403c() && ((CircularProgressIndicatorSpec) this.f48126a).f48087f == 2)) {
            this.f48091f -= ((1.0f - f) * ((float) ((CircularProgressIndicatorSpec) this.f48126a).f48082a)) / 2.0f;
        }
    }

    /* renamed from: b */
    public final void mo51383b(Canvas canvas, Paint paint, float f, float f2, int i) {
        if (f != f2) {
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.BUTT);
            paint.setAntiAlias(true);
            paint.setColor(i);
            paint.setStrokeWidth(this.f48089d);
            float f3 = (float) this.f48088c;
            float f4 = f * 360.0f * f3;
            if (f2 < f) {
                f2 += 1.0f;
            }
            float f5 = (f2 - f) * 360.0f * f3;
            float f6 = this.f48091f;
            float f7 = -f6;
            canvas.drawArc(new RectF(f7, f7, f6, f6), f4, f5, false, paint);
            if (this.f48090e > BitmapDescriptorFactory.HUE_RED && Math.abs(f5) < 360.0f) {
                paint.setStyle(Paint.Style.FILL);
                float f8 = this.f48089d;
                float f9 = this.f48090e;
                canvas.save();
                canvas.rotate(f4);
                float f11 = this.f48091f;
                float f12 = f8 / 2.0f;
                canvas.drawRoundRect(new RectF(f11 - f12, f9, f11 + f12, -f9), f9, f9, paint);
                canvas.restore();
                float f13 = this.f48089d;
                float f14 = this.f48090e;
                canvas.save();
                canvas.rotate(f4 + f5);
                float f15 = this.f48091f;
                float f16 = f13 / 2.0f;
                canvas.drawRoundRect(new RectF(f15 - f16, f14, f15 + f16, -f14), f14, f14, paint);
                canvas.restore();
            }
        }
    }

    /* renamed from: c */
    public final void mo51384c(Canvas canvas, Paint paint) {
        int a = C14256d1.m35483a(((CircularProgressIndicatorSpec) this.f48126a).f48085d, this.f48127b.f48125k);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(a);
        paint.setStrokeWidth(this.f48089d);
        float f = this.f48091f;
        canvas.drawArc(new RectF(-f, -f, f, f), BitmapDescriptorFactory.HUE_RED, 360.0f, false, paint);
    }

    /* renamed from: d */
    public final int mo51385d() {
        CircularProgressIndicatorSpec circularProgressIndicatorSpec = (CircularProgressIndicatorSpec) this.f48126a;
        return (circularProgressIndicatorSpec.f35225h * 2) + circularProgressIndicatorSpec.f35224g;
    }

    /* renamed from: e */
    public final int mo51386e() {
        CircularProgressIndicatorSpec circularProgressIndicatorSpec = (CircularProgressIndicatorSpec) this.f48126a;
        return (circularProgressIndicatorSpec.f35225h * 2) + circularProgressIndicatorSpec.f35224g;
    }
}
