package com.google.android.material.textview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.AppCompatTextView;
import p355ac.C13401b;
import p355ac.C13411l;
import p742qc.C19098b;
import p742qc.C19099c;
import p883wc.C20289a;

public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView() {
        throw null;
    }

    public MaterialTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    /* renamed from: d */
    public final void mo42640d(int i, Resources.Theme theme) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i, C13411l.MaterialTextAppearance);
        Context context = getContext();
        int[] iArr = {C13411l.MaterialTextAppearance_android_lineHeight, C13411l.MaterialTextAppearance_lineHeight};
        int i2 = -1;
        for (int i3 = 0; i3 < 2 && i2 < 0; i3++) {
            i2 = C19099c.m46249c(context, obtainStyledAttributes, iArr[i3], -1);
        }
        obtainStyledAttributes.recycle();
        if (i2 >= 0) {
            setLineHeight(i2);
        }
    }

    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        TypedValue a = C19098b.m46245a(C13401b.textAppearanceLineHeightEnabled, context);
        boolean z = true;
        if (a != null && a.type == 18 && a.data == 0) {
            z = false;
        }
        if (z) {
            mo42640d(i, context.getTheme());
        }
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i) {
        super(C20289a.m47861a(context, attributeSet, i, 0), attributeSet, i);
        Context context2 = getContext();
        TypedValue a = C19098b.m46245a(C13401b.textAppearanceLineHeightEnabled, context2);
        boolean z = true;
        if ((a != null && a.type == 18 && a.data == 0) ? false : true) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = C13411l.MaterialTextView;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, i, 0);
            int[] iArr2 = {C13411l.MaterialTextView_android_lineHeight, C13411l.MaterialTextView_lineHeight};
            int i2 = -1;
            for (int i3 = 0; i3 < 2 && i2 < 0; i3++) {
                i2 = C19099c.m46249c(context2, obtainStyledAttributes, iArr2[i3], -1);
            }
            obtainStyledAttributes.recycle();
            if (!(i2 == -1 ? false : z)) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, i, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(C13411l.MaterialTextView_android_textAppearance, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    mo42640d(resourceId, theme);
                }
            }
        }
    }
}
