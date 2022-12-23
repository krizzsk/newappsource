package p718pc;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: pc.o */
public final class C18909o extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C18910p f48133a;

    public C18909o(C18910p pVar) {
        this.f48133a = pVar;
    }

    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        C18910p pVar = this.f48133a;
        pVar.f48138g = (pVar.f48138g + 1) % pVar.f48137f.f48084c.length;
        pVar.f48139h = true;
    }
}
