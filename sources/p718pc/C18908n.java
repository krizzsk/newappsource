package p718pc;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
import com.google.android.play.core.assetpacks.C14256d1;

/* renamed from: pc.n */
public final class C18908n extends C18906l<LinearProgressIndicatorSpec> {

    /* renamed from: c */
    public float f48130c = 300.0f;

    /* renamed from: d */
    public float f48131d;

    /* renamed from: e */
    public float f48132e;

    public C18908n(LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(linearProgressIndicatorSpec);
    }

    /* renamed from: a */
    public final void mo51382a(Canvas canvas, float f) {
        Rect clipBounds = canvas.getClipBounds();
        this.f48130c = (float) clipBounds.width();
        float f2 = (float) ((LinearProgressIndicatorSpec) this.f48126a).f48082a;
        canvas.translate((((float) clipBounds.width()) / 2.0f) + ((float) clipBounds.left), Math.max(BitmapDescriptorFactory.HUE_RED, ((float) (clipBounds.height() - ((LinearProgressIndicatorSpec) this.f48126a).f48082a)) / 2.0f) + (((float) clipBounds.height()) / 2.0f) + ((float) clipBounds.top));
        if (((LinearProgressIndicatorSpec) this.f48126a).f35230i) {
            canvas.scale(-1.0f, 1.0f);
        }
        if ((this.f48127b.mo51404d() && ((LinearProgressIndicatorSpec) this.f48126a).f48086e == 1) || (this.f48127b.mo51403c() && ((LinearProgressIndicatorSpec) this.f48126a).f48087f == 2)) {
            canvas.scale(1.0f, -1.0f);
        }
        if (this.f48127b.mo51404d() || this.f48127b.mo51403c()) {
            canvas.translate(BitmapDescriptorFactory.HUE_RED, ((f - 1.0f) * ((float) ((LinearProgressIndicatorSpec) this.f48126a).f48082a)) / 2.0f);
        }
        float f3 = this.f48130c;
        canvas.clipRect((-f3) / 2.0f, (-f2) / 2.0f, f3 / 2.0f, f2 / 2.0f);
        S s = this.f48126a;
        this.f48131d = ((float) ((LinearProgressIndicatorSpec) s).f48082a) * f;
        this.f48132e = ((float) ((LinearProgressIndicatorSpec) s).f48083b) * f;
    }

    /* renamed from: b */
    public final void mo51383b(Canvas canvas, Paint paint, float f, float f2, int i) {
        if (f != f2) {
            float f3 = this.f48130c;
            float f4 = (-f3) / 2.0f;
            float f5 = this.f48132e * 2.0f;
            float f6 = f3 - f5;
            paint.setStyle(Paint.Style.FILL);
            paint.setAntiAlias(true);
            paint.setColor(i);
            float f7 = this.f48131d;
            RectF rectF = new RectF((f * f6) + f4, (-f7) / 2.0f, (f6 * f2) + f4 + f5, f7 / 2.0f);
            float f8 = this.f48132e;
            canvas.drawRoundRect(rectF, f8, f8, paint);
        }
    }

    /* renamed from: c */
    public final void mo51384c(Canvas canvas, Paint paint) {
        int a = C14256d1.m35483a(((LinearProgressIndicatorSpec) this.f48126a).f48085d, this.f48127b.f48125k);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(a);
        float f = this.f48130c;
        float f2 = this.f48131d;
        RectF rectF = new RectF((-f) / 2.0f, (-f2) / 2.0f, f / 2.0f, f2 / 2.0f);
        float f3 = this.f48132e;
        canvas.drawRoundRect(rectF, f3, f3, paint);
    }

    /* renamed from: d */
    public final int mo51385d() {
        return ((LinearProgressIndicatorSpec) this.f48126a).f48082a;
    }

    /* renamed from: e */
    public final int mo51386e() {
        return -1;
    }
}
