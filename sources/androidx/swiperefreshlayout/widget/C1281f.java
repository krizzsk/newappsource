package androidx.swiperefreshlayout.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: androidx.swiperefreshlayout.widget.f */
public final class C1281f extends Animation {

    /* renamed from: b */
    public final /* synthetic */ SwipeRefreshLayout f4861b;

    public C1281f(SwipeRefreshLayout swipeRefreshLayout) {
        this.f4861b = swipeRefreshLayout;
    }

    public final void applyTransformation(float f, Transformation transformation) {
        this.f4861b.setAnimationProgress(1.0f - f);
    }
}
