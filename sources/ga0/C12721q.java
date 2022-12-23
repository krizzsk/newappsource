package ga0;

import android.animation.Animator;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import j00.C17682a;

/* renamed from: ga0.q */
public final class C12721q extends C17682a {

    /* renamed from: a */
    public final /* synthetic */ View f31416a;

    /* renamed from: b */
    public final /* synthetic */ View f31417b;

    public C12721q(View view, Toolbar toolbar) {
        this.f31416a = view;
        this.f31417b = toolbar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f31417b.setVisibility(4);
    }

    public final void onAnimationStart(Animator animator) {
        this.f31416a.setVisibility(0);
    }
}
