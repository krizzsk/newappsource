package p599kc;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import com.appboy.support.ValidationUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.play.core.assetpacks.C14256d1;
import p129j1.C5348a;
import p355ac.C13401b;
import p742qc.C19098b;

/* renamed from: kc.a */
public final class C18017a {

    /* renamed from: f */
    public static final int f46133f = ((int) Math.round(5.1000000000000005d));

    /* renamed from: a */
    public final boolean f46134a;

    /* renamed from: b */
    public final int f46135b;

    /* renamed from: c */
    public final int f46136c;

    /* renamed from: d */
    public final int f46137d;

    /* renamed from: e */
    public final float f46138e;

    public C18017a(Context context) {
        boolean z;
        TypedValue a = C19098b.m46245a(C13401b.elevationOverlayEnabled, context);
        if (a == null || a.type != 18 || a.data == 0) {
            z = false;
        } else {
            z = true;
        }
        int d = C14256d1.m35486d(context, C13401b.elevationOverlayColor, 0);
        int d2 = C14256d1.m35486d(context, C13401b.elevationOverlayAccentColor, 0);
        int d3 = C14256d1.m35486d(context, C13401b.colorSurface, 0);
        float f = context.getResources().getDisplayMetrics().density;
        this.f46134a = z;
        this.f46135b = d;
        this.f46136c = d2;
        this.f46137d = d3;
        this.f46138e = f;
    }

    /* renamed from: a */
    public final int mo50512a(float f, int i) {
        boolean z;
        float f2;
        int i2;
        if (this.f46134a) {
            if (C5348a.m13417m(i, ValidationUtils.APPBOY_STRING_MAX_LENGTH) == this.f46137d) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                float f3 = this.f46138e;
                if (f3 <= BitmapDescriptorFactory.HUE_RED || f <= BitmapDescriptorFactory.HUE_RED) {
                    f2 = BitmapDescriptorFactory.HUE_RED;
                } else {
                    f2 = Math.min(((((float) Math.log1p((double) (f / f3))) * 4.5f) + 2.0f) / 100.0f, 1.0f);
                }
                int alpha = Color.alpha(i);
                int i3 = C14256d1.m35491i(f2, C5348a.m13417m(i, ValidationUtils.APPBOY_STRING_MAX_LENGTH), this.f46135b);
                if (f2 > BitmapDescriptorFactory.HUE_RED && (i2 = this.f46136c) != 0) {
                    i3 = C5348a.m13413i(C5348a.m13417m(i2, f46133f), i3);
                }
                return C5348a.m13417m(i3, alpha);
            }
        }
        return i;
    }
}
