package androidx.appcompat.app;

import android.util.LongSparseArray;
import java.lang.reflect.Field;

/* renamed from: androidx.appcompat.app.s */
public final class C0263s {

    /* renamed from: a */
    public static Field f762a;

    /* renamed from: b */
    public static boolean f763b;

    /* renamed from: c */
    public static Class<?> f764c;

    /* renamed from: d */
    public static boolean f765d;

    /* renamed from: e */
    public static Field f766e;

    /* renamed from: f */
    public static boolean f767f;

    /* renamed from: g */
    public static Field f768g;

    /* renamed from: h */
    public static boolean f769h;

    /* renamed from: androidx.appcompat.app.s$a */
    public static class C0264a {
        /* renamed from: a */
        public static void m536a(LongSparseArray longSparseArray) {
            longSparseArray.clear();
        }
    }

    /* renamed from: a */
    public static void m535a(Object obj) {
        if (!f765d) {
            try {
                f764c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException unused) {
            }
            f765d = true;
        }
        Class<?> cls = f764c;
        if (cls != null) {
            if (!f767f) {
                try {
                    Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                    f766e = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException unused2) {
                }
                f767f = true;
            }
            Field field = f766e;
            if (field != null) {
                LongSparseArray longSparseArray = null;
                try {
                    longSparseArray = (LongSparseArray) field.get(obj);
                } catch (IllegalAccessException unused3) {
                }
                if (longSparseArray != null) {
                    C0264a.m536a(longSparseArray);
                }
            }
        }
    }
}
