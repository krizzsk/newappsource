package p298w6;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import p025b6.C1487b;
import p311x6.C7176l;

/* renamed from: w6.a */
public final class C6997a implements C1487b {

    /* renamed from: b */
    public final int f21773b;

    /* renamed from: c */
    public final C1487b f21774c;

    public C6997a(int i, C1487b bVar) {
        this.f21773b = i;
        this.f21774c = bVar;
    }

    /* renamed from: a */
    public final void mo5841a(MessageDigest messageDigest) {
        this.f21774c.mo5841a(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f21773b).array());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6997a)) {
            return false;
        }
        C6997a aVar = (C6997a) obj;
        if (this.f21773b != aVar.f21773b || !this.f21774c.equals(aVar.f21774c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C7176l.m16787g(this.f21773b, this.f21774c);
    }
}
