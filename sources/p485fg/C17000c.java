package p485fg;

import com.google.gson.JsonIOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

/* renamed from: fg.c */
public final class C17000c extends C16999b {

    /* renamed from: d */
    public static Class f44116d;

    /* renamed from: b */
    public final Object f44117b;

    /* renamed from: c */
    public final Field f44118c;

    public C17000c() {
        Object obj;
        Field field = null;
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            f44116d = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            obj = declaredField.get((Object) null);
        } catch (Exception unused) {
            obj = null;
        }
        this.f44117b = obj;
        try {
            field = AccessibleObject.class.getDeclaredField("override");
        } catch (NoSuchFieldException unused2) {
        }
        this.f44118c = field;
    }

    /* renamed from: a */
    public final void mo49636a(AccessibleObject accessibleObject) {
        boolean z = false;
        if (!(this.f44117b == null || this.f44118c == null)) {
            try {
                long longValue = ((Long) f44116d.getMethod("objectFieldOffset", new Class[]{Field.class}).invoke(this.f44117b, new Object[]{this.f44118c})).longValue();
                f44116d.getMethod("putBoolean", new Class[]{Object.class, Long.TYPE, Boolean.TYPE}).invoke(this.f44117b, new Object[]{accessibleObject, Long.valueOf(longValue), Boolean.TRUE});
                z = true;
            } catch (Exception unused) {
            }
        }
        if (!z) {
            try {
                accessibleObject.setAccessible(true);
            } catch (SecurityException e) {
                throw new JsonIOException("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e);
            }
        }
    }
}
