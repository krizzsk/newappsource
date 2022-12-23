package p242s1;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* renamed from: s1.p0 */
public final class C6382p0 {

    /* renamed from: a */
    public final WeakReference<View> f20040a;

    /* renamed from: s1.p0$a */
    public static class C6383a {
        /* renamed from: a */
        public static ViewPropertyAnimator m15228a(ViewPropertyAnimator viewPropertyAnimator, Runnable runnable) {
            return viewPropertyAnimator.withEndAction(runnable);
        }

        /* renamed from: b */
        public static ViewPropertyAnimator m15229b(ViewPropertyAnimator viewPropertyAnimator) {
            return viewPropertyAnimator.withLayer();
        }

        /* renamed from: c */
        public static ViewPropertyAnimator m15230c(ViewPropertyAnimator viewPropertyAnimator, Runnable runnable) {
            return viewPropertyAnimator.withStartAction(runnable);
        }
    }

    /* renamed from: s1.p0$b */
    public static class C6384b {
        /* renamed from: a */
        public static ViewPropertyAnimator m15231a(ViewPropertyAnimator viewPropertyAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            return viewPropertyAnimator.setUpdateListener(animatorUpdateListener);
        }
    }

    public C6382p0(View view) {
        this.f20040a = new WeakReference<>(view);
    }

    /* renamed from: a */
    public final void mo22491a(float f) {
        View view = this.f20040a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    /* renamed from: b */
    public final void mo22492b() {
        View view = this.f20040a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: c */
    public final void mo22493c(float f) {
        View view = this.f20040a.get();
        if (view != null) {
            view.animate().scaleX(f);
        }
    }

    /* renamed from: d */
    public final void mo22494d(float f) {
        View view = this.f20040a.get();
        if (view != null) {
            view.animate().scaleY(f);
        }
    }

    /* renamed from: e */
    public final void mo22495e(long j) {
        View view = this.f20040a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    /* renamed from: f */
    public final void mo22496f(Interpolator interpolator) {
        View view = this.f20040a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
    }

    /* renamed from: g */
    public final void mo22497g(C6386q0 q0Var) {
        View view = this.f20040a.get();
        if (view == null) {
            return;
        }
        if (q0Var != null) {
            view.animate().setListener(new C6380o0(q0Var, view));
        } else {
            view.animate().setListener((Animator.AnimatorListener) null);
        }
    }

    /* renamed from: h */
    public final void mo22498h() {
        View view = this.f20040a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    /* renamed from: i */
    public final void mo22499i(float f) {
        View view = this.f20040a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }

    /* renamed from: j */
    public final void mo22500j(Runnable runnable) {
        View view = this.f20040a.get();
        if (view != null) {
            C6383a.m15228a(view.animate(), runnable);
        }
    }

    /* renamed from: k */
    public final void mo22501k(Runnable runnable) {
        View view = this.f20040a.get();
        if (view != null) {
            C6383a.m15230c(view.animate(), runnable);
        }
    }
}
