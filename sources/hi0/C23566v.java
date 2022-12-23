package hi0;

import com.facebook.appevents.C2341k;
import hi0.C23534e;
import hi0.C23550n;
import ii0.C23607a;
import ii0.C23610d;
import java.net.Proxy;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import ji0.C23749h;
import okhttp3.Protocol;
import p304x.C7071l0;
import p330z2.C7428f;
import pi0.C24721f;
import qi0.C24789a;
import ri0.C24831c;
import ri0.C24832d;

/* renamed from: hi0.v */
public class C23566v implements Cloneable, C23534e.C23535a {

    /* renamed from: D */
    public static final List<Protocol> f59570D = C23610d.m57805m(Protocol.HTTP_2, Protocol.HTTP_1_1);

    /* renamed from: E */
    public static final List<C23543i> f59571E = C23610d.m57805m(C23543i.f59490e, C23543i.f59491f);

    /* renamed from: A */
    public final int f59572A;

    /* renamed from: B */
    public final int f59573B;

    /* renamed from: C */
    public final int f59574C;

    /* renamed from: b */
    public final C23548l f59575b;

    /* renamed from: c */
    public final Proxy f59576c;

    /* renamed from: d */
    public final List<Protocol> f59577d;

    /* renamed from: e */
    public final List<C23543i> f59578e;

    /* renamed from: f */
    public final List<C23560s> f59579f;

    /* renamed from: g */
    public final List<C23560s> f59580g;

    /* renamed from: h */
    public final C23550n.C23552b f59581h;

    /* renamed from: i */
    public final ProxySelector f59582i;

    /* renamed from: j */
    public final C23546k f59583j;

    /* renamed from: k */
    public final C23522c f59584k;

    /* renamed from: l */
    public final C23749h f59585l;

    /* renamed from: m */
    public final SocketFactory f59586m;

    /* renamed from: n */
    public final SSLSocketFactory f59587n;

    /* renamed from: o */
    public final C24831c f59588o;

    /* renamed from: p */
    public final HostnameVerifier f59589p;

    /* renamed from: q */
    public final C23540g f59590q;

    /* renamed from: r */
    public final C23520b f59591r;

    /* renamed from: s */
    public final C23520b f59592s;

    /* renamed from: t */
    public final C7428f f59593t;

    /* renamed from: u */
    public final C23549m f59594u;

    /* renamed from: v */
    public final boolean f59595v;

    /* renamed from: w */
    public final boolean f59596w;

    /* renamed from: x */
    public final boolean f59597x;

    /* renamed from: y */
    public final int f59598y;

    /* renamed from: z */
    public final int f59599z;

    /* renamed from: hi0.v$a */
    public class C23567a extends C23607a {
    }

    static {
        C23607a.f59680a = new C23567a();
    }

    public C23566v() {
        this(new C23568b());
    }

    /* renamed from: a */
    public final C23569w mo58647a(C23571x xVar) {
        return C23569w.m57753i(this, xVar, false);
    }

