package p406cg;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* renamed from: cg.a */
public final class C13809a implements C13821j<Object> {

    /* renamed from: b */
    public final C13829p f33993b;

    /* renamed from: c */
    public final /* synthetic */ Class f33994c;

    /* renamed from: d */
    public final /* synthetic */ Type f33995d;

    public C13809a(Class cls, Type type) {
        C13829p pVar;
        this.f33994c = cls;
        this.f33995d = type;
        try {
            Class<?> cls2 = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls2.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            pVar = new C13825l(declaredField.get((Object) null), cls2.getMethod("allocateInstance", new Class[]{Class.class}));
        } catch (Exception unused) {
            try {
                Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", new Class[]{Class.class});
                declaredMethod.setAccessible(true);
                int intValue = ((Integer) declaredMethod.invoke((Object) null, new Object[]{Object.class})).intValue();
                Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", new Class[]{Class.class, Integer.TYPE});
                declaredMethod2.setAccessible(true);
                pVar = new C13826m(declaredMethod2, intValue);
            } catch (Exception unused2) {
                try {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", new Class[]{Class.class, Class.class});
                    declaredMethod3.setAccessible(true);
                    pVar = new C13827n(declaredMethod3);
                } catch (Exception unused3) {
                    pVar = new C13828o();
                }
            }
        }
        this.f33993b = pVar;
    }

    /* renamed from: g */
    public final Object mo40737g() {
        try {
            return this.f33993b.mo40754b(this.f33994c);
        } catch (Exception e) {
            StringBuilder k = C13555b.m33972k("Unable to invoke no-args constructor for ");
            k.append(this.f33995d);
            k.append(". Registering an InstanceCreator with Gson for this type may fix this problem.");
            throw new RuntimeException(k.toString(), e);
        }
    }
}
