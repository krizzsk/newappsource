package com.moovit.commons.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.moovit.commons.utils.UiUtils;
import p622kz.C18165g;
import p977zz.C20941h;

public class DashLineView extends View {

    /* renamed from: b */
    public final Paint f41064b;

    /* renamed from: c */
    public final int f41065c;

    public DashLineView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void onDraw(Canvas canvas) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        if (this.f41065c == 0) {
            float height = (((float) getHeight()) * 0.5f) + ((float) paddingTop);
            canvas.drawLine((float) paddingLeft, height, (float) (getWidth() + paddingLeft), height, this.f41064b);
            return;
        }
        float width = (((float) getWidth()) * 0.5f) + ((float) paddingLeft);
        canvas.drawLine(width, (float) paddingTop, width, (float) (getHeight() + paddingTop), this.f41064b);
    }

    /* JADX INFO: finally extract failed */
    public DashLineView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C18165g.DashLineView, i, 0);
        try {
            int d = C20941h.m49041d(context, obtainStyledAttributes, C18165g.DashLineView_dashGap, UiUtils.m40249h(context.getResources(), 2.0f));
            int d2 = C20941h.m49041d(context, obtainStyledAttributes, C18165g.DashLineView_dashLength, UiUtils.m40249h(context.getResources(), 2.0f));
            int d3 = C20941h.m49041d(context, obtainStyledAttributes, C18165g.DashLineView_dashThickness, UiUtils.m40249h(context.getResources(), 1.0f));
            ColorStateList b = C20941h.m49039b(context, obtainStyledAttributes, C18165g.DashLineView_lineColor);
            int defaultColor = b != null ? b.getDefaultColor() : -16777216;
            this.f41065c = obtainStyledAttributes.getInt(C18165g.DashLineView_orientation, 0);
            obtainStyledAttributes.recycle();
            Paint paint = new Paint();
            this.f41064b = paint;
            paint.setAntiAlias(true);
            paint.setColor(defaultColor);
            paint.setStyle(Paint.Style.FILL);
            paint.setStrokeWidth((float) d3);
            if (d2 != 0 && d != 0) {
                paint.setPathEffect(new DashPathEffect(new float[]{(float) d2, (float) d}, BitmapDescriptorFactory.HUE_RED));
            }
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
