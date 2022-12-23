package hi0;

import hi0.C23556q;
import ii0.C23610d;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import mf0.C24361g;
import p358af.C13437d;

/* renamed from: hi0.x */
public final class C23571x {

    /* renamed from: a */
    public final C23558r f59636a;

    /* renamed from: b */
    public final String f59637b;

    /* renamed from: c */
    public final C23556q f59638c;

    /* renamed from: d */
    public final C23521b0 f59639d;

    /* renamed from: e */
    public final Map<Class<?>, Object> f59640e;

    /* renamed from: f */
    public volatile C23531d f59641f;

    public C23571x(C23572a aVar) {
        Map<Class<?>, Object> map;
        this.f59636a = aVar.f59642a;
        this.f59637b = aVar.f59643b;
        C23556q.C23557a aVar2 = aVar.f59644c;
        aVar2.getClass();
        this.f59638c = new C23556q(aVar2);
        this.f59639d = aVar.f59645d;
        Map<Class<?>, Object> map2 = aVar.f59646e;
        byte[] bArr = C23610d.f59684a;
        if (map2.isEmpty()) {
            map = Collections.emptyMap();
        } else {
            map = Collections.unmodifiableMap(new LinkedHashMap(map2));
        }
        this.f59640e = map;
    }

    /* renamed from: a */
    public final String mo58725a(String str) {
        return this.f59638c.mo58682c(str);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("Request{method=");
        k.append(this.f59637b);
        k.append(", url=");
        k.append(this.f59636a);
        k.append(", tags=");
        k.append(this.f59640e);
        k.append('}');
        return k.toString();
    }

    /* renamed from: hi0.x$a */
    public static class C23572a {

        /* renamed from: a */
        public C23558r f59642a;

        /* renamed from: b */
        public String f59643b;

        /* renamed from: c */
        public C23556q.C23557a f59644c;

        /* renamed from: d */
        public C23521b0 f59645d;

        /* renamed from: e */
        public Map<Class<?>, Object> f59646e;

        public C23572a() {
            this.f59646e = Collections.emptyMap();
            this.f59643b = "GET";
            this.f59644c = new C23556q.C23557a();
        }

        /* renamed from: a */
        public final C23571x mo58727a() {
            if (this.f59642a != null) {
                return new C23571x(this);
            }
            throw new IllegalStateException("url == null");
        }

        /* renamed from: b */
        public final void mo58728b(String str, C23521b0 b0Var) {
            boolean z;
            if (str == null) {
                throw new NullPointerException("method == null");
            } else if (str.length() == 0) {
                throw new IllegalArgumentException("method.length() == 0");
            } else if (b0Var == null || C24361g.m61163g0(str)) {
                if (b0Var == null) {
                    if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        throw new IllegalArgumentException(C13437d.m33706k("method ", str, " must have a request body."));
                    }
                }
                this.f59643b = str;
                this.f59645d = b0Var;
            } else {
                throw new IllegalArgumentException(C13437d.m33706k("method ", str, " must not have a request body."));
            }
        }

        /* renamed from: c */
        public final void mo58729c(String str) {
            this.f59644c.mo58694e(str);
        }

        /* renamed from: d */
        public final void mo58730d(C23558r rVar) {
            if (rVar != null) {
                this.f59642a = rVar;
                return;
            }
            throw new NullPointerException("url == null");
        }

        /* renamed from: e */
        public final void mo58731e(String str) {
            if (str != null) {
                if (str.regionMatches(true, 0, "ws:", 0, 3)) {
                    StringBuilder k = C13555b.m33972k("http:");
                    k.append(str.substring(3));
                    str = k.toString();
                } else if (str.regionMatches(true, 0, "wss:", 0, 4)) {
                    StringBuilder k2 = C13555b.m33972k("https:");
                    k2.append(str.substring(4));
                    str = k2.toString();
                }
                mo58730d(C23558r.m57725j(str));
                return;
            }
            throw new NullPointerException("url == null");
        }

        public C23572a(C23571x xVar) {
            Map<Class<?>, Object> map;
            this.f59646e = Collections.emptyMap();
            this.f59642a = xVar.f59636a;
            this.f59643b = xVar.f59637b;
            this.f59645d = xVar.f59639d;
            if (xVar.f59640e.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = new LinkedHashMap<>(xVar.f59640e);
            }
            this.f59646e = map;
            this.f59644c = xVar.f59638c.mo58684e();
        }
    }
}
