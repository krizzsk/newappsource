package androidx.recyclerview.widget;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.C1227p;

/* renamed from: androidx.recyclerview.widget.r */
public final class C1238r implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C1227p.C1235f f4673a;

    public C1238r(C1227p.C1235f fVar) {
        this.f4673a = fVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f4673a.f4669m = valueAnimator.getAnimatedFraction();
    }
}
