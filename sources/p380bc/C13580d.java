package p380bc;

import android.graphics.drawable.Drawable;
import android.util.Property;
import java.util.WeakHashMap;

/* renamed from: bc.d */
public final class C13580d extends Property<Drawable, Integer> {

    /* renamed from: a */
    public static final C13580d f33544a = new C13580d();

    public C13580d() {
        super(Integer.class, "drawableAlphaCompat");
        new WeakHashMap();
    }

    public final Object get(Object obj) {
        return Integer.valueOf(((Drawable) obj).getAlpha());
    }

    public final void set(Object obj, Object obj2) {
        ((Drawable) obj).setAlpha(((Integer) obj2).intValue());
    }
}
