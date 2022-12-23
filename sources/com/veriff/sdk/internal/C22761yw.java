package com.veriff.sdk.internal;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* renamed from: com.veriff.sdk.internal.yw */
public final class C22761yw {

    /* renamed from: a */
    public final C22702xs f57681a;

    /* renamed from: b */
    public final Proxy f57682b;

    /* renamed from: c */
    public final InetSocketAddress f57683c;

    public C22761yw(C22702xs xsVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (xsVar == null) {
            throw new NullPointerException("address == null");
        } else if (proxy == null) {
            throw new NullPointerException("proxy == null");
        } else if (inetSocketAddress != null) {
            this.f57681a = xsVar;
            this.f57682b = proxy;
            this.f57683c = inetSocketAddress;
        } else {
            throw new NullPointerException("inetSocketAddress == null");
        }
    }

    /* renamed from: a */
    public C22702xs mo57449a() {
        return this.f57681a;
    }

    /* renamed from: b */
    public Proxy mo57450b() {
        return this.f57682b;
    }

    /* renamed from: c */
    public InetSocketAddress mo57451c() {
        return this.f57683c;
    }

    /* renamed from: d */
    public boolean mo57452d() {
        return this.f57681a.f57394i != null && this.f57682b.type() == Proxy.Type.HTTP;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C22761yw) {
            C22761yw ywVar = (C22761yw) obj;
            if (!ywVar.f57681a.equals(this.f57681a) || !ywVar.f57682b.equals(this.f57682b) || !ywVar.f57683c.equals(this.f57683c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f57682b.hashCode();
        return this.f57683c.hashCode() + ((hashCode + ((this.f57681a.hashCode() + 527) * 31)) * 31);
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("Route{");
        k.append(this.f57683c);
        k.append("}");
        return k.toString();
    }
}
