package p792sh;

import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: sh.b */
public final class C19462b {
    /* renamed from: a */
    public static String m46863a(View view) {
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
