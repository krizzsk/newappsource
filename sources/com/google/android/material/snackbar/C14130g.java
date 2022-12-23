package com.google.android.material.snackbar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.ViewGroup;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import p380bc.C13577a;
import p835uc.C19879b;
import p835uc.C19883f;

/* renamed from: com.google.android.material.snackbar.g */
public final class C14130g implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ BaseTransientBottomBar f35350b;

    public C14130g(BaseTransientBottomBar baseTransientBottomBar) {
        this.f35350b = baseTransientBottomBar;
    }

    public final void run() {
        BaseTransientBottomBar.C14121f fVar = this.f35350b.f35310c;
        if (fVar != null) {
            if (fVar.getParent() != null) {
                this.f35350b.f35310c.setVisibility(0);
            }
            if (this.f35350b.f35310c.getAnimationMode() == 1) {
                BaseTransientBottomBar baseTransientBottomBar = this.f35350b;
                baseTransientBottomBar.getClass();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{BitmapDescriptorFactory.HUE_RED, 1.0f});
                ofFloat.setInterpolator(C13577a.f33537a);
                ofFloat.addUpdateListener(new C14124a(baseTransientBottomBar));
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
                ofFloat2.setInterpolator(C13577a.f33540d);
                ofFloat2.addUpdateListener(new C14125b(baseTransientBottomBar));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
                animatorSet.setDuration(150);
                animatorSet.addListener(new C19883f(baseTransientBottomBar));
                animatorSet.start();
                return;
            }
            BaseTransientBottomBar baseTransientBottomBar2 = this.f35350b;
            int height = baseTransientBottomBar2.f35310c.getHeight();
            ViewGroup.LayoutParams layoutParams = baseTransientBottomBar2.f35310c.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                height += ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            }
            baseTransientBottomBar2.f35310c.setTranslationY((float) height);
            ValueAnimator valueAnimator = new ValueAnimator();
            valueAnimator.setIntValues(new int[]{height, 0});
            valueAnimator.setInterpolator(C13577a.f33538b);
            valueAnimator.setDuration(250);
            valueAnimator.addListener(new C19879b(baseTransientBottomBar2));
            valueAnimator.addUpdateListener(new C14126c(baseTransientBottomBar2, height));
            valueAnimator.start();
        }
    }
}
