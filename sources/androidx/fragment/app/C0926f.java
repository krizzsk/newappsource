package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.C0911b;
import androidx.fragment.app.SpecialEffectsController;
import java.util.Objects;

/* renamed from: androidx.fragment.app.f */
public final class C0926f implements Animation.AnimationListener {

    /* renamed from: b */
    public final /* synthetic */ SpecialEffectsController.Operation f3748b;

    /* renamed from: c */
    public final /* synthetic */ ViewGroup f3749c;

    /* renamed from: d */
    public final /* synthetic */ View f3750d;

    /* renamed from: e */
    public final /* synthetic */ C0911b.C0913b f3751e;

    /* renamed from: androidx.fragment.app.f$a */
    public class C0927a implements Runnable {
        public C0927a() {
        }

        public final void run() {
            C0926f fVar = C0926f.this;
            fVar.f3749c.endViewTransition(fVar.f3750d);
            C0926f.this.f3751e.mo4054a();
        }
    }

    public C0926f(View view, ViewGroup viewGroup, C0911b.C0913b bVar, SpecialEffectsController.Operation operation) {
        this.f3748b = operation;
        this.f3749c = viewGroup;
        this.f3750d = view;
        this.f3751e = bVar;
    }

    public final void onAnimationEnd(Animation animation) {
        this.f3749c.post(new C0927a());
        if (FragmentManager.m2590J(2)) {
            Objects.toString(this.f3748b);
        }
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
        if (FragmentManager.m2590J(2)) {
            Objects.toString(this.f3748b);
        }
    }
}
