package p242s1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.PointerIcon;

/* renamed from: s1.x */
public final class C6411x {

    /* renamed from: a */
    public final PointerIcon f20078a;

    /* renamed from: s1.x$a */
    public static class C6412a {
        /* renamed from: a */
        public static PointerIcon m15315a(Bitmap bitmap, float f, float f2) {
            return PointerIcon.create(bitmap, f, f2);
        }

        /* renamed from: b */
        public static PointerIcon m15316b(Context context, int i) {
            return PointerIcon.getSystemIcon(context, i);
        }

        /* renamed from: c */
        public static PointerIcon m15317c(Resources resources, int i) {
            return PointerIcon.load(resources, i);
        }
    }

    public C6411x(PointerIcon pointerIcon) {
        this.f20078a = pointerIcon;
    }
}
