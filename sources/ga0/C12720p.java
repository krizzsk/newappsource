package ga0;

import android.animation.Animator;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import j00.C17682a;

/* renamed from: ga0.p */
public final class C12720p extends C17682a {

    /* renamed from: a */
    public final /* synthetic */ View f31414a;

    /* renamed from: b */
    public final /* synthetic */ View f31415b;

    public C12720p(Toolbar toolbar, View view) {
        this.f31414a = toolbar;
        this.f31415b = view;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f31415b.setVisibility(4);
    }

    public final void onAnimationStart(Animator animator) {
        this.f31414a.setVisibility(0);
    }
}
