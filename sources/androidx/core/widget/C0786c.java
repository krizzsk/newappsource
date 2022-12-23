package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

/* renamed from: androidx.core.widget.c */
public final class C0786c {

    /* renamed from: a */
    public static Field f3419a;

    /* renamed from: b */
    public static boolean f3420b;

    /* renamed from: androidx.core.widget.c$a */
    public static class C0787a {
        /* renamed from: a */
        public static ColorStateList m2390a(CompoundButton compoundButton) {
            return compoundButton.getButtonTintList();
        }

        /* renamed from: b */
        public static PorterDuff.Mode m2391b(CompoundButton compoundButton) {
            return compoundButton.getButtonTintMode();
        }

        /* renamed from: c */
        public static void m2392c(CompoundButton compoundButton, ColorStateList colorStateList) {
            compoundButton.setButtonTintList(colorStateList);
        }

        /* renamed from: d */
        public static void m2393d(CompoundButton compoundButton, PorterDuff.Mode mode) {
            compoundButton.setButtonTintMode(mode);
        }
    }

    /* renamed from: androidx.core.widget.c$b */
    public static class C0788b {
        /* renamed from: a */
        public static Drawable m2394a(CompoundButton compoundButton) {
            return compoundButton.getButtonDrawable();
        }
    }

    /* renamed from: a */
    public static Drawable m2389a(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C0788b.m2394a(compoundButton);
        }
        if (!f3420b) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                f3419a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f3420b = true;
        }
        Field field = f3419a;
        if (field != null) {
            try {
                return (Drawable) field.get(compoundButton);
            } catch (IllegalAccessException unused2) {
                f3419a = null;
            }
        }
        return null;
    }
}
