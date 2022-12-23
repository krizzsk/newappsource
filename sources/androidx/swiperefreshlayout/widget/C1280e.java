package androidx.swiperefreshlayout.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: androidx.swiperefreshlayout.widget.e */
public final class C1280e extends Animation {

    /* renamed from: b */
    public final /* synthetic */ SwipeRefreshLayout f4860b;

    public C1280e(SwipeRefreshLayout swipeRefreshLayout) {
        this.f4860b = swipeRefreshLayout;
    }

    public final void applyTransformation(float f, Transformation transformation) {
        this.f4860b.setAnimationProgress(f);
    }
}
