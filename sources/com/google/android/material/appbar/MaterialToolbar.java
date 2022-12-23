package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import ce0.C21100e;
import com.google.android.material.internal.C14078n;
import java.util.ArrayList;
import java.util.Collections;
import p141k1.C5450a;
import p355ac.C13401b;
import p355ac.C13410k;

public class MaterialToolbar extends Toolbar {

    /* renamed from: n0 */
    public static final int f34213n0 = C13410k.Widget_MaterialComponents_Toolbar;

    /* renamed from: o0 */
    public static final ImageView.ScaleType[] f34214o0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: S */
    public Integer f34215S;

    /* renamed from: T */
    public boolean f34216T;

    /* renamed from: U */
    public boolean f34217U;

    /* renamed from: l0 */
    public ImageView.ScaleType f34218l0;

    /* renamed from: m0 */
    public Boolean f34219m0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C13401b.toolbarStyle);
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f34218l0;
    }

    public Integer getNavigationIconTint() {
        return this.f34215S;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C21100e.m49297A0(this);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ImageView imageView;
        Drawable drawable;
        TextView textView;
        TextView textView2;
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        ImageView imageView2 = null;
        if (this.f34216T || this.f34217U) {
            ArrayList a = C14078n.m35062a(this, getTitle());
            if (a.isEmpty()) {
                textView = null;
            } else {
                textView = (TextView) Collections.min(a, C14078n.f35107a);
            }
            ArrayList a2 = C14078n.m35062a(this, getSubtitle());
            if (a2.isEmpty()) {
                textView2 = null;
            } else {
                textView2 = (TextView) Collections.max(a2, C14078n.f35107a);
            }
            if (!(textView == null && textView2 == null)) {
                int measuredWidth = getMeasuredWidth();
                int i6 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i7 = 0; i7 < getChildCount(); i7++) {
                    View childAt = getChildAt(i7);
                    if (!(childAt.getVisibility() == 8 || childAt == textView || childAt == textView2)) {
                        if (childAt.getRight() < i6 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i6 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.f34216T && textView != null) {
                    mo40965s(textView, pair);
                }
                if (this.f34217U && textView2 != null) {
                    mo40965s(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i5 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i5);
                if ((childAt2 instanceof ImageView) && (drawable = imageView.getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = (ImageView) childAt2;
                    break;
                }
                i5++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.f34219m0;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f34218l0;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    /* renamed from: s */
    public final void mo40965s(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i += max;
            i2 -= max;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i, textView.getTop(), i2, textView.getBottom());
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C21100e.m49378z0(this, f);
    }

    public void setLogoAdjustViewBounds(boolean z) {
        Boolean bool = this.f34219m0;
        if (bool == null || bool.booleanValue() != z) {
            this.f34219m0 = Boolean.valueOf(z);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f34218l0 != scaleType) {
            this.f34218l0 = scaleType;
            requestLayout();
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (!(drawable == null || this.f34215S == null)) {
            drawable = C5450a.m13604g(drawable.mutate());
            C5450a.C5452b.m13616g(drawable, this.f34215S.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.f34215S = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.f34217U != z) {
            this.f34217U = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.f34216T != z) {
            this.f34216T = z;
            requestLayout();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialToolbar(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = f34213n0
            android.content.Context r8 = p883wc.C20289a.m47861a(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = p355ac.C13411l.MaterialToolbar
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.C14077m.m35060d(r0, r1, r2, r3, r4, r5)
            int r10 = p355ac.C13411l.MaterialToolbar_navigationIconTint
            boolean r0 = r9.hasValue(r10)
            r1 = -1
            if (r0 == 0) goto L_0x0029
            int r10 = r9.getColor(r10, r1)
            r7.setNavigationIconTint(r10)
        L_0x0029:
            int r10 = p355ac.C13411l.MaterialToolbar_titleCentered
            boolean r10 = r9.getBoolean(r10, r6)
            r7.f34216T = r10
            int r10 = p355ac.C13411l.MaterialToolbar_subtitleCentered
            boolean r10 = r9.getBoolean(r10, r6)
            r7.f34217U = r10
            int r10 = p355ac.C13411l.MaterialToolbar_logoScaleType
            int r10 = r9.getInt(r10, r1)
            if (r10 < 0) goto L_0x004a
            android.widget.ImageView$ScaleType[] r0 = f34214o0
            int r1 = r0.length
            if (r10 >= r1) goto L_0x004a
            r10 = r0[r10]
            r7.f34218l0 = r10
        L_0x004a:
            int r10 = p355ac.C13411l.MaterialToolbar_logoAdjustViewBounds
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L_0x005c
            boolean r10 = r9.getBoolean(r10, r6)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r7.f34219m0 = r10
        L_0x005c:
            r9.recycle()
            android.graphics.drawable.Drawable r9 = r7.getBackground()
            if (r9 == 0) goto L_0x006a
            boolean r10 = r9 instanceof android.graphics.drawable.ColorDrawable
            if (r10 != 0) goto L_0x006a
            goto L_0x008d
        L_0x006a:
            tc.g r10 = new tc.g
            r10.<init>()
            if (r9 == 0) goto L_0x0077
            android.graphics.drawable.ColorDrawable r9 = (android.graphics.drawable.ColorDrawable) r9
            int r6 = r9.getColor()
        L_0x0077:
            android.content.res.ColorStateList r9 = android.content.res.ColorStateList.valueOf(r6)
            r10.mo52005n(r9)
            r10.mo52001k(r8)
            java.util.WeakHashMap<android.view.View, s1.p0> r8 = p242s1.C6333d0.f19990a
            float r8 = p242s1.C6333d0.C6342i.m15092i(r7)
            r10.mo52003m(r8)
            p242s1.C6333d0.C6337d.m15057q(r7, r10)
        L_0x008d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.MaterialToolbar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
