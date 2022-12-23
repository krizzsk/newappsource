package hi0;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* renamed from: hi0.f0 */
public final class C23539f0 {

    /* renamed from: a */
    public final C23518a f59461a;

    /* renamed from: b */
    public final Proxy f59462b;

    /* renamed from: c */
    public final InetSocketAddress f59463c;

    public C23539f0(C23518a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (aVar == null) {
            throw new NullPointerException("address == null");
        } else if (inetSocketAddress != null) {
            this.f59461a = aVar;
            this.f59462b = proxy;
            this.f59463c = inetSocketAddress;
        } else {
            throw new NullPointerException("inetSocketAddress == null");
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C23539f0) {
            C23539f0 f0Var = (C23539f0) obj;
            if (!f0Var.f59461a.equals(this.f59461a) || !f0Var.f59462b.equals(this.f59462b) || !f0Var.f59463c.equals(this.f59463c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f59462b.hashCode();
        return this.f59463c.hashCode() + ((hashCode + ((this.f59461a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("Route{");
        k.append(this.f59463c);
        k.append("}");
        return k.toString();
    }
}
