package com.veriff.sdk.internal;

import hd0.C23452l;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import p009a8.C0114n;

/* renamed from: com.veriff.sdk.internal.zq */
final class C22792zq {

    /* renamed from: a */
    private final C22702xs f57823a;

    /* renamed from: b */
    private final C22790zo f57824b;

    /* renamed from: c */
    private final C22713xw f57825c;

    /* renamed from: d */
    private final C22730yh f57826d;

    /* renamed from: e */
    private List<Proxy> f57827e = Collections.emptyList();

    /* renamed from: f */
    private int f57828f;

    /* renamed from: g */
    private List<InetSocketAddress> f57829g = Collections.emptyList();

    /* renamed from: h */
    private final List<C22761yw> f57830h = new ArrayList();

    /* renamed from: com.veriff.sdk.internal.zq$a */
    public static final class C22793a {

        /* renamed from: a */
        private final List<C22761yw> f57831a;

        /* renamed from: b */
        private int f57832b = 0;

        public C22793a(List<C22761yw> list) {
            this.f57831a = list;
        }

        /* renamed from: a */
        public boolean mo57537a() {
            return this.f57832b < this.f57831a.size();
        }

        /* renamed from: b */
        public C22761yw mo57538b() {
            if (mo57537a()) {
                List<C22761yw> list = this.f57831a;
                int i = this.f57832b;
                this.f57832b = i + 1;
                return list.get(i);
            }
            throw new NoSuchElementException();
        }

        /* renamed from: c */
        public List<C22761yw> mo57539c() {
            return new ArrayList(this.f57831a);
        }
    }

    public C22792zq(C22702xs xsVar, C22790zo zoVar, C22713xw xwVar, C22730yh yhVar) {
        this.f57823a = xsVar;
        this.f57824b = zoVar;
        this.f57825c = xwVar;
        this.f57826d = yhVar;
        m55980a(xsVar.mo57137a(), xsVar.mo57146h());
    }

    /* renamed from: c */
    private boolean m55982c() {
        return this.f57828f < this.f57827e.size();
    }

    /* renamed from: d */
    private Proxy m55983d() throws IOException {
        if (m55982c()) {
            List<Proxy> list = this.f57827e;
            int i = this.f57828f;
            this.f57828f = i + 1;
            Proxy proxy = list.get(i);
            m55981a(proxy);
            return proxy;
        }
        StringBuilder k = C13555b.m33972k("No route to ");
        k.append(this.f57823a.mo57137a().mo57292f());
        k.append("; exhausted proxy configurations: ");
        k.append(this.f57827e);
        throw new SocketException(k.toString());
    }

    /* renamed from: a */
    public boolean mo57535a() {
        return m55982c() || !this.f57830h.isEmpty();
    }

    /* renamed from: b */
    public C22793a mo57536b() throws IOException {
        if (mo57535a()) {
            ArrayList arrayList = new ArrayList();
            while (m55982c()) {
                Proxy d = m55983d();
                int size = this.f57829g.size();
                for (int i = 0; i < size; i++) {
                    C22761yw ywVar = new C22761yw(this.f57823a, d, this.f57829g.get(i));
                    if (this.f57824b.mo57531c(ywVar)) {
                        this.f57830h.add(ywVar);
                    } else {
                        arrayList.add(ywVar);
                    }
                }
                if (!arrayList.isEmpty()) {
                    break;
                }
            }
            if (arrayList.isEmpty()) {
                arrayList.addAll(this.f57830h);
                this.f57830h.clear();
            }
            return new C22793a(arrayList);
        }
        throw new NoSuchElementException();
    }

    /* renamed from: a */
    private void m55980a(C22738yl ylVar, Proxy proxy) {
        List<Proxy> list;
        if (proxy != null) {
            this.f57827e = Collections.singletonList(proxy);
        } else {
            List<Proxy> select = this.f57823a.mo57145g().select(ylVar.mo57283a());
            if (select == null || select.isEmpty()) {
                list = C22766za.m55829a((T[]) new Proxy[]{Proxy.NO_PROXY});
            } else {
                list = C22766za.m55828a(select);
            }
            this.f57827e = list;
        }
        this.f57828f = 0;
    }

    /* renamed from: a */
    private void m55981a(Proxy proxy) throws IOException {
        String str;
        int i;
        this.f57829g = new ArrayList();
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            str = this.f57823a.mo57137a().mo57292f();
            i = this.f57823a.mo57137a().mo57293g();
        } else {
            SocketAddress address = proxy.address();
            if (address instanceof InetSocketAddress) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                str = m55979a(inetSocketAddress);
                i = inetSocketAddress.getPort();
            } else {
                StringBuilder k = C13555b.m33972k("Proxy.address() is not an InetSocketAddress: ");
                k.append(address.getClass());
                throw new IllegalArgumentException(k.toString());
            }
        }
        if (i < 1 || i > 65535) {
            throw new SocketException("No route to " + str + ":" + i + "; port is out of range");
        } else if (proxy.type() == Proxy.Type.SOCKS) {
            this.f57829g.add(InetSocketAddress.createUnresolved(str, i));
        } else {
            this.f57826d.mo57240a(this.f57825c, str);
            ((C0114n) this.f57823a.mo57139b()).getClass();
            List a = C23452l.m57552a(str);
            if (!a.isEmpty()) {
                this.f57826d.mo57241a(this.f57825c, str, (List<InetAddress>) a);
                int size = a.size();
                for (int i2 = 0; i2 < size; i2++) {
                    this.f57829g.add(new InetSocketAddress((InetAddress) a.get(i2), i));
                }
                return;
            }
            throw new UnknownHostException(this.f57823a.mo57139b() + " returned no addresses for " + str);
        }
    }

    /* renamed from: a */
    public static String m55979a(InetSocketAddress inetSocketAddress) {
        InetAddress address = inetSocketAddress.getAddress();
        if (address == null) {
            return inetSocketAddress.getHostName();
        }
        return address.getHostAddress();
    }
}
