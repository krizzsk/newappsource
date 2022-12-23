package p402cc;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;

/* renamed from: cc.a */
public final class C13781a extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ HideBottomViewOnScrollBehavior f33929a;

    public C13781a(HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior) {
        this.f33929a = hideBottomViewOnScrollBehavior;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f33929a.f34281d = null;
    }
}
