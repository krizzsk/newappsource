package p242s1;

import android.view.View;
import android.view.ViewParent;

/* renamed from: s1.m0 */
public final class C6376m0 {
    /* renamed from: a */
    public static boolean m15198a(ViewParent viewParent, View view, float f, float f2, boolean z) {
        return viewParent.onNestedFling(view, f, f2, z);
    }

    /* renamed from: b */
    public static boolean m15199b(ViewParent viewParent, View view, float f, float f2) {
        return viewParent.onNestedPreFling(view, f, f2);
    }

    /* renamed from: c */
    public static void m15200c(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
        viewParent.onNestedPreScroll(view, i, i2, iArr);
    }

    /* renamed from: d */
    public static void m15201d(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
        viewParent.onNestedScroll(view, i, i2, i3, i4);
    }

    /* renamed from: e */
    public static void m15202e(ViewParent viewParent, View view, View view2, int i) {
        viewParent.onNestedScrollAccepted(view, view2, i);
    }

    /* renamed from: f */
    public static boolean m15203f(ViewParent viewParent, View view, View view2, int i) {
        return viewParent.onStartNestedScroll(view, view2, i);
    }

    /* renamed from: g */
    public static void m15204g(ViewParent viewParent, View view) {
        viewParent.onStopNestedScroll(view);
    }
}
