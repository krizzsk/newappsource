package p493fo;

import com.masabi.justride.sdk.exception.service_locator.ServiceLocatorException;
import java.util.HashMap;
import java.util.Map;
import p358af.C13437d;
import p469eo.C16846b;

/* renamed from: fo.b */
public abstract class C17048b {

    /* renamed from: a */
    public final HashMap f44201a = new HashMap();

    /* renamed from: b */
    public boolean f44202b;

    /* renamed from: a */
    public static void m42896a(HashMap hashMap, Object obj) {
        m42897b(hashMap, obj, obj.getClass(), (String) null);
    }

    /* renamed from: b */
    public static void m42897b(Map map, Object obj, Class cls, String str) {
        map.put(new C17047a(cls, str), obj);
    }

    /* renamed from: c */
    public abstract void mo40403c(C16846b bVar, HashMap hashMap);

    /* renamed from: d */
    public final void mo49653d(C17047a aVar, Object obj) throws ServiceLocatorException {
        String str;
        Class<T> cls = aVar.f44199a;
        String str2 = aVar.f44200b;
        if (this.f44201a.containsKey(new C17047a(cls, str2))) {
            StringBuilder k = C13555b.m33972k("There is already a dependency of type ");
            k.append(cls.getName());
            if (str2 == null) {
                str = "";
            } else {
                str = C13437d.m33706k(" and named '", str2, "'");
            }
            k.append(str);
            k.append(" registered in this module: ");
            k.append(getClass().getName());
            throw new ServiceLocatorException(k.toString());
        }
        this.f44201a.put(aVar, obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f44201a.equals(((C17048b) obj).f44201a);
    }

    public final int hashCode() {
        return this.f44201a.hashCode();
    }
}
