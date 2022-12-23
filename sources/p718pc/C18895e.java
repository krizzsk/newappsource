package p718pc;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: pc.e */
public final class C18895e extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C18897g f48092a;

    public C18895e(C18897g gVar) {
        this.f48092a = gVar;
    }

    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        C18897g gVar = this.f48092a;
        gVar.f48103h = (gVar.f48103h + 4) % gVar.f48102g.f48084c.length;
    }
}
