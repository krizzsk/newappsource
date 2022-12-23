package p670nc;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.TypedValue;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p068e2.C4525b;
import p129j1.C5353d;
import p268u1.C6676a;

/* renamed from: nc.a */
public final class C18537a {
    /* renamed from: a */
    public static float m45453a(int i, String[] strArr) {
        float parseFloat = Float.parseFloat(strArr[i]);
        if (parseFloat >= BitmapDescriptorFactory.HUE_RED && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    /* renamed from: b */
    public static boolean m45454b(String str, String str2) {
        if (!str.startsWith(str2 + "(") || !str.endsWith(")")) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static TimeInterpolator m45455c(Context context, int i, C4525b bVar) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return bVar;
        }
        if (typedValue.type == 3) {
            String valueOf = String.valueOf(typedValue.string);
            if (m45454b(valueOf, "cubic-bezier")) {
                String[] split = valueOf.substring(13, valueOf.length() - 1).split(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
                if (split.length == 4) {
                    return C6676a.m15756b(m45453a(0, split), m45453a(1, split), m45453a(2, split), m45453a(3, split));
                }
                StringBuilder k = C13555b.m33972k("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: ");
                k.append(split.length);
                throw new IllegalArgumentException(k.toString());
            } else if (m45454b(valueOf, "path")) {
                return C6676a.m15757c(C5353d.m13426d(valueOf.substring(5, valueOf.length() - 1)));
            } else {
                throw new IllegalArgumentException(C25541a.m63881k("Invalid motion easing type: ", valueOf));
            }
        } else {
            throw new IllegalArgumentException("Motion easing theme attribute must be a string");
        }
    }
}
