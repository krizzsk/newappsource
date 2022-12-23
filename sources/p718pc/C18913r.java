package p718pc;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import p004a3.C0050b;

/* renamed from: pc.r */
public final class C18913r extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C18914s f48142a;

    public C18913r(C18914s sVar) {
        this.f48142a = sVar;
    }

    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f48142a.mo21794c();
        C0050b bVar = this.f48142a.f48153k;
        if (bVar != null) {
            bVar.mo26a();
        }
    }
}
