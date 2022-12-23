package p141k1;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.AttributeSet;
import java.io.IOException;
import java.lang.reflect.Method;
import org.xmlpull.p982v1.XmlPullParser;
import org.xmlpull.p982v1.XmlPullParserException;

/* renamed from: k1.a */
public final class C5450a {

    /* renamed from: a */
    public static Method f17965a;

    /* renamed from: b */
    public static boolean f17966b;

    /* renamed from: c */
    public static Method f17967c;

    /* renamed from: d */
    public static boolean f17968d;

    /* renamed from: k1.a$a */
    public static class C5451a {
        /* renamed from: a */
        public static int m13605a(Drawable drawable) {
            return drawable.getAlpha();
        }

        /* renamed from: b */
        public static Drawable m13606b(DrawableContainer.DrawableContainerState drawableContainerState, int i) {
            return drawableContainerState.getChild(i);
        }

        /* renamed from: c */
        public static Drawable m13607c(InsetDrawable insetDrawable) {
            return insetDrawable.getDrawable();
        }

        /* renamed from: d */
        public static boolean m13608d(Drawable drawable) {
            return drawable.isAutoMirrored();
        }

        /* renamed from: e */
        public static void m13609e(Drawable drawable, boolean z) {
            drawable.setAutoMirrored(z);
        }
    }

    /* renamed from: k1.a$b */
    public static class C5452b {
        /* renamed from: a */
        public static void m13610a(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        /* renamed from: b */
        public static boolean m13611b(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        /* renamed from: c */
        public static ColorFilter m13612c(Drawable drawable) {
            return drawable.getColorFilter();
        }

        /* renamed from: d */
        public static void m13613d(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        /* renamed from: e */
        public static void m13614e(Drawable drawable, float f, float f2) {
            drawable.setHotspot(f, f2);
        }

        /* renamed from: f */
        public static void m13615f(Drawable drawable, int i, int i2, int i3, int i4) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }

        /* renamed from: g */
        public static void m13616g(Drawable drawable, int i) {
            drawable.setTint(i);
        }

        /* renamed from: h */
        public static void m13617h(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        /* renamed from: i */
        public static void m13618i(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }
    }

    /* renamed from: k1.a$c */
    public static class C5453c {
        /* renamed from: a */
        public static int m13619a(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        /* renamed from: b */
        public static boolean m13620b(Drawable drawable, int i) {
            return drawable.setLayoutDirection(i);
        }
    }

    /* renamed from: a */
    public static void m13598a(Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        if (Build.VERSION.SDK_INT >= 23) {
            drawable.clearColorFilter();
            return;
        }
        drawable.clearColorFilter();
        if (drawable instanceof InsetDrawable) {
            m13598a(C5451a.m13607c((InsetDrawable) drawable));
        } else if (drawable instanceof C5456d) {
            m13598a(((C5456d) drawable).mo21301a());
        } else if ((drawable instanceof DrawableContainer) && (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) != null) {
            int childCount = drawableContainerState.getChildCount();
            for (int i = 0; i < childCount; i++) {
                Drawable b = C5451a.m13606b(drawableContainerState, i);
                if (b != null) {
                    m13598a(b);
                }
            }
        }
    }

    /* renamed from: b */
    public static int m13599b(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C5453c.m13619a(drawable);
        }
        if (!f17968d) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                f17967c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f17968d = true;
        }
        Method method = f17967c;
        if (method != null) {
            try {
                return ((Integer) method.invoke(drawable, new Object[0])).intValue();
            } catch (Exception unused2) {
                f17967c = null;
            }
        }
        return 0;
    }

    /* renamed from: c */
    public static boolean m13600c(Drawable drawable, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C5453c.m13620b(drawable, i);
        }
        if (!f17966b) {
            Class<Drawable> cls = Drawable.class;
            try {
                Method declaredMethod = cls.getDeclaredMethod("setLayoutDirection", new Class[]{Integer.TYPE});
                f17965a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f17966b = true;
        }
        Method method = f17965a;
        if (method != null) {
            try {
                method.invoke(drawable, new Object[]{Integer.valueOf(i)});
                return true;
            } catch (Exception unused2) {
                f17965a = null;
            }
        }
        return false;
    }

    /* renamed from: d */
    public static void m13601d(Drawable drawable, int i) {
        C5452b.m13616g(drawable, i);
    }

    /* renamed from: e */
    public static void m13602e(Drawable drawable, ColorStateList colorStateList) {
        C5452b.m13617h(drawable, colorStateList);
    }

    /* renamed from: f */
    public static void m13603f(Drawable drawable, PorterDuff.Mode mode) {
        C5452b.m13618i(drawable, mode);
    }

    /* renamed from: g */
    public static Drawable m13604g(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 23 && !(drawable instanceof C5455c)) {
            return new C5458f(drawable);
        }
        return drawable;
    }
}
