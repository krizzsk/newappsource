package p931yc;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.transformation.ExpandableTransformationBehavior;

/* renamed from: yc.a */
public final class C20711a extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ ExpandableTransformationBehavior f52300a;

    public C20711a(ExpandableTransformationBehavior expandableTransformationBehavior) {
        this.f52300a = expandableTransformationBehavior;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f52300a.f35717b = null;
    }
}
