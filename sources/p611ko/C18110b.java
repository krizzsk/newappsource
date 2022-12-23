package p611ko;

import android.graphics.drawable.GradientDrawable;
import android.util.DisplayMetrics;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p584jl.C17885a;

/* renamed from: ko.b */
public final class C18110b {

    /* renamed from: a */
    public final DisplayMetrics f46305a;

    public C18110b(DisplayMetrics displayMetrics) {
        this.f46305a = displayMetrics;
    }

    /* renamed from: c */
    public static GradientDrawable m44777c(C18110b bVar, int i, float f, float f2, float f3, float f4, int i2) {
        float f5;
        if ((i2 & 64) != 0) {
            f5 = 1.0f;
        } else {
            f5 = BitmapDescriptorFactory.HUE_RED;
        }
        float L = C17885a.m44410L(bVar.f46305a, f);
        float L2 = C17885a.m44410L(bVar.f46305a, f2);
        float L3 = C17885a.m44410L(bVar.f46305a, f3);
        float L4 = C17885a.m44410L(bVar.f46305a, f4);
        GradientDrawable b = bVar.mo50549b(i, (Integer) null, f5);
        b.setCornerRadii(new float[]{L, L, L2, L2, L3, L3, L4, L4});
        return b;
    }

    /* renamed from: a */
    public final GradientDrawable mo50548a(float f, int i) {
        float L = C17885a.m44410L(this.f46305a, f);
        GradientDrawable b = mo50549b(i, (Integer) null, 1.0f);
        b.setCornerRadius(L);
        return b;
    }

    /* renamed from: b */
    public final GradientDrawable mo50549b(int i, Integer num, float f) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(i);
        if (num != null && f > BitmapDescriptorFactory.HUE_RED) {
            gradientDrawable.setStroke((int) C17885a.m44410L(this.f46305a, f), num.intValue());
        }
        return gradientDrawable;
    }
}
