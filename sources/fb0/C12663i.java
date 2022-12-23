package fb0;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import cb0.C7583b;
import eb0.C12629f;

/* renamed from: fb0.i */
public final class C12663i extends C12652a<ValueAnimator> {

    /* renamed from: d */
    public int f31290d = -1;

    /* renamed from: e */
    public int f31291e = -1;

    /* renamed from: f */
    public C12629f f31292f = new C12629f();

    public C12663i(C7583b.C7584a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public final Animator mo24976a() {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(350);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new C12662h(this));
        return valueAnimator;
    }
}
