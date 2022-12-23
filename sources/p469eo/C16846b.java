package p469eo;

import com.masabi.justride.sdk.exception.service_locator.ServiceLocatorException;
import java.util.AbstractList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p358af.C13437d;
import p493fo.C17047a;
import p493fo.C17048b;

/* renamed from: eo.b */
public abstract class C16846b {

    /* renamed from: a */
    public final HashMap f43839a = new HashMap();

    public C16846b(AbstractList abstractList) {
        Iterator it = abstractList.iterator();
        while (it.hasNext()) {
            C17048b bVar = (C17048b) it.next();
            synchronized (bVar) {
                if (!bVar.f44202b) {
                    HashMap hashMap = new HashMap();
                    bVar.mo40403c(this, hashMap);
                    for (Map.Entry entry : hashMap.entrySet()) {
                        bVar.mo49653d((C17047a) entry.getKey(), entry.getValue());
                    }
                    for (Map.Entry entry2 : bVar.f44201a.entrySet()) {
                        Object value = entry2.getValue();
                        this.f43839a.put((C17047a) entry2.getKey(), value);
                    }
                    bVar.f44202b = true;
                } else {
                    throw new ServiceLocatorException("Module " + bVar.getClass().getName() + " has already been registered");
                }
            }
        }
    }

    /* renamed from: a */
    public final <T> T mo49505a(Class<T> cls, String str) throws NullPointerException {
        String str2;
        C17047a aVar = new C17047a(cls, str);
        if (this.f43839a.containsKey(aVar)) {
            return this.f43839a.get(aVar);
        }
        StringBuilder k = C13555b.m33972k("Could not find dependency ");
        k.append(cls.getName());
        if (str == null) {
            str2 = "";
        } else {
            str2 = C13437d.m33706k(" named '", str, "'");
        }
        k.append(str2);
        throw new NullPointerException(k.toString());
    }
}
