package com.google.android.material.transformation;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import p931yc.C20711a;

@Deprecated
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* renamed from: b */
    public AnimatorSet f35717b;

    public ExpandableTransformationBehavior() {
    }

    /* renamed from: a */
    public void mo42673a(View view, View view2, boolean z, boolean z2) {
        boolean z3;
        AnimatorSet animatorSet = this.f35717b;
        if (animatorSet != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            animatorSet.cancel();
        }
        AnimatorSet b = mo42675b(view, view2, z, z3);
        this.f35717b = b;
        b.addListener(new C20711a(this));
        this.f35717b.start();
        if (!z2) {
            this.f35717b.end();
        }
    }

    /* renamed from: b */
    public abstract AnimatorSet mo42675b(View view, View view2, boolean z, boolean z2);

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
