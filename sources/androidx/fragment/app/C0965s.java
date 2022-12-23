package androidx.fragment.app;

import androidx.fragment.app.Fragment;
import p241s0.C6313h;
import p358af.C13437d;

/* renamed from: androidx.fragment.app.s */
public class C0965s {

    /* renamed from: a */
    public static final C6313h<ClassLoader, C6313h<String, Class<?>>> f3848a = new C6313h<>();

    /* renamed from: b */
    public static Class<?> m2793b(ClassLoader classLoader, String str) throws ClassNotFoundException {
        C6313h<ClassLoader, C6313h<String, Class<?>>> hVar = f3848a;
        C6313h orDefault = hVar.getOrDefault(classLoader, null);
        if (orDefault == null) {
            orDefault = new C6313h();
            hVar.put(classLoader, orDefault);
        }
        Class<?> cls = (Class) orDefault.getOrDefault(str, null);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        orDefault.put(str, cls2);
        return cls2;
    }

    /* renamed from: c */
    public static Class<? extends Fragment> m2794c(ClassLoader classLoader, String str) {
        try {
            return m2793b(classLoader, str);
        } catch (ClassNotFoundException e) {
            throw new Fragment.InstantiationException(C13437d.m33706k("Unable to instantiate fragment ", str, ": make sure class name exists"), e);
        } catch (ClassCastException e2) {
            throw new Fragment.InstantiationException(C13437d.m33706k("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e2);
        }
    }

    /* renamed from: a */
    public Fragment mo3992a(String str) {
        throw null;
    }
}