    public C23566v(C23568b bVar) {
        boolean z;
        this.f59575b = bVar.f59602a;
        this.f59576c = bVar.f59603b;
        this.f59577d = bVar.f59604c;
        List<C23543i> list = bVar.f59605d;
        this.f59578e = list;
        this.f59579f = C23610d.m57804l(bVar.f59606e);
        this.f59580g = C23610d.m57804l(bVar.f59607f);
        this.f59581h = bVar.f59608g;
        this.f59582i = bVar.f59609h;
        this.f59583j = bVar.f59610i;
        this.f59584k = bVar.f59611j;
        this.f59585l = bVar.f59612k;
        this.f59586m = bVar.f59613l;
        Iterator<C23543i> it = list.iterator();
        loop0:
        while (true) {
            z = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                C23543i next = it.next();
                if (z || next.f59492a) {
                    z = true;
                }
            }
        }
        SSLSocketFactory sSLSocketFactory = bVar.f59614m;
        if (sSLSocketFactory != null || !z) {
            this.f59587n = sSLSocketFactory;
            this.f59588o = bVar.f59615n;
        } else {
            try {
                TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                instance.init((KeyStore) null);
                TrustManager[] trustManagers = instance.getTrustManagers();
                if (trustManagers.length == 1) {
                    TrustManager trustManager = trustManagers[0];
                    if (trustManager instanceof X509TrustManager) {
                        X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                        try {
                            C24721f fVar = C24721f.f62584a;
                            SSLContext i = fVar.mo61199i();
                            i.init((KeyManager[]) null, new TrustManager[]{x509TrustManager}, (SecureRandom) null);
                            this.f59587n = i.getSocketFactory();
                            this.f59588o = fVar.mo61196c(x509TrustManager);
                        } catch (GeneralSecurityException e) {
                            throw new AssertionError("No System TLS", e);
                        }
                    }
                }
                throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
            } catch (GeneralSecurityException e2) {
                throw new AssertionError("No System TLS", e2);
            }
        }
        SSLSocketFactory sSLSocketFactory2 = this.f59587n;
        if (sSLSocketFactory2 != null) {
            C24721f.f62584a.mo61210f(sSLSocketFactory2);
        }
        this.f59589p = bVar.f59616o;
        C23540g gVar = bVar.f59617p;
        C24831c cVar = this.f59588o;
        this.f59590q = !Objects.equals(gVar.f59466b, cVar) ? new C23540g(gVar.f59465a, cVar) : gVar;
        this.f59591r = bVar.f59618q;
        this.f59592s = bVar.f59619r;
        this.f59593t = bVar.f59620s;
        this.f59594u = bVar.f59621t;
        this.f59595v = bVar.f59622u;
        this.f59596w = bVar.f59623v;
        this.f59597x = bVar.f59624w;
        this.f59598y = bVar.f59625x;
        this.f59599z = bVar.f59626y;
        this.f59572A = bVar.f59627z;
        this.f59573B = bVar.f59600A;
        this.f59574C = bVar.f59601B;
        if (this.f59579f.contains((Object) null)) {
            StringBuilder k = C13555b.m33972k("Null interceptor: ");
            k.append(this.f59579f);
            throw new IllegalStateException(k.toString());
        } else if (this.f59580g.contains((Object) null)) {
            StringBuilder k2 = C13555b.m33972k("Null network interceptor: ");
            k2.append(this.f59580g);
            throw new IllegalStateException(k2.toString());
        }
    }

    /* renamed from: hi0.v$b */
    public static final class C23568b {

        /* renamed from: A */
        public int f59600A;

        /* renamed from: B */
        public int f59601B;

        /* renamed from: a */
        public C23548l f59602a;

        /* renamed from: b */
        public Proxy f59603b;

        /* renamed from: c */
        public List<Protocol> f59604c;

        /* renamed from: d */
        public List<C23543i> f59605d;

        /* renamed from: e */
        public final ArrayList f59606e;

        /* renamed from: f */
        public final ArrayList f59607f;

        /* renamed from: g */
        public C23550n.C23552b f59608g;

        /* renamed from: h */
        public ProxySelector f59609h;

        /* renamed from: i */
        public C23546k f59610i;

        /* renamed from: j */
        public C23522c f59611j;

        /* renamed from: k */
        public C23749h f59612k;

        /* renamed from: l */
        public SocketFactory f59613l;

        /* renamed from: m */
        public SSLSocketFactory f59614m;

        /* renamed from: n */
        public C24831c f59615n;

        /* renamed from: o */
        public HostnameVerifier f59616o;

        /* renamed from: p */
        public C23540g f59617p;

        /* renamed from: q */
        public C23520b f59618q;

        /* renamed from: r */
        public C23520b f59619r;

        /* renamed from: s */
        public C7428f f59620s;

        /* renamed from: t */
        public C23549m f59621t;

        /* renamed from: u */
        public boolean f59622u;

        /* renamed from: v */
        public boolean f59623v;

        /* renamed from: w */
        public boolean f59624w;

        /* renamed from: x */
        public int f59625x;

        /* renamed from: y */
        public int f59626y;

        /* renamed from: z */
        public int f59627z;

        public C23568b() {
            this.f59606e = new ArrayList();
            this.f59607f = new ArrayList();
            this.f59602a = new C23548l();
            this.f59604c = C23566v.f59570D;
            this.f59605d = C23566v.f59571E;
            this.f59608g = new C7071l0(C23550n.f59521a, 20);
            ProxySelector proxySelector = ProxySelector.getDefault();
            this.f59609h = proxySelector;
            if (proxySelector == null) {
                this.f59609h = new C24789a();
            }
            this.f59610i = C23546k.f59513a;
            this.f59613l = SocketFactory.getDefault();
            this.f59616o = C24832d.f62775a;
            this.f59617p = C23540g.f59464c;
            C2341k kVar = C23520b.f59382g0;
            this.f59618q = kVar;
            this.f59619r = kVar;
            this.f59620s = new C7428f();
            this.f59621t = C23549m.f59520h0;
            this.f59622u = true;
            this.f59623v = true;
            this.f59624w = true;
            this.f59625x = 0;
            this.f59626y = 10000;
            this.f59627z = 10000;
            this.f59600A = 10000;
            this.f59601B = 0;
        }

        /* renamed from: a */
        public final void mo58715a(C23560s sVar) {
            if (sVar != null) {
                this.f59606e.add(sVar);
                return;
            }
            throw new IllegalArgumentException("interceptor == null");
        }

        /* renamed from: b */
        public final void mo58716b(long j, TimeUnit timeUnit) {
            this.f59626y = C23610d.m57795c(j, timeUnit);
        }

        /* renamed from: c */
        public final void mo58717c(long j, TimeUnit timeUnit) {
            this.f59627z = C23610d.m57795c(j, timeUnit);
        }

        public C23568b(C23566v vVar) {
            ArrayList arrayList = new ArrayList();
            this.f59606e = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.f59607f = arrayList2;
            this.f59602a = vVar.f59575b;
            this.f59603b = vVar.f59576c;
            this.f59604c = vVar.f59577d;
            this.f59605d = vVar.f59578e;
            arrayList.addAll(vVar.f59579f);
            arrayList2.addAll(vVar.f59580g);
            this.f59608g = vVar.f59581h;
            this.f59609h = vVar.f59582i;
            this.f59610i = vVar.f59583j;
            this.f59612k = vVar.f59585l;
            this.f59611j = vVar.f59584k;
            this.f59613l = vVar.f59586m;
            this.f59614m = vVar.f59587n;
            this.f59615n = vVar.f59588o;
            this.f59616o = vVar.f59589p;
            this.f59617p = vVar.f59590q;
            this.f59618q = vVar.f59591r;
            this.f59619r = vVar.f59592s;
            this.f59620s = vVar.f59593t;
            this.f59621t = vVar.f59594u;
            this.f59622u = vVar.f59595v;
            this.f59623v = vVar.f59596w;
            this.f59624w = vVar.f59597x;
            this.f59625x = vVar.f59598y;
            this.f59626y = vVar.f59599z;
            this.f59627z = vVar.f59572A;
            this.f59600A = vVar.f59573B;
            this.f59601B = vVar.f59574C;
        }
    }
}
