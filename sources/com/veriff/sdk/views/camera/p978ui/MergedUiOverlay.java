package com.veriff.sdk.views.camera.p978ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.usebutton.sdk.internal.api.AppActionRequest;
import kotlin.Metadata;
import mf0.C24362h;
import mobi.lab.veriff.R$styleable;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010B\u0019\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\u0012"}, mo59060d2 = {"Lcom/veriff/sdk/views/camera/ui/MergedUiOverlay;", "Landroid/widget/RelativeLayout;", "Landroid/graphics/Canvas;", "canvas", "Lbf0/d;", "dispatchDraw", "", "clearAreaId", "I", "clearShape", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.views.camera.ui.MergedUiOverlay */
public final class MergedUiOverlay extends RelativeLayout {

    /* renamed from: a */
    private int f58182a;

    /* renamed from: b */
    private int f58183b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @SuppressLint({"CustomViewStyleable"})
    public MergedUiOverlay(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
        C24362h.m61211f(attributeSet, "attrs");
        this.f58182a = -1;
        this.f58183b = -1;
        setLayerType(1, (Paint) null);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.vrffMergedUiOverlay);
        C24362h.m61210e(obtainStyledAttributes, "context.obtainStyledAttr…trs, vrffMergedUiOverlay)");
        this.f58183b = obtainStyledAttributes.getResourceId(R$styleable.vrffMergedUiOverlay_vrff_clear_area, this.f58183b);
        this.f58182a = obtainStyledAttributes.getInt(R$styleable.vrffMergedUiOverlay_vrff_shape_type, this.f58182a);
        obtainStyledAttributes.recycle();
        if (this.f58183b == -1 || this.f58182a == -1) {
            throw new IllegalStateException("Invalid clear area ID or shape");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0046, code lost:
        if (r3 != 3) goto L_0x0062;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dispatchDraw(android.graphics.Canvas r6) {
        /*
            r5 = this;
            java.lang.String r0 = "canvas"
            mf0.C24362h.m61211f(r6, r0)
            android.content.res.Resources r0 = r5.getResources()
            int r1 = mobi.lab.veriff.R$color.vrffMergedUiBack
            int r0 = p116i1.C5247f.m13262a(r0, r1)
            r6.drawColor(r0)
            android.view.ViewParent r0 = r5.getParent()
            if (r0 == 0) goto L_0x0066
            android.view.View r0 = (android.view.View) r0
            int r1 = r5.f58183b
            android.view.View r0 = r0.findViewById(r1)
            mf0.C24362h.m61208c(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.graphics.Paint r1 = new android.graphics.Paint
            r2 = 1
            r1.<init>(r2)
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.FILL
            r1.setStyle(r3)
            r3 = 0
            r1.setColor(r3)
            android.graphics.PorterDuffXfermode r3 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.CLEAR
            r3.<init>(r4)
            r1.setXfermode(r3)
            int r3 = r5.f58182a
            if (r3 == r2) goto L_0x0051
            r2 = 2
            if (r3 == r2) goto L_0x0049
            r2 = 3
            if (r3 == r2) goto L_0x0051
            goto L_0x0062
        L_0x0049:
            android.graphics.RectF r0 = com.veriff.sdk.views.camera.p978ui.C22921e.m56575b(r0)
            r6.drawOval(r0, r1)
            goto L_0x0062
        L_0x0051:
            android.content.res.Resources r2 = r5.getResources()
            int r3 = mobi.lab.veriff.R$dimen.vrff_clear_area_radius
            float r2 = r2.getDimension(r3)
            android.graphics.RectF r0 = com.veriff.sdk.views.camera.p978ui.C22921e.m56575b(r0)
            r6.drawRoundRect(r0, r2, r2, r1)
        L_0x0062:
            super.dispatchDraw(r6)
            return
        L_0x0066:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type android.view.View"
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.views.camera.p978ui.MergedUiOverlay.dispatchDraw(android.graphics.Canvas):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MergedUiOverlay(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
        C24362h.m61211f(attributeSet, "attrs");
    }
}
