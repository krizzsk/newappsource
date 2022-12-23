package p264ta;

import com.appboy.support.ValidationUtils;
import java.util.UUID;
import p277ub.C6803r;

/* renamed from: ta.i */
public final class C6636i {

    /* renamed from: ta.i$a */
    public static class C6637a {

        /* renamed from: a */
        public final UUID f20592a;

        /* renamed from: b */
        public final int f20593b;

        /* renamed from: c */
        public final byte[] f20594c;

        public C6637a(UUID uuid, int i, byte[] bArr) {
            this.f20592a = uuid;
            this.f20593b = i;
            this.f20594c = bArr;
        }
    }

    /* renamed from: a */
    public static C6637a m15699a(byte[] bArr) {
        int c;
        C6803r rVar = new C6803r(bArr);
        if (rVar.f21040c < 32) {
            return null;
        }
        rVar.mo23007z(0);
        if (rVar.mo22984c() != (rVar.f21040c - rVar.f21039b) + 4 || rVar.mo22984c() != 1886614376 || (c = (rVar.mo22984c() >> 24) & ValidationUtils.APPBOY_STRING_MAX_LENGTH) > 1) {
            return null;
        }
        UUID uuid = new UUID(rVar.mo22991j(), rVar.mo22991j());
        if (c == 1) {
            rVar.mo22981A(rVar.mo23000s() * 16);
        }
        int s = rVar.mo23000s();
        if (s != rVar.f21040c - rVar.f21039b) {
            return null;
        }
        byte[] bArr2 = new byte[s];
        rVar.mo22983b(0, s, bArr2);
        return new C6637a(uuid, c, bArr2);
    }

    /* renamed from: b */
    public static byte[] m15700b(UUID uuid, byte[] bArr) {
        C6637a a = m15699a(bArr);
        if (a == null) {
            return null;
        }
        if (uuid.equals(a.f20592a)) {
            return a.f20594c;
        }
        String valueOf = String.valueOf(uuid);
        new StringBuilder(String.valueOf(a.f20592a).length() + valueOf.length() + 33);
        return null;
    }
}
