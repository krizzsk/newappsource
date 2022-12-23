package vi0;

import org.apache.thrift.TException;

/* renamed from: vi0.h */
public final class C25122h {
    /* renamed from: a */
    public static void m63098a(C25121g gVar, byte b) throws TException {
        m63099b(gVar, b, Integer.MAX_VALUE);
    }

    /* renamed from: b */
    public static void m63099b(C25121g gVar, byte b, int i) throws TException {
        if (i > 0) {
            int i2 = 0;
            switch (b) {
                case 2:
                    gVar.mo61690c();
                    return;
                case 3:
                    gVar.mo61691d();
                    return;
                case 4:
                    gVar.mo61692e();
                    return;
                case 6:
                    gVar.mo61695h();
                    return;
                case 8:
                    gVar.mo61696i();
                    return;
                case 10:
                    gVar.mo61697j();
                    return;
                case 11:
                    gVar.mo61689b();
                    return;
                case 12:
                    gVar.mo61705r();
                    while (true) {
                        byte b2 = gVar.mo61693f().f63356b;
                        if (b2 == 0) {
                            gVar.mo61706s();
                            return;
                        } else {
                            m63099b(gVar, b2, i - 1);
                            gVar.mo61694g();
                        }
                    }
                case 13:
                    C25120f m = gVar.mo61700m();
                    while (i2 < m.f63398c) {
                        int i3 = i - 1;
                        m63099b(gVar, m.f63396a, i3);
                        m63099b(gVar, m.f63397b, i3);
                        i2++;
                    }
                    gVar.mo61701n();
                    return;
                case 14:
                    C25123i o = gVar.mo61702o();
                    while (i2 < o.f63401b) {
                        m63099b(gVar, o.f63400a, i - 1);
                        i2++;
                    }
                    gVar.mo61703p();
                    return;
                case 15:
                    C25119e k = gVar.mo61698k();
                    while (i2 < k.f63395b) {
                        m63099b(gVar, k.f63394a, i - 1);
                        i2++;
                    }
                    gVar.mo61699l();
                    return;
                default:
                    return;
            }
        } else {
            throw new TException("Maximum skip depth exceeded");
        }
    }
}
