package com.veriff.sdk.internal;

import com.veriff.sdk.internal.C22736yk;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p358af.C13437d;
import zendesk.support.Constants;

/* renamed from: com.veriff.sdk.internal.ys */
public final class C22752ys {

    /* renamed from: a */
    public final C22738yl f57634a;

    /* renamed from: b */
    public final String f57635b;

    /* renamed from: c */
    public final C22736yk f57636c;

    /* renamed from: d */
    public final C22754yt f57637d;

    /* renamed from: e */
    public final Map<Class<?>, Object> f57638e;

    /* renamed from: f */
    private volatile C22711xv f57639f;

    /* renamed from: com.veriff.sdk.internal.ys$a */
    public static class C22753a {

        /* renamed from: a */
        public C22738yl f57640a;

        /* renamed from: b */
        public String f57641b;

        /* renamed from: c */
        public C22736yk.C22737a f57642c;

        /* renamed from: d */
        public C22754yt f57643d;

        /* renamed from: e */
        public Map<Class<?>, Object> f57644e;

        public C22753a() {
            this.f57644e = Collections.emptyMap();
            this.f57641b = "GET";
            this.f57642c = new C22736yk.C22737a();
        }

        /* renamed from: a */
        public C22753a mo57403a(C22738yl ylVar) {
            if (ylVar != null) {
                this.f57640a = ylVar;
                return this;
            }
            throw new NullPointerException("url == null");
        }

        /* renamed from: b */
        public C22753a mo57411b(String str, String str2) {
            this.f57642c.mo57276a(str, str2);
            return this;
        }

        /* renamed from: b */
        public C22753a mo57410b(String str) {
            this.f57642c.mo57278b(str);
            return this;
        }

        /* renamed from: a */
        public C22753a mo57406a(String str) {
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
                return mo57403a(C22738yl.m55584f(str));
            }
            throw new NullPointerException("url == null");
        }

        public C22753a(C22752ys ysVar) {
            Map<Class<?>, Object> map;
            this.f57644e = Collections.emptyMap();
            this.f57640a = ysVar.f57634a;
            this.f57641b = ysVar.f57635b;
            this.f57643d = ysVar.f57637d;
            if (ysVar.f57638e.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = new LinkedHashMap<>(ysVar.f57638e);
            }
            this.f57644e = map;
            this.f57642c = ysVar.f57636c.mo57268b();
        }

        /* renamed from: a */
        public C22753a mo57408a(String str, String str2) {
            this.f57642c.mo57280c(str, str2);
            return this;
        }

        /* renamed from: a */
        public C22753a mo57402a(C22736yk ykVar) {
            this.f57642c = ykVar.mo57268b();
            return this;
        }

        /* renamed from: a */
        public C22753a mo57401a(C22711xv xvVar) {
            String xvVar2 = xvVar.toString();
            if (xvVar2.isEmpty()) {
                return mo57410b(Constants.STANDARD_CACHING_HEADER);
            }
            return mo57408a(Constants.STANDARD_CACHING_HEADER, xvVar2);
        }

        /* renamed from: a */
        public C22753a mo57404a(C22754yt ytVar) {
            return mo57407a("POST", ytVar);
        }

        /* renamed from: a */
        public C22753a mo57407a(String str, C22754yt ytVar) {
            if (str == null) {
                throw new NullPointerException("method == null");
            } else if (str.length() == 0) {
                throw new IllegalArgumentException("method.length() == 0");
            } else if (ytVar != null && !C22803zx.m56039c(str)) {
                throw new IllegalArgumentException(C13437d.m33706k("method ", str, " must not have a request body."));
            } else if (ytVar != null || !C22803zx.m56038b(str)) {
                this.f57641b = str;
                this.f57643d = ytVar;
                return this;
            } else {
                throw new IllegalArgumentException(C13437d.m33706k("method ", str, " must have a request body."));
            }
        }

        /* renamed from: a */
        public <T> C22753a mo57405a(Class<? super T> cls, T t) {
            if (cls != null) {
                if (t == null) {
                    this.f57644e.remove(cls);
                } else {
                    if (this.f57644e.isEmpty()) {
                        this.f57644e = new LinkedHashMap();
                    }
                    this.f57644e.put(cls, cls.cast(t));
                }
                return this;
            }
            throw new NullPointerException("type == null");
        }

        /* renamed from: a */
        public C22752ys mo57409a() {
            if (this.f57640a != null) {
                return new C22752ys(this);
            }
            throw new IllegalStateException("url == null");
        }
    }

    public C22752ys(C22753a aVar) {
        this.f57634a = aVar.f57640a;
        this.f57635b = aVar.f57641b;
        this.f57636c = aVar.f57642c.mo57277a();
        this.f57637d = aVar.f57643d;
        this.f57638e = C22766za.m55830a(aVar.f57644e);
    }

    /* renamed from: a */
    public C22738yl mo57390a() {
        return this.f57634a;
    }

    /* renamed from: b */
    public String mo57393b() {
        return this.f57635b;
    }

    /* renamed from: c */
    public C22736yk mo57395c() {
        return this.f57636c;
    }

    /* renamed from: d */
    public C22754yt mo57396d() {
        return this.f57637d;
    }

    /* renamed from: e */
    public C22753a mo57397e() {
        return new C22753a(this);
    }

    /* renamed from: f */
    public C22711xv mo57398f() {
        C22711xv xvVar = this.f57639f;
        if (xvVar != null) {
            return xvVar;
        }
        C22711xv a = C22711xv.m55435a(this.f57636c);
        this.f57639f = a;
        return a;
    }

    /* renamed from: g */
    public boolean mo57399g() {
        return this.f57634a.mo57287c();
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("Request{method=");
        k.append(this.f57635b);
        k.append(", url=");
        k.append(this.f57634a);
        k.append(", tags=");
        k.append(this.f57638e);
        k.append('}');
        return k.toString();
    }

    /* renamed from: a */
    public String mo57392a(String str) {
        return this.f57636c.mo57267a(str);
    }

    /* renamed from: b */
    public List<String> mo57394b(String str) {
        return this.f57636c.mo57270b(str);
    }

    /* renamed from: a */
    public <T> T mo57391a(Class<? extends T> cls) {
        return cls.cast(this.f57638e.get(cls));
    }
}
