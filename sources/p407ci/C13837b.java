package p407ci;

import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: ci.b */
public final class C13837b {
    /* renamed from: a */
    public static String m34522a(View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        int visibility = view.getVisibility();
        if (visibility != 0) {
            return visibility != 4 ? visibility != 8 ? "viewNotVisible" : "viewGone" : "viewInvisible";
        }
        if (view.getAlpha() == BitmapDescriptorFactory.HUE_RED) {
            return "viewAlphaZero";
        }
        return null;
    }
}
