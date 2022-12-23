package androidx.fragment.app;

import android.transition.Transition;
import android.view.View;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.l0 */
public final class C0948l0 implements Transition.TransitionListener {

    /* renamed from: a */
    public final /* synthetic */ Object f3815a;

    /* renamed from: b */
    public final /* synthetic */ ArrayList f3816b;

    /* renamed from: c */
    public final /* synthetic */ Object f3817c = null;

    /* renamed from: d */
    public final /* synthetic */ ArrayList f3818d = null;

    /* renamed from: e */
    public final /* synthetic */ Object f3819e;

    /* renamed from: f */
    public final /* synthetic */ ArrayList f3820f;

    /* renamed from: g */
    public final /* synthetic */ C0939k0 f3821g;

    public C0948l0(C0939k0 k0Var, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f3821g = k0Var;
        this.f3815a = obj;
        this.f3816b = arrayList;
        this.f3819e = obj2;
        this.f3820f = arrayList2;
    }

    public final void onTransitionCancel(Transition transition) {
    }

    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    public final void onTransitionPause(Transition transition) {
    }

    public final void onTransitionResume(Transition transition) {
    }

    public final void onTransitionStart(Transition transition) {
        Object obj = this.f3815a;
        if (obj != null) {
            this.f3821g.mo4132t(obj, this.f3816b, (ArrayList<View>) null);
        }
        Object obj2 = this.f3817c;
        if (obj2 != null) {
            this.f3821g.mo4132t(obj2, this.f3818d, (ArrayList<View>) null);
        }
        Object obj3 = this.f3819e;
        if (obj3 != null) {
            this.f3821g.mo4132t(obj3, this.f3820f, (ArrayList<View>) null);
        }
    }
}
