package com.google.android.exoplayer2.p052ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* renamed from: com.google.android.exoplayer2.ui.AspectRatioFrameLayout */
public final class AspectRatioFrameLayout extends FrameLayout {

    /* renamed from: b */
    public final C4004b f14150b;

    /* renamed from: c */
    public float f14151c;

    /* renamed from: d */
    public int f14152d = 0;

    /* renamed from: com.google.android.exoplayer2.ui.AspectRatioFrameLayout$a */
    public interface C4003a {
        /* renamed from: a */
        void mo16348a();
    }

    /* renamed from: com.google.android.exoplayer2.ui.AspectRatioFrameLayout$b */
    public final class C4004b implements Runnable {

        /* renamed from: b */
        public boolean f14153b;

        public C4004b() {
        }

        public final void run() {
            this.f14153b = false;
            AspectRatioFrameLayout.this.getClass();
        }
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C4046o.AspectRatioFrameLayout, 0, 0);
            try {
                this.f14152d = obtainStyledAttributes.getInt(C4046o.AspectRatioFrameLayout_resize_mode, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f14150b = new C4004b();
    }

    public int getResizeMode() {
        return this.f14152d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x007a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            float r8 = r7.f14151c
            r9 = 0
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 > 0) goto L_0x000b
            return
        L_0x000b:
            int r8 = r7.getMeasuredWidth()
            int r0 = r7.getMeasuredHeight()
            float r1 = (float) r8
            float r2 = (float) r0
            float r3 = r1 / r2
            float r4 = r7.f14151c
            float r4 = r4 / r3
            r3 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 - r3
            float r3 = java.lang.Math.abs(r4)
            r5 = 1008981770(0x3c23d70a, float:0.01)
            r6 = 1
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 > 0) goto L_0x0040
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout$b r8 = r7.f14150b
            r8.getClass()
            r8.getClass()
            r8.getClass()
            boolean r9 = r8.f14153b
            if (r9 != 0) goto L_0x003f
            r8.f14153b = r6
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout r9 = com.google.android.exoplayer2.p052ui.AspectRatioFrameLayout.this
            r9.post(r8)
        L_0x003f:
            return
        L_0x0040:
            int r3 = r7.f14152d
            if (r3 == 0) goto L_0x005d
            if (r3 == r6) goto L_0x005a
            r5 = 2
            if (r3 == r5) goto L_0x0057
            r5 = 4
            if (r3 == r5) goto L_0x004d
            goto L_0x006b
        L_0x004d:
            int r9 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r9 <= 0) goto L_0x0054
            float r8 = r7.f14151c
            goto L_0x0068
        L_0x0054:
            float r9 = r7.f14151c
            goto L_0x0063
        L_0x0057:
            float r8 = r7.f14151c
            goto L_0x0068
        L_0x005a:
            float r9 = r7.f14151c
            goto L_0x0063
        L_0x005d:
            int r9 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r9 <= 0) goto L_0x0066
            float r9 = r7.f14151c
        L_0x0063:
            float r1 = r1 / r9
            int r0 = (int) r1
            goto L_0x006b
        L_0x0066:
            float r8 = r7.f14151c
        L_0x0068:
            float r2 = r2 * r8
            int r8 = (int) r2
        L_0x006b:
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout$b r9 = r7.f14150b
            r9.getClass()
            r9.getClass()
            r9.getClass()
            boolean r1 = r9.f14153b
            if (r1 != 0) goto L_0x0081
            r9.f14153b = r6
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout r1 = com.google.android.exoplayer2.p052ui.AspectRatioFrameLayout.this
            r1.post(r9)
        L_0x0081:
            r9 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r9)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r9)
            super.onMeasure(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p052ui.AspectRatioFrameLayout.onMeasure(int, int):void");
    }

    public void setAspectRatio(float f) {
        if (this.f14151c != f) {
            this.f14151c = f;
            requestLayout();
        }
    }

    public void setAspectRatioListener(C4003a aVar) {
    }

    public void setResizeMode(int i) {
        if (this.f14152d != i) {
            this.f14152d = i;
            requestLayout();
        }
    }
}
