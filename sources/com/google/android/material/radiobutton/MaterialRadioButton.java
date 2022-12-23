package com.google.android.material.radiobutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.core.widget.C0786c;
import com.google.android.play.core.assetpacks.C14256d1;
import p355ac.C13401b;
import p355ac.C13410k;

public class MaterialRadioButton extends AppCompatRadioButton {

    /* renamed from: h */
    public static final int f35231h = C13410k.Widget_MaterialComponents_CompoundButton_RadioButton;

    /* renamed from: i */
    public static final int[][] f35232i = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: f */
    public ColorStateList f35233f;

    /* renamed from: g */
    public boolean f35234g;

    public MaterialRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C13401b.radioButtonStyle);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f35233f == null) {
            int c = C14256d1.m35485c(C13401b.colorControlActivated, this);
            int c2 = C14256d1.m35485c(C13401b.colorOnSurface, this);
            int c3 = C14256d1.m35485c(C13401b.colorSurface, this);
            this.f35233f = new ColorStateList(f35232i, new int[]{C14256d1.m35491i(1.0f, c3, c), C14256d1.m35491i(0.54f, c3, c2), C14256d1.m35491i(0.38f, c3, c2), C14256d1.m35491i(0.38f, c3, c2)});
        }
        return this.f35233f;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f35234g && C0786c.C0787a.m2390a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f35234g = z;
        if (z) {
            C0786c.C0787a.m2392c(this, getMaterialThemeColorsTintList());
        } else {
            C0786c.C0787a.m2392c(this, (ColorStateList) null);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialRadioButton(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = f35231h
            android.content.Context r8 = p883wc.C20289a.m47861a(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = p355ac.C13411l.MaterialRadioButton
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.C14077m.m35060d(r0, r1, r2, r3, r4, r5)
            int r10 = p355ac.C13411l.MaterialRadioButton_buttonTint
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L_0x0028
            android.content.res.ColorStateList r8 = p742qc.C19099c.m46247a(r8, r9, r10)
            androidx.core.widget.C0786c.C0787a.m2392c(r7, r8)
        L_0x0028:
            int r8 = p355ac.C13411l.MaterialRadioButton_useMaterialThemeColors
            boolean r8 = r9.getBoolean(r8, r6)
            r7.f35234g = r8
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.radiobutton.MaterialRadioButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
