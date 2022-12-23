package androidx.appcompat.widget;

import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p141k1.C5456d;

/* renamed from: androidx.appcompat.widget.j0 */
public final class C0418j0 {

    /* renamed from: a */
    public static final int[] f1525a = {16842912};

    /* renamed from: b */
    public static final int[] f1526b = new int[0];

    /* renamed from: c */
    public static final Rect f1527c = new Rect();

    /* renamed from: androidx.appcompat.widget.j0$a */
    public static class C0419a {

        /* renamed from: a */
        public static final boolean f1528a;

        /* renamed from: b */
        public static final Method f1529b;

        /* renamed from: c */
        public static final Field f1530c;

        /* renamed from: d */
        public static final Field f1531d;

        /* renamed from: e */
        public static final Field f1532e;

        /* renamed from: f */
        public static final Field f1533f;

        /* JADX WARNING: Removed duplicated region for block: B:43:0x0058  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x0065  */
        static {
            /*
                r0 = 1
                r1 = 0
                r2 = 0
                java.lang.String r3 = "android.graphics.Insets"
                java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ NoSuchMethodException -> 0x004f, ClassNotFoundException -> 0x004a, NoSuchFieldException -> 0x0045 }
                java.lang.Class<android.graphics.drawable.Drawable> r4 = android.graphics.drawable.Drawable.class
                java.lang.String r5 = "getOpticalInsets"
                java.lang.Class[] r6 = new java.lang.Class[r1]     // Catch:{ NoSuchMethodException -> 0x004f, ClassNotFoundException -> 0x004a, NoSuchFieldException -> 0x0045 }
                java.lang.reflect.Method r4 = r4.getMethod(r5, r6)     // Catch:{ NoSuchMethodException -> 0x004f, ClassNotFoundException -> 0x004a, NoSuchFieldException -> 0x0045 }
                java.lang.String r5 = "left"
                java.lang.reflect.Field r5 = r3.getField(r5)     // Catch:{ NoSuchMethodException -> 0x0042, ClassNotFoundException -> 0x003f, NoSuchFieldException -> 0x003c }
                java.lang.String r6 = "top"
                java.lang.reflect.Field r6 = r3.getField(r6)     // Catch:{ NoSuchMethodException -> 0x0039, ClassNotFoundException -> 0x0036, NoSuchFieldException -> 0x0033 }
                java.lang.String r7 = "right"
                java.lang.reflect.Field r7 = r3.getField(r7)     // Catch:{ ClassNotFoundException | NoSuchFieldException | NoSuchMethodException -> 0x0030 }
                java.lang.String r8 = "bottom"
                java.lang.reflect.Field r3 = r3.getField(r8)     // Catch:{ ClassNotFoundException | NoSuchFieldException | NoSuchMethodException -> 0x002e }
                r8 = 1
                goto L_0x0056
            L_0x002e:
                goto L_0x0054
            L_0x0030:
                r7 = r2
                goto L_0x0054
            L_0x0033:
                r6 = r2
                goto L_0x0053
            L_0x0036:
                r6 = r2
                goto L_0x0053
            L_0x0039:
                r6 = r2
                goto L_0x0053
            L_0x003c:
                r5 = r2
                goto L_0x0048
            L_0x003f:
                r5 = r2
                goto L_0x004d
            L_0x0042:
                r5 = r2
                goto L_0x0052
            L_0x0045:
                r4 = r2
                r5 = r4
            L_0x0048:
                r6 = r5
                goto L_0x0053
            L_0x004a:
                r4 = r2
                r5 = r4
            L_0x004d:
                r6 = r5
                goto L_0x0053
            L_0x004f:
                r4 = r2
                r5 = r4
            L_0x0052:
                r6 = r5
            L_0x0053:
                r7 = r6
            L_0x0054:
                r3 = r2
                r8 = 0
            L_0x0056:
                if (r8 == 0) goto L_0x0065
                f1529b = r4
                f1530c = r5
                f1531d = r6
                f1532e = r7
                f1533f = r3
                f1528a = r0
                goto L_0x0071
            L_0x0065:
                f1529b = r2
                f1530c = r2
                f1531d = r2
                f1532e = r2
                f1533f = r2
                f1528a = r1
            L_0x0071:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0418j0.C0419a.<clinit>():void");
        }
    }

    /* renamed from: androidx.appcompat.widget.j0$b */
    public static class C0420b {
        /* renamed from: a */
        public static Insets m1110a(Drawable drawable) {
            return drawable.getOpticalInsets();
        }
    }

    /* renamed from: a */
    public static void m1107a(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i = Build.VERSION.SDK_INT;
        if (i == 21 && "android.graphics.drawable.VectorDrawable".equals(name)) {
            int[] state = drawable.getState();
            if (state == null || state.length == 0) {
                drawable.setState(f1525a);
            } else {
                drawable.setState(f1526b);
            }
            drawable.setState(state);
        } else if (i >= 29 && i < 31 && "android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            int[] state2 = drawable.getState();
            if (state2 == null || state2.length == 0) {
                drawable.setState(f1525a);
            } else {
                drawable.setState(f1526b);
            }
            drawable.setState(state2);
        }
    }

    /* renamed from: b */
    public static Rect m1108b(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            Insets a = C0420b.m1110a(drawable);
            return new Rect(a.left, a.top, a.right, a.bottom);
        }
        if (drawable instanceof C5456d) {
            drawable = ((C5456d) drawable).mo21301a();
        }
        if (i >= 29) {
            boolean z = C0419a.f1528a;
        } else if (C0419a.f1528a) {
            try {
                Object invoke = C0419a.f1529b.invoke(drawable, new Object[0]);
                if (invoke != null) {
                    return new Rect(C0419a.f1530c.getInt(invoke), C0419a.f1531d.getInt(invoke), C0419a.f1532e.getInt(invoke), C0419a.f1533f.getInt(invoke));
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return f1527c;
    }

    /* renamed from: c */
    public static PorterDuff.Mode m1109c(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
