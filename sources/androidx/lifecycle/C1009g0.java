package androidx.lifecycle;

import android.app.Application;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.C23816b;
import mf0.C24362h;
import p583jk.C17875h;

/* renamed from: androidx.lifecycle.g0 */
public final class C1009g0 {

    /* renamed from: a */
    public static final List<Class<?>> f3937a;

    /* renamed from: b */
    public static final List<Class<?>> f3938b;

    static {
        Class<C1001d0> cls = C1001d0.class;
        f3937a = C17875h.m44281E(Application.class, cls);
        f3938b = C17875h.m44280D(cls);
    }

    /* renamed from: a */
    public static final <T> Constructor<T> m2877a(Class<T> cls, List<? extends Class<?>> list) {
        C24362h.m61211f(list, InAppPurchaseMetaData.KEY_SIGNATURE);
        Constructor<T>[] constructors = cls.getConstructors();
        C24362h.m61210e(constructors, "modelClass.constructors");
        int length = constructors.length;
        int i = 0;
        while (i < length) {
            Constructor<T> constructor = constructors[i];
            Class[] parameterTypes = constructor.getParameterTypes();
            C24362h.m61210e(parameterTypes, "constructor.parameterTypes");
            List h1 = C23816b.m58452h1(parameterTypes);
            if (C24362h.m61206a(list, h1)) {
                return constructor;
            }
            if (list.size() != h1.size() || !h1.containsAll(list)) {
                i++;
            } else {
                StringBuilder k = C13555b.m33972k("Class ");
                k.append(cls.getSimpleName());
                k.append(" must have parameters in the proper order: ");
                k.append(list);
                throw new UnsupportedOperationException(k.toString());
            }
        }
        return null;
    }

    /* renamed from: b */
    public static final <T extends C1019k0> T m2878b(Class<T> cls, Constructor<T> constructor, Object... objArr) {
        try {
            return (C1019k0) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            throw new RuntimeException(C25541a.m63880j("Failed to access ", cls), e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(C25541a.m63880j("An exception happened in constructor of ", cls), e3.getCause());
        }
    }
}
