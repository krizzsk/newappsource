package jj0;

import java.util.HashMap;
import java.util.Map;

/* renamed from: jj0.c */
public final class C23752c implements C23751b {

    /* renamed from: a */
    public Map f60010a;

    public C23752c(HashMap hashMap) {
        this.f60010a = hashMap;
    }

    /* renamed from: a */
    public final String mo58847a(String str) {
        Object obj;
        Map map = this.f60010a;
        if (map != null) {
            obj = map.get(str);
        } else {
            obj = null;
        }
        if (obj != null) {
            return obj.toString();
        }
        return null;
    }
}
