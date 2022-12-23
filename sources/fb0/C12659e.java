package fb0;

import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;
import cb0.C7583b;

/* renamed from: fb0.e */
public final class C12659e extends C12657d {
    public C12659e(C7583b.C7584a aVar) {
        super(aVar);
    }

    /* renamed from: g */
    public final PropertyValuesHolder mo39441g(boolean z) {
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
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt(str, new int[]{i2, i});
        ofInt.setEvaluator(new IntEvaluator());
        return ofInt;
    }
}
