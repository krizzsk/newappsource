package androidx.swiperefreshlayout.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: androidx.swiperefreshlayout.widget.g */
public final class C1282g extends Animation {

    /* renamed from: b */
    public final /* synthetic */ int f4862b;

    /* renamed from: c */
    public final /* synthetic */ int f4863c;

    /* renamed from: d */
    public final /* synthetic */ SwipeRefreshLayout f4864d;

    public C1282g(SwipeRefreshLayout swipeRefreshLayout, int i, int i2) {
        this.f4864d = swipeRefreshLayout;
        this.f4862b = i;
        this.f4863c = i2;
    }

    public final void applyTransformation(float f, Transformation transformation) {
        C1278d dVar = this.f4864d.f4783A;
        int i = this.f4862b;
        dVar.setAlpha((int) ((((float) (this.f4863c - i)) * f) + ((float) i)));
    }
}
