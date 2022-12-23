package fb0;

import android.animation.ArgbEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import cb0.C7583b;
import com.p341rd.C7981a;
import eb0.C12624a;

/* renamed from: fb0.b */
public class C12653b extends C12652a<ValueAnimator> {

    /* renamed from: d */
    public C12624a f31273d = new C12624a();

    /* renamed from: e */
    public int f31274e;

    /* renamed from: f */
    public int f31275f;

    /* renamed from: fb0.b$a */
    public class C12654a implements ValueAnimator.AnimatorUpdateListener {
        public C12654a() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C12653b bVar = C12653b.this;
            bVar.getClass();
            int intValue = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR")).intValue();
            int intValue2 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR_REVERSE")).intValue();
            C12624a aVar = bVar.f31273d;
            aVar.f31211a = intValue;
            aVar.f31212b = intValue2;
            C7583b.C7584a aVar2 = bVar.f31271b;
            if (aVar2 != null) {
                ((C7981a) aVar2).mo24975b(aVar);
            }
        }
    }

    public C12653b(C7583b.C7584a aVar) {
        super(aVar);
    }

    /* renamed from: d */
    public ValueAnimator mo24976a() {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(350);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new C12654a());
        return valueAnimator;
    }

    /* renamed from: e */
    public final PropertyValuesHolder mo39435e(boolean z) {
        int i;
        String str;
        int i2;
        if (z) {
            i = this.f31275f;
            i2 = this.f31274e;
            str = "ANIMATION_COLOR_REVERSE";
        } else {
            i = this.f31274e;
            i2 = this.f31275f;
            str = "ANIMATION_COLOR";
        }
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt(str, new int[]{i, i2});
        ofInt.setEvaluator(new ArgbEvaluator());
        return ofInt;
    }

    /* renamed from: f */
    public final C12652a mo39436f(float f) {
        T t = this.f31272c;
        if (t != null) {
            long j = (long) (f * ((float) this.f31270a));
            if (((ValueAnimator) t).getValues() != null && ((ValueAnimator) this.f31272c).getValues().length > 0) {
                ((ValueAnimator) this.f31272c).setCurrentPlayTime(j);
            }
        }
        return this;
    }
}
