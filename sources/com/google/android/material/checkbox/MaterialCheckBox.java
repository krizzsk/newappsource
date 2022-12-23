package com.google.android.material.checkbox;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.widget.C0786c;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.internal.C14083r;
import com.google.android.play.core.assetpacks.C14256d1;
import p141k1.C5450a;
import p355ac.C13401b;
import p355ac.C13410k;

public class MaterialCheckBox extends AppCompatCheckBox {

    /* renamed from: i */
    public static final int f34498i = C13410k.Widget_MaterialComponents_CompoundButton_CheckBox;

    /* renamed from: j */
    public static final int[][] f34499j = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: f */
    public ColorStateList f34500f;

    /* renamed from: g */
    public boolean f34501g;

    /* renamed from: h */
    public boolean f34502h;

    public MaterialCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C13401b.checkboxStyle);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f34500f == null) {
            int[][] iArr = f34499j;
            int c = C14256d1.m35485c(C13401b.colorControlActivated, this);
            int c2 = C14256d1.m35485c(C13401b.colorSurface, this);
            int c3 = C14256d1.m35485c(C13401b.colorOnSurface, this);
            this.f34500f = new ColorStateList(iArr, new int[]{C14256d1.m35491i(1.0f, c2, c), C14256d1.m35491i(0.54f, c2, c3), C14256d1.m35491i(0.38f, c2, c3), C14256d1.m35491i(0.38f, c2, c3)});
        }
        return this.f34500f;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f34501g && C0786c.C0787a.m2390a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public final void onDraw(Canvas canvas) {
        Drawable a;
        int i;
        if (!this.f34502h || !TextUtils.isEmpty(getText()) || (a = C0786c.m2389a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        if (C14083r.m35068d(this)) {
            i = -1;
        } else {
            i = 1;
        }
        int width = ((getWidth() - a.getIntrinsicWidth()) / 2) * i;
        int save = canvas.save();
        canvas.translate((float) width, BitmapDescriptorFactory.HUE_RED);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
        if (getBackground() != null) {
            Rect bounds = a.getBounds();
            C5450a.C5452b.m13615f(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.f34502h = z;
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f34501g = z;
        if (z) {
            C0786c.C0787a.m2392c(this, getMaterialThemeColorsTintList());
        } else {
            C0786c.C0787a.m2392c(this, (ColorStateList) null);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialCheckBox(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = f34498i
            android.content.Context r8 = p883wc.C20289a.m47861a(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = p355ac.C13411l.MaterialCheckBox
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.C14077m.m35060d(r0, r1, r2, r3, r4, r5)
            int r10 = p355ac.C13411l.MaterialCheckBox_buttonTint
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L_0x0028
            android.content.res.ColorStateList r8 = p742qc.C19099c.m46247a(r8, r9, r10)
            androidx.core.widget.C0786c.C0787a.m2392c(r7, r8)
        L_0x0028:
            int r8 = p355ac.C13411l.MaterialCheckBox_useMaterialThemeColors
            boolean r8 = r9.getBoolean(r8, r6)
            r7.f34501g = r8
            int r8 = p355ac.C13411l.MaterialCheckBox_centerIfNoTextEnabled
            r10 = 1
            boolean r8 = r9.getBoolean(r8, r10)
            r7.f34502h = r8
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.checkbox.MaterialCheckBox.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
