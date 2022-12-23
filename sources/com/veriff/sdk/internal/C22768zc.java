package com.veriff.sdk.internal;

import com.amazonaws.http.HttpHeader;
import com.usebutton.sdk.internal.util.DiskLruCache;
import com.veriff.sdk.internal.C22736yk;
import com.veriff.sdk.internal.C22740ym;
import com.veriff.sdk.internal.C22757yu;
import com.veriff.sdk.internal.C22771ze;
import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* renamed from: com.veriff.sdk.internal.zc */
public final class C22768zc implements C22740ym {

    /* renamed from: a */
    public final C22781zh f57702a;

    public C22768zc(C22781zh zhVar) {
        this.f57702a = zhVar;
    }

    /* renamed from: b */
    public static boolean m55858b(String str) {
        if (HttpHeader.CONTENT_LENGTH.equalsIgnoreCase(str) || "Content-Encoding".equalsIgnoreCase(str) || HttpHeader.CONTENT_TYPE.equalsIgnoreCase(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public C22757yu mo53658a(C22740ym.C22741a aVar) throws IOException {
        C22781zh zhVar = this.f57702a;
        C22757yu a = zhVar != null ? zhVar.mo57160a(aVar.mo57322a()) : null;
        C22771ze a2 = new C22771ze.C22772a(System.currentTimeMillis(), aVar.mo57322a(), a).mo57460a();
        C22752ys ysVar = a2.f57707a;
        C22757yu yuVar = a2.f57708b;
        C22781zh zhVar2 = this.f57702a;
        if (zhVar2 != null) {
            zhVar2.mo57164a(a2);
        }
        if (a != null && yuVar == null) {
            C22766za.m55834a((Closeable) a.mo57424h());
        }
        if (ysVar == null && yuVar == null) {
            return new C22757yu.C22758a().mo57438a(aVar.mo57322a()).mo57437a(C22749yq.HTTP_1_1).mo57433a(504).mo57441a("Unsatisfiable Request (only-if-cached)").mo57440a(C22766za.f57697d).mo57434a(-1).mo57445b(System.currentTimeMillis()).mo57443a();
        }
        if (ysVar == null) {
            return yuVar.mo57425i().mo57446b(m55855a(yuVar)).mo57443a();
        }
        try {
            C22757yu a3 = aVar.mo57323a(ysVar);
            if (a3 == null && a != null) {
            }
            if (yuVar != null) {
                if (a3.mo57418c() == 304) {
                    C22757yu a4 = yuVar.mo57425i().mo57436a(m55854a(yuVar.mo57423g(), a3.mo57423g())).mo57434a(a3.mo57430n()).mo57445b(a3.mo57431o()).mo57446b(m55855a(yuVar)).mo57439a(m55855a(a3)).mo57443a();
                    a3.mo57424h().close();
                    this.f57702a.mo57162a();
                    this.f57702a.mo57163a(yuVar, a4);
                    return a4;
                }
                C22766za.m55834a((Closeable) yuVar.mo57424h());
            }
            C22757yu a5 = a3.mo57425i().mo57446b(m55855a(yuVar)).mo57439a(m55855a(a3)).mo57443a();
            if (this.f57702a != null) {
                if (C22802zw.m56035d(a5) && C22771ze.m55864a(a5, ysVar)) {
                    return m55856a(this.f57702a.mo57161a(a5), a5);
                }
                if (C22803zx.m56037a(ysVar.mo57393b())) {
                    try {
                        this.f57702a.mo57165b(ysVar);
                    } catch (IOException unused) {
                    }
                }
            }
            return a5;
        } finally {
            if (a != null) {
                C22766za.m55834a((Closeable) a.mo57424h());
            }
        }
    }

    /* renamed from: a */
    private static C22757yu m55855a(C22757yu yuVar) {
        return (yuVar == null || yuVar.mo57424h() == null) ? yuVar : yuVar.mo57425i().mo57440a((C22759yv) null).mo57443a();
    }

    /* renamed from: a */
    private C22757yu m55856a(final C22770zd zdVar, C22757yu yuVar) throws IOException {
        abz b;
        if (zdVar == null || (b = zdVar.mo57167b()) == null) {
            return yuVar;
        }
        final abk c = yuVar.mo57424h().mo54033c();
        final abj a = abr.m50507a(b);
        C227691 r2 = new aca(this) {

            /* renamed from: a */
            public boolean f57703a;

            /* renamed from: a */
            public long mo53671a(abi abi, long j) throws IOException {
                try {
                    long a = c.mo53671a(abi, j);
                    if (a == -1) {
                        if (!this.f57703a) {
                            this.f57703a = true;
                            a.close();
                        }
                        return -1;
                    }
                    abi.mo53852a(a.mo53875c(), abi.mo53864b() - a, a);
                    a.mo53924y();
                    return a;
                } catch (IOException e) {
                    if (!this.f57703a) {
                        this.f57703a = true;
                        zdVar.mo57166a();
                    }
                    throw e;
                }
            }

            public void close() throws IOException {
                if (!this.f57703a && !C22766za.m55837a((aca) this, 100, TimeUnit.MILLISECONDS)) {
                    this.f57703a = true;
                    zdVar.mo57166a();
                }
                c.close();
            }

            /* renamed from: a */
            public acb mo53672a() {
                return c.mo53672a();
            }
        };
        return yuVar.mo57425i().mo57440a((C22759yv) new C22805zz(yuVar.mo57415a(HttpHeader.CONTENT_TYPE), yuVar.mo57424h().mo54032b(), abr.m50508a((aca) r2))).mo57443a();
    }

    /* renamed from: a */
    private static C22736yk m55854a(C22736yk ykVar, C22736yk ykVar2) {
        C22736yk.C22737a aVar = new C22736yk.C22737a();
        int a = ykVar.mo57265a();
        for (int i = 0; i < a; i++) {
            String a2 = ykVar.mo57266a(i);
            String b = ykVar.mo57269b(i);
            if ((!"Warning".equalsIgnoreCase(a2) || !b.startsWith(DiskLruCache.VERSION_1)) && (m55858b(a2) || !m55857a(a2) || ykVar2.mo57267a(a2) == null)) {
                C22763yy.f57691a.mo57372a(aVar, a2, b);
            }
        }
        int a3 = ykVar2.mo57265a();
        for (int i2 = 0; i2 < a3; i2++) {
            String a4 = ykVar2.mo57266a(i2);
            if (!m55858b(a4) && m55857a(a4)) {
                C22763yy.f57691a.mo57372a(aVar, a4, ykVar2.mo57269b(i2));
            }
        }
        return aVar.mo57277a();
    }

    /* renamed from: a */
    public static boolean m55857a(String str) {
        return !"Connection".equalsIgnoreCase(str) && !"Keep-Alive".equalsIgnoreCase(str) && !"Proxy-Authenticate".equalsIgnoreCase(str) && !"Proxy-Authorization".equalsIgnoreCase(str) && !"TE".equalsIgnoreCase(str) && !"Trailers".equalsIgnoreCase(str) && !"Transfer-Encoding".equalsIgnoreCase(str) && !"Upgrade".equalsIgnoreCase(str);
    }
}
