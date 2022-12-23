package com.moovit.map;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.util.AttributeSet;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.moovit.commons.utils.UiUtils;
import com.moovit.database.sqlite.SQLiteDatabase;
import p824tp.C19735m;
import p824tp.C19748z;

public class CompassView extends FloatingActionButton {

    /* renamed from: A */
    public final Path f42316A;

    /* renamed from: B */
    public final Path f42317B;

    /* renamed from: C */
    public float f42318C;

    /* renamed from: t */
    public final float f42319t;

    /* renamed from: u */
    public final float f42320u;

    /* renamed from: v */
    public final Paint f42321v;

    /* renamed from: w */
    public final Paint f42322w;

    /* renamed from: x */
    public final Paint f42323x;

    /* renamed from: y */
    public final PointF f42324y;

    /* renamed from: z */
    public final Path f42325z;

    public CompassView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C19735m.compassViewStyle);
    }

    public float getNorth() {
        return this.f42318C;
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        float north = getNorth();
        PointF pointF = this.f42324y;
        canvas.rotate(north, pointF.x, pointF.y);
        canvas.drawPath(this.f42325z, this.f42321v);
        canvas.drawPath(this.f42316A, this.f42322w);
        canvas.drawPath(this.f42317B, this.f42323x);
        canvas.restore();
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        float f;
        super.onSizeChanged(i, i2, i3, i4);
        float f2 = ((float) i) / 2.0f;
        float f3 = ((float) i2) / 2.0f;
        this.f42324y.set(f2, f3);
        float min = ((float) Math.min(i, i2)) * 0.5f * this.f42319t;
        float f4 = this.f42320u;
        if (f4 > 1.0f) {
            f = min / f4;
        } else {
            float f5 = f4 * min;
            f = min;
            min = f5;
        }
        this.f42325z.rewind();
        float f6 = f2 - min;
        this.f42325z.moveTo(f6, f3);
        float f7 = min + f3;
        this.f42325z.lineTo(f7, f3);
        float f8 = f3 - f;
        this.f42325z.lineTo(f2, f8);
        this.f42316A.rewind();
        this.f42316A.moveTo(f6, f3);
        this.f42316A.lineTo(f7, f3);
        this.f42316A.lineTo(f2, f3 + f);
        this.f42317B.rewind();
        this.f42317B.moveTo(f2, f8);
        this.f42317B.lineTo(f2, f + f2);
        this.f42317B.lineTo(f6, f3);
    }

    public void setImageBitmap(Bitmap bitmap) {
    }

    public void setImageDrawable(Drawable drawable) {
    }

    public void setImageIcon(Icon icon) {
    }

    public void setNorth(float f) {
        this.f42318C = f;
        invalidate();
    }

    public CompassView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f42324y = new PointF();
        TypedArray o = UiUtils.m40256o(context, attributeSet, C19748z.CompassView, i);
        try {
            this.f42319t = o.getFloat(C19748z.CompassView_rhombusToViewRatio, 0.7f);
            this.f42320u = o.getFloat(C19748z.CompassView_rhombusAspectRatio, 0.4f);
            Paint paint = new Paint(1);
            this.f42321v = paint;
            paint.setColor(o.getColor(C19748z.CompassView_northColor, -65536));
            paint.setStyle(Paint.Style.FILL);
            Paint paint2 = new Paint(1);
            this.f42322w = paint2;
            paint2.setColor(o.getColor(C19748z.CompassView_southColor, -9408400));
            paint2.setStyle(Paint.Style.FILL);
            Paint paint3 = new Paint(1);
            this.f42323x = paint3;
            paint3.setColor(o.getColor(C19748z.CompassView_shadeColor, SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING));
            paint3.setStyle(Paint.Style.FILL);
            this.f42325z = new Path();
            this.f42316A = new Path();
            this.f42317B = new Path();
        } finally {
            o.recycle();
        }
    }
}
