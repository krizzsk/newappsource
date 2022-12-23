package com.moovit.commons.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.moovit.commons.utils.UiUtils;
import java.util.WeakHashMap;
import p141k1.C5450a;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p622kz.C18165g;

public class DecorationImageView extends AppCompatImageView {

    /* renamed from: b */
    public C15789a f41066b;

    /* renamed from: com.moovit.commons.view.DecorationImageView$a */
    public static class C15789a {

        /* renamed from: a */
        public Drawable f41067a;

        /* renamed from: b */
        public int f41068b = 119;

        /* renamed from: c */
        public boolean f41069c = true;

        /* renamed from: d */
        public boolean f41070d = true;

        /* renamed from: e */
        public final Rect f41071e = new Rect();

        /* renamed from: f */
        public final Rect f41072f = new Rect();
    }

    public DecorationImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void drawableStateChanged() {
        boolean z;
        super.drawableStateChanged();
        Drawable drawable = this.f41066b.f41067a;
        if (drawable != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            drawable.setState(getDrawableState());
        }
    }

    public Drawable getDecoration() {
        return this.f41066b.f41067a;
    }

    public int getDecorationGravity() {
        return this.f41066b.f41068b;
    }

    public boolean getDrawOverPadding() {
        return this.f41066b.f41069c;
    }

    public final void jumpDrawablesToCurrentState() {
        boolean z;
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f41066b.f41067a;
        if (drawable != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            drawable.jumpToCurrentState();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r0 = r8.f41066b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDraw(android.graphics.Canvas r9) {
        /*
            r8 = this;
            super.onDraw(r9)
            android.graphics.drawable.Drawable r0 = r8.getDrawable()
            if (r0 == 0) goto L_0x0066
            com.moovit.commons.view.DecorationImageView$a r0 = r8.f41066b
            android.graphics.drawable.Drawable r1 = r0.f41067a
            if (r1 == 0) goto L_0x0066
            boolean r2 = r0.f41070d
            if (r2 == 0) goto L_0x0063
            r2 = 0
            r0.f41070d = r2
            android.graphics.Rect r3 = r0.f41071e
            android.graphics.Rect r4 = r0.f41072f
            boolean r0 = r0.f41069c
            if (r0 == 0) goto L_0x002a
            int r0 = r8.getWidth()
            int r5 = r8.getHeight()
            r3.set(r2, r2, r0, r5)
            goto L_0x0047
        L_0x002a:
            int r0 = r8.getPaddingLeft()
            int r2 = r8.getPaddingTop()
            int r5 = r8.getWidth()
            int r6 = r8.getPaddingRight()
            int r5 = r5 - r6
            int r6 = r8.getHeight()
            int r7 = r8.getPaddingBottom()
            int r6 = r6 - r7
            r3.set(r0, r2, r5, r6)
        L_0x0047:
            java.util.WeakHashMap<android.view.View, s1.p0> r0 = p242s1.C6333d0.f19990a
            int r0 = p242s1.C6333d0.C6338e.m15063d(r8)
            com.moovit.commons.view.DecorationImageView$a r2 = r8.f41066b
            int r2 = r2.f41068b
            int r0 = android.view.Gravity.getAbsoluteGravity(r2, r0)
            int r2 = r1.getIntrinsicWidth()
            int r5 = r1.getIntrinsicHeight()
            android.view.Gravity.apply(r0, r2, r5, r3, r4)
            r1.setBounds(r4)
        L_0x0063:
            r1.draw(r9)
        L_0x0066:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.commons.view.DecorationImageView.onDraw(android.graphics.Canvas):void");
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        C15789a aVar = this.f41066b;
        boolean z = true;
        aVar.f41070d = true;
        if (aVar.f41067a == null) {
            z = false;
        }
        if (z) {
            invalidate();
        }
    }

    public final void onVisibilityAggregated(boolean z) {
        boolean z2;
        super.onVisibilityAggregated(z);
        Drawable drawable = this.f41066b.f41067a;
        if (drawable != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && z != drawable.isVisible()) {
            this.f41066b.f41067a.setVisible(z, false);
        }
    }

    public void setDecoration(Drawable drawable) {
        Drawable drawable2 = this.f41066b.f41067a;
        if (drawable != drawable2) {
            if (drawable2 != null) {
                WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                if (C6333d0.C6340g.m15075b(this)) {
                    this.f41066b.f41067a.setVisible(false, false);
                }
                this.f41066b.f41067a.setCallback((Drawable.Callback) null);
                unscheduleDrawable(this.f41066b.f41067a);
            }
            C15789a aVar = this.f41066b;
            aVar.f41067a = drawable;
            if (drawable != null) {
                boolean z = true;
                aVar.f41070d = true;
                WeakHashMap<View, C6382p0> weakHashMap2 = C6333d0.f19990a;
                C5450a.m13600c(drawable, C6333d0.C6338e.m15063d(this));
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (C6333d0.C6340g.m15075b(this)) {
                    if (getWindowVisibility() != 0 || !isShown()) {
                        z = false;
                    }
                    drawable.setVisible(z, false);
                }
                drawable.setCallback(this);
            }
            invalidate();
        }
    }

    public void setDecorationGravity(int i) {
        C15789a aVar = this.f41066b;
        if (aVar.f41068b != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            aVar.f41068b = i;
            if (aVar.f41067a != null) {
                aVar.f41070d = true;
                invalidate();
            }
        }
    }

    public void setDrawOverPadding(boolean z) {
        C15789a aVar = this.f41066b;
        if (aVar.f41069c != z) {
            aVar.f41069c = z;
            if (aVar.f41067a != null) {
                aVar.f41070d = true;
                invalidate();
            }
        }
    }

    public DecorationImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f41066b = new C15789a();
        TypedArray o = UiUtils.m40256o(context, attributeSet, C18165g.DecorationImageView, i);
        try {
            this.f41066b.f41068b = o.getInt(C18165g.DecorationImageView_decorationGravity, 0);
            this.f41066b.f41069c = o.getBoolean(C18165g.DecorationImageView_drawOverPadding, true);
        } finally {
            o.recycle();
        }
    }
}
