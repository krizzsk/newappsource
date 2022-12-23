package com.moovit.commons.view.behavior;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Keep;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.snackbar.Snackbar;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p068e2.C4524a;
import p242s1.C6333d0;
import p242s1.C6382p0;

@Keep
public class SnackbarAwareBehavior extends CoordinatorLayout.Behavior<View> {
    private ValueAnimator animator;
    private float translationY;

    /* renamed from: com.moovit.commons.view.behavior.SnackbarAwareBehavior$a */
    public class C15809a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ View f41179a;

        public C15809a(View view) {
            this.f41179a = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View view = this.f41179a;
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            view.setTranslationY(floatValue);
        }
    }

    public SnackbarAwareBehavior() {
    }

    private float getTranslationYForSnackbar(CoordinatorLayout coordinatorLayout, View view) {
        ArrayList q = coordinatorLayout.mo3296q(view);
        int size = q.size();
        float f = BitmapDescriptorFactory.HUE_RED;
        for (int i = 0; i < size; i++) {
            View view2 = (View) q.get(i);
            if ((view2 instanceof Snackbar.SnackbarLayout) && coordinatorLayout.mo3278h(view, view2)) {
                WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                f = Math.min(f, view2.getTranslationY() - ((float) view2.getHeight()));
            }
        }
        return f;
    }

    private void updateTranslationForSnackbar(CoordinatorLayout coordinatorLayout, View view, boolean z) {
        float translationYForSnackbar = getTranslationYForSnackbar(coordinatorLayout, view);
        if (this.translationY != translationYForSnackbar) {
            ValueAnimator valueAnimator = this.animator;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.animator.cancel();
            }
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            float translationY2 = view.getTranslationY();
            if (!z || !view.isShown() || Math.abs(translationY2 - translationYForSnackbar) <= ((float) view.getHeight()) * 0.667f) {
                view.setTranslationY(translationYForSnackbar);
            } else {
                if (this.animator == null) {
                    ValueAnimator valueAnimator2 = new ValueAnimator();
                    this.animator = valueAnimator2;
                    valueAnimator2.setInterpolator(new C4524a());
                    this.animator.addUpdateListener(new C15809a(view));
                }
                this.animator.setFloatValues(new float[]{translationY2, translationYForSnackbar});
                this.animator.start();
            }
            this.translationY = translationYForSnackbar;
        }
    }

    public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof Snackbar.SnackbarLayout;
    }

    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (!(view2 instanceof Snackbar.SnackbarLayout)) {
            return false;
        }
        updateTranslationForSnackbar(coordinatorLayout, view, true);
        return false;
    }

    public void onDependentViewRemoved(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view2 instanceof Snackbar.SnackbarLayout) {
            updateTranslationForSnackbar(coordinatorLayout, view, true);
        }
    }

    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.mo3309w(i, view);
        updateTranslationForSnackbar(coordinatorLayout, view, false);
        return true;
    }

    public SnackbarAwareBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
