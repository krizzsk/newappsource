package j00;

import android.animation.TypeEvaluator;
import android.annotation.SuppressLint;
import com.appboy.support.ValidationUtils;

@SuppressLint({"NewApi"})
/* renamed from: j00.h */
public final class C17689h {

    /* renamed from: a */
    public static final C17690a f45442a = new C17690a();

    /* renamed from: j00.h$a */
    public static class C17690a implements TypeEvaluator {
        public final Object evaluate(float f, Object obj, Object obj2) {
            int intValue = ((Integer) obj).intValue();
            int i = (intValue >> 24) & ValidationUtils.APPBOY_STRING_MAX_LENGTH;
            int i2 = (intValue >> 16) & ValidationUtils.APPBOY_STRING_MAX_LENGTH;
            int i3 = (intValue >> 8) & ValidationUtils.APPBOY_STRING_MAX_LENGTH;
            int i4 = intValue & ValidationUtils.APPBOY_STRING_MAX_LENGTH;
            int intValue2 = ((Integer) obj2).intValue();
            return Integer.valueOf(((i + ((int) (((float) (((intValue2 >> 24) & ValidationUtils.APPBOY_STRING_MAX_LENGTH) - i)) * f))) << 24) | ((i2 + ((int) (((float) (((intValue2 >> 16) & ValidationUtils.APPBOY_STRING_MAX_LENGTH) - i2)) * f))) << 16) | ((i3 + ((int) (((float) (((intValue2 >> 8) & ValidationUtils.APPBOY_STRING_MAX_LENGTH) - i3)) * f))) << 8) | (i4 + ((int) (f * ((float) ((intValue2 & ValidationUtils.APPBOY_STRING_MAX_LENGTH) - i4))))));
        }
    }
}
