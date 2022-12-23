package com.google.android.material.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

@SuppressLint({"AppCompatCustomView"})
public class VisibilityAwareImageButton extends ImageButton {

    /* renamed from: b */
    public int f34976b;

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: b */
    public final void mo41851b(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.f34976b = i;
        }
    }

    public final int getUserSetVisibility() {
        return this.f34976b;
    }

    public void setVisibility(int i) {
        mo41851b(i, true);
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f34976b = getVisibility();
    }
}
