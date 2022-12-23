package hi0;

import hi0.C23556q;
import java.io.Closeable;
import ki0.C23795c;
import okhttp3.Protocol;

/* renamed from: hi0.c0 */
public final class C23529c0 implements Closeable {

    /* renamed from: b */
    public final C23571x f59410b;

    /* renamed from: c */
    public final Protocol f59411c;

    /* renamed from: d */
    public final int f59412d;

    /* renamed from: e */
    public final String f59413e;

    /* renamed from: f */
    public final C23555p f59414f;

    /* renamed from: g */
    public final C23556q f59415g;

    /* renamed from: h */
    public final C23536e0 f59416h;

    /* renamed from: i */
    public final C23529c0 f59417i;

    /* renamed from: j */
    public final C23529c0 f59418j;

    /* renamed from: k */
    public final C23529c0 f59419k;

    /* renamed from: l */
    public final long f59420l;

    /* renamed from: m */
    public final long f59421m;

    /* renamed from: n */
    public final C23795c f59422n;

    /* renamed from: o */
    public volatile C23531d f59423o;

    public C23529c0(C23530a aVar) {
        this.f59410b = aVar.f59424a;
        this.f59411c = aVar.f59425b;
        this.f59412d = aVar.f59426c;
        this.f59413e = aVar.f59427d;
        this.f59414f = aVar.f59428e;
        C23556q.C23557a aVar2 = aVar.f59429f;
        aVar2.getClass();
        this.f59415g = new C23556q(aVar2);
        this.f59416h = aVar.f59430g;
        this.f59417i = aVar.f59431h;
        this.f59418j = aVar.f59432i;
        this.f59419k = aVar.f59433j;
        this.f59420l = aVar.f59434k;
        this.f59421m = aVar.f59435l;
        this.f59422n = aVar.f59436m;
    }

    public final void close() {
        C23536e0 e0Var = this.f59416h;
        if (e0Var != null) {
            e0Var.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed");
    }

    /* renamed from: e */
    public final C23536e0 mo58638e() {
        return this.f59416h;
    }

    /* renamed from: i */
    public final C23531d mo58639i() {
        C23531d dVar = this.f59423o;
        if (dVar != null) {
            return dVar;
        }
        C23531d a = C23531d.m57670a(this.f59415g);
        this.f59423o = a;
        return a;
    }

    /* renamed from: q */
    public final int mo58640q() {
        return this.f59412d;
    }

    /* renamed from: r */
    public final String mo58641r(String str) {
        String c = this.f59415g.mo58682c(str);
        if (c != null) {
            return c;
        }
        return null;
    }

    /* renamed from: t */
    public final C23556q mo58642t() {
        return this.f59415g;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("Response{protocol=");
        k.append(this.f59411c);
        k.append(", code=");
        k.append(this.f59412d);
        k.append(", message=");
        k.append(this.f59413e);
        k.append(", url=");
        k.append(this.f59410b.f59636a);
        k.append('}');
        return k.toString();
    }

    /* renamed from: v */
    public final boolean mo58644v() {
        int i = this.f59412d;
        return i >= 200 && i < 300;
    }

    /* renamed from: hi0.c0$a */
    public static class C23530a {

        /* renamed from: a */
        public C23571x f59424a;

        /* renamed from: b */
        public Protocol f59425b;

        /* renamed from: c */
        public int f59426c;

        /* renamed from: d */
        public String f59427d;

        /* renamed from: e */
        public C23555p f59428e;

        /* renamed from: f */
        public C23556q.C23557a f59429f;

        /* renamed from: g */
        public C23536e0 f59430g;

        /* renamed from: h */
        public C23529c0 f59431h;

        /* renamed from: i */
        public C23529c0 f59432i;

        /* renamed from: j */
        public C23529c0 f59433j;

        /* renamed from: k */
        public long f59434k;

        /* renamed from: l */
        public long f59435l;

        /* renamed from: m */
        public C23795c f59436m;

        public C23530a() {
            this.f59426c = -1;
            this.f59429f = new C23556q.C23557a();
        }

        /* renamed from: b */
        public static void m57668b(String str, C23529c0 c0Var) {
            if (c0Var.f59416h != null) {
                throw new IllegalArgumentException(C25541a.m63881k(str, ".body != null"));
            } else if (c0Var.f59417i != null) {
                throw new IllegalArgumentException(C25541a.m63881k(str, ".networkResponse != null"));
            } else if (c0Var.f59418j != null) {
                throw new IllegalArgumentException(C25541a.m63881k(str, ".cacheResponse != null"));
            } else if (c0Var.f59419k != null) {
                throw new IllegalArgumentException(C25541a.m63881k(str, ".priorResponse != null"));
            }
        }

        /* renamed from: a */
        public final C23529c0 mo58645a() {
            if (this.f59424a == null) {
                throw new IllegalStateException("request == null");
            } else if (this.f59425b == null) {
                throw new IllegalStateException("protocol == null");
            } else if (this.f59426c < 0) {
                StringBuilder k = C13555b.m33972k("code < 0: ");
                k.append(this.f59426c);
                throw new IllegalStateException(k.toString());
            } else if (this.f59427d != null) {
                return new C23529c0(this);
            } else {
                throw new IllegalStateException("message == null");
            }
        }

        public C23530a(C23529c0 c0Var) {
            this.f59426c = -1;
            this.f59424a = c0Var.f59410b;
            this.f59425b = c0Var.f59411c;
            this.f59426c = c0Var.f59412d;
            this.f59427d = c0Var.f59413e;
            this.f59428e = c0Var.f59414f;
            this.f59429f = c0Var.f59415g.mo58684e();
            this.f59430g = c0Var.f59416h;
            this.f59431h = c0Var.f59417i;
            this.f59432i = c0Var.f59418j;
            this.f59433j = c0Var.f59419k;
            this.f59434k = c0Var.f59420l;
            this.f59435l = c0Var.f59421m;
            this.f59436m = c0Var.f59422n;
        }
    }
}
