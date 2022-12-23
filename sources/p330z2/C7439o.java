package p330z2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.transition.Transition;
import p241s0.C6302b;

/* renamed from: z2.o */
public final class C7439o extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C6302b f22851a;

    /* renamed from: b */
    public final /* synthetic */ Transition f22852b;

    public C7439o(Transition transition, C6302b bVar) {
        this.f22852b = transition;
        this.f22851a = bVar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f22851a.remove(animator);
        this.f22852b.f4954n.remove(animator);
    }

    public final void onAnimationStart(Animator animator) {
        this.f22852b.f4954n.add(animator);
    }
}
