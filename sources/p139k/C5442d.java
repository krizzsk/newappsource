package p139k;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p114i.C5215a;
import p114i.C5223i;
import p114i.C5224j;
import p141k1.C5450a;

/* renamed from: k.d */
public class C5442d extends Drawable {

    /* renamed from: m */
    public static final float f17948m = ((float) Math.toRadians(45.0d));

    /* renamed from: a */
    public final Paint f17949a;

    /* renamed from: b */
    public float f17950b;

    /* renamed from: c */
    public float f17951c;

    /* renamed from: d */
    public float f17952d;

    /* renamed from: e */
    public float f17953e;

    /* renamed from: f */
    public boolean f17954f;

    /* renamed from: g */
    public final Path f17955g = new Path();

    /* renamed from: h */
    public final int f17956h;

    /* renamed from: i */
    public boolean f17957i = false;

    /* renamed from: j */
    public float f17958j;

    /* renamed from: k */
    public float f17959k;

    /* renamed from: l */
    public int f17960l = 2;

    public C5442d(Context context) {
        Paint paint = new Paint();
        this.f17949a = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, C5224j.DrawerArrowToggle, C5215a.drawerArrowStyle, C5223i.Base_Widget_AppCompat_DrawerArrowToggle);
        int color = obtainStyledAttributes.getColor(C5224j.DrawerArrowToggle_color, 0);
        if (color != paint.getColor()) {
            paint.setColor(color);
            invalidateSelf();
        }
        float dimension = obtainStyledAttributes.getDimension(C5224j.DrawerArrowToggle_thickness, BitmapDescriptorFactory.HUE_RED);
        if (paint.getStrokeWidth() != dimension) {
            paint.setStrokeWidth(dimension);
            this.f17959k = (float) (Math.cos((double) f17948m) * ((double) (dimension / 2.0f)));
            invalidateSelf();
        }
        boolean z = obtainStyledAttributes.getBoolean(C5224j.DrawerArrowToggle_spinBars, true);
        if (this.f17954f != z) {
            this.f17954f = z;
            invalidateSelf();
        }
        float round = (float) Math.round(obtainStyledAttributes.getDimension(C5224j.DrawerArrowToggle_gapBetweenBars, BitmapDescriptorFactory.HUE_RED));
        if (round != this.f17953e) {
            this.f17953e = round;
            invalidateSelf();
        }
        this.f17956h = obtainStyledAttributes.getDimensionPixelSize(C5224j.DrawerArrowToggle_drawableSize, 0);
        this.f17951c = (float) Math.round(obtainStyledAttributes.getDimension(C5224j.DrawerArrowToggle_barLength, BitmapDescriptorFactory.HUE_RED));
        this.f17950b = (float) Math.round(obtainStyledAttributes.getDimension(C5224j.DrawerArrowToggle_arrowHeadLength, BitmapDescriptorFactory.HUE_RED));
        this.f17952d = obtainStyledAttributes.getDimension(C5224j.DrawerArrowToggle_arrowShaftLength, BitmapDescriptorFactory.HUE_RED);
        obtainStyledAttributes.recycle();
    }

    public void draw(Canvas canvas) {
        float f;
        float f2;
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        int i = this.f17960l;
        boolean z = false;
        int i2 = 1;
        if (i != 0 && (i == 1 || (i == 3 ? C5450a.m13599b(this) == 0 : C5450a.m13599b(this) == 1))) {
            z = true;
        }
        float f3 = this.f17950b;
        float sqrt = (float) Math.sqrt((double) (f3 * f3 * 2.0f));
        float f4 = this.f17951c;
        float f5 = this.f17958j;
        float c = C16759e.m42347c(sqrt, f4, f5, f4);
        float c2 = C16759e.m42347c(this.f17952d, f4, f5, f4);
        float round = (float) Math.round(((this.f17959k - BitmapDescriptorFactory.HUE_RED) * f5) + BitmapDescriptorFactory.HUE_RED);
        float f6 = f17948m;
        float f7 = this.f17958j;
        float c3 = C16759e.m42347c(f6, BitmapDescriptorFactory.HUE_RED, f7, BitmapDescriptorFactory.HUE_RED);
        if (z) {
            f = BitmapDescriptorFactory.HUE_RED;
        } else {
            f = -180.0f;
        }
        if (z) {
            f2 = 180.0f;
        } else {
            f2 = BitmapDescriptorFactory.HUE_RED;
        }
        float c4 = C16759e.m42347c(f2, f, f7, f);
        double d = (double) c;
        double d2 = (double) c3;
        float f8 = c4;
        float round2 = (float) Math.round(Math.cos(d2) * d);
        float round3 = (float) Math.round(Math.sin(d2) * d);
        this.f17955g.rewind();
        float strokeWidth = this.f17949a.getStrokeWidth() + this.f17953e;
        float c5 = C16759e.m42347c(-this.f17959k, strokeWidth, this.f17958j, strokeWidth);
        float f9 = (-c2) / 2.0f;
        this.f17955g.moveTo(f9 + round, BitmapDescriptorFactory.HUE_RED);
        this.f17955g.rLineTo(c2 - (round * 2.0f), BitmapDescriptorFactory.HUE_RED);
        this.f17955g.moveTo(f9, c5);
        this.f17955g.rLineTo(round2, round3);
        this.f17955g.moveTo(f9, -c5);
        this.f17955g.rLineTo(round2, -round3);
        this.f17955g.close();
        canvas.save();
        float strokeWidth2 = this.f17949a.getStrokeWidth();
        float height = ((float) bounds.height()) - (3.0f * strokeWidth2);
        float f11 = this.f17953e;
        float centerX = (float) bounds.centerX();
        canvas2.translate(centerX, (strokeWidth2 * 1.5f) + f11 + ((float) ((((int) (height - (2.0f * f11))) / 4) * 2)));
        if (this.f17954f) {
            if (this.f17957i ^ z) {
                i2 = -1;
            }
            canvas2.rotate(f8 * ((float) i2));
        } else if (z) {
            canvas2.rotate(180.0f);
        }
        canvas2.drawPath(this.f17955g, this.f17949a);
        canvas.restore();
    }

    public final int getIntrinsicHeight() {
        return this.f17956h;
    }

    public final int getIntrinsicWidth() {
        return this.f17956h;
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
        if (i != this.f17949a.getAlpha()) {
            this.f17949a.setAlpha(i);
            invalidateSelf();
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f17949a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
