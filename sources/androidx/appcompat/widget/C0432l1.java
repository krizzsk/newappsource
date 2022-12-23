package androidx.appcompat.widget;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;

/* renamed from: androidx.appcompat.widget.l1 */
public final class C0432l1 {

    /* renamed from: androidx.appcompat.widget.l1$a */
    public static class C0433a {
        /* renamed from: a */
        public static void m1182a(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* renamed from: a */
    public static void m1181a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            C0433a.m1182a(view, charSequence);
            return;
        }
        C0444o1 o1Var = C0444o1.f1590l;
        if (o1Var != null && o1Var.f1592b == view) {
            C0444o1.m1227b((C0444o1) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            C0444o1 o1Var2 = C0444o1.f1591m;
            if (o1Var2 != null && o1Var2.f1592b == view) {
                o1Var2.mo2173a();
            }
            view.setOnLongClickListener((View.OnLongClickListener) null);
            view.setLongClickable(false);
            view.setOnHoverListener((View.OnHoverListener) null);
            return;
        }
        new C0444o1(view, charSequence);
    }
}
