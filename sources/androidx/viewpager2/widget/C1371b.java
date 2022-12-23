package androidx.viewpager2.widget;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;

/* renamed from: androidx.viewpager2.widget.b */
public final class C1371b {

    /* renamed from: b */
    public static final ViewGroup.MarginLayoutParams f5102b;

    /* renamed from: a */
    public LinearLayoutManager f5103a;

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        f5102b = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    public C1371b(LinearLayoutManager linearLayoutManager) {
        this.f5103a = linearLayoutManager;
    }

    /* renamed from: a */
    public static boolean m3693a(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (m3693a(viewGroup.getChildAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }
}
