package com.veriff.sdk.internal;

import com.veriff.sdk.internal.C22738yl;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.veriff.sdk.internal.xs */
public final class C22702xs {

    /* renamed from: a */
    public final C22738yl f57386a;

    /* renamed from: b */
    public final C22729yg f57387b;

    /* renamed from: c */
    public final SocketFactory f57388c;

    /* renamed from: d */
    public final C22703xt f57389d;

    /* renamed from: e */
    public final List<C22749yq> f57390e;

    /* renamed from: f */
    public final List<C22723yc> f57391f;

    /* renamed from: g */
    public final ProxySelector f57392g;

    /* renamed from: h */
    public final Proxy f57393h;

    /* renamed from: i */
    public final SSLSocketFactory f57394i;

    /* renamed from: j */
    public final HostnameVerifier f57395j;

    /* renamed from: k */
    public final C22716xy f57396k;

    public C22702xs(String str, int i, C22729yg ygVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C22716xy xyVar, C22703xt xtVar, Proxy proxy, List<C22749yq> list, List<C22723yc> list2, ProxySelector proxySelector) {
        String str2;
        C22738yl.C22739a aVar = new C22738yl.C22739a();
        if (sSLSocketFactory != null) {
            str2 = "https";
        } else {
            str2 = "http";
        }
        this.f57386a = aVar.mo57309a(str2).mo57316d(str).mo57307a(i).mo57315c();
        if (ygVar != null) {
            this.f57387b = ygVar;
            if (socketFactory != null) {
                this.f57388c = socketFactory;
                if (xtVar != null) {
                    this.f57389d = xtVar;
                    if (list != null) {
                        this.f57390e = C22766za.m55828a(list);
                        if (list2 != null) {
                            this.f57391f = C22766za.m55828a(list2);
                            if (proxySelector != null) {
                                this.f57392g = proxySelector;
                                this.f57393h = proxy;
                                this.f57394i = sSLSocketFactory;
                                this.f57395j = hostnameVerifier;
                                this.f57396k = xyVar;
                                return;
                            }
                            throw new NullPointerException("proxySelector == null");
                        }
                        throw new NullPointerException("connectionSpecs == null");
                    }
                    throw new NullPointerException("protocols == null");
                }
                throw new NullPointerException("proxyAuthenticator == null");
            }
            throw new NullPointerException("socketFactory == null");
        }
        throw new NullPointerException("dns == null");
    }

    /* renamed from: a */
    public C22738yl mo57137a() {
        return this.f57386a;
    }

    /* renamed from: b */
    public C22729yg mo57139b() {
        return this.f57387b;
    }

    /* renamed from: c */
    public SocketFactory mo57140c() {
        return this.f57388c;
    }

    /* renamed from: d */
    public C22703xt mo57141d() {
        return this.f57389d;
    }

    /* renamed from: e */
    public List<C22749yq> mo57142e() {
        return this.f57390e;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C22702xs) {
            C22702xs xsVar = (C22702xs) obj;
            if (!this.f57386a.equals(xsVar.f57386a) || !mo57138a(xsVar)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public List<C22723yc> mo57144f() {
        return this.f57391f;
    }

    /* renamed from: g */
    public ProxySelector mo57145g() {
        return this.f57392g;
    }

    /* renamed from: h */
    public Proxy mo57146h() {
        return this.f57393h;
    }

    public int hashCode() {
        int hashCode = this.f57387b.hashCode();
        int hashCode2 = this.f57389d.hashCode();
        int hashCode3 = this.f57390e.hashCode();
        int hashCode4 = this.f57391f.hashCode();
        int hashCode5 = this.f57392g.hashCode();
        int hashCode6 = Objects.hashCode(this.f57393h);
        int hashCode7 = Objects.hashCode(this.f57394i);
        int hashCode8 = Objects.hashCode(this.f57395j);
        return Objects.hashCode(this.f57396k) + ((hashCode8 + ((hashCode7 + ((hashCode6 + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + ((this.f57386a.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    /* renamed from: i */
    public SSLSocketFactory mo57148i() {
        return this.f57394i;
    }

    /* renamed from: j */
    public HostnameVerifier mo57149j() {
        return this.f57395j;
    }

    /* renamed from: k */
    public C22716xy mo57150k() {
        return this.f57396k;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("Address{");
        k.append(this.f57386a.mo57292f());
        k.append(":");
        k.append(this.f57386a.mo57293g());
        if (this.f57393h != null) {
            k.append(", proxy=");
            k.append(this.f57393h);
        } else {
            k.append(", proxySelector=");
            k.append(this.f57392g);
        }
        k.append("}");
        return k.toString();
    }

    /* renamed from: a */
    public boolean mo57138a(C22702xs xsVar) {
        return this.f57387b.equals(xsVar.f57387b) && this.f57389d.equals(xsVar.f57389d) && this.f57390e.equals(xsVar.f57390e) && this.f57391f.equals(xsVar.f57391f) && this.f57392g.equals(xsVar.f57392g) && Objects.equals(this.f57393h, xsVar.f57393h) && Objects.equals(this.f57394i, xsVar.f57394i) && Objects.equals(this.f57395j, xsVar.f57395j) && Objects.equals(this.f57396k, xsVar.f57396k) && mo57137a().mo57293g() == xsVar.mo57137a().mo57293g();
    }
}
