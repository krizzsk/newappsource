package androidx.fragment.app;

import android.transition.Transition;

/* renamed from: androidx.fragment.app.m0 */
public final class C0950m0 implements Transition.TransitionListener {

    /* renamed from: a */
    public final /* synthetic */ Runnable f3823a;

    public C0950m0(C0938k kVar) {
        this.f3823a = kVar;
    }

    public final void onTransitionCancel(Transition transition) {
    }

    public final void onTransitionEnd(Transition transition) {
        this.f3823a.run();
    }

    public final void onTransitionPause(Transition transition) {
    }

    public final void onTransitionResume(Transition transition) {
    }

    public final void onTransitionStart(Transition transition) {
    }
}
