package od0;

import com.vungle.warren.VungleLogger;
import java.util.Map;
import p988j$.util.concurrent.ConcurrentHashMap;

/* renamed from: od0.j */
public final class C24559j {

    /* renamed from: a */
    public Map<String, String> f62245a = new ConcurrentHashMap();

    /* renamed from: b */
    public Map<String, Boolean> f62246b = new ConcurrentHashMap();

    /* renamed from: c */
    public Map<String, Integer> f62247c = new ConcurrentHashMap();

    /* renamed from: d */
    public Map<String, Long> f62248d = new ConcurrentHashMap();

    /* renamed from: e */
    public String f62249e;

    public C24559j(String str) {
        this.f62249e = str;
    }

    /* renamed from: a */
    public final Boolean mo60824a(String str) {
        return Boolean.valueOf(this.f62246b.get(str) != null && this.f62246b.get(str).booleanValue());
    }

    /* renamed from: b */
    public final Long mo60825b(String str) {
        return Long.valueOf(this.f62248d.get(str) != null ? this.f62248d.get(str).longValue() : 0);
    }

    /* renamed from: c */
    public final String mo60826c(String str) {
        return this.f62245a.get(str);
    }

    /* renamed from: d */
    public final void mo60827d(Object obj, String str) {
        if (obj == null) {
            VungleLogger.m57029b("putValue", String.format("Value for key \"%s\" should not be null", new Object[]{str}));
        } else if (obj instanceof String) {
            this.f62245a.put(str, (String) obj);
        } else if (obj instanceof Boolean) {
            this.f62246b.put(str, (Boolean) obj);
        } else if (obj instanceof Integer) {
            this.f62247c.put(str, (Integer) obj);
        } else if (obj instanceof Long) {
            this.f62248d.put(str, (Long) obj);
        } else {
            VungleLogger.m57029b("putValue", "Value type is not supported!");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C24559j.class != obj.getClass()) {
            return false;
        }
        C24559j jVar = (C24559j) obj;
        Map<String, String> map = this.f62245a;
        if (map == null ? jVar.f62245a != null : !map.equals(jVar.f62245a)) {
            return false;
        }
        Map<String, Boolean> map2 = this.f62246b;
        if (map2 == null ? jVar.f62246b != null : !map2.equals(jVar.f62246b)) {
            return false;
        }
        Map<String, Integer> map3 = this.f62247c;
        if (map3 == null ? jVar.f62247c != null : !map3.equals(jVar.f62247c)) {
            return false;
        }
        Map<String, Long> map4 = this.f62248d;
        if (map4 == null ? jVar.f62248d != null : !map4.equals(jVar.f62248d)) {
            return false;
        }
        String str = this.f62249e;
        String str2 = jVar.f62249e;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        Map<String, String> map = this.f62245a;
        int i5 = 0;
        if (map != null) {
            i = map.hashCode();
        } else {
            i = 0;
        }
        int i6 = i * 31;
        Map<String, Boolean> map2 = this.f62246b;
        if (map2 != null) {
            i2 = map2.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        Map<String, Integer> map3 = this.f62247c;
        if (map3 != null) {
            i3 = map3.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        Map<String, Long> map4 = this.f62248d;
        if (map4 != null) {
            i4 = map4.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        String str = this.f62249e;
        if (str != null) {
            i5 = str.hashCode();
        }
        return i9 + i5;
    }
}
