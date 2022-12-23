package hi0;

import hi0.C23558r;
import ii0.C23610d;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.Protocol;

/* renamed from: hi0.a */
public final class C23518a {

    /* renamed from: a */
    public final C23558r f59369a;

    /* renamed from: b */
    public final C23549m f59370b;

    /* renamed from: c */
    public final SocketFactory f59371c;

    /* renamed from: d */
    public final C23520b f59372d;

    /* renamed from: e */
    public final List<Protocol> f59373e;

    /* renamed from: f */
    public final List<C23543i> f59374f;

    /* renamed from: g */
    public final ProxySelector f59375g;

    /* renamed from: h */
    public final Proxy f59376h;

    /* renamed from: i */
    public final SSLSocketFactory f59377i;

    /* renamed from: j */
    public final HostnameVerifier f59378j;

    /* renamed from: k */
    public final C23540g f59379k;

    public C23518a(String str, int i, C23549m mVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C23540g gVar, C23520b bVar, Proxy proxy, List<Protocol> list, List<C23543i> list2, ProxySelector proxySelector) {
        String str2;
        String str3 = str;
        int i2 = i;
        C23549m mVar2 = mVar;
        SocketFactory socketFactory2 = socketFactory;
        SSLSocketFactory sSLSocketFactory2 = sSLSocketFactory;
        C23520b bVar2 = bVar;
        ProxySelector proxySelector2 = proxySelector;
        C23558r.C23559a aVar = new C23558r.C23559a();
        if (sSLSocketFactory2 != null) {
            str2 = "https";
        } else {
            str2 = "http";
        }
        if (str2.equalsIgnoreCase("http")) {
            aVar.f59543a = "http";
        } else if (str2.equalsIgnoreCase("https")) {
            aVar.f59543a = "https";
        } else {
            throw new IllegalArgumentException(C25541a.m63881k("unexpected scheme: ", str2));
        }
        if (str3 != null) {
            String b = C23610d.m57794b(C23558r.m57728n(str, 0, str.length(), false));
            if (b != null) {
                aVar.f59546d = b;
                if (i2 <= 0 || i2 > 65535) {
                    throw new IllegalArgumentException(C16759e.m42349e("unexpected port: ", i));
                }
                aVar.f59547e = i2;
                this.f59369a = aVar.mo58707b();
                if (mVar2 != null) {
                    this.f59370b = mVar2;
                    if (socketFactory2 != null) {
                        this.f59371c = socketFactory2;
                        if (bVar2 != null) {
                            this.f59372d = bVar2;
                            if (list != null) {
                                this.f59373e = C23610d.m57804l(list);
                                if (list2 != null) {
                                    this.f59374f = C23610d.m57804l(list2);
                                    if (proxySelector2 != null) {
                                        this.f59375g = proxySelector2;
                                        this.f59376h = proxy;
                                        this.f59377i = sSLSocketFactory2;
                                        this.f59378j = hostnameVerifier;
                                        this.f59379k = gVar;
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
            throw new IllegalArgumentException(C25541a.m63881k("unexpected host: ", str));
        }
        throw new NullPointerException("host == null");
    }

    /* renamed from: a */
    public final boolean mo58625a(C23518a aVar) {
        if (!this.f59370b.equals(aVar.f59370b) || !this.f59372d.equals(aVar.f59372d) || !this.f59373e.equals(aVar.f59373e) || !this.f59374f.equals(aVar.f59374f) || !this.f59375g.equals(aVar.f59375g) || !Objects.equals(this.f59376h, aVar.f59376h) || !Objects.equals(this.f59377i, aVar.f59377i) || !Objects.equals(this.f59378j, aVar.f59378j) || !Objects.equals(this.f59379k, aVar.f59379k) || this.f59369a.f59538e != aVar.f59369a.f59538e) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C23518a) {
            C23518a aVar = (C23518a) obj;
            if (!this.f59369a.equals(aVar.f59369a) || !mo58625a(aVar)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f59370b.hashCode();
        int hashCode2 = this.f59372d.hashCode();
        int hashCode3 = this.f59373e.hashCode();
        int hashCode4 = this.f59374f.hashCode();
        int hashCode5 = this.f59375g.hashCode();
        int hashCode6 = Objects.hashCode(this.f59376h);
        int hashCode7 = Objects.hashCode(this.f59377i);
        int hashCode8 = Objects.hashCode(this.f59378j);
        return Objects.hashCode(this.f59379k) + ((hashCode8 + ((hashCode7 + ((hashCode6 + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + ((this.f59369a.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("Address{");
        k.append(this.f59369a.f59537d);
        k.append(":");
        k.append(this.f59369a.f59538e);
        if (this.f59376h != null) {
            k.append(", proxy=");
            k.append(this.f59376h);
        } else {
            k.append(", proxySelector=");
            k.append(this.f59375g);
        }
        k.append("}");
        return k.toString();
    }
}
