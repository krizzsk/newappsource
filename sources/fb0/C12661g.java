package fb0;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import cb0.C7583b;
import eb0.C12628e;

/* renamed from: fb0.g */
public final class C12661g extends C12652a<ValueAnimator> {

    /* renamed from: d */
    public C12628e f31286d = new C12628e();

    /* renamed from: e */
    public int f31287e = -1;

    /* renamed from: f */
    public int f31288f = -1;

    public C12661g(C7583b.C7584a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public final Animator mo24976a() {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(350);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new C12660f(this));
        return valueAnimator;
    }
}
