package p330z2;

import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import java.util.WeakHashMap;
import p242s1.C6333d0;
import p242s1.C6382p0;

/* renamed from: z2.t */
public final class C7444t {

    /* renamed from: a */
    public static final C7448v f22865a;

    /* renamed from: b */
    public static final C7445a f22866b = new C7445a();

    /* renamed from: c */
    public static final C7446b f22867c = new C7446b(Rect.class);

    /* renamed from: z2.t$a */
    public static class C7445a extends Property<View, Float> {
        public C7445a() {
            super(Float.class, "translationAlpha");
        }

        public final Object get(Object obj) {
            return Float.valueOf(C7444t.f22865a.mo23700f((View) obj));
        }

        public final void set(Object obj, Object obj2) {
            C7444t.m17083b((View) obj, ((Float) obj2).floatValue());
        }
    }

    /* renamed from: z2.t$b */
    public static class C7446b extends Property<View, Rect> {
        public C7446b(Class cls) {
            super(cls, "clipBounds");
        }

        public final Object get(Object obj) {
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            return C6333d0.C6339f.m15071a((View) obj);
        }

        public final void set(Object obj, Object obj2) {
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            C6333d0.C6339f.m15073c((View) obj, (Rect) obj2);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f22865a = new C7451y();
        } else if (i >= 23) {
            f22865a = new C7450x();
        } else if (i >= 22) {
            f22865a = new C7449w();
        } else {
            f22865a = new C7448v();
        }
    }

    /* renamed from: a */
    public static void m17082a(View view, int i, int i2, int i3, int i4) {
        f22865a.mo23705d(view, i, i2, i3, i4);
    }

    /* renamed from: b */
    public static void m17083b(View view, float f) {
        f22865a.mo23701h(view, f);
    }

    /* renamed from: c */
    public static void m17084c(int i, View view) {
        f22865a.mo23706e(i, view);
    }
}
