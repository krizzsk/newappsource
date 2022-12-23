package p00;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import p977zz.C20943i;

/* renamed from: p00.a */
public abstract class C18863a {

    /* renamed from: a */
    public static final C18863a f48036a = (C20943i.m49051d(28) ? new C18865b() : new C18864a());

    /* renamed from: p00.a$a */
    public static class C18864a extends C18863a {

        /* renamed from: b */
        public static final Field f48037b;

        static {
            Field field = null;
            try {
                field = Class.forName("android.text.TextLine").getDeclaredField("sCached");
                field.setAccessible(true);
            } catch (Exception unused) {
            }
            f48037b = field;
        }

        /* renamed from: a */
        public final void mo51340a() {
            Field field = f48037b;
            if (field != null) {
                try {
                    Object obj = field.get((Object) null);
                    if (obj != null) {
                        int length = Array.getLength(obj);
                        for (int i = 0; i < length; i++) {
                            Array.set(obj, i, (Object) null);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: p00.a$b */
    public static class C18865b extends C18863a {
        /* renamed from: a */
        public final void mo51340a() {
        }
    }

    /* renamed from: a */
    public abstract void mo51340a();
}
