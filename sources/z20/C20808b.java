package z20;

import ce0.C21100e;
import java.util.Collections;
import java.util.Map;
import p583jk.C17884p;

/* renamed from: z20.b */
public final class C20808b {

    /* renamed from: a */
    public final Map<String, Object> f52527a;

    public C20808b(Map<String, Object> map) {
        C21100e.m49373x(map, "attributes");
        this.f52527a = Collections.unmodifiableMap(map);
    }

    /* renamed from: a */
    public final <T> T mo52939a(String str, Class<T> cls) {
        Object obj = this.f52527a.get(str);
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        return null;
    }

    /* renamed from: b */
    public final int mo52940b(String str, int i) {
        Integer num = (Integer) mo52939a(str, Integer.class);
        if (num != null) {
            return num.intValue();
        }
        return i;
    }

    /* renamed from: c */
    public final String mo52941c(String str) {
        return (String) mo52939a(str, String.class);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20808b)) {
            return false;
        }
        return this.f52527a.equals(((C20808b) obj).f52527a);
    }

    public final int hashCode() {
        return C17884p.m44335F(this.f52527a);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("MarketingAttributes{attributes=");
        k.append(this.f52527a);
        k.append('}');
        return k.toString();
    }
}
