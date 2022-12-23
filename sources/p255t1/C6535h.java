package p255t1;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* renamed from: t1.h */
public class C6535h {

    /* renamed from: a */
    public final Object f20354a;

    /* renamed from: t1.h$a */
    public static class C6536a extends AccessibilityNodeProvider {

        /* renamed from: a */
        public final C6535h f20355a;

        public C6536a(C6535h hVar) {
            this.f20355a = hVar;
        }

        public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            C6531g a = this.f20355a.mo22655a(i);
            if (a == null) {
                return null;
            }
            return a.f20334a;
        }

        public final List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            this.f20355a.getClass();
            return null;
        }

        public final boolean performAction(int i, int i2, Bundle bundle) {
            return this.f20355a.mo22657c(i, i2, bundle);
        }
    }

    /* renamed from: t1.h$b */
    public static class C6537b extends C6536a {
        public C6537b(C6535h hVar) {
            super(hVar);
        }

        public final AccessibilityNodeInfo findFocus(int i) {
            C6531g b = this.f20355a.mo22656b(i);
            if (b == null) {
                return null;
            }
            return b.f20334a;
        }
    }

    /* renamed from: t1.h$c */
    public static class C6538c extends C6537b {
        public C6538c(C6535h hVar) {
            super(hVar);
        }

        public final void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f20355a.getClass();
        }
    }

    public C6535h() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f20354a = new C6538c(this);
        } else {
            this.f20354a = new C6537b(this);
        }
    }

    /* renamed from: a */
    public C6531g mo22655a(int i) {
        return null;
    }

    /* renamed from: b */
    public C6531g mo22656b(int i) {
        return null;
    }

    /* renamed from: c */
    public boolean mo22657c(int i, int i2, Bundle bundle) {
        return false;
    }

    public C6535h(AccessibilityNodeProvider accessibilityNodeProvider) {
        this.f20354a = accessibilityNodeProvider;
    }
}
