package com.veriff.sdk.internal;

import com.veriff.sdk.internal.C22736yk;
import java.io.Closeable;

/* renamed from: com.veriff.sdk.internal.yu */
public final class C22757yu implements Closeable {

    /* renamed from: a */
    public final C22752ys f57651a;

    /* renamed from: b */
    public final C22749yq f57652b;

    /* renamed from: c */
    public final int f57653c;

    /* renamed from: d */
    public final String f57654d;

    /* renamed from: e */
    public final C22735yj f57655e;

    /* renamed from: f */
    public final C22736yk f57656f;

    /* renamed from: g */
    public final C22759yv f57657g;

    /* renamed from: h */
    public final C22757yu f57658h;

    /* renamed from: i */
    public final C22757yu f57659i;

    /* renamed from: j */
    public final C22757yu f57660j;

    /* renamed from: k */
    public final long f57661k;

    /* renamed from: l */
    public final long f57662l;

    /* renamed from: m */
    public final C22784zk f57663m;

    /* renamed from: n */
    private volatile C22711xv f57664n;

    /* renamed from: com.veriff.sdk.internal.yu$a */
    public static class C22758a {

        /* renamed from: a */
        public C22752ys f57665a;

        /* renamed from: b */
        public C22749yq f57666b;

        /* renamed from: c */
        public int f57667c;

        /* renamed from: d */
        public String f57668d;

        /* renamed from: e */
        public C22735yj f57669e;

        /* renamed from: f */
        public C22736yk.C22737a f57670f;

        /* renamed from: g */
        public C22759yv f57671g;

        /* renamed from: h */
        public C22757yu f57672h;

        /* renamed from: i */
        public C22757yu f57673i;

        /* renamed from: j */
        public C22757yu f57674j;

        /* renamed from: k */
        public long f57675k;

        /* renamed from: l */
        public long f57676l;

        /* renamed from: m */
        public C22784zk f57677m;

        public C22758a() {
            this.f57667c = -1;
            this.f57670f = new C22736yk.C22737a();
        }

