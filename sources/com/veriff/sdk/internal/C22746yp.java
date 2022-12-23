package com.veriff.sdk.internal;

import com.veriff.sdk.internal.C22713xw;
import com.veriff.sdk.internal.C22730yh;
import com.veriff.sdk.internal.C22736yk;
import com.veriff.sdk.internal.C22757yu;
import java.net.Proxy;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* renamed from: com.veriff.sdk.internal.yp */
public class C22746yp implements C22713xw.C22714a, Cloneable {

    /* renamed from: a */
    public static final List<C22749yq> f57559a = C22766za.m55829a((T[]) new C22749yq[]{C22749yq.HTTP_2, C22749yq.HTTP_1_1});

    /* renamed from: b */
    public static final List<C22723yc> f57560b = C22766za.m55829a((T[]) new C22723yc[]{C22723yc.f57477b, C22723yc.f57478d});

    /* renamed from: A */
    public final int f57561A;

    /* renamed from: B */
    public final int f57562B;

    /* renamed from: C */
    public final int f57563C;

    /* renamed from: D */
    public final int f57564D;

    /* renamed from: c */
    public final C22728yf f57565c;

    /* renamed from: d */
    public final Proxy f57566d;

    /* renamed from: e */
    public final List<C22749yq> f57567e;

    /* renamed from: f */
    public final List<C22723yc> f57568f;

    /* renamed from: g */
    public final List<C22740ym> f57569g;

    /* renamed from: h */
    public final List<C22740ym> f57570h;

    /* renamed from: i */
    public final C22730yh.C22732a f57571i;

    /* renamed from: j */
    public final ProxySelector f57572j;

    /* renamed from: k */
    public final C22726ye f57573k;

    /* renamed from: l */
    public final C22704xu f57574l;

    /* renamed from: m */
    public final C22781zh f57575m;

    /* renamed from: n */
    public final SocketFactory f57576n;

    /* renamed from: o */
    public final SSLSocketFactory f57577o;

    /* renamed from: p */
    public final abd f57578p;

    /* renamed from: q */
    public final HostnameVerifier f57579q;

    /* renamed from: r */
    public final C22716xy f57580r;

    /* renamed from: s */
    public final C22703xt f57581s;

    /* renamed from: t */
    public final C22703xt f57582t;

    /* renamed from: u */
    public final C22722yb f57583u;

    /* renamed from: v */
    public final C22729yg f57584v;

    /* renamed from: w */
    public final boolean f57585w;

    /* renamed from: x */
    public final boolean f57586x;

    /* renamed from: y */
    public final boolean f57587y;

    /* renamed from: z */
    public final int f57588z;

    static {
        C22763yy.f57691a = new C22763yy() {
            /* renamed from: a */
            public void mo57371a(C22736yk.C22737a aVar, String str) {
                aVar.mo57275a(str);
            }

            /* renamed from: a */
            public void mo57372a(C22736yk.C22737a aVar, String str, String str2) {
                aVar.mo57279b(str, str2);
            }

            /* renamed from: a */
            public C22789zn mo57369a(C22722yb ybVar) {
                return ybVar.f57476a;
            }

            /* renamed from: a */
            public boolean mo57374a(C22702xs xsVar, C22702xs xsVar2) {
                return xsVar.mo57138a(xsVar2);
            }

            /* renamed from: a */
            public int mo57367a(C22757yu.C22758a aVar) {
                return aVar.f57667c;
            }

            /* renamed from: a */
            public void mo57370a(C22723yc ycVar, SSLSocket sSLSocket, boolean z) {
                ycVar.mo57204a(sSLSocket, z);
            }

            /* renamed from: a */
            public void mo57373a(C22757yu.C22758a aVar, C22784zk zkVar) {
                aVar.mo57444a(zkVar);
            }

            /* renamed from: a */
            public C22784zk mo57368a(C22757yu yuVar) {
                return yuVar.f57663m;
            }
        };
    }

    public C22746yp() {
        this(new C22748a());
    }

    /* renamed from: a */
    private static SSLSocketFactory m55653a(X509TrustManager x509TrustManager) {
        try {
            SSLContext c = aay.m50281e().mo53805c();
            c.init((KeyManager[]) null, new TrustManager[]{x509TrustManager}, (SecureRandom) null);
            return c.getSocketFactory();
        } catch (GeneralSecurityException e) {
            throw new AssertionError("No System TLS", e);
        }
    }

    /* renamed from: A */
    public C22730yh.C22732a mo57339A() {
        return this.f57571i;
    }

    /* renamed from: B */
    public C22748a mo57340B() {
        return new C22748a(this);
    }

    /* renamed from: b */
    public int mo57342b() {
        return this.f57561A;
    }

    /* renamed from: c */
    public int mo57343c() {
        return this.f57562B;
    }

    /* renamed from: d */
    public int mo57344d() {
        return this.f57563C;
    }

    /* renamed from: e */
    public int mo57345e() {
        return this.f57564D;
    }

    /* renamed from: f */
    public Proxy mo57346f() {
        return this.f57566d;
    }

