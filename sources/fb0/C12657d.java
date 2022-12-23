package fb0;

import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import cb0.C7583b;
import com.p341rd.C7981a;
import eb0.C12627d;

/* renamed from: fb0.d */
public class C12657d extends C12653b {

    /* renamed from: g */
    public int f31281g;

    /* renamed from: h */
    public float f31282h;

    /* renamed from: i */
    public C12627d f31283i = new C12627d();

    /* renamed from: fb0.d$a */
    public class C12658a implements ValueAnimator.AnimatorUpdateListener {
        public C12658a() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C12657d dVar = C12657d.this;
            dVar.getClass();
            int intValue = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR")).intValue();
            int intValue2 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR_REVERSE")).intValue();
            int intValue3 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_SCALE")).intValue();
            int intValue4 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_SCALE_REVERSE")).intValue();
            C12627d dVar2 = dVar.f31283i;
            dVar2.f31211a = intValue;
            dVar2.f31212b = intValue2;
            dVar2.f31220c = intValue3;
            dVar2.f31221d = intValue4;
            C7583b.C7584a aVar = dVar.f31271b;
            if (aVar != null) {
                ((C7981a) aVar).mo24975b(dVar2);
            }
        }
    }

    public C12657d(C7583b.C7584a aVar) {
        super(aVar);
    }

    /* renamed from: d */
    public final ValueAnimator mo24976a() {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(350);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new C12658a());
        return valueAnimator;
    }

    /* renamed from: g */
    public PropertyValuesHolder mo39441g(boolean z) {
        int i;
        String str;
        int i2;
        if (z) {
            i = this.f31281g;
            i2 = (int) (((float) i) * this.f31282h);
            str = "ANIMATION_SCALE_REVERSE";
        } else {
            i2 = this.f31281g;
            i = (int) (((float) i2) * this.f31282h);
            str = "ANIMATION_SCALE";
        }
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt(str, new int[]{i, i2});
        ofInt.setEvaluator(new IntEvaluator());
        return ofInt;
    }

    /* renamed from: h */
    public final void mo39442h(int i, float f, int i2, int i3) {
        boolean z;
        if (this.f31272c != null) {
            if (this.f31274e == i && this.f31275f == i2 && this.f31281g == i3 && this.f31282h == f) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                this.f31274e = i;
                this.f31275f = i2;
                this.f31281g = i3;
                this.f31282h = f;
                ((ValueAnimator) this.f31272c).setValues(new PropertyValuesHolder[]{mo39435e(false), mo39435e(true), mo39441g(false), mo39441g(true)});
            }
        }
    }
}
