package com.veriff.sdk.internal;

import com.amazonaws.http.HttpHeader;
import com.google.android.gms.nearby.messages.Strategy;
import com.veriff.sdk.internal.C22752ys;
import hd0.C23451k;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import p009a8.C0112l;

public final class aab implements C22740ym {

    /* renamed from: a */
    private final C22746yp f53296a;

    public aab(C22746yp ypVar) {
        this.f53296a = ypVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a8, code lost:
        r1.mo57549e();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.veriff.sdk.internal.C22757yu mo53658a(com.veriff.sdk.internal.C22740ym.C22741a r9) throws java.io.IOException {
        /*
            r8 = this;
            com.veriff.sdk.internal.ys r0 = r9.mo57322a()
            com.veriff.sdk.internal.zy r9 = (com.veriff.sdk.internal.C22804zy) r9
            com.veriff.sdk.internal.zr r1 = r9.mo57557e()
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = r3
        L_0x000e:
            r1.mo57544a((com.veriff.sdk.internal.C22752ys) r0)
            boolean r6 = r1.mo57553i()
            if (r6 != 0) goto L_0x00b6
            com.veriff.sdk.internal.yu r0 = r9.mo57556a(r0, r1, r3)     // Catch:{ zp -> 0x009d, IOException -> 0x008d }
            if (r5 == 0) goto L_0x0035
            com.veriff.sdk.internal.yu$a r0 = r0.mo57425i()
            com.veriff.sdk.internal.yu$a r5 = r5.mo57425i()
            com.veriff.sdk.internal.yu$a r5 = r5.mo57440a((com.veriff.sdk.internal.C22759yv) r3)
            com.veriff.sdk.internal.yu r5 = r5.mo57443a()
            com.veriff.sdk.internal.yu$a r0 = r0.mo57448c(r5)
            com.veriff.sdk.internal.yu r0 = r0.mo57443a()
        L_0x0035:
            r5 = r0
            com.veriff.sdk.internal.yy r0 = com.veriff.sdk.internal.C22763yy.f57691a
            com.veriff.sdk.internal.zk r0 = r0.mo57368a((com.veriff.sdk.internal.C22757yu) r5)
            if (r0 == 0) goto L_0x0047
            com.veriff.sdk.internal.zm r6 = r0.mo57491a()
            com.veriff.sdk.internal.yw r6 = r6.mo57518b()
            goto L_0x0048
        L_0x0047:
            r6 = r3
        L_0x0048:
            com.veriff.sdk.internal.ys r6 = r8.m49970a((com.veriff.sdk.internal.C22757yu) r5, (com.veriff.sdk.internal.C22761yw) r6)
            if (r6 != 0) goto L_0x005a
            if (r0 == 0) goto L_0x0059
            boolean r9 = r0.mo57497b()
            if (r9 == 0) goto L_0x0059
            r1.mo57546b()
        L_0x0059:
            return r5
        L_0x005a:
            com.veriff.sdk.internal.yt r7 = r6.mo57396d()
            if (r7 == 0) goto L_0x0067
            boolean r7 = r7.mo57413d()
            if (r7 == 0) goto L_0x0067
            return r5
        L_0x0067:
            com.veriff.sdk.internal.yv r7 = r5.mo57424h()
            com.veriff.sdk.internal.C22766za.m55834a((java.io.Closeable) r7)
            boolean r7 = r1.mo57551g()
            if (r7 == 0) goto L_0x0077
            r0.mo57503h()
        L_0x0077:
            int r4 = r4 + 1
            r0 = 20
            if (r4 > r0) goto L_0x007f
            r0 = r6
            goto L_0x000e
        L_0x007f:
            java.net.ProtocolException r9 = new java.net.ProtocolException
            java.lang.String r0 = "Too many follow-up requests: "
            java.lang.String r0 = p379.C16759e.m42349e(r0, r4)
            r9.<init>(r0)
            throw r9
        L_0x008b:
            r9 = move-exception
            goto L_0x00b2
        L_0x008d:
            r6 = move-exception
            boolean r7 = r6 instanceof com.veriff.sdk.internal.aae     // Catch:{ all -> 0x008b }
            if (r7 != 0) goto L_0x0094
            r7 = 1
            goto L_0x0095
        L_0x0094:
            r7 = 0
        L_0x0095:
            boolean r7 = r8.m49972a(r6, r1, r7, r0)     // Catch:{ all -> 0x008b }
            if (r7 == 0) goto L_0x009c
            goto L_0x00a8
        L_0x009c:
            throw r6     // Catch:{ all -> 0x008b }
        L_0x009d:
            r6 = move-exception
            java.io.IOException r7 = r6.mo57534b()     // Catch:{ all -> 0x008b }
            boolean r7 = r8.m49972a(r7, r1, r2, r0)     // Catch:{ all -> 0x008b }
            if (r7 == 0) goto L_0x00ad
        L_0x00a8:
            r1.mo57549e()
            goto L_0x000e
        L_0x00ad:
            java.io.IOException r9 = r6.mo57532a()     // Catch:{ all -> 0x008b }
            throw r9     // Catch:{ all -> 0x008b }
        L_0x00b2:
            r1.mo57549e()
            throw r9
        L_0x00b6:
            java.io.IOException r9 = new java.io.IOException
            java.lang.String r0 = "Canceled"
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.aab.mo53658a(com.veriff.sdk.internal.ym$a):com.veriff.sdk.internal.yu");
    }

    /* renamed from: a */
    private boolean m49972a(IOException iOException, C22794zr zrVar, boolean z, C22752ys ysVar) {
        if (!this.f53296a.mo57361u()) {
            return false;
        }
        if ((!z || !m49971a(iOException, ysVar)) && m49973a(iOException, z) && zrVar.mo57550f()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private boolean m49971a(IOException iOException, C22752ys ysVar) {
        C22754yt d = ysVar.mo57396d();
        return (d != null && d.mo57413d()) || (iOException instanceof FileNotFoundException);
    }

    /* renamed from: a */
    private boolean m49973a(IOException iOException, boolean z) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException) || z) {
                return false;
            }
            return true;
        } else if ((!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException)) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    private C22752ys m49970a(C22757yu yuVar, C22761yw ywVar) throws IOException {
        String a;
        C22738yl c;
        Proxy proxy;
        if (yuVar != null) {
            int c2 = yuVar.mo57418c();
            String b = yuVar.mo57414a().mo57393b();
            C22754yt ytVar = null;
            if (c2 == 307 || c2 == 308) {
                if (!b.equals("GET") && !b.equals("HEAD")) {
                    return null;
                }
            } else if (c2 == 401) {
                ((C0112l) this.f53296a.mo57356p()).getClass();
                return C23451k.m57551a(ywVar, yuVar);
            } else if (c2 != 503) {
                if (c2 == 407) {
                    if (ywVar != null) {
                        proxy = ywVar.mo57450b();
                    } else {
                        proxy = this.f53296a.mo57346f();
                    }
                    if (proxy.type() == Proxy.Type.HTTP) {
                        ((C0112l) this.f53296a.mo57357q()).getClass();
                        return C23451k.m57551a(ywVar, yuVar);
                    }
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                } else if (c2 != 408) {
                    switch (c2) {
                        case Strategy.TTL_SECONDS_DEFAULT:
                        case 301:
                        case 302:
                        case 303:
                            break;
                        default:
                            return null;
                    }
                } else if (!this.f53296a.mo57361u()) {
                    return null;
                } else {
                    C22754yt d = yuVar.mo57414a().mo57396d();
                    if (d != null && d.mo57413d()) {
                        return null;
                    }
                    if ((yuVar.mo57428l() == null || yuVar.mo57428l().mo57418c() != 408) && m49969a(yuVar, 0) <= 0) {
                        return yuVar.mo57414a();
                    }
                    return null;
                }
            } else if ((yuVar.mo57428l() == null || yuVar.mo57428l().mo57418c() != 503) && m49969a(yuVar, Integer.MAX_VALUE) == 0) {
                return yuVar.mo57414a();
            } else {
                return null;
            }
            if (!this.f53296a.mo57360t() || (a = yuVar.mo57415a(HttpHeader.LOCATION)) == null || (c = yuVar.mo57414a().mo57390a().mo57286c(a)) == null) {
                return null;
            }
            if (!c.mo57284b().equals(yuVar.mo57414a().mo57390a().mo57284b()) && !this.f53296a.mo57359s()) {
                return null;
            }
            C22752ys.C22753a e = yuVar.mo57414a().mo57397e();
            if (C22803zx.m56039c(b)) {
                boolean d2 = C22803zx.m56040d(b);
                if (C22803zx.m56041e(b)) {
                    e.mo57407a("GET", (C22754yt) null);
                } else {
                    if (d2) {
                        ytVar = yuVar.mo57414a().mo57396d();
                    }
                    e.mo57407a(b, ytVar);
                }
                if (!d2) {
                    e.mo57410b("Transfer-Encoding");
                    e.mo57410b(HttpHeader.CONTENT_LENGTH);
                    e.mo57410b(HttpHeader.CONTENT_TYPE);
                }
            }
            if (!C22766za.m55838a(yuVar.mo57414a().mo57390a(), c)) {
                e.mo57410b(HttpHeader.AUTHORIZATION);
            }
            return e.mo57403a(c).mo57409a();
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    private int m49969a(C22757yu yuVar, int i) {
        String a = yuVar.mo57415a("Retry-After");
        if (a == null) {
            return i;
        }
        if (a.matches("\\d+")) {
            return Integer.valueOf(a).intValue();
        }
        return Integer.MAX_VALUE;
    }
}
