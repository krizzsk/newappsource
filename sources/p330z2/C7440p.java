package p330z2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.transition.Transition;

/* renamed from: z2.p */
public final class C7440p extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ Transition f22853a;

    public C7440p(Transition transition) {
        this.f22853a = transition;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f22853a.mo5420m();
        animator.removeListener(this);
    }
}
