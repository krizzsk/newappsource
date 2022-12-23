package p025b6;

import java.security.MessageDigest;
import p025b6.C1489d;
import p311x6.C7163b;

/* renamed from: b6.e */
public final class C1492e implements C1487b {

    /* renamed from: b */
    public final C7163b f5396b = new C7163b();

    /* renamed from: a */
    public final void mo5841a(MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            C7163b bVar = this.f5396b;
            if (i < bVar.f19969d) {
                C1489d dVar = (C1489d) bVar.mo22416h(i);
                Object l = this.f5396b.mo22422l(i);
                C1489d.C1491b<T> bVar2 = dVar.f5393b;
                if (dVar.f5395d == null) {
                    dVar.f5395d = dVar.f5394c.getBytes(C1487b.f5389a);
                }
                bVar2.mo250a(dVar.f5395d, l, messageDigest);
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public final <T> T mo5848c(C1489d<T> dVar) {
        if (this.f5396b.containsKey(dVar)) {
            return this.f5396b.getOrDefault(dVar, null);
        }
        return dVar.f5392a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1492e) {
            return this.f5396b.equals(((C1492e) obj).f5396b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5396b.hashCode();
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("Options{values=");
        k.append(this.f5396b);
        k.append('}');
        return k.toString();
    }
}