    /* renamed from: g */
    public ProxySelector mo57347g() {
        return this.f57572j;
    }

    /* renamed from: h */
    public C22726ye mo57348h() {
        return this.f57573k;
    }

    /* renamed from: i */
    public C22704xu mo57349i() {
        return this.f57574l;
    }

    /* renamed from: j */
    public C22781zh mo57350j() {
        C22704xu xuVar = this.f57574l;
        return xuVar != null ? xuVar.f57398a : this.f57575m;
    }

    /* renamed from: k */
    public C22729yg mo57351k() {
        return this.f57584v;
    }

    /* renamed from: l */
    public SocketFactory mo57352l() {
        return this.f57576n;
    }

    /* renamed from: m */
    public SSLSocketFactory mo57353m() {
        return this.f57577o;
    }

    /* renamed from: n */
    public HostnameVerifier mo57354n() {
        return this.f57579q;
    }

    /* renamed from: o */
    public C22716xy mo57355o() {
        return this.f57580r;
    }

    /* renamed from: p */
    public C22703xt mo57356p() {
        return this.f57582t;
    }

    /* renamed from: q */
    public C22703xt mo57357q() {
        return this.f57581s;
    }

    /* renamed from: r */
    public C22722yb mo57358r() {
        return this.f57583u;
    }

    /* renamed from: s */
    public boolean mo57359s() {
        return this.f57585w;
    }

    /* renamed from: t */
    public boolean mo57360t() {
        return this.f57586x;
    }

    /* renamed from: u */
    public boolean mo57361u() {
        return this.f57587y;
    }

    /* renamed from: v */
    public C22728yf mo57362v() {
        return this.f57565c;
    }

    /* renamed from: w */
    public List<C22749yq> mo57363w() {
        return this.f57567e;
    }

    /* renamed from: x */
    public List<C22723yc> mo57364x() {
        return this.f57568f;
    }

    /* renamed from: y */
    public List<C22740ym> mo57365y() {
        return this.f57569g;
    }

    /* renamed from: z */
    public List<C22740ym> mo57366z() {
        return this.f57570h;
    }

    /* renamed from: com.veriff.sdk.internal.yp$a */
    public static final class C22748a {

        /* renamed from: A */
        public int f57589A;

        /* renamed from: B */
        public int f57590B;

        /* renamed from: a */
        public C22728yf f57591a;

        /* renamed from: b */
        public Proxy f57592b;

        /* renamed from: c */
        public List<C22749yq> f57593c;

        /* renamed from: d */
        public List<C22723yc> f57594d;

        /* renamed from: e */
        public final List<C22740ym> f57595e;

        /* renamed from: f */
        public final List<C22740ym> f57596f;

        /* renamed from: g */
        public C22730yh.C22732a f57597g;

        /* renamed from: h */
        public ProxySelector f57598h;

        /* renamed from: i */
        public C22726ye f57599i;

        /* renamed from: j */
        public C22704xu f57600j;

        /* renamed from: k */
        public C22781zh f57601k;

        /* renamed from: l */
        public SocketFactory f57602l;

        /* renamed from: m */
        public SSLSocketFactory f57603m;

        /* renamed from: n */
        public abd f57604n;

        /* renamed from: o */
        public HostnameVerifier f57605o;

        /* renamed from: p */
        public C22716xy f57606p;

        /* renamed from: q */
        public C22703xt f57607q;

        /* renamed from: r */
        public C22703xt f57608r;

        /* renamed from: s */
        public C22722yb f57609s;

        /* renamed from: t */
        public C22729yg f57610t;

        /* renamed from: u */
        public boolean f57611u;

        /* renamed from: v */
        public boolean f57612v;

        /* renamed from: w */
        public boolean f57613w;

        /* renamed from: x */
        public int f57614x;

        /* renamed from: y */
        public int f57615y;

        /* renamed from: z */
        public int f57616z;

        public C22748a() {
            this.f57595e = new ArrayList();
            this.f57596f = new ArrayList();
            this.f57591a = new C22728yf();
            this.f57593c = C22746yp.f57559a;
            this.f57594d = C22746yp.f57560b;
            this.f57597g = C22730yh.m55513a(C22730yh.f57509a);
            ProxySelector proxySelector = ProxySelector.getDefault();
            this.f57598h = proxySelector;
            if (proxySelector == null) {
                this.f57598h = new aaz();
            }
            this.f57599i = C22726ye.f57500a;
            this.f57602l = SocketFactory.getDefault();
            this.f57605o = abe.f53542a;
            this.f57606p = C22716xy.f57450a;
            C22703xt xtVar = C22703xt.f57397a;
            this.f57607q = xtVar;
            this.f57608r = xtVar;
            this.f57609s = new C22722yb();
            this.f57610t = C22729yg.f57508a;
            this.f57611u = true;
            this.f57612v = true;
            this.f57613w = true;
            this.f57614x = 0;
            this.f57615y = 10000;
            this.f57616z = 10000;
            this.f57589A = 10000;
            this.f57590B = 0;
        }

