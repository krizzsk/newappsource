package p380bc;

import android.animation.TypeEvaluator;
import com.appboy.support.ValidationUtils;

/* renamed from: bc.b */
public final class C13578b implements TypeEvaluator<Integer> {

    /* renamed from: a */
    public static final C13578b f33542a = new C13578b();

    /* renamed from: a */
    public static Integer m33995a(float f, Integer num, Integer num2) {
        int intValue = num.intValue();
        float f2 = ((float) ((intValue >> 24) & ValidationUtils.APPBOY_STRING_MAX_LENGTH)) / 255.0f;
        int intValue2 = num2.intValue();
        float pow = (float) Math.pow((double) (((float) ((intValue >> 16) & ValidationUtils.APPBOY_STRING_MAX_LENGTH)) / 255.0f), 2.2d);
        float pow2 = (float) Math.pow((double) (((float) ((intValue >> 8) & ValidationUtils.APPBOY_STRING_MAX_LENGTH)) / 255.0f), 2.2d);
        float pow3 = (float) Math.pow((double) (((float) (intValue & ValidationUtils.APPBOY_STRING_MAX_LENGTH)) / 255.0f), 2.2d);
        float pow4 = (float) Math.pow((double) (((float) ((intValue2 >> 16) & ValidationUtils.APPBOY_STRING_MAX_LENGTH)) / 255.0f), 2.2d);
        float c = C16759e.m42347c(((float) ((intValue2 >> 24) & ValidationUtils.APPBOY_STRING_MAX_LENGTH)) / 255.0f, f2, f, f2);
        float c2 = C16759e.m42347c(pow4, pow, f, pow);
        float c3 = C16759e.m42347c((float) Math.pow((double) (((float) ((intValue2 >> 8) & ValidationUtils.APPBOY_STRING_MAX_LENGTH)) / 255.0f), 2.2d), pow2, f, pow2);
        float c4 = C16759e.m42347c((float) Math.pow((double) (((float) (intValue2 & ValidationUtils.APPBOY_STRING_MAX_LENGTH)) / 255.0f), 2.2d), pow3, f, pow3);
        int round = Math.round(((float) Math.pow((double) c2, 0.45454545454545453d)) * 255.0f) << 16;
        return Integer.valueOf(Math.round(((float) Math.pow((double) c4, 0.45454545454545453d)) * 255.0f) | round | (Math.round(c * 255.0f) << 24) | (Math.round(((float) Math.pow((double) c3, 0.45454545454545453d)) * 255.0f) << 8));
    }

    public final /* bridge */ /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        return m33995a(f, (Integer) obj, (Integer) obj2);
    }
}
