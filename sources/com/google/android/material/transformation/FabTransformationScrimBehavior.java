package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import p380bc.C13584h;
import p583jk.C17884p;

@Deprecated
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    public final C13584h f35729c = new C13584h(75);

    /* renamed from: d */
    public final C13584h f35730d = new C13584h(0);

    /* renamed from: com.google.android.material.transformation.FabTransformationScrimBehavior$a */
    public class C14219a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ boolean f35731a;

        /* renamed from: b */
        public final /* synthetic */ View f35732b;

        public C14219a(boolean z, View view) {
            this.f35731a = z;
            this.f35732b = view;
        }

        public final void onAnimationEnd(Animator animator) {
            if (!this.f35731a) {
                this.f35732b.setVisibility(4);
            }
        }

        public final void onAnimationStart(Animator animator) {
            if (this.f35731a) {
                this.f35732b.setVisibility(0);
            }
        }
    }

    public FabTransformationScrimBehavior() {
    }

    /* renamed from: b */
    public final AnimatorSet mo42675b(View view, View view2, boolean z, boolean z2) {
        C13584h hVar;
        ObjectAnimator objectAnimator;
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        if (z) {
            hVar = this.f35729c;
        } else {
            hVar = this.f35730d;
        }
        if (z) {
            if (!z2) {
                view2.setAlpha(BitmapDescriptorFactory.HUE_RED);
            }
            objectAnimator = ObjectAnimator.ofFloat(view2, View.ALPHA, new float[]{1.0f});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view2, View.ALPHA, new float[]{0.0f});
        }
        hVar.mo40472a(objectAnimator);
        arrayList.add(objectAnimator);
        AnimatorSet animatorSet = new AnimatorSet();
        C17884p.m44345P(animatorSet, arrayList);
        animatorSet.addListener(new C14219a(z, view2));
        return animatorSet;
    }

    public final boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    public final boolean onTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return super.onTouchEvent(coordinatorLayout, view, motionEvent);
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