        /* renamed from: a */
        public C22748a mo57375a(C22704xu xuVar) {
            this.f57600j = xuVar;
            this.f57601k = null;
            return this;
        }

        /* renamed from: a */
        public C22748a mo57377a(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
            if (sSLSocketFactory == null) {
                throw new NullPointerException("sslSocketFactory == null");
            } else if (x509TrustManager != null) {
                this.f57603m = sSLSocketFactory;
                this.f57604n = abd.m50311a(x509TrustManager);
                return this;
            } else {
                throw new NullPointerException("trustManager == null");
            }
        }

        /* renamed from: a */
        public C22748a mo57376a(C22740ym ymVar) {
            if (ymVar != null) {
                this.f57595e.add(ymVar);
                return this;
            }
            throw new IllegalArgumentException("interceptor == null");
        }

        /* renamed from: a */
        public C22746yp mo57378a() {
            return new C22746yp(this);
        }

        public C22748a(C22746yp ypVar) {
            ArrayList arrayList = new ArrayList();
            this.f57595e = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.f57596f = arrayList2;
            this.f57591a = ypVar.f57565c;
            this.f57592b = ypVar.f57566d;
            this.f57593c = ypVar.f57567e;
            this.f57594d = ypVar.f57568f;
            arrayList.addAll(ypVar.f57569g);
            arrayList2.addAll(ypVar.f57570h);
            this.f57597g = ypVar.f57571i;
            this.f57598h = ypVar.f57572j;
            this.f57599i = ypVar.f57573k;
            this.f57601k = ypVar.f57575m;
            this.f57600j = ypVar.f57574l;
            this.f57602l = ypVar.f57576n;
            this.f57603m = ypVar.f57577o;
            this.f57604n = ypVar.f57578p;
            this.f57605o = ypVar.f57579q;
            this.f57606p = ypVar.f57580r;
            this.f57607q = ypVar.f57581s;
            this.f57608r = ypVar.f57582t;
            this.f57609s = ypVar.f57583u;
            this.f57610t = ypVar.f57584v;
            this.f57611u = ypVar.f57585w;
            this.f57612v = ypVar.f57586x;
            this.f57613w = ypVar.f57587y;
            this.f57614x = ypVar.f57588z;
            this.f57615y = ypVar.f57561A;
            this.f57616z = ypVar.f57562B;
            this.f57589A = ypVar.f57563C;
            this.f57590B = ypVar.f57564D;
        }
    }

    public C22746yp(C22748a aVar) {
        boolean z;
        this.f57565c = aVar.f57591a;
        this.f57566d = aVar.f57592b;
        this.f57567e = aVar.f57593c;
        List<C22723yc> list = aVar.f57594d;
        this.f57568f = list;
        this.f57569g = C22766za.m55828a(aVar.f57595e);
        this.f57570h = C22766za.m55828a(aVar.f57596f);
        this.f57571i = aVar.f57597g;
        this.f57572j = aVar.f57598h;
        this.f57573k = aVar.f57599i;
        this.f57574l = aVar.f57600j;
        this.f57575m = aVar.f57601k;
        this.f57576n = aVar.f57602l;
        Iterator<C22723yc> it = list.iterator();
        loop0:
        while (true) {
            z = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                C22723yc next = it.next();
                if (z || next.mo57205a()) {
                    z = true;
                }
            }
        }
        SSLSocketFactory sSLSocketFactory = aVar.f57603m;
        if (sSLSocketFactory != null || !z) {
            this.f57577o = sSLSocketFactory;
            this.f57578p = aVar.f57604n;
        } else {
            X509TrustManager a = C22766za.m55832a();
            this.f57577o = m55653a(a);
            this.f57578p = abd.m50311a(a);
        }
        if (this.f57577o != null) {
            aay.m50281e().mo53814a(this.f57577o);
        }
        this.f57579q = aVar.f57605o;
        this.f57580r = aVar.f57606p.mo57192a(this.f57578p);
        this.f57581s = aVar.f57607q;
        this.f57582t = aVar.f57608r;
        this.f57583u = aVar.f57609s;
        this.f57584v = aVar.f57610t;
        this.f57585w = aVar.f57611u;
        this.f57586x = aVar.f57612v;
        this.f57587y = aVar.f57613w;
        this.f57588z = aVar.f57614x;
        this.f57561A = aVar.f57615y;
        this.f57562B = aVar.f57616z;
        this.f57563C = aVar.f57589A;
        this.f57564D = aVar.f57590B;
        if (this.f57569g.contains((Object) null)) {
            StringBuilder k = C13555b.m33972k("Null interceptor: ");
            k.append(this.f57569g);
            throw new IllegalStateException(k.toString());
        } else if (this.f57570h.contains((Object) null)) {
            StringBuilder k2 = C13555b.m33972k("Null network interceptor: ");
            k2.append(this.f57570h);
            throw new IllegalStateException(k2.toString());
        }
    }

    /* renamed from: a */
    public int mo57341a() {
        return this.f57588z;
    }

    /* renamed from: a */
    public C22713xw mo57191a(C22752ys ysVar) {
        return C22750yr.m55696a(this, ysVar, false);
    }
}
