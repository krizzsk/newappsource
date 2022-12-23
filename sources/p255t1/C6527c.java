package p255t1;

import android.view.accessibility.AccessibilityManager;

/* renamed from: t1.c */
public final class C6527c {
    /* renamed from: a */
    public static boolean m15447a(AccessibilityManager accessibilityManager, C6528d dVar) {
        return accessibilityManager.addTouchExplorationStateChangeListener(new C6529e(dVar));
    }

    /* renamed from: b */
    public static boolean m15448b(AccessibilityManager accessibilityManager, C6528d dVar) {
        return accessibilityManager.removeTouchExplorationStateChangeListener(new C6529e(dVar));
    }
}