        /* renamed from: d */
        private void m55767d(C22757yu yuVar) {
            if (yuVar.f57657g != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        /* renamed from: a */
        public C22758a mo57438a(C22752ys ysVar) {
            this.f57665a = ysVar;
            return this;
        }

        /* renamed from: b */
        public C22758a mo57447b(String str, String str2) {
            this.f57670f.mo57276a(str, str2);
            return this;
        }

        /* renamed from: c */
        public C22758a mo57448c(C22757yu yuVar) {
            if (yuVar != null) {
                m55767d(yuVar);
            }
            this.f57674j = yuVar;
            return this;
        }

        /* renamed from: a */
        public C22758a mo57437a(C22749yq yqVar) {
            this.f57666b = yqVar;
            return this;
        }

        /* renamed from: b */
        public C22758a mo57446b(C22757yu yuVar) {
            if (yuVar != null) {
                m55766a("cacheResponse", yuVar);
            }
            this.f57673i = yuVar;
            return this;
        }

        /* renamed from: a */
        public C22758a mo57433a(int i) {
            this.f57667c = i;
            return this;
        }

        public C22758a(C22757yu yuVar) {
            this.f57667c = -1;
            this.f57665a = yuVar.f57651a;
            this.f57666b = yuVar.f57652b;
            this.f57667c = yuVar.f57653c;
            this.f57668d = yuVar.f57654d;
            this.f57669e = yuVar.f57655e;
            this.f57670f = yuVar.f57656f.mo57268b();
            this.f57671g = yuVar.f57657g;
            this.f57672h = yuVar.f57658h;
            this.f57673i = yuVar.f57659i;
            this.f57674j = yuVar.f57660j;
            this.f57675k = yuVar.f57661k;
            this.f57676l = yuVar.f57662l;
            this.f57677m = yuVar.f57663m;
        }

        /* renamed from: a */
        public C22758a mo57441a(String str) {
            this.f57668d = str;
            return this;
        }

        /* renamed from: b */
        public C22758a mo57445b(long j) {
            this.f57676l = j;
            return this;
        }

        /* renamed from: a */
        public C22758a mo57435a(C22735yj yjVar) {
            this.f57669e = yjVar;
            return this;
        }

        /* renamed from: a */
        public C22758a mo57442a(String str, String str2) {
            this.f57670f.mo57280c(str, str2);
            return this;
        }

        /* renamed from: a */
        public C22758a mo57436a(C22736yk ykVar) {
            this.f57670f = ykVar.mo57268b();
            return this;
        }

        /* renamed from: a */
        public C22758a mo57440a(C22759yv yvVar) {
            this.f57671g = yvVar;
            return this;
        }

        /* renamed from: a */
        public C22758a mo57439a(C22757yu yuVar) {
            if (yuVar != null) {
                m55766a("networkResponse", yuVar);
            }
            this.f57672h = yuVar;
            return this;
        }

        /* renamed from: a */
        private void m55766a(String str, C22757yu yuVar) {
            if (yuVar.f57657g != null) {
                throw new IllegalArgumentException(C25541a.m63881k(str, ".body != null"));
            } else if (yuVar.f57658h != null) {
                throw new IllegalArgumentException(C25541a.m63881k(str, ".networkResponse != null"));
            } else if (yuVar.f57659i != null) {
                throw new IllegalArgumentException(C25541a.m63881k(str, ".cacheResponse != null"));
            } else if (yuVar.f57660j != null) {
                throw new IllegalArgumentException(C25541a.m63881k(str, ".priorResponse != null"));
            }
        }

        /* renamed from: a */
        public C22758a mo57434a(long j) {
            this.f57675k = j;
            return this;
        }

        /* renamed from: a */
        public void mo57444a(C22784zk zkVar) {
            this.f57677m = zkVar;
        }

        /* renamed from: a */
        public C22757yu mo57443a() {
            if (this.f57665a == null) {
                throw new IllegalStateException("request == null");
            } else if (this.f57666b == null) {
                throw new IllegalStateException("protocol == null");
            } else if (this.f57667c < 0) {
                StringBuilder k = C13555b.m33972k("code < 0: ");
                k.append(this.f57667c);
                throw new IllegalStateException(k.toString());
            } else if (this.f57668d != null) {
                return new C22757yu(this);
            } else {
                throw new IllegalStateException("message == null");
            }
        }
    }

    public C22757yu(C22758a aVar) {
        this.f57651a = aVar.f57665a;
        this.f57652b = aVar.f57666b;
        this.f57653c = aVar.f57667c;
        this.f57654d = aVar.f57668d;
        this.f57655e = aVar.f57669e;
        this.f57656f = aVar.f57670f.mo57277a();
        this.f57657g = aVar.f57671g;
        this.f57658h = aVar.f57672h;
        this.f57659i = aVar.f57673i;
        this.f57660j = aVar.f57674j;
        this.f57661k = aVar.f57675k;
        this.f57662l = aVar.f57676l;
        this.f57663m = aVar.f57677m;
    }

    /* renamed from: a */
    public C22752ys mo57414a() {
        return this.f57651a;
    }

    /* renamed from: b */
    public C22749yq mo57417b() {
        return this.f57652b;
    }

    /* renamed from: c */
    public int mo57418c() {
        return this.f57653c;
    }

    public void close() {
        C22759yv yvVar = this.f57657g;
        if (yvVar != null) {
            yvVar.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed");
    }

    /* renamed from: d */
    public boolean mo57420d() {
        int i = this.f57653c;
        return i >= 200 && i < 300;
    }

    /* renamed from: e */
    public String mo57421e() {
        return this.f57654d;
    }

    /* renamed from: f */
    public C22735yj mo57422f() {
        return this.f57655e;
    }

    /* renamed from: g */
    public C22736yk mo57423g() {
        return this.f57656f;
    }

    /* renamed from: h */
    public C22759yv mo57424h() {
        return this.f57657g;
    }

    /* renamed from: i */
    public C22758a mo57425i() {
        return new C22758a(this);
    }

    /* renamed from: j */
    public C22757yu mo57426j() {
        return this.f57658h;
    }

    /* renamed from: k */
    public C22757yu mo57427k() {
        return this.f57659i;
    }

    /* renamed from: l */
    public C22757yu mo57428l() {
        return this.f57660j;
    }

    /* renamed from: m */
    public C22711xv mo57429m() {
        C22711xv xvVar = this.f57664n;
        if (xvVar != null) {
            return xvVar;
        }
        C22711xv a = C22711xv.m55435a(this.f57656f);
        this.f57664n = a;
        return a;
    }

    /* renamed from: n */
    public long mo57430n() {
        return this.f57661k;
    }

    /* renamed from: o */
    public long mo57431o() {
        return this.f57662l;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("Response{protocol=");
        k.append(this.f57652b);
        k.append(", code=");
        k.append(this.f57653c);
        k.append(", message=");
        k.append(this.f57654d);
        k.append(", url=");
        k.append(this.f57651a.mo57390a());
        k.append('}');
        return k.toString();
    }

    /* renamed from: a */
    public String mo57415a(String str) {
        return mo57416a(str, (String) null);
    }

    /* renamed from: a */
    public String mo57416a(String str, String str2) {
        String a = this.f57656f.mo57267a(str);
        return a != null ? a : str2;
    }
}
