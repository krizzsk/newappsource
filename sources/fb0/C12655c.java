package fb0;

import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import cb0.C7583b;
import com.p341rd.C7981a;
import eb0.C12626c;

/* renamed from: fb0.c */
public final class C12655c extends C12653b {

    /* renamed from: g */
    public C12626c f31277g = new C12626c();

    /* renamed from: h */
    public int f31278h;

    /* renamed from: i */
    public int f31279i;

    /* renamed from: fb0.c$a */
    public class C12656a implements ValueAnimator.AnimatorUpdateListener {
        public C12656a() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C12655c cVar = C12655c.this;
            cVar.getClass();
            int intValue = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR")).intValue();
            int intValue2 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR_REVERSE")).intValue();
            int intValue3 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_RADIUS")).intValue();
            int intValue4 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_RADIUS_REVERSE")).intValue();
            int intValue5 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_STROKE")).intValue();
            int intValue6 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_STROKE_REVERSE")).intValue();
            C12626c cVar2 = cVar.f31277g;
            cVar2.f31211a = intValue;
            cVar2.f31212b = intValue2;
            cVar2.f31216c = intValue3;
            cVar2.f31217d = intValue4;
            cVar2.f31218e = intValue5;
            cVar2.f31219f = intValue6;
            C7583b.C7584a aVar = cVar.f31271b;
            if (aVar != null) {
                ((C7981a) aVar).mo24975b(cVar2);
            }
        }
    }

    public C12655c(C7583b.C7584a aVar) {
        super(aVar);
    }

    /* renamed from: d */
    public final ValueAnimator mo24976a() {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(350);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new C12656a());
        return valueAnimator;
    }

    /* renamed from: g */
    public final PropertyValuesHolder mo39438g(boolean z) {
        int i;
        String str;
        int i2;
        if (z) {
            i = this.f31278h;
            i2 = i / 2;
            str = "ANIMATION_RADIUS_REVERSE";
        } else {
            i2 = this.f31278h;
            i = i2 / 2;
            str = "ANIMATION_RADIUS";
        }
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt(str, new int[]{i2, i});
        ofInt.setEvaluator(new IntEvaluator());
        return ofInt;
    }

    /* renamed from: h */
    public final PropertyValuesHolder mo39439h(boolean z) {
        int i;
        String str;
        int i2;
        if (z) {
            i = this.f31278h;
            str = "ANIMATION_STROKE_REVERSE";
            i2 = 0;
        } else {
            str = "ANIMATION_STROKE";
            i2 = this.f31278h;
            i = 0;
        }
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt(str, new int[]{i, i2});
        ofInt.setEvaluator(new IntEvaluator());
        return ofInt;
    }
}
