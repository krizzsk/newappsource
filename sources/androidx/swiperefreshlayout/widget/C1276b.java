package androidx.swiperefreshlayout.widget;

import android.animation.ValueAnimator;
import androidx.swiperefreshlayout.widget.C1278d;

/* renamed from: androidx.swiperefreshlayout.widget.b */
public final class C1276b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C1278d.C1279a f4826a;

    /* renamed from: b */
    public final /* synthetic */ C1278d f4827b;

    public C1276b(C1278d dVar, C1278d.C1279a aVar) {
        this.f4827b = dVar;
        this.f4826a = aVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C1278d dVar = this.f4827b;
        C1278d.C1279a aVar = this.f4826a;
        dVar.getClass();
        C1278d.m3453d(floatValue, aVar);
        this.f4827b.mo5338a(floatValue, this.f4826a, false);
        this.f4827b.invalidateSelf();
    }
}
