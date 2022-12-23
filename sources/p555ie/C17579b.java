package p555ie;

import java.util.HashMap;
import java.util.Map;

/* renamed from: ie.b */
public final class C17579b {

    /* renamed from: a */
    public final HashMap f45204a = new HashMap();

    /* renamed from: b */
    public final int f45205b = 64;

    /* renamed from: c */
    public final int f45206c;

    public C17579b(int i) {
        this.f45206c = i;
    }

    /* renamed from: a */
    public static String m43694a(int i, String str) {
        if (str == null) {
            return str;
        }
        String trim = str.trim();
        if (trim.length() > i) {
            return trim.substring(0, i);
        }
        return trim;
    }

    /* renamed from: b */
    public final synchronized boolean mo50033b(String str, String str2) {
        boolean z;
        String a = m43694a(this.f45206c, str);
        if (this.f45204a.size() >= this.f45205b && !this.f45204a.containsKey(a)) {
            return false;
        }
        String a2 = m43694a(this.f45206c, str2);
        String str3 = (String) this.f45204a.get(a);
        if (str3 != null) {
            z = str3.equals(a2);
        } else if (a2 == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        HashMap hashMap = this.f45204a;
        if (str2 == null) {
            a2 = "";
        }
        hashMap.put(a, a2);
        return true;
    }

    /* renamed from: c */
    public final synchronized void mo50034c(Map<String, String> map) {
        String str;
        for (Map.Entry next : map.entrySet()) {
            String str2 = (String) next.getKey();
            if (str2 != null) {
                String a = m43694a(this.f45206c, str2);
                if (this.f45204a.size() < this.f45205b || this.f45204a.containsKey(a)) {
                    String str3 = (String) next.getValue();
                    HashMap hashMap = this.f45204a;
                    if (str3 == null) {
                        str = "";
                    } else {
                        str = m43694a(this.f45206c, str3);
                    }
                    hashMap.put(a, str);
                }
            } else {
                throw new IllegalArgumentException("Custom attribute key must not be null.");
            }
        }
    }
}
