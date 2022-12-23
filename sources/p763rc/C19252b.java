package p763rc;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.StateSet;
import com.appboy.support.ValidationUtils;
import p129j1.C5348a;

/* renamed from: rc.b */
public final class C19252b {

    /* renamed from: a */
    public static final int[] f48894a = {16842919};

    /* renamed from: b */
    public static final int[] f48895b = {16842913, 16842919};

    /* renamed from: c */
    public static final int[] f48896c = {16842913};

    /* renamed from: d */
    public static final int[] f48897d = {16842910, 16842919};

    /* renamed from: a */
    public static ColorStateList m46504a(ColorStateList colorStateList) {
        return new ColorStateList(new int[][]{f48896c, StateSet.NOTHING}, new int[]{m46505b(colorStateList, f48895b), m46505b(colorStateList, f48894a)});
    }

    /* renamed from: b */
    public static int m46505b(ColorStateList colorStateList, int[] iArr) {
        int i;
        if (colorStateList != null) {
            i = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        } else {
            i = 0;
        }
        return C5348a.m13417m(i, Math.min(Color.alpha(i) * 2, ValidationUtils.APPBOY_STRING_MAX_LENGTH));
    }

    /* renamed from: c */
    public static ColorStateList m46506c(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 22 && i <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0) {
            Color.alpha(colorStateList.getColorForState(f48897d, 0));
        }
        return colorStateList;
    }

    /* renamed from: d */
    public static boolean m46507d(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }
}
