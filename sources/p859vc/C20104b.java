package p859vc;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.tabs.C14147a;
import com.google.android.material.tabs.TabLayout;
import p380bc.C13577a;

/* renamed from: vc.b */
public final class C20104b extends C14147a {
    /* renamed from: b */
    public final void mo42381b(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        float f2;
        int i = (f > 0.5f ? 1 : (f == 0.5f ? 0 : -1));
        if (i >= 0) {
            view = view2;
        }
        RectF a = C14147a.m35210a(tabLayout, view);
        if (i < 0) {
            f2 = C13577a.m33993a(1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0.5f, f);
        } else {
            f2 = C13577a.m33993a(BitmapDescriptorFactory.HUE_RED, 1.0f, 0.5f, 1.0f, f);
        }
        drawable.setBounds((int) a.left, drawable.getBounds().top, (int) a.right, drawable.getBounds().bottom);
        drawable.setAlpha((int) (f2 * 255.0f));
    }
}
