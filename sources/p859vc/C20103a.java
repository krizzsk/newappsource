package p859vc;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.C14147a;
import com.google.android.material.tabs.TabLayout;
import p380bc.C13577a;

/* renamed from: vc.a */
public final class C20103a extends C14147a {
    /* renamed from: b */
    public final void mo42381b(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        boolean z;
        float f2;
        float f3;
        RectF a = C14147a.m35210a(tabLayout, view);
        RectF a2 = C14147a.m35210a(tabLayout, view2);
        if (a.left < a2.left) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            double d = (((double) f) * 3.141592653589793d) / 2.0d;
            f3 = (float) (1.0d - Math.cos(d));
            f2 = (float) Math.sin(d);
        } else {
            double d2 = (((double) f) * 3.141592653589793d) / 2.0d;
            f2 = (float) (1.0d - Math.cos(d2));
            f3 = (float) Math.sin(d2);
        }
        drawable.setBounds(C13577a.m33994b(f3, (int) a.left, (int) a2.left), drawable.getBounds().top, C13577a.m33994b(f2, (int) a.right, (int) a2.right), drawable.getBounds().bottom);
    }
}
