package fb0;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import cb0.C7583b;
import com.p341rd.C7981a;
import eb0.C12630g;

/* renamed from: fb0.j */
public final class C12664j extends C12666k {

    /* renamed from: i */
    public C12630g f31293i = new C12630g();

    /* renamed from: fb0.j$a */
    public class C12665a implements ValueAnimator.AnimatorUpdateListener {
        public C12665a() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C12664j jVar = C12664j.this;
            jVar.f31293i.f31225c = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            C7583b.C7584a aVar = jVar.f31271b;
            if (aVar != null) {
                ((C7981a) aVar).mo24975b(jVar.f31293i);
            }
        }
    }

    public C12664j(C7583b.C7584a aVar) {
        super(aVar);
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C12666k mo39446f(float f) {
        throw null;
    }

    /* renamed from: g */
    public final ValueAnimator mo39447g(int i, int i2, long j) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.setDuration(j);
        ofInt.addUpdateListener(new C12665a());
        return ofInt;
    }

    /* renamed from: h */
    public final void mo39448h(float f) {
        T t = this.f31272c;
        if (t != null) {
            long j = (long) (f * ((float) this.f31270a));
            int size = ((AnimatorSet) t).getChildAnimations().size();
            for (int i = 0; i < size; i++) {
                ValueAnimator valueAnimator = (ValueAnimator) ((AnimatorSet) this.f31272c).getChildAnimations().get(i);
                long startDelay = j - valueAnimator.getStartDelay();
                long duration = valueAnimator.getDuration();
                if (startDelay > duration) {
                    startDelay = duration;
                } else if (startDelay < 0) {
                    startDelay = 0;
                }
                if ((i != size - 1 || startDelay > 0) && valueAnimator.getValues() != null && valueAnimator.getValues().length > 0) {
                    valueAnimator.setCurrentPlayTime(startDelay);
                }
            }
        }
    }
}
