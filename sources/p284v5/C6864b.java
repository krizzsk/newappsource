package p284v5;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import com.appboy.p044ui.inappmessage.listeners.SwipeDismissTouchListener;

/* renamed from: v5.b */
public final /* synthetic */ class C6864b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ SwipeDismissTouchListener f21218a;

    /* renamed from: b */
    public final /* synthetic */ ViewGroup.LayoutParams f21219b;

    public /* synthetic */ C6864b(SwipeDismissTouchListener swipeDismissTouchListener, ViewGroup.LayoutParams layoutParams) {
        this.f21218a = swipeDismissTouchListener;
        this.f21219b = layoutParams;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f21218a.lambda$performDismiss$0(this.f21219b, valueAnimator);
    }
}
