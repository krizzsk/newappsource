package p718pc;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import p004a3.C0050b;

/* renamed from: pc.f */
public final class C18896f extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C18897g f48093a;

    public C18896f(C18897g gVar) {
        this.f48093a = gVar;
    }

    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f48093a.mo21794c();
        C0050b bVar = this.f48093a.f48106k;
        if (bVar != null) {
            bVar.mo26a();
        }
    }
}
