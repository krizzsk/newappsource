package p242s1;

import android.graphics.Rect;
import android.view.DisplayCutout;
import java.util.List;
import p229r1.C6232b;

/* renamed from: s1.d */
public final class C6331d {

    /* renamed from: a */
    public final DisplayCutout f19989a;

    /* renamed from: s1.d$a */
    public static class C6332a {
        /* renamed from: a */
        public static DisplayCutout m15007a(Rect rect, List<Rect> list) {
            return new DisplayCutout(rect, list);
        }

        /* renamed from: b */
        public static List<Rect> m15008b(DisplayCutout displayCutout) {
            return displayCutout.getBoundingRects();
        }

        /* renamed from: c */
        public static int m15009c(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        /* renamed from: d */
        public static int m15010d(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        /* renamed from: e */
        public static int m15011e(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        /* renamed from: f */
        public static int m15012f(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    public C6331d(DisplayCutout displayCutout) {
        this.f19989a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6331d.class != obj.getClass()) {
            return false;
        }
        return C6232b.m14816a(this.f19989a, ((C6331d) obj).f19989a);
    }

    public final int hashCode() {
        DisplayCutout displayCutout = this.f19989a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("DisplayCutoutCompat{");
        k.append(this.f19989a);
        k.append("}");
        return k.toString();
    }
}
