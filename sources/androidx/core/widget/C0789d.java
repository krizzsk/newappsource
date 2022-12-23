package androidx.core.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: androidx.core.widget.d */
public final class C0789d {

    /* renamed from: androidx.core.widget.d$a */
    public static class C0790a {
        /* renamed from: a */
        public static void m2397a(EdgeEffect edgeEffect, float f, float f2) {
            edgeEffect.onPull(f, f2);
        }
    }

    /* renamed from: androidx.core.widget.d$b */
    public static class C0791b {
        /* renamed from: a */
        public static EdgeEffect m2398a(Context context, AttributeSet attributeSet) {
            try {
                return new EdgeEffect(context, attributeSet);
            } catch (Throwable unused) {
                return new EdgeEffect(context);
            }
        }

        /* renamed from: b */
        public static float m2399b(EdgeEffect edgeEffect) {
            try {
                return edgeEffect.getDistance();
            } catch (Throwable unused) {
                return BitmapDescriptorFactory.HUE_RED;
            }
        }

        /* renamed from: c */
        public static float m2400c(EdgeEffect edgeEffect, float f, float f2) {
            try {
                return edgeEffect.onPullDistance(f, f2);
            } catch (Throwable unused) {
                edgeEffect.onPull(f, f2);
                return BitmapDescriptorFactory.HUE_RED;
            }
        }
    }

    /* renamed from: a */
    public static float m2395a(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C0791b.m2399b(edgeEffect);
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    /* renamed from: b */
    public static float m2396b(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C0791b.m2400c(edgeEffect, f, f2);
        }
        C0790a.m2397a(edgeEffect, f, f2);
        return f;
    }
}
