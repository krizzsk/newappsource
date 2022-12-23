package p107h5;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Build;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: h5.a */
public abstract class C5053a extends ValueAnimator {

    /* renamed from: b */
    public final CopyOnWriteArraySet f17042b = new CopyOnWriteArraySet();

    /* renamed from: c */
    public final CopyOnWriteArraySet f17043c = new CopyOnWriteArraySet();

    /* renamed from: a */
    public final void mo20786a(boolean z) {
        Iterator it = this.f17043c.iterator();
        while (it.hasNext()) {
            Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) it.next();
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }

    public final void addListener(Animator.AnimatorListener animatorListener) {
        this.f17043c.add(animatorListener);
    }

    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f17042b.add(animatorUpdateListener);
    }

    /* renamed from: f */
    public final void mo20789f() {
        Iterator it = this.f17042b.iterator();
        while (it.hasNext()) {
            ((ValueAnimator.AnimatorUpdateListener) it.next()).onAnimationUpdate(this);
        }
    }

    public final long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    public final void removeAllListeners() {
        this.f17043c.clear();
    }

    public final void removeAllUpdateListeners() {
        this.f17042b.clear();
    }

    public final void removeListener(Animator.AnimatorListener animatorListener) {
        this.f17043c.remove(animatorListener);
    }

    public final void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f17042b.remove(animatorUpdateListener);
    }

    public final void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    public final void setStartDelay(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    public final ValueAnimator setDuration(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }
}
