package p775ro;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p584jl.C17885a;
import p611ko.C18109a;

/* renamed from: ro.c */
public final class C19296c extends Drawable {

    /* renamed from: a */
    public final C18109a f49055a;

    /* renamed from: b */
    public final Paint f49056b;

    /* renamed from: c */
    public Paint f49057c;

    /* renamed from: d */
    public RectF f49058d = new RectF();

    public C19296c(int i, C18109a aVar) {
        this.f49055a = aVar;
        Paint paint = new Paint(1);
        this.f49057c = paint;
        paint.setColor(i);
        this.f49057c.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint(1);
        this.f49056b = paint2;
        paint2.setColor(Color.parseColor("#aeaeae"));
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAlpha(180);
    }

    public final void draw(Canvas canvas) {
        canvas.save();
        Rect bounds = getBounds();
        canvas.scale(1.0f, 2.0f);
        canvas.translate(BitmapDescriptorFactory.HUE_RED, -(((float) bounds.bottom) / 1.9f));
        this.f49058d.set(bounds);
        canvas.drawArc(this.f49058d, BitmapDescriptorFactory.HUE_RED, 180.0f, true, this.f49056b);
        canvas.translate(BitmapDescriptorFactory.HUE_RED, -C17885a.m44410L(this.f49055a.f46304a, 0.75f));
        canvas.drawArc(this.f49058d, BitmapDescriptorFactory.HUE_RED, 180.0f, true, this.f49057c);
    }

    public final int getOpacity() {
        return -1;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
