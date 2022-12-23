package p108h6;

import android.text.TextUtils;
import com.amazonaws.http.HttpHeader;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: h6.i */
public final class C5094i implements C5092g {

    /* renamed from: b */
    public final Map<String, List<C5093h>> f17089b;

    /* renamed from: c */
    public volatile Map<String, String> f17090c;

    /* renamed from: h6.i$a */
    public static final class C5095a {

        /* renamed from: b */
        public static final Map<String, List<C5093h>> f17091b;

        /* renamed from: a */
        public Map<String, List<C5093h>> f17092a = f17091b;

        static {
            String property = System.getProperty("http.agent");
            if (!TextUtils.isEmpty(property)) {
                int length = property.length();
                StringBuilder sb = new StringBuilder(property.length());
                for (int i = 0; i < length; i++) {
                    char charAt = property.charAt(i);
                    if ((charAt > 31 || charAt == 9) && charAt < 127) {
                        sb.append(charAt);
                    } else {
                        sb.append('?');
                    }
                }
                property = sb.toString();
            }
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(property)) {
                hashMap.put(HttpHeader.USER_AGENT, Collections.singletonList(new C5096b(property)));
            }
            f17091b = Collections.unmodifiableMap(hashMap);
        }
    }

    /* renamed from: h6.i$b */
    public static final class C5096b implements C5093h {

        /* renamed from: a */
        public final String f17093a;

        public C5096b(String str) {
            this.f17093a = str;
        }

        /* renamed from: a */
        public final String mo20829a() {
            return this.f17093a;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof C5096b) {
                return this.f17093a.equals(((C5096b) obj).f17093a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f17093a.hashCode();
        }

        public final String toString() {
            StringBuilder k = C13555b.m33972k("StringHeaderFactory{value='");
            k.append(this.f17093a);
            k.append('\'');
            k.append('}');
            return k.toString();
        }
    }

    public C5094i(Map<String, List<C5093h>> map) {
        this.f17089b = Collections.unmodifiableMap(map);
    }

    /* renamed from: a */
    public final HashMap mo20830a() {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f17089b.entrySet()) {
            List list = (List) next.getValue();
            StringBuilder sb = new StringBuilder();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                String a = ((C5093h) list.get(i)).mo20829a();
                if (!TextUtils.isEmpty(a)) {
                    sb.append(a);
                    if (i != list.size() - 1) {
                        sb.append(',');
                    }
                }
            }
            String sb2 = sb.toString();
            if (!TextUtils.isEmpty(sb2)) {
                hashMap.put(next.getKey(), sb2);
            }
        }
        return hashMap;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5094i) {
            return this.f17089b.equals(((C5094i) obj).f17089b);
        }
        return false;
    }

    public final Map<String, String> getHeaders() {
        if (this.f17090c == null) {
            synchronized (this) {
                if (this.f17090c == null) {
                    this.f17090c = Collections.unmodifiableMap(mo20830a());
                }
            }
        }
        return this.f17090c;
    }

    public final int hashCode() {
        return this.f17089b.hashCode();
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("LazyHeaders{headers=");
        k.append(this.f17089b);
        k.append('}');
        return k.toString();
    }
}
