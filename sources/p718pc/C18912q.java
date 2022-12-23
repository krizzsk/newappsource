package p718pc;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: pc.q */
public final class C18912q extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C18914s f48141a;

    public C18912q(C18914s sVar) {
        this.f48141a = sVar;
    }

    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        C18914s sVar = this.f48141a;
        sVar.f48150h = (sVar.f48150h + 1) % sVar.f48149g.f48084c.length;
        sVar.f48151i = true;
    }
}
