package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p355ac.C13401b;
import p355ac.C13403d;
import p355ac.C13410k;
import p355ac.C13411l;

class ClockHandView extends View {

    /* renamed from: b */
    public final ArrayList f35688b;

    /* renamed from: c */
    public final int f35689c;

    /* renamed from: d */
    public final float f35690d;

    /* renamed from: e */
    public final Paint f35691e;

    /* renamed from: f */
    public final RectF f35692f;

    /* renamed from: g */
    public final int f35693g;

    /* renamed from: h */
    public float f35694h;

    /* renamed from: i */
    public boolean f35695i;

    /* renamed from: j */
    public double f35696j;

    /* renamed from: k */
    public int f35697k;

    /* renamed from: com.google.android.material.timepicker.ClockHandView$a */
    public interface C14209a {
        /* renamed from: b */
        void mo42647b(float f);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C13401b.materialClockStyle);
    }

    /* renamed from: a */
    public final void mo42651a(float f) {
        mo42652b(f, false);
    }

    /* renamed from: b */
    public final void mo42652b(float f, boolean z) {
        float f2 = f % 360.0f;
        this.f35694h = f2;
        this.f35696j = Math.toRadians((double) (f2 - 90.0f));
        float cos = (((float) this.f35697k) * ((float) Math.cos(this.f35696j))) + ((float) (getWidth() / 2));
        float sin = (((float) this.f35697k) * ((float) Math.sin(this.f35696j))) + ((float) (getHeight() / 2));
        RectF rectF = this.f35692f;
        float f3 = (float) this.f35689c;
        rectF.set(cos - f3, sin - f3, cos + f3, sin + f3);
        Iterator it = this.f35688b.iterator();
        while (it.hasNext()) {
            ((C14209a) it.next()).mo42647b(f2);
        }
        invalidate();
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f = (float) width;
        float f2 = (float) height;
        this.f35691e.setStrokeWidth(BitmapDescriptorFactory.HUE_RED);
        canvas.drawCircle((((float) this.f35697k) * ((float) Math.cos(this.f35696j))) + f, (((float) this.f35697k) * ((float) Math.sin(this.f35696j))) + f2, (float) this.f35689c, this.f35691e);
        double sin = Math.sin(this.f35696j);
        double cos = Math.cos(this.f35696j);
        double d = (double) ((float) (this.f35697k - this.f35689c));
        float f3 = (float) (width + ((int) (cos * d)));
        float f4 = (float) (height + ((int) (d * sin)));
        this.f35691e.setStrokeWidth((float) this.f35693g);
        canvas.drawLine(f, f2, f3, f4, this.f35691e);
        canvas.drawCircle(f, f2, this.f35690d, this.f35691e);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        mo42651a(this.f35694h);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        boolean z4 = false;
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 2) {
                z2 = this.f35695i;
            } else {
                z2 = false;
            }
            z = false;
        } else {
            this.f35695i = false;
            z2 = false;
            z = true;
        }
        boolean z5 = this.f35695i;
        int degrees = ((int) Math.toDegrees(Math.atan2((double) (y - ((float) (getHeight() / 2))), (double) (x - ((float) (getWidth() / 2)))))) + 90;
        if (degrees < 0) {
            degrees += 360;
        }
        float f = (float) degrees;
        if (this.f35694h != f) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z || !z3) {
            if (z3 || z2) {
                mo42651a(f);
            }
            this.f35695i = z5 | z4;
            return true;
        }
        z4 = true;
        this.f35695i = z5 | z4;
        return true;
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f35688b = new ArrayList();
        Paint paint = new Paint();
        this.f35691e = paint;
        this.f35692f = new RectF();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C13411l.ClockHandView, i, C13410k.Widget_MaterialComponents_TimePicker_Clock);
        this.f35697k = obtainStyledAttributes.getDimensionPixelSize(C13411l.ClockHandView_materialCircleRadius, 0);
        this.f35689c = obtainStyledAttributes.getDimensionPixelSize(C13411l.ClockHandView_selectorSize, 0);
        Resources resources = getResources();
        this.f35693g = resources.getDimensionPixelSize(C13403d.material_clock_hand_stroke_width);
        this.f35690d = (float) resources.getDimensionPixelSize(C13403d.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(C13411l.ClockHandView_clockHandColor, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        mo42651a(BitmapDescriptorFactory.HUE_RED);
        ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        C6333d0.C6337d.m15059s(this, 2);
        obtainStyledAttributes.recycle();
    }
}
