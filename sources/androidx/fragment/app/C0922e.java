package androidx.fragment.app;

import android.animation.Animator;
import androidx.fragment.app.SpecialEffectsController;
import java.util.Objects;
import p177n1.C5802d;

/* renamed from: androidx.fragment.app.e */
public final class C0922e implements C5802d.C5803a {

    /* renamed from: a */
    public final /* synthetic */ Animator f3739a;

    /* renamed from: b */
    public final /* synthetic */ SpecialEffectsController.Operation f3740b;

    public C0922e(Animator animator, SpecialEffectsController.Operation operation) {
        this.f3739a = animator;
        this.f3740b = operation;
    }

    public final void onCancel() {
        this.f3739a.end();
        if (FragmentManager.m2590J(2)) {
            Objects.toString(this.f3740b);
        }
    }
}
