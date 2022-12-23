package p647mc;

import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: mc.d */
public final class C18358d implements TypeEvaluator<Float> {

    /* renamed from: a */
    public FloatEvaluator f46810a = new FloatEvaluator();

    public final Object evaluate(float f, Object obj, Object obj2) {
        float floatValue = this.f46810a.evaluate(f, (Float) obj, (Float) obj2).floatValue();
        if (floatValue < 0.1f) {
            floatValue = BitmapDescriptorFactory.HUE_RED;
        }
        return Float.valueOf(floatValue);
    }
}
